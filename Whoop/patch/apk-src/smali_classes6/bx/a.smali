.class public abstract Lbx/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 33

    const-string v5, "android.permission.POST_NOTIFICATIONS"

    const-string v6, "android.permission.BODY_SENSORS_BACKGROUND"

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    const-string v1, "android.permission.SYSTEM_ALERT_WINDOW"

    const-string v2, "android.permission.WRITE_SETTINGS"

    const-string v3, "android.permission.MANAGE_EXTERNAL_STORAGE"

    const-string v4, "android.permission.REQUEST_INSTALL_PACKAGES"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lbx/a;->a:Ljava/util/Set;

    new-instance v1, Ll83/k;

    const-string v0, "android.permission.READ_CALENDAR"

    const-string v2, "android.permission-group.CALENDAR"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v3, "android.permission.WRITE_CALENDAR"

    invoke-direct {v0, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v2, "android.permission.READ_CALL_LOG"

    const-string v4, "android.permission-group.CALL_LOG"

    invoke-direct {v3, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v5, "android.permission.WRITE_CALL_LOG"

    invoke-direct {v2, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "android.permission.PROCESS_OUTGOING_CALLS"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v4, "android.permission.CAMERA"

    const-string v7, "android.permission-group.CAMERA"

    invoke-direct {v6, v4, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v4, "android.permission.READ_CONTACTS"

    const-string v8, "android.permission-group.CONTACTS"

    invoke-direct {v7, v4, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v9, "android.permission.WRITE_CONTACTS"

    invoke-direct {v4, v9, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string v10, "android.permission.GET_ACCOUNTS"

    invoke-direct {v9, v10, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string v8, "android.permission.ACCESS_FINE_LOCATION"

    const-string v11, "android.permission-group.LOCATION"

    invoke-direct {v10, v8, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v12, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-direct {v8, v12, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v13, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-direct {v12, v13, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    const-string v11, "android.permission.RECORD_AUDIO"

    const-string v14, "android.permission-group.MICROPHONE"

    invoke-direct {v13, v11, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const-string v11, "android.permission.READ_PHONE_STATE"

    const-string v15, "android.permission-group.PHONE"

    invoke-direct {v14, v11, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    move-object/from16 v16, v0

    const-string v0, "android.permission.READ_PHONE_NUMBERS"

    invoke-direct {v11, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    move-object/from16 v17, v1

    const-string v1, "android.permission.CALL_PHONE"

    invoke-direct {v0, v1, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v18, v0

    const-string v0, "android.permission.ANSWER_PHONE_CALLS"

    invoke-direct {v1, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    move-object/from16 v19, v1

    const-string v1, "com.android.voicemail.permission.ADD_VOICEMAIL"

    invoke-direct {v0, v1, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v20, v0

    const-string v0, "android.permission.USE_SIP"

    invoke-direct {v1, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    move-object/from16 v21, v1

    const-string v1, "android.permission.ACCEPT_HANDOVER"

    invoke-direct {v0, v1, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v15, "android.permission.BODY_SENSORS"

    move-object/from16 v22, v0

    const-string v0, "android.permission-group.SENSORS"

    invoke-direct {v1, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Ll83/k;

    move-object/from16 v23, v1

    const-string v1, "android.permission.ACTIVITY_RECOGNITION"

    move-object/from16 v24, v2

    const-string v2, "android.permission-group.ACTIVITY_RECOGNITION"

    invoke-direct {v15, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "android.permission.SEND_SMS"

    move-object/from16 v25, v3

    const-string v3, "android.permission-group.SMS"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    move-object/from16 v26, v1

    const-string v1, "android.permission.RECEIVE_SMS"

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v27, v2

    const-string v2, "android.permission.READ_SMS"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    move-object/from16 v28, v1

    const-string v1, "android.permission.RECEIVE_WAP_PUSH"

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v29, v2

    const-string v2, "android.permission.RECEIVE_MMS"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    move-object/from16 v31, v0

    const-string v0, "android.permission-group.STORAGE"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v30, v1

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v32, v2

    const-string v2, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v15

    move-object v15, v11

    move-object v11, v8

    move-object v8, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v27

    move-object/from16 v27, v30

    move-object/from16 v30, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v26

    move-object/from16 v26, v29

    move-object/from16 v29, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v28

    move-object/from16 v28, v32

    filled-new-array/range {v1 .. v30}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "android.permission.BLUETOOTH_SCAN"

    const-string v3, "android.permission-group.NEARBY_DEVICES"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v4, "android.permission.BLUETOOTH_ADVERTISE"

    invoke-direct {v2, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "android.permission.BLUETOOTH_CONNECT"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    const-string v2, "android.permission-group.READ_MEDIA_VISUAL"

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-direct {v5, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    const-string v2, "android.permission-group.READ_MEDIA_AURAL"

    invoke-direct {v6, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    const-string v2, "android.permission-group.NOTIFICATIONS"

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v1, "android.permission.NEARBY_WIFI_DEVICES"

    invoke-direct {v8, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string v1, "android.permission.BODY_SENSORS_BACKGROUND"

    move-object/from16 v2, v31

    invoke-direct {v9, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v4 .. v9}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    return-void
.end method
