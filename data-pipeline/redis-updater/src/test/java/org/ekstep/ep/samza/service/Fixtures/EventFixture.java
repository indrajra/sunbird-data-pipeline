package org.ekstep.ep.samza.service.Fixtures;

public class EventFixture {
    public static final String OBJECT_TYPE_CONTENT_EVENT_1 = "{\"ets\":1548780816826,\"channel\":\"in.ekstep\",\"transactionData\":{\"properties\":{\"ownershipType\":{\"ov\":null,\"nv\":[\"createdBy\"]},\"code\":{\"ov\":null,\"nv\":\"testbook1\"},\"channel\":{\"ov\":null,\"nv\":\"in.ekstep\"},\"description\":{\"ov\":null,\"nv\":\"TestCollection\"},\"status\":{\"ov\":null,\"nv\":\"Draft\"}}},\"label\":\"TestBook1\",\"nodeType\":\"DATA_NODE\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-01-29T22:23:36.826+0530\",\"objectType\":\"Content\",\"nodeUniqueId\":\"do_11268761245100441611\",\"requestId\":null,\"operationType\":\"CREATE\",\"nodeGraphId\":703654,\"graphId\":\"domain\"}";
    public static final String OBJECT_TYPE_CONTENT_EVENT_1_UPDATED = "{\"ets\":1548780816826,\"channel\":\"sunbird.portal\",\"transactionData\":{\"properties\":{\"ownershipType\":{\"ov\":null,\"nv\":null},\"code\":{\"ov\":null,\"nv\":\"testbook1\"},\"channel\":{\"ov\":null,\"nv\":\"sunbird.portal\"},\"description\":{\"ov\":null,\"nv\":\"TestCollection\"},\"status\":{\"ov\":null,\"nv\":\"Live\"},\"visibility\":{\"ov\":null,\"nv\":\"Default\"}}},\"label\":\"TestBook1\",\"nodeType\":\"DATA_NODE\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-01-29T22:23:36.826+0530\",\"objectType\":\"Content\",\"nodeUniqueId\":\"do_11268761245100441611\",\"requestId\":null,\"operationType\":\"CREATE\",\"nodeGraphId\":703654,\"graphId\":\"domain\"}";
    public static final String OBJECT_TYPE_DIAL_CODE_1 = "{\"nodeUniqueId\":\"YC9EP8\",\"ets\":1549345256766,\"requestId\":null,\"audit\":false,\"transactionData\":{\"properties\":{\"dialcode_index\":{\"ov\":null,\"nv\":261351.0},\"identifier\":{\"ov\":null,\"nv\":\"YC9EP8\"},\"channel\":{\"ov\":null,\"nv\":\"b00bc992ef25f1a9a8d63291e20efc8d\"},\"batchcode\":{\"ov\":null,\"nv\":\"do_112692236142379008136\"},\"publisher\":{\"ov\":null,\"nv\":null},\"generated_on\":{\"ov\":null,\"nv\":\"2019-02-05T05:40:56.762\"},\"status\":{\"ov\":null,\"nv\":\"Draft\"}}},\"channel\":\"in.ekstep\",\"index\":true,\"operationType\":\"CREATE\",\"nodeType\":\"EXTERNAL\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-02-05T05:40:56.766+0000\",\"objectType\":\"DialCode\"}";
    public static final String CONTENT_EVENT_EMPTY_PROPERTIES = "{\"ets\":1548780816826,\"channel\":\"in.ekstep\",\"transactionData\":{\"properties\":{}},\"label\":\"TestBook1\",\"nodeType\":\"DATA_NODE\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-01-29T22:23:36.826+0530\",\"objectType\":\"Content\",\"nodeUniqueId\":\"do_11268761245100441611\",\"requestId\":null,\"operationType\":\"CREATE\",\"nodeGraphId\":703654,\"graphId\":\"domain\"}";
    public static final String CONTENT_EVENT_EMPTY_NODE_UNIQUEID = "{\"ets\":1548780816826,\"channel\":\"in.ekstep\",\"transactionData\":{\"properties\":{\"ownershipType\":{\"ov\":null,\"nv\":[\"createdBy\"]},\"code\":{\"ov\":null,\"nv\":\"testbook1\"},\"channel\":{\"ov\":null,\"nv\":\"in.ekstep\"},\"description\":{\"ov\":null,\"nv\":\"TestCollection\"},\"status\":{\"ov\":null,\"nv\":\"Draft\"}}},\"label\":\"TestBook1\",\"nodeType\":\"DATA_NODE\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-01-29T22:23:36.826+0530\",\"objectType\":\"Content\",\"nodeUniqueId\":\"\",\"requestId\":null,\"operationType\":\"CREATE\",\"nodeGraphId\":703654,\"graphId\":\"domain\"}";
    public static final String OBJECT_TYPE_CONCEPT_EVENT = "{\"ets\":1547644874028,\"channel\":\"in.ekstep\",\"transactionData\":{\"properties\":{\"language\":{\"ov\":null,\"nv\":\"English\"}}},\"label\":\"Properties of Light\",\"nodeType\":\"DATA_NODE\",\"userId\":\"ANONYMOUS\",\"createdOn\":\"2019-01-16T18:51:14.028+0530\",\"objectType\":\"Concept\",\"nodeUniqueId\":\"SMC4\",\"requestId\":null,\"operationType\":\"UPDATE\",\"nodeGraphId\":101409,\"graphId\":\"domain\"}";

}