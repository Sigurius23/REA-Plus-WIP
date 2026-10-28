.class final Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HeaderState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003J\t\u0010$\u001a\u00020\u000fH\u00c6\u0003Ji\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00032\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;",
        "",
        "isThread",
        "",
        "isTitleEnabled",
        "normalModeTitle",
        "",
        "threadModeTitle",
        "isSubtitleEnabled",
        "normalModeSubtitle",
        "threadModeSubtitle",
        "typingUsers",
        "",
        "Lio/getstream/chat/android/models/User;",
        "onlineState",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
        "<init>",
        "(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V",
        "()Z",
        "getNormalModeTitle",
        "()Ljava/lang/String;",
        "getThreadModeTitle",
        "getNormalModeSubtitle",
        "getThreadModeSubtitle",
        "getTypingUsers",
        "()Ljava/util/List;",
        "getOnlineState",
        "()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
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
        "",
        "toString",
        "stream-chat-android-ui-components_release"
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
.field private final isSubtitleEnabled:Z

.field private final isThread:Z

.field private final isTitleEnabled:Z

.field private final normalModeSubtitle:Ljava/lang/String;

.field private final normalModeTitle:Ljava/lang/String;

.field private final onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

.field private final threadModeSubtitle:Ljava/lang/String;

.field private final threadModeTitle:Ljava/lang/String;

.field private final typingUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
            ")V"
        }
    .end annotation

    const-string v0, "normalModeTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadModeTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "normalModeSubtitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadModeSubtitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingUsers"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlineState"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    iput-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->copy(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;"
        }
    .end annotation

    const-string v0, "normalModeTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadModeTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "normalModeSubtitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadModeSubtitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingUsers"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlineState"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getNormalModeSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNormalModeTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnlineState()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    return-object v0
.end method

.method public final getThreadModeSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getThreadModeTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypingUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSubtitleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    return v0
.end method

.method public final isThread()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    return v0
.end method

.method public final isTitleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled:Z

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeTitle:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeTitle:Ljava/lang/String;

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled:Z

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->normalModeSubtitle:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->threadModeSubtitle:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->typingUsers:Ljava/util/List;

    iget-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->onlineState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v9, ", isTitleEnabled="

    const-string v10, ", normalModeTitle="

    const-string v11, "HeaderState(isThread="

    invoke-static {v11, v9, v10, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", threadModeTitle="

    const-string v9, ", isSubtitleEnabled="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", normalModeSubtitle="

    const-string v2, ", threadModeSubtitle="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", typingUsers="

    const-string v2, ", onlineState="

    invoke-static {v6, v1, v2, v0, v7}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
