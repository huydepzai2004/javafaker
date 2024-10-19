package huy.dev.data.faker;

import com.github.javafaker.Faker;

import huy.dev.data.model.Category;

import java.util.ArrayList;
import java.util.List;

public class FakeCategoryGenerator {
    private Faker faker;

    // Constructor khởi tạo Faker
    public FakeCategoryGenerator() {
        this.faker = new Faker();
    }

    // Phương thức tạo một danh mục ảo
    public Category generateFakeCategory() {
    	
        String name = faker.commerce().department();
        String description = faker.lorem().sentence();

        // Giới hạn độ dài của name và description
        name = name.length() > 50 ? name.substring(0, 50) : name;
        description = description.length() > 255 ? description.substring(0, 255) : description;

        return new Category(name, description);
    }


    // Phương thức tạo danh sách danh mục ảo
    public List<Category> generateFakeCategories(int numberOfCategories) {
        List<Category> categories = new ArrayList<>();
        for (int i = 0; i < numberOfCategories; i++) {
            categories.add(generateFakeCategory());
        }
        return categories;
    }
}
