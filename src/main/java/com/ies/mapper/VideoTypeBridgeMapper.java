package com.ies.mapper;

import com.ies.domain.VideoTypeBridge;
import com.ies.domain.VideoTypeBridgeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoTypeBridgeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int countByExample(VideoTypeBridgeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int deleteByExample(VideoTypeBridgeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int insert(VideoTypeBridge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int insertSelective(VideoTypeBridge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    List<VideoTypeBridge> selectByExampleWithRowbounds(VideoTypeBridgeCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    List<VideoTypeBridge> selectByExample(VideoTypeBridgeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    VideoTypeBridge selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") VideoTypeBridge record, @Param("example") VideoTypeBridgeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int updateByExample(@Param("record") VideoTypeBridge record, @Param("example") VideoTypeBridgeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int updateByPrimaryKeySelective(VideoTypeBridge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type_bridge
     *
     * @mbggenerated Sat Mar 28 21:59:14 CST 2020
     */
    int updateByPrimaryKey(VideoTypeBridge record);
}