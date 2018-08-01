package com.huluwa.server.entity;

/**
 * Created by liumapp on 11/2/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class InfoCode {

    public static Integer SUCCESS = 200;

    public static Integer ERROR = 500;

    public static Integer INVALID_TOKEN = 30;

    /**
     * appid传入为null
     **/
    public static Integer APPID_ERROR = 10001;

    /**
     * companyid传入为null
     **/
    public static Integer COMPANYID_ISNULL = 10002;
    //身份证号不存在
    public static Integer IDENTITY_ERROR = 10003;
    //各方已经完成签署,不能撤回合同
    public static Integer RECALL_FAIL = 10004;
    //合同编号不存在
    public static Integer CONTROCT_CODE = 10005;

    /***文件传送参数有误**/
    public static Integer FILE_ERROR = 10006;

    /**
     * APPID 错误
     ***/
    public static Integer APP_ID_NOT = 10007;

    /***合同编号不存在**/
    public static Integer CONTRACTNO_NOT_EXIST = 10008;

    /***签署人列表为null**/
    public static Integer SIGNERS_ISNULL = 10009;

    /***合同标题不能为空**/
    public static Integer TITLE_ISNULL = 10010;

    /***上传的文件类型不支持**/
    public static Integer FILE_TYPE_ERROR = 10011;


    /***合同编号不能为空***/
    public static Integer CONTRACTNO_ISNULL = 10013;

    /***请求参数不能为空***/
    public static Integer PARAMS_ISNULL = 10014;

    /***签署人id为空****/
    public static Integer OPENSIGNERID_ISNULL = 10015;

    /***签署人id输入有误****/
    public static Integer OPENSIGNERID_ISERROR = 10016;

    /***openCustomerid为空****/
    public static Integer OPENCUSTOMERID_ISNULL = 10017;

    /***签章图片的地址为空****/
    public static Integer SEAL_URL_ISNULL = 10018;

    /***签章图片的id为空****/
    public static Integer SEAL_ID_ISNULL = 10019;

    /**无签署图片*/
    public static Integer NOTFOUND_SIGNIMG = 10200;

    /**申请证书未认证**/
    public static Integer NOTIDENTITY_ERROR=10022;

    /**获取的证书编号不一致**/
    public static Integer SERIALNUMBERNOTMATCH_ERROR=10033;
    /**keystore已满*/
    public static Integer KEYSTORE_ISFULL = 10044;
    /**keystore没有找到*/
    public static Integer KEYSTORE_NOTFOUND = 10045;
    /**无数据*/
    public static Integer DATA_NOTFOUND = 10046;

    public static Integer GROUPNAME_ISEXIST = 300;
}
