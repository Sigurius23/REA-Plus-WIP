.class final Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/remote/RemoteDataSourceImpl;->getAllProgressLevels(ILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/domain/model/RecordsDto;",
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/domain/model/RecordsDto;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.remote.RemoteDataSourceImpl$getAllProgressLevels$2"
    f = "RemoteDataSourceImpl.kt"
    l = {
        0xe9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $level:I

.field label:I

.field final synthetic this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/RemoteDataSourceImpl;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    iput p2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->$level:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    iget v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->$level:I

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    invoke-static {p1}, Lcom/whoop/data/remote/RemoteDataSourceImpl;->access$getProfileApiService$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/ProfileApiService;

    move-result-object p1

    iget v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->$level:I

    iput v2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;->label:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/service/network/ProfileApiService;->getAllProgressLevels(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
