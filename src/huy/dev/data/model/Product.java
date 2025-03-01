package huy.dev.data.model;
import java.sql.Timestamp;
public class Product {
	private int id;
	private String name;
	private  String description;
	private String thumbnail;
	private double price;
	private int quantity;
	private int category_id;
	private Timestamp created_at;
	
	public static final String AVAILABLE = "available";
	public static final String OUT_OF_STOCK = "out of stock";

	public Product(String name, String description, String thumbnail, double price, int quantity, int category_id,
			Timestamp created_at) {
		super();
		this.name = name;
		this.description = description;
		this.thumbnail = thumbnail;
		this.price = price;
		this.quantity = quantity;
		this.category_id = category_id;
		this.created_at = created_at;
	}
	public Product(int id, String name, String description, String thumbnail, double price, int quantity,
			int category_id, Timestamp created_at) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.thumbnail = thumbnail;
		this.price = price;
		this.quantity = quantity;
		this.category_id = category_id;
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
}
