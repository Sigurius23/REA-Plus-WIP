.class public final Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/models/ChannelRequest;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api/models/ChannelRequest<",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0008\u0016\u0008\u0086\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0087\u0001\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Bk\u0008\u0017\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0012\u0010\u0014J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010E\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u0017\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u0090\u0001\u0010H\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020,2\u0008\u0010K\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010L\u001a\u00020\u0005H\u00d6\u0001J\t\u0010M\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018\"\u0004\u0008\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\u0008$\u0010 \"\u0004\u0008%\u0010\"R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010)R\u001a\u0010+\u001a\u00020,X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u001a\u00101\u001a\u00020,X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010.\"\u0004\u00083\u00100R\u001a\u00104\u001a\u00020,X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010.\"\u0004\u00086\u00100R#\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f08\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0011\u0010>\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010.\u00a8\u0006N"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "Lio/getstream/chat/android/client/api/models/ChannelRequest;",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "offset",
        "",
        "limit",
        "querySort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "messageLimit",
        "memberLimit",
        "predefinedFilter",
        "",
        "filterValues",
        "",
        "",
        "sortValues",
        "<init>",
        "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V",
        "(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getOffset",
        "()I",
        "setOffset",
        "(I)V",
        "getLimit",
        "setLimit",
        "getQuerySort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getMessageLimit",
        "()Ljava/lang/Integer;",
        "setMessageLimit",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "getMemberLimit",
        "setMemberLimit",
        "getPredefinedFilter",
        "()Ljava/lang/String;",
        "getFilterValues",
        "()Ljava/util/Map;",
        "getSortValues",
        "state",
        "",
        "getState",
        "()Z",
        "setState",
        "(Z)V",
        "watch",
        "getWatch",
        "setWatch",
        "presence",
        "getPresence",
        "setPresence",
        "sort",
        "",
        "getSort",
        "()Ljava/util/List;",
        "withMessages",
        "withLimit",
        "withOffset",
        "isFirstPage",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final filter:Lio/getstream/chat/android/models/FilterObject;

.field private final filterValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private limit:I

.field private memberLimit:Ljava/lang/Integer;

.field private messageLimit:Ljava/lang/Integer;

.field private offset:I

.field private final predefinedFilter:Ljava/lang/String;

.field private presence:Z

.field private final querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private final sort:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sortValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private state:Z

.field private watch:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;I)V
    .locals 13

    .line 1
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1fa

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;II)V
    .locals 13

    .line 2
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1f8

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1f0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 4
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1e0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 5
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1c0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 6
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 7
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    .line 15
    iput p2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    .line 16
    iput p3, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    .line 17
    iput-object p4, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 18
    iput-object p5, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    .line 19
    iput-object p6, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    .line 20
    iput-object p7, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    .line 21
    iput-object p8, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    .line 22
    iput-object p9, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->state:Z

    .line 24
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->watch:Z

    .line 25
    invoke-interface {p4}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sort:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, v0, 0x8

    if-eqz p2, :cond_1

    .line 26
    new-instance p2, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    move-object v4, p2

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, v0, 0x10

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_4

    move-object v7, v1

    goto :goto_3

    :cond_4
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_5

    move-object v8, v1

    goto :goto_4

    :cond_5
    move-object/from16 v8, p8

    :goto_4
    and-int/lit16 p2, v0, 0x100

    if-eqz p2, :cond_6

    move-object v9, v1

    move-object v0, p0

    move v3, p3

    move-object v1, p1

    goto :goto_5

    :cond_6
    move-object/from16 v9, p9

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    .line 27
    :goto_5
    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 11

    .line 8
    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 9
    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 10
    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    .line 11
    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 12
    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "predefinedFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lio/getstream/chat/android/models/Filters;->neutral()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    .line 30
    new-instance v5, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v5}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    move-object v1, p0

    move-object v8, p1

    move v4, p2

    move-object v9, p3

    move-object v10, p4

    move/from16 v3, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    .line 31
    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    const/4 p5, 0x0

    :cond_2
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p8, p7

    goto :goto_0

    .line 28
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->copy(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    return v0
.end method

.method public final component4()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getFilterValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    return v0
.end method

.method public final getMemberLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    return v0
.end method

.method public final getPredefinedFilter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    return-object v0
.end method

.method public final getPresence()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->presence:Z

    return v0
.end method

.method public final getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getSort()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getSortValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getState()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->state:Z

    return v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->watch:Z

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    return v2
.end method

.method public final isFirstPage()Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    return-void
.end method

.method public final setMemberLimit(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    return-void
.end method

.method public final setMessageLimit(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    return-void
.end method

.method public final setOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    return-void
.end method

.method public final setPresence(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->presence:Z

    return-void
.end method

.method public final setState(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->state:Z

    return-void
.end method

.method public final setWatch(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->watch:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    iget-object v5, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->memberLimit:Ljava/lang/Integer;

    iget-object v6, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->predefinedFilter:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->filterValues:Ljava/util/Map;

    iget-object v8, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->sortValues:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "QueryChannelsRequest(filter="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", querySort="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageLimit="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", memberLimit="

    const-string v1, ", predefinedFilter="

    invoke-static {v9, v4, v0, v5, v1}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v0, ", filterValues="

    const-string v1, ", sortValues="

    invoke-static {v9, v6, v0, v7, v1}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withLimit(I)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->limit:I

    return-object p0
.end method

.method public final withMessages(I)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->messageLimit:Ljava/lang/Integer;

    return-object p0
.end method

.method public final withOffset(I)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->offset:I

    return-object p0
.end method
