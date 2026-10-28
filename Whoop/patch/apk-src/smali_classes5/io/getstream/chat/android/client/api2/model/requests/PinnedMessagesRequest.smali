.class public final Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 72\u00020\u0001:\u00017B\u00a1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u00a7\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u00102\u001a\u0002032\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001aR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010 \u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;",
        "",
        "limit",
        "",
        "sort",
        "",
        "",
        "",
        "id_around",
        "id_gt",
        "id_gte",
        "id_lt",
        "id_lte",
        "pinned_at_around",
        "Ljava/util/Date;",
        "pinned_at_after",
        "pinned_at_after_or_equal",
        "pinned_at_before",
        "pinned_at_before_or_equal",
        "<init>",
        "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V",
        "getLimit",
        "()I",
        "getSort",
        "()Ljava/util/List;",
        "getId_around",
        "()Ljava/lang/String;",
        "getId_gt",
        "getId_gte",
        "getId_lt",
        "getId_lte",
        "getPinned_at_around",
        "()Ljava/util/Date;",
        "getPinned_at_after",
        "getPinned_at_after_or_equal",
        "getPinned_at_before",
        "getPinned_at_before_or_equal",
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
        "component11",
        "component12",
        "copy",
        "equals",
        "",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;


# instance fields
.field private final id_around:Ljava/lang/String;

.field private final id_gt:Ljava/lang/String;

.field private final id_gte:Ljava/lang/String;

.field private final id_lt:Ljava/lang/String;

.field private final id_lte:Ljava/lang/String;

.field private final limit:I

.field private final pinned_at_after:Ljava/util/Date;

.field private final pinned_at_after_or_equal:Ljava/util/Date;

.field private final pinned_at_around:Ljava/util/Date;

.field private final pinned_at_before:Ljava/util/Date;

.field private final pinned_at_before_or_equal:Ljava/util/Date;

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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->Companion:Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    .line 13
    iput-object p12, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x4

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_5

    move-object p8, v0

    :cond_5
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_7

    move-object p10, v0

    :cond_7
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_8

    move-object p11, v0

    :cond_8
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_9

    move-object p13, v0

    :goto_0
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p13, p12

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p13}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->copy(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    return v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;"
        }
    .end annotation

    const-string v0, "sort"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    move v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getId_around()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    return-object v0
.end method

.method public final getId_gt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    return-object v0
.end method

.method public final getId_gte()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    return-object v0
.end method

.method public final getId_lt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    return-object v0
.end method

.method public final getId_lte()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    return v0
.end method

.method public final getPinned_at_after()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_at_after_or_equal()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_at_around()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_at_before()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_at_before_or_equal()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->limit:I

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->sort:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_around:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gt:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_gte:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lt:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->id_lte:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_around:Ljava/util/Date;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after:Ljava/util/Date;

    iget-object v9, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_after_or_equal:Ljava/util/Date;

    iget-object v10, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before:Ljava/util/Date;

    iget-object v11, p0, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;->pinned_at_before_or_equal:Ljava/util/Date;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "PinnedMessagesRequest(limit="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id_around="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", id_gt="

    const-string v1, ", id_gte="

    invoke-static {v12, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", id_lt="

    const-string v1, ", id_lte="

    invoke-static {v12, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", pinned_at_around="

    const-string v1, ", pinned_at_after="

    invoke-static {v12, v6, v0, v7, v1}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v0, ", pinned_at_after_or_equal="

    const-string v1, ", pinned_at_before="

    invoke-static {v12, v8, v0, v9, v1}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pinned_at_before_or_equal="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
