.class final Lcom/whoop/archv2/feature/domain/g$z;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->z(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/f;",
        "domainState",
        "Lcom/whoop/archv2/feature/domain/i;",
        "action",
        "<anonymous>",
        "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;)Lcom/whoop/archv2/feature/domain/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$1"
    f = "GenericInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/archv2/feature/domain/g;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLcom/whoop/archv2/feature/domain/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/archv2/feature/domain/g;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$z;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/whoop/archv2/feature/domain/g$z;->z:Z

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$z;->E:Lcom/whoop/archv2/feature/domain/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/f;",
            "Lcom/whoop/archv2/feature/domain/i;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$z;

    iget-boolean v1, p0, Lcom/whoop/archv2/feature/domain/g$z;->z:Z

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$z;->E:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v0, v1, v2, p3}, Lcom/whoop/archv2/feature/domain/g$z;-><init>(ZLcom/whoop/archv2/feature/domain/g;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$z;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/archv2/feature/domain/g$z;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/archv2/feature/domain/g$z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/archv2/feature/domain/f;

    check-cast p2, Lcom/whoop/archv2/feature/domain/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/g$z;->f(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/g$z;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/archv2/feature/domain/f;

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/g$z;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/i;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/archv2/feature/domain/g$z;->w:I

    if-nez v3, :cond_2

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lcom/whoop/archv2/feature/domain/i$m;

    if-eqz v3, :cond_0

    check-cast v1, Lcom/whoop/archv2/feature/domain/i$m;

    const/4 v3, 0x0

    iget-boolean v4, v0, Lcom/whoop/archv2/feature/domain/g$z;->z:Z

    invoke-static {v2, v1, v3, v4}, Lcom/whoop/archv2/feature/domain/h;->d(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lcom/whoop/archv2/feature/domain/i$o;

    if-eqz v3, :cond_1

    check-cast v1, Lcom/whoop/archv2/feature/domain/i$o;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/i$o;->a()Lcom/whoop/archv2/feature/domain/b;

    move-result-object v3

    const v22, 0x7fffe

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v1

    return-object v1

    :cond_1
    iget-object v3, v0, Lcom/whoop/archv2/feature/domain/g$z;->E:Lcom/whoop/archv2/feature/domain/g;

    invoke-static {v3, v2, v1}, Lcom/whoop/archv2/feature/domain/g;->n(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
