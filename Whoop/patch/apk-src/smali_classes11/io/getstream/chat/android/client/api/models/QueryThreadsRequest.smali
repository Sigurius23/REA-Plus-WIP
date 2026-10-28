.class public final Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/models/QueryThreadsRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008#\u0008\u0086\u0008\u0018\u0000 /2\u00020\u0001:\u0001/Bo\u0008\u0007\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0008H\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003Jo\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\nH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00082\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\nH\u00d6\u0001J\t\u0010.\u001a\u00020\rH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001a\u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Thread;",
        "watch",
        "",
        "limit",
        "",
        "memberLimit",
        "next",
        "",
        "participantLimit",
        "prev",
        "replyLimit",
        "<init>",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)V",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getWatch",
        "()Z",
        "getLimit",
        "()I",
        "getMemberLimit",
        "getNext",
        "()Ljava/lang/String;",
        "getParticipantLimit",
        "getPrev",
        "getReplyLimit",
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
        "equals",
        "other",
        "hashCode",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest$Companion;

.field private static final DefaultSort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final filter:Lio/getstream/chat/android/models/FilterObject;

.field private final limit:I

.field private final memberLimit:I

.field private final next:Ljava/lang/String;

.field private final participantLimit:I

.field private final prev:Ljava/lang/String;

.field private final replyLimit:I

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private final watch:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->Companion:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest$Companion;

    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string v1, "has_unread"

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v1

    const-string v2, "last_message_at"

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v1

    const-string v2, "parent_message_id"

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->DefaultSort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;)V
    .locals 12

    .line 2
    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1fc

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;Z)V"
        }
    .end annotation

    .line 4
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    move-object v3, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZI)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZI)V"
        }
    .end annotation

    .line 5
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1f0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZII)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII)V"
        }
    .end annotation

    .line 6
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1e0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 7
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1c0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 8
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 9
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    .line 12
    iput-object p2, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 13
    iput-boolean p3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    .line 14
    iput p4, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    .line 15
    iput p5, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    .line 16
    iput-object p6, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    .line 17
    iput p7, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    .line 18
    iput-object p8, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    .line 19
    iput p9, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 20
    sget-object p2, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->DefaultSort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    const/16 p4, 0xa

    :cond_3
    and-int/lit8 p11, p10, 0x10

    const/16 v1, 0x64

    if-eqz p11, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    const/4 p9, 0x2

    :cond_8
    move p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 21
    invoke-direct/range {p1 .. p10}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getDefaultSort$cp()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->DefaultSort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    :cond_8
    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->copy(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZII",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I)",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    iget p1, p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    return v0
.end method

.method public final getMemberLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    return v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    return v0
.end method

.method public final getPrev()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final getReplyLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    return v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    invoke-static {v3, v2, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->watch:Z

    iget v3, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->limit:I

    iget v4, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->memberLimit:I

    iget-object v5, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->next:Ljava/lang/String;

    iget v6, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->participantLimit:I

    iget-object v7, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->prev:Ljava/lang/String;

    iget v8, p0, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->replyLimit:I

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "QueryThreadsRequest(filter="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", watch="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    const-string v1, ", memberLimit="

    invoke-static {v3, v0, v1, v9, v2}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v0, ", next="

    const-string v1, ", participantLimit="

    invoke-static {v4, v0, v5, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", prev="

    const-string v1, ", replyLimit="

    invoke-static {v6, v0, v7, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
