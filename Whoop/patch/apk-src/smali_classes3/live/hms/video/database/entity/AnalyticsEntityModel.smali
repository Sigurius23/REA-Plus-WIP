.class public final Llive/hms/video/database/entity/AnalyticsEntityModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00081\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012$\u0008\u0003\u0010\u0008\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J*\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0092\u0001\u0010?\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052$\u0008\u0003\u0010\u0008\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u000e2\u0008\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001a\"\u0004\u0008\u001e\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u001a\"\u0004\u0008 \u0010\u001cR<\u0010\u0008\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u001a\"\u0004\u0008\'\u0010\u001cR\u001e\u0010\u000c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010\u001a\"\u0004\u0008)\u0010\u001cR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010*\"\u0004\u0008+\u0010,R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104\u00a8\u0006F"
    }
    d2 = {
        "Llive/hms/video/database/entity/AnalyticsEntityModel;",
        "",
        "timestamp",
        "",
        "eventId",
        "",
        "deviceId",
        "agent",
        "payload",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "eventName",
        "token",
        "isQa",
        "",
        "analyticsPeer",
        "Llive/hms/video/database/entity/AnalyticsPeer;",
        "analyticsCluster",
        "Llive/hms/video/database/entity/AnalyticsCluster;",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)V",
        "getTimestamp",
        "()J",
        "setTimestamp",
        "(J)V",
        "getEventId",
        "()Ljava/lang/String;",
        "setEventId",
        "(Ljava/lang/String;)V",
        "getDeviceId",
        "setDeviceId",
        "getAgent",
        "setAgent",
        "getPayload",
        "()Ljava/util/HashMap;",
        "setPayload",
        "(Ljava/util/HashMap;)V",
        "Ljava/util/HashMap;",
        "getEventName",
        "setEventName",
        "getToken",
        "setToken",
        "()Z",
        "setQa",
        "(Z)V",
        "getAnalyticsPeer",
        "()Llive/hms/video/database/entity/AnalyticsPeer;",
        "setAnalyticsPeer",
        "(Llive/hms/video/database/entity/AnalyticsPeer;)V",
        "getAnalyticsCluster",
        "()Llive/hms/video/database/entity/AnalyticsCluster;",
        "setAnalyticsCluster",
        "(Llive/hms/video/database/entity/AnalyticsCluster;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)Llive/hms/video/database/entity/AnalyticsEntityModel;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private agent:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "agent"
    .end annotation
.end field

.field private analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cluster"
    .end annotation
.end field

.field private analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer"
    .end annotation
.end field

.field private deviceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_id"
    .end annotation
.end field

.field private eventId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "event_id"
    .end annotation
.end field

.field private eventName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "event"
    .end annotation
.end field

.field private isQa:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "isQa"
    .end annotation
.end field

