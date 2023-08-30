package org.haodong.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.haodong.dto.ProductDto;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from products")
    List<ProductDto> findAllProducts();

    @Select("select * from products where id = #{id}")
    ProductDto findProductById(@Param("id") int id);
}
