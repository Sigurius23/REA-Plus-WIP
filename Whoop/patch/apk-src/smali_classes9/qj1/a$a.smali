.class final Lqj1/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj1/a;->h(Lb7/b;JLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager$readNewRecords$2"
    f = "HealthConnectBaseManager.kt"
    l = {
        0x30,
        0x3a,
        0x3f,
        0x41,
        0x48,
        0x4a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lqj1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj1/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lkotlin/jvm/internal/b0;

.field final synthetic H:Ljava/time/Instant;

.field final synthetic I:Lb7/b;

.field final synthetic J:Lkotlin/jvm/internal/e0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lqj1/a;Ljava/lang/String;Lkotlin/jvm/internal/b0;Ljava/time/Instant;Lb7/b;Lkotlin/jvm/internal/e0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj1/a<",
            "TT;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/b0;",
            "Ljava/time/Instant;",
            "Lb7/b;",
            "Lkotlin/jvm/internal/e0;",
            "Lq83/d<",
            "-",
            "Lqj1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj1/a$a;->E:Lqj1/a;

    iput-object p2, p0, Lqj1/a$a;->F:Ljava/lang/String;

    iput-object p3, p0, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iput-object p4, p0, Lqj1/a$a;->H:Ljava/time/Instant;

    iput-object p5, p0, Lqj1/a$a;->I:Lb7/b;

    iput-object p6, p0, Lqj1/a$a;->J:Lkotlin/jvm/internal/e0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqj1/a$a;

    iget-object v1, p0, Lqj1/a$a;->E:Lqj1/a;

    iget-object v2, p0, Lqj1/a$a;->F:Ljava/lang/String;

    iget-object v3, p0, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-object v4, p0, Lqj1/a$a;->H:Ljava/time/Instant;

    iget-object v5, p0, Lqj1/a$a;->I:Lb7/b;

    iget-object v6, p0, Lqj1/a$a;->J:Lkotlin/jvm/internal/e0;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lqj1/a$a;-><init>(Lqj1/a;Ljava/lang/String;Lkotlin/jvm/internal/b0;Ljava/time/Instant;Lb7/b;Lkotlin/jvm/internal/e0;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lqj1/a$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lqj1/a$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqj1/a$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lqj1/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v6, p0

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lqj1/a$a;->z:I

    const/4 v8, 0x3

    const/4 v9, 0x1

    const-string v10, "now(...)"

    const/4 v11, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v1, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lp7/a;

    iget-object v2, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v0

    move/from16 v16, v9

    move-object/from16 v0, p1

    goto/16 :goto_d

    :pswitch_1
    iget-object v0, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lp7/a;

    iget-object v1, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :pswitch_2
    iget-object v0, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v1, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lp7/a;

    iget-object v2, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :pswitch_3
    iget-object v0, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_4

    :pswitch_4
    iget-object v0, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lu92/d;

    iget-object v2, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_2

    :pswitch_5
    iget-object v0, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v1, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    move-object/from16 v0, p1

    goto :goto_1

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v0}, Lqj1/a;->d(Lqj1/a;)Lu92/d;

    move-result-object v0

    iget-object v1, v6, Lqj1/a$a;->F:Ljava/lang/String;

    invoke-virtual {v0, v1, v11}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v12, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-object v0, v6, Lqj1/a$a;->E:Lqj1/a;

    iget-object v1, v6, Lqj1/a$a;->H:Ljava/time/Instant;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v2}, Lqj1/a;->a(Lqj1/a;)Ljava/time/Clock;

    move-result-object v2

    invoke-static {v2}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v6, Lqj1/a$a;->I:Lb7/b;

    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v12, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v11, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    iput v9, v6, Lqj1/a$a;->z:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v6}, Lqj1/a;->e(Lqj1/a;Ljava/time/Instant;Ljava/time/Instant;Lb7/b;ZZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_c

    :cond_0
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v12, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_2

    iget-object v0, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v0}, Lqj1/a;->d(Lqj1/a;)Lu92/d;

    move-result-object v1

    iget-object v0, v6, Lqj1/a$a;->F:Ljava/lang/String;

    iget-object v2, v6, Lqj1/a$a;->I:Lb7/b;

    new-instance v3, Lo7/a;

    iget-object v4, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v4}, Lqj1/a;->c(Lqj1/a;)Lj93/d;

    move-result-object v4

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v4}, Lo7/a;-><init>(Ljava/util/Set;)V

    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v1, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v0, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v6, Lqj1/a$a;->z:I

    invoke-interface {v2, v3, v6}, Lb7/b;->f(Lo7/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_1

    goto/16 :goto_c

    :cond_1
    :goto_2
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move/from16 v16, v9

    goto/16 :goto_f

    :cond_3
    :goto_3
    iget-object v1, v6, Lqj1/a$a;->I:Lb7/b;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v11, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v11, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    iput v8, v6, Lqj1/a$a;->z:I

    invoke-interface {v1, v0, v6}, Lb7/b;->b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    goto/16 :goto_c

    :cond_4
    :goto_4
    move-object v12, v0

    check-cast v12, Lp7/a;

    iget-boolean v0, v12, Lp7/a;->d:Z

    iget-object v1, v12, Lp7/a;->a:Ljava/util/List;

    if-eqz v0, :cond_7

    iget-object v13, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-object v0, v6, Lqj1/a$a;->E:Lqj1/a;

    iget-object v1, v6, Lqj1/a$a;->H:Ljava/time/Instant;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v2}, Lqj1/a;->a(Lqj1/a;)Ljava/time/Clock;

    move-result-object v2

    invoke-static {v2}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v6, Lqj1/a$a;->I:Lb7/b;

    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v12, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v13, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v6, Lqj1/a$a;->z:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lqj1/a;->e(Lqj1/a;Ljava/time/Instant;Ljava/time/Instant;Lb7/b;ZZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    goto/16 :goto_c

    :cond_5
    move-object v1, v12

    :goto_5
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v13, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, v6, Lqj1/a$a;->I:Lb7/b;

    new-instance v2, Lo7/a;

    iget-object v3, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v3}, Lqj1/a;->c(Lqj1/a;)Lj93/d;

    move-result-object v3

    invoke-static {v3}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v3}, Lo7/a;-><init>(Ljava/util/Set;)V

    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v1, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v11, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v6, Lqj1/a$a;->z:I

    invoke-interface {v0, v2, v6}, Lb7/b;->f(Lo7/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    goto/16 :goto_c

    :cond_6
    :goto_6
    check-cast v0, Ljava/lang/String;

    move/from16 v16, v9

    goto/16 :goto_e

    :cond_7
    iget-object v13, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-object v0, v6, Lqj1/a$a;->E:Lqj1/a;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ld7/b;

    if-eqz v5, :cond_8

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    iget-object v3, v6, Lqj1/a$a;->E:Lqj1/a;

    move-object v4, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld7/b;

    invoke-static {v3}, Lqj1/a;->c(Lqj1/a;)Lj93/d;

    move-result-object v14

    iget-object v5, v5, Ld7/b;->a:Lm7/r0;

    invoke-interface {v14, v5}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    move/from16 v16, v9

    goto :goto_9

    :cond_a
    invoke-static {v3}, Lqj1/a;->b(Lqj1/a;)Ltr2/n;

    move-result-object v14

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v3}, Lqj1/a;->c(Lqj1/a;)Lj93/d;

    move-result-object v15

    move/from16 v16, v9

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v8, "Failed to cast "

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " to "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    new-array v8, v8, [Lqr2/a$a;

    invoke-interface {v14, v5, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v5, v11

    :goto_9
    if-eqz v5, :cond_b

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    move/from16 v9, v16

    const/4 v8, 0x3

    goto :goto_8

    :cond_c
    move/from16 v16, v9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ld7/a;

    if-eqz v5, :cond_d

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld7/a;

    iget-object v4, v4, Ld7/a;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    iput-object v11, v6, Lqj1/a$a;->w:Ljava/lang/Object;

    iput-object v12, v6, Lqj1/a$a;->x:Ljava/lang/Object;

    iput-object v13, v6, Lqj1/a$a;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v6, Lqj1/a$a;->z:I

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lqj1/a;->g(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_10

    :goto_c
    return-object v7

    :cond_10
    move-object v1, v12

    :goto_d
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v13, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, v1, Lp7/a;->b:Ljava/lang/String;

    :goto_e
    iget-object v2, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-boolean v2, v2, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v2, :cond_11

    iget-object v2, v6, Lqj1/a$a;->E:Lqj1/a;

    invoke-static {v2}, Lqj1/a;->d(Lqj1/a;)Lu92/d;

    move-result-object v2

    iget-object v3, v6, Lqj1/a$a;->F:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    iget-boolean v1, v1, Lp7/a;->c:Z

    if-nez v1, :cond_14

    :goto_f
    iget-object v0, v6, Lqj1/a$a;->J:Lkotlin/jvm/internal/e0;

    iget v1, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lkotlin/jvm/internal/e0;->w:I

    iget-object v0, v6, Lqj1/a$a;->G:Lkotlin/jvm/internal/b0;

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v0, :cond_13

    const/4 v2, 0x3

    if-le v1, v2, :cond_12

    goto :goto_10

    :cond_12
    move v8, v2

    move/from16 v9, v16

    goto/16 :goto_0

    :cond_13
    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_14
    move/from16 v9, v16

    const/4 v8, 0x3

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