.field private payload:Ljava/util/HashMap;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "payload"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private token:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "token"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Llive/hms/video/database/entity/AnalyticsEntityModel;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Llive/hms/video/database/entity/AnalyticsPeer;",
            "Llive/hms/video/database/entity/AnalyticsCluster;",
            ")V"
        }
    .end annotation

    const-string v0, "eventId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventName"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    .line 4
    iput-object p3, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    .line 8
    iput-object p7, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    .line 10
    iput-boolean p9, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    .line 11
    iput-object p10, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    .line 12
    iput-object p11, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    .line 13
    const-string p2, ""

    if-eqz p1, :cond_1

    move-object v3, p2

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    move-object v4, p2

    goto :goto_1

    :cond_2
    move-object/from16 v4, p4

    :goto_1
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    move-object v5, p2

    goto :goto_2

    :cond_3
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    move-object v6, p1

    goto :goto_3

    :cond_4
    move-object/from16 v6, p6

    :goto_3
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    move-object v7, p2

    goto :goto_4

    :cond_5
    move-object/from16 v7, p7

    :goto_4
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    move-object v8, p2

    goto :goto_5

    :cond_6
    move-object/from16 v8, p8

    :goto_5
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    move v9, p1

    goto :goto_6

    :cond_7
    move/from16 v9, p9

    :goto_6
    and-int/lit16 p1, v0, 0x100

    const/4 p2, 0x0

    if-eqz p1, :cond_8

    move-object v10, p2

    goto :goto_7

    :cond_8
    move-object/from16 v10, p10

    :goto_7
    and-int/lit16 p1, v0, 0x200

    if-eqz p1, :cond_9

    move-object v11, p2

    :goto_8
    move-object v0, p0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    goto :goto_8

    .line 15
    :goto_9
    invoke-direct/range {v0 .. v11}, Llive/hms/video/database/entity/AnalyticsEntityModel;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/database/entity/AnalyticsEntityModel;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;ILjava/lang/Object;)Llive/hms/video/database/entity/AnalyticsEntityModel;
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object/from16 v4, p4

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object/from16 v5, p5

    :goto_1
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    move-object v6, p1

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    move-object v7, p1

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    move-object v8, p1

    goto :goto_4

    :cond_6
    move-object/from16 v8, p8

    :goto_4
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    move v9, p1

    goto :goto_5

    :cond_7
    move/from16 v9, p9

    :goto_5
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_8

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    move-object v10, p1

    goto :goto_6

    :cond_8
    move-object/from16 v10, p10

    :goto_6
    and-int/lit16 p1, v0, 0x200

    if-eqz p1, :cond_9

    iget-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    move-object v11, p1

    :goto_7
    move-object v0, p0

    goto :goto_8

    :cond_9
    move-object/from16 v11, p11

    goto :goto_7

    :goto_8
    invoke-virtual/range {v0 .. v11}, Llive/hms/video/database/entity/AnalyticsEntityModel;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)Llive/hms/video/database/entity/AnalyticsEntityModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    return-wide v0
.end method

.method public final component10()Llive/hms/video/database/entity/AnalyticsCluster;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    return v0
.end method

.method public final component9()Llive/hms/video/database/entity/AnalyticsPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)Llive/hms/video/database/entity/AnalyticsEntityModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Llive/hms/video/database/entity/AnalyticsPeer;",
            "Llive/hms/video/database/entity/AnalyticsCluster;",
            ")",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;"
        }
    .end annotation

    const-string v0, "eventId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agent"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventName"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/database/entity/AnalyticsEntityModel;

    move-wide v2, p1

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Llive/hms/video/database/entity/AnalyticsEntityModel;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/database/entity/AnalyticsEntityModel;

    iget-wide v3, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    iget-boolean v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    iget-object v3, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    iget-object p1, p1, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    return-object v0
.end method

.method public final getAnalyticsCluster()Llive/hms/video/database/entity/AnalyticsCluster;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    return-object v0
.end method

.method public final getAnalyticsPeer()Llive/hms/video/database/entity/AnalyticsPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    return-object v0
.end method

.method public final getDeviceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEventId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPayload()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    return-wide v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Llive/hms/video/database/entity/AnalyticsPeer;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Llive/hms/video/database/entity/AnalyticsCluster;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final isQa()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    return v0
.end method

.method public final setAgent(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    return-void
.end method

.method public final setAnalyticsCluster(Llive/hms/video/database/entity/AnalyticsCluster;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    return-void
.end method

.method public final setAnalyticsPeer(Llive/hms/video/database/entity/AnalyticsPeer;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    return-void
.end method

.method public final setDeviceId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    return-void
.end method

.method public final setEventId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    return-void
.end method

.method public final setEventName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    return-void
.end method

.method public final setPayload(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    return-void
.end method

.method public final setQa(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    return-void
.end method

.method public final setTimestamp(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    return-void
.end method

.method public final setToken(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnalyticsEntityModel(timestamp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", eventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->deviceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", agent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->agent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->payload:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->eventName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isQa="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsPeer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsCluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/database/entity/AnalyticsEntityModel;->analyticsCluster:Llive/hms/video/database/entity/AnalyticsCluster;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
