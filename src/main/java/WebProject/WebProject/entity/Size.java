package WebProject.WebProject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data // lombok giúp generate các hàm constructor, get, set v.v.
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "size")
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "size_name", columnDefinition = "nvarchar(1111)")
	private String sizeName;

	@Column(name = "description", columnDefinition = "nvarchar(11111)")
	private String description;


	@Column(name = "created_At")
	private Date created_At;

	@OneToMany(mappedBy = "size", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<CategorySize> categorySizes;

	@OneToMany(mappedBy = "size", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Order_Item> order_items;

	@OneToMany(mappedBy = "size", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Cart> carts;
}
