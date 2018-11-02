package com.kz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kz.annotation.LogInfo;
import com.kz.annotation.LogProxy;
import com.kz.dto.EcsGoods;
import com.kz.dto.EcsSpecificationDTO;
import com.kz.dto.RecordDTO;
import com.kz.dto.UserDTO;
import com.kz.learning.AImpl;
import com.kz.learning.ParentInterfaceA;
import com.kz.service.UserService;


import com.kz.util.HttpRequestUtils;
import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Component
@Service
@Controller
@Repository
@RequestMapping("/api/m")
public class MemberController {

    private final static String excel2003L =".xls";    //2003- 版本的excel
    private final static String excel2007U =".xlsx";   //2007+ 版本的excel

    @Autowired
    private JedisPool redisClient;

    @Autowired
    private UserService userService;

    @Autowired
    private AImpl a;

    @RequestMapping("/m_001")
    public String m_001(HttpServletRequest request, HttpServletResponse response) {
        try{

            PrintWriter out = response.getWriter();

            a.hello();


            int[] result = new int[2];
            result[0] = 2;

            int k = result.length;

            JSONObject jsonObject = new JSONObject(true);
            jsonObject.put("name", "asdfasdg");
            jsonObject.put("values", "10.0");
            jsonObject.put("comId", "57");

            UserService userServiceProxy = (UserService) LogProxy.getInstance(userService);


            userService.anno();

            userServiceProxy.anno();

            out.print(jsonObject.toString());

            out.close();


        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



    @RequestMapping("/m_002")
    public String m_002(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<Object, Object> data = new HashMap<Object, Object>();
        PrintWriter out = response.getWriter();
        try {


            int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
            int pageSize = Integer.valueOf(request.getParameter("pageSize"));



            JSONObject jsonObject = new JSONObject(true);

            Map<Object, Object> param = new HashMap<Object, Object>();
            param.put("pageIndex", pageIndex);
            param.put("pageSize", pageSize);

            List<UserDTO> userDTOS = userService.getKzMemberList(param);

            data.put("data", userDTOS);
            data.put("message", "success");
            data.put("state", "0");


        }catch (Exception e) {
            data.put("data", "");
            data.put("message", "failed");
            data.put("state", "1");
            e.printStackTrace();
        }finally {
            out.print(JSON.toJSONString(data));
            out.close();
            return null;
        }
    }


    @RequestMapping("/m_003")
    public String m_003(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();

        Map<Object, Object> data = new HashMap<Object, Object>();

        try {

            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String gender = request.getParameter("gender");

            UserDTO userDTO = new UserDTO();

            userDTO.setName(name);
            userDTO.setAge(Long.valueOf(age));
            userDTO.setGender(Long.valueOf(gender));
            userDTO.setCreateTime(new Date());
            userDTO.setUpdateTime(new Date());

            int result = userService.insertKzMember(userDTO);
            data.put("data", result);
            data.put("message", "success");
            data.put("state", "0");

        }catch (Exception e) {
            data.put("data", "");
            data.put("message", "failed");
            data.put("state", "1");
            e.printStackTrace();
        }finally {
            out.print(JSON.toJSONString(data));
            out.close();
            return null;
        }
    }


    @RequestMapping("/m_004")
    public String m_004(HttpServletRequest request, HttpServletResponse response) {


        try {

            PrintWriter out = response.getWriter();

            String words = request.getParameter("words");

            Jedis jedis = redisClient.getResource();

            jedis.set("words", words);

            String jedisWords = jedis.get("words");

            jedis.close();

            out.print(jedisWords);

            out.close();

        }catch (Exception e) {
            e.printStackTrace();

        }finally {
            return null;
        }
    }


    @RequestMapping("/m_005")
    public String m_005(HttpServletRequest request, HttpServletResponse response) throws Exception{

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();

        String batchTaskPass = request.getParameter("batchTaskPass");

        String pageIndex = request.getParameter("pageIndex");
        String pageSize = request.getParameter("pageSize");
        String isOnSale = request.getParameter("isOnSale");
        String isDelete = request.getParameter("isDelete");

        Integer executors = Integer.valueOf(request.getParameter("executors"));

        Integer suppliersId = Integer.valueOf(request.getParameter("suppliersId"));

        if (batchTaskPass.equals("4tduzr4GCxQKzB2XFahFLxDsS!!!---")) {


            if (pageIndex==null || pageIndex=="") {
                pageIndex = "0";
            }
            if (pageSize==null || pageSize=="") {
                pageSize = "6";
            }

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("pageIndex", Integer.valueOf(pageIndex));
            params.put("pageSize", Integer.valueOf(pageSize));
            params.put("isOnSale", Integer.valueOf(isOnSale));
            params.put("isDelete", Integer.valueOf(isDelete));
            params.put("suppliersId", suppliersId);

            List<EcsGoods> ecsGoodsList = userService.getGoodsListByCustomizedParams(params);

            List<Map<Object, Object>> goodsIdList = userService.getGoodsIdsList(params);

            writer.println("待更新的商品有"+goodsIdList.size()+"个" +",已经更新的商品id为：");

            ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 20, 500, TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<Runnable>(5));

//            for (int i = 0; i < goodsIdList.size(); i++) {
//                Map<Object, Object> goodsIdMap = goodsIdList.get(i);

                Integer groupSize = goodsIdList.size()/executors;

                for (int j = 0; j<executors; j++) {
                    List<Map<Object, Object>> subDataList = new ArrayList<>();
                    if (j-1==executors) {
                        subDataList = goodsIdList.subList(j*groupSize, goodsIdList.size()-1);
                    }else {
                        subDataList = goodsIdList.subList(j*groupSize, (j+1)*groupSize-1);
                    }

                    UpdateProductDescClass updateProductDescClass = new UpdateProductDescClass(subDataList);
                    updateProductDescClass.setPrintWriter(writer);
                    updateProductDescClass.setUserService(userService);
                    executor.execute(updateProductDescClass);

                }

//            }

        }

        return null;

    }


    @RequestMapping("")
    public void r_006(HttpServletRequest request, HttpServletResponse response) throws Exception{


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();

//        String pageIndex = request.getParameter("pageIndex");
//        String pageSize = request.getParameter("pageSize");
//
//        String product = request.getParameter("product");



        String reqUrl = "http://106.14.99.59:8080/yanxuan-openapi-prod/channel/api/getIds";

        String res = HttpRequestUtils.sendPostWithHttpClient("POST", reqUrl, "");

//        writer.print(res);

        JSONObject resObj = JSON.parseObject(res);

        JSONArray idArr = resObj.getJSONArray("result");




        if (idArr!=null && idArr.size()>0) {

            StringBuffer ids = new StringBuffer();

            int count=0;
            for (int i = 0; i < idArr.size(); i++) {



                if (count<30){
                    count++;
                    ids = ids.append(idArr.getInteger(i).toString()).append(",");

                }else {
                    count = 0;

                    // 开始请求数据

                    if (ids!=null && ids.length()>0) {
                        String productDetailReqUrl = "http://106.14.99.59:8080/yanxuan-openapi-prod/channel/api/getItems?itemIds="+ids.substring(0,ids.length()-1);
                        String productDetailRes = HttpRequestUtils.sendPostWithHttpClient("GET", productDetailReqUrl, "");

                        System.out.println(productDetailRes);

                        try {
                            JSONObject productsObj = JSON.parseObject(productDetailRes);

                            JSONArray APIItemTOArr = productsObj.getJSONArray("result");

                            if (APIItemTOArr!=null && APIItemTOArr.size()>0) {

                                for (int j = 0; j < APIItemTOArr.size(); j++) {

                                    try {

                                        // 记录原始数据
                                        RecordDTO recordDTO = new RecordDTO();



                                        JSONObject APIItemTOObj = APIItemTOArr.getJSONObject(j);

                                        //
                                        recordDTO.setOriginData(APIItemTOObj.toJSONString());

                                        EcsGoods ecsGoods = new EcsGoods();

                                        String productName = APIItemTOObj.getString("name"); // 商品名称
                                        ecsGoods.setGoodsName(productName);
                                        ecsGoods.setGoodsNumber(999);

                                        //
                                        recordDTO.setGoodsName(productName);

                                        Integer spuId = APIItemTOObj.getInteger("id");
                                        ecsGoods.setGoodsSn(spuId.toString());
                                        ecsGoods.setSuppliers("2");
                                        ecsGoods.setExtensionCode(spuId.toString());

                                        String listPicture = APIItemTOObj.getString("listPicUrl"); // 商品列表图片
                                        ecsGoods.setGoodsImg(listPicture);
                                        ecsGoods.setGoodsImg1(listPicture);


                                        String cat = "";
                                        String comCatName = "";
                                        Integer lastCatID = 0;
                                        JSONArray categoryPathList = APIItemTOObj.getJSONArray("categoryPathList"); // 商品类目 {"id":1, "name":"类1"}
                                        if (categoryPathList!=null && categoryPathList.size()>0) {
                                            for (int k = 0; k < categoryPathList.size(); k++) {

                                                JSONArray secondCatArr = categoryPathList.getJSONArray(k);

                                                if (secondCatArr!=null && secondCatArr.size()>0) {
                                                    for (int l = 0; l < secondCatArr.size(); l++) {
                                                        JSONObject categoryMap = categoryPathList.getJSONArray(k).getJSONObject(0);

                                                        String catId = categoryMap.getInteger("id").toString();
                                                        cat = cat + catId + "##";

                                                        String catName = categoryMap.getString("name");
                                                        comCatName = comCatName + catName + "##";

                                                        lastCatID = categoryMap.getInteger("id");
                                                    }
                                                }

                                                cat = cat + " || ";

                                            }

                                            if (cat!=null && cat.length()>0) {
                                                cat = cat.substring(0, cat.length()-1);
                                            }

                                            if (comCatName!=null && comCatName.length()>0) {
                                                comCatName = comCatName.substring(0, comCatName.length()-1);
                                            }
                                        }

                                        ecsGoods.setCatId(lastCatID);
                                        ecsGoods.setSellerNote(cat + "&&" + categoryPathList.toJSONString());



                                        // 商品详情信息 itemDetail -> detailHtml
                                        JSONObject itemDetailObj = APIItemTOObj.getJSONObject("itemDetail");
                                        String productDescHtml = itemDetailObj.getString("detailHtml"); //详情html片段
                                        ecsGoods.setGoodsDesc(productDescHtml);

                                        //
                                        recordDTO.setGoodsDesc(productDescHtml);

                                        userService.insertRecord(recordDTO);


                                        int newID = userService.insertEcsGoodsByCon(ecsGoods);

                                        JSONArray skuListArr = APIItemTOObj.getJSONArray("skuList");
                                        if (skuListArr!=null && skuListArr.size()>0) {

                                            for (int k = 0; k < skuListArr.size(); k++) {
                                                JSONObject skuDetailObj = skuListArr.getJSONObject(k);

                                                String yx_sku_id = skuDetailObj.getInteger("id").toString();
                                                BigDecimal channelPrice = skuDetailObj.getBigDecimal("channelPrice");
                                                String displayString = skuDetailObj.getString("displayString");

                                                String pictureUrl = skuDetailObj.getString("picUrl");

                                                EcsSpecificationDTO ecsSpecificationDTO = new EcsSpecificationDTO();

                                                ecsSpecificationDTO.setGoodsId(ecsGoods.getGoodsId());
                                                ecsSpecificationDTO.setYxSkuId(yx_sku_id);
                                                ecsSpecificationDTO.setIsDel(0);
                                                ecsSpecificationDTO.setSpecificationPrice(channelPrice);
                                                ecsSpecificationDTO.setSpecificationName(displayString);
                                                ecsSpecificationDTO.setSpecificationConsumeNum(1);

                                                int speID = userService.insertEcsSpecificationDTO(ecsSpecificationDTO);

                                                System.out.println("insertSpecificationDTO success : " + ecsSpecificationDTO.getSpecificationId());

                                            }

                                        }




                                    }catch (Exception e) {
                                        System.out.println("###### 解析商品详情失败");
                                        e.printStackTrace();

                                    }


                                }


                            }


                        }catch (Exception e) {
                            e.printStackTrace();
                        }




                    }

                    ids = new StringBuffer();


                }

            }
        }


        writer.close();
    }


    class UpdateProductDescClass implements Runnable {


        public PrintWriter getPrintWriter() {
            return printWriter;
        }

        public void setPrintWriter(PrintWriter printWriter) {
            this.printWriter = printWriter;
        }

        private PrintWriter printWriter;

        private List<Map<Object, Object>> dataList;

        public void setUserService(UserService userService) {
            this.userService = userService;
        }

        private UserService userService;


        public UpdateProductDescClass(List<Map<Object, Object>> dataList) {
            this.dataList = dataList;
        }

        @Override
        public void run() {

            for (int i = 0; i < this.dataList.size(); i++) {

                Map<Object, Object> dataMap = this.dataList.get(i);

                String sku = dataMap.get("extension_code").toString();
                String goodsId = dataMap.get("goods_id").toString();

                String reqUrl = "https://bizapi.jd.com/api/product/getDetail?token=4tduzr4GCxQKzB2XFahFLxDsS&sku=" + sku + "&queryExts=appintroduce";


                try {
                    String res = HttpRequestUtils.sendPostWithHttpsClient("POST", reqUrl, "");

                    if (!StringUtils.isNullOrEmpty(res)) {
                        JSONObject resJson = JSON.parseObject(res);

                        JSONObject resultObj = resJson.getJSONObject("result");

                        if (resultObj != null) {
                            String appIntro = resultObj.getString("appintroduce");

                            if (!StringUtils.isNullOrEmpty(appIntro) && appIntro != null && appIntro != "") {
                                Map<Object, Object> params = new HashMap<>();
                                params.put("extensionCode", sku);
                                params.put("goodsId", goodsId);
                                params.put("goodsDesc", appIntro);
                                params.put("lastUpdate", new Date().getTime() / 1000);

                                userService.updateGoodsDescById(params);

                                printWriter.write(goodsId + ",");
                            }


                        }


                    }

                    System.out.println(res);

                    try {
                        Thread.sleep(200);
                    }catch (Exception e) {
                        e.printStackTrace();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }

            }

        }

    }


    public static void main(String[] args) {


//        ListNode first = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3).setNext(new ListNode(2))));
//
//        ListNode second = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
//
//        ListNode sum = addTwoNumbers(first, second);
//
//        System.out.println(sum);
//
//        String s = "123455";
//        char[] schar = s.toCharArray();
//
//        int[] pos = new int[1];
//
//        pos[2] = 10;


        String a = "Programming";
//        String a = new String("Programming");
        //a.intern();
        String b = new String("Programming");

        String c = "Program" + "ming";


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());


        String string2 = new String("myprogram");

        string2.intern();





    }

    public static List<String> generateParenthesis(int n) {

        // 从任意字符开始的字串，左括号个数始终大于等于右括号数，且该字串的左括号数等于右括号数

        List<String> resultList = new ArrayList<>();

        if (n<=0) {
            return resultList;
        }

//        resultList.add("()");

        Stack<String> leftBrackets = new Stack<>();
        Stack<String> rightBrackets = new Stack<>();
        for (int i=0;i<n;i++) {
            leftBrackets.push("("); // 左括号的栈
            rightBrackets.push(")"); // 右括号的栈
        }

        BracketModel bracketModel = new BracketModel(0,0,"");


        addBrackets(leftBrackets, rightBrackets, bracketModel, resultList);

        return resultList;


    }

    public static void addBrackets(Stack<String> leftBrackets, Stack<String> rightBrackets, BracketModel bracketModel, List<String> result){


        if (leftBrackets.empty() && rightBrackets.empty()) {
            result.add(bracketModel.getBracketStr());

            return;
        }

        if (bracketModel.getRightBracketCount()>bracketModel.getLeftBracketCount()) {
            return;
        }


        BracketModel bracketModel1 = new BracketModel(bracketModel);
        BracketModel bracketModel2 = new BracketModel(bracketModel);

        Stack<String> l1 = (Stack<String>) leftBrackets.clone();
        Stack<String> r1 = (Stack<String>) rightBrackets.clone();

        Stack<String> l2 = (Stack<String>) leftBrackets.clone();
        Stack<String> r2 = (Stack<String>) rightBrackets.clone();


        // 加右括号
        if (!r1.empty()){
            bracketModel1.setBracketStr(bracketModel1.getBracketStr()+r1.pop());
            bracketModel1.setRightBracketCount(bracketModel1.getRightBracketCount()+1);
            addBrackets(l1, r1, bracketModel1, result);
        }



        // 加左括号
        if (!l2.empty()) {
            bracketModel2.setBracketStr(bracketModel2.getBracketStr()+l2.pop());
            bracketModel2.setLeftBracketCount(bracketModel2.getLeftBracketCount()+1);
            addBrackets(l2, r2, bracketModel2, result);
        }


    }

    public static void addBracketsStr(Stack<String> leftBrackets, Stack<String> rightBrackets, String bracketStr, List<String> result){

//        System.out.println("current bracketStr : " + bracketModel.getBracketStr());

        if (leftBrackets.size()<=0 && rightBrackets.size()<=0) {
            result.add(bracketStr);

            return;
        }

        if (!rightBrackets.empty() ) {
            // 右括号入栈
            bracketStr += rightBrackets.pop();
//            bracketModel.setBracketStr(bracketModel.getBracketStr()+rightBrackets.pop());
//            bracketModel.setRightBracketCount(bracketModel.getRightBracketCount()+1);
            System.out.println("right : " + bracketStr);
            addBracketsStr(leftBrackets, rightBrackets, bracketStr, result);

        }

        if (!leftBrackets.empty()) {
            // 左括号入栈
            bracketStr += leftBrackets.pop();
//            bracketModel.setBracketStr(bracketModel.getBracketStr()+leftBrackets.pop());
//            bracketModel.setLeftBracketCount(bracketModel.getLeftBracketCount()+1);
            System.out.println("left : " + bracketStr);
            addBracketsStr(leftBrackets, rightBrackets, bracketStr, result);

        }




    }

    public static void testIf(){

        int i=0;

        if (i==0) {
            System.out.println("1");
        }


        if (i==0) {
            System.out.println("2");
        }
    }

    public static class BracketModel {
        private int leftBracketCount;
        private int rightBracketCount;
        private String bracketStr;

        public BracketModel(int leftBracketCount, int rightBracketCount, String bracketStr) {
            this.leftBracketCount = leftBracketCount;
            this.rightBracketCount = rightBracketCount;
            this.bracketStr = bracketStr;
        }

        public BracketModel(BracketModel bracketModel){
            this.leftBracketCount = bracketModel.getLeftBracketCount();
            this.rightBracketCount = bracketModel.getRightBracketCount();
            this.bracketStr = bracketModel.getBracketStr();
        }


        public int getLeftBracketCount() {
            return leftBracketCount;
        }

        public void setLeftBracketCount(int leftBracketCount) {
            this.leftBracketCount = leftBracketCount;
        }

        public int getRightBracketCount() {
            return rightBracketCount;
        }

        public void setRightBracketCount(int rightBracketCount) {
            this.rightBracketCount = rightBracketCount;
        }

        public String getBracketStr() {
            return bracketStr;
        }

        public void setBracketStr(String bracketStr) {
            this.bracketStr = bracketStr;
        }
    }


    public static int lengthOfLongestSubstring(String s) {
        // 滑动窗口来解

        int size = 0; // 最长字串长度

        for (int i=0;i<s.length();i++) {

            String subStr = s.substring(i, s.length());

            if(size>=(subStr.length())) {
                break;
            }


            HashSet<Character> slideWindow = new HashSet<>();


            int charPos = 0;
            Character a = subStr.charAt(charPos);

            while (!slideWindow.contains(a)) {
                slideWindow.add(a);
                charPos++;


                if (size<slideWindow.size()) {
                    size = slideWindow.size();
                }

                if(subStr.length()-1<charPos) {
                    break;
                }

                a = subStr.charAt(charPos);



            }

        }


        return size;
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int neddle = 0; // 当前是否进位
        int count = 1; // 当前位数


        ListNode node = new ListNode(0);

        ListNode currentNode = node;

        while(l1!=null || l2!=null) {
            int sum = 0;
            int l1val = 0;
            int l2val = 0;
            if(l1!=null) {
                l1val = l1.val;
            }
            if(l2!=null) {
                l2val = l2.val;
            }

            sum += l1val + l2val + neddle;
            neddle = sum/(10);

            sum = sum%(10);

            count = count*10;

            ListNode sumNode = new ListNode(sum);

            currentNode.next = sumNode;

            currentNode = sumNode;


            if (l1!=null) {
                if(l1.next!=null && l1!=null) {
                    l1 = l1.next;
                }else{
                    l1=null;
                }
            }


            if (l2!=null) {
                if(l2.next!=null && l2!=null) {
                    l2 = l2.next;
                }else{
                    l2 = null;
                }
            }

        }

        return node.next;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        public ListNode setNext(ListNode next) {
            this.next = next;
            return this;
        }
    }

}
