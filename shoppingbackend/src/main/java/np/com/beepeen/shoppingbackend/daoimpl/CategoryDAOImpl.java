
package np.com.beepeen.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import np.com.beepeen.shoppingbackend.dao.CategoryDAO;
import np.com.beepeen.shoppingbackend.dto.Category;

/**
* @author bipin
* 10 Dec 2017 18:55:41
*/
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	/* (non-Javadoc)
	 * @see np.com.beepeen.shoppingbackend.dao.CategoryDAO#list()
	 */
	
	private static List<Category> categories=new ArrayList<>();
	
	static{
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("television");
		category.setDescription("tv desc");
		category.setImageURL("logo.png");
		categories.add(category);
		
		Category category1=new Category();
		
		
		category1.setId(2);
		category1.setName("mobile");
		category1.setDescription("mobile desc");
		category1.setImageURL("logo.png");
		categories.add(category1);
		
Category category11=new Category();
		
		
		category11.setId(2);
		category11.setName("mobile");
		category11.setDescription("mobile desc");
		category11.setImageURL("logo.png");
		categories.add(category11);
		
	}
	@Override
	public List<Category> list() {
		
		// TODO Auto-generated method stub
		return categories;
	}

}

