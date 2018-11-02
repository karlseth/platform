package com.kz.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class EcsSpecificationDTO implements Serializable {

    private static final long serialVersionUID = 1540544250791L;


    /**
    * 主键
    * 规格id
    * isNullAble:0
    */
    private Integer specificationId;

    /**
    * 商品id
    * isNullAble:0
    */
    private Integer goodsId;

    /**
    * 规格名称
    * isNullAble:1
    */
    private String specificationName;

    /**
    * 价格
    * isNullAble:1
    */
    private java.math.BigDecimal specificationPrice;

    /**
    * 消耗库存
    * isNullAble:1
    */
    private Integer specificationConsumeNum;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer isActivity;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer activityRelatedId;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer isDel;

    /**
    * 
    * isNullAble:1
    */
    private String yxSkuId;

    /**
    * 网易严选sku库存
    * isNullAble:1,defaultVal:0
    */
    private Integer inventory;


    public void setSpecificationId(Integer specificationId){this.specificationId = specificationId;}

    public Integer getSpecificationId(){return this.specificationId;}

    public void setGoodsId(Integer goodsId){this.goodsId = goodsId;}

    public Integer getGoodsId(){return this.goodsId;}

    public void setSpecificationName(String specificationName){this.specificationName = specificationName;}

    public String getSpecificationName(){return this.specificationName;}

    public void setSpecificationPrice(java.math.BigDecimal specificationPrice){this.specificationPrice = specificationPrice;}

    public java.math.BigDecimal getSpecificationPrice(){return this.specificationPrice;}

    public void setSpecificationConsumeNum(Integer specificationConsumeNum){this.specificationConsumeNum = specificationConsumeNum;}

    public Integer getSpecificationConsumeNum(){return this.specificationConsumeNum;}

    public void setIsActivity(Integer isActivity){this.isActivity = isActivity;}

    public Integer getIsActivity(){return this.isActivity;}

    public void setActivityRelatedId(Integer activityRelatedId){this.activityRelatedId = activityRelatedId;}

    public Integer getActivityRelatedId(){return this.activityRelatedId;}

    public void setIsDel(Integer isDel){this.isDel = isDel;}

    public Integer getIsDel(){return this.isDel;}

    public void setYxSkuId(String yxSkuId){this.yxSkuId = yxSkuId;}

    public String getYxSkuId(){return this.yxSkuId;}

    public void setInventory(Integer inventory){this.inventory = inventory;}

    public Integer getInventory(){return this.inventory;}
    @Override
    public String toString() {
        return "EcsSpecificationDTO{" +
                "specificationId='" + specificationId + '\'' +
                "goodsId='" + goodsId + '\'' +
                "specificationName='" + specificationName + '\'' +
                "specificationPrice='" + specificationPrice + '\'' +
                "specificationConsumeNum='" + specificationConsumeNum + '\'' +
                "isActivity='" + isActivity + '\'' +
                "activityRelatedId='" + activityRelatedId + '\'' +
                "isDel='" + isDel + '\'' +
                "yxSkuId='" + yxSkuId + '\'' +
                "inventory='" + inventory + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private EcsSpecificationDTO set;

        private ConditionBuilder where;

        public UpdateBuilder set(EcsSpecificationDTO set){
            this.set = set;
            return this;
        }

        public EcsSpecificationDTO getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends EcsSpecificationDTO{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> specificationIdList;

        public List<Integer> getSpecificationIdList(){return this.specificationIdList;}

        private Integer specificationIdSt;

        private Integer specificationIdEd;

        public Integer getSpecificationIdSt(){return this.specificationIdSt;}

        public Integer getSpecificationIdEd(){return this.specificationIdEd;}

        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<String> specificationNameList;

        public List<String> getSpecificationNameList(){return this.specificationNameList;}


        private List<String> fuzzySpecificationName;

        public List<String> getFuzzySpecificationName(){return this.fuzzySpecificationName;}

        private List<String> rightFuzzySpecificationName;

        public List<String> getRightFuzzySpecificationName(){return this.rightFuzzySpecificationName;}
        private List<java.math.BigDecimal> specificationPriceList;

        public List<java.math.BigDecimal> getSpecificationPriceList(){return this.specificationPriceList;}

        private java.math.BigDecimal specificationPriceSt;

        private java.math.BigDecimal specificationPriceEd;

        public java.math.BigDecimal getSpecificationPriceSt(){return this.specificationPriceSt;}

        public java.math.BigDecimal getSpecificationPriceEd(){return this.specificationPriceEd;}

        private List<Integer> specificationConsumeNumList;

        public List<Integer> getSpecificationConsumeNumList(){return this.specificationConsumeNumList;}

        private Integer specificationConsumeNumSt;

        private Integer specificationConsumeNumEd;

        public Integer getSpecificationConsumeNumSt(){return this.specificationConsumeNumSt;}

        public Integer getSpecificationConsumeNumEd(){return this.specificationConsumeNumEd;}

        private List<Integer> isActivityList;

        public List<Integer> getIsActivityList(){return this.isActivityList;}

        private Integer isActivitySt;

        private Integer isActivityEd;

        public Integer getIsActivitySt(){return this.isActivitySt;}

        public Integer getIsActivityEd(){return this.isActivityEd;}

        private List<Integer> activityRelatedIdList;

        public List<Integer> getActivityRelatedIdList(){return this.activityRelatedIdList;}

        private Integer activityRelatedIdSt;

        private Integer activityRelatedIdEd;

        public Integer getActivityRelatedIdSt(){return this.activityRelatedIdSt;}

        public Integer getActivityRelatedIdEd(){return this.activityRelatedIdEd;}

        private List<Integer> isDelList;

        public List<Integer> getIsDelList(){return this.isDelList;}

        private Integer isDelSt;

        private Integer isDelEd;

        public Integer getIsDelSt(){return this.isDelSt;}

        public Integer getIsDelEd(){return this.isDelEd;}

        private List<String> yxSkuIdList;

        public List<String> getYxSkuIdList(){return this.yxSkuIdList;}


        private List<String> fuzzyYxSkuId;

        public List<String> getFuzzyYxSkuId(){return this.fuzzyYxSkuId;}

        private List<String> rightFuzzyYxSkuId;

        public List<String> getRightFuzzyYxSkuId(){return this.rightFuzzyYxSkuId;}
        private List<Integer> inventoryList;

        public List<Integer> getInventoryList(){return this.inventoryList;}

        private Integer inventorySt;

        private Integer inventoryEd;

        public Integer getInventorySt(){return this.inventorySt;}

        public Integer getInventoryEd(){return this.inventoryEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder specificationIdBetWeen(Integer specificationIdSt,Integer specificationIdEd){
            this.specificationIdSt = specificationIdSt;
            this.specificationIdEd = specificationIdEd;
            return this;
        }

        public QueryBuilder specificationIdGreaterEqThan(Integer specificationIdSt){
            this.specificationIdSt = specificationIdSt;
            return this;
        }
        public QueryBuilder specificationIdLessEqThan(Integer specificationIdEd){
            this.specificationIdEd = specificationIdEd;
            return this;
        }


        public QueryBuilder specificationId(Integer specificationId){
            setSpecificationId(specificationId);
            return this;
        }

        public QueryBuilder specificationIdList(Integer ... specificationId){
            this.specificationIdList = solveNullList(specificationId);
            return this;
        }

        public QueryBuilder specificationIdList(List<Integer> specificationId){
            this.specificationIdList = specificationId;
            return this;
        }

        public QueryBuilder fetchSpecificationId(){
            setFetchFields("fetchFields","specificationId");
            return this;
        }

        public QueryBuilder excludeSpecificationId(){
            setFetchFields("excludeFields","specificationId");
            return this;
        }

        public QueryBuilder goodsIdBetWeen(Integer goodsIdSt,Integer goodsIdEd){
            this.goodsIdSt = goodsIdSt;
            this.goodsIdEd = goodsIdEd;
            return this;
        }

        public QueryBuilder goodsIdGreaterEqThan(Integer goodsIdSt){
            this.goodsIdSt = goodsIdSt;
            return this;
        }
        public QueryBuilder goodsIdLessEqThan(Integer goodsIdEd){
            this.goodsIdEd = goodsIdEd;
            return this;
        }


        public QueryBuilder goodsId(Integer goodsId){
            setGoodsId(goodsId);
            return this;
        }

        public QueryBuilder goodsIdList(Integer ... goodsId){
            this.goodsIdList = solveNullList(goodsId);
            return this;
        }

        public QueryBuilder goodsIdList(List<Integer> goodsId){
            this.goodsIdList = goodsId;
            return this;
        }

        public QueryBuilder fetchGoodsId(){
            setFetchFields("fetchFields","goodsId");
            return this;
        }

        public QueryBuilder excludeGoodsId(){
            setFetchFields("excludeFields","goodsId");
            return this;
        }

        public QueryBuilder fuzzySpecificationName (List<String> fuzzySpecificationName){
            this.fuzzySpecificationName = fuzzySpecificationName;
            return this;
        }

        public QueryBuilder fuzzySpecificationName (String ... fuzzySpecificationName){
            this.fuzzySpecificationName = solveNullList(fuzzySpecificationName);
            return this;
        }

        public QueryBuilder rightFuzzySpecificationName (List<String> rightFuzzySpecificationName){
            this.rightFuzzySpecificationName = rightFuzzySpecificationName;
            return this;
        }

        public QueryBuilder rightFuzzySpecificationName (String ... rightFuzzySpecificationName){
            this.rightFuzzySpecificationName = solveNullList(rightFuzzySpecificationName);
            return this;
        }

        public QueryBuilder specificationName(String specificationName){
            setSpecificationName(specificationName);
            return this;
        }

        public QueryBuilder specificationNameList(String ... specificationName){
            this.specificationNameList = solveNullList(specificationName);
            return this;
        }

        public QueryBuilder specificationNameList(List<String> specificationName){
            this.specificationNameList = specificationName;
            return this;
        }

        public QueryBuilder fetchSpecificationName(){
            setFetchFields("fetchFields","specificationName");
            return this;
        }

        public QueryBuilder excludeSpecificationName(){
            setFetchFields("excludeFields","specificationName");
            return this;
        }

        public QueryBuilder specificationPriceBetWeen(java.math.BigDecimal specificationPriceSt,java.math.BigDecimal specificationPriceEd){
            this.specificationPriceSt = specificationPriceSt;
            this.specificationPriceEd = specificationPriceEd;
            return this;
        }

        public QueryBuilder specificationPriceGreaterEqThan(java.math.BigDecimal specificationPriceSt){
            this.specificationPriceSt = specificationPriceSt;
            return this;
        }
        public QueryBuilder specificationPriceLessEqThan(java.math.BigDecimal specificationPriceEd){
            this.specificationPriceEd = specificationPriceEd;
            return this;
        }


        public QueryBuilder specificationPrice(java.math.BigDecimal specificationPrice){
            setSpecificationPrice(specificationPrice);
            return this;
        }

        public QueryBuilder specificationPriceList(java.math.BigDecimal ... specificationPrice){
            this.specificationPriceList = solveNullList(specificationPrice);
            return this;
        }

        public QueryBuilder specificationPriceList(List<java.math.BigDecimal> specificationPrice){
            this.specificationPriceList = specificationPrice;
            return this;
        }

        public QueryBuilder fetchSpecificationPrice(){
            setFetchFields("fetchFields","specificationPrice");
            return this;
        }

        public QueryBuilder excludeSpecificationPrice(){
            setFetchFields("excludeFields","specificationPrice");
            return this;
        }

        public QueryBuilder specificationConsumeNumBetWeen(Integer specificationConsumeNumSt,Integer specificationConsumeNumEd){
            this.specificationConsumeNumSt = specificationConsumeNumSt;
            this.specificationConsumeNumEd = specificationConsumeNumEd;
            return this;
        }

        public QueryBuilder specificationConsumeNumGreaterEqThan(Integer specificationConsumeNumSt){
            this.specificationConsumeNumSt = specificationConsumeNumSt;
            return this;
        }
        public QueryBuilder specificationConsumeNumLessEqThan(Integer specificationConsumeNumEd){
            this.specificationConsumeNumEd = specificationConsumeNumEd;
            return this;
        }


        public QueryBuilder specificationConsumeNum(Integer specificationConsumeNum){
            setSpecificationConsumeNum(specificationConsumeNum);
            return this;
        }

        public QueryBuilder specificationConsumeNumList(Integer ... specificationConsumeNum){
            this.specificationConsumeNumList = solveNullList(specificationConsumeNum);
            return this;
        }

        public QueryBuilder specificationConsumeNumList(List<Integer> specificationConsumeNum){
            this.specificationConsumeNumList = specificationConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecificationConsumeNum(){
            setFetchFields("fetchFields","specificationConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecificationConsumeNum(){
            setFetchFields("excludeFields","specificationConsumeNum");
            return this;
        }

        public QueryBuilder isActivityBetWeen(Integer isActivitySt,Integer isActivityEd){
            this.isActivitySt = isActivitySt;
            this.isActivityEd = isActivityEd;
            return this;
        }

        public QueryBuilder isActivityGreaterEqThan(Integer isActivitySt){
            this.isActivitySt = isActivitySt;
            return this;
        }
        public QueryBuilder isActivityLessEqThan(Integer isActivityEd){
            this.isActivityEd = isActivityEd;
            return this;
        }


        public QueryBuilder isActivity(Integer isActivity){
            setIsActivity(isActivity);
            return this;
        }

        public QueryBuilder isActivityList(Integer ... isActivity){
            this.isActivityList = solveNullList(isActivity);
            return this;
        }

        public QueryBuilder isActivityList(List<Integer> isActivity){
            this.isActivityList = isActivity;
            return this;
        }

        public QueryBuilder fetchIsActivity(){
            setFetchFields("fetchFields","isActivity");
            return this;
        }

        public QueryBuilder excludeIsActivity(){
            setFetchFields("excludeFields","isActivity");
            return this;
        }

        public QueryBuilder activityRelatedIdBetWeen(Integer activityRelatedIdSt,Integer activityRelatedIdEd){
            this.activityRelatedIdSt = activityRelatedIdSt;
            this.activityRelatedIdEd = activityRelatedIdEd;
            return this;
        }

        public QueryBuilder activityRelatedIdGreaterEqThan(Integer activityRelatedIdSt){
            this.activityRelatedIdSt = activityRelatedIdSt;
            return this;
        }
        public QueryBuilder activityRelatedIdLessEqThan(Integer activityRelatedIdEd){
            this.activityRelatedIdEd = activityRelatedIdEd;
            return this;
        }


        public QueryBuilder activityRelatedId(Integer activityRelatedId){
            setActivityRelatedId(activityRelatedId);
            return this;
        }

        public QueryBuilder activityRelatedIdList(Integer ... activityRelatedId){
            this.activityRelatedIdList = solveNullList(activityRelatedId);
            return this;
        }

        public QueryBuilder activityRelatedIdList(List<Integer> activityRelatedId){
            this.activityRelatedIdList = activityRelatedId;
            return this;
        }

        public QueryBuilder fetchActivityRelatedId(){
            setFetchFields("fetchFields","activityRelatedId");
            return this;
        }

        public QueryBuilder excludeActivityRelatedId(){
            setFetchFields("excludeFields","activityRelatedId");
            return this;
        }

        public QueryBuilder isDelBetWeen(Integer isDelSt,Integer isDelEd){
            this.isDelSt = isDelSt;
            this.isDelEd = isDelEd;
            return this;
        }

        public QueryBuilder isDelGreaterEqThan(Integer isDelSt){
            this.isDelSt = isDelSt;
            return this;
        }
        public QueryBuilder isDelLessEqThan(Integer isDelEd){
            this.isDelEd = isDelEd;
            return this;
        }


        public QueryBuilder isDel(Integer isDel){
            setIsDel(isDel);
            return this;
        }

        public QueryBuilder isDelList(Integer ... isDel){
            this.isDelList = solveNullList(isDel);
            return this;
        }

        public QueryBuilder isDelList(List<Integer> isDel){
            this.isDelList = isDel;
            return this;
        }

        public QueryBuilder fetchIsDel(){
            setFetchFields("fetchFields","isDel");
            return this;
        }

        public QueryBuilder excludeIsDel(){
            setFetchFields("excludeFields","isDel");
            return this;
        }

        public QueryBuilder fuzzyYxSkuId (List<String> fuzzyYxSkuId){
            this.fuzzyYxSkuId = fuzzyYxSkuId;
            return this;
        }

        public QueryBuilder fuzzyYxSkuId (String ... fuzzyYxSkuId){
            this.fuzzyYxSkuId = solveNullList(fuzzyYxSkuId);
            return this;
        }

        public QueryBuilder rightFuzzyYxSkuId (List<String> rightFuzzyYxSkuId){
            this.rightFuzzyYxSkuId = rightFuzzyYxSkuId;
            return this;
        }

        public QueryBuilder rightFuzzyYxSkuId (String ... rightFuzzyYxSkuId){
            this.rightFuzzyYxSkuId = solveNullList(rightFuzzyYxSkuId);
            return this;
        }

        public QueryBuilder yxSkuId(String yxSkuId){
            setYxSkuId(yxSkuId);
            return this;
        }

        public QueryBuilder yxSkuIdList(String ... yxSkuId){
            this.yxSkuIdList = solveNullList(yxSkuId);
            return this;
        }

        public QueryBuilder yxSkuIdList(List<String> yxSkuId){
            this.yxSkuIdList = yxSkuId;
            return this;
        }

        public QueryBuilder fetchYxSkuId(){
            setFetchFields("fetchFields","yxSkuId");
            return this;
        }

        public QueryBuilder excludeYxSkuId(){
            setFetchFields("excludeFields","yxSkuId");
            return this;
        }

        public QueryBuilder inventoryBetWeen(Integer inventorySt,Integer inventoryEd){
            this.inventorySt = inventorySt;
            this.inventoryEd = inventoryEd;
            return this;
        }

        public QueryBuilder inventoryGreaterEqThan(Integer inventorySt){
            this.inventorySt = inventorySt;
            return this;
        }
        public QueryBuilder inventoryLessEqThan(Integer inventoryEd){
            this.inventoryEd = inventoryEd;
            return this;
        }


        public QueryBuilder inventory(Integer inventory){
            setInventory(inventory);
            return this;
        }

        public QueryBuilder inventoryList(Integer ... inventory){
            this.inventoryList = solveNullList(inventory);
            return this;
        }

        public QueryBuilder inventoryList(List<Integer> inventory){
            this.inventoryList = inventory;
            return this;
        }

        public QueryBuilder fetchInventory(){
            setFetchFields("fetchFields","inventory");
            return this;
        }

        public QueryBuilder excludeInventory(){
            setFetchFields("excludeFields","inventory");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public EcsSpecificationDTO build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> specificationIdList;

        public List<Integer> getSpecificationIdList(){return this.specificationIdList;}

        private Integer specificationIdSt;

        private Integer specificationIdEd;

        public Integer getSpecificationIdSt(){return this.specificationIdSt;}

        public Integer getSpecificationIdEd(){return this.specificationIdEd;}

        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<String> specificationNameList;

        public List<String> getSpecificationNameList(){return this.specificationNameList;}


        private List<String> fuzzySpecificationName;

        public List<String> getFuzzySpecificationName(){return this.fuzzySpecificationName;}

        private List<String> rightFuzzySpecificationName;

        public List<String> getRightFuzzySpecificationName(){return this.rightFuzzySpecificationName;}
        private List<java.math.BigDecimal> specificationPriceList;

        public List<java.math.BigDecimal> getSpecificationPriceList(){return this.specificationPriceList;}

        private java.math.BigDecimal specificationPriceSt;

        private java.math.BigDecimal specificationPriceEd;

        public java.math.BigDecimal getSpecificationPriceSt(){return this.specificationPriceSt;}

        public java.math.BigDecimal getSpecificationPriceEd(){return this.specificationPriceEd;}

        private List<Integer> specificationConsumeNumList;

        public List<Integer> getSpecificationConsumeNumList(){return this.specificationConsumeNumList;}

        private Integer specificationConsumeNumSt;

        private Integer specificationConsumeNumEd;

        public Integer getSpecificationConsumeNumSt(){return this.specificationConsumeNumSt;}

        public Integer getSpecificationConsumeNumEd(){return this.specificationConsumeNumEd;}

        private List<Integer> isActivityList;

        public List<Integer> getIsActivityList(){return this.isActivityList;}

        private Integer isActivitySt;

        private Integer isActivityEd;

        public Integer getIsActivitySt(){return this.isActivitySt;}

        public Integer getIsActivityEd(){return this.isActivityEd;}

        private List<Integer> activityRelatedIdList;

        public List<Integer> getActivityRelatedIdList(){return this.activityRelatedIdList;}

        private Integer activityRelatedIdSt;

        private Integer activityRelatedIdEd;

        public Integer getActivityRelatedIdSt(){return this.activityRelatedIdSt;}

        public Integer getActivityRelatedIdEd(){return this.activityRelatedIdEd;}

        private List<Integer> isDelList;

        public List<Integer> getIsDelList(){return this.isDelList;}

        private Integer isDelSt;

        private Integer isDelEd;

        public Integer getIsDelSt(){return this.isDelSt;}

        public Integer getIsDelEd(){return this.isDelEd;}

        private List<String> yxSkuIdList;

        public List<String> getYxSkuIdList(){return this.yxSkuIdList;}


        private List<String> fuzzyYxSkuId;

        public List<String> getFuzzyYxSkuId(){return this.fuzzyYxSkuId;}

        private List<String> rightFuzzyYxSkuId;

        public List<String> getRightFuzzyYxSkuId(){return this.rightFuzzyYxSkuId;}
        private List<Integer> inventoryList;

        public List<Integer> getInventoryList(){return this.inventoryList;}

        private Integer inventorySt;

        private Integer inventoryEd;

        public Integer getInventorySt(){return this.inventorySt;}

        public Integer getInventoryEd(){return this.inventoryEd;}


        public ConditionBuilder specificationIdBetWeen(Integer specificationIdSt,Integer specificationIdEd){
            this.specificationIdSt = specificationIdSt;
            this.specificationIdEd = specificationIdEd;
            return this;
        }

        public ConditionBuilder specificationIdGreaterEqThan(Integer specificationIdSt){
            this.specificationIdSt = specificationIdSt;
            return this;
        }
        public ConditionBuilder specificationIdLessEqThan(Integer specificationIdEd){
            this.specificationIdEd = specificationIdEd;
            return this;
        }


        public ConditionBuilder specificationIdList(Integer ... specificationId){
            this.specificationIdList = solveNullList(specificationId);
            return this;
        }

        public ConditionBuilder specificationIdList(List<Integer> specificationId){
            this.specificationIdList = specificationId;
            return this;
        }

        public ConditionBuilder goodsIdBetWeen(Integer goodsIdSt,Integer goodsIdEd){
            this.goodsIdSt = goodsIdSt;
            this.goodsIdEd = goodsIdEd;
            return this;
        }

        public ConditionBuilder goodsIdGreaterEqThan(Integer goodsIdSt){
            this.goodsIdSt = goodsIdSt;
            return this;
        }
        public ConditionBuilder goodsIdLessEqThan(Integer goodsIdEd){
            this.goodsIdEd = goodsIdEd;
            return this;
        }


        public ConditionBuilder goodsIdList(Integer ... goodsId){
            this.goodsIdList = solveNullList(goodsId);
            return this;
        }

        public ConditionBuilder goodsIdList(List<Integer> goodsId){
            this.goodsIdList = goodsId;
            return this;
        }

        public ConditionBuilder fuzzySpecificationName (List<String> fuzzySpecificationName){
            this.fuzzySpecificationName = fuzzySpecificationName;
            return this;
        }

        public ConditionBuilder fuzzySpecificationName (String ... fuzzySpecificationName){
            this.fuzzySpecificationName = solveNullList(fuzzySpecificationName);
            return this;
        }

        public ConditionBuilder rightFuzzySpecificationName (List<String> rightFuzzySpecificationName){
            this.rightFuzzySpecificationName = rightFuzzySpecificationName;
            return this;
        }

        public ConditionBuilder rightFuzzySpecificationName (String ... rightFuzzySpecificationName){
            this.rightFuzzySpecificationName = solveNullList(rightFuzzySpecificationName);
            return this;
        }

        public ConditionBuilder specificationNameList(String ... specificationName){
            this.specificationNameList = solveNullList(specificationName);
            return this;
        }

        public ConditionBuilder specificationNameList(List<String> specificationName){
            this.specificationNameList = specificationName;
            return this;
        }

        public ConditionBuilder specificationPriceBetWeen(java.math.BigDecimal specificationPriceSt,java.math.BigDecimal specificationPriceEd){
            this.specificationPriceSt = specificationPriceSt;
            this.specificationPriceEd = specificationPriceEd;
            return this;
        }

        public ConditionBuilder specificationPriceGreaterEqThan(java.math.BigDecimal specificationPriceSt){
            this.specificationPriceSt = specificationPriceSt;
            return this;
        }
        public ConditionBuilder specificationPriceLessEqThan(java.math.BigDecimal specificationPriceEd){
            this.specificationPriceEd = specificationPriceEd;
            return this;
        }


        public ConditionBuilder specificationPriceList(java.math.BigDecimal ... specificationPrice){
            this.specificationPriceList = solveNullList(specificationPrice);
            return this;
        }

        public ConditionBuilder specificationPriceList(List<java.math.BigDecimal> specificationPrice){
            this.specificationPriceList = specificationPrice;
            return this;
        }

        public ConditionBuilder specificationConsumeNumBetWeen(Integer specificationConsumeNumSt,Integer specificationConsumeNumEd){
            this.specificationConsumeNumSt = specificationConsumeNumSt;
            this.specificationConsumeNumEd = specificationConsumeNumEd;
            return this;
        }

        public ConditionBuilder specificationConsumeNumGreaterEqThan(Integer specificationConsumeNumSt){
            this.specificationConsumeNumSt = specificationConsumeNumSt;
            return this;
        }
        public ConditionBuilder specificationConsumeNumLessEqThan(Integer specificationConsumeNumEd){
            this.specificationConsumeNumEd = specificationConsumeNumEd;
            return this;
        }


        public ConditionBuilder specificationConsumeNumList(Integer ... specificationConsumeNum){
            this.specificationConsumeNumList = solveNullList(specificationConsumeNum);
            return this;
        }

        public ConditionBuilder specificationConsumeNumList(List<Integer> specificationConsumeNum){
            this.specificationConsumeNumList = specificationConsumeNum;
            return this;
        }

        public ConditionBuilder isActivityBetWeen(Integer isActivitySt,Integer isActivityEd){
            this.isActivitySt = isActivitySt;
            this.isActivityEd = isActivityEd;
            return this;
        }

        public ConditionBuilder isActivityGreaterEqThan(Integer isActivitySt){
            this.isActivitySt = isActivitySt;
            return this;
        }
        public ConditionBuilder isActivityLessEqThan(Integer isActivityEd){
            this.isActivityEd = isActivityEd;
            return this;
        }


        public ConditionBuilder isActivityList(Integer ... isActivity){
            this.isActivityList = solveNullList(isActivity);
            return this;
        }

        public ConditionBuilder isActivityList(List<Integer> isActivity){
            this.isActivityList = isActivity;
            return this;
        }

        public ConditionBuilder activityRelatedIdBetWeen(Integer activityRelatedIdSt,Integer activityRelatedIdEd){
            this.activityRelatedIdSt = activityRelatedIdSt;
            this.activityRelatedIdEd = activityRelatedIdEd;
            return this;
        }

        public ConditionBuilder activityRelatedIdGreaterEqThan(Integer activityRelatedIdSt){
            this.activityRelatedIdSt = activityRelatedIdSt;
            return this;
        }
        public ConditionBuilder activityRelatedIdLessEqThan(Integer activityRelatedIdEd){
            this.activityRelatedIdEd = activityRelatedIdEd;
            return this;
        }


        public ConditionBuilder activityRelatedIdList(Integer ... activityRelatedId){
            this.activityRelatedIdList = solveNullList(activityRelatedId);
            return this;
        }

        public ConditionBuilder activityRelatedIdList(List<Integer> activityRelatedId){
            this.activityRelatedIdList = activityRelatedId;
            return this;
        }

        public ConditionBuilder isDelBetWeen(Integer isDelSt,Integer isDelEd){
            this.isDelSt = isDelSt;
            this.isDelEd = isDelEd;
            return this;
        }

        public ConditionBuilder isDelGreaterEqThan(Integer isDelSt){
            this.isDelSt = isDelSt;
            return this;
        }
        public ConditionBuilder isDelLessEqThan(Integer isDelEd){
            this.isDelEd = isDelEd;
            return this;
        }


        public ConditionBuilder isDelList(Integer ... isDel){
            this.isDelList = solveNullList(isDel);
            return this;
        }

        public ConditionBuilder isDelList(List<Integer> isDel){
            this.isDelList = isDel;
            return this;
        }

        public ConditionBuilder fuzzyYxSkuId (List<String> fuzzyYxSkuId){
            this.fuzzyYxSkuId = fuzzyYxSkuId;
            return this;
        }

        public ConditionBuilder fuzzyYxSkuId (String ... fuzzyYxSkuId){
            this.fuzzyYxSkuId = solveNullList(fuzzyYxSkuId);
            return this;
        }

        public ConditionBuilder rightFuzzyYxSkuId (List<String> rightFuzzyYxSkuId){
            this.rightFuzzyYxSkuId = rightFuzzyYxSkuId;
            return this;
        }

        public ConditionBuilder rightFuzzyYxSkuId (String ... rightFuzzyYxSkuId){
            this.rightFuzzyYxSkuId = solveNullList(rightFuzzyYxSkuId);
            return this;
        }

        public ConditionBuilder yxSkuIdList(String ... yxSkuId){
            this.yxSkuIdList = solveNullList(yxSkuId);
            return this;
        }

        public ConditionBuilder yxSkuIdList(List<String> yxSkuId){
            this.yxSkuIdList = yxSkuId;
            return this;
        }

        public ConditionBuilder inventoryBetWeen(Integer inventorySt,Integer inventoryEd){
            this.inventorySt = inventorySt;
            this.inventoryEd = inventoryEd;
            return this;
        }

        public ConditionBuilder inventoryGreaterEqThan(Integer inventorySt){
            this.inventorySt = inventorySt;
            return this;
        }
        public ConditionBuilder inventoryLessEqThan(Integer inventoryEd){
            this.inventoryEd = inventoryEd;
            return this;
        }


        public ConditionBuilder inventoryList(Integer ... inventory){
            this.inventoryList = solveNullList(inventory);
            return this;
        }

        public ConditionBuilder inventoryList(List<Integer> inventory){
            this.inventoryList = inventory;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private EcsSpecificationDTO obj;

        public Builder(){
            this.obj = new EcsSpecificationDTO();
        }

        public Builder specificationId(Integer specificationId){
            this.obj.setSpecificationId(specificationId);
            return this;
        }
        public Builder goodsId(Integer goodsId){
            this.obj.setGoodsId(goodsId);
            return this;
        }
        public Builder specificationName(String specificationName){
            this.obj.setSpecificationName(specificationName);
            return this;
        }
        public Builder specificationPrice(java.math.BigDecimal specificationPrice){
            this.obj.setSpecificationPrice(specificationPrice);
            return this;
        }
        public Builder specificationConsumeNum(Integer specificationConsumeNum){
            this.obj.setSpecificationConsumeNum(specificationConsumeNum);
            return this;
        }
        public Builder isActivity(Integer isActivity){
            this.obj.setIsActivity(isActivity);
            return this;
        }
        public Builder activityRelatedId(Integer activityRelatedId){
            this.obj.setActivityRelatedId(activityRelatedId);
            return this;
        }
        public Builder isDel(Integer isDel){
            this.obj.setIsDel(isDel);
            return this;
        }
        public Builder yxSkuId(String yxSkuId){
            this.obj.setYxSkuId(yxSkuId);
            return this;
        }
        public Builder inventory(Integer inventory){
            this.obj.setInventory(inventory);
            return this;
        }
        public EcsSpecificationDTO build(){return obj;}
    }

}
