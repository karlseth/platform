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
public class EcsGoods implements Serializable {

    private static final long serialVersionUID = 1538116284948L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer goodsId;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer catId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String goodsSn;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String goodsName;

    /**
    * 
    * isNullAble:0,defaultVal:+
    */
    private String goodsNameStyle;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer clickCount;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer brandId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String providerName;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer goodsNumber;

    /**
    * 
    * isNullAble:0,defaultVal:0.000
    */
    private java.math.BigDecimal goodsWeight;

    /**
    * 
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal marketPrice;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer virtualSales;

    /**
    * 
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal shopPrice;

    /**
    * 
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal promotePrice;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer promoteStartDate;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer promoteEndDate;

    /**
    * 
    * isNullAble:0
    */
    private String warnNumber;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String keywords;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String goodsBrief;

    /**
    * 
    * isNullAble:0
    */
    private String goodsDesc;

    /**
    * 
    * isNullAble:0
    */
    private String goodsThumb;

    /**
    * 
    * isNullAble:0
    */
    private String goodsImg;

    /**
    * 
    * isNullAble:0
    */
    private String originalImg;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer isReal;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String extensionCode;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer isOnSale;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer isAloneSale;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isShipping;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer integral;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer addTime;

    /**
    * 
    * isNullAble:0,defaultVal:100
    */
    private Integer sortOrder;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isDelete;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isBest;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isNew;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isHot;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isPromote;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer bonusTypeId;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer lastUpdate;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer goodsType;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String sellerNote;

    /**
    * 
    * isNullAble:0,defaultVal:-1
    */
    private Integer giveIntegral;

    /**
    * 
    * isNullAble:0,defaultVal:-1
    */
    private Integer rankIntegral;

    /**
    * 
    * isNullAble:1
    */
    private Integer suppliersId;

    /**
    * 
    * isNullAble:1
    */
    private Integer isCheck;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer needIdcard;

    /**
    * 
    * isNullAble:1,defaultVal:1
    */
    private Integer isBonus;

    /**
    * 副标题
    * isNullAble:1
    */
    private String secondaryTitle;

    /**
    * 标签
    * isNullAble:1
    */
    private String tag;

    /**
    * 运费
    * isNullAble:1
    */
    private java.math.BigDecimal shippingFee;

    /**
    * 产地
    * isNullAble:1
    */
    private String productionPlace;

    /**
    * 商品图片1
    * isNullAble:1
    */
    private String goodsImg1;

    /**
    * 商品图片2
    * isNullAble:1
    */
    private String goodsImg2;

    /**
    * 商品图片3
    * isNullAble:1
    */
    private String goodsImg3;

    /**
    * 商品图片4
    * isNullAble:1
    */
    private String goodsImg4;

    /**
    * 商品图片5
    * isNullAble:1
    */
    private String goodsImg5;

    /**
    * 商品图片6
    * isNullAble:1
    */
    private String goodsImg6;

    /**
    * 供应商
    * isNullAble:1
    */
    private String suppliers;

    /**
    * 是否显示说明
    * isNullAble:1
    */
    private String isShowDesc;

    /**
    * 说明
    * isNullAble:1
    */
    private String description;

    /**
    * 规格一名称
    * isNullAble:1,defaultVal:
    */
    private String specification1Name;

    /**
    * 规格一价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification1Price;

    /**
    * 规格一消耗库存
    * isNullAble:1
    */
    private Integer specification1ConsumeNum;

    /**
    * 规格二名称
    * isNullAble:1,defaultVal:
    */
    private String specification2Name;

    /**
    * 规格二价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification2Price;

    /**
    * 规格二消耗库存
    * isNullAble:1
    */
    private Integer specification2ConsumeNum;

    /**
    * 规格三名称
    * isNullAble:1,defaultVal:
    */
    private String specification3Name;

    /**
    * 规格三价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification3Price;

    /**
    * 规格三消耗库存
    * isNullAble:1
    */
    private Integer specification3ConsumeNum;

    /**
    * 规格四名称
    * isNullAble:1,defaultVal:
    */
    private String specification4Name;

    /**
    * 规格四价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification4Price;

    /**
    * 规格四消耗库存
    * isNullAble:1
    */
    private Integer specification4ConsumeNum;

    /**
    * 规格五名称
    * isNullAble:1,defaultVal:
    */
    private String specification5Name;

    /**
    * 规格五价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification5Price;

    /**
    * 规格五消耗库存
    * isNullAble:1
    */
    private Integer specification5ConsumeNum;

    /**
    * 规格六名称
    * isNullAble:1,defaultVal:
    */
    private String specification6Name;

    /**
    * 规格六价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification6Price;

    /**
    * 规格六消耗库存
    * isNullAble:1
    */
    private Integer specification6ConsumeNum;

    /**
    * 规格七名称
    * isNullAble:1,defaultVal:
    */
    private String specification7Name;

    /**
    * 规格七价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification7Price;

    /**
    * 规格七消耗库存
    * isNullAble:1
    */
    private Integer specification7ConsumeNum;

    /**
    * 规格八名称
    * isNullAble:1,defaultVal:
    */
    private String specification8Name;

    /**
    * 规格八价格
    * isNullAble:1
    */
    private java.math.BigDecimal specification8Price;

    /**
    * 规格八消耗库存
    * isNullAble:1
    */
    private Integer specification8ConsumeNum;


    public void setGoodsId(Integer goodsId){this.goodsId = goodsId;}

    public Integer getGoodsId(){return this.goodsId;}

    public void setCatId(Integer catId){this.catId = catId;}

    public Integer getCatId(){return this.catId;}

    public void setGoodsSn(String goodsSn){this.goodsSn = goodsSn;}

    public String getGoodsSn(){return this.goodsSn;}

    public void setGoodsName(String goodsName){this.goodsName = goodsName;}

    public String getGoodsName(){return this.goodsName;}

    public void setGoodsNameStyle(String goodsNameStyle){this.goodsNameStyle = goodsNameStyle;}

    public String getGoodsNameStyle(){return this.goodsNameStyle;}

    public void setClickCount(Integer clickCount){this.clickCount = clickCount;}

    public Integer getClickCount(){return this.clickCount;}

    public void setBrandId(Integer brandId){this.brandId = brandId;}

    public Integer getBrandId(){return this.brandId;}

    public void setProviderName(String providerName){this.providerName = providerName;}

    public String getProviderName(){return this.providerName;}

    public void setGoodsNumber(Integer goodsNumber){this.goodsNumber = goodsNumber;}

    public Integer getGoodsNumber(){return this.goodsNumber;}

    public void setGoodsWeight(java.math.BigDecimal goodsWeight){this.goodsWeight = goodsWeight;}

    public java.math.BigDecimal getGoodsWeight(){return this.goodsWeight;}

    public void setMarketPrice(java.math.BigDecimal marketPrice){this.marketPrice = marketPrice;}

    public java.math.BigDecimal getMarketPrice(){return this.marketPrice;}

    public void setVirtualSales(Integer virtualSales){this.virtualSales = virtualSales;}

    public Integer getVirtualSales(){return this.virtualSales;}

    public void setShopPrice(java.math.BigDecimal shopPrice){this.shopPrice = shopPrice;}

    public java.math.BigDecimal getShopPrice(){return this.shopPrice;}

    public void setPromotePrice(java.math.BigDecimal promotePrice){this.promotePrice = promotePrice;}

    public java.math.BigDecimal getPromotePrice(){return this.promotePrice;}

    public void setPromoteStartDate(Integer promoteStartDate){this.promoteStartDate = promoteStartDate;}

    public Integer getPromoteStartDate(){return this.promoteStartDate;}

    public void setPromoteEndDate(Integer promoteEndDate){this.promoteEndDate = promoteEndDate;}

    public Integer getPromoteEndDate(){return this.promoteEndDate;}

    public void setWarnNumber(String warnNumber){this.warnNumber = warnNumber;}

    public String getWarnNumber(){return this.warnNumber;}

    public void setKeywords(String keywords){this.keywords = keywords;}

    public String getKeywords(){return this.keywords;}

    public void setGoodsBrief(String goodsBrief){this.goodsBrief = goodsBrief;}

    public String getGoodsBrief(){return this.goodsBrief;}

    public void setGoodsDesc(String goodsDesc){this.goodsDesc = goodsDesc;}

    public String getGoodsDesc(){return this.goodsDesc;}

    public void setGoodsThumb(String goodsThumb){this.goodsThumb = goodsThumb;}

    public String getGoodsThumb(){return this.goodsThumb;}

    public void setGoodsImg(String goodsImg){this.goodsImg = goodsImg;}

    public String getGoodsImg(){return this.goodsImg;}

    public void setOriginalImg(String originalImg){this.originalImg = originalImg;}

    public String getOriginalImg(){return this.originalImg;}

    public void setIsReal(Integer isReal){this.isReal = isReal;}

    public Integer getIsReal(){return this.isReal;}

    public void setExtensionCode(String extensionCode){this.extensionCode = extensionCode;}

    public String getExtensionCode(){return this.extensionCode;}

    public void setIsOnSale(Integer isOnSale){this.isOnSale = isOnSale;}

    public Integer getIsOnSale(){return this.isOnSale;}

    public void setIsAloneSale(Integer isAloneSale){this.isAloneSale = isAloneSale;}

    public Integer getIsAloneSale(){return this.isAloneSale;}

    public void setIsShipping(Integer isShipping){this.isShipping = isShipping;}

    public Integer getIsShipping(){return this.isShipping;}

    public void setIntegral(Integer integral){this.integral = integral;}

    public Integer getIntegral(){return this.integral;}

    public void setAddTime(Integer addTime){this.addTime = addTime;}

    public Integer getAddTime(){return this.addTime;}

    public void setSortOrder(Integer sortOrder){this.sortOrder = sortOrder;}

    public Integer getSortOrder(){return this.sortOrder;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}

    public void setIsBest(Integer isBest){this.isBest = isBest;}

    public Integer getIsBest(){return this.isBest;}

    public void setIsNew(Integer isNew){this.isNew = isNew;}

    public Integer getIsNew(){return this.isNew;}

    public void setIsHot(Integer isHot){this.isHot = isHot;}

    public Integer getIsHot(){return this.isHot;}

    public void setIsPromote(Integer isPromote){this.isPromote = isPromote;}

    public Integer getIsPromote(){return this.isPromote;}

    public void setBonusTypeId(Integer bonusTypeId){this.bonusTypeId = bonusTypeId;}

    public Integer getBonusTypeId(){return this.bonusTypeId;}

    public void setLastUpdate(Integer lastUpdate){this.lastUpdate = lastUpdate;}

    public Integer getLastUpdate(){return this.lastUpdate;}

    public void setGoodsType(Integer goodsType){this.goodsType = goodsType;}

    public Integer getGoodsType(){return this.goodsType;}

    public void setSellerNote(String sellerNote){this.sellerNote = sellerNote;}

    public String getSellerNote(){return this.sellerNote;}

    public void setGiveIntegral(Integer giveIntegral){this.giveIntegral = giveIntegral;}

    public Integer getGiveIntegral(){return this.giveIntegral;}

    public void setRankIntegral(Integer rankIntegral){this.rankIntegral = rankIntegral;}

    public Integer getRankIntegral(){return this.rankIntegral;}

    public void setSuppliersId(Integer suppliersId){this.suppliersId = suppliersId;}

    public Integer getSuppliersId(){return this.suppliersId;}

    public void setIsCheck(Integer isCheck){this.isCheck = isCheck;}

    public Integer getIsCheck(){return this.isCheck;}

    public void setNeedIdcard(Integer needIdcard){this.needIdcard = needIdcard;}

    public Integer getNeedIdcard(){return this.needIdcard;}

    public void setIsBonus(Integer isBonus){this.isBonus = isBonus;}

    public Integer getIsBonus(){return this.isBonus;}

    public void setSecondaryTitle(String secondaryTitle){this.secondaryTitle = secondaryTitle;}

    public String getSecondaryTitle(){return this.secondaryTitle;}

    public void setTag(String tag){this.tag = tag;}

    public String getTag(){return this.tag;}

    public void setShippingFee(java.math.BigDecimal shippingFee){this.shippingFee = shippingFee;}

    public java.math.BigDecimal getShippingFee(){return this.shippingFee;}

    public void setProductionPlace(String productionPlace){this.productionPlace = productionPlace;}

    public String getProductionPlace(){return this.productionPlace;}

    public void setGoodsImg1(String goodsImg1){this.goodsImg1 = goodsImg1;}

    public String getGoodsImg1(){return this.goodsImg1;}

    public void setGoodsImg2(String goodsImg2){this.goodsImg2 = goodsImg2;}

    public String getGoodsImg2(){return this.goodsImg2;}

    public void setGoodsImg3(String goodsImg3){this.goodsImg3 = goodsImg3;}

    public String getGoodsImg3(){return this.goodsImg3;}

    public void setGoodsImg4(String goodsImg4){this.goodsImg4 = goodsImg4;}

    public String getGoodsImg4(){return this.goodsImg4;}

    public void setGoodsImg5(String goodsImg5){this.goodsImg5 = goodsImg5;}

    public String getGoodsImg5(){return this.goodsImg5;}

    public void setGoodsImg6(String goodsImg6){this.goodsImg6 = goodsImg6;}

    public String getGoodsImg6(){return this.goodsImg6;}

    public void setSuppliers(String suppliers){this.suppliers = suppliers;}

    public String getSuppliers(){return this.suppliers;}

    public void setIsShowDesc(String isShowDesc){this.isShowDesc = isShowDesc;}

    public String getIsShowDesc(){return this.isShowDesc;}

    public void setDescription(String description){this.description = description;}

    public String getDescription(){return this.description;}

    public void setSpecification1Name(String specification1Name){this.specification1Name = specification1Name;}

    public String getSpecification1Name(){return this.specification1Name;}

    public void setSpecification1Price(java.math.BigDecimal specification1Price){this.specification1Price = specification1Price;}

    public java.math.BigDecimal getSpecification1Price(){return this.specification1Price;}

    public void setSpecification1ConsumeNum(Integer specification1ConsumeNum){this.specification1ConsumeNum = specification1ConsumeNum;}

    public Integer getSpecification1ConsumeNum(){return this.specification1ConsumeNum;}

    public void setSpecification2Name(String specification2Name){this.specification2Name = specification2Name;}

    public String getSpecification2Name(){return this.specification2Name;}

    public void setSpecification2Price(java.math.BigDecimal specification2Price){this.specification2Price = specification2Price;}

    public java.math.BigDecimal getSpecification2Price(){return this.specification2Price;}

    public void setSpecification2ConsumeNum(Integer specification2ConsumeNum){this.specification2ConsumeNum = specification2ConsumeNum;}

    public Integer getSpecification2ConsumeNum(){return this.specification2ConsumeNum;}

    public void setSpecification3Name(String specification3Name){this.specification3Name = specification3Name;}

    public String getSpecification3Name(){return this.specification3Name;}

    public void setSpecification3Price(java.math.BigDecimal specification3Price){this.specification3Price = specification3Price;}

    public java.math.BigDecimal getSpecification3Price(){return this.specification3Price;}

    public void setSpecification3ConsumeNum(Integer specification3ConsumeNum){this.specification3ConsumeNum = specification3ConsumeNum;}

    public Integer getSpecification3ConsumeNum(){return this.specification3ConsumeNum;}

    public void setSpecification4Name(String specification4Name){this.specification4Name = specification4Name;}

    public String getSpecification4Name(){return this.specification4Name;}

    public void setSpecification4Price(java.math.BigDecimal specification4Price){this.specification4Price = specification4Price;}

    public java.math.BigDecimal getSpecification4Price(){return this.specification4Price;}

    public void setSpecification4ConsumeNum(Integer specification4ConsumeNum){this.specification4ConsumeNum = specification4ConsumeNum;}

    public Integer getSpecification4ConsumeNum(){return this.specification4ConsumeNum;}

    public void setSpecification5Name(String specification5Name){this.specification5Name = specification5Name;}

    public String getSpecification5Name(){return this.specification5Name;}

    public void setSpecification5Price(java.math.BigDecimal specification5Price){this.specification5Price = specification5Price;}

    public java.math.BigDecimal getSpecification5Price(){return this.specification5Price;}

    public void setSpecification5ConsumeNum(Integer specification5ConsumeNum){this.specification5ConsumeNum = specification5ConsumeNum;}

    public Integer getSpecification5ConsumeNum(){return this.specification5ConsumeNum;}

    public void setSpecification6Name(String specification6Name){this.specification6Name = specification6Name;}

    public String getSpecification6Name(){return this.specification6Name;}

    public void setSpecification6Price(java.math.BigDecimal specification6Price){this.specification6Price = specification6Price;}

    public java.math.BigDecimal getSpecification6Price(){return this.specification6Price;}

    public void setSpecification6ConsumeNum(Integer specification6ConsumeNum){this.specification6ConsumeNum = specification6ConsumeNum;}

    public Integer getSpecification6ConsumeNum(){return this.specification6ConsumeNum;}

    public void setSpecification7Name(String specification7Name){this.specification7Name = specification7Name;}

    public String getSpecification7Name(){return this.specification7Name;}

    public void setSpecification7Price(java.math.BigDecimal specification7Price){this.specification7Price = specification7Price;}

    public java.math.BigDecimal getSpecification7Price(){return this.specification7Price;}

    public void setSpecification7ConsumeNum(Integer specification7ConsumeNum){this.specification7ConsumeNum = specification7ConsumeNum;}

    public Integer getSpecification7ConsumeNum(){return this.specification7ConsumeNum;}

    public void setSpecification8Name(String specification8Name){this.specification8Name = specification8Name;}

    public String getSpecification8Name(){return this.specification8Name;}

    public void setSpecification8Price(java.math.BigDecimal specification8Price){this.specification8Price = specification8Price;}

    public java.math.BigDecimal getSpecification8Price(){return this.specification8Price;}

    public void setSpecification8ConsumeNum(Integer specification8ConsumeNum){this.specification8ConsumeNum = specification8ConsumeNum;}

