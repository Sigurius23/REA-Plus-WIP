.class public final Lcom/whoop/archv2/feature/domain/g$f0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g$f0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic w:Lec3/m;

.field final synthetic x:Lcom/whoop/archv2/feature/domain/g;

.field final synthetic y:Lcom/whoop/navigation/models/GenericInteraction;

.field final synthetic z:Lcom/whoop/archv2/feature/domain/a;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/a;Z)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$f0$a;->w:Lec3/m;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$f0$a;->x:Lcom/whoop/archv2/feature/domain/g;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/g$f0$a;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p4, p0, Lcom/whoop/archv2/feature/domain/g$f0$a;->z:Lcom/whoop/archv2/feature/domain/a;

    iput-boolean p5, p0, Lcom/whoop/archv2/feature/domain/g$f0$a;->E:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/whoop/archv2/feature/domain/g$f0$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;

    iget v3, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;

    invoke-direct {v2, v0, v1}, Lcom/whoop/archv2/feature/domain/g$f0$a$a;-><init>(Lcom/whoop/archv2/feature/domain/g$f0$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/g$f0$a;->w:Lec3/m;

    move-object/from16 v6, p1

    check-cast v6, Lcom/whoop/archv2/feature/domain/f;

    invoke-virtual {v6}, Lcom/whoop/archv2/feature/domain/f;->u()Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    move-object v15, v7

    goto :goto_1

    :cond_3
    iget-object v4, v0, Lcom/whoop/archv2/feature/domain/g$f0$a;->x:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v6}, Lcom/whoop/archv2/feature/domain/f;->k()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v8

    iget-object v9, v0, Lcom/whoop/archv2/feature/domain/g$f0$a;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v4, v8, v9}, Lcom/whoop/archv2/feature/domain/g;->k(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v4

    move-object v15, v4

    :goto_1
    iget-object v4, v0, Lcom/whoop/archv2/feature/domain/g$f0$a;->z:Lcom/whoop/archv2/feature/domain/a;

    if-eqz v4, :cond_4

    :goto_2
    move-object/from16 v25, v4

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lcom/whoop/archv2/feature/domain/f;->t()Lcom/whoop/archv2/feature/domain/a;

    move-result-object v4

    goto :goto_2

    :goto_3
    iget-boolean v9, v0, Lcom/whoop/archv2/feature/domain/g$f0$a;->E:Z

    const v26, 0x3fefb

    const/16 v27, 0x0

    move-object v4, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v6 .. v27}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v6

    new-instance v7, Lcom/whoop/archv2/feature/domain/i$m;

    invoke-direct {v7, v6}, Lcom/whoop/archv2/feature/domain/i$m;-><init>(Lcom/whoop/archv2/feature/domain/f;)V

    iput-object v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->H:I

    iput v5, v2, Lcom/whoop/archv2/feature/domain/g$f0$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
