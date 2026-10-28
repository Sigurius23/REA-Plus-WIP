.class final Lcom/whoop/archv2/feature/domain/l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/l;->g(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/archv2/feature/domain/f;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericScreenFetchNoCacheInteractor$fetchScreen$1"
    f = "GenericScreenFetchNoCacheInteractor.kt"
    l = {
        0x1d,
        0x3d,
        0x26,
        0x30
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lcom/whoop/archv2/feature/domain/l;

.field final synthetic I:Lcom/whoop/network/request/GetApiRequest;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/l;",
            "Lcom/whoop/network/request/GetApiRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/l$a;->H:Lcom/whoop/archv2/feature/domain/l;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/l$a;->I:Lcom/whoop/network/request/GetApiRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/archv2/feature/domain/l$a;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/l$a;->H:Lcom/whoop/archv2/feature/domain/l;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/l$a;->I:Lcom/whoop/network/request/GetApiRequest;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/archv2/feature/domain/l$a;-><init>(Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/l$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/feature/domain/l$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/archv2/feature/domain/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/l$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    move-object/from16 v5, p0

    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->F:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v14, :cond_3

    if-eq v0, v13, :cond_2

    if-eq v0, v12, :cond_1

    if-ne v0, v11, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/modal/LifecycleInteractions;

    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/model/template/ScreenTemplate;

    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    :goto_0
    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_2
    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->x:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    iget-object v0, v5, Lcom/whoop/archv2/feature/domain/l$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Lcom/whoop/archv2/feature/domain/l$a;->H:Lcom/whoop/archv2/feature/domain/l;

    invoke-static {v1}, Lcom/whoop/archv2/feature/domain/l;->e(Lcom/whoop/archv2/feature/domain/l;)Ltr2/n;

    move-result-object v1

    iget-object v2, v5, Lcom/whoop/archv2/feature/domain/l$a;->I:Lcom/whoop/network/request/GetApiRequest;

    invoke-interface {v2}, Lcom/whoop/network/request/GetApiRequest;->getPath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to fetch screen at path "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/archv2/feature/domain/l$a$a;

    iget-object v2, v5, Lcom/whoop/archv2/feature/domain/l$a;->H:Lcom/whoop/archv2/feature/domain/l;

    iget-object v6, v5, Lcom/whoop/archv2/feature/domain/l$a;->I:Lcom/whoop/network/request/GetApiRequest;

    invoke-direct {v4, v2, v6, v15}, Lcom/whoop/archv2/feature/domain/l$a$a;-><init>(Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    iput-object v8, v5, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    iput v14, v5, Lcom/whoop/archv2/feature/domain/l$a;->F:I

    const/4 v2, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_6

    :cond_5
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_c

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf63/c;

    invoke-virtual {v0}, Lf63/c;->a()Lw53/b;

    move-result-object v0

    const-class v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    iput-object v8, v5, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->w:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->x:Ljava/lang/Object;

    iput v10, v5, Lcom/whoop/archv2/feature/domain/l$a;->E:I

    iput v13, v5, Lcom/whoop/archv2/feature/domain/l$a;->F:I

    invoke-virtual {v0, v1, v5}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_2
    if-eqz v0, :cond_b

    check-cast v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-interface/range {v18 .. v18}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getPrefetchList()Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {v0, v15, v14, v15}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_8
    move-object/from16 v28, v0

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->getOnStart()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    move-object/from16 v25, v0

    goto :goto_3

    :cond_9
    move-object/from16 v25, v15

    :goto_3
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->getSystemBackDisabled()Z

    move-result v10

    :cond_a
    move/from16 v26, v10

    new-instance v16, Lcom/whoop/archv2/feature/domain/f;

    const v36, 0x7f4fd

    const/16 v37, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v16 .. v37}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->w:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->x:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->y:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->z:Ljava/lang/Object;

    iput v12, v5, Lcom/whoop/archv2/feature/domain/l$a;->F:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.whoop.archv2.model.template.AnyScreenTemplate"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_f

    new-instance v16, Lcom/whoop/archv2/feature/domain/f;

    move-object v1, v0

    check-cast v1, Lu02/a$b;

    instance-of v1, v1, Lu02/a$b$a;

    if-eqz v1, :cond_d

    new-instance v1, Lcom/whoop/archv2/feature/domain/b$d;

    check-cast v0, Lu02/a$b$a;

    invoke-virtual {v0}, Lu02/a$b$a;->d()I

    move-result v0

    invoke-direct {v1, v0}, Lcom/whoop/archv2/feature/domain/b$d;-><init>(I)V

    :goto_4
    move-object/from16 v17, v1

    goto :goto_5

    :cond_d
    sget-object v1, Lcom/whoop/archv2/feature/domain/b$c;->a:Lcom/whoop/archv2/feature/domain/b$c;

    goto :goto_4

    :goto_5
    const v36, 0x7fffe

    const/16 v37, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v16 .. v37}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->G:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/archv2/feature/domain/l$a;->w:Ljava/lang/Object;

    iput v11, v5, Lcom/whoop/archv2/feature/domain/l$a;->F:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    :goto_6
    return-object v9

    :cond_e
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