    public Integer getSpecification8ConsumeNum(){return this.specification8ConsumeNum;}
    @Override
    public String toString() {
        return "EcsGoods{" +
                "goodsId='" + goodsId + '\'' +
                "catId='" + catId + '\'' +
                "goodsSn='" + goodsSn + '\'' +
                "goodsName='" + goodsName + '\'' +
                "goodsNameStyle='" + goodsNameStyle + '\'' +
                "clickCount='" + clickCount + '\'' +
                "brandId='" + brandId + '\'' +
                "providerName='" + providerName + '\'' +
                "goodsNumber='" + goodsNumber + '\'' +
                "goodsWeight='" + goodsWeight + '\'' +
                "marketPrice='" + marketPrice + '\'' +
                "virtualSales='" + virtualSales + '\'' +
                "shopPrice='" + shopPrice + '\'' +
                "promotePrice='" + promotePrice + '\'' +
                "promoteStartDate='" + promoteStartDate + '\'' +
                "promoteEndDate='" + promoteEndDate + '\'' +
                "warnNumber='" + warnNumber + '\'' +
                "keywords='" + keywords + '\'' +
                "goodsBrief='" + goodsBrief + '\'' +
                "goodsDesc='" + goodsDesc + '\'' +
                "goodsThumb='" + goodsThumb + '\'' +
                "goodsImg='" + goodsImg + '\'' +
                "originalImg='" + originalImg + '\'' +
                "isReal='" + isReal + '\'' +
                "extensionCode='" + extensionCode + '\'' +
                "isOnSale='" + isOnSale + '\'' +
                "isAloneSale='" + isAloneSale + '\'' +
                "isShipping='" + isShipping + '\'' +
                "integral='" + integral + '\'' +
                "addTime='" + addTime + '\'' +
                "sortOrder='" + sortOrder + '\'' +
                "isDelete='" + isDelete + '\'' +
                "isBest='" + isBest + '\'' +
                "isNew='" + isNew + '\'' +
                "isHot='" + isHot + '\'' +
                "isPromote='" + isPromote + '\'' +
                "bonusTypeId='" + bonusTypeId + '\'' +
                "lastUpdate='" + lastUpdate + '\'' +
                "goodsType='" + goodsType + '\'' +
                "sellerNote='" + sellerNote + '\'' +
                "giveIntegral='" + giveIntegral + '\'' +
                "rankIntegral='" + rankIntegral + '\'' +
                "suppliersId='" + suppliersId + '\'' +
                "isCheck='" + isCheck + '\'' +
                "needIdcard='" + needIdcard + '\'' +
                "isBonus='" + isBonus + '\'' +
                "secondaryTitle='" + secondaryTitle + '\'' +
                "tag='" + tag + '\'' +
                "shippingFee='" + shippingFee + '\'' +
                "productionPlace='" + productionPlace + '\'' +
                "goodsImg1='" + goodsImg1 + '\'' +
                "goodsImg2='" + goodsImg2 + '\'' +
                "goodsImg3='" + goodsImg3 + '\'' +
                "goodsImg4='" + goodsImg4 + '\'' +
                "goodsImg5='" + goodsImg5 + '\'' +
                "goodsImg6='" + goodsImg6 + '\'' +
                "suppliers='" + suppliers + '\'' +
                "isShowDesc='" + isShowDesc + '\'' +
                "description='" + description + '\'' +
                "specification1Name='" + specification1Name + '\'' +
                "specification1Price='" + specification1Price + '\'' +
                "specification1ConsumeNum='" + specification1ConsumeNum + '\'' +
                "specification2Name='" + specification2Name + '\'' +
                "specification2Price='" + specification2Price + '\'' +
                "specification2ConsumeNum='" + specification2ConsumeNum + '\'' +
                "specification3Name='" + specification3Name + '\'' +
                "specification3Price='" + specification3Price + '\'' +
                "specification3ConsumeNum='" + specification3ConsumeNum + '\'' +
                "specification4Name='" + specification4Name + '\'' +
                "specification4Price='" + specification4Price + '\'' +
                "specification4ConsumeNum='" + specification4ConsumeNum + '\'' +
                "specification5Name='" + specification5Name + '\'' +
                "specification5Price='" + specification5Price + '\'' +
                "specification5ConsumeNum='" + specification5ConsumeNum + '\'' +
                "specification6Name='" + specification6Name + '\'' +
                "specification6Price='" + specification6Price + '\'' +
                "specification6ConsumeNum='" + specification6ConsumeNum + '\'' +
                "specification7Name='" + specification7Name + '\'' +
                "specification7Price='" + specification7Price + '\'' +
                "specification7ConsumeNum='" + specification7ConsumeNum + '\'' +
                "specification8Name='" + specification8Name + '\'' +
                "specification8Price='" + specification8Price + '\'' +
                "specification8ConsumeNum='" + specification8ConsumeNum + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private EcsGoods set;

        private ConditionBuilder where;

        public UpdateBuilder set(EcsGoods set){
            this.set = set;
            return this;
        }

        public EcsGoods getSet(){
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

    public static class QueryBuilder extends EcsGoods{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<Integer> catIdList;

        public List<Integer> getCatIdList(){return this.catIdList;}

        private Integer catIdSt;

        private Integer catIdEd;

        public Integer getCatIdSt(){return this.catIdSt;}

        public Integer getCatIdEd(){return this.catIdEd;}

        private List<String> goodsSnList;

        public List<String> getGoodsSnList(){return this.goodsSnList;}


        private List<String> fuzzyGoodsSn;

        public List<String> getFuzzyGoodsSn(){return this.fuzzyGoodsSn;}

        private List<String> rightFuzzyGoodsSn;

        public List<String> getRightFuzzyGoodsSn(){return this.rightFuzzyGoodsSn;}
        private List<String> goodsNameList;

        public List<String> getGoodsNameList(){return this.goodsNameList;}


        private List<String> fuzzyGoodsName;

        public List<String> getFuzzyGoodsName(){return this.fuzzyGoodsName;}

        private List<String> rightFuzzyGoodsName;

        public List<String> getRightFuzzyGoodsName(){return this.rightFuzzyGoodsName;}
        private List<String> goodsNameStyleList;

        public List<String> getGoodsNameStyleList(){return this.goodsNameStyleList;}


        private List<String> fuzzyGoodsNameStyle;

        public List<String> getFuzzyGoodsNameStyle(){return this.fuzzyGoodsNameStyle;}

        private List<String> rightFuzzyGoodsNameStyle;

        public List<String> getRightFuzzyGoodsNameStyle(){return this.rightFuzzyGoodsNameStyle;}
        private List<Integer> clickCountList;

        public List<Integer> getClickCountList(){return this.clickCountList;}

        private Integer clickCountSt;

        private Integer clickCountEd;

        public Integer getClickCountSt(){return this.clickCountSt;}

        public Integer getClickCountEd(){return this.clickCountEd;}

        private List<Integer> brandIdList;

        public List<Integer> getBrandIdList(){return this.brandIdList;}

        private Integer brandIdSt;

        private Integer brandIdEd;

        public Integer getBrandIdSt(){return this.brandIdSt;}

        public Integer getBrandIdEd(){return this.brandIdEd;}

        private List<String> providerNameList;

        public List<String> getProviderNameList(){return this.providerNameList;}


        private List<String> fuzzyProviderName;

        public List<String> getFuzzyProviderName(){return this.fuzzyProviderName;}

        private List<String> rightFuzzyProviderName;

        public List<String> getRightFuzzyProviderName(){return this.rightFuzzyProviderName;}
        private List<Integer> goodsNumberList;

        public List<Integer> getGoodsNumberList(){return this.goodsNumberList;}

        private Integer goodsNumberSt;

        private Integer goodsNumberEd;

        public Integer getGoodsNumberSt(){return this.goodsNumberSt;}

        public Integer getGoodsNumberEd(){return this.goodsNumberEd;}

        private List<java.math.BigDecimal> goodsWeightList;

        public List<java.math.BigDecimal> getGoodsWeightList(){return this.goodsWeightList;}

        private java.math.BigDecimal goodsWeightSt;

        private java.math.BigDecimal goodsWeightEd;

        public java.math.BigDecimal getGoodsWeightSt(){return this.goodsWeightSt;}

        public java.math.BigDecimal getGoodsWeightEd(){return this.goodsWeightEd;}

        private List<java.math.BigDecimal> marketPriceList;

        public List<java.math.BigDecimal> getMarketPriceList(){return this.marketPriceList;}

        private java.math.BigDecimal marketPriceSt;

        private java.math.BigDecimal marketPriceEd;

        public java.math.BigDecimal getMarketPriceSt(){return this.marketPriceSt;}

        public java.math.BigDecimal getMarketPriceEd(){return this.marketPriceEd;}

        private List<Integer> virtualSalesList;

        public List<Integer> getVirtualSalesList(){return this.virtualSalesList;}

        private Integer virtualSalesSt;

        private Integer virtualSalesEd;

        public Integer getVirtualSalesSt(){return this.virtualSalesSt;}

        public Integer getVirtualSalesEd(){return this.virtualSalesEd;}

        private List<java.math.BigDecimal> shopPriceList;

        public List<java.math.BigDecimal> getShopPriceList(){return this.shopPriceList;}

        private java.math.BigDecimal shopPriceSt;

        private java.math.BigDecimal shopPriceEd;

        public java.math.BigDecimal getShopPriceSt(){return this.shopPriceSt;}

        public java.math.BigDecimal getShopPriceEd(){return this.shopPriceEd;}

        private List<java.math.BigDecimal> promotePriceList;

        public List<java.math.BigDecimal> getPromotePriceList(){return this.promotePriceList;}

        private java.math.BigDecimal promotePriceSt;

        private java.math.BigDecimal promotePriceEd;

        public java.math.BigDecimal getPromotePriceSt(){return this.promotePriceSt;}

        public java.math.BigDecimal getPromotePriceEd(){return this.promotePriceEd;}

        private List<Integer> promoteStartDateList;

        public List<Integer> getPromoteStartDateList(){return this.promoteStartDateList;}

        private Integer promoteStartDateSt;

        private Integer promoteStartDateEd;

        public Integer getPromoteStartDateSt(){return this.promoteStartDateSt;}

        public Integer getPromoteStartDateEd(){return this.promoteStartDateEd;}

        private List<Integer> promoteEndDateList;

        public List<Integer> getPromoteEndDateList(){return this.promoteEndDateList;}

        private Integer promoteEndDateSt;

        private Integer promoteEndDateEd;

        public Integer getPromoteEndDateSt(){return this.promoteEndDateSt;}

        public Integer getPromoteEndDateEd(){return this.promoteEndDateEd;}

        private List<String> warnNumberList;

        public List<String> getWarnNumberList(){return this.warnNumberList;}


        private List<String> fuzzyWarnNumber;

        public List<String> getFuzzyWarnNumber(){return this.fuzzyWarnNumber;}

        private List<String> rightFuzzyWarnNumber;

        public List<String> getRightFuzzyWarnNumber(){return this.rightFuzzyWarnNumber;}
        private List<String> keywordsList;

        public List<String> getKeywordsList(){return this.keywordsList;}


        private List<String> fuzzyKeywords;

        public List<String> getFuzzyKeywords(){return this.fuzzyKeywords;}

        private List<String> rightFuzzyKeywords;

        public List<String> getRightFuzzyKeywords(){return this.rightFuzzyKeywords;}
        private List<String> goodsBriefList;

        public List<String> getGoodsBriefList(){return this.goodsBriefList;}


        private List<String> fuzzyGoodsBrief;

        public List<String> getFuzzyGoodsBrief(){return this.fuzzyGoodsBrief;}

        private List<String> rightFuzzyGoodsBrief;

        public List<String> getRightFuzzyGoodsBrief(){return this.rightFuzzyGoodsBrief;}
        private List<String> goodsDescList;

        public List<String> getGoodsDescList(){return this.goodsDescList;}


        private List<String> fuzzyGoodsDesc;

        public List<String> getFuzzyGoodsDesc(){return this.fuzzyGoodsDesc;}

        private List<String> rightFuzzyGoodsDesc;

        public List<String> getRightFuzzyGoodsDesc(){return this.rightFuzzyGoodsDesc;}
        private List<String> goodsThumbList;

        public List<String> getGoodsThumbList(){return this.goodsThumbList;}


        private List<String> fuzzyGoodsThumb;

        public List<String> getFuzzyGoodsThumb(){return this.fuzzyGoodsThumb;}

        private List<String> rightFuzzyGoodsThumb;

        public List<String> getRightFuzzyGoodsThumb(){return this.rightFuzzyGoodsThumb;}
        private List<String> goodsImgList;

        public List<String> getGoodsImgList(){return this.goodsImgList;}


        private List<String> fuzzyGoodsImg;

        public List<String> getFuzzyGoodsImg(){return this.fuzzyGoodsImg;}

        private List<String> rightFuzzyGoodsImg;

        public List<String> getRightFuzzyGoodsImg(){return this.rightFuzzyGoodsImg;}
        private List<String> originalImgList;

        public List<String> getOriginalImgList(){return this.originalImgList;}


        private List<String> fuzzyOriginalImg;

        public List<String> getFuzzyOriginalImg(){return this.fuzzyOriginalImg;}

        private List<String> rightFuzzyOriginalImg;

        public List<String> getRightFuzzyOriginalImg(){return this.rightFuzzyOriginalImg;}
        private List<Integer> isRealList;

        public List<Integer> getIsRealList(){return this.isRealList;}

        private Integer isRealSt;

        private Integer isRealEd;

        public Integer getIsRealSt(){return this.isRealSt;}

        public Integer getIsRealEd(){return this.isRealEd;}

        private List<String> extensionCodeList;

        public List<String> getExtensionCodeList(){return this.extensionCodeList;}


        private List<String> fuzzyExtensionCode;

        public List<String> getFuzzyExtensionCode(){return this.fuzzyExtensionCode;}

        private List<String> rightFuzzyExtensionCode;

        public List<String> getRightFuzzyExtensionCode(){return this.rightFuzzyExtensionCode;}
        private List<Integer> isOnSaleList;

        public List<Integer> getIsOnSaleList(){return this.isOnSaleList;}

        private Integer isOnSaleSt;

        private Integer isOnSaleEd;

        public Integer getIsOnSaleSt(){return this.isOnSaleSt;}

        public Integer getIsOnSaleEd(){return this.isOnSaleEd;}

        private List<Integer> isAloneSaleList;

        public List<Integer> getIsAloneSaleList(){return this.isAloneSaleList;}

        private Integer isAloneSaleSt;

        private Integer isAloneSaleEd;

        public Integer getIsAloneSaleSt(){return this.isAloneSaleSt;}

        public Integer getIsAloneSaleEd(){return this.isAloneSaleEd;}

        private List<Integer> isShippingList;

        public List<Integer> getIsShippingList(){return this.isShippingList;}

        private Integer isShippingSt;

        private Integer isShippingEd;

        public Integer getIsShippingSt(){return this.isShippingSt;}

        public Integer getIsShippingEd(){return this.isShippingEd;}

        private List<Integer> integralList;

        public List<Integer> getIntegralList(){return this.integralList;}

        private Integer integralSt;

        private Integer integralEd;

        public Integer getIntegralSt(){return this.integralSt;}

        public Integer getIntegralEd(){return this.integralEd;}

        private List<Integer> addTimeList;

        public List<Integer> getAddTimeList(){return this.addTimeList;}

        private Integer addTimeSt;

        private Integer addTimeEd;

        public Integer getAddTimeSt(){return this.addTimeSt;}

        public Integer getAddTimeEd(){return this.addTimeEd;}

        private List<Integer> sortOrderList;

        public List<Integer> getSortOrderList(){return this.sortOrderList;}

        private Integer sortOrderSt;

        private Integer sortOrderEd;

        public Integer getSortOrderSt(){return this.sortOrderSt;}

        public Integer getSortOrderEd(){return this.sortOrderEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Integer> isBestList;

        public List<Integer> getIsBestList(){return this.isBestList;}

        private Integer isBestSt;

        private Integer isBestEd;

        public Integer getIsBestSt(){return this.isBestSt;}

        public Integer getIsBestEd(){return this.isBestEd;}

        private List<Integer> isNewList;

        public List<Integer> getIsNewList(){return this.isNewList;}

        private Integer isNewSt;

        private Integer isNewEd;

        public Integer getIsNewSt(){return this.isNewSt;}

        public Integer getIsNewEd(){return this.isNewEd;}

        private List<Integer> isHotList;

        public List<Integer> getIsHotList(){return this.isHotList;}

        private Integer isHotSt;

        private Integer isHotEd;

        public Integer getIsHotSt(){return this.isHotSt;}

        public Integer getIsHotEd(){return this.isHotEd;}

        private List<Integer> isPromoteList;

        public List<Integer> getIsPromoteList(){return this.isPromoteList;}

        private Integer isPromoteSt;

        private Integer isPromoteEd;

        public Integer getIsPromoteSt(){return this.isPromoteSt;}

        public Integer getIsPromoteEd(){return this.isPromoteEd;}

        private List<Integer> bonusTypeIdList;

        public List<Integer> getBonusTypeIdList(){return this.bonusTypeIdList;}

        private Integer bonusTypeIdSt;

        private Integer bonusTypeIdEd;

        public Integer getBonusTypeIdSt(){return this.bonusTypeIdSt;}

        public Integer getBonusTypeIdEd(){return this.bonusTypeIdEd;}

        private List<Integer> lastUpdateList;

        public List<Integer> getLastUpdateList(){return this.lastUpdateList;}

        private Integer lastUpdateSt;

        private Integer lastUpdateEd;

        public Integer getLastUpdateSt(){return this.lastUpdateSt;}

        public Integer getLastUpdateEd(){return this.lastUpdateEd;}

        private List<Integer> goodsTypeList;

        public List<Integer> getGoodsTypeList(){return this.goodsTypeList;}

        private Integer goodsTypeSt;

        private Integer goodsTypeEd;

        public Integer getGoodsTypeSt(){return this.goodsTypeSt;}

        public Integer getGoodsTypeEd(){return this.goodsTypeEd;}

        private List<String> sellerNoteList;

        public List<String> getSellerNoteList(){return this.sellerNoteList;}


        private List<String> fuzzySellerNote;

        public List<String> getFuzzySellerNote(){return this.fuzzySellerNote;}

        private List<String> rightFuzzySellerNote;

        public List<String> getRightFuzzySellerNote(){return this.rightFuzzySellerNote;}
        private List<Integer> giveIntegralList;

        public List<Integer> getGiveIntegralList(){return this.giveIntegralList;}

        private Integer giveIntegralSt;

        private Integer giveIntegralEd;

        public Integer getGiveIntegralSt(){return this.giveIntegralSt;}

        public Integer getGiveIntegralEd(){return this.giveIntegralEd;}

        private List<Integer> rankIntegralList;

        public List<Integer> getRankIntegralList(){return this.rankIntegralList;}

        private Integer rankIntegralSt;

        private Integer rankIntegralEd;

        public Integer getRankIntegralSt(){return this.rankIntegralSt;}

        public Integer getRankIntegralEd(){return this.rankIntegralEd;}

        private List<Integer> suppliersIdList;

        public List<Integer> getSuppliersIdList(){return this.suppliersIdList;}

        private Integer suppliersIdSt;

        private Integer suppliersIdEd;

        public Integer getSuppliersIdSt(){return this.suppliersIdSt;}

        public Integer getSuppliersIdEd(){return this.suppliersIdEd;}

        private List<Integer> isCheckList;

        public List<Integer> getIsCheckList(){return this.isCheckList;}

        private Integer isCheckSt;

        private Integer isCheckEd;

        public Integer getIsCheckSt(){return this.isCheckSt;}

        public Integer getIsCheckEd(){return this.isCheckEd;}

        private List<Integer> needIdcardList;

        public List<Integer> getNeedIdcardList(){return this.needIdcardList;}

        private Integer needIdcardSt;

        private Integer needIdcardEd;

        public Integer getNeedIdcardSt(){return this.needIdcardSt;}

        public Integer getNeedIdcardEd(){return this.needIdcardEd;}

        private List<Integer> isBonusList;

        public List<Integer> getIsBonusList(){return this.isBonusList;}

        private Integer isBonusSt;

        private Integer isBonusEd;

        public Integer getIsBonusSt(){return this.isBonusSt;}

        public Integer getIsBonusEd(){return this.isBonusEd;}

        private List<String> secondaryTitleList;

        public List<String> getSecondaryTitleList(){return this.secondaryTitleList;}


        private List<String> fuzzySecondaryTitle;

        public List<String> getFuzzySecondaryTitle(){return this.fuzzySecondaryTitle;}

        private List<String> rightFuzzySecondaryTitle;

        public List<String> getRightFuzzySecondaryTitle(){return this.rightFuzzySecondaryTitle;}
        private List<String> tagList;

        public List<String> getTagList(){return this.tagList;}


        private List<String> fuzzyTag;

        public List<String> getFuzzyTag(){return this.fuzzyTag;}

        private List<String> rightFuzzyTag;

        public List<String> getRightFuzzyTag(){return this.rightFuzzyTag;}
        private List<java.math.BigDecimal> shippingFeeList;

        public List<java.math.BigDecimal> getShippingFeeList(){return this.shippingFeeList;}

        private java.math.BigDecimal shippingFeeSt;

        private java.math.BigDecimal shippingFeeEd;

        public java.math.BigDecimal getShippingFeeSt(){return this.shippingFeeSt;}

        public java.math.BigDecimal getShippingFeeEd(){return this.shippingFeeEd;}

        private List<String> productionPlaceList;

        public List<String> getProductionPlaceList(){return this.productionPlaceList;}


        private List<String> fuzzyProductionPlace;

        public List<String> getFuzzyProductionPlace(){return this.fuzzyProductionPlace;}

        private List<String> rightFuzzyProductionPlace;

        public List<String> getRightFuzzyProductionPlace(){return this.rightFuzzyProductionPlace;}
        private List<String> goodsImg1List;

        public List<String> getGoodsImg1List(){return this.goodsImg1List;}


        private List<String> fuzzyGoodsImg1;

        public List<String> getFuzzyGoodsImg1(){return this.fuzzyGoodsImg1;}

        private List<String> rightFuzzyGoodsImg1;

        public List<String> getRightFuzzyGoodsImg1(){return this.rightFuzzyGoodsImg1;}
        private List<String> goodsImg2List;

        public List<String> getGoodsImg2List(){return this.goodsImg2List;}


        private List<String> fuzzyGoodsImg2;

        public List<String> getFuzzyGoodsImg2(){return this.fuzzyGoodsImg2;}

        private List<String> rightFuzzyGoodsImg2;

        public List<String> getRightFuzzyGoodsImg2(){return this.rightFuzzyGoodsImg2;}
        private List<String> goodsImg3List;

        public List<String> getGoodsImg3List(){return this.goodsImg3List;}


        private List<String> fuzzyGoodsImg3;

        public List<String> getFuzzyGoodsImg3(){return this.fuzzyGoodsImg3;}

        private List<String> rightFuzzyGoodsImg3;

        public List<String> getRightFuzzyGoodsImg3(){return this.rightFuzzyGoodsImg3;}
        private List<String> goodsImg4List;

        public List<String> getGoodsImg4List(){return this.goodsImg4List;}


        private List<String> fuzzyGoodsImg4;

        public List<String> getFuzzyGoodsImg4(){return this.fuzzyGoodsImg4;}

        private List<String> rightFuzzyGoodsImg4;

        public List<String> getRightFuzzyGoodsImg4(){return this.rightFuzzyGoodsImg4;}
        private List<String> goodsImg5List;

        public List<String> getGoodsImg5List(){return this.goodsImg5List;}


        private List<String> fuzzyGoodsImg5;

        public List<String> getFuzzyGoodsImg5(){return this.fuzzyGoodsImg5;}

        private List<String> rightFuzzyGoodsImg5;

        public List<String> getRightFuzzyGoodsImg5(){return this.rightFuzzyGoodsImg5;}
        private List<String> goodsImg6List;

        public List<String> getGoodsImg6List(){return this.goodsImg6List;}


        private List<String> fuzzyGoodsImg6;

        public List<String> getFuzzyGoodsImg6(){return this.fuzzyGoodsImg6;}

        private List<String> rightFuzzyGoodsImg6;

        public List<String> getRightFuzzyGoodsImg6(){return this.rightFuzzyGoodsImg6;}
        private List<String> suppliersList;

        public List<String> getSuppliersList(){return this.suppliersList;}


        private List<String> fuzzySuppliers;

        public List<String> getFuzzySuppliers(){return this.fuzzySuppliers;}

        private List<String> rightFuzzySuppliers;

        public List<String> getRightFuzzySuppliers(){return this.rightFuzzySuppliers;}
        private List<String> isShowDescList;

        public List<String> getIsShowDescList(){return this.isShowDescList;}


        private List<String> fuzzyIsShowDesc;

        public List<String> getFuzzyIsShowDesc(){return this.fuzzyIsShowDesc;}

        private List<String> rightFuzzyIsShowDesc;

        public List<String> getRightFuzzyIsShowDesc(){return this.rightFuzzyIsShowDesc;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> specification1NameList;

        public List<String> getSpecification1NameList(){return this.specification1NameList;}


        private List<String> fuzzySpecification1Name;

        public List<String> getFuzzySpecification1Name(){return this.fuzzySpecification1Name;}

        private List<String> rightFuzzySpecification1Name;

        public List<String> getRightFuzzySpecification1Name(){return this.rightFuzzySpecification1Name;}
        private List<java.math.BigDecimal> specification1PriceList;

        public List<java.math.BigDecimal> getSpecification1PriceList(){return this.specification1PriceList;}

        private java.math.BigDecimal specification1PriceSt;

        private java.math.BigDecimal specification1PriceEd;

        public java.math.BigDecimal getSpecification1PriceSt(){return this.specification1PriceSt;}

        public java.math.BigDecimal getSpecification1PriceEd(){return this.specification1PriceEd;}

        private List<Integer> specification1ConsumeNumList;

        public List<Integer> getSpecification1ConsumeNumList(){return this.specification1ConsumeNumList;}

        private Integer specification1ConsumeNumSt;

        private Integer specification1ConsumeNumEd;

        public Integer getSpecification1ConsumeNumSt(){return this.specification1ConsumeNumSt;}

        public Integer getSpecification1ConsumeNumEd(){return this.specification1ConsumeNumEd;}

        private List<String> specification2NameList;

        public List<String> getSpecification2NameList(){return this.specification2NameList;}


        private List<String> fuzzySpecification2Name;

        public List<String> getFuzzySpecification2Name(){return this.fuzzySpecification2Name;}

        private List<String> rightFuzzySpecification2Name;

        public List<String> getRightFuzzySpecification2Name(){return this.rightFuzzySpecification2Name;}
        private List<java.math.BigDecimal> specification2PriceList;

        public List<java.math.BigDecimal> getSpecification2PriceList(){return this.specification2PriceList;}

        private java.math.BigDecimal specification2PriceSt;

        private java.math.BigDecimal specification2PriceEd;

        public java.math.BigDecimal getSpecification2PriceSt(){return this.specification2PriceSt;}

        public java.math.BigDecimal getSpecification2PriceEd(){return this.specification2PriceEd;}

        private List<Integer> specification2ConsumeNumList;

        public List<Integer> getSpecification2ConsumeNumList(){return this.specification2ConsumeNumList;}

        private Integer specification2ConsumeNumSt;

        private Integer specification2ConsumeNumEd;

        public Integer getSpecification2ConsumeNumSt(){return this.specification2ConsumeNumSt;}

        public Integer getSpecification2ConsumeNumEd(){return this.specification2ConsumeNumEd;}

        private List<String> specification3NameList;

        public List<String> getSpecification3NameList(){return this.specification3NameList;}


        private List<String> fuzzySpecification3Name;

        public List<String> getFuzzySpecification3Name(){return this.fuzzySpecification3Name;}

        private List<String> rightFuzzySpecification3Name;

        public List<String> getRightFuzzySpecification3Name(){return this.rightFuzzySpecification3Name;}
        private List<java.math.BigDecimal> specification3PriceList;

        public List<java.math.BigDecimal> getSpecification3PriceList(){return this.specification3PriceList;}

        private java.math.BigDecimal specification3PriceSt;

        private java.math.BigDecimal specification3PriceEd;

        public java.math.BigDecimal getSpecification3PriceSt(){return this.specification3PriceSt;}

        public java.math.BigDecimal getSpecification3PriceEd(){return this.specification3PriceEd;}

        private List<Integer> specification3ConsumeNumList;

        public List<Integer> getSpecification3ConsumeNumList(){return this.specification3ConsumeNumList;}

        private Integer specification3ConsumeNumSt;

        private Integer specification3ConsumeNumEd;

        public Integer getSpecification3ConsumeNumSt(){return this.specification3ConsumeNumSt;}

        public Integer getSpecification3ConsumeNumEd(){return this.specification3ConsumeNumEd;}

        private List<String> specification4NameList;

        public List<String> getSpecification4NameList(){return this.specification4NameList;}


        private List<String> fuzzySpecification4Name;

        public List<String> getFuzzySpecification4Name(){return this.fuzzySpecification4Name;}

        private List<String> rightFuzzySpecification4Name;

        public List<String> getRightFuzzySpecification4Name(){return this.rightFuzzySpecification4Name;}
        private List<java.math.BigDecimal> specification4PriceList;

        public List<java.math.BigDecimal> getSpecification4PriceList(){return this.specification4PriceList;}

        private java.math.BigDecimal specification4PriceSt;

        private java.math.BigDecimal specification4PriceEd;

        public java.math.BigDecimal getSpecification4PriceSt(){return this.specification4PriceSt;}

        public java.math.BigDecimal getSpecification4PriceEd(){return this.specification4PriceEd;}

        private List<Integer> specification4ConsumeNumList;

        public List<Integer> getSpecification4ConsumeNumList(){return this.specification4ConsumeNumList;}

        private Integer specification4ConsumeNumSt;

        private Integer specification4ConsumeNumEd;

        public Integer getSpecification4ConsumeNumSt(){return this.specification4ConsumeNumSt;}

        public Integer getSpecification4ConsumeNumEd(){return this.specification4ConsumeNumEd;}

        private List<String> specification5NameList;

        public List<String> getSpecification5NameList(){return this.specification5NameList;}


        private List<String> fuzzySpecification5Name;

        public List<String> getFuzzySpecification5Name(){return this.fuzzySpecification5Name;}

        private List<String> rightFuzzySpecification5Name;

        public List<String> getRightFuzzySpecification5Name(){return this.rightFuzzySpecification5Name;}
        private List<java.math.BigDecimal> specification5PriceList;

        public List<java.math.BigDecimal> getSpecification5PriceList(){return this.specification5PriceList;}

        private java.math.BigDecimal specification5PriceSt;

        private java.math.BigDecimal specification5PriceEd;

        public java.math.BigDecimal getSpecification5PriceSt(){return this.specification5PriceSt;}

        public java.math.BigDecimal getSpecification5PriceEd(){return this.specification5PriceEd;}

        private List<Integer> specification5ConsumeNumList;

        public List<Integer> getSpecification5ConsumeNumList(){return this.specification5ConsumeNumList;}

        private Integer specification5ConsumeNumSt;

        private Integer specification5ConsumeNumEd;

        public Integer getSpecification5ConsumeNumSt(){return this.specification5ConsumeNumSt;}

        public Integer getSpecification5ConsumeNumEd(){return this.specification5ConsumeNumEd;}

        private List<String> specification6NameList;

        public List<String> getSpecification6NameList(){return this.specification6NameList;}


        private List<String> fuzzySpecification6Name;

        public List<String> getFuzzySpecification6Name(){return this.fuzzySpecification6Name;}

        private List<String> rightFuzzySpecification6Name;

        public List<String> getRightFuzzySpecification6Name(){return this.rightFuzzySpecification6Name;}
        private List<java.math.BigDecimal> specification6PriceList;

        public List<java.math.BigDecimal> getSpecification6PriceList(){return this.specification6PriceList;}

        private java.math.BigDecimal specification6PriceSt;

        private java.math.BigDecimal specification6PriceEd;

        public java.math.BigDecimal getSpecification6PriceSt(){return this.specification6PriceSt;}

        public java.math.BigDecimal getSpecification6PriceEd(){return this.specification6PriceEd;}

        private List<Integer> specification6ConsumeNumList;

        public List<Integer> getSpecification6ConsumeNumList(){return this.specification6ConsumeNumList;}

        private Integer specification6ConsumeNumSt;

        private Integer specification6ConsumeNumEd;

        public Integer getSpecification6ConsumeNumSt(){return this.specification6ConsumeNumSt;}

        public Integer getSpecification6ConsumeNumEd(){return this.specification6ConsumeNumEd;}

        private List<String> specification7NameList;

        public List<String> getSpecification7NameList(){return this.specification7NameList;}


        private List<String> fuzzySpecification7Name;

        public List<String> getFuzzySpecification7Name(){return this.fuzzySpecification7Name;}

        private List<String> rightFuzzySpecification7Name;

        public List<String> getRightFuzzySpecification7Name(){return this.rightFuzzySpecification7Name;}
        private List<java.math.BigDecimal> specification7PriceList;

        public List<java.math.BigDecimal> getSpecification7PriceList(){return this.specification7PriceList;}

        private java.math.BigDecimal specification7PriceSt;

        private java.math.BigDecimal specification7PriceEd;

        public java.math.BigDecimal getSpecification7PriceSt(){return this.specification7PriceSt;}

        public java.math.BigDecimal getSpecification7PriceEd(){return this.specification7PriceEd;}

        private List<Integer> specification7ConsumeNumList;

        public List<Integer> getSpecification7ConsumeNumList(){return this.specification7ConsumeNumList;}

        private Integer specification7ConsumeNumSt;

        private Integer specification7ConsumeNumEd;

        public Integer getSpecification7ConsumeNumSt(){return this.specification7ConsumeNumSt;}

        public Integer getSpecification7ConsumeNumEd(){return this.specification7ConsumeNumEd;}

        private List<String> specification8NameList;

        public List<String> getSpecification8NameList(){return this.specification8NameList;}


        private List<String> fuzzySpecification8Name;

        public List<String> getFuzzySpecification8Name(){return this.fuzzySpecification8Name;}

        private List<String> rightFuzzySpecification8Name;

        public List<String> getRightFuzzySpecification8Name(){return this.rightFuzzySpecification8Name;}
        private List<java.math.BigDecimal> specification8PriceList;

        public List<java.math.BigDecimal> getSpecification8PriceList(){return this.specification8PriceList;}

        private java.math.BigDecimal specification8PriceSt;

        private java.math.BigDecimal specification8PriceEd;

        public java.math.BigDecimal getSpecification8PriceSt(){return this.specification8PriceSt;}

        public java.math.BigDecimal getSpecification8PriceEd(){return this.specification8PriceEd;}

        private List<Integer> specification8ConsumeNumList;

        public List<Integer> getSpecification8ConsumeNumList(){return this.specification8ConsumeNumList;}

        private Integer specification8ConsumeNumSt;

        private Integer specification8ConsumeNumEd;

        public Integer getSpecification8ConsumeNumSt(){return this.specification8ConsumeNumSt;}

        public Integer getSpecification8ConsumeNumEd(){return this.specification8ConsumeNumEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder catIdBetWeen(Integer catIdSt,Integer catIdEd){
            this.catIdSt = catIdSt;
            this.catIdEd = catIdEd;
            return this;
        }

        public QueryBuilder catIdGreaterEqThan(Integer catIdSt){
            this.catIdSt = catIdSt;
            return this;
        }
        public QueryBuilder catIdLessEqThan(Integer catIdEd){
            this.catIdEd = catIdEd;
            return this;
        }


        public QueryBuilder catId(Integer catId){
            setCatId(catId);
            return this;
        }

        public QueryBuilder catIdList(Integer ... catId){
            this.catIdList = solveNullList(catId);
            return this;
        }

        public QueryBuilder catIdList(List<Integer> catId){
            this.catIdList = catId;
            return this;
        }

        public QueryBuilder fetchCatId(){
            setFetchFields("fetchFields","catId");
            return this;
        }

        public QueryBuilder excludeCatId(){
            setFetchFields("excludeFields","catId");
            return this;
        }

        public QueryBuilder fuzzyGoodsSn (List<String> fuzzyGoodsSn){
            this.fuzzyGoodsSn = fuzzyGoodsSn;
            return this;
        }

        public QueryBuilder fuzzyGoodsSn (String ... fuzzyGoodsSn){
            this.fuzzyGoodsSn = solveNullList(fuzzyGoodsSn);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsSn (List<String> rightFuzzyGoodsSn){
            this.rightFuzzyGoodsSn = rightFuzzyGoodsSn;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsSn (String ... rightFuzzyGoodsSn){
            this.rightFuzzyGoodsSn = solveNullList(rightFuzzyGoodsSn);
            return this;
        }

        public QueryBuilder goodsSn(String goodsSn){
            setGoodsSn(goodsSn);
            return this;
        }

        public QueryBuilder goodsSnList(String ... goodsSn){
            this.goodsSnList = solveNullList(goodsSn);
            return this;
        }

        public QueryBuilder goodsSnList(List<String> goodsSn){
            this.goodsSnList = goodsSn;
            return this;
        }

        public QueryBuilder fetchGoodsSn(){
            setFetchFields("fetchFields","goodsSn");
            return this;
        }

        public QueryBuilder excludeGoodsSn(){
            setFetchFields("excludeFields","goodsSn");
            return this;
        }

        public QueryBuilder fuzzyGoodsName (List<String> fuzzyGoodsName){
            this.fuzzyGoodsName = fuzzyGoodsName;
            return this;
        }

        public QueryBuilder fuzzyGoodsName (String ... fuzzyGoodsName){
            this.fuzzyGoodsName = solveNullList(fuzzyGoodsName);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsName (List<String> rightFuzzyGoodsName){
            this.rightFuzzyGoodsName = rightFuzzyGoodsName;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsName (String ... rightFuzzyGoodsName){
            this.rightFuzzyGoodsName = solveNullList(rightFuzzyGoodsName);
            return this;
        }

        public QueryBuilder goodsName(String goodsName){
            setGoodsName(goodsName);
            return this;
        }

        public QueryBuilder goodsNameList(String ... goodsName){
            this.goodsNameList = solveNullList(goodsName);
            return this;
        }

        public QueryBuilder goodsNameList(List<String> goodsName){
            this.goodsNameList = goodsName;
            return this;
        }

        public QueryBuilder fetchGoodsName(){
            setFetchFields("fetchFields","goodsName");
            return this;
        }

        public QueryBuilder excludeGoodsName(){
            setFetchFields("excludeFields","goodsName");
            return this;
        }

        public QueryBuilder fuzzyGoodsNameStyle (List<String> fuzzyGoodsNameStyle){
            this.fuzzyGoodsNameStyle = fuzzyGoodsNameStyle;
            return this;
        }

        public QueryBuilder fuzzyGoodsNameStyle (String ... fuzzyGoodsNameStyle){
            this.fuzzyGoodsNameStyle = solveNullList(fuzzyGoodsNameStyle);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsNameStyle (List<String> rightFuzzyGoodsNameStyle){
            this.rightFuzzyGoodsNameStyle = rightFuzzyGoodsNameStyle;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsNameStyle (String ... rightFuzzyGoodsNameStyle){
            this.rightFuzzyGoodsNameStyle = solveNullList(rightFuzzyGoodsNameStyle);
            return this;
        }

        public QueryBuilder goodsNameStyle(String goodsNameStyle){
            setGoodsNameStyle(goodsNameStyle);
            return this;
        }

        public QueryBuilder goodsNameStyleList(String ... goodsNameStyle){
            this.goodsNameStyleList = solveNullList(goodsNameStyle);
            return this;
        }

        public QueryBuilder goodsNameStyleList(List<String> goodsNameStyle){
            this.goodsNameStyleList = goodsNameStyle;
            return this;
        }

        public QueryBuilder fetchGoodsNameStyle(){
            setFetchFields("fetchFields","goodsNameStyle");
            return this;
        }

        public QueryBuilder excludeGoodsNameStyle(){
            setFetchFields("excludeFields","goodsNameStyle");
            return this;
        }

        public QueryBuilder clickCountBetWeen(Integer clickCountSt,Integer clickCountEd){
            this.clickCountSt = clickCountSt;
            this.clickCountEd = clickCountEd;
            return this;
        }

        public QueryBuilder clickCountGreaterEqThan(Integer clickCountSt){
            this.clickCountSt = clickCountSt;
            return this;
        }
        public QueryBuilder clickCountLessEqThan(Integer clickCountEd){
            this.clickCountEd = clickCountEd;
            return this;
        }


        public QueryBuilder clickCount(Integer clickCount){
            setClickCount(clickCount);
            return this;
        }

        public QueryBuilder clickCountList(Integer ... clickCount){
            this.clickCountList = solveNullList(clickCount);
            return this;
        }

        public QueryBuilder clickCountList(List<Integer> clickCount){
            this.clickCountList = clickCount;
            return this;
        }

        public QueryBuilder fetchClickCount(){
            setFetchFields("fetchFields","clickCount");
            return this;
        }

        public QueryBuilder excludeClickCount(){
            setFetchFields("excludeFields","clickCount");
            return this;
        }

        public QueryBuilder brandIdBetWeen(Integer brandIdSt,Integer brandIdEd){
            this.brandIdSt = brandIdSt;
            this.brandIdEd = brandIdEd;
            return this;
        }

        public QueryBuilder brandIdGreaterEqThan(Integer brandIdSt){
            this.brandIdSt = brandIdSt;
            return this;
        }
        public QueryBuilder brandIdLessEqThan(Integer brandIdEd){
            this.brandIdEd = brandIdEd;
            return this;
        }


        public QueryBuilder brandId(Integer brandId){
            setBrandId(brandId);
            return this;
        }

        public QueryBuilder brandIdList(Integer ... brandId){
            this.brandIdList = solveNullList(brandId);
            return this;
        }

        public QueryBuilder brandIdList(List<Integer> brandId){
            this.brandIdList = brandId;
            return this;
        }

        public QueryBuilder fetchBrandId(){
            setFetchFields("fetchFields","brandId");
            return this;
        }

        public QueryBuilder excludeBrandId(){
            setFetchFields("excludeFields","brandId");
            return this;
        }

        public QueryBuilder fuzzyProviderName (List<String> fuzzyProviderName){
            this.fuzzyProviderName = fuzzyProviderName;
            return this;
        }

        public QueryBuilder fuzzyProviderName (String ... fuzzyProviderName){
            this.fuzzyProviderName = solveNullList(fuzzyProviderName);
            return this;
        }

        public QueryBuilder rightFuzzyProviderName (List<String> rightFuzzyProviderName){
            this.rightFuzzyProviderName = rightFuzzyProviderName;
            return this;
        }

        public QueryBuilder rightFuzzyProviderName (String ... rightFuzzyProviderName){
            this.rightFuzzyProviderName = solveNullList(rightFuzzyProviderName);
            return this;
        }

        public QueryBuilder providerName(String providerName){
            setProviderName(providerName);
            return this;
        }

        public QueryBuilder providerNameList(String ... providerName){
            this.providerNameList = solveNullList(providerName);
            return this;
        }

        public QueryBuilder providerNameList(List<String> providerName){
            this.providerNameList = providerName;
            return this;
        }

        public QueryBuilder fetchProviderName(){
            setFetchFields("fetchFields","providerName");
            return this;
        }

        public QueryBuilder excludeProviderName(){
            setFetchFields("excludeFields","providerName");
            return this;
        }

        public QueryBuilder goodsNumberBetWeen(Integer goodsNumberSt,Integer goodsNumberEd){
            this.goodsNumberSt = goodsNumberSt;
            this.goodsNumberEd = goodsNumberEd;
            return this;
        }

        public QueryBuilder goodsNumberGreaterEqThan(Integer goodsNumberSt){
            this.goodsNumberSt = goodsNumberSt;
            return this;
        }
        public QueryBuilder goodsNumberLessEqThan(Integer goodsNumberEd){
            this.goodsNumberEd = goodsNumberEd;
            return this;
        }


        public QueryBuilder goodsNumber(Integer goodsNumber){
            setGoodsNumber(goodsNumber);
            return this;
        }

        public QueryBuilder goodsNumberList(Integer ... goodsNumber){
            this.goodsNumberList = solveNullList(goodsNumber);
            return this;
        }

        public QueryBuilder goodsNumberList(List<Integer> goodsNumber){
            this.goodsNumberList = goodsNumber;
            return this;
        }

        public QueryBuilder fetchGoodsNumber(){
            setFetchFields("fetchFields","goodsNumber");
            return this;
        }

        public QueryBuilder excludeGoodsNumber(){
            setFetchFields("excludeFields","goodsNumber");
            return this;
        }

        public QueryBuilder goodsWeightBetWeen(java.math.BigDecimal goodsWeightSt,java.math.BigDecimal goodsWeightEd){
            this.goodsWeightSt = goodsWeightSt;
            this.goodsWeightEd = goodsWeightEd;
            return this;
        }

        public QueryBuilder goodsWeightGreaterEqThan(java.math.BigDecimal goodsWeightSt){
            this.goodsWeightSt = goodsWeightSt;
            return this;
        }
        public QueryBuilder goodsWeightLessEqThan(java.math.BigDecimal goodsWeightEd){
            this.goodsWeightEd = goodsWeightEd;
            return this;
        }


        public QueryBuilder goodsWeight(java.math.BigDecimal goodsWeight){
            setGoodsWeight(goodsWeight);
            return this;
        }

        public QueryBuilder goodsWeightList(java.math.BigDecimal ... goodsWeight){
            this.goodsWeightList = solveNullList(goodsWeight);
            return this;
        }

        public QueryBuilder goodsWeightList(List<java.math.BigDecimal> goodsWeight){
            this.goodsWeightList = goodsWeight;
            return this;
        }

        public QueryBuilder fetchGoodsWeight(){
            setFetchFields("fetchFields","goodsWeight");
            return this;
        }

        public QueryBuilder excludeGoodsWeight(){
            setFetchFields("excludeFields","goodsWeight");
            return this;
        }

        public QueryBuilder marketPriceBetWeen(java.math.BigDecimal marketPriceSt,java.math.BigDecimal marketPriceEd){
            this.marketPriceSt = marketPriceSt;
            this.marketPriceEd = marketPriceEd;
            return this;
        }

        public QueryBuilder marketPriceGreaterEqThan(java.math.BigDecimal marketPriceSt){
            this.marketPriceSt = marketPriceSt;
            return this;
        }
        public QueryBuilder marketPriceLessEqThan(java.math.BigDecimal marketPriceEd){
            this.marketPriceEd = marketPriceEd;
            return this;
        }


        public QueryBuilder marketPrice(java.math.BigDecimal marketPrice){
            setMarketPrice(marketPrice);
            return this;
        }

        public QueryBuilder marketPriceList(java.math.BigDecimal ... marketPrice){
            this.marketPriceList = solveNullList(marketPrice);
            return this;
        }

        public QueryBuilder marketPriceList(List<java.math.BigDecimal> marketPrice){
            this.marketPriceList = marketPrice;
            return this;
        }

        public QueryBuilder fetchMarketPrice(){
            setFetchFields("fetchFields","marketPrice");
            return this;
        }

        public QueryBuilder excludeMarketPrice(){
            setFetchFields("excludeFields","marketPrice");
            return this;
        }

        public QueryBuilder virtualSalesBetWeen(Integer virtualSalesSt,Integer virtualSalesEd){
            this.virtualSalesSt = virtualSalesSt;
            this.virtualSalesEd = virtualSalesEd;
            return this;
        }

        public QueryBuilder virtualSalesGreaterEqThan(Integer virtualSalesSt){
            this.virtualSalesSt = virtualSalesSt;
            return this;
        }
        public QueryBuilder virtualSalesLessEqThan(Integer virtualSalesEd){
            this.virtualSalesEd = virtualSalesEd;
            return this;
        }


        public QueryBuilder virtualSales(Integer virtualSales){
            setVirtualSales(virtualSales);
            return this;
        }

        public QueryBuilder virtualSalesList(Integer ... virtualSales){
            this.virtualSalesList = solveNullList(virtualSales);
            return this;
        }

        public QueryBuilder virtualSalesList(List<Integer> virtualSales){
            this.virtualSalesList = virtualSales;
            return this;
        }

        public QueryBuilder fetchVirtualSales(){
            setFetchFields("fetchFields","virtualSales");
            return this;
        }

        public QueryBuilder excludeVirtualSales(){
            setFetchFields("excludeFields","virtualSales");
            return this;
        }

        public QueryBuilder shopPriceBetWeen(java.math.BigDecimal shopPriceSt,java.math.BigDecimal shopPriceEd){
            this.shopPriceSt = shopPriceSt;
            this.shopPriceEd = shopPriceEd;
            return this;
        }

        public QueryBuilder shopPriceGreaterEqThan(java.math.BigDecimal shopPriceSt){
            this.shopPriceSt = shopPriceSt;
            return this;
        }
        public QueryBuilder shopPriceLessEqThan(java.math.BigDecimal shopPriceEd){
            this.shopPriceEd = shopPriceEd;
            return this;
        }


        public QueryBuilder shopPrice(java.math.BigDecimal shopPrice){
            setShopPrice(shopPrice);
            return this;
        }

        public QueryBuilder shopPriceList(java.math.BigDecimal ... shopPrice){
            this.shopPriceList = solveNullList(shopPrice);
            return this;
        }

        public QueryBuilder shopPriceList(List<java.math.BigDecimal> shopPrice){
            this.shopPriceList = shopPrice;
            return this;
        }

        public QueryBuilder fetchShopPrice(){
            setFetchFields("fetchFields","shopPrice");
            return this;
        }

        public QueryBuilder excludeShopPrice(){
            setFetchFields("excludeFields","shopPrice");
            return this;
        }

        public QueryBuilder promotePriceBetWeen(java.math.BigDecimal promotePriceSt,java.math.BigDecimal promotePriceEd){
            this.promotePriceSt = promotePriceSt;
            this.promotePriceEd = promotePriceEd;
            return this;
        }

        public QueryBuilder promotePriceGreaterEqThan(java.math.BigDecimal promotePriceSt){
            this.promotePriceSt = promotePriceSt;
            return this;
        }
        public QueryBuilder promotePriceLessEqThan(java.math.BigDecimal promotePriceEd){
            this.promotePriceEd = promotePriceEd;
            return this;
        }


        public QueryBuilder promotePrice(java.math.BigDecimal promotePrice){
            setPromotePrice(promotePrice);
            return this;
        }

        public QueryBuilder promotePriceList(java.math.BigDecimal ... promotePrice){
            this.promotePriceList = solveNullList(promotePrice);
            return this;
        }

        public QueryBuilder promotePriceList(List<java.math.BigDecimal> promotePrice){
            this.promotePriceList = promotePrice;
            return this;
        }

        public QueryBuilder fetchPromotePrice(){
            setFetchFields("fetchFields","promotePrice");
            return this;
        }

        public QueryBuilder excludePromotePrice(){
            setFetchFields("excludeFields","promotePrice");
            return this;
        }

        public QueryBuilder promoteStartDateBetWeen(Integer promoteStartDateSt,Integer promoteStartDateEd){
            this.promoteStartDateSt = promoteStartDateSt;
            this.promoteStartDateEd = promoteStartDateEd;
            return this;
        }

        public QueryBuilder promoteStartDateGreaterEqThan(Integer promoteStartDateSt){
            this.promoteStartDateSt = promoteStartDateSt;
            return this;
        }
        public QueryBuilder promoteStartDateLessEqThan(Integer promoteStartDateEd){
            this.promoteStartDateEd = promoteStartDateEd;
            return this;
        }


        public QueryBuilder promoteStartDate(Integer promoteStartDate){
            setPromoteStartDate(promoteStartDate);
            return this;
        }

        public QueryBuilder promoteStartDateList(Integer ... promoteStartDate){
            this.promoteStartDateList = solveNullList(promoteStartDate);
            return this;
        }

        public QueryBuilder promoteStartDateList(List<Integer> promoteStartDate){
            this.promoteStartDateList = promoteStartDate;
            return this;
        }

        public QueryBuilder fetchPromoteStartDate(){
            setFetchFields("fetchFields","promoteStartDate");
            return this;
        }

        public QueryBuilder excludePromoteStartDate(){
            setFetchFields("excludeFields","promoteStartDate");
            return this;
        }

        public QueryBuilder promoteEndDateBetWeen(Integer promoteEndDateSt,Integer promoteEndDateEd){
            this.promoteEndDateSt = promoteEndDateSt;
            this.promoteEndDateEd = promoteEndDateEd;
            return this;
        }

        public QueryBuilder promoteEndDateGreaterEqThan(Integer promoteEndDateSt){
            this.promoteEndDateSt = promoteEndDateSt;
            return this;
        }
        public QueryBuilder promoteEndDateLessEqThan(Integer promoteEndDateEd){
            this.promoteEndDateEd = promoteEndDateEd;
            return this;
        }


        public QueryBuilder promoteEndDate(Integer promoteEndDate){
            setPromoteEndDate(promoteEndDate);
            return this;
        }

        public QueryBuilder promoteEndDateList(Integer ... promoteEndDate){
            this.promoteEndDateList = solveNullList(promoteEndDate);
            return this;
        }

        public QueryBuilder promoteEndDateList(List<Integer> promoteEndDate){
            this.promoteEndDateList = promoteEndDate;
            return this;
        }

        public QueryBuilder fetchPromoteEndDate(){
            setFetchFields("fetchFields","promoteEndDate");
            return this;
        }

        public QueryBuilder excludePromoteEndDate(){
            setFetchFields("excludeFields","promoteEndDate");
            return this;
        }

        public QueryBuilder fuzzyWarnNumber (List<String> fuzzyWarnNumber){
            this.fuzzyWarnNumber = fuzzyWarnNumber;
            return this;
        }

        public QueryBuilder fuzzyWarnNumber (String ... fuzzyWarnNumber){
            this.fuzzyWarnNumber = solveNullList(fuzzyWarnNumber);
            return this;
        }

        public QueryBuilder rightFuzzyWarnNumber (List<String> rightFuzzyWarnNumber){
            this.rightFuzzyWarnNumber = rightFuzzyWarnNumber;
            return this;
        }

        public QueryBuilder rightFuzzyWarnNumber (String ... rightFuzzyWarnNumber){
            this.rightFuzzyWarnNumber = solveNullList(rightFuzzyWarnNumber);
            return this;
        }

        public QueryBuilder warnNumber(String warnNumber){
            setWarnNumber(warnNumber);
            return this;
        }

        public QueryBuilder warnNumberList(String ... warnNumber){
            this.warnNumberList = solveNullList(warnNumber);
            return this;
        }

        public QueryBuilder warnNumberList(List<String> warnNumber){
            this.warnNumberList = warnNumber;
            return this;
        }

        public QueryBuilder fetchWarnNumber(){
            setFetchFields("fetchFields","warnNumber");
            return this;
        }

        public QueryBuilder excludeWarnNumber(){
            setFetchFields("excludeFields","warnNumber");
            return this;
        }

        public QueryBuilder fuzzyKeywords (List<String> fuzzyKeywords){
            this.fuzzyKeywords = fuzzyKeywords;
            return this;
        }

        public QueryBuilder fuzzyKeywords (String ... fuzzyKeywords){
            this.fuzzyKeywords = solveNullList(fuzzyKeywords);
            return this;
        }

        public QueryBuilder rightFuzzyKeywords (List<String> rightFuzzyKeywords){
            this.rightFuzzyKeywords = rightFuzzyKeywords;
            return this;
        }

        public QueryBuilder rightFuzzyKeywords (String ... rightFuzzyKeywords){
            this.rightFuzzyKeywords = solveNullList(rightFuzzyKeywords);
            return this;
        }

        public QueryBuilder keywords(String keywords){
            setKeywords(keywords);
            return this;
        }

        public QueryBuilder keywordsList(String ... keywords){
            this.keywordsList = solveNullList(keywords);
            return this;
        }

        public QueryBuilder keywordsList(List<String> keywords){
            this.keywordsList = keywords;
            return this;
        }

        public QueryBuilder fetchKeywords(){
            setFetchFields("fetchFields","keywords");
            return this;
        }

        public QueryBuilder excludeKeywords(){
            setFetchFields("excludeFields","keywords");
            return this;
        }

        public QueryBuilder fuzzyGoodsBrief (List<String> fuzzyGoodsBrief){
            this.fuzzyGoodsBrief = fuzzyGoodsBrief;
            return this;
        }

        public QueryBuilder fuzzyGoodsBrief (String ... fuzzyGoodsBrief){
            this.fuzzyGoodsBrief = solveNullList(fuzzyGoodsBrief);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsBrief (List<String> rightFuzzyGoodsBrief){
            this.rightFuzzyGoodsBrief = rightFuzzyGoodsBrief;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsBrief (String ... rightFuzzyGoodsBrief){
            this.rightFuzzyGoodsBrief = solveNullList(rightFuzzyGoodsBrief);
            return this;
        }

        public QueryBuilder goodsBrief(String goodsBrief){
            setGoodsBrief(goodsBrief);
            return this;
        }

        public QueryBuilder goodsBriefList(String ... goodsBrief){
            this.goodsBriefList = solveNullList(goodsBrief);
            return this;
        }

        public QueryBuilder goodsBriefList(List<String> goodsBrief){
            this.goodsBriefList = goodsBrief;
            return this;
        }

        public QueryBuilder fetchGoodsBrief(){
            setFetchFields("fetchFields","goodsBrief");
            return this;
        }

        public QueryBuilder excludeGoodsBrief(){
            setFetchFields("excludeFields","goodsBrief");
            return this;
        }

        public QueryBuilder fuzzyGoodsDesc (List<String> fuzzyGoodsDesc){
            this.fuzzyGoodsDesc = fuzzyGoodsDesc;
            return this;
        }

        public QueryBuilder fuzzyGoodsDesc (String ... fuzzyGoodsDesc){
            this.fuzzyGoodsDesc = solveNullList(fuzzyGoodsDesc);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsDesc (List<String> rightFuzzyGoodsDesc){
            this.rightFuzzyGoodsDesc = rightFuzzyGoodsDesc;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsDesc (String ... rightFuzzyGoodsDesc){
            this.rightFuzzyGoodsDesc = solveNullList(rightFuzzyGoodsDesc);
            return this;
        }

        public QueryBuilder goodsDesc(String goodsDesc){
            setGoodsDesc(goodsDesc);
            return this;
        }

        public QueryBuilder goodsDescList(String ... goodsDesc){
            this.goodsDescList = solveNullList(goodsDesc);
            return this;
        }

        public QueryBuilder goodsDescList(List<String> goodsDesc){
            this.goodsDescList = goodsDesc;
            return this;
        }

        public QueryBuilder fetchGoodsDesc(){
            setFetchFields("fetchFields","goodsDesc");
            return this;
        }

        public QueryBuilder excludeGoodsDesc(){
            setFetchFields("excludeFields","goodsDesc");
            return this;
        }

        public QueryBuilder fuzzyGoodsThumb (List<String> fuzzyGoodsThumb){
            this.fuzzyGoodsThumb = fuzzyGoodsThumb;
            return this;
        }

        public QueryBuilder fuzzyGoodsThumb (String ... fuzzyGoodsThumb){
            this.fuzzyGoodsThumb = solveNullList(fuzzyGoodsThumb);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsThumb (List<String> rightFuzzyGoodsThumb){
            this.rightFuzzyGoodsThumb = rightFuzzyGoodsThumb;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsThumb (String ... rightFuzzyGoodsThumb){
            this.rightFuzzyGoodsThumb = solveNullList(rightFuzzyGoodsThumb);
            return this;
        }

        public QueryBuilder goodsThumb(String goodsThumb){
            setGoodsThumb(goodsThumb);
            return this;
        }

        public QueryBuilder goodsThumbList(String ... goodsThumb){
            this.goodsThumbList = solveNullList(goodsThumb);
            return this;
        }

        public QueryBuilder goodsThumbList(List<String> goodsThumb){
            this.goodsThumbList = goodsThumb;
            return this;
        }

        public QueryBuilder fetchGoodsThumb(){
            setFetchFields("fetchFields","goodsThumb");
            return this;
        }

        public QueryBuilder excludeGoodsThumb(){
            setFetchFields("excludeFields","goodsThumb");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg (List<String> fuzzyGoodsImg){
            this.fuzzyGoodsImg = fuzzyGoodsImg;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg (String ... fuzzyGoodsImg){
            this.fuzzyGoodsImg = solveNullList(fuzzyGoodsImg);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg (List<String> rightFuzzyGoodsImg){
            this.rightFuzzyGoodsImg = rightFuzzyGoodsImg;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg (String ... rightFuzzyGoodsImg){
            this.rightFuzzyGoodsImg = solveNullList(rightFuzzyGoodsImg);
            return this;
        }

        public QueryBuilder goodsImg(String goodsImg){
            setGoodsImg(goodsImg);
            return this;
        }

        public QueryBuilder goodsImgList(String ... goodsImg){
            this.goodsImgList = solveNullList(goodsImg);
            return this;
        }

        public QueryBuilder goodsImgList(List<String> goodsImg){
            this.goodsImgList = goodsImg;
            return this;
        }

        public QueryBuilder fetchGoodsImg(){
            setFetchFields("fetchFields","goodsImg");
            return this;
        }

        public QueryBuilder excludeGoodsImg(){
            setFetchFields("excludeFields","goodsImg");
            return this;
        }

        public QueryBuilder fuzzyOriginalImg (List<String> fuzzyOriginalImg){
            this.fuzzyOriginalImg = fuzzyOriginalImg;
            return this;
        }

        public QueryBuilder fuzzyOriginalImg (String ... fuzzyOriginalImg){
            this.fuzzyOriginalImg = solveNullList(fuzzyOriginalImg);
            return this;
        }

        public QueryBuilder rightFuzzyOriginalImg (List<String> rightFuzzyOriginalImg){
            this.rightFuzzyOriginalImg = rightFuzzyOriginalImg;
            return this;
        }

        public QueryBuilder rightFuzzyOriginalImg (String ... rightFuzzyOriginalImg){
            this.rightFuzzyOriginalImg = solveNullList(rightFuzzyOriginalImg);
            return this;
        }

        public QueryBuilder originalImg(String originalImg){
            setOriginalImg(originalImg);
            return this;
        }

        public QueryBuilder originalImgList(String ... originalImg){
            this.originalImgList = solveNullList(originalImg);
            return this;
        }

        public QueryBuilder originalImgList(List<String> originalImg){
            this.originalImgList = originalImg;
            return this;
        }

        public QueryBuilder fetchOriginalImg(){
            setFetchFields("fetchFields","originalImg");
            return this;
        }

        public QueryBuilder excludeOriginalImg(){
            setFetchFields("excludeFields","originalImg");
            return this;
        }

        public QueryBuilder isRealBetWeen(Integer isRealSt,Integer isRealEd){
            this.isRealSt = isRealSt;
            this.isRealEd = isRealEd;
            return this;
        }

        public QueryBuilder isRealGreaterEqThan(Integer isRealSt){
            this.isRealSt = isRealSt;
            return this;
        }
        public QueryBuilder isRealLessEqThan(Integer isRealEd){
            this.isRealEd = isRealEd;
            return this;
        }


        public QueryBuilder isReal(Integer isReal){
            setIsReal(isReal);
            return this;
        }

        public QueryBuilder isRealList(Integer ... isReal){
            this.isRealList = solveNullList(isReal);
            return this;
        }

        public QueryBuilder isRealList(List<Integer> isReal){
            this.isRealList = isReal;
            return this;
        }

        public QueryBuilder fetchIsReal(){
            setFetchFields("fetchFields","isReal");
            return this;
        }

        public QueryBuilder excludeIsReal(){
            setFetchFields("excludeFields","isReal");
            return this;
        }

        public QueryBuilder fuzzyExtensionCode (List<String> fuzzyExtensionCode){
            this.fuzzyExtensionCode = fuzzyExtensionCode;
            return this;
        }

        public QueryBuilder fuzzyExtensionCode (String ... fuzzyExtensionCode){
            this.fuzzyExtensionCode = solveNullList(fuzzyExtensionCode);
            return this;
        }

        public QueryBuilder rightFuzzyExtensionCode (List<String> rightFuzzyExtensionCode){
            this.rightFuzzyExtensionCode = rightFuzzyExtensionCode;
            return this;
        }

        public QueryBuilder rightFuzzyExtensionCode (String ... rightFuzzyExtensionCode){
            this.rightFuzzyExtensionCode = solveNullList(rightFuzzyExtensionCode);
            return this;
        }

        public QueryBuilder extensionCode(String extensionCode){
            setExtensionCode(extensionCode);
            return this;
        }

        public QueryBuilder extensionCodeList(String ... extensionCode){
            this.extensionCodeList = solveNullList(extensionCode);
            return this;
        }

        public QueryBuilder extensionCodeList(List<String> extensionCode){
            this.extensionCodeList = extensionCode;
            return this;
        }

        public QueryBuilder fetchExtensionCode(){
            setFetchFields("fetchFields","extensionCode");
            return this;
        }

        public QueryBuilder excludeExtensionCode(){
            setFetchFields("excludeFields","extensionCode");
            return this;
        }

        public QueryBuilder isOnSaleBetWeen(Integer isOnSaleSt,Integer isOnSaleEd){
            this.isOnSaleSt = isOnSaleSt;
            this.isOnSaleEd = isOnSaleEd;
            return this;
        }

        public QueryBuilder isOnSaleGreaterEqThan(Integer isOnSaleSt){
            this.isOnSaleSt = isOnSaleSt;
            return this;
        }
        public QueryBuilder isOnSaleLessEqThan(Integer isOnSaleEd){
            this.isOnSaleEd = isOnSaleEd;
            return this;
        }


        public QueryBuilder isOnSale(Integer isOnSale){
            setIsOnSale(isOnSale);
            return this;
        }

        public QueryBuilder isOnSaleList(Integer ... isOnSale){
            this.isOnSaleList = solveNullList(isOnSale);
            return this;
        }

        public QueryBuilder isOnSaleList(List<Integer> isOnSale){
            this.isOnSaleList = isOnSale;
            return this;
        }

        public QueryBuilder fetchIsOnSale(){
            setFetchFields("fetchFields","isOnSale");
            return this;
        }

        public QueryBuilder excludeIsOnSale(){
            setFetchFields("excludeFields","isOnSale");
            return this;
        }

        public QueryBuilder isAloneSaleBetWeen(Integer isAloneSaleSt,Integer isAloneSaleEd){
            this.isAloneSaleSt = isAloneSaleSt;
            this.isAloneSaleEd = isAloneSaleEd;
            return this;
        }

        public QueryBuilder isAloneSaleGreaterEqThan(Integer isAloneSaleSt){
            this.isAloneSaleSt = isAloneSaleSt;
            return this;
        }
        public QueryBuilder isAloneSaleLessEqThan(Integer isAloneSaleEd){
            this.isAloneSaleEd = isAloneSaleEd;
            return this;
        }


        public QueryBuilder isAloneSale(Integer isAloneSale){
            setIsAloneSale(isAloneSale);
            return this;
        }

        public QueryBuilder isAloneSaleList(Integer ... isAloneSale){
            this.isAloneSaleList = solveNullList(isAloneSale);
            return this;
        }

        public QueryBuilder isAloneSaleList(List<Integer> isAloneSale){
            this.isAloneSaleList = isAloneSale;
            return this;
        }

        public QueryBuilder fetchIsAloneSale(){
            setFetchFields("fetchFields","isAloneSale");
            return this;
        }

        public QueryBuilder excludeIsAloneSale(){
            setFetchFields("excludeFields","isAloneSale");
            return this;
        }

        public QueryBuilder isShippingBetWeen(Integer isShippingSt,Integer isShippingEd){
            this.isShippingSt = isShippingSt;
            this.isShippingEd = isShippingEd;
            return this;
        }

        public QueryBuilder isShippingGreaterEqThan(Integer isShippingSt){
            this.isShippingSt = isShippingSt;
            return this;
        }
        public QueryBuilder isShippingLessEqThan(Integer isShippingEd){
            this.isShippingEd = isShippingEd;
            return this;
        }


        public QueryBuilder isShipping(Integer isShipping){
            setIsShipping(isShipping);
            return this;
        }

        public QueryBuilder isShippingList(Integer ... isShipping){
            this.isShippingList = solveNullList(isShipping);
            return this;
        }

        public QueryBuilder isShippingList(List<Integer> isShipping){
            this.isShippingList = isShipping;
            return this;
        }

        public QueryBuilder fetchIsShipping(){
            setFetchFields("fetchFields","isShipping");
            return this;
        }

        public QueryBuilder excludeIsShipping(){
            setFetchFields("excludeFields","isShipping");
            return this;
        }

        public QueryBuilder integralBetWeen(Integer integralSt,Integer integralEd){
            this.integralSt = integralSt;
            this.integralEd = integralEd;
            return this;
        }

        public QueryBuilder integralGreaterEqThan(Integer integralSt){
            this.integralSt = integralSt;
            return this;
        }
        public QueryBuilder integralLessEqThan(Integer integralEd){
            this.integralEd = integralEd;
            return this;
        }


        public QueryBuilder integral(Integer integral){
            setIntegral(integral);
            return this;
        }

        public QueryBuilder integralList(Integer ... integral){
            this.integralList = solveNullList(integral);
            return this;
        }

        public QueryBuilder integralList(List<Integer> integral){
            this.integralList = integral;
            return this;
        }

        public QueryBuilder fetchIntegral(){
            setFetchFields("fetchFields","integral");
            return this;
        }

        public QueryBuilder excludeIntegral(){
            setFetchFields("excludeFields","integral");
            return this;
        }

        public QueryBuilder addTimeBetWeen(Integer addTimeSt,Integer addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public QueryBuilder addTimeGreaterEqThan(Integer addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public QueryBuilder addTimeLessEqThan(Integer addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public QueryBuilder addTime(Integer addTime){
            setAddTime(addTime);
            return this;
        }

        public QueryBuilder addTimeList(Integer ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public QueryBuilder addTimeList(List<Integer> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public QueryBuilder fetchAddTime(){
            setFetchFields("fetchFields","addTime");
            return this;
        }

        public QueryBuilder excludeAddTime(){
            setFetchFields("excludeFields","addTime");
            return this;
        }

        public QueryBuilder sortOrderBetWeen(Integer sortOrderSt,Integer sortOrderEd){
            this.sortOrderSt = sortOrderSt;
            this.sortOrderEd = sortOrderEd;
            return this;
        }

        public QueryBuilder sortOrderGreaterEqThan(Integer sortOrderSt){
            this.sortOrderSt = sortOrderSt;
            return this;
        }
        public QueryBuilder sortOrderLessEqThan(Integer sortOrderEd){
            this.sortOrderEd = sortOrderEd;
            return this;
        }


        public QueryBuilder sortOrder(Integer sortOrder){
            setSortOrder(sortOrder);
            return this;
        }

        public QueryBuilder sortOrderList(Integer ... sortOrder){
            this.sortOrderList = solveNullList(sortOrder);
            return this;
        }

        public QueryBuilder sortOrderList(List<Integer> sortOrder){
            this.sortOrderList = sortOrder;
            return this;
        }

        public QueryBuilder fetchSortOrder(){
            setFetchFields("fetchFields","sortOrder");
            return this;
        }

        public QueryBuilder excludeSortOrder(){
            setFetchFields("excludeFields","sortOrder");
            return this;
        }

        public QueryBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public QueryBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public QueryBuilder isDelete(Integer isDelete){
            setIsDelete(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public QueryBuilder fetchIsDelete(){
            setFetchFields("fetchFields","isDelete");
            return this;
        }

        public QueryBuilder excludeIsDelete(){
            setFetchFields("excludeFields","isDelete");
            return this;
        }

        public QueryBuilder isBestBetWeen(Integer isBestSt,Integer isBestEd){
            this.isBestSt = isBestSt;
            this.isBestEd = isBestEd;
            return this;
        }

        public QueryBuilder isBestGreaterEqThan(Integer isBestSt){
            this.isBestSt = isBestSt;
            return this;
        }
        public QueryBuilder isBestLessEqThan(Integer isBestEd){
            this.isBestEd = isBestEd;
            return this;
        }


        public QueryBuilder isBest(Integer isBest){
            setIsBest(isBest);
            return this;
        }

        public QueryBuilder isBestList(Integer ... isBest){
            this.isBestList = solveNullList(isBest);
            return this;
        }

        public QueryBuilder isBestList(List<Integer> isBest){
            this.isBestList = isBest;
            return this;
        }

        public QueryBuilder fetchIsBest(){
            setFetchFields("fetchFields","isBest");
            return this;
        }

        public QueryBuilder excludeIsBest(){
            setFetchFields("excludeFields","isBest");
            return this;
        }

        public QueryBuilder isNewBetWeen(Integer isNewSt,Integer isNewEd){
            this.isNewSt = isNewSt;
            this.isNewEd = isNewEd;
            return this;
        }

        public QueryBuilder isNewGreaterEqThan(Integer isNewSt){
            this.isNewSt = isNewSt;
            return this;
        }
        public QueryBuilder isNewLessEqThan(Integer isNewEd){
            this.isNewEd = isNewEd;
            return this;
        }


        public QueryBuilder isNew(Integer isNew){
            setIsNew(isNew);
            return this;
        }

        public QueryBuilder isNewList(Integer ... isNew){
            this.isNewList = solveNullList(isNew);
            return this;
        }

        public QueryBuilder isNewList(List<Integer> isNew){
            this.isNewList = isNew;
            return this;
        }

        public QueryBuilder fetchIsNew(){
            setFetchFields("fetchFields","isNew");
            return this;
        }

        public QueryBuilder excludeIsNew(){
            setFetchFields("excludeFields","isNew");
            return this;
        }

        public QueryBuilder isHotBetWeen(Integer isHotSt,Integer isHotEd){
            this.isHotSt = isHotSt;
            this.isHotEd = isHotEd;
            return this;
        }

        public QueryBuilder isHotGreaterEqThan(Integer isHotSt){
            this.isHotSt = isHotSt;
            return this;
        }
        public QueryBuilder isHotLessEqThan(Integer isHotEd){
            this.isHotEd = isHotEd;
            return this;
        }


        public QueryBuilder isHot(Integer isHot){
            setIsHot(isHot);
            return this;
        }

        public QueryBuilder isHotList(Integer ... isHot){
            this.isHotList = solveNullList(isHot);
            return this;
        }

        public QueryBuilder isHotList(List<Integer> isHot){
            this.isHotList = isHot;
            return this;
        }

        public QueryBuilder fetchIsHot(){
            setFetchFields("fetchFields","isHot");
            return this;
        }

        public QueryBuilder excludeIsHot(){
            setFetchFields("excludeFields","isHot");
            return this;
        }

        public QueryBuilder isPromoteBetWeen(Integer isPromoteSt,Integer isPromoteEd){
            this.isPromoteSt = isPromoteSt;
            this.isPromoteEd = isPromoteEd;
            return this;
        }

        public QueryBuilder isPromoteGreaterEqThan(Integer isPromoteSt){
            this.isPromoteSt = isPromoteSt;
            return this;
        }
        public QueryBuilder isPromoteLessEqThan(Integer isPromoteEd){
            this.isPromoteEd = isPromoteEd;
            return this;
        }


        public QueryBuilder isPromote(Integer isPromote){
            setIsPromote(isPromote);
            return this;
        }

        public QueryBuilder isPromoteList(Integer ... isPromote){
            this.isPromoteList = solveNullList(isPromote);
            return this;
        }

        public QueryBuilder isPromoteList(List<Integer> isPromote){
            this.isPromoteList = isPromote;
            return this;
        }

        public QueryBuilder fetchIsPromote(){
            setFetchFields("fetchFields","isPromote");
            return this;
        }

        public QueryBuilder excludeIsPromote(){
            setFetchFields("excludeFields","isPromote");
            return this;
        }

        public QueryBuilder bonusTypeIdBetWeen(Integer bonusTypeIdSt,Integer bonusTypeIdEd){
            this.bonusTypeIdSt = bonusTypeIdSt;
            this.bonusTypeIdEd = bonusTypeIdEd;
            return this;
        }

        public QueryBuilder bonusTypeIdGreaterEqThan(Integer bonusTypeIdSt){
            this.bonusTypeIdSt = bonusTypeIdSt;
            return this;
        }
        public QueryBuilder bonusTypeIdLessEqThan(Integer bonusTypeIdEd){
            this.bonusTypeIdEd = bonusTypeIdEd;
            return this;
        }


        public QueryBuilder bonusTypeId(Integer bonusTypeId){
            setBonusTypeId(bonusTypeId);
            return this;
        }

        public QueryBuilder bonusTypeIdList(Integer ... bonusTypeId){
            this.bonusTypeIdList = solveNullList(bonusTypeId);
            return this;
        }

        public QueryBuilder bonusTypeIdList(List<Integer> bonusTypeId){
            this.bonusTypeIdList = bonusTypeId;
            return this;
        }

        public QueryBuilder fetchBonusTypeId(){
            setFetchFields("fetchFields","bonusTypeId");
            return this;
        }

        public QueryBuilder excludeBonusTypeId(){
            setFetchFields("excludeFields","bonusTypeId");
            return this;
        }

        public QueryBuilder lastUpdateBetWeen(Integer lastUpdateSt,Integer lastUpdateEd){
            this.lastUpdateSt = lastUpdateSt;
            this.lastUpdateEd = lastUpdateEd;
            return this;
        }

        public QueryBuilder lastUpdateGreaterEqThan(Integer lastUpdateSt){
            this.lastUpdateSt = lastUpdateSt;
            return this;
        }
        public QueryBuilder lastUpdateLessEqThan(Integer lastUpdateEd){
            this.lastUpdateEd = lastUpdateEd;
            return this;
        }


        public QueryBuilder lastUpdate(Integer lastUpdate){
            setLastUpdate(lastUpdate);
            return this;
        }

        public QueryBuilder lastUpdateList(Integer ... lastUpdate){
            this.lastUpdateList = solveNullList(lastUpdate);
            return this;
        }

        public QueryBuilder lastUpdateList(List<Integer> lastUpdate){
            this.lastUpdateList = lastUpdate;
            return this;
        }

        public QueryBuilder fetchLastUpdate(){
            setFetchFields("fetchFields","lastUpdate");
            return this;
        }

        public QueryBuilder excludeLastUpdate(){
            setFetchFields("excludeFields","lastUpdate");
            return this;
        }

        public QueryBuilder goodsTypeBetWeen(Integer goodsTypeSt,Integer goodsTypeEd){
            this.goodsTypeSt = goodsTypeSt;
            this.goodsTypeEd = goodsTypeEd;
            return this;
        }

        public QueryBuilder goodsTypeGreaterEqThan(Integer goodsTypeSt){
            this.goodsTypeSt = goodsTypeSt;
            return this;
        }
        public QueryBuilder goodsTypeLessEqThan(Integer goodsTypeEd){
            this.goodsTypeEd = goodsTypeEd;
            return this;
        }


        public QueryBuilder goodsType(Integer goodsType){
            setGoodsType(goodsType);
            return this;
        }

        public QueryBuilder goodsTypeList(Integer ... goodsType){
            this.goodsTypeList = solveNullList(goodsType);
            return this;
        }

        public QueryBuilder goodsTypeList(List<Integer> goodsType){
            this.goodsTypeList = goodsType;
            return this;
        }

        public QueryBuilder fetchGoodsType(){
            setFetchFields("fetchFields","goodsType");
            return this;
        }

        public QueryBuilder excludeGoodsType(){
            setFetchFields("excludeFields","goodsType");
            return this;
        }

        public QueryBuilder fuzzySellerNote (List<String> fuzzySellerNote){
            this.fuzzySellerNote = fuzzySellerNote;
            return this;
        }

        public QueryBuilder fuzzySellerNote (String ... fuzzySellerNote){
            this.fuzzySellerNote = solveNullList(fuzzySellerNote);
            return this;
        }

        public QueryBuilder rightFuzzySellerNote (List<String> rightFuzzySellerNote){
            this.rightFuzzySellerNote = rightFuzzySellerNote;
            return this;
        }

        public QueryBuilder rightFuzzySellerNote (String ... rightFuzzySellerNote){
            this.rightFuzzySellerNote = solveNullList(rightFuzzySellerNote);
            return this;
        }

        public QueryBuilder sellerNote(String sellerNote){
            setSellerNote(sellerNote);
            return this;
        }

        public QueryBuilder sellerNoteList(String ... sellerNote){
            this.sellerNoteList = solveNullList(sellerNote);
            return this;
        }

        public QueryBuilder sellerNoteList(List<String> sellerNote){
            this.sellerNoteList = sellerNote;
            return this;
        }

        public QueryBuilder fetchSellerNote(){
            setFetchFields("fetchFields","sellerNote");
            return this;
        }

        public QueryBuilder excludeSellerNote(){
            setFetchFields("excludeFields","sellerNote");
            return this;
        }

        public QueryBuilder giveIntegralBetWeen(Integer giveIntegralSt,Integer giveIntegralEd){
            this.giveIntegralSt = giveIntegralSt;
            this.giveIntegralEd = giveIntegralEd;
            return this;
        }

        public QueryBuilder giveIntegralGreaterEqThan(Integer giveIntegralSt){
            this.giveIntegralSt = giveIntegralSt;
            return this;
        }
        public QueryBuilder giveIntegralLessEqThan(Integer giveIntegralEd){
            this.giveIntegralEd = giveIntegralEd;
            return this;
        }


        public QueryBuilder giveIntegral(Integer giveIntegral){
            setGiveIntegral(giveIntegral);
            return this;
        }

        public QueryBuilder giveIntegralList(Integer ... giveIntegral){
            this.giveIntegralList = solveNullList(giveIntegral);
            return this;
        }

        public QueryBuilder giveIntegralList(List<Integer> giveIntegral){
            this.giveIntegralList = giveIntegral;
            return this;
        }

        public QueryBuilder fetchGiveIntegral(){
            setFetchFields("fetchFields","giveIntegral");
            return this;
        }

        public QueryBuilder excludeGiveIntegral(){
            setFetchFields("excludeFields","giveIntegral");
            return this;
        }

        public QueryBuilder rankIntegralBetWeen(Integer rankIntegralSt,Integer rankIntegralEd){
            this.rankIntegralSt = rankIntegralSt;
            this.rankIntegralEd = rankIntegralEd;
            return this;
        }

        public QueryBuilder rankIntegralGreaterEqThan(Integer rankIntegralSt){
            this.rankIntegralSt = rankIntegralSt;
            return this;
        }
        public QueryBuilder rankIntegralLessEqThan(Integer rankIntegralEd){
            this.rankIntegralEd = rankIntegralEd;
            return this;
        }


        public QueryBuilder rankIntegral(Integer rankIntegral){
            setRankIntegral(rankIntegral);
            return this;
        }

        public QueryBuilder rankIntegralList(Integer ... rankIntegral){
            this.rankIntegralList = solveNullList(rankIntegral);
            return this;
        }

        public QueryBuilder rankIntegralList(List<Integer> rankIntegral){
            this.rankIntegralList = rankIntegral;
            return this;
        }

        public QueryBuilder fetchRankIntegral(){
            setFetchFields("fetchFields","rankIntegral");
            return this;
        }

        public QueryBuilder excludeRankIntegral(){
            setFetchFields("excludeFields","rankIntegral");
            return this;
        }

        public QueryBuilder suppliersIdBetWeen(Integer suppliersIdSt,Integer suppliersIdEd){
            this.suppliersIdSt = suppliersIdSt;
            this.suppliersIdEd = suppliersIdEd;
            return this;
        }

        public QueryBuilder suppliersIdGreaterEqThan(Integer suppliersIdSt){
            this.suppliersIdSt = suppliersIdSt;
            return this;
        }
        public QueryBuilder suppliersIdLessEqThan(Integer suppliersIdEd){
            this.suppliersIdEd = suppliersIdEd;
            return this;
        }


        public QueryBuilder suppliersId(Integer suppliersId){
            setSuppliersId(suppliersId);
            return this;
        }

        public QueryBuilder suppliersIdList(Integer ... suppliersId){
            this.suppliersIdList = solveNullList(suppliersId);
            return this;
        }

        public QueryBuilder suppliersIdList(List<Integer> suppliersId){
            this.suppliersIdList = suppliersId;
            return this;
        }

        public QueryBuilder fetchSuppliersId(){
            setFetchFields("fetchFields","suppliersId");
            return this;
        }

        public QueryBuilder excludeSuppliersId(){
            setFetchFields("excludeFields","suppliersId");
            return this;
        }

        public QueryBuilder isCheckBetWeen(Integer isCheckSt,Integer isCheckEd){
            this.isCheckSt = isCheckSt;
            this.isCheckEd = isCheckEd;
            return this;
        }

        public QueryBuilder isCheckGreaterEqThan(Integer isCheckSt){
            this.isCheckSt = isCheckSt;
            return this;
        }
        public QueryBuilder isCheckLessEqThan(Integer isCheckEd){
            this.isCheckEd = isCheckEd;
            return this;
        }


        public QueryBuilder isCheck(Integer isCheck){
            setIsCheck(isCheck);
            return this;
        }

        public QueryBuilder isCheckList(Integer ... isCheck){
            this.isCheckList = solveNullList(isCheck);
            return this;
        }

        public QueryBuilder isCheckList(List<Integer> isCheck){
            this.isCheckList = isCheck;
            return this;
        }

        public QueryBuilder fetchIsCheck(){
            setFetchFields("fetchFields","isCheck");
            return this;
        }

        public QueryBuilder excludeIsCheck(){
            setFetchFields("excludeFields","isCheck");
            return this;
        }

        public QueryBuilder needIdcardBetWeen(Integer needIdcardSt,Integer needIdcardEd){
            this.needIdcardSt = needIdcardSt;
            this.needIdcardEd = needIdcardEd;
            return this;
        }

        public QueryBuilder needIdcardGreaterEqThan(Integer needIdcardSt){
            this.needIdcardSt = needIdcardSt;
            return this;
        }
        public QueryBuilder needIdcardLessEqThan(Integer needIdcardEd){
            this.needIdcardEd = needIdcardEd;
            return this;
        }


        public QueryBuilder needIdcard(Integer needIdcard){
            setNeedIdcard(needIdcard);
            return this;
        }

        public QueryBuilder needIdcardList(Integer ... needIdcard){
            this.needIdcardList = solveNullList(needIdcard);
            return this;
        }

        public QueryBuilder needIdcardList(List<Integer> needIdcard){
            this.needIdcardList = needIdcard;
            return this;
        }

        public QueryBuilder fetchNeedIdcard(){
            setFetchFields("fetchFields","needIdcard");
            return this;
        }

        public QueryBuilder excludeNeedIdcard(){
            setFetchFields("excludeFields","needIdcard");
            return this;
        }

        public QueryBuilder isBonusBetWeen(Integer isBonusSt,Integer isBonusEd){
            this.isBonusSt = isBonusSt;
            this.isBonusEd = isBonusEd;
            return this;
        }

        public QueryBuilder isBonusGreaterEqThan(Integer isBonusSt){
            this.isBonusSt = isBonusSt;
            return this;
        }
        public QueryBuilder isBonusLessEqThan(Integer isBonusEd){
            this.isBonusEd = isBonusEd;
            return this;
        }


        public QueryBuilder isBonus(Integer isBonus){
            setIsBonus(isBonus);
            return this;
        }

        public QueryBuilder isBonusList(Integer ... isBonus){
            this.isBonusList = solveNullList(isBonus);
            return this;
        }

        public QueryBuilder isBonusList(List<Integer> isBonus){
            this.isBonusList = isBonus;
            return this;
        }

        public QueryBuilder fetchIsBonus(){
            setFetchFields("fetchFields","isBonus");
            return this;
        }

        public QueryBuilder excludeIsBonus(){
            setFetchFields("excludeFields","isBonus");
            return this;
        }

        public QueryBuilder fuzzySecondaryTitle (List<String> fuzzySecondaryTitle){
            this.fuzzySecondaryTitle = fuzzySecondaryTitle;
            return this;
        }

        public QueryBuilder fuzzySecondaryTitle (String ... fuzzySecondaryTitle){
            this.fuzzySecondaryTitle = solveNullList(fuzzySecondaryTitle);
            return this;
        }

        public QueryBuilder rightFuzzySecondaryTitle (List<String> rightFuzzySecondaryTitle){
            this.rightFuzzySecondaryTitle = rightFuzzySecondaryTitle;
            return this;
        }

        public QueryBuilder rightFuzzySecondaryTitle (String ... rightFuzzySecondaryTitle){
            this.rightFuzzySecondaryTitle = solveNullList(rightFuzzySecondaryTitle);
            return this;
        }

        public QueryBuilder secondaryTitle(String secondaryTitle){
            setSecondaryTitle(secondaryTitle);
            return this;
        }

        public QueryBuilder secondaryTitleList(String ... secondaryTitle){
            this.secondaryTitleList = solveNullList(secondaryTitle);
            return this;
        }

        public QueryBuilder secondaryTitleList(List<String> secondaryTitle){
            this.secondaryTitleList = secondaryTitle;
            return this;
        }

        public QueryBuilder fetchSecondaryTitle(){
            setFetchFields("fetchFields","secondaryTitle");
            return this;
        }

        public QueryBuilder excludeSecondaryTitle(){
            setFetchFields("excludeFields","secondaryTitle");
            return this;
        }

        public QueryBuilder fuzzyTag (List<String> fuzzyTag){
            this.fuzzyTag = fuzzyTag;
            return this;
        }

        public QueryBuilder fuzzyTag (String ... fuzzyTag){
            this.fuzzyTag = solveNullList(fuzzyTag);
            return this;
        }

        public QueryBuilder rightFuzzyTag (List<String> rightFuzzyTag){
            this.rightFuzzyTag = rightFuzzyTag;
            return this;
        }

        public QueryBuilder rightFuzzyTag (String ... rightFuzzyTag){
            this.rightFuzzyTag = solveNullList(rightFuzzyTag);
            return this;
        }

        public QueryBuilder tag(String tag){
            setTag(tag);
            return this;
        }

        public QueryBuilder tagList(String ... tag){
            this.tagList = solveNullList(tag);
            return this;
        }

        public QueryBuilder tagList(List<String> tag){
            this.tagList = tag;
            return this;
        }

        public QueryBuilder fetchTag(){
            setFetchFields("fetchFields","tag");
            return this;
        }

        public QueryBuilder excludeTag(){
            setFetchFields("excludeFields","tag");
            return this;
        }

        public QueryBuilder shippingFeeBetWeen(java.math.BigDecimal shippingFeeSt,java.math.BigDecimal shippingFeeEd){
            this.shippingFeeSt = shippingFeeSt;
            this.shippingFeeEd = shippingFeeEd;
            return this;
        }

        public QueryBuilder shippingFeeGreaterEqThan(java.math.BigDecimal shippingFeeSt){
            this.shippingFeeSt = shippingFeeSt;
            return this;
        }
        public QueryBuilder shippingFeeLessEqThan(java.math.BigDecimal shippingFeeEd){
            this.shippingFeeEd = shippingFeeEd;
            return this;
        }


        public QueryBuilder shippingFee(java.math.BigDecimal shippingFee){
            setShippingFee(shippingFee);
            return this;
        }

        public QueryBuilder shippingFeeList(java.math.BigDecimal ... shippingFee){
            this.shippingFeeList = solveNullList(shippingFee);
            return this;
        }

        public QueryBuilder shippingFeeList(List<java.math.BigDecimal> shippingFee){
            this.shippingFeeList = shippingFee;
            return this;
        }

        public QueryBuilder fetchShippingFee(){
            setFetchFields("fetchFields","shippingFee");
            return this;
        }

        public QueryBuilder excludeShippingFee(){
            setFetchFields("excludeFields","shippingFee");
            return this;
        }

        public QueryBuilder fuzzyProductionPlace (List<String> fuzzyProductionPlace){
            this.fuzzyProductionPlace = fuzzyProductionPlace;
            return this;
        }

        public QueryBuilder fuzzyProductionPlace (String ... fuzzyProductionPlace){
            this.fuzzyProductionPlace = solveNullList(fuzzyProductionPlace);
            return this;
        }

        public QueryBuilder rightFuzzyProductionPlace (List<String> rightFuzzyProductionPlace){
            this.rightFuzzyProductionPlace = rightFuzzyProductionPlace;
            return this;
        }

        public QueryBuilder rightFuzzyProductionPlace (String ... rightFuzzyProductionPlace){
            this.rightFuzzyProductionPlace = solveNullList(rightFuzzyProductionPlace);
            return this;
        }

        public QueryBuilder productionPlace(String productionPlace){
            setProductionPlace(productionPlace);
            return this;
        }

        public QueryBuilder productionPlaceList(String ... productionPlace){
            this.productionPlaceList = solveNullList(productionPlace);
            return this;
        }

        public QueryBuilder productionPlaceList(List<String> productionPlace){
            this.productionPlaceList = productionPlace;
            return this;
        }

        public QueryBuilder fetchProductionPlace(){
            setFetchFields("fetchFields","productionPlace");
            return this;
        }

        public QueryBuilder excludeProductionPlace(){
            setFetchFields("excludeFields","productionPlace");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg1 (List<String> fuzzyGoodsImg1){
            this.fuzzyGoodsImg1 = fuzzyGoodsImg1;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg1 (String ... fuzzyGoodsImg1){
            this.fuzzyGoodsImg1 = solveNullList(fuzzyGoodsImg1);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg1 (List<String> rightFuzzyGoodsImg1){
            this.rightFuzzyGoodsImg1 = rightFuzzyGoodsImg1;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg1 (String ... rightFuzzyGoodsImg1){
            this.rightFuzzyGoodsImg1 = solveNullList(rightFuzzyGoodsImg1);
            return this;
        }

        public QueryBuilder goodsImg1(String goodsImg1){
            setGoodsImg1(goodsImg1);
            return this;
        }

        public QueryBuilder goodsImg1List(String ... goodsImg1){
            this.goodsImg1List = solveNullList(goodsImg1);
            return this;
        }

        public QueryBuilder goodsImg1List(List<String> goodsImg1){
            this.goodsImg1List = goodsImg1;
            return this;
        }

        public QueryBuilder fetchGoodsImg1(){
            setFetchFields("fetchFields","goodsImg1");
            return this;
        }

        public QueryBuilder excludeGoodsImg1(){
            setFetchFields("excludeFields","goodsImg1");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg2 (List<String> fuzzyGoodsImg2){
            this.fuzzyGoodsImg2 = fuzzyGoodsImg2;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg2 (String ... fuzzyGoodsImg2){
            this.fuzzyGoodsImg2 = solveNullList(fuzzyGoodsImg2);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg2 (List<String> rightFuzzyGoodsImg2){
            this.rightFuzzyGoodsImg2 = rightFuzzyGoodsImg2;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg2 (String ... rightFuzzyGoodsImg2){
            this.rightFuzzyGoodsImg2 = solveNullList(rightFuzzyGoodsImg2);
            return this;
        }

        public QueryBuilder goodsImg2(String goodsImg2){
            setGoodsImg2(goodsImg2);
            return this;
        }

        public QueryBuilder goodsImg2List(String ... goodsImg2){
            this.goodsImg2List = solveNullList(goodsImg2);
            return this;
        }

        public QueryBuilder goodsImg2List(List<String> goodsImg2){
            this.goodsImg2List = goodsImg2;
            return this;
        }

        public QueryBuilder fetchGoodsImg2(){
            setFetchFields("fetchFields","goodsImg2");
            return this;
        }

        public QueryBuilder excludeGoodsImg2(){
            setFetchFields("excludeFields","goodsImg2");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg3 (List<String> fuzzyGoodsImg3){
            this.fuzzyGoodsImg3 = fuzzyGoodsImg3;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg3 (String ... fuzzyGoodsImg3){
            this.fuzzyGoodsImg3 = solveNullList(fuzzyGoodsImg3);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg3 (List<String> rightFuzzyGoodsImg3){
            this.rightFuzzyGoodsImg3 = rightFuzzyGoodsImg3;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg3 (String ... rightFuzzyGoodsImg3){
            this.rightFuzzyGoodsImg3 = solveNullList(rightFuzzyGoodsImg3);
            return this;
        }

        public QueryBuilder goodsImg3(String goodsImg3){
            setGoodsImg3(goodsImg3);
            return this;
        }

        public QueryBuilder goodsImg3List(String ... goodsImg3){
            this.goodsImg3List = solveNullList(goodsImg3);
            return this;
        }

        public QueryBuilder goodsImg3List(List<String> goodsImg3){
            this.goodsImg3List = goodsImg3;
            return this;
        }

        public QueryBuilder fetchGoodsImg3(){
            setFetchFields("fetchFields","goodsImg3");
            return this;
        }

        public QueryBuilder excludeGoodsImg3(){
            setFetchFields("excludeFields","goodsImg3");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg4 (List<String> fuzzyGoodsImg4){
            this.fuzzyGoodsImg4 = fuzzyGoodsImg4;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg4 (String ... fuzzyGoodsImg4){
            this.fuzzyGoodsImg4 = solveNullList(fuzzyGoodsImg4);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg4 (List<String> rightFuzzyGoodsImg4){
            this.rightFuzzyGoodsImg4 = rightFuzzyGoodsImg4;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg4 (String ... rightFuzzyGoodsImg4){
            this.rightFuzzyGoodsImg4 = solveNullList(rightFuzzyGoodsImg4);
            return this;
        }

        public QueryBuilder goodsImg4(String goodsImg4){
            setGoodsImg4(goodsImg4);
            return this;
        }

        public QueryBuilder goodsImg4List(String ... goodsImg4){
            this.goodsImg4List = solveNullList(goodsImg4);
            return this;
        }

        public QueryBuilder goodsImg4List(List<String> goodsImg4){
            this.goodsImg4List = goodsImg4;
            return this;
        }

        public QueryBuilder fetchGoodsImg4(){
            setFetchFields("fetchFields","goodsImg4");
            return this;
        }

        public QueryBuilder excludeGoodsImg4(){
            setFetchFields("excludeFields","goodsImg4");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg5 (List<String> fuzzyGoodsImg5){
            this.fuzzyGoodsImg5 = fuzzyGoodsImg5;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg5 (String ... fuzzyGoodsImg5){
            this.fuzzyGoodsImg5 = solveNullList(fuzzyGoodsImg5);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg5 (List<String> rightFuzzyGoodsImg5){
            this.rightFuzzyGoodsImg5 = rightFuzzyGoodsImg5;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg5 (String ... rightFuzzyGoodsImg5){
            this.rightFuzzyGoodsImg5 = solveNullList(rightFuzzyGoodsImg5);
            return this;
        }

        public QueryBuilder goodsImg5(String goodsImg5){
            setGoodsImg5(goodsImg5);
            return this;
        }

        public QueryBuilder goodsImg5List(String ... goodsImg5){
            this.goodsImg5List = solveNullList(goodsImg5);
            return this;
        }

        public QueryBuilder goodsImg5List(List<String> goodsImg5){
            this.goodsImg5List = goodsImg5;
            return this;
        }

        public QueryBuilder fetchGoodsImg5(){
            setFetchFields("fetchFields","goodsImg5");
            return this;
        }

        public QueryBuilder excludeGoodsImg5(){
            setFetchFields("excludeFields","goodsImg5");
            return this;
        }

        public QueryBuilder fuzzyGoodsImg6 (List<String> fuzzyGoodsImg6){
            this.fuzzyGoodsImg6 = fuzzyGoodsImg6;
            return this;
        }

        public QueryBuilder fuzzyGoodsImg6 (String ... fuzzyGoodsImg6){
            this.fuzzyGoodsImg6 = solveNullList(fuzzyGoodsImg6);
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg6 (List<String> rightFuzzyGoodsImg6){
            this.rightFuzzyGoodsImg6 = rightFuzzyGoodsImg6;
            return this;
        }

        public QueryBuilder rightFuzzyGoodsImg6 (String ... rightFuzzyGoodsImg6){
            this.rightFuzzyGoodsImg6 = solveNullList(rightFuzzyGoodsImg6);
            return this;
        }

        public QueryBuilder goodsImg6(String goodsImg6){
            setGoodsImg6(goodsImg6);
            return this;
        }

        public QueryBuilder goodsImg6List(String ... goodsImg6){
            this.goodsImg6List = solveNullList(goodsImg6);
            return this;
        }

        public QueryBuilder goodsImg6List(List<String> goodsImg6){
            this.goodsImg6List = goodsImg6;
            return this;
        }

        public QueryBuilder fetchGoodsImg6(){
            setFetchFields("fetchFields","goodsImg6");
            return this;
        }

        public QueryBuilder excludeGoodsImg6(){
            setFetchFields("excludeFields","goodsImg6");
            return this;
        }

        public QueryBuilder fuzzySuppliers (List<String> fuzzySuppliers){
            this.fuzzySuppliers = fuzzySuppliers;
            return this;
        }

        public QueryBuilder fuzzySuppliers (String ... fuzzySuppliers){
            this.fuzzySuppliers = solveNullList(fuzzySuppliers);
            return this;
        }

        public QueryBuilder rightFuzzySuppliers (List<String> rightFuzzySuppliers){
            this.rightFuzzySuppliers = rightFuzzySuppliers;
            return this;
        }

        public QueryBuilder rightFuzzySuppliers (String ... rightFuzzySuppliers){
            this.rightFuzzySuppliers = solveNullList(rightFuzzySuppliers);
            return this;
        }

        public QueryBuilder suppliers(String suppliers){
            setSuppliers(suppliers);
            return this;
        }

        public QueryBuilder suppliersList(String ... suppliers){
            this.suppliersList = solveNullList(suppliers);
            return this;
        }

        public QueryBuilder suppliersList(List<String> suppliers){
            this.suppliersList = suppliers;
            return this;
        }

        public QueryBuilder fetchSuppliers(){
            setFetchFields("fetchFields","suppliers");
            return this;
        }

        public QueryBuilder excludeSuppliers(){
            setFetchFields("excludeFields","suppliers");
            return this;
        }

        public QueryBuilder fuzzyIsShowDesc (List<String> fuzzyIsShowDesc){
            this.fuzzyIsShowDesc = fuzzyIsShowDesc;
            return this;
        }

        public QueryBuilder fuzzyIsShowDesc (String ... fuzzyIsShowDesc){
            this.fuzzyIsShowDesc = solveNullList(fuzzyIsShowDesc);
            return this;
        }

        public QueryBuilder rightFuzzyIsShowDesc (List<String> rightFuzzyIsShowDesc){
            this.rightFuzzyIsShowDesc = rightFuzzyIsShowDesc;
            return this;
        }

        public QueryBuilder rightFuzzyIsShowDesc (String ... rightFuzzyIsShowDesc){
            this.rightFuzzyIsShowDesc = solveNullList(rightFuzzyIsShowDesc);
            return this;
        }

        public QueryBuilder isShowDesc(String isShowDesc){
            setIsShowDesc(isShowDesc);
            return this;
        }

        public QueryBuilder isShowDescList(String ... isShowDesc){
            this.isShowDescList = solveNullList(isShowDesc);
            return this;
        }

        public QueryBuilder isShowDescList(List<String> isShowDesc){
            this.isShowDescList = isShowDesc;
            return this;
        }

        public QueryBuilder fetchIsShowDesc(){
            setFetchFields("fetchFields","isShowDesc");
            return this;
        }

        public QueryBuilder excludeIsShowDesc(){
            setFetchFields("excludeFields","isShowDesc");
            return this;
        }

        public QueryBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public QueryBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public QueryBuilder description(String description){
            setDescription(description);
            return this;
        }

        public QueryBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public QueryBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public QueryBuilder fetchDescription(){
            setFetchFields("fetchFields","description");
            return this;
        }

        public QueryBuilder excludeDescription(){
            setFetchFields("excludeFields","description");
            return this;
        }

        public QueryBuilder fuzzySpecification1Name (List<String> fuzzySpecification1Name){
            this.fuzzySpecification1Name = fuzzySpecification1Name;
            return this;
        }

        public QueryBuilder fuzzySpecification1Name (String ... fuzzySpecification1Name){
            this.fuzzySpecification1Name = solveNullList(fuzzySpecification1Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification1Name (List<String> rightFuzzySpecification1Name){
            this.rightFuzzySpecification1Name = rightFuzzySpecification1Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification1Name (String ... rightFuzzySpecification1Name){
            this.rightFuzzySpecification1Name = solveNullList(rightFuzzySpecification1Name);
            return this;
        }

        public QueryBuilder specification1Name(String specification1Name){
            setSpecification1Name(specification1Name);
            return this;
        }

        public QueryBuilder specification1NameList(String ... specification1Name){
            this.specification1NameList = solveNullList(specification1Name);
            return this;
        }

        public QueryBuilder specification1NameList(List<String> specification1Name){
            this.specification1NameList = specification1Name;
            return this;
        }

        public QueryBuilder fetchSpecification1Name(){
            setFetchFields("fetchFields","specification1Name");
            return this;
        }

        public QueryBuilder excludeSpecification1Name(){
            setFetchFields("excludeFields","specification1Name");
            return this;
        }

        public QueryBuilder specification1PriceBetWeen(java.math.BigDecimal specification1PriceSt,java.math.BigDecimal specification1PriceEd){
            this.specification1PriceSt = specification1PriceSt;
            this.specification1PriceEd = specification1PriceEd;
            return this;
        }

        public QueryBuilder specification1PriceGreaterEqThan(java.math.BigDecimal specification1PriceSt){
            this.specification1PriceSt = specification1PriceSt;
            return this;
        }
        public QueryBuilder specification1PriceLessEqThan(java.math.BigDecimal specification1PriceEd){
            this.specification1PriceEd = specification1PriceEd;
            return this;
        }


        public QueryBuilder specification1Price(java.math.BigDecimal specification1Price){
            setSpecification1Price(specification1Price);
            return this;
        }

        public QueryBuilder specification1PriceList(java.math.BigDecimal ... specification1Price){
            this.specification1PriceList = solveNullList(specification1Price);
            return this;
        }

        public QueryBuilder specification1PriceList(List<java.math.BigDecimal> specification1Price){
            this.specification1PriceList = specification1Price;
            return this;
        }

        public QueryBuilder fetchSpecification1Price(){
            setFetchFields("fetchFields","specification1Price");
            return this;
        }

        public QueryBuilder excludeSpecification1Price(){
            setFetchFields("excludeFields","specification1Price");
            return this;
        }

        public QueryBuilder specification1ConsumeNumBetWeen(Integer specification1ConsumeNumSt,Integer specification1ConsumeNumEd){
            this.specification1ConsumeNumSt = specification1ConsumeNumSt;
            this.specification1ConsumeNumEd = specification1ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification1ConsumeNumGreaterEqThan(Integer specification1ConsumeNumSt){
            this.specification1ConsumeNumSt = specification1ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification1ConsumeNumLessEqThan(Integer specification1ConsumeNumEd){
            this.specification1ConsumeNumEd = specification1ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification1ConsumeNum(Integer specification1ConsumeNum){
            setSpecification1ConsumeNum(specification1ConsumeNum);
            return this;
        }

        public QueryBuilder specification1ConsumeNumList(Integer ... specification1ConsumeNum){
            this.specification1ConsumeNumList = solveNullList(specification1ConsumeNum);
            return this;
        }

        public QueryBuilder specification1ConsumeNumList(List<Integer> specification1ConsumeNum){
            this.specification1ConsumeNumList = specification1ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification1ConsumeNum(){
            setFetchFields("fetchFields","specification1ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification1ConsumeNum(){
            setFetchFields("excludeFields","specification1ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification2Name (List<String> fuzzySpecification2Name){
            this.fuzzySpecification2Name = fuzzySpecification2Name;
            return this;
        }

        public QueryBuilder fuzzySpecification2Name (String ... fuzzySpecification2Name){
            this.fuzzySpecification2Name = solveNullList(fuzzySpecification2Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification2Name (List<String> rightFuzzySpecification2Name){
            this.rightFuzzySpecification2Name = rightFuzzySpecification2Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification2Name (String ... rightFuzzySpecification2Name){
            this.rightFuzzySpecification2Name = solveNullList(rightFuzzySpecification2Name);
            return this;
        }

        public QueryBuilder specification2Name(String specification2Name){
            setSpecification2Name(specification2Name);
            return this;
        }

        public QueryBuilder specification2NameList(String ... specification2Name){
            this.specification2NameList = solveNullList(specification2Name);
            return this;
        }

        public QueryBuilder specification2NameList(List<String> specification2Name){
            this.specification2NameList = specification2Name;
            return this;
        }

        public QueryBuilder fetchSpecification2Name(){
            setFetchFields("fetchFields","specification2Name");
            return this;
        }

        public QueryBuilder excludeSpecification2Name(){
            setFetchFields("excludeFields","specification2Name");
            return this;
        }

        public QueryBuilder specification2PriceBetWeen(java.math.BigDecimal specification2PriceSt,java.math.BigDecimal specification2PriceEd){
            this.specification2PriceSt = specification2PriceSt;
            this.specification2PriceEd = specification2PriceEd;
            return this;
        }

        public QueryBuilder specification2PriceGreaterEqThan(java.math.BigDecimal specification2PriceSt){
            this.specification2PriceSt = specification2PriceSt;
            return this;
        }
        public QueryBuilder specification2PriceLessEqThan(java.math.BigDecimal specification2PriceEd){
            this.specification2PriceEd = specification2PriceEd;
            return this;
        }


        public QueryBuilder specification2Price(java.math.BigDecimal specification2Price){
            setSpecification2Price(specification2Price);
            return this;
        }

        public QueryBuilder specification2PriceList(java.math.BigDecimal ... specification2Price){
            this.specification2PriceList = solveNullList(specification2Price);
            return this;
        }

        public QueryBuilder specification2PriceList(List<java.math.BigDecimal> specification2Price){
            this.specification2PriceList = specification2Price;
            return this;
        }

        public QueryBuilder fetchSpecification2Price(){
            setFetchFields("fetchFields","specification2Price");
            return this;
        }

        public QueryBuilder excludeSpecification2Price(){
            setFetchFields("excludeFields","specification2Price");
            return this;
        }

        public QueryBuilder specification2ConsumeNumBetWeen(Integer specification2ConsumeNumSt,Integer specification2ConsumeNumEd){
            this.specification2ConsumeNumSt = specification2ConsumeNumSt;
            this.specification2ConsumeNumEd = specification2ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification2ConsumeNumGreaterEqThan(Integer specification2ConsumeNumSt){
            this.specification2ConsumeNumSt = specification2ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification2ConsumeNumLessEqThan(Integer specification2ConsumeNumEd){
            this.specification2ConsumeNumEd = specification2ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification2ConsumeNum(Integer specification2ConsumeNum){
            setSpecification2ConsumeNum(specification2ConsumeNum);
            return this;
        }

        public QueryBuilder specification2ConsumeNumList(Integer ... specification2ConsumeNum){
            this.specification2ConsumeNumList = solveNullList(specification2ConsumeNum);
            return this;
        }

        public QueryBuilder specification2ConsumeNumList(List<Integer> specification2ConsumeNum){
            this.specification2ConsumeNumList = specification2ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification2ConsumeNum(){
            setFetchFields("fetchFields","specification2ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification2ConsumeNum(){
            setFetchFields("excludeFields","specification2ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification3Name (List<String> fuzzySpecification3Name){
            this.fuzzySpecification3Name = fuzzySpecification3Name;
            return this;
        }

        public QueryBuilder fuzzySpecification3Name (String ... fuzzySpecification3Name){
            this.fuzzySpecification3Name = solveNullList(fuzzySpecification3Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification3Name (List<String> rightFuzzySpecification3Name){
            this.rightFuzzySpecification3Name = rightFuzzySpecification3Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification3Name (String ... rightFuzzySpecification3Name){
            this.rightFuzzySpecification3Name = solveNullList(rightFuzzySpecification3Name);
            return this;
        }

        public QueryBuilder specification3Name(String specification3Name){
            setSpecification3Name(specification3Name);
            return this;
        }

        public QueryBuilder specification3NameList(String ... specification3Name){
            this.specification3NameList = solveNullList(specification3Name);
            return this;
        }

        public QueryBuilder specification3NameList(List<String> specification3Name){
            this.specification3NameList = specification3Name;
            return this;
        }

        public QueryBuilder fetchSpecification3Name(){
            setFetchFields("fetchFields","specification3Name");
            return this;
        }

        public QueryBuilder excludeSpecification3Name(){
            setFetchFields("excludeFields","specification3Name");
            return this;
        }

        public QueryBuilder specification3PriceBetWeen(java.math.BigDecimal specification3PriceSt,java.math.BigDecimal specification3PriceEd){
            this.specification3PriceSt = specification3PriceSt;
            this.specification3PriceEd = specification3PriceEd;
            return this;
        }

        public QueryBuilder specification3PriceGreaterEqThan(java.math.BigDecimal specification3PriceSt){
            this.specification3PriceSt = specification3PriceSt;
            return this;
        }
        public QueryBuilder specification3PriceLessEqThan(java.math.BigDecimal specification3PriceEd){
            this.specification3PriceEd = specification3PriceEd;
            return this;
        }


        public QueryBuilder specification3Price(java.math.BigDecimal specification3Price){
            setSpecification3Price(specification3Price);
            return this;
        }

        public QueryBuilder specification3PriceList(java.math.BigDecimal ... specification3Price){
            this.specification3PriceList = solveNullList(specification3Price);
            return this;
        }

        public QueryBuilder specification3PriceList(List<java.math.BigDecimal> specification3Price){
            this.specification3PriceList = specification3Price;
            return this;
        }

        public QueryBuilder fetchSpecification3Price(){
            setFetchFields("fetchFields","specification3Price");
            return this;
        }

        public QueryBuilder excludeSpecification3Price(){
            setFetchFields("excludeFields","specification3Price");
            return this;
        }

        public QueryBuilder specification3ConsumeNumBetWeen(Integer specification3ConsumeNumSt,Integer specification3ConsumeNumEd){
            this.specification3ConsumeNumSt = specification3ConsumeNumSt;
            this.specification3ConsumeNumEd = specification3ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification3ConsumeNumGreaterEqThan(Integer specification3ConsumeNumSt){
            this.specification3ConsumeNumSt = specification3ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification3ConsumeNumLessEqThan(Integer specification3ConsumeNumEd){
            this.specification3ConsumeNumEd = specification3ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification3ConsumeNum(Integer specification3ConsumeNum){
            setSpecification3ConsumeNum(specification3ConsumeNum);
            return this;
        }

        public QueryBuilder specification3ConsumeNumList(Integer ... specification3ConsumeNum){
            this.specification3ConsumeNumList = solveNullList(specification3ConsumeNum);
            return this;
        }

        public QueryBuilder specification3ConsumeNumList(List<Integer> specification3ConsumeNum){
            this.specification3ConsumeNumList = specification3ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification3ConsumeNum(){
            setFetchFields("fetchFields","specification3ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification3ConsumeNum(){
            setFetchFields("excludeFields","specification3ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification4Name (List<String> fuzzySpecification4Name){
            this.fuzzySpecification4Name = fuzzySpecification4Name;
            return this;
        }

        public QueryBuilder fuzzySpecification4Name (String ... fuzzySpecification4Name){
            this.fuzzySpecification4Name = solveNullList(fuzzySpecification4Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification4Name (List<String> rightFuzzySpecification4Name){
            this.rightFuzzySpecification4Name = rightFuzzySpecification4Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification4Name (String ... rightFuzzySpecification4Name){
            this.rightFuzzySpecification4Name = solveNullList(rightFuzzySpecification4Name);
            return this;
        }

        public QueryBuilder specification4Name(String specification4Name){
            setSpecification4Name(specification4Name);
            return this;
        }

        public QueryBuilder specification4NameList(String ... specification4Name){
            this.specification4NameList = solveNullList(specification4Name);
            return this;
        }

        public QueryBuilder specification4NameList(List<String> specification4Name){
            this.specification4NameList = specification4Name;
            return this;
        }

        public QueryBuilder fetchSpecification4Name(){
            setFetchFields("fetchFields","specification4Name");
            return this;
        }

        public QueryBuilder excludeSpecification4Name(){
            setFetchFields("excludeFields","specification4Name");
            return this;
        }

        public QueryBuilder specification4PriceBetWeen(java.math.BigDecimal specification4PriceSt,java.math.BigDecimal specification4PriceEd){
            this.specification4PriceSt = specification4PriceSt;
            this.specification4PriceEd = specification4PriceEd;
            return this;
        }

        public QueryBuilder specification4PriceGreaterEqThan(java.math.BigDecimal specification4PriceSt){
            this.specification4PriceSt = specification4PriceSt;
            return this;
        }
        public QueryBuilder specification4PriceLessEqThan(java.math.BigDecimal specification4PriceEd){
            this.specification4PriceEd = specification4PriceEd;
            return this;
        }


        public QueryBuilder specification4Price(java.math.BigDecimal specification4Price){
            setSpecification4Price(specification4Price);
            return this;
        }

        public QueryBuilder specification4PriceList(java.math.BigDecimal ... specification4Price){
            this.specification4PriceList = solveNullList(specification4Price);
            return this;
        }

        public QueryBuilder specification4PriceList(List<java.math.BigDecimal> specification4Price){
            this.specification4PriceList = specification4Price;
            return this;
        }

        public QueryBuilder fetchSpecification4Price(){
            setFetchFields("fetchFields","specification4Price");
            return this;
        }

        public QueryBuilder excludeSpecification4Price(){
            setFetchFields("excludeFields","specification4Price");
            return this;
        }

        public QueryBuilder specification4ConsumeNumBetWeen(Integer specification4ConsumeNumSt,Integer specification4ConsumeNumEd){
            this.specification4ConsumeNumSt = specification4ConsumeNumSt;
            this.specification4ConsumeNumEd = specification4ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification4ConsumeNumGreaterEqThan(Integer specification4ConsumeNumSt){
            this.specification4ConsumeNumSt = specification4ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification4ConsumeNumLessEqThan(Integer specification4ConsumeNumEd){
            this.specification4ConsumeNumEd = specification4ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification4ConsumeNum(Integer specification4ConsumeNum){
            setSpecification4ConsumeNum(specification4ConsumeNum);
            return this;
        }

        public QueryBuilder specification4ConsumeNumList(Integer ... specification4ConsumeNum){
            this.specification4ConsumeNumList = solveNullList(specification4ConsumeNum);
            return this;
        }

        public QueryBuilder specification4ConsumeNumList(List<Integer> specification4ConsumeNum){
            this.specification4ConsumeNumList = specification4ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification4ConsumeNum(){
            setFetchFields("fetchFields","specification4ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification4ConsumeNum(){
            setFetchFields("excludeFields","specification4ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification5Name (List<String> fuzzySpecification5Name){
            this.fuzzySpecification5Name = fuzzySpecification5Name;
            return this;
        }

        public QueryBuilder fuzzySpecification5Name (String ... fuzzySpecification5Name){
            this.fuzzySpecification5Name = solveNullList(fuzzySpecification5Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification5Name (List<String> rightFuzzySpecification5Name){
            this.rightFuzzySpecification5Name = rightFuzzySpecification5Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification5Name (String ... rightFuzzySpecification5Name){
            this.rightFuzzySpecification5Name = solveNullList(rightFuzzySpecification5Name);
            return this;
        }

        public QueryBuilder specification5Name(String specification5Name){
            setSpecification5Name(specification5Name);
            return this;
        }

        public QueryBuilder specification5NameList(String ... specification5Name){
            this.specification5NameList = solveNullList(specification5Name);
            return this;
        }

        public QueryBuilder specification5NameList(List<String> specification5Name){
            this.specification5NameList = specification5Name;
            return this;
        }

        public QueryBuilder fetchSpecification5Name(){
            setFetchFields("fetchFields","specification5Name");
            return this;
        }

        public QueryBuilder excludeSpecification5Name(){
            setFetchFields("excludeFields","specification5Name");
            return this;
        }

        public QueryBuilder specification5PriceBetWeen(java.math.BigDecimal specification5PriceSt,java.math.BigDecimal specification5PriceEd){
            this.specification5PriceSt = specification5PriceSt;
            this.specification5PriceEd = specification5PriceEd;
            return this;
        }

        public QueryBuilder specification5PriceGreaterEqThan(java.math.BigDecimal specification5PriceSt){
            this.specification5PriceSt = specification5PriceSt;
            return this;
        }
        public QueryBuilder specification5PriceLessEqThan(java.math.BigDecimal specification5PriceEd){
            this.specification5PriceEd = specification5PriceEd;
            return this;
        }


        public QueryBuilder specification5Price(java.math.BigDecimal specification5Price){
            setSpecification5Price(specification5Price);
            return this;
        }

        public QueryBuilder specification5PriceList(java.math.BigDecimal ... specification5Price){
            this.specification5PriceList = solveNullList(specification5Price);
            return this;
        }

        public QueryBuilder specification5PriceList(List<java.math.BigDecimal> specification5Price){
            this.specification5PriceList = specification5Price;
            return this;
        }

        public QueryBuilder fetchSpecification5Price(){
            setFetchFields("fetchFields","specification5Price");
            return this;
        }

        public QueryBuilder excludeSpecification5Price(){
            setFetchFields("excludeFields","specification5Price");
            return this;
        }

        public QueryBuilder specification5ConsumeNumBetWeen(Integer specification5ConsumeNumSt,Integer specification5ConsumeNumEd){
            this.specification5ConsumeNumSt = specification5ConsumeNumSt;
            this.specification5ConsumeNumEd = specification5ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification5ConsumeNumGreaterEqThan(Integer specification5ConsumeNumSt){
            this.specification5ConsumeNumSt = specification5ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification5ConsumeNumLessEqThan(Integer specification5ConsumeNumEd){
            this.specification5ConsumeNumEd = specification5ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification5ConsumeNum(Integer specification5ConsumeNum){
            setSpecification5ConsumeNum(specification5ConsumeNum);
            return this;
        }

        public QueryBuilder specification5ConsumeNumList(Integer ... specification5ConsumeNum){
            this.specification5ConsumeNumList = solveNullList(specification5ConsumeNum);
            return this;
        }

        public QueryBuilder specification5ConsumeNumList(List<Integer> specification5ConsumeNum){
            this.specification5ConsumeNumList = specification5ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification5ConsumeNum(){
            setFetchFields("fetchFields","specification5ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification5ConsumeNum(){
            setFetchFields("excludeFields","specification5ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification6Name (List<String> fuzzySpecification6Name){
            this.fuzzySpecification6Name = fuzzySpecification6Name;
            return this;
        }

        public QueryBuilder fuzzySpecification6Name (String ... fuzzySpecification6Name){
            this.fuzzySpecification6Name = solveNullList(fuzzySpecification6Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification6Name (List<String> rightFuzzySpecification6Name){
            this.rightFuzzySpecification6Name = rightFuzzySpecification6Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification6Name (String ... rightFuzzySpecification6Name){
            this.rightFuzzySpecification6Name = solveNullList(rightFuzzySpecification6Name);
            return this;
        }

        public QueryBuilder specification6Name(String specification6Name){
            setSpecification6Name(specification6Name);
            return this;
        }

        public QueryBuilder specification6NameList(String ... specification6Name){
            this.specification6NameList = solveNullList(specification6Name);
            return this;
        }

        public QueryBuilder specification6NameList(List<String> specification6Name){
            this.specification6NameList = specification6Name;
            return this;
        }

        public QueryBuilder fetchSpecification6Name(){
            setFetchFields("fetchFields","specification6Name");
            return this;
        }

        public QueryBuilder excludeSpecification6Name(){
            setFetchFields("excludeFields","specification6Name");
            return this;
        }

        public QueryBuilder specification6PriceBetWeen(java.math.BigDecimal specification6PriceSt,java.math.BigDecimal specification6PriceEd){
            this.specification6PriceSt = specification6PriceSt;
            this.specification6PriceEd = specification6PriceEd;
            return this;
        }

        public QueryBuilder specification6PriceGreaterEqThan(java.math.BigDecimal specification6PriceSt){
            this.specification6PriceSt = specification6PriceSt;
            return this;
        }
        public QueryBuilder specification6PriceLessEqThan(java.math.BigDecimal specification6PriceEd){
            this.specification6PriceEd = specification6PriceEd;
            return this;
        }


        public QueryBuilder specification6Price(java.math.BigDecimal specification6Price){
            setSpecification6Price(specification6Price);
            return this;
        }

        public QueryBuilder specification6PriceList(java.math.BigDecimal ... specification6Price){
            this.specification6PriceList = solveNullList(specification6Price);
            return this;
        }

        public QueryBuilder specification6PriceList(List<java.math.BigDecimal> specification6Price){
            this.specification6PriceList = specification6Price;
            return this;
        }

        public QueryBuilder fetchSpecification6Price(){
            setFetchFields("fetchFields","specification6Price");
            return this;
        }

        public QueryBuilder excludeSpecification6Price(){
            setFetchFields("excludeFields","specification6Price");
            return this;
        }

        public QueryBuilder specification6ConsumeNumBetWeen(Integer specification6ConsumeNumSt,Integer specification6ConsumeNumEd){
            this.specification6ConsumeNumSt = specification6ConsumeNumSt;
            this.specification6ConsumeNumEd = specification6ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification6ConsumeNumGreaterEqThan(Integer specification6ConsumeNumSt){
            this.specification6ConsumeNumSt = specification6ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification6ConsumeNumLessEqThan(Integer specification6ConsumeNumEd){
            this.specification6ConsumeNumEd = specification6ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification6ConsumeNum(Integer specification6ConsumeNum){
            setSpecification6ConsumeNum(specification6ConsumeNum);
            return this;
        }

        public QueryBuilder specification6ConsumeNumList(Integer ... specification6ConsumeNum){
            this.specification6ConsumeNumList = solveNullList(specification6ConsumeNum);
            return this;
        }

        public QueryBuilder specification6ConsumeNumList(List<Integer> specification6ConsumeNum){
            this.specification6ConsumeNumList = specification6ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification6ConsumeNum(){
            setFetchFields("fetchFields","specification6ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification6ConsumeNum(){
            setFetchFields("excludeFields","specification6ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification7Name (List<String> fuzzySpecification7Name){
            this.fuzzySpecification7Name = fuzzySpecification7Name;
            return this;
        }

        public QueryBuilder fuzzySpecification7Name (String ... fuzzySpecification7Name){
            this.fuzzySpecification7Name = solveNullList(fuzzySpecification7Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification7Name (List<String> rightFuzzySpecification7Name){
            this.rightFuzzySpecification7Name = rightFuzzySpecification7Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification7Name (String ... rightFuzzySpecification7Name){
            this.rightFuzzySpecification7Name = solveNullList(rightFuzzySpecification7Name);
            return this;
        }

        public QueryBuilder specification7Name(String specification7Name){
            setSpecification7Name(specification7Name);
            return this;
        }

        public QueryBuilder specification7NameList(String ... specification7Name){
            this.specification7NameList = solveNullList(specification7Name);
            return this;
        }

        public QueryBuilder specification7NameList(List<String> specification7Name){
            this.specification7NameList = specification7Name;
            return this;
        }

        public QueryBuilder fetchSpecification7Name(){
            setFetchFields("fetchFields","specification7Name");
            return this;
        }

        public QueryBuilder excludeSpecification7Name(){
            setFetchFields("excludeFields","specification7Name");
            return this;
        }

        public QueryBuilder specification7PriceBetWeen(java.math.BigDecimal specification7PriceSt,java.math.BigDecimal specification7PriceEd){
            this.specification7PriceSt = specification7PriceSt;
            this.specification7PriceEd = specification7PriceEd;
            return this;
        }

        public QueryBuilder specification7PriceGreaterEqThan(java.math.BigDecimal specification7PriceSt){
            this.specification7PriceSt = specification7PriceSt;
            return this;
        }
        public QueryBuilder specification7PriceLessEqThan(java.math.BigDecimal specification7PriceEd){
            this.specification7PriceEd = specification7PriceEd;
            return this;
        }


        public QueryBuilder specification7Price(java.math.BigDecimal specification7Price){
            setSpecification7Price(specification7Price);
            return this;
        }

        public QueryBuilder specification7PriceList(java.math.BigDecimal ... specification7Price){
            this.specification7PriceList = solveNullList(specification7Price);
            return this;
        }

        public QueryBuilder specification7PriceList(List<java.math.BigDecimal> specification7Price){
            this.specification7PriceList = specification7Price;
            return this;
        }

        public QueryBuilder fetchSpecification7Price(){
            setFetchFields("fetchFields","specification7Price");
            return this;
        }

        public QueryBuilder excludeSpecification7Price(){
            setFetchFields("excludeFields","specification7Price");
            return this;
        }

        public QueryBuilder specification7ConsumeNumBetWeen(Integer specification7ConsumeNumSt,Integer specification7ConsumeNumEd){
            this.specification7ConsumeNumSt = specification7ConsumeNumSt;
            this.specification7ConsumeNumEd = specification7ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification7ConsumeNumGreaterEqThan(Integer specification7ConsumeNumSt){
            this.specification7ConsumeNumSt = specification7ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification7ConsumeNumLessEqThan(Integer specification7ConsumeNumEd){
            this.specification7ConsumeNumEd = specification7ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification7ConsumeNum(Integer specification7ConsumeNum){
            setSpecification7ConsumeNum(specification7ConsumeNum);
            return this;
        }

        public QueryBuilder specification7ConsumeNumList(Integer ... specification7ConsumeNum){
            this.specification7ConsumeNumList = solveNullList(specification7ConsumeNum);
            return this;
        }

        public QueryBuilder specification7ConsumeNumList(List<Integer> specification7ConsumeNum){
            this.specification7ConsumeNumList = specification7ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification7ConsumeNum(){
            setFetchFields("fetchFields","specification7ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification7ConsumeNum(){
            setFetchFields("excludeFields","specification7ConsumeNum");
            return this;
        }

        public QueryBuilder fuzzySpecification8Name (List<String> fuzzySpecification8Name){
            this.fuzzySpecification8Name = fuzzySpecification8Name;
            return this;
        }

        public QueryBuilder fuzzySpecification8Name (String ... fuzzySpecification8Name){
            this.fuzzySpecification8Name = solveNullList(fuzzySpecification8Name);
            return this;
        }

        public QueryBuilder rightFuzzySpecification8Name (List<String> rightFuzzySpecification8Name){
            this.rightFuzzySpecification8Name = rightFuzzySpecification8Name;
            return this;
        }

        public QueryBuilder rightFuzzySpecification8Name (String ... rightFuzzySpecification8Name){
            this.rightFuzzySpecification8Name = solveNullList(rightFuzzySpecification8Name);
            return this;
        }

        public QueryBuilder specification8Name(String specification8Name){
            setSpecification8Name(specification8Name);
            return this;
        }

        public QueryBuilder specification8NameList(String ... specification8Name){
            this.specification8NameList = solveNullList(specification8Name);
            return this;
        }

        public QueryBuilder specification8NameList(List<String> specification8Name){
            this.specification8NameList = specification8Name;
            return this;
        }

        public QueryBuilder fetchSpecification8Name(){
            setFetchFields("fetchFields","specification8Name");
            return this;
        }

        public QueryBuilder excludeSpecification8Name(){
            setFetchFields("excludeFields","specification8Name");
            return this;
        }

        public QueryBuilder specification8PriceBetWeen(java.math.BigDecimal specification8PriceSt,java.math.BigDecimal specification8PriceEd){
            this.specification8PriceSt = specification8PriceSt;
            this.specification8PriceEd = specification8PriceEd;
            return this;
        }

        public QueryBuilder specification8PriceGreaterEqThan(java.math.BigDecimal specification8PriceSt){
            this.specification8PriceSt = specification8PriceSt;
            return this;
        }
        public QueryBuilder specification8PriceLessEqThan(java.math.BigDecimal specification8PriceEd){
            this.specification8PriceEd = specification8PriceEd;
            return this;
        }


        public QueryBuilder specification8Price(java.math.BigDecimal specification8Price){
            setSpecification8Price(specification8Price);
            return this;
        }

        public QueryBuilder specification8PriceList(java.math.BigDecimal ... specification8Price){
            this.specification8PriceList = solveNullList(specification8Price);
            return this;
        }

        public QueryBuilder specification8PriceList(List<java.math.BigDecimal> specification8Price){
            this.specification8PriceList = specification8Price;
            return this;
        }

        public QueryBuilder fetchSpecification8Price(){
            setFetchFields("fetchFields","specification8Price");
            return this;
        }

        public QueryBuilder excludeSpecification8Price(){
            setFetchFields("excludeFields","specification8Price");
            return this;
        }

        public QueryBuilder specification8ConsumeNumBetWeen(Integer specification8ConsumeNumSt,Integer specification8ConsumeNumEd){
            this.specification8ConsumeNumSt = specification8ConsumeNumSt;
            this.specification8ConsumeNumEd = specification8ConsumeNumEd;
            return this;
        }

        public QueryBuilder specification8ConsumeNumGreaterEqThan(Integer specification8ConsumeNumSt){
            this.specification8ConsumeNumSt = specification8ConsumeNumSt;
            return this;
        }
        public QueryBuilder specification8ConsumeNumLessEqThan(Integer specification8ConsumeNumEd){
            this.specification8ConsumeNumEd = specification8ConsumeNumEd;
            return this;
        }


        public QueryBuilder specification8ConsumeNum(Integer specification8ConsumeNum){
            setSpecification8ConsumeNum(specification8ConsumeNum);
            return this;
        }

        public QueryBuilder specification8ConsumeNumList(Integer ... specification8ConsumeNum){
            this.specification8ConsumeNumList = solveNullList(specification8ConsumeNum);
            return this;
        }

        public QueryBuilder specification8ConsumeNumList(List<Integer> specification8ConsumeNum){
            this.specification8ConsumeNumList = specification8ConsumeNum;
            return this;
        }

        public QueryBuilder fetchSpecification8ConsumeNum(){
            setFetchFields("fetchFields","specification8ConsumeNum");
            return this;
        }

        public QueryBuilder excludeSpecification8ConsumeNum(){
            setFetchFields("excludeFields","specification8ConsumeNum");
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

        public EcsGoods build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<Integer> catIdList;

        public List<Integer> getCatIdList(){return this.catIdList;}

        private Integer catIdSt;

        private Integer catIdEd;

        public Integer getCatIdSt(){return this.catIdSt;}

        public Integer getCatIdEd(){return this.catIdEd;}

        private List<String> goodsSnList;

        public List<String> getGoodsSnList(){return this.goodsSnList;}


        private List<String> fuzzyGoodsSn;

        public List<String> getFuzzyGoodsSn(){return this.fuzzyGoodsSn;}

        private List<String> rightFuzzyGoodsSn;

        public List<String> getRightFuzzyGoodsSn(){return this.rightFuzzyGoodsSn;}
        private List<String> goodsNameList;

        public List<String> getGoodsNameList(){return this.goodsNameList;}


        private List<String> fuzzyGoodsName;

        public List<String> getFuzzyGoodsName(){return this.fuzzyGoodsName;}

        private List<String> rightFuzzyGoodsName;

        public List<String> getRightFuzzyGoodsName(){return this.rightFuzzyGoodsName;}
        private List<String> goodsNameStyleList;

        public List<String> getGoodsNameStyleList(){return this.goodsNameStyleList;}


        private List<String> fuzzyGoodsNameStyle;

        public List<String> getFuzzyGoodsNameStyle(){return this.fuzzyGoodsNameStyle;}

        private List<String> rightFuzzyGoodsNameStyle;

        public List<String> getRightFuzzyGoodsNameStyle(){return this.rightFuzzyGoodsNameStyle;}
        private List<Integer> clickCountList;

        public List<Integer> getClickCountList(){return this.clickCountList;}

        private Integer clickCountSt;

        private Integer clickCountEd;

        public Integer getClickCountSt(){return this.clickCountSt;}

        public Integer getClickCountEd(){return this.clickCountEd;}

        private List<Integer> brandIdList;

        public List<Integer> getBrandIdList(){return this.brandIdList;}

        private Integer brandIdSt;

        private Integer brandIdEd;

        public Integer getBrandIdSt(){return this.brandIdSt;}

        public Integer getBrandIdEd(){return this.brandIdEd;}

        private List<String> providerNameList;

        public List<String> getProviderNameList(){return this.providerNameList;}


        private List<String> fuzzyProviderName;

        public List<String> getFuzzyProviderName(){return this.fuzzyProviderName;}

        private List<String> rightFuzzyProviderName;

        public List<String> getRightFuzzyProviderName(){return this.rightFuzzyProviderName;}
        private List<Integer> goodsNumberList;

        public List<Integer> getGoodsNumberList(){return this.goodsNumberList;}

        private Integer goodsNumberSt;

        private Integer goodsNumberEd;

        public Integer getGoodsNumberSt(){return this.goodsNumberSt;}

        public Integer getGoodsNumberEd(){return this.goodsNumberEd;}

        private List<java.math.BigDecimal> goodsWeightList;

        public List<java.math.BigDecimal> getGoodsWeightList(){return this.goodsWeightList;}

        private java.math.BigDecimal goodsWeightSt;

        private java.math.BigDecimal goodsWeightEd;

        public java.math.BigDecimal getGoodsWeightSt(){return this.goodsWeightSt;}

        public java.math.BigDecimal getGoodsWeightEd(){return this.goodsWeightEd;}

        private List<java.math.BigDecimal> marketPriceList;

        public List<java.math.BigDecimal> getMarketPriceList(){return this.marketPriceList;}

        private java.math.BigDecimal marketPriceSt;

        private java.math.BigDecimal marketPriceEd;

        public java.math.BigDecimal getMarketPriceSt(){return this.marketPriceSt;}

        public java.math.BigDecimal getMarketPriceEd(){return this.marketPriceEd;}

        private List<Integer> virtualSalesList;

        public List<Integer> getVirtualSalesList(){return this.virtualSalesList;}

        private Integer virtualSalesSt;

        private Integer virtualSalesEd;

        public Integer getVirtualSalesSt(){return this.virtualSalesSt;}

        public Integer getVirtualSalesEd(){return this.virtualSalesEd;}

        private List<java.math.BigDecimal> shopPriceList;

        public List<java.math.BigDecimal> getShopPriceList(){return this.shopPriceList;}

        private java.math.BigDecimal shopPriceSt;

        private java.math.BigDecimal shopPriceEd;

        public java.math.BigDecimal getShopPriceSt(){return this.shopPriceSt;}

        public java.math.BigDecimal getShopPriceEd(){return this.shopPriceEd;}

        private List<java.math.BigDecimal> promotePriceList;

        public List<java.math.BigDecimal> getPromotePriceList(){return this.promotePriceList;}

        private java.math.BigDecimal promotePriceSt;

        private java.math.BigDecimal promotePriceEd;

        public java.math.BigDecimal getPromotePriceSt(){return this.promotePriceSt;}

        public java.math.BigDecimal getPromotePriceEd(){return this.promotePriceEd;}

        private List<Integer> promoteStartDateList;

        public List<Integer> getPromoteStartDateList(){return this.promoteStartDateList;}

        private Integer promoteStartDateSt;

        private Integer promoteStartDateEd;

        public Integer getPromoteStartDateSt(){return this.promoteStartDateSt;}

        public Integer getPromoteStartDateEd(){return this.promoteStartDateEd;}

        private List<Integer> promoteEndDateList;

        public List<Integer> getPromoteEndDateList(){return this.promoteEndDateList;}

        private Integer promoteEndDateSt;

        private Integer promoteEndDateEd;

        public Integer getPromoteEndDateSt(){return this.promoteEndDateSt;}

        public Integer getPromoteEndDateEd(){return this.promoteEndDateEd;}

        private List<String> warnNumberList;

        public List<String> getWarnNumberList(){return this.warnNumberList;}


        private List<String> fuzzyWarnNumber;

        public List<String> getFuzzyWarnNumber(){return this.fuzzyWarnNumber;}

        private List<String> rightFuzzyWarnNumber;

        public List<String> getRightFuzzyWarnNumber(){return this.rightFuzzyWarnNumber;}
        private List<String> keywordsList;

        public List<String> getKeywordsList(){return this.keywordsList;}


        private List<String> fuzzyKeywords;

        public List<String> getFuzzyKeywords(){return this.fuzzyKeywords;}

        private List<String> rightFuzzyKeywords;

        public List<String> getRightFuzzyKeywords(){return this.rightFuzzyKeywords;}
        private List<String> goodsBriefList;

        public List<String> getGoodsBriefList(){return this.goodsBriefList;}


        private List<String> fuzzyGoodsBrief;

        public List<String> getFuzzyGoodsBrief(){return this.fuzzyGoodsBrief;}

        private List<String> rightFuzzyGoodsBrief;

        public List<String> getRightFuzzyGoodsBrief(){return this.rightFuzzyGoodsBrief;}
        private List<String> goodsDescList;

        public List<String> getGoodsDescList(){return this.goodsDescList;}


        private List<String> fuzzyGoodsDesc;

        public List<String> getFuzzyGoodsDesc(){return this.fuzzyGoodsDesc;}

        private List<String> rightFuzzyGoodsDesc;

        public List<String> getRightFuzzyGoodsDesc(){return this.rightFuzzyGoodsDesc;}
        private List<String> goodsThumbList;

        public List<String> getGoodsThumbList(){return this.goodsThumbList;}


        private List<String> fuzzyGoodsThumb;

        public List<String> getFuzzyGoodsThumb(){return this.fuzzyGoodsThumb;}

        private List<String> rightFuzzyGoodsThumb;

        public List<String> getRightFuzzyGoodsThumb(){return this.rightFuzzyGoodsThumb;}
        private List<String> goodsImgList;

        public List<String> getGoodsImgList(){return this.goodsImgList;}


        private List<String> fuzzyGoodsImg;

        public List<String> getFuzzyGoodsImg(){return this.fuzzyGoodsImg;}

        private List<String> rightFuzzyGoodsImg;

        public List<String> getRightFuzzyGoodsImg(){return this.rightFuzzyGoodsImg;}
        private List<String> originalImgList;

        public List<String> getOriginalImgList(){return this.originalImgList;}


        private List<String> fuzzyOriginalImg;

        public List<String> getFuzzyOriginalImg(){return this.fuzzyOriginalImg;}

        private List<String> rightFuzzyOriginalImg;

        public List<String> getRightFuzzyOriginalImg(){return this.rightFuzzyOriginalImg;}
        private List<Integer> isRealList;

        public List<Integer> getIsRealList(){return this.isRealList;}

        private Integer isRealSt;

        private Integer isRealEd;

        public Integer getIsRealSt(){return this.isRealSt;}

        public Integer getIsRealEd(){return this.isRealEd;}

        private List<String> extensionCodeList;

        public List<String> getExtensionCodeList(){return this.extensionCodeList;}


        private List<String> fuzzyExtensionCode;

        public List<String> getFuzzyExtensionCode(){return this.fuzzyExtensionCode;}

        private List<String> rightFuzzyExtensionCode;

        public List<String> getRightFuzzyExtensionCode(){return this.rightFuzzyExtensionCode;}
        private List<Integer> isOnSaleList;

        public List<Integer> getIsOnSaleList(){return this.isOnSaleList;}

        private Integer isOnSaleSt;

        private Integer isOnSaleEd;

        public Integer getIsOnSaleSt(){return this.isOnSaleSt;}

        public Integer getIsOnSaleEd(){return this.isOnSaleEd;}

        private List<Integer> isAloneSaleList;

        public List<Integer> getIsAloneSaleList(){return this.isAloneSaleList;}

        private Integer isAloneSaleSt;

        private Integer isAloneSaleEd;

        public Integer getIsAloneSaleSt(){return this.isAloneSaleSt;}

        public Integer getIsAloneSaleEd(){return this.isAloneSaleEd;}

        private List<Integer> isShippingList;

        public List<Integer> getIsShippingList(){return this.isShippingList;}

        private Integer isShippingSt;

        private Integer isShippingEd;

        public Integer getIsShippingSt(){return this.isShippingSt;}

        public Integer getIsShippingEd(){return this.isShippingEd;}

        private List<Integer> integralList;

        public List<Integer> getIntegralList(){return this.integralList;}

        private Integer integralSt;

        private Integer integralEd;

        public Integer getIntegralSt(){return this.integralSt;}

        public Integer getIntegralEd(){return this.integralEd;}

        private List<Integer> addTimeList;

        public List<Integer> getAddTimeList(){return this.addTimeList;}

        private Integer addTimeSt;

        private Integer addTimeEd;

        public Integer getAddTimeSt(){return this.addTimeSt;}

        public Integer getAddTimeEd(){return this.addTimeEd;}

        private List<Integer> sortOrderList;

        public List<Integer> getSortOrderList(){return this.sortOrderList;}

        private Integer sortOrderSt;

        private Integer sortOrderEd;

        public Integer getSortOrderSt(){return this.sortOrderSt;}

        public Integer getSortOrderEd(){return this.sortOrderEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Integer> isBestList;

        public List<Integer> getIsBestList(){return this.isBestList;}

        private Integer isBestSt;

        private Integer isBestEd;

        public Integer getIsBestSt(){return this.isBestSt;}

        public Integer getIsBestEd(){return this.isBestEd;}

        private List<Integer> isNewList;

        public List<Integer> getIsNewList(){return this.isNewList;}

        private Integer isNewSt;

        private Integer isNewEd;

        public Integer getIsNewSt(){return this.isNewSt;}

        public Integer getIsNewEd(){return this.isNewEd;}

        private List<Integer> isHotList;

        public List<Integer> getIsHotList(){return this.isHotList;}

        private Integer isHotSt;

        private Integer isHotEd;

        public Integer getIsHotSt(){return this.isHotSt;}

        public Integer getIsHotEd(){return this.isHotEd;}

        private List<Integer> isPromoteList;

        public List<Integer> getIsPromoteList(){return this.isPromoteList;}

        private Integer isPromoteSt;

        private Integer isPromoteEd;

        public Integer getIsPromoteSt(){return this.isPromoteSt;}

        public Integer getIsPromoteEd(){return this.isPromoteEd;}

        private List<Integer> bonusTypeIdList;

        public List<Integer> getBonusTypeIdList(){return this.bonusTypeIdList;}

        private Integer bonusTypeIdSt;

        private Integer bonusTypeIdEd;

        public Integer getBonusTypeIdSt(){return this.bonusTypeIdSt;}

        public Integer getBonusTypeIdEd(){return this.bonusTypeIdEd;}

        private List<Integer> lastUpdateList;

        public List<Integer> getLastUpdateList(){return this.lastUpdateList;}

        private Integer lastUpdateSt;

        private Integer lastUpdateEd;

        public Integer getLastUpdateSt(){return this.lastUpdateSt;}

        public Integer getLastUpdateEd(){return this.lastUpdateEd;}

        private List<Integer> goodsTypeList;

        public List<Integer> getGoodsTypeList(){return this.goodsTypeList;}

        private Integer goodsTypeSt;

        private Integer goodsTypeEd;

        public Integer getGoodsTypeSt(){return this.goodsTypeSt;}

        public Integer getGoodsTypeEd(){return this.goodsTypeEd;}

        private List<String> sellerNoteList;

        public List<String> getSellerNoteList(){return this.sellerNoteList;}


        private List<String> fuzzySellerNote;

        public List<String> getFuzzySellerNote(){return this.fuzzySellerNote;}

        private List<String> rightFuzzySellerNote;

        public List<String> getRightFuzzySellerNote(){return this.rightFuzzySellerNote;}
        private List<Integer> giveIntegralList;

        public List<Integer> getGiveIntegralList(){return this.giveIntegralList;}

        private Integer giveIntegralSt;

        private Integer giveIntegralEd;

        public Integer getGiveIntegralSt(){return this.giveIntegralSt;}

        public Integer getGiveIntegralEd(){return this.giveIntegralEd;}

        private List<Integer> rankIntegralList;

        public List<Integer> getRankIntegralList(){return this.rankIntegralList;}

        private Integer rankIntegralSt;

        private Integer rankIntegralEd;

        public Integer getRankIntegralSt(){return this.rankIntegralSt;}

        public Integer getRankIntegralEd(){return this.rankIntegralEd;}

        private List<Integer> suppliersIdList;

        public List<Integer> getSuppliersIdList(){return this.suppliersIdList;}

        private Integer suppliersIdSt;

        private Integer suppliersIdEd;

        public Integer getSuppliersIdSt(){return this.suppliersIdSt;}

        public Integer getSuppliersIdEd(){return this.suppliersIdEd;}

        private List<Integer> isCheckList;

        public List<Integer> getIsCheckList(){return this.isCheckList;}

        private Integer isCheckSt;

        private Integer isCheckEd;

        public Integer getIsCheckSt(){return this.isCheckSt;}

        public Integer getIsCheckEd(){return this.isCheckEd;}

        private List<Integer> needIdcardList;

        public List<Integer> getNeedIdcardList(){return this.needIdcardList;}

        private Integer needIdcardSt;

        private Integer needIdcardEd;

        public Integer getNeedIdcardSt(){return this.needIdcardSt;}

        public Integer getNeedIdcardEd(){return this.needIdcardEd;}

        private List<Integer> isBonusList;

        public List<Integer> getIsBonusList(){return this.isBonusList;}

        private Integer isBonusSt;

        private Integer isBonusEd;

        public Integer getIsBonusSt(){return this.isBonusSt;}

        public Integer getIsBonusEd(){return this.isBonusEd;}

        private List<String> secondaryTitleList;

        public List<String> getSecondaryTitleList(){return this.secondaryTitleList;}


        private List<String> fuzzySecondaryTitle;

        public List<String> getFuzzySecondaryTitle(){return this.fuzzySecondaryTitle;}

        private List<String> rightFuzzySecondaryTitle;

        public List<String> getRightFuzzySecondaryTitle(){return this.rightFuzzySecondaryTitle;}
        private List<String> tagList;

        public List<String> getTagList(){return this.tagList;}


        private List<String> fuzzyTag;

        public List<String> getFuzzyTag(){return this.fuzzyTag;}

        private List<String> rightFuzzyTag;

        public List<String> getRightFuzzyTag(){return this.rightFuzzyTag;}
        private List<java.math.BigDecimal> shippingFeeList;

        public List<java.math.BigDecimal> getShippingFeeList(){return this.shippingFeeList;}

        private java.math.BigDecimal shippingFeeSt;

        private java.math.BigDecimal shippingFeeEd;

        public java.math.BigDecimal getShippingFeeSt(){return this.shippingFeeSt;}

        public java.math.BigDecimal getShippingFeeEd(){return this.shippingFeeEd;}

        private List<String> productionPlaceList;

        public List<String> getProductionPlaceList(){return this.productionPlaceList;}


        private List<String> fuzzyProductionPlace;

        public List<String> getFuzzyProductionPlace(){return this.fuzzyProductionPlace;}

        private List<String> rightFuzzyProductionPlace;

        public List<String> getRightFuzzyProductionPlace(){return this.rightFuzzyProductionPlace;}
        private List<String> goodsImg1List;

        public List<String> getGoodsImg1List(){return this.goodsImg1List;}


        private List<String> fuzzyGoodsImg1;

        public List<String> getFuzzyGoodsImg1(){return this.fuzzyGoodsImg1;}

        private List<String> rightFuzzyGoodsImg1;

        public List<String> getRightFuzzyGoodsImg1(){return this.rightFuzzyGoodsImg1;}
        private List<String> goodsImg2List;

        public List<String> getGoodsImg2List(){return this.goodsImg2List;}


        private List<String> fuzzyGoodsImg2;

        public List<String> getFuzzyGoodsImg2(){return this.fuzzyGoodsImg2;}

        private List<String> rightFuzzyGoodsImg2;

        public List<String> getRightFuzzyGoodsImg2(){return this.rightFuzzyGoodsImg2;}
        private List<String> goodsImg3List;

        public List<String> getGoodsImg3List(){return this.goodsImg3List;}


        private List<String> fuzzyGoodsImg3;

        public List<String> getFuzzyGoodsImg3(){return this.fuzzyGoodsImg3;}

        private List<String> rightFuzzyGoodsImg3;

        public List<String> getRightFuzzyGoodsImg3(){return this.rightFuzzyGoodsImg3;}
        private List<String> goodsImg4List;

        public List<String> getGoodsImg4List(){return this.goodsImg4List;}


        private List<String> fuzzyGoodsImg4;

        public List<String> getFuzzyGoodsImg4(){return this.fuzzyGoodsImg4;}

        private List<String> rightFuzzyGoodsImg4;

        public List<String> getRightFuzzyGoodsImg4(){return this.rightFuzzyGoodsImg4;}
        private List<String> goodsImg5List;

        public List<String> getGoodsImg5List(){return this.goodsImg5List;}


        private List<String> fuzzyGoodsImg5;

        public List<String> getFuzzyGoodsImg5(){return this.fuzzyGoodsImg5;}

        private List<String> rightFuzzyGoodsImg5;

        public List<String> getRightFuzzyGoodsImg5(){return this.rightFuzzyGoodsImg5;}
        private List<String> goodsImg6List;

        public List<String> getGoodsImg6List(){return this.goodsImg6List;}


        private List<String> fuzzyGoodsImg6;

        public List<String> getFuzzyGoodsImg6(){return this.fuzzyGoodsImg6;}

        private List<String> rightFuzzyGoodsImg6;

        public List<String> getRightFuzzyGoodsImg6(){return this.rightFuzzyGoodsImg6;}
        private List<String> suppliersList;

        public List<String> getSuppliersList(){return this.suppliersList;}


        private List<String> fuzzySuppliers;

        public List<String> getFuzzySuppliers(){return this.fuzzySuppliers;}

        private List<String> rightFuzzySuppliers;

        public List<String> getRightFuzzySuppliers(){return this.rightFuzzySuppliers;}
        private List<String> isShowDescList;

        public List<String> getIsShowDescList(){return this.isShowDescList;}


        private List<String> fuzzyIsShowDesc;

        public List<String> getFuzzyIsShowDesc(){return this.fuzzyIsShowDesc;}

        private List<String> rightFuzzyIsShowDesc;

        public List<String> getRightFuzzyIsShowDesc(){return this.rightFuzzyIsShowDesc;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> specification1NameList;

        public List<String> getSpecification1NameList(){return this.specification1NameList;}


        private List<String> fuzzySpecification1Name;

        public List<String> getFuzzySpecification1Name(){return this.fuzzySpecification1Name;}

        private List<String> rightFuzzySpecification1Name;

        public List<String> getRightFuzzySpecification1Name(){return this.rightFuzzySpecification1Name;}
        private List<java.math.BigDecimal> specification1PriceList;

        public List<java.math.BigDecimal> getSpecification1PriceList(){return this.specification1PriceList;}

        private java.math.BigDecimal specification1PriceSt;

        private java.math.BigDecimal specification1PriceEd;

        public java.math.BigDecimal getSpecification1PriceSt(){return this.specification1PriceSt;}

        public java.math.BigDecimal getSpecification1PriceEd(){return this.specification1PriceEd;}

        private List<Integer> specification1ConsumeNumList;

        public List<Integer> getSpecification1ConsumeNumList(){return this.specification1ConsumeNumList;}

        private Integer specification1ConsumeNumSt;

        private Integer specification1ConsumeNumEd;

        public Integer getSpecification1ConsumeNumSt(){return this.specification1ConsumeNumSt;}

        public Integer getSpecification1ConsumeNumEd(){return this.specification1ConsumeNumEd;}

        private List<String> specification2NameList;

        public List<String> getSpecification2NameList(){return this.specification2NameList;}


        private List<String> fuzzySpecification2Name;

        public List<String> getFuzzySpecification2Name(){return this.fuzzySpecification2Name;}

        private List<String> rightFuzzySpecification2Name;

        public List<String> getRightFuzzySpecification2Name(){return this.rightFuzzySpecification2Name;}
        private List<java.math.BigDecimal> specification2PriceList;

        public List<java.math.BigDecimal> getSpecification2PriceList(){return this.specification2PriceList;}

        private java.math.BigDecimal specification2PriceSt;

        private java.math.BigDecimal specification2PriceEd;

        public java.math.BigDecimal getSpecification2PriceSt(){return this.specification2PriceSt;}

        public java.math.BigDecimal getSpecification2PriceEd(){return this.specification2PriceEd;}

        private List<Integer> specification2ConsumeNumList;

        public List<Integer> getSpecification2ConsumeNumList(){return this.specification2ConsumeNumList;}

        private Integer specification2ConsumeNumSt;

        private Integer specification2ConsumeNumEd;

        public Integer getSpecification2ConsumeNumSt(){return this.specification2ConsumeNumSt;}

        public Integer getSpecification2ConsumeNumEd(){return this.specification2ConsumeNumEd;}

        private List<String> specification3NameList;

        public List<String> getSpecification3NameList(){return this.specification3NameList;}


        private List<String> fuzzySpecification3Name;

        public List<String> getFuzzySpecification3Name(){return this.fuzzySpecification3Name;}

        private List<String> rightFuzzySpecification3Name;

        public List<String> getRightFuzzySpecification3Name(){return this.rightFuzzySpecification3Name;}
        private List<java.math.BigDecimal> specification3PriceList;

        public List<java.math.BigDecimal> getSpecification3PriceList(){return this.specification3PriceList;}

        private java.math.BigDecimal specification3PriceSt;

        private java.math.BigDecimal specification3PriceEd;

        public java.math.BigDecimal getSpecification3PriceSt(){return this.specification3PriceSt;}

        public java.math.BigDecimal getSpecification3PriceEd(){return this.specification3PriceEd;}

        private List<Integer> specification3ConsumeNumList;

        public List<Integer> getSpecification3ConsumeNumList(){return this.specification3ConsumeNumList;}

        private Integer specification3ConsumeNumSt;

        private Integer specification3ConsumeNumEd;

        public Integer getSpecification3ConsumeNumSt(){return this.specification3ConsumeNumSt;}

        public Integer getSpecification3ConsumeNumEd(){return this.specification3ConsumeNumEd;}

        private List<String> specification4NameList;

        public List<String> getSpecification4NameList(){return this.specification4NameList;}


        private List<String> fuzzySpecification4Name;

        public List<String> getFuzzySpecification4Name(){return this.fuzzySpecification4Name;}

        private List<String> rightFuzzySpecification4Name;

        public List<String> getRightFuzzySpecification4Name(){return this.rightFuzzySpecification4Name;}
        private List<java.math.BigDecimal> specification4PriceList;

        public List<java.math.BigDecimal> getSpecification4PriceList(){return this.specification4PriceList;}

        private java.math.BigDecimal specification4PriceSt;

        private java.math.BigDecimal specification4PriceEd;

        public java.math.BigDecimal getSpecification4PriceSt(){return this.specification4PriceSt;}

        public java.math.BigDecimal getSpecification4PriceEd(){return this.specification4PriceEd;}

        private List<Integer> specification4ConsumeNumList;

        public List<Integer> getSpecification4ConsumeNumList(){return this.specification4ConsumeNumList;}

        private Integer specification4ConsumeNumSt;

        private Integer specification4ConsumeNumEd;

        public Integer getSpecification4ConsumeNumSt(){return this.specification4ConsumeNumSt;}

        public Integer getSpecification4ConsumeNumEd(){return this.specification4ConsumeNumEd;}

        private List<String> specification5NameList;

        public List<String> getSpecification5NameList(){return this.specification5NameList;}


        private List<String> fuzzySpecification5Name;

        public List<String> getFuzzySpecification5Name(){return this.fuzzySpecification5Name;}

        private List<String> rightFuzzySpecification5Name;

        public List<String> getRightFuzzySpecification5Name(){return this.rightFuzzySpecification5Name;}
        private List<java.math.BigDecimal> specification5PriceList;

        public List<java.math.BigDecimal> getSpecification5PriceList(){return this.specification5PriceList;}

        private java.math.BigDecimal specification5PriceSt;

        private java.math.BigDecimal specification5PriceEd;

        public java.math.BigDecimal getSpecification5PriceSt(){return this.specification5PriceSt;}

        public java.math.BigDecimal getSpecification5PriceEd(){return this.specification5PriceEd;}

        private List<Integer> specification5ConsumeNumList;

        public List<Integer> getSpecification5ConsumeNumList(){return this.specification5ConsumeNumList;}

        private Integer specification5ConsumeNumSt;

        private Integer specification5ConsumeNumEd;

        public Integer getSpecification5ConsumeNumSt(){return this.specification5ConsumeNumSt;}

        public Integer getSpecification5ConsumeNumEd(){return this.specification5ConsumeNumEd;}

        private List<String> specification6NameList;

        public List<String> getSpecification6NameList(){return this.specification6NameList;}


        private List<String> fuzzySpecification6Name;

        public List<String> getFuzzySpecification6Name(){return this.fuzzySpecification6Name;}

        private List<String> rightFuzzySpecification6Name;

        public List<String> getRightFuzzySpecification6Name(){return this.rightFuzzySpecification6Name;}
        private List<java.math.BigDecimal> specification6PriceList;

        public List<java.math.BigDecimal> getSpecification6PriceList(){return this.specification6PriceList;}

        private java.math.BigDecimal specification6PriceSt;

        private java.math.BigDecimal specification6PriceEd;

        public java.math.BigDecimal getSpecification6PriceSt(){return this.specification6PriceSt;}

        public java.math.BigDecimal getSpecification6PriceEd(){return this.specification6PriceEd;}

        private List<Integer> specification6ConsumeNumList;

        public List<Integer> getSpecification6ConsumeNumList(){return this.specification6ConsumeNumList;}

        private Integer specification6ConsumeNumSt;

        private Integer specification6ConsumeNumEd;

        public Integer getSpecification6ConsumeNumSt(){return this.specification6ConsumeNumSt;}

        public Integer getSpecification6ConsumeNumEd(){return this.specification6ConsumeNumEd;}

        private List<String> specification7NameList;

        public List<String> getSpecification7NameList(){return this.specification7NameList;}


        private List<String> fuzzySpecification7Name;

        public List<String> getFuzzySpecification7Name(){return this.fuzzySpecification7Name;}

        private List<String> rightFuzzySpecification7Name;

        public List<String> getRightFuzzySpecification7Name(){return this.rightFuzzySpecification7Name;}
        private List<java.math.BigDecimal> specification7PriceList;

        public List<java.math.BigDecimal> getSpecification7PriceList(){return this.specification7PriceList;}

        private java.math.BigDecimal specification7PriceSt;

        private java.math.BigDecimal specification7PriceEd;

        public java.math.BigDecimal getSpecification7PriceSt(){return this.specification7PriceSt;}

        public java.math.BigDecimal getSpecification7PriceEd(){return this.specification7PriceEd;}

        private List<Integer> specification7ConsumeNumList;

        public List<Integer> getSpecification7ConsumeNumList(){return this.specification7ConsumeNumList;}

        private Integer specification7ConsumeNumSt;

        private Integer specification7ConsumeNumEd;

        public Integer getSpecification7ConsumeNumSt(){return this.specification7ConsumeNumSt;}

        public Integer getSpecification7ConsumeNumEd(){return this.specification7ConsumeNumEd;}

        private List<String> specification8NameList;

        public List<String> getSpecification8NameList(){return this.specification8NameList;}


        private List<String> fuzzySpecification8Name;

        public List<String> getFuzzySpecification8Name(){return this.fuzzySpecification8Name;}

        private List<String> rightFuzzySpecification8Name;

        public List<String> getRightFuzzySpecification8Name(){return this.rightFuzzySpecification8Name;}
        private List<java.math.BigDecimal> specification8PriceList;

        public List<java.math.BigDecimal> getSpecification8PriceList(){return this.specification8PriceList;}

        private java.math.BigDecimal specification8PriceSt;

        private java.math.BigDecimal specification8PriceEd;

        public java.math.BigDecimal getSpecification8PriceSt(){return this.specification8PriceSt;}

        public java.math.BigDecimal getSpecification8PriceEd(){return this.specification8PriceEd;}

        private List<Integer> specification8ConsumeNumList;

        public List<Integer> getSpecification8ConsumeNumList(){return this.specification8ConsumeNumList;}

        private Integer specification8ConsumeNumSt;

        private Integer specification8ConsumeNumEd;

        public Integer getSpecification8ConsumeNumSt(){return this.specification8ConsumeNumSt;}

        public Integer getSpecification8ConsumeNumEd(){return this.specification8ConsumeNumEd;}


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

        public ConditionBuilder catIdBetWeen(Integer catIdSt,Integer catIdEd){
            this.catIdSt = catIdSt;
            this.catIdEd = catIdEd;
            return this;
        }

        public ConditionBuilder catIdGreaterEqThan(Integer catIdSt){
            this.catIdSt = catIdSt;
            return this;
        }
        public ConditionBuilder catIdLessEqThan(Integer catIdEd){
            this.catIdEd = catIdEd;
            return this;
        }


        public ConditionBuilder catIdList(Integer ... catId){
            this.catIdList = solveNullList(catId);
            return this;
        }

        public ConditionBuilder catIdList(List<Integer> catId){
            this.catIdList = catId;
            return this;
        }

        public ConditionBuilder fuzzyGoodsSn (List<String> fuzzyGoodsSn){
            this.fuzzyGoodsSn = fuzzyGoodsSn;
            return this;
        }

        public ConditionBuilder fuzzyGoodsSn (String ... fuzzyGoodsSn){
            this.fuzzyGoodsSn = solveNullList(fuzzyGoodsSn);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsSn (List<String> rightFuzzyGoodsSn){
            this.rightFuzzyGoodsSn = rightFuzzyGoodsSn;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsSn (String ... rightFuzzyGoodsSn){
            this.rightFuzzyGoodsSn = solveNullList(rightFuzzyGoodsSn);
            return this;
        }

        public ConditionBuilder goodsSnList(String ... goodsSn){
            this.goodsSnList = solveNullList(goodsSn);
            return this;
        }

        public ConditionBuilder goodsSnList(List<String> goodsSn){
            this.goodsSnList = goodsSn;
            return this;
        }

        public ConditionBuilder fuzzyGoodsName (List<String> fuzzyGoodsName){
            this.fuzzyGoodsName = fuzzyGoodsName;
            return this;
        }

        public ConditionBuilder fuzzyGoodsName (String ... fuzzyGoodsName){
            this.fuzzyGoodsName = solveNullList(fuzzyGoodsName);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsName (List<String> rightFuzzyGoodsName){
            this.rightFuzzyGoodsName = rightFuzzyGoodsName;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsName (String ... rightFuzzyGoodsName){
            this.rightFuzzyGoodsName = solveNullList(rightFuzzyGoodsName);
            return this;
        }

        public ConditionBuilder goodsNameList(String ... goodsName){
            this.goodsNameList = solveNullList(goodsName);
            return this;
        }

        public ConditionBuilder goodsNameList(List<String> goodsName){
            this.goodsNameList = goodsName;
            return this;
        }

        public ConditionBuilder fuzzyGoodsNameStyle (List<String> fuzzyGoodsNameStyle){
            this.fuzzyGoodsNameStyle = fuzzyGoodsNameStyle;
            return this;
        }

        public ConditionBuilder fuzzyGoodsNameStyle (String ... fuzzyGoodsNameStyle){
            this.fuzzyGoodsNameStyle = solveNullList(fuzzyGoodsNameStyle);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsNameStyle (List<String> rightFuzzyGoodsNameStyle){
            this.rightFuzzyGoodsNameStyle = rightFuzzyGoodsNameStyle;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsNameStyle (String ... rightFuzzyGoodsNameStyle){
            this.rightFuzzyGoodsNameStyle = solveNullList(rightFuzzyGoodsNameStyle);
            return this;
        }

        public ConditionBuilder goodsNameStyleList(String ... goodsNameStyle){
            this.goodsNameStyleList = solveNullList(goodsNameStyle);
            return this;
        }

        public ConditionBuilder goodsNameStyleList(List<String> goodsNameStyle){
            this.goodsNameStyleList = goodsNameStyle;
            return this;
        }

        public ConditionBuilder clickCountBetWeen(Integer clickCountSt,Integer clickCountEd){
            this.clickCountSt = clickCountSt;
            this.clickCountEd = clickCountEd;
            return this;
        }

        public ConditionBuilder clickCountGreaterEqThan(Integer clickCountSt){
            this.clickCountSt = clickCountSt;
            return this;
        }
        public ConditionBuilder clickCountLessEqThan(Integer clickCountEd){
            this.clickCountEd = clickCountEd;
            return this;
        }


        public ConditionBuilder clickCountList(Integer ... clickCount){
            this.clickCountList = solveNullList(clickCount);
            return this;
        }

        public ConditionBuilder clickCountList(List<Integer> clickCount){
            this.clickCountList = clickCount;
            return this;
        }

        public ConditionBuilder brandIdBetWeen(Integer brandIdSt,Integer brandIdEd){
            this.brandIdSt = brandIdSt;
            this.brandIdEd = brandIdEd;
            return this;
        }

        public ConditionBuilder brandIdGreaterEqThan(Integer brandIdSt){
            this.brandIdSt = brandIdSt;
            return this;
        }
        public ConditionBuilder brandIdLessEqThan(Integer brandIdEd){
            this.brandIdEd = brandIdEd;
            return this;
        }


        public ConditionBuilder brandIdList(Integer ... brandId){
            this.brandIdList = solveNullList(brandId);
            return this;
        }

        public ConditionBuilder brandIdList(List<Integer> brandId){
            this.brandIdList = brandId;
            return this;
        }

        public ConditionBuilder fuzzyProviderName (List<String> fuzzyProviderName){
            this.fuzzyProviderName = fuzzyProviderName;
            return this;
        }

        public ConditionBuilder fuzzyProviderName (String ... fuzzyProviderName){
            this.fuzzyProviderName = solveNullList(fuzzyProviderName);
            return this;
        }

        public ConditionBuilder rightFuzzyProviderName (List<String> rightFuzzyProviderName){
            this.rightFuzzyProviderName = rightFuzzyProviderName;
            return this;
        }

        public ConditionBuilder rightFuzzyProviderName (String ... rightFuzzyProviderName){
            this.rightFuzzyProviderName = solveNullList(rightFuzzyProviderName);
            return this;
        }

        public ConditionBuilder providerNameList(String ... providerName){
            this.providerNameList = solveNullList(providerName);
            return this;
        }

        public ConditionBuilder providerNameList(List<String> providerName){
            this.providerNameList = providerName;
            return this;
        }

        public ConditionBuilder goodsNumberBetWeen(Integer goodsNumberSt,Integer goodsNumberEd){
            this.goodsNumberSt = goodsNumberSt;
            this.goodsNumberEd = goodsNumberEd;
            return this;
        }

        public ConditionBuilder goodsNumberGreaterEqThan(Integer goodsNumberSt){
            this.goodsNumberSt = goodsNumberSt;
            return this;
        }
        public ConditionBuilder goodsNumberLessEqThan(Integer goodsNumberEd){
            this.goodsNumberEd = goodsNumberEd;
            return this;
        }


        public ConditionBuilder goodsNumberList(Integer ... goodsNumber){
            this.goodsNumberList = solveNullList(goodsNumber);
            return this;
        }

        public ConditionBuilder goodsNumberList(List<Integer> goodsNumber){
            this.goodsNumberList = goodsNumber;
            return this;
        }

        public ConditionBuilder goodsWeightBetWeen(java.math.BigDecimal goodsWeightSt,java.math.BigDecimal goodsWeightEd){
            this.goodsWeightSt = goodsWeightSt;
            this.goodsWeightEd = goodsWeightEd;
            return this;
        }

        public ConditionBuilder goodsWeightGreaterEqThan(java.math.BigDecimal goodsWeightSt){
            this.goodsWeightSt = goodsWeightSt;
            return this;
        }
        public ConditionBuilder goodsWeightLessEqThan(java.math.BigDecimal goodsWeightEd){
            this.goodsWeightEd = goodsWeightEd;
            return this;
        }


        public ConditionBuilder goodsWeightList(java.math.BigDecimal ... goodsWeight){
            this.goodsWeightList = solveNullList(goodsWeight);
            return this;
        }

        public ConditionBuilder goodsWeightList(List<java.math.BigDecimal> goodsWeight){
            this.goodsWeightList = goodsWeight;
            return this;
        }

        public ConditionBuilder marketPriceBetWeen(java.math.BigDecimal marketPriceSt,java.math.BigDecimal marketPriceEd){
            this.marketPriceSt = marketPriceSt;
            this.marketPriceEd = marketPriceEd;
            return this;
        }

        public ConditionBuilder marketPriceGreaterEqThan(java.math.BigDecimal marketPriceSt){
            this.marketPriceSt = marketPriceSt;
            return this;
        }
        public ConditionBuilder marketPriceLessEqThan(java.math.BigDecimal marketPriceEd){
            this.marketPriceEd = marketPriceEd;
            return this;
        }


        public ConditionBuilder marketPriceList(java.math.BigDecimal ... marketPrice){
            this.marketPriceList = solveNullList(marketPrice);
            return this;
        }

        public ConditionBuilder marketPriceList(List<java.math.BigDecimal> marketPrice){
            this.marketPriceList = marketPrice;
            return this;
        }

        public ConditionBuilder virtualSalesBetWeen(Integer virtualSalesSt,Integer virtualSalesEd){
            this.virtualSalesSt = virtualSalesSt;
            this.virtualSalesEd = virtualSalesEd;
            return this;
        }

        public ConditionBuilder virtualSalesGreaterEqThan(Integer virtualSalesSt){
            this.virtualSalesSt = virtualSalesSt;
            return this;
        }
        public ConditionBuilder virtualSalesLessEqThan(Integer virtualSalesEd){
            this.virtualSalesEd = virtualSalesEd;
            return this;
        }


        public ConditionBuilder virtualSalesList(Integer ... virtualSales){
            this.virtualSalesList = solveNullList(virtualSales);
            return this;
        }

        public ConditionBuilder virtualSalesList(List<Integer> virtualSales){
            this.virtualSalesList = virtualSales;
            return this;
        }

        public ConditionBuilder shopPriceBetWeen(java.math.BigDecimal shopPriceSt,java.math.BigDecimal shopPriceEd){
            this.shopPriceSt = shopPriceSt;
            this.shopPriceEd = shopPriceEd;
            return this;
        }

        public ConditionBuilder shopPriceGreaterEqThan(java.math.BigDecimal shopPriceSt){
            this.shopPriceSt = shopPriceSt;
            return this;
        }
        public ConditionBuilder shopPriceLessEqThan(java.math.BigDecimal shopPriceEd){
            this.shopPriceEd = shopPriceEd;
            return this;
        }


        public ConditionBuilder shopPriceList(java.math.BigDecimal ... shopPrice){
            this.shopPriceList = solveNullList(shopPrice);
            return this;
        }

        public ConditionBuilder shopPriceList(List<java.math.BigDecimal> shopPrice){
            this.shopPriceList = shopPrice;
            return this;
        }

        public ConditionBuilder promotePriceBetWeen(java.math.BigDecimal promotePriceSt,java.math.BigDecimal promotePriceEd){
            this.promotePriceSt = promotePriceSt;
            this.promotePriceEd = promotePriceEd;
            return this;
        }

        public ConditionBuilder promotePriceGreaterEqThan(java.math.BigDecimal promotePriceSt){
            this.promotePriceSt = promotePriceSt;
            return this;
        }
        public ConditionBuilder promotePriceLessEqThan(java.math.BigDecimal promotePriceEd){
            this.promotePriceEd = promotePriceEd;
            return this;
        }


        public ConditionBuilder promotePriceList(java.math.BigDecimal ... promotePrice){
            this.promotePriceList = solveNullList(promotePrice);
            return this;
        }

        public ConditionBuilder promotePriceList(List<java.math.BigDecimal> promotePrice){
            this.promotePriceList = promotePrice;
            return this;
        }

        public ConditionBuilder promoteStartDateBetWeen(Integer promoteStartDateSt,Integer promoteStartDateEd){
            this.promoteStartDateSt = promoteStartDateSt;
            this.promoteStartDateEd = promoteStartDateEd;
            return this;
        }

        public ConditionBuilder promoteStartDateGreaterEqThan(Integer promoteStartDateSt){
            this.promoteStartDateSt = promoteStartDateSt;
            return this;
        }
        public ConditionBuilder promoteStartDateLessEqThan(Integer promoteStartDateEd){
            this.promoteStartDateEd = promoteStartDateEd;
            return this;
        }


        public ConditionBuilder promoteStartDateList(Integer ... promoteStartDate){
            this.promoteStartDateList = solveNullList(promoteStartDate);
            return this;
        }

        public ConditionBuilder promoteStartDateList(List<Integer> promoteStartDate){
            this.promoteStartDateList = promoteStartDate;
            return this;
        }

        public ConditionBuilder promoteEndDateBetWeen(Integer promoteEndDateSt,Integer promoteEndDateEd){
            this.promoteEndDateSt = promoteEndDateSt;
            this.promoteEndDateEd = promoteEndDateEd;
            return this;
        }

        public ConditionBuilder promoteEndDateGreaterEqThan(Integer promoteEndDateSt){
            this.promoteEndDateSt = promoteEndDateSt;
            return this;
        }
        public ConditionBuilder promoteEndDateLessEqThan(Integer promoteEndDateEd){
            this.promoteEndDateEd = promoteEndDateEd;
            return this;
        }


        public ConditionBuilder promoteEndDateList(Integer ... promoteEndDate){
            this.promoteEndDateList = solveNullList(promoteEndDate);
            return this;
        }

        public ConditionBuilder promoteEndDateList(List<Integer> promoteEndDate){
            this.promoteEndDateList = promoteEndDate;
            return this;
        }

        public ConditionBuilder fuzzyWarnNumber (List<String> fuzzyWarnNumber){
            this.fuzzyWarnNumber = fuzzyWarnNumber;
            return this;
        }

        public ConditionBuilder fuzzyWarnNumber (String ... fuzzyWarnNumber){
            this.fuzzyWarnNumber = solveNullList(fuzzyWarnNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyWarnNumber (List<String> rightFuzzyWarnNumber){
            this.rightFuzzyWarnNumber = rightFuzzyWarnNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyWarnNumber (String ... rightFuzzyWarnNumber){
            this.rightFuzzyWarnNumber = solveNullList(rightFuzzyWarnNumber);
            return this;
        }

        public ConditionBuilder warnNumberList(String ... warnNumber){
            this.warnNumberList = solveNullList(warnNumber);
            return this;
        }

        public ConditionBuilder warnNumberList(List<String> warnNumber){
            this.warnNumberList = warnNumber;
            return this;
        }

        public ConditionBuilder fuzzyKeywords (List<String> fuzzyKeywords){
            this.fuzzyKeywords = fuzzyKeywords;
            return this;
        }

        public ConditionBuilder fuzzyKeywords (String ... fuzzyKeywords){
            this.fuzzyKeywords = solveNullList(fuzzyKeywords);
            return this;
        }

        public ConditionBuilder rightFuzzyKeywords (List<String> rightFuzzyKeywords){
            this.rightFuzzyKeywords = rightFuzzyKeywords;
            return this;
        }

        public ConditionBuilder rightFuzzyKeywords (String ... rightFuzzyKeywords){
            this.rightFuzzyKeywords = solveNullList(rightFuzzyKeywords);
            return this;
        }

        public ConditionBuilder keywordsList(String ... keywords){
            this.keywordsList = solveNullList(keywords);
            return this;
        }

        public ConditionBuilder keywordsList(List<String> keywords){
            this.keywordsList = keywords;
            return this;
        }

        public ConditionBuilder fuzzyGoodsBrief (List<String> fuzzyGoodsBrief){
            this.fuzzyGoodsBrief = fuzzyGoodsBrief;
            return this;
        }

        public ConditionBuilder fuzzyGoodsBrief (String ... fuzzyGoodsBrief){
            this.fuzzyGoodsBrief = solveNullList(fuzzyGoodsBrief);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsBrief (List<String> rightFuzzyGoodsBrief){
            this.rightFuzzyGoodsBrief = rightFuzzyGoodsBrief;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsBrief (String ... rightFuzzyGoodsBrief){
            this.rightFuzzyGoodsBrief = solveNullList(rightFuzzyGoodsBrief);
            return this;
        }

        public ConditionBuilder goodsBriefList(String ... goodsBrief){
            this.goodsBriefList = solveNullList(goodsBrief);
            return this;
        }

        public ConditionBuilder goodsBriefList(List<String> goodsBrief){
            this.goodsBriefList = goodsBrief;
            return this;
        }

        public ConditionBuilder fuzzyGoodsDesc (List<String> fuzzyGoodsDesc){
            this.fuzzyGoodsDesc = fuzzyGoodsDesc;
            return this;
        }

        public ConditionBuilder fuzzyGoodsDesc (String ... fuzzyGoodsDesc){
            this.fuzzyGoodsDesc = solveNullList(fuzzyGoodsDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsDesc (List<String> rightFuzzyGoodsDesc){
            this.rightFuzzyGoodsDesc = rightFuzzyGoodsDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsDesc (String ... rightFuzzyGoodsDesc){
            this.rightFuzzyGoodsDesc = solveNullList(rightFuzzyGoodsDesc);
            return this;
        }

        public ConditionBuilder goodsDescList(String ... goodsDesc){
            this.goodsDescList = solveNullList(goodsDesc);
            return this;
        }

        public ConditionBuilder goodsDescList(List<String> goodsDesc){
            this.goodsDescList = goodsDesc;
            return this;
        }

        public ConditionBuilder fuzzyGoodsThumb (List<String> fuzzyGoodsThumb){
            this.fuzzyGoodsThumb = fuzzyGoodsThumb;
            return this;
        }

        public ConditionBuilder fuzzyGoodsThumb (String ... fuzzyGoodsThumb){
            this.fuzzyGoodsThumb = solveNullList(fuzzyGoodsThumb);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsThumb (List<String> rightFuzzyGoodsThumb){
            this.rightFuzzyGoodsThumb = rightFuzzyGoodsThumb;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsThumb (String ... rightFuzzyGoodsThumb){
            this.rightFuzzyGoodsThumb = solveNullList(rightFuzzyGoodsThumb);
            return this;
        }

        public ConditionBuilder goodsThumbList(String ... goodsThumb){
            this.goodsThumbList = solveNullList(goodsThumb);
            return this;
        }

        public ConditionBuilder goodsThumbList(List<String> goodsThumb){
            this.goodsThumbList = goodsThumb;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg (List<String> fuzzyGoodsImg){
            this.fuzzyGoodsImg = fuzzyGoodsImg;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg (String ... fuzzyGoodsImg){
            this.fuzzyGoodsImg = solveNullList(fuzzyGoodsImg);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg (List<String> rightFuzzyGoodsImg){
            this.rightFuzzyGoodsImg = rightFuzzyGoodsImg;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg (String ... rightFuzzyGoodsImg){
            this.rightFuzzyGoodsImg = solveNullList(rightFuzzyGoodsImg);
            return this;
        }

        public ConditionBuilder goodsImgList(String ... goodsImg){
            this.goodsImgList = solveNullList(goodsImg);
            return this;
        }

        public ConditionBuilder goodsImgList(List<String> goodsImg){
            this.goodsImgList = goodsImg;
            return this;
        }

        public ConditionBuilder fuzzyOriginalImg (List<String> fuzzyOriginalImg){
            this.fuzzyOriginalImg = fuzzyOriginalImg;
            return this;
        }

        public ConditionBuilder fuzzyOriginalImg (String ... fuzzyOriginalImg){
            this.fuzzyOriginalImg = solveNullList(fuzzyOriginalImg);
            return this;
        }

        public ConditionBuilder rightFuzzyOriginalImg (List<String> rightFuzzyOriginalImg){
            this.rightFuzzyOriginalImg = rightFuzzyOriginalImg;
            return this;
        }

        public ConditionBuilder rightFuzzyOriginalImg (String ... rightFuzzyOriginalImg){
            this.rightFuzzyOriginalImg = solveNullList(rightFuzzyOriginalImg);
            return this;
        }

        public ConditionBuilder originalImgList(String ... originalImg){
            this.originalImgList = solveNullList(originalImg);
            return this;
        }

        public ConditionBuilder originalImgList(List<String> originalImg){
            this.originalImgList = originalImg;
            return this;
        }

        public ConditionBuilder isRealBetWeen(Integer isRealSt,Integer isRealEd){
            this.isRealSt = isRealSt;
            this.isRealEd = isRealEd;
            return this;
        }

        public ConditionBuilder isRealGreaterEqThan(Integer isRealSt){
            this.isRealSt = isRealSt;
            return this;
        }
        public ConditionBuilder isRealLessEqThan(Integer isRealEd){
            this.isRealEd = isRealEd;
            return this;
        }


        public ConditionBuilder isRealList(Integer ... isReal){
            this.isRealList = solveNullList(isReal);
            return this;
        }

        public ConditionBuilder isRealList(List<Integer> isReal){
            this.isRealList = isReal;
            return this;
        }

        public ConditionBuilder fuzzyExtensionCode (List<String> fuzzyExtensionCode){
            this.fuzzyExtensionCode = fuzzyExtensionCode;
            return this;
        }

        public ConditionBuilder fuzzyExtensionCode (String ... fuzzyExtensionCode){
            this.fuzzyExtensionCode = solveNullList(fuzzyExtensionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyExtensionCode (List<String> rightFuzzyExtensionCode){
            this.rightFuzzyExtensionCode = rightFuzzyExtensionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyExtensionCode (String ... rightFuzzyExtensionCode){
            this.rightFuzzyExtensionCode = solveNullList(rightFuzzyExtensionCode);
            return this;
        }

        public ConditionBuilder extensionCodeList(String ... extensionCode){
            this.extensionCodeList = solveNullList(extensionCode);
            return this;
        }

        public ConditionBuilder extensionCodeList(List<String> extensionCode){
            this.extensionCodeList = extensionCode;
            return this;
        }

        public ConditionBuilder isOnSaleBetWeen(Integer isOnSaleSt,Integer isOnSaleEd){
            this.isOnSaleSt = isOnSaleSt;
            this.isOnSaleEd = isOnSaleEd;
            return this;
        }

        public ConditionBuilder isOnSaleGreaterEqThan(Integer isOnSaleSt){
            this.isOnSaleSt = isOnSaleSt;
            return this;
        }
        public ConditionBuilder isOnSaleLessEqThan(Integer isOnSaleEd){
            this.isOnSaleEd = isOnSaleEd;
            return this;
        }


        public ConditionBuilder isOnSaleList(Integer ... isOnSale){
            this.isOnSaleList = solveNullList(isOnSale);
            return this;
        }

        public ConditionBuilder isOnSaleList(List<Integer> isOnSale){
            this.isOnSaleList = isOnSale;
            return this;
        }

        public ConditionBuilder isAloneSaleBetWeen(Integer isAloneSaleSt,Integer isAloneSaleEd){
            this.isAloneSaleSt = isAloneSaleSt;
            this.isAloneSaleEd = isAloneSaleEd;
            return this;
        }

        public ConditionBuilder isAloneSaleGreaterEqThan(Integer isAloneSaleSt){
            this.isAloneSaleSt = isAloneSaleSt;
            return this;
        }
        public ConditionBuilder isAloneSaleLessEqThan(Integer isAloneSaleEd){
            this.isAloneSaleEd = isAloneSaleEd;
            return this;
        }


        public ConditionBuilder isAloneSaleList(Integer ... isAloneSale){
            this.isAloneSaleList = solveNullList(isAloneSale);
            return this;
        }

        public ConditionBuilder isAloneSaleList(List<Integer> isAloneSale){
            this.isAloneSaleList = isAloneSale;
            return this;
        }

        public ConditionBuilder isShippingBetWeen(Integer isShippingSt,Integer isShippingEd){
            this.isShippingSt = isShippingSt;
            this.isShippingEd = isShippingEd;
            return this;
        }

        public ConditionBuilder isShippingGreaterEqThan(Integer isShippingSt){
            this.isShippingSt = isShippingSt;
            return this;
        }
        public ConditionBuilder isShippingLessEqThan(Integer isShippingEd){
            this.isShippingEd = isShippingEd;
            return this;
        }


        public ConditionBuilder isShippingList(Integer ... isShipping){
            this.isShippingList = solveNullList(isShipping);
            return this;
        }

        public ConditionBuilder isShippingList(List<Integer> isShipping){
            this.isShippingList = isShipping;
            return this;
        }

        public ConditionBuilder integralBetWeen(Integer integralSt,Integer integralEd){
            this.integralSt = integralSt;
            this.integralEd = integralEd;
            return this;
        }

        public ConditionBuilder integralGreaterEqThan(Integer integralSt){
            this.integralSt = integralSt;
            return this;
        }
        public ConditionBuilder integralLessEqThan(Integer integralEd){
            this.integralEd = integralEd;
            return this;
        }


        public ConditionBuilder integralList(Integer ... integral){
            this.integralList = solveNullList(integral);
            return this;
        }

        public ConditionBuilder integralList(List<Integer> integral){
            this.integralList = integral;
            return this;
        }

        public ConditionBuilder addTimeBetWeen(Integer addTimeSt,Integer addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public ConditionBuilder addTimeGreaterEqThan(Integer addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public ConditionBuilder addTimeLessEqThan(Integer addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public ConditionBuilder addTimeList(Integer ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public ConditionBuilder addTimeList(List<Integer> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public ConditionBuilder sortOrderBetWeen(Integer sortOrderSt,Integer sortOrderEd){
            this.sortOrderSt = sortOrderSt;
            this.sortOrderEd = sortOrderEd;
            return this;
        }

        public ConditionBuilder sortOrderGreaterEqThan(Integer sortOrderSt){
            this.sortOrderSt = sortOrderSt;
            return this;
        }
        public ConditionBuilder sortOrderLessEqThan(Integer sortOrderEd){
            this.sortOrderEd = sortOrderEd;
            return this;
        }


        public ConditionBuilder sortOrderList(Integer ... sortOrder){
            this.sortOrderList = solveNullList(sortOrder);
            return this;
        }

        public ConditionBuilder sortOrderList(List<Integer> sortOrder){
            this.sortOrderList = sortOrder;
            return this;
        }

        public ConditionBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public ConditionBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public ConditionBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public ConditionBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public ConditionBuilder isBestBetWeen(Integer isBestSt,Integer isBestEd){
            this.isBestSt = isBestSt;
            this.isBestEd = isBestEd;
            return this;
        }

        public ConditionBuilder isBestGreaterEqThan(Integer isBestSt){
            this.isBestSt = isBestSt;
            return this;
        }
        public ConditionBuilder isBestLessEqThan(Integer isBestEd){
            this.isBestEd = isBestEd;
            return this;
        }


        public ConditionBuilder isBestList(Integer ... isBest){
            this.isBestList = solveNullList(isBest);
            return this;
        }

        public ConditionBuilder isBestList(List<Integer> isBest){
            this.isBestList = isBest;
            return this;
        }

        public ConditionBuilder isNewBetWeen(Integer isNewSt,Integer isNewEd){
            this.isNewSt = isNewSt;
            this.isNewEd = isNewEd;
            return this;
        }

        public ConditionBuilder isNewGreaterEqThan(Integer isNewSt){
            this.isNewSt = isNewSt;
            return this;
        }
        public ConditionBuilder isNewLessEqThan(Integer isNewEd){
            this.isNewEd = isNewEd;
            return this;
        }


        public ConditionBuilder isNewList(Integer ... isNew){
            this.isNewList = solveNullList(isNew);
            return this;
        }

        public ConditionBuilder isNewList(List<Integer> isNew){
            this.isNewList = isNew;
            return this;
        }

        public ConditionBuilder isHotBetWeen(Integer isHotSt,Integer isHotEd){
            this.isHotSt = isHotSt;
            this.isHotEd = isHotEd;
            return this;
        }

        public ConditionBuilder isHotGreaterEqThan(Integer isHotSt){
            this.isHotSt = isHotSt;
            return this;
        }
        public ConditionBuilder isHotLessEqThan(Integer isHotEd){
            this.isHotEd = isHotEd;
            return this;
        }


        public ConditionBuilder isHotList(Integer ... isHot){
            this.isHotList = solveNullList(isHot);
            return this;
        }

        public ConditionBuilder isHotList(List<Integer> isHot){
            this.isHotList = isHot;
            return this;
        }

        public ConditionBuilder isPromoteBetWeen(Integer isPromoteSt,Integer isPromoteEd){
            this.isPromoteSt = isPromoteSt;
            this.isPromoteEd = isPromoteEd;
            return this;
        }

        public ConditionBuilder isPromoteGreaterEqThan(Integer isPromoteSt){
            this.isPromoteSt = isPromoteSt;
            return this;
        }
        public ConditionBuilder isPromoteLessEqThan(Integer isPromoteEd){
            this.isPromoteEd = isPromoteEd;
            return this;
        }


        public ConditionBuilder isPromoteList(Integer ... isPromote){
            this.isPromoteList = solveNullList(isPromote);
            return this;
        }

        public ConditionBuilder isPromoteList(List<Integer> isPromote){
            this.isPromoteList = isPromote;
            return this;
        }

        public ConditionBuilder bonusTypeIdBetWeen(Integer bonusTypeIdSt,Integer bonusTypeIdEd){
            this.bonusTypeIdSt = bonusTypeIdSt;
            this.bonusTypeIdEd = bonusTypeIdEd;
            return this;
        }

        public ConditionBuilder bonusTypeIdGreaterEqThan(Integer bonusTypeIdSt){
            this.bonusTypeIdSt = bonusTypeIdSt;
            return this;
        }
        public ConditionBuilder bonusTypeIdLessEqThan(Integer bonusTypeIdEd){
            this.bonusTypeIdEd = bonusTypeIdEd;
            return this;
        }


        public ConditionBuilder bonusTypeIdList(Integer ... bonusTypeId){
            this.bonusTypeIdList = solveNullList(bonusTypeId);
            return this;
        }

        public ConditionBuilder bonusTypeIdList(List<Integer> bonusTypeId){
            this.bonusTypeIdList = bonusTypeId;
            return this;
        }

        public ConditionBuilder lastUpdateBetWeen(Integer lastUpdateSt,Integer lastUpdateEd){
            this.lastUpdateSt = lastUpdateSt;
            this.lastUpdateEd = lastUpdateEd;
            return this;
        }

        public ConditionBuilder lastUpdateGreaterEqThan(Integer lastUpdateSt){
            this.lastUpdateSt = lastUpdateSt;
            return this;
        }
        public ConditionBuilder lastUpdateLessEqThan(Integer lastUpdateEd){
            this.lastUpdateEd = lastUpdateEd;
            return this;
        }


        public ConditionBuilder lastUpdateList(Integer ... lastUpdate){
            this.lastUpdateList = solveNullList(lastUpdate);
            return this;
        }

        public ConditionBuilder lastUpdateList(List<Integer> lastUpdate){
            this.lastUpdateList = lastUpdate;
            return this;
        }

        public ConditionBuilder goodsTypeBetWeen(Integer goodsTypeSt,Integer goodsTypeEd){
            this.goodsTypeSt = goodsTypeSt;
            this.goodsTypeEd = goodsTypeEd;
            return this;
        }

        public ConditionBuilder goodsTypeGreaterEqThan(Integer goodsTypeSt){
            this.goodsTypeSt = goodsTypeSt;
            return this;
        }
        public ConditionBuilder goodsTypeLessEqThan(Integer goodsTypeEd){
            this.goodsTypeEd = goodsTypeEd;
            return this;
        }


        public ConditionBuilder goodsTypeList(Integer ... goodsType){
            this.goodsTypeList = solveNullList(goodsType);
            return this;
        }

        public ConditionBuilder goodsTypeList(List<Integer> goodsType){
            this.goodsTypeList = goodsType;
            return this;
        }

        public ConditionBuilder fuzzySellerNote (List<String> fuzzySellerNote){
            this.fuzzySellerNote = fuzzySellerNote;
            return this;
        }

        public ConditionBuilder fuzzySellerNote (String ... fuzzySellerNote){
            this.fuzzySellerNote = solveNullList(fuzzySellerNote);
            return this;
        }

        public ConditionBuilder rightFuzzySellerNote (List<String> rightFuzzySellerNote){
            this.rightFuzzySellerNote = rightFuzzySellerNote;
            return this;
        }

        public ConditionBuilder rightFuzzySellerNote (String ... rightFuzzySellerNote){
            this.rightFuzzySellerNote = solveNullList(rightFuzzySellerNote);
            return this;
        }

        public ConditionBuilder sellerNoteList(String ... sellerNote){
            this.sellerNoteList = solveNullList(sellerNote);
            return this;
        }

        public ConditionBuilder sellerNoteList(List<String> sellerNote){
            this.sellerNoteList = sellerNote;
            return this;
        }

        public ConditionBuilder giveIntegralBetWeen(Integer giveIntegralSt,Integer giveIntegralEd){
            this.giveIntegralSt = giveIntegralSt;
            this.giveIntegralEd = giveIntegralEd;
            return this;
        }

        public ConditionBuilder giveIntegralGreaterEqThan(Integer giveIntegralSt){
            this.giveIntegralSt = giveIntegralSt;
            return this;
        }
        public ConditionBuilder giveIntegralLessEqThan(Integer giveIntegralEd){
            this.giveIntegralEd = giveIntegralEd;
            return this;
        }


        public ConditionBuilder giveIntegralList(Integer ... giveIntegral){
            this.giveIntegralList = solveNullList(giveIntegral);
            return this;
        }

        public ConditionBuilder giveIntegralList(List<Integer> giveIntegral){
            this.giveIntegralList = giveIntegral;
            return this;
        }

        public ConditionBuilder rankIntegralBetWeen(Integer rankIntegralSt,Integer rankIntegralEd){
            this.rankIntegralSt = rankIntegralSt;
            this.rankIntegralEd = rankIntegralEd;
            return this;
        }

        public ConditionBuilder rankIntegralGreaterEqThan(Integer rankIntegralSt){
            this.rankIntegralSt = rankIntegralSt;
            return this;
        }
        public ConditionBuilder rankIntegralLessEqThan(Integer rankIntegralEd){
            this.rankIntegralEd = rankIntegralEd;
            return this;
        }


        public ConditionBuilder rankIntegralList(Integer ... rankIntegral){
            this.rankIntegralList = solveNullList(rankIntegral);
            return this;
        }

        public ConditionBuilder rankIntegralList(List<Integer> rankIntegral){
            this.rankIntegralList = rankIntegral;
            return this;
        }

        public ConditionBuilder suppliersIdBetWeen(Integer suppliersIdSt,Integer suppliersIdEd){
            this.suppliersIdSt = suppliersIdSt;
            this.suppliersIdEd = suppliersIdEd;
            return this;
        }

        public ConditionBuilder suppliersIdGreaterEqThan(Integer suppliersIdSt){
            this.suppliersIdSt = suppliersIdSt;
            return this;
        }
        public ConditionBuilder suppliersIdLessEqThan(Integer suppliersIdEd){
            this.suppliersIdEd = suppliersIdEd;
            return this;
        }


        public ConditionBuilder suppliersIdList(Integer ... suppliersId){
            this.suppliersIdList = solveNullList(suppliersId);
            return this;
        }

        public ConditionBuilder suppliersIdList(List<Integer> suppliersId){
            this.suppliersIdList = suppliersId;
            return this;
        }

        public ConditionBuilder isCheckBetWeen(Integer isCheckSt,Integer isCheckEd){
            this.isCheckSt = isCheckSt;
            this.isCheckEd = isCheckEd;
            return this;
        }

        public ConditionBuilder isCheckGreaterEqThan(Integer isCheckSt){
            this.isCheckSt = isCheckSt;
            return this;
        }
        public ConditionBuilder isCheckLessEqThan(Integer isCheckEd){
            this.isCheckEd = isCheckEd;
            return this;
        }


        public ConditionBuilder isCheckList(Integer ... isCheck){
            this.isCheckList = solveNullList(isCheck);
            return this;
        }

        public ConditionBuilder isCheckList(List<Integer> isCheck){
            this.isCheckList = isCheck;
            return this;
        }

        public ConditionBuilder needIdcardBetWeen(Integer needIdcardSt,Integer needIdcardEd){
            this.needIdcardSt = needIdcardSt;
            this.needIdcardEd = needIdcardEd;
            return this;
        }

        public ConditionBuilder needIdcardGreaterEqThan(Integer needIdcardSt){
            this.needIdcardSt = needIdcardSt;
            return this;
        }
        public ConditionBuilder needIdcardLessEqThan(Integer needIdcardEd){
            this.needIdcardEd = needIdcardEd;
            return this;
        }


        public ConditionBuilder needIdcardList(Integer ... needIdcard){
            this.needIdcardList = solveNullList(needIdcard);
            return this;
        }

        public ConditionBuilder needIdcardList(List<Integer> needIdcard){
            this.needIdcardList = needIdcard;
            return this;
        }

        public ConditionBuilder isBonusBetWeen(Integer isBonusSt,Integer isBonusEd){
            this.isBonusSt = isBonusSt;
            this.isBonusEd = isBonusEd;
            return this;
        }

        public ConditionBuilder isBonusGreaterEqThan(Integer isBonusSt){
            this.isBonusSt = isBonusSt;
            return this;
        }
        public ConditionBuilder isBonusLessEqThan(Integer isBonusEd){
            this.isBonusEd = isBonusEd;
            return this;
        }


        public ConditionBuilder isBonusList(Integer ... isBonus){
            this.isBonusList = solveNullList(isBonus);
            return this;
        }

        public ConditionBuilder isBonusList(List<Integer> isBonus){
            this.isBonusList = isBonus;
            return this;
        }

        public ConditionBuilder fuzzySecondaryTitle (List<String> fuzzySecondaryTitle){
            this.fuzzySecondaryTitle = fuzzySecondaryTitle;
            return this;
        }

        public ConditionBuilder fuzzySecondaryTitle (String ... fuzzySecondaryTitle){
            this.fuzzySecondaryTitle = solveNullList(fuzzySecondaryTitle);
            return this;
        }

        public ConditionBuilder rightFuzzySecondaryTitle (List<String> rightFuzzySecondaryTitle){
            this.rightFuzzySecondaryTitle = rightFuzzySecondaryTitle;
            return this;
        }

        public ConditionBuilder rightFuzzySecondaryTitle (String ... rightFuzzySecondaryTitle){
            this.rightFuzzySecondaryTitle = solveNullList(rightFuzzySecondaryTitle);
            return this;
        }

        public ConditionBuilder secondaryTitleList(String ... secondaryTitle){
            this.secondaryTitleList = solveNullList(secondaryTitle);
            return this;
        }

        public ConditionBuilder secondaryTitleList(List<String> secondaryTitle){
            this.secondaryTitleList = secondaryTitle;
            return this;
        }

        public ConditionBuilder fuzzyTag (List<String> fuzzyTag){
            this.fuzzyTag = fuzzyTag;
            return this;
        }

        public ConditionBuilder fuzzyTag (String ... fuzzyTag){
            this.fuzzyTag = solveNullList(fuzzyTag);
            return this;
        }

        public ConditionBuilder rightFuzzyTag (List<String> rightFuzzyTag){
            this.rightFuzzyTag = rightFuzzyTag;
            return this;
        }

        public ConditionBuilder rightFuzzyTag (String ... rightFuzzyTag){
            this.rightFuzzyTag = solveNullList(rightFuzzyTag);
            return this;
        }

        public ConditionBuilder tagList(String ... tag){
            this.tagList = solveNullList(tag);
            return this;
        }

        public ConditionBuilder tagList(List<String> tag){
            this.tagList = tag;
            return this;
        }

        public ConditionBuilder shippingFeeBetWeen(java.math.BigDecimal shippingFeeSt,java.math.BigDecimal shippingFeeEd){
            this.shippingFeeSt = shippingFeeSt;
            this.shippingFeeEd = shippingFeeEd;
            return this;
        }

        public ConditionBuilder shippingFeeGreaterEqThan(java.math.BigDecimal shippingFeeSt){
            this.shippingFeeSt = shippingFeeSt;
            return this;
        }
        public ConditionBuilder shippingFeeLessEqThan(java.math.BigDecimal shippingFeeEd){
            this.shippingFeeEd = shippingFeeEd;
            return this;
        }


        public ConditionBuilder shippingFeeList(java.math.BigDecimal ... shippingFee){
            this.shippingFeeList = solveNullList(shippingFee);
            return this;
        }

        public ConditionBuilder shippingFeeList(List<java.math.BigDecimal> shippingFee){
            this.shippingFeeList = shippingFee;
            return this;
        }

        public ConditionBuilder fuzzyProductionPlace (List<String> fuzzyProductionPlace){
            this.fuzzyProductionPlace = fuzzyProductionPlace;
            return this;
        }

        public ConditionBuilder fuzzyProductionPlace (String ... fuzzyProductionPlace){
            this.fuzzyProductionPlace = solveNullList(fuzzyProductionPlace);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionPlace (List<String> rightFuzzyProductionPlace){
            this.rightFuzzyProductionPlace = rightFuzzyProductionPlace;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionPlace (String ... rightFuzzyProductionPlace){
            this.rightFuzzyProductionPlace = solveNullList(rightFuzzyProductionPlace);
            return this;
        }

        public ConditionBuilder productionPlaceList(String ... productionPlace){
            this.productionPlaceList = solveNullList(productionPlace);
            return this;
        }

        public ConditionBuilder productionPlaceList(List<String> productionPlace){
            this.productionPlaceList = productionPlace;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg1 (List<String> fuzzyGoodsImg1){
            this.fuzzyGoodsImg1 = fuzzyGoodsImg1;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg1 (String ... fuzzyGoodsImg1){
            this.fuzzyGoodsImg1 = solveNullList(fuzzyGoodsImg1);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg1 (List<String> rightFuzzyGoodsImg1){
            this.rightFuzzyGoodsImg1 = rightFuzzyGoodsImg1;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg1 (String ... rightFuzzyGoodsImg1){
            this.rightFuzzyGoodsImg1 = solveNullList(rightFuzzyGoodsImg1);
            return this;
        }

        public ConditionBuilder goodsImg1List(String ... goodsImg1){
            this.goodsImg1List = solveNullList(goodsImg1);
            return this;
        }

        public ConditionBuilder goodsImg1List(List<String> goodsImg1){
            this.goodsImg1List = goodsImg1;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg2 (List<String> fuzzyGoodsImg2){
            this.fuzzyGoodsImg2 = fuzzyGoodsImg2;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg2 (String ... fuzzyGoodsImg2){
            this.fuzzyGoodsImg2 = solveNullList(fuzzyGoodsImg2);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg2 (List<String> rightFuzzyGoodsImg2){
            this.rightFuzzyGoodsImg2 = rightFuzzyGoodsImg2;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg2 (String ... rightFuzzyGoodsImg2){
            this.rightFuzzyGoodsImg2 = solveNullList(rightFuzzyGoodsImg2);
            return this;
        }

        public ConditionBuilder goodsImg2List(String ... goodsImg2){
            this.goodsImg2List = solveNullList(goodsImg2);
            return this;
        }

        public ConditionBuilder goodsImg2List(List<String> goodsImg2){
            this.goodsImg2List = goodsImg2;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg3 (List<String> fuzzyGoodsImg3){
            this.fuzzyGoodsImg3 = fuzzyGoodsImg3;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg3 (String ... fuzzyGoodsImg3){
            this.fuzzyGoodsImg3 = solveNullList(fuzzyGoodsImg3);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg3 (List<String> rightFuzzyGoodsImg3){
            this.rightFuzzyGoodsImg3 = rightFuzzyGoodsImg3;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg3 (String ... rightFuzzyGoodsImg3){
            this.rightFuzzyGoodsImg3 = solveNullList(rightFuzzyGoodsImg3);
            return this;
        }

        public ConditionBuilder goodsImg3List(String ... goodsImg3){
            this.goodsImg3List = solveNullList(goodsImg3);
            return this;
        }

        public ConditionBuilder goodsImg3List(List<String> goodsImg3){
            this.goodsImg3List = goodsImg3;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg4 (List<String> fuzzyGoodsImg4){
            this.fuzzyGoodsImg4 = fuzzyGoodsImg4;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg4 (String ... fuzzyGoodsImg4){
            this.fuzzyGoodsImg4 = solveNullList(fuzzyGoodsImg4);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg4 (List<String> rightFuzzyGoodsImg4){
            this.rightFuzzyGoodsImg4 = rightFuzzyGoodsImg4;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg4 (String ... rightFuzzyGoodsImg4){
            this.rightFuzzyGoodsImg4 = solveNullList(rightFuzzyGoodsImg4);
            return this;
        }

        public ConditionBuilder goodsImg4List(String ... goodsImg4){
            this.goodsImg4List = solveNullList(goodsImg4);
            return this;
        }

        public ConditionBuilder goodsImg4List(List<String> goodsImg4){
            this.goodsImg4List = goodsImg4;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg5 (List<String> fuzzyGoodsImg5){
            this.fuzzyGoodsImg5 = fuzzyGoodsImg5;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg5 (String ... fuzzyGoodsImg5){
            this.fuzzyGoodsImg5 = solveNullList(fuzzyGoodsImg5);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg5 (List<String> rightFuzzyGoodsImg5){
            this.rightFuzzyGoodsImg5 = rightFuzzyGoodsImg5;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg5 (String ... rightFuzzyGoodsImg5){
            this.rightFuzzyGoodsImg5 = solveNullList(rightFuzzyGoodsImg5);
            return this;
        }

        public ConditionBuilder goodsImg5List(String ... goodsImg5){
            this.goodsImg5List = solveNullList(goodsImg5);
            return this;
        }

        public ConditionBuilder goodsImg5List(List<String> goodsImg5){
            this.goodsImg5List = goodsImg5;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg6 (List<String> fuzzyGoodsImg6){
            this.fuzzyGoodsImg6 = fuzzyGoodsImg6;
            return this;
        }

        public ConditionBuilder fuzzyGoodsImg6 (String ... fuzzyGoodsImg6){
            this.fuzzyGoodsImg6 = solveNullList(fuzzyGoodsImg6);
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg6 (List<String> rightFuzzyGoodsImg6){
            this.rightFuzzyGoodsImg6 = rightFuzzyGoodsImg6;
            return this;
        }

        public ConditionBuilder rightFuzzyGoodsImg6 (String ... rightFuzzyGoodsImg6){
            this.rightFuzzyGoodsImg6 = solveNullList(rightFuzzyGoodsImg6);
            return this;
        }

        public ConditionBuilder goodsImg6List(String ... goodsImg6){
            this.goodsImg6List = solveNullList(goodsImg6);
            return this;
        }

        public ConditionBuilder goodsImg6List(List<String> goodsImg6){
            this.goodsImg6List = goodsImg6;
            return this;
        }

        public ConditionBuilder fuzzySuppliers (List<String> fuzzySuppliers){
            this.fuzzySuppliers = fuzzySuppliers;
            return this;
        }

        public ConditionBuilder fuzzySuppliers (String ... fuzzySuppliers){
            this.fuzzySuppliers = solveNullList(fuzzySuppliers);
            return this;
        }

        public ConditionBuilder rightFuzzySuppliers (List<String> rightFuzzySuppliers){
            this.rightFuzzySuppliers = rightFuzzySuppliers;
            return this;
        }

        public ConditionBuilder rightFuzzySuppliers (String ... rightFuzzySuppliers){
            this.rightFuzzySuppliers = solveNullList(rightFuzzySuppliers);
            return this;
        }

        public ConditionBuilder suppliersList(String ... suppliers){
            this.suppliersList = solveNullList(suppliers);
            return this;
        }

        public ConditionBuilder suppliersList(List<String> suppliers){
            this.suppliersList = suppliers;
            return this;
        }

        public ConditionBuilder fuzzyIsShowDesc (List<String> fuzzyIsShowDesc){
            this.fuzzyIsShowDesc = fuzzyIsShowDesc;
            return this;
        }

        public ConditionBuilder fuzzyIsShowDesc (String ... fuzzyIsShowDesc){
            this.fuzzyIsShowDesc = solveNullList(fuzzyIsShowDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyIsShowDesc (List<String> rightFuzzyIsShowDesc){
            this.rightFuzzyIsShowDesc = rightFuzzyIsShowDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyIsShowDesc (String ... rightFuzzyIsShowDesc){
            this.rightFuzzyIsShowDesc = solveNullList(rightFuzzyIsShowDesc);
            return this;
        }

        public ConditionBuilder isShowDescList(String ... isShowDesc){
            this.isShowDescList = solveNullList(isShowDesc);
            return this;
        }

        public ConditionBuilder isShowDescList(List<String> isShowDesc){
            this.isShowDescList = isShowDesc;
            return this;
        }

        public ConditionBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public ConditionBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public ConditionBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public ConditionBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public ConditionBuilder fuzzySpecification1Name (List<String> fuzzySpecification1Name){
            this.fuzzySpecification1Name = fuzzySpecification1Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification1Name (String ... fuzzySpecification1Name){
            this.fuzzySpecification1Name = solveNullList(fuzzySpecification1Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification1Name (List<String> rightFuzzySpecification1Name){
            this.rightFuzzySpecification1Name = rightFuzzySpecification1Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification1Name (String ... rightFuzzySpecification1Name){
            this.rightFuzzySpecification1Name = solveNullList(rightFuzzySpecification1Name);
            return this;
        }

        public ConditionBuilder specification1NameList(String ... specification1Name){
            this.specification1NameList = solveNullList(specification1Name);
            return this;
        }

        public ConditionBuilder specification1NameList(List<String> specification1Name){
            this.specification1NameList = specification1Name;
            return this;
        }

        public ConditionBuilder specification1PriceBetWeen(java.math.BigDecimal specification1PriceSt,java.math.BigDecimal specification1PriceEd){
            this.specification1PriceSt = specification1PriceSt;
            this.specification1PriceEd = specification1PriceEd;
            return this;
        }

        public ConditionBuilder specification1PriceGreaterEqThan(java.math.BigDecimal specification1PriceSt){
            this.specification1PriceSt = specification1PriceSt;
            return this;
        }
        public ConditionBuilder specification1PriceLessEqThan(java.math.BigDecimal specification1PriceEd){
            this.specification1PriceEd = specification1PriceEd;
            return this;
        }


        public ConditionBuilder specification1PriceList(java.math.BigDecimal ... specification1Price){
            this.specification1PriceList = solveNullList(specification1Price);
            return this;
        }

        public ConditionBuilder specification1PriceList(List<java.math.BigDecimal> specification1Price){
            this.specification1PriceList = specification1Price;
            return this;
        }

        public ConditionBuilder specification1ConsumeNumBetWeen(Integer specification1ConsumeNumSt,Integer specification1ConsumeNumEd){
            this.specification1ConsumeNumSt = specification1ConsumeNumSt;
            this.specification1ConsumeNumEd = specification1ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification1ConsumeNumGreaterEqThan(Integer specification1ConsumeNumSt){
            this.specification1ConsumeNumSt = specification1ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification1ConsumeNumLessEqThan(Integer specification1ConsumeNumEd){
            this.specification1ConsumeNumEd = specification1ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification1ConsumeNumList(Integer ... specification1ConsumeNum){
            this.specification1ConsumeNumList = solveNullList(specification1ConsumeNum);
            return this;
        }

        public ConditionBuilder specification1ConsumeNumList(List<Integer> specification1ConsumeNum){
            this.specification1ConsumeNumList = specification1ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification2Name (List<String> fuzzySpecification2Name){
            this.fuzzySpecification2Name = fuzzySpecification2Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification2Name (String ... fuzzySpecification2Name){
            this.fuzzySpecification2Name = solveNullList(fuzzySpecification2Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification2Name (List<String> rightFuzzySpecification2Name){
            this.rightFuzzySpecification2Name = rightFuzzySpecification2Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification2Name (String ... rightFuzzySpecification2Name){
            this.rightFuzzySpecification2Name = solveNullList(rightFuzzySpecification2Name);
            return this;
        }

        public ConditionBuilder specification2NameList(String ... specification2Name){
            this.specification2NameList = solveNullList(specification2Name);
            return this;
        }

        public ConditionBuilder specification2NameList(List<String> specification2Name){
            this.specification2NameList = specification2Name;
            return this;
        }

        public ConditionBuilder specification2PriceBetWeen(java.math.BigDecimal specification2PriceSt,java.math.BigDecimal specification2PriceEd){
            this.specification2PriceSt = specification2PriceSt;
            this.specification2PriceEd = specification2PriceEd;
            return this;
        }

        public ConditionBuilder specification2PriceGreaterEqThan(java.math.BigDecimal specification2PriceSt){
            this.specification2PriceSt = specification2PriceSt;
            return this;
        }
        public ConditionBuilder specification2PriceLessEqThan(java.math.BigDecimal specification2PriceEd){
            this.specification2PriceEd = specification2PriceEd;
            return this;
        }


        public ConditionBuilder specification2PriceList(java.math.BigDecimal ... specification2Price){
            this.specification2PriceList = solveNullList(specification2Price);
            return this;
        }

        public ConditionBuilder specification2PriceList(List<java.math.BigDecimal> specification2Price){
            this.specification2PriceList = specification2Price;
            return this;
        }

        public ConditionBuilder specification2ConsumeNumBetWeen(Integer specification2ConsumeNumSt,Integer specification2ConsumeNumEd){
            this.specification2ConsumeNumSt = specification2ConsumeNumSt;
            this.specification2ConsumeNumEd = specification2ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification2ConsumeNumGreaterEqThan(Integer specification2ConsumeNumSt){
            this.specification2ConsumeNumSt = specification2ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification2ConsumeNumLessEqThan(Integer specification2ConsumeNumEd){
            this.specification2ConsumeNumEd = specification2ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification2ConsumeNumList(Integer ... specification2ConsumeNum){
            this.specification2ConsumeNumList = solveNullList(specification2ConsumeNum);
            return this;
        }

        public ConditionBuilder specification2ConsumeNumList(List<Integer> specification2ConsumeNum){
            this.specification2ConsumeNumList = specification2ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification3Name (List<String> fuzzySpecification3Name){
            this.fuzzySpecification3Name = fuzzySpecification3Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification3Name (String ... fuzzySpecification3Name){
            this.fuzzySpecification3Name = solveNullList(fuzzySpecification3Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification3Name (List<String> rightFuzzySpecification3Name){
            this.rightFuzzySpecification3Name = rightFuzzySpecification3Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification3Name (String ... rightFuzzySpecification3Name){
            this.rightFuzzySpecification3Name = solveNullList(rightFuzzySpecification3Name);
            return this;
        }

        public ConditionBuilder specification3NameList(String ... specification3Name){
            this.specification3NameList = solveNullList(specification3Name);
            return this;
        }

        public ConditionBuilder specification3NameList(List<String> specification3Name){
            this.specification3NameList = specification3Name;
            return this;
        }

        public ConditionBuilder specification3PriceBetWeen(java.math.BigDecimal specification3PriceSt,java.math.BigDecimal specification3PriceEd){
            this.specification3PriceSt = specification3PriceSt;
            this.specification3PriceEd = specification3PriceEd;
            return this;
        }

        public ConditionBuilder specification3PriceGreaterEqThan(java.math.BigDecimal specification3PriceSt){
            this.specification3PriceSt = specification3PriceSt;
            return this;
        }
        public ConditionBuilder specification3PriceLessEqThan(java.math.BigDecimal specification3PriceEd){
            this.specification3PriceEd = specification3PriceEd;
            return this;
        }


        public ConditionBuilder specification3PriceList(java.math.BigDecimal ... specification3Price){
            this.specification3PriceList = solveNullList(specification3Price);
            return this;
        }

        public ConditionBuilder specification3PriceList(List<java.math.BigDecimal> specification3Price){
            this.specification3PriceList = specification3Price;
            return this;
        }

        public ConditionBuilder specification3ConsumeNumBetWeen(Integer specification3ConsumeNumSt,Integer specification3ConsumeNumEd){
            this.specification3ConsumeNumSt = specification3ConsumeNumSt;
            this.specification3ConsumeNumEd = specification3ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification3ConsumeNumGreaterEqThan(Integer specification3ConsumeNumSt){
            this.specification3ConsumeNumSt = specification3ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification3ConsumeNumLessEqThan(Integer specification3ConsumeNumEd){
            this.specification3ConsumeNumEd = specification3ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification3ConsumeNumList(Integer ... specification3ConsumeNum){
            this.specification3ConsumeNumList = solveNullList(specification3ConsumeNum);
            return this;
        }

        public ConditionBuilder specification3ConsumeNumList(List<Integer> specification3ConsumeNum){
            this.specification3ConsumeNumList = specification3ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification4Name (List<String> fuzzySpecification4Name){
            this.fuzzySpecification4Name = fuzzySpecification4Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification4Name (String ... fuzzySpecification4Name){
            this.fuzzySpecification4Name = solveNullList(fuzzySpecification4Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification4Name (List<String> rightFuzzySpecification4Name){
            this.rightFuzzySpecification4Name = rightFuzzySpecification4Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification4Name (String ... rightFuzzySpecification4Name){
            this.rightFuzzySpecification4Name = solveNullList(rightFuzzySpecification4Name);
            return this;
        }

        public ConditionBuilder specification4NameList(String ... specification4Name){
            this.specification4NameList = solveNullList(specification4Name);
            return this;
        }

        public ConditionBuilder specification4NameList(List<String> specification4Name){
            this.specification4NameList = specification4Name;
            return this;
        }

        public ConditionBuilder specification4PriceBetWeen(java.math.BigDecimal specification4PriceSt,java.math.BigDecimal specification4PriceEd){
            this.specification4PriceSt = specification4PriceSt;
            this.specification4PriceEd = specification4PriceEd;
            return this;
        }

        public ConditionBuilder specification4PriceGreaterEqThan(java.math.BigDecimal specification4PriceSt){
            this.specification4PriceSt = specification4PriceSt;
            return this;
        }
        public ConditionBuilder specification4PriceLessEqThan(java.math.BigDecimal specification4PriceEd){
            this.specification4PriceEd = specification4PriceEd;
            return this;
        }


        public ConditionBuilder specification4PriceList(java.math.BigDecimal ... specification4Price){
            this.specification4PriceList = solveNullList(specification4Price);
            return this;
        }

        public ConditionBuilder specification4PriceList(List<java.math.BigDecimal> specification4Price){
            this.specification4PriceList = specification4Price;
            return this;
        }

        public ConditionBuilder specification4ConsumeNumBetWeen(Integer specification4ConsumeNumSt,Integer specification4ConsumeNumEd){
            this.specification4ConsumeNumSt = specification4ConsumeNumSt;
            this.specification4ConsumeNumEd = specification4ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification4ConsumeNumGreaterEqThan(Integer specification4ConsumeNumSt){
            this.specification4ConsumeNumSt = specification4ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification4ConsumeNumLessEqThan(Integer specification4ConsumeNumEd){
            this.specification4ConsumeNumEd = specification4ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification4ConsumeNumList(Integer ... specification4ConsumeNum){
            this.specification4ConsumeNumList = solveNullList(specification4ConsumeNum);
            return this;
        }

        public ConditionBuilder specification4ConsumeNumList(List<Integer> specification4ConsumeNum){
            this.specification4ConsumeNumList = specification4ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification5Name (List<String> fuzzySpecification5Name){
            this.fuzzySpecification5Name = fuzzySpecification5Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification5Name (String ... fuzzySpecification5Name){
            this.fuzzySpecification5Name = solveNullList(fuzzySpecification5Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification5Name (List<String> rightFuzzySpecification5Name){
            this.rightFuzzySpecification5Name = rightFuzzySpecification5Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification5Name (String ... rightFuzzySpecification5Name){
            this.rightFuzzySpecification5Name = solveNullList(rightFuzzySpecification5Name);
            return this;
        }

        public ConditionBuilder specification5NameList(String ... specification5Name){
            this.specification5NameList = solveNullList(specification5Name);
            return this;
        }

        public ConditionBuilder specification5NameList(List<String> specification5Name){
            this.specification5NameList = specification5Name;
            return this;
        }

        public ConditionBuilder specification5PriceBetWeen(java.math.BigDecimal specification5PriceSt,java.math.BigDecimal specification5PriceEd){
            this.specification5PriceSt = specification5PriceSt;
            this.specification5PriceEd = specification5PriceEd;
            return this;
        }

        public ConditionBuilder specification5PriceGreaterEqThan(java.math.BigDecimal specification5PriceSt){
            this.specification5PriceSt = specification5PriceSt;
            return this;
        }
        public ConditionBuilder specification5PriceLessEqThan(java.math.BigDecimal specification5PriceEd){
            this.specification5PriceEd = specification5PriceEd;
            return this;
        }


        public ConditionBuilder specification5PriceList(java.math.BigDecimal ... specification5Price){
            this.specification5PriceList = solveNullList(specification5Price);
            return this;
        }

        public ConditionBuilder specification5PriceList(List<java.math.BigDecimal> specification5Price){
            this.specification5PriceList = specification5Price;
            return this;
        }

        public ConditionBuilder specification5ConsumeNumBetWeen(Integer specification5ConsumeNumSt,Integer specification5ConsumeNumEd){
            this.specification5ConsumeNumSt = specification5ConsumeNumSt;
            this.specification5ConsumeNumEd = specification5ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification5ConsumeNumGreaterEqThan(Integer specification5ConsumeNumSt){
            this.specification5ConsumeNumSt = specification5ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification5ConsumeNumLessEqThan(Integer specification5ConsumeNumEd){
            this.specification5ConsumeNumEd = specification5ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification5ConsumeNumList(Integer ... specification5ConsumeNum){
            this.specification5ConsumeNumList = solveNullList(specification5ConsumeNum);
            return this;
        }

        public ConditionBuilder specification5ConsumeNumList(List<Integer> specification5ConsumeNum){
            this.specification5ConsumeNumList = specification5ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification6Name (List<String> fuzzySpecification6Name){
            this.fuzzySpecification6Name = fuzzySpecification6Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification6Name (String ... fuzzySpecification6Name){
            this.fuzzySpecification6Name = solveNullList(fuzzySpecification6Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification6Name (List<String> rightFuzzySpecification6Name){
            this.rightFuzzySpecification6Name = rightFuzzySpecification6Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification6Name (String ... rightFuzzySpecification6Name){
            this.rightFuzzySpecification6Name = solveNullList(rightFuzzySpecification6Name);
            return this;
        }

        public ConditionBuilder specification6NameList(String ... specification6Name){
            this.specification6NameList = solveNullList(specification6Name);
            return this;
        }

        public ConditionBuilder specification6NameList(List<String> specification6Name){
            this.specification6NameList = specification6Name;
            return this;
        }

        public ConditionBuilder specification6PriceBetWeen(java.math.BigDecimal specification6PriceSt,java.math.BigDecimal specification6PriceEd){
            this.specification6PriceSt = specification6PriceSt;
            this.specification6PriceEd = specification6PriceEd;
            return this;
        }

        public ConditionBuilder specification6PriceGreaterEqThan(java.math.BigDecimal specification6PriceSt){
            this.specification6PriceSt = specification6PriceSt;
            return this;
        }
        public ConditionBuilder specification6PriceLessEqThan(java.math.BigDecimal specification6PriceEd){
            this.specification6PriceEd = specification6PriceEd;
            return this;
        }


        public ConditionBuilder specification6PriceList(java.math.BigDecimal ... specification6Price){
            this.specification6PriceList = solveNullList(specification6Price);
            return this;
        }

        public ConditionBuilder specification6PriceList(List<java.math.BigDecimal> specification6Price){
            this.specification6PriceList = specification6Price;
            return this;
        }

        public ConditionBuilder specification6ConsumeNumBetWeen(Integer specification6ConsumeNumSt,Integer specification6ConsumeNumEd){
            this.specification6ConsumeNumSt = specification6ConsumeNumSt;
            this.specification6ConsumeNumEd = specification6ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification6ConsumeNumGreaterEqThan(Integer specification6ConsumeNumSt){
            this.specification6ConsumeNumSt = specification6ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification6ConsumeNumLessEqThan(Integer specification6ConsumeNumEd){
            this.specification6ConsumeNumEd = specification6ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification6ConsumeNumList(Integer ... specification6ConsumeNum){
            this.specification6ConsumeNumList = solveNullList(specification6ConsumeNum);
            return this;
        }

        public ConditionBuilder specification6ConsumeNumList(List<Integer> specification6ConsumeNum){
            this.specification6ConsumeNumList = specification6ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification7Name (List<String> fuzzySpecification7Name){
            this.fuzzySpecification7Name = fuzzySpecification7Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification7Name (String ... fuzzySpecification7Name){
            this.fuzzySpecification7Name = solveNullList(fuzzySpecification7Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification7Name (List<String> rightFuzzySpecification7Name){
            this.rightFuzzySpecification7Name = rightFuzzySpecification7Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification7Name (String ... rightFuzzySpecification7Name){
            this.rightFuzzySpecification7Name = solveNullList(rightFuzzySpecification7Name);
            return this;
        }

        public ConditionBuilder specification7NameList(String ... specification7Name){
            this.specification7NameList = solveNullList(specification7Name);
            return this;
        }

        public ConditionBuilder specification7NameList(List<String> specification7Name){
            this.specification7NameList = specification7Name;
            return this;
        }

        public ConditionBuilder specification7PriceBetWeen(java.math.BigDecimal specification7PriceSt,java.math.BigDecimal specification7PriceEd){
            this.specification7PriceSt = specification7PriceSt;
            this.specification7PriceEd = specification7PriceEd;
            return this;
        }

        public ConditionBuilder specification7PriceGreaterEqThan(java.math.BigDecimal specification7PriceSt){
            this.specification7PriceSt = specification7PriceSt;
            return this;
        }
        public ConditionBuilder specification7PriceLessEqThan(java.math.BigDecimal specification7PriceEd){
            this.specification7PriceEd = specification7PriceEd;
            return this;
        }


        public ConditionBuilder specification7PriceList(java.math.BigDecimal ... specification7Price){
            this.specification7PriceList = solveNullList(specification7Price);
            return this;
        }

        public ConditionBuilder specification7PriceList(List<java.math.BigDecimal> specification7Price){
            this.specification7PriceList = specification7Price;
            return this;
        }

        public ConditionBuilder specification7ConsumeNumBetWeen(Integer specification7ConsumeNumSt,Integer specification7ConsumeNumEd){
            this.specification7ConsumeNumSt = specification7ConsumeNumSt;
            this.specification7ConsumeNumEd = specification7ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification7ConsumeNumGreaterEqThan(Integer specification7ConsumeNumSt){
            this.specification7ConsumeNumSt = specification7ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification7ConsumeNumLessEqThan(Integer specification7ConsumeNumEd){
            this.specification7ConsumeNumEd = specification7ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification7ConsumeNumList(Integer ... specification7ConsumeNum){
            this.specification7ConsumeNumList = solveNullList(specification7ConsumeNum);
            return this;
        }

        public ConditionBuilder specification7ConsumeNumList(List<Integer> specification7ConsumeNum){
            this.specification7ConsumeNumList = specification7ConsumeNum;
            return this;
        }

        public ConditionBuilder fuzzySpecification8Name (List<String> fuzzySpecification8Name){
            this.fuzzySpecification8Name = fuzzySpecification8Name;
            return this;
        }

        public ConditionBuilder fuzzySpecification8Name (String ... fuzzySpecification8Name){
            this.fuzzySpecification8Name = solveNullList(fuzzySpecification8Name);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification8Name (List<String> rightFuzzySpecification8Name){
            this.rightFuzzySpecification8Name = rightFuzzySpecification8Name;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification8Name (String ... rightFuzzySpecification8Name){
            this.rightFuzzySpecification8Name = solveNullList(rightFuzzySpecification8Name);
            return this;
        }

        public ConditionBuilder specification8NameList(String ... specification8Name){
            this.specification8NameList = solveNullList(specification8Name);
            return this;
        }

        public ConditionBuilder specification8NameList(List<String> specification8Name){
            this.specification8NameList = specification8Name;
            return this;
        }

        public ConditionBuilder specification8PriceBetWeen(java.math.BigDecimal specification8PriceSt,java.math.BigDecimal specification8PriceEd){
            this.specification8PriceSt = specification8PriceSt;
            this.specification8PriceEd = specification8PriceEd;
            return this;
        }

        public ConditionBuilder specification8PriceGreaterEqThan(java.math.BigDecimal specification8PriceSt){
            this.specification8PriceSt = specification8PriceSt;
            return this;
        }
        public ConditionBuilder specification8PriceLessEqThan(java.math.BigDecimal specification8PriceEd){
            this.specification8PriceEd = specification8PriceEd;
            return this;
        }


        public ConditionBuilder specification8PriceList(java.math.BigDecimal ... specification8Price){
            this.specification8PriceList = solveNullList(specification8Price);
            return this;
        }

        public ConditionBuilder specification8PriceList(List<java.math.BigDecimal> specification8Price){
            this.specification8PriceList = specification8Price;
            return this;
        }

        public ConditionBuilder specification8ConsumeNumBetWeen(Integer specification8ConsumeNumSt,Integer specification8ConsumeNumEd){
            this.specification8ConsumeNumSt = specification8ConsumeNumSt;
            this.specification8ConsumeNumEd = specification8ConsumeNumEd;
            return this;
        }

        public ConditionBuilder specification8ConsumeNumGreaterEqThan(Integer specification8ConsumeNumSt){
            this.specification8ConsumeNumSt = specification8ConsumeNumSt;
            return this;
        }
        public ConditionBuilder specification8ConsumeNumLessEqThan(Integer specification8ConsumeNumEd){
            this.specification8ConsumeNumEd = specification8ConsumeNumEd;
            return this;
        }


        public ConditionBuilder specification8ConsumeNumList(Integer ... specification8ConsumeNum){
            this.specification8ConsumeNumList = solveNullList(specification8ConsumeNum);
            return this;
        }

        public ConditionBuilder specification8ConsumeNumList(List<Integer> specification8ConsumeNum){
            this.specification8ConsumeNumList = specification8ConsumeNum;
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

        private EcsGoods obj;

        public Builder(){
            this.obj = new EcsGoods();
        }

        public Builder goodsId(Integer goodsId){
            this.obj.setGoodsId(goodsId);
            return this;
        }
        public Builder catId(Integer catId){
            this.obj.setCatId(catId);
            return this;
        }
        public Builder goodsSn(String goodsSn){
            this.obj.setGoodsSn(goodsSn);
            return this;
        }
        public Builder goodsName(String goodsName){
            this.obj.setGoodsName(goodsName);
            return this;
        }
        public Builder goodsNameStyle(String goodsNameStyle){
            this.obj.setGoodsNameStyle(goodsNameStyle);
            return this;
        }
        public Builder clickCount(Integer clickCount){
            this.obj.setClickCount(clickCount);
            return this;
        }
        public Builder brandId(Integer brandId){
            this.obj.setBrandId(brandId);
            return this;
        }
        public Builder providerName(String providerName){
            this.obj.setProviderName(providerName);
            return this;
        }
        public Builder goodsNumber(Integer goodsNumber){
            this.obj.setGoodsNumber(goodsNumber);
            return this;
        }
        public Builder goodsWeight(java.math.BigDecimal goodsWeight){
            this.obj.setGoodsWeight(goodsWeight);
            return this;
        }
        public Builder marketPrice(java.math.BigDecimal marketPrice){
            this.obj.setMarketPrice(marketPrice);
            return this;
        }
        public Builder virtualSales(Integer virtualSales){
            this.obj.setVirtualSales(virtualSales);
            return this;
        }
        public Builder shopPrice(java.math.BigDecimal shopPrice){
            this.obj.setShopPrice(shopPrice);
            return this;
        }
        public Builder promotePrice(java.math.BigDecimal promotePrice){
            this.obj.setPromotePrice(promotePrice);
            return this;
        }
        public Builder promoteStartDate(Integer promoteStartDate){
            this.obj.setPromoteStartDate(promoteStartDate);
            return this;
        }
        public Builder promoteEndDate(Integer promoteEndDate){
            this.obj.setPromoteEndDate(promoteEndDate);
            return this;
        }
        public Builder warnNumber(String warnNumber){
            this.obj.setWarnNumber(warnNumber);
            return this;
        }
        public Builder keywords(String keywords){
            this.obj.setKeywords(keywords);
            return this;
        }
        public Builder goodsBrief(String goodsBrief){
            this.obj.setGoodsBrief(goodsBrief);
            return this;
        }
        public Builder goodsDesc(String goodsDesc){
            this.obj.setGoodsDesc(goodsDesc);
            return this;
        }
        public Builder goodsThumb(String goodsThumb){
            this.obj.setGoodsThumb(goodsThumb);
            return this;
        }
        public Builder goodsImg(String goodsImg){
            this.obj.setGoodsImg(goodsImg);
            return this;
        }
        public Builder originalImg(String originalImg){
            this.obj.setOriginalImg(originalImg);
            return this;
        }
        public Builder isReal(Integer isReal){
            this.obj.setIsReal(isReal);
            return this;
        }
        public Builder extensionCode(String extensionCode){
            this.obj.setExtensionCode(extensionCode);
            return this;
        }
        public Builder isOnSale(Integer isOnSale){
            this.obj.setIsOnSale(isOnSale);
            return this;
        }
        public Builder isAloneSale(Integer isAloneSale){
            this.obj.setIsAloneSale(isAloneSale);
            return this;
        }
        public Builder isShipping(Integer isShipping){
            this.obj.setIsShipping(isShipping);
            return this;
        }
        public Builder integral(Integer integral){
            this.obj.setIntegral(integral);
            return this;
        }
        public Builder addTime(Integer addTime){
            this.obj.setAddTime(addTime);
            return this;
        }
        public Builder sortOrder(Integer sortOrder){
            this.obj.setSortOrder(sortOrder);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public Builder isBest(Integer isBest){
            this.obj.setIsBest(isBest);
            return this;
        }
        public Builder isNew(Integer isNew){
            this.obj.setIsNew(isNew);
            return this;
        }
        public Builder isHot(Integer isHot){
            this.obj.setIsHot(isHot);
            return this;
        }
        public Builder isPromote(Integer isPromote){
            this.obj.setIsPromote(isPromote);
            return this;
        }
        public Builder bonusTypeId(Integer bonusTypeId){
            this.obj.setBonusTypeId(bonusTypeId);
            return this;
        }
        public Builder lastUpdate(Integer lastUpdate){
            this.obj.setLastUpdate(lastUpdate);
            return this;
        }
        public Builder goodsType(Integer goodsType){
            this.obj.setGoodsType(goodsType);
            return this;
        }
        public Builder sellerNote(String sellerNote){
            this.obj.setSellerNote(sellerNote);
            return this;
        }
        public Builder giveIntegral(Integer giveIntegral){
            this.obj.setGiveIntegral(giveIntegral);
            return this;
        }
        public Builder rankIntegral(Integer rankIntegral){
            this.obj.setRankIntegral(rankIntegral);
            return this;
        }
        public Builder suppliersId(Integer suppliersId){
            this.obj.setSuppliersId(suppliersId);
            return this;
        }
        public Builder isCheck(Integer isCheck){
            this.obj.setIsCheck(isCheck);
            return this;
        }
        public Builder needIdcard(Integer needIdcard){
            this.obj.setNeedIdcard(needIdcard);
            return this;
        }
        public Builder isBonus(Integer isBonus){
            this.obj.setIsBonus(isBonus);
            return this;
        }
        public Builder secondaryTitle(String secondaryTitle){
            this.obj.setSecondaryTitle(secondaryTitle);
            return this;
        }
        public Builder tag(String tag){
            this.obj.setTag(tag);
            return this;
        }
        public Builder shippingFee(java.math.BigDecimal shippingFee){
            this.obj.setShippingFee(shippingFee);
            return this;
        }
        public Builder productionPlace(String productionPlace){
            this.obj.setProductionPlace(productionPlace);
            return this;
        }
        public Builder goodsImg1(String goodsImg1){
            this.obj.setGoodsImg1(goodsImg1);
            return this;
        }
        public Builder goodsImg2(String goodsImg2){
            this.obj.setGoodsImg2(goodsImg2);
            return this;
        }
        public Builder goodsImg3(String goodsImg3){
            this.obj.setGoodsImg3(goodsImg3);
            return this;
        }
        public Builder goodsImg4(String goodsImg4){
            this.obj.setGoodsImg4(goodsImg4);
            return this;
        }
        public Builder goodsImg5(String goodsImg5){
            this.obj.setGoodsImg5(goodsImg5);
            return this;
        }
        public Builder goodsImg6(String goodsImg6){
            this.obj.setGoodsImg6(goodsImg6);
            return this;
        }
        public Builder suppliers(String suppliers){
            this.obj.setSuppliers(suppliers);
            return this;
        }
        public Builder isShowDesc(String isShowDesc){
            this.obj.setIsShowDesc(isShowDesc);
            return this;
        }
        public Builder description(String description){
            this.obj.setDescription(description);
            return this;
        }
        public Builder specification1Name(String specification1Name){
            this.obj.setSpecification1Name(specification1Name);
            return this;
        }
        public Builder specification1Price(java.math.BigDecimal specification1Price){
            this.obj.setSpecification1Price(specification1Price);
            return this;
        }
        public Builder specification1ConsumeNum(Integer specification1ConsumeNum){
            this.obj.setSpecification1ConsumeNum(specification1ConsumeNum);
            return this;
        }
        public Builder specification2Name(String specification2Name){
            this.obj.setSpecification2Name(specification2Name);
            return this;
        }
        public Builder specification2Price(java.math.BigDecimal specification2Price){
            this.obj.setSpecification2Price(specification2Price);
            return this;
        }
        public Builder specification2ConsumeNum(Integer specification2ConsumeNum){
            this.obj.setSpecification2ConsumeNum(specification2ConsumeNum);
            return this;
        }
        public Builder specification3Name(String specification3Name){
            this.obj.setSpecification3Name(specification3Name);
            return this;
        }
        public Builder specification3Price(java.math.BigDecimal specification3Price){
            this.obj.setSpecification3Price(specification3Price);
            return this;
        }
        public Builder specification3ConsumeNum(Integer specification3ConsumeNum){
            this.obj.setSpecification3ConsumeNum(specification3ConsumeNum);
            return this;
        }
        public Builder specification4Name(String specification4Name){
            this.obj.setSpecification4Name(specification4Name);
            return this;
        }
        public Builder specification4Price(java.math.BigDecimal specification4Price){
            this.obj.setSpecification4Price(specification4Price);
            return this;
        }
        public Builder specification4ConsumeNum(Integer specification4ConsumeNum){
            this.obj.setSpecification4ConsumeNum(specification4ConsumeNum);
            return this;
        }
        public Builder specification5Name(String specification5Name){
            this.obj.setSpecification5Name(specification5Name);
            return this;
        }
        public Builder specification5Price(java.math.BigDecimal specification5Price){
            this.obj.setSpecification5Price(specification5Price);
            return this;
        }
        public Builder specification5ConsumeNum(Integer specification5ConsumeNum){
            this.obj.setSpecification5ConsumeNum(specification5ConsumeNum);
            return this;
        }
        public Builder specification6Name(String specification6Name){
            this.obj.setSpecification6Name(specification6Name);
            return this;
        }
        public Builder specification6Price(java.math.BigDecimal specification6Price){
            this.obj.setSpecification6Price(specification6Price);
            return this;
        }
        public Builder specification6ConsumeNum(Integer specification6ConsumeNum){
            this.obj.setSpecification6ConsumeNum(specification6ConsumeNum);
            return this;
        }
        public Builder specification7Name(String specification7Name){
            this.obj.setSpecification7Name(specification7Name);
            return this;
        }
        public Builder specification7Price(java.math.BigDecimal specification7Price){
            this.obj.setSpecification7Price(specification7Price);
            return this;
        }
        public Builder specification7ConsumeNum(Integer specification7ConsumeNum){
            this.obj.setSpecification7ConsumeNum(specification7ConsumeNum);
            return this;
        }
        public Builder specification8Name(String specification8Name){
            this.obj.setSpecification8Name(specification8Name);
            return this;
        }
        public Builder specification8Price(java.math.BigDecimal specification8Price){
            this.obj.setSpecification8Price(specification8Price);
            return this;
        }
        public Builder specification8ConsumeNum(Integer specification8ConsumeNum){
            this.obj.setSpecification8ConsumeNum(specification8ConsumeNum);
            return this;
        }
        public EcsGoods build(){return obj;}
    }

}
