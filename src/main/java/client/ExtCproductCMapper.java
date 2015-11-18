package client;

import cn.itcast.mybatis.domain.ExtCproductC;
import cn.itcast.mybatis.domain.ExtCproductCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtCproductCMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int countByExample(ExtCproductCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int deleteByExample(ExtCproductCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int deleteByPrimaryKey(String extCproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int insert(ExtCproductC record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int insertSelective(ExtCproductC record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    List<ExtCproductC> selectByExample(ExtCproductCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    ExtCproductC selectByPrimaryKey(String extCproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int updateByExampleSelective(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int updateByExample(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int updateByPrimaryKeySelective(ExtCproductC record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_CPRODUCT_C
     *
     * @mbggenerated Sun Nov 08 22:15:45 CST 2015
     */
    int updateByPrimaryKey(ExtCproductC record);
}