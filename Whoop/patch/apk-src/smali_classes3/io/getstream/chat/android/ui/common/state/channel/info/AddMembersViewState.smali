.class public final Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u00c6\u0003J\u000f\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00032\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;",
        "",
        "isLoading",
        "",
        "isLoadingMore",
        "query",
        "",
        "searchResult",
        "",
        "Lio/getstream/chat/android/models/User;",
        "selectedUserIds",
        "",
        "loadedMemberIds",
        "<init>",
        "(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V",
        "()Z",
        "getQuery",
        "()Ljava/lang/String;",
        "getSearchResult",
        "()Ljava/util/List;",
        "getSelectedUserIds",
        "()Ljava/util/Set;",
        "getLoadedMemberIds",
        "isSelected",
        "user",
        "isAlreadyMember",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final isLoading:Z

.field private final isLoadingMore:Z

.field private final loadedMemberIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final query:Ljava/lang/String;

.field private final searchResult:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedUserIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedUserIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadedMemberIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 9
    const-string p3, ""

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 10
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 11
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    if-eqz p8, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p8, v0

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    goto :goto_0

    :cond_5
    move-object p8, p6

    move-object p7, p5

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    :goto_0
    invoke-direct/range {p2 .. p8}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    return-object v0
.end method

.method public final component6()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedUserIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadedMemberIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getLoadedMemberIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    return-object v0
.end method

.method public final getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final getSearchResult()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedUserIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isAlreadyMember(Lio/getstream/chat/android/models/User;)Z
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    return v0
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    return v0
.end method

.method public final isSelected(Lio/getstream/chat/android/models/User;)Z
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore:Z

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->query:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->searchResult:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->selectedUserIds:Ljava/util/Set;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->loadedMemberIds:Ljava/util/Set;

    const-string v6, ", isLoadingMore="

    const-string v7, ", query="

    const-string v8, "AddMembersViewState(isLoading="

    invoke-static {v8, v6, v7, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchResult="

    const-string v6, ", selectedUserIds="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", loadedMemberIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
