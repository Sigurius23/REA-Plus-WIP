.class public final Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BK\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001bJM\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0011R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;",
        "",
        "query",
        "",
        "canLoadMore",
        "",
        "results",
        "",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "isLoading",
        "isLoadingMore",
        "next",
        "<init>",
        "(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)V",
        "getQuery",
        "()Ljava/lang/String;",
        "getCanLoadMore",
        "()Z",
        "getResults",
        "()Ljava/util/List;",
        "getNext$stream_chat_android_ui_components_release",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component6$stream_chat_android_ui_components_release",
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
.field private final canLoadMore:Z

.field private final isLoading:Z

.field private final isLoadingMore:Z

.field private final next:Ljava/lang/String;

.field private final query:Ljava/lang/String;

.field private final results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
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

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;ZZ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "results"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    .line 6
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    .line 7
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 9
    const-string p1, ""

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/4 p2, 0x1

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 10
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    const/4 v0, 0x0

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    .line 11
    invoke-direct/range {p2 .. p8}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->copy(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    return v0
.end method

.method public final component6$stream_chat_android_ui_components_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;ZZ",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "results"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCanLoadMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    return v0
.end method

.method public final getNext$stream_chat_android_ui_components_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final getResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    return v0
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->query:Ljava/lang/String;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->canLoadMore:Z

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->results:Ljava/util/List;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore:Z

    iget-object v5, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->next:Ljava/lang/String;

    const-string v6, ", canLoadMore="

    const-string v7, ", results="

    const-string v8, "State(query="

    invoke-static {v8, v0, v6, v7, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isLoading="

    const-string v6, ", isLoadingMore="

    invoke-static {v1, v6, v0, v2, v3}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", next="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
