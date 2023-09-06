
/**
 * 
 * @author shand
 *
 */

public interface ShoppingCart<T>
{

	/**
	 * 
	 * @return the amount of items in the cart
	 */
	public int getCurrentSize();
	
	/**
	 * 
	 * @return checks if the cart is empty or not
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @param newEntry adds an item to the cart
	 * @return true or false if adding an item was successful
	 */
	public boolean add(T newEntry);
	
	/**
	 * 
	 * @param anEntry removes an item from the cart
	 * @return true or false if the removing as successful
	 */
	public boolean remove(T anEntry);
	
	/**
	 * Deletes all the items from the cart
	 */
	public void clear();
	
	
	/**
	 * Counts the Items in the bag
	 * @param anEntry The item in the shopping cart to be counted
	 * @return The amount of items counted
	 */
	public int getFrequencyOf(T anEntry);
	
	
	/**
	 * Gets all the entries in the shopping cart
	 * @return An array with the entries of the shopping cartc v
	 */
	public T[] toArray();
	
	
	
	
	
	
	
	
	
	
	
	
}
