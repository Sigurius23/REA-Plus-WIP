.class final Lpt1/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt1/d;->l(Lec3/l;)Lec3/l;
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
        "Lpt1/b;",
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
    c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$1$2$1"
    f = "LabradorReadingInteractor.kt"
    l = {
        0xcd,
        0xd1,
        0xce
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:J

.field K:I

.field L:I

.field M:I

.field private synthetic N:Ljava/lang/Object;

.field final synthetic O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic P:J

.field final synthetic Q:Lpt1/b;

.field final synthetic R:Lpt1/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;JLpt1/b;Lpt1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;J",
            "Lpt1/b;",
            "Lpt1/d;",
            "Lq83/d<",
            "-",
            "Lpt1/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpt1/d$d;->O:Ljava/util/List;

    iput-wide p2, p0, Lpt1/d$d;->P:J

    iput-object p4, p0, Lpt1/d$d;->Q:Lpt1/b;

    iput-object p5, p0, Lpt1/d$d;->R:Lpt1/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lpt1/d$d;

    iget-object v1, p0, Lpt1/d$d;->O:Ljava/util/List;

    iget-wide v2, p0, Lpt1/d$d;->P:J

    iget-object v4, p0, Lpt1/d$d;->Q:Lpt1/b;

    iget-object v5, p0, Lpt1/d$d;->R:Lpt1/d;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lpt1/d$d;-><init>(Ljava/util/List;JLpt1/b;Lpt1/d;Lq83/d;)V

    iput-object p1, v0, Lpt1/d$d;->N:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lpt1/d$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpt1/d$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpt1/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpt1/d$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lpt1/d$d;->N:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lpt1/d$d;->M:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget v3, v0, Lpt1/d$d;->K:I

    iget-wide v9, v0, Lpt1/d$d;->J:J

    iget-object v11, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    check-cast v12, Lpt1/d;

    iget-object v13, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    check-cast v13, Lpt1/b;

    iget-object v14, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v15, v6

    move v4, v7

    :goto_0
    move v6, v3

    move-object v3, v13

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v3, v0, Lpt1/d$d;->L:I

    iget v9, v0, Lpt1/d$d;->K:I

    iget-wide v10, v0, Lpt1/d$d;->J:J

    iget-object v12, v0, Lpt1/d$d;->I:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    iget-object v13, v0, Lpt1/d$d;->H:Ljava/lang/Object;

    check-cast v13, Lpt1/b;

    iget-object v14, v0, Lpt1/d$d;->G:Ljava/lang/Object;

    check-cast v14, Lpt1/c$e;

    iget-object v15, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v15, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v5, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    check-cast v5, Lpt1/d;

    iget-object v6, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    check-cast v6, Lpt1/b;

    iget-object v7, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v13

    const/4 v4, 0x1

    move-object v13, v6

    move-wide v6, v10

    move-object v11, v15

    const/4 v15, 0x2

    move-object v10, v5

    move v5, v3

    move v3, v9

    move-object/from16 v9, p1

    goto/16 :goto_3

    :cond_2
    iget v3, v0, Lpt1/d$d;->L:I

    iget v5, v0, Lpt1/d$d;->K:I

    iget-wide v6, v0, Lpt1/d$d;->J:J

    iget-object v9, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    check-cast v11, Lpt1/d;

    iget-object v12, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    check-cast v12, Lpt1/b;

    iget-object v13, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v12

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lpt1/d$d;->O:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    iget-wide v5, v0, Lpt1/d$d;->P:J

    iget-object v7, v0, Lpt1/d$d;->Q:Lpt1/b;

    iget-object v9, v0, Lpt1/d$d;->R:Lpt1/d;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v10, v3

    move-object v3, v7

    move-object v11, v9

    move-wide v6, v5

    move v5, v4

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    iput-object v1, v0, Lpt1/d$d;->N:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    iput-object v3, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    iput-object v10, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->E:Ljava/lang/Object;

    iput-object v9, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    iput-wide v6, v0, Lpt1/d$d;->J:J

    iput v5, v0, Lpt1/d$d;->K:I

    iput v4, v0, Lpt1/d$d;->L:I

    const/4 v12, 0x1

    iput v12, v0, Lpt1/d$d;->M:I

    invoke-static {v6, v7, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v13, v3

    move v3, v4

    :goto_2
    invoke-virtual {v13}, Lpt1/b;->c()Lpt1/c;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Lpt1/c$e;

    sget-object v12, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    iput-object v1, v0, Lpt1/d$d;->N:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    iput-object v13, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    iput-object v10, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->E:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    iput-object v14, v0, Lpt1/d$d;->G:Ljava/lang/Object;

    iput-object v13, v0, Lpt1/d$d;->H:Ljava/lang/Object;

    iput-object v1, v0, Lpt1/d$d;->I:Ljava/lang/Object;

    iput-wide v6, v0, Lpt1/d$d;->J:J

    iput v5, v0, Lpt1/d$d;->K:I

    iput v3, v0, Lpt1/d$d;->L:I

    const/4 v15, 0x2

    iput v15, v0, Lpt1/d$d;->M:I

    const/4 v4, 0x1

    invoke-static {v11, v9, v12, v4, v0}, Lpt1/d;->a(Lpt1/d;Ljava/util/List;Ly81/f;ZLq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_5

    goto :goto_4

    :cond_5
    move v12, v5

    move v5, v3

    move v3, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v12

    move-object v12, v1

    move-object/from16 v16, v13

    :goto_3
    check-cast v9, Ljava/util/List;

    invoke-static {v14, v8, v9, v4, v8}, Lpt1/c$e;->b(Lpt1/c$e;Ldk0/j;Ljava/util/List;ILjava/lang/Object;)Lpt1/c$e;

    move-result-object v17

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v9

    iput-object v1, v0, Lpt1/d$d;->N:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->w:Ljava/lang/Object;

    iput-object v13, v0, Lpt1/d$d;->x:Ljava/lang/Object;

    iput-object v10, v0, Lpt1/d$d;->y:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$d;->z:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->E:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->F:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->G:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->H:Ljava/lang/Object;

    iput-object v8, v0, Lpt1/d$d;->I:Ljava/lang/Object;

    iput-wide v6, v0, Lpt1/d$d;->J:J

    iput v3, v0, Lpt1/d$d;->K:I

    iput v5, v0, Lpt1/d$d;->L:I

    const/4 v5, 0x3

    iput v5, v0, Lpt1/d$d;->M:I

    invoke-interface {v12, v9, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_6

    :goto_4
    return-object v2

    :cond_6
    move-object v12, v10

    move-wide v9, v6

    goto/16 :goto_0

    :goto_5
    move v5, v6

    move-wide v6, v9

    move-object v10, v11

    move-object v11, v12

    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
