.class final Lnv0/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnv0/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lnv0/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lnv0/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lnv0/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lnv0/c$f$a;->x:Lnv0/c;

    iput-object p3, p0, Lnv0/c$f$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lnv0/a;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnv0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lnv0/c$f$a$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lnv0/c$f$a$a;

    iget v4, v3, Lnv0/c$f$a$a;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lnv0/c$f$a$a;->H:I

    :goto_0
    move-object v8, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lnv0/c$f$a$a;

    invoke-direct {v3, v0, v2}, Lnv0/c$f$a$a;-><init>(Lnv0/c$f$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v8, Lnv0/c$f$a$a;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v8, Lnv0/c$f$a$a;->H:I

    const/4 v11, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v12, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v7, :cond_4

    if-eq v4, v6, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v11, :cond_1

    iget-object v1, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lnv0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v8, Lnv0/c$f$a$a;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v8, Lnv0/c$f$a$a;->y:Ljava/lang/Object;

    check-cast v4, Lnv0/c$a;

    iget-object v5, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    check-cast v5, Lnv0/b$c;

    iget-object v5, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    check-cast v5, Lnv0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v4

    goto/16 :goto_5

    :cond_3
    iget-object v1, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    check-cast v4, Lnv0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    iget-object v1, v8, Lnv0/c$f$a$a;->y:Ljava/lang/Object;

    check-cast v1, Lnv0/c$a;

    iget-object v4, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/g0;

    iget-object v5, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    check-cast v5, Lnv0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v1

    goto :goto_2

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v4, v1, Lnv0/a$b;

    if-eqz v4, :cond_8

    iget-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v13, v4

    check-cast v13, Lnv0/c$a;

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    check-cast v1, Lnv0/a$b;

    invoke-virtual {v1}, Lnv0/a$b;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    iget-object v1, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lnv0/c$a;

    invoke-virtual {v1}, Lnv0/c$a;->d()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v5, v1

    iget-object v1, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lnv0/c$a;

    invoke-virtual {v1}, Lnv0/c$a;->e()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    iput-object v2, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    iput-object v13, v8, Lnv0/c$f$a$a;->y:Ljava/lang/Object;

    iput v7, v8, Lnv0/c$f$a$a;->H:I

    const/4 v6, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v7, v1

    invoke-static/range {v4 .. v10}, Lnv0/c;->k(Lnv0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_8

    :cond_7
    move-object v4, v2

    move-object v14, v13

    move-object v2, v1

    :goto_2
    move-object v15, v2

    check-cast v15, Lnv0/b;

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lnv0/c$a;->b(Lnv0/c$a;Lnv0/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lnv0/c$a;

    move-result-object v1

    move-object v2, v4

    goto/16 :goto_7

    :cond_8
    instance-of v4, v1, Lnv0/a$d;

    if-eqz v4, :cond_9

    iget-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v13, v4

    check-cast v13, Lnv0/c$a;

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    check-cast v1, Lnv0/a$d;

    invoke-virtual {v1}, Lnv0/a$d;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v6, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Lnv0/c$a;

    invoke-virtual {v6}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lnv0/c;->a(Lnv0/c;Ljava/lang/String;Lnv0/b;)Lnv0/b;

    move-result-object v14

    invoke-virtual {v1}, Lnv0/a$d;->a()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Lnv0/c$a;->b(Lnv0/c$a;Lnv0/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lnv0/c$a;

    move-result-object v1

    goto/16 :goto_7

    :cond_9
    instance-of v4, v1, Lnv0/a$c;

    if-eqz v4, :cond_f

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    iget-object v7, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lnv0/c$a;

    check-cast v1, Lnv0/a$c;

    invoke-virtual {v1}, Lnv0/a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v7, v1}, Lnv0/c;->f(Lnv0/c;Lnv0/c$a;Ljava/lang/String;)Lnv0/c$a;

    move-result-object v1

    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lnv0/c$f$a;->y:Lec3/m;

    iget-object v4, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v4, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lnv0/c$a;

    invoke-virtual {v4}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v4

    iput-object v12, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    iput-object v2, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    iput v6, v8, Lnv0/c$f$a$a;->H:I

    invoke-interface {v1, v4, v8}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    goto/16 :goto_8

    :cond_a
    move-object v1, v2

    :goto_3
    iget-object v2, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lnv0/c$a;

    invoke-virtual {v2}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v2

    instance-of v4, v2, Lnv0/b$c;

    if-eqz v4, :cond_b

    check-cast v2, Lnv0/b$c;

    move-object v6, v2

    goto :goto_4

    :cond_b
    move-object v6, v12

    :goto_4
    if-eqz v6, :cond_d

    iget-object v2, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    iget-object v7, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v10, v7

    check-cast v10, Lnv0/c$a;

    check-cast v7, Lnv0/c$a;

    invoke-virtual {v7}, Lnv0/c$a;->d()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lnv0/c$a;

    invoke-virtual {v2}, Lnv0/c$a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lnv0/b$c;->f()Ljava/lang/String;

    move-result-object v9

    iput-object v12, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    iput-object v10, v8, Lnv0/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v1, v8, Lnv0/c$f$a$a;->z:Ljava/lang/Object;

    const/4 v13, 0x0

    iput v13, v8, Lnv0/c$f$a$a;->E:I

    iput v5, v8, Lnv0/c$f$a$a;->H:I

    move-object v5, v9

    move-object v9, v8

    move-object v8, v5

    move-object v5, v7

    move-object v7, v2

    invoke-static/range {v4 .. v9}, Lnv0/c;->d(Lnv0/c;Ljava/lang/String;Lnv0/b$c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v9

    if-ne v2, v3, :cond_c

    goto/16 :goto_8

    :cond_c
    move-object v13, v10

    :goto_5
    move-object v14, v2

    check-cast v14, Lnv0/b;

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lnv0/c$a;->b(Lnv0/c$a;Lnv0/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lnv0/c$a;

    move-result-object v2

    if-nez v2, :cond_e

    :cond_d
    move-object v2, v1

    goto :goto_6

    :cond_e
    move-object/from16 v20, v2

    move-object v2, v1

    move-object/from16 v1, v20

    goto :goto_7

    :goto_6
    iget-object v1, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lnv0/c$a;

    goto :goto_7

    :cond_f
    instance-of v4, v1, Lnv0/a$a;

    if-eqz v4, :cond_10

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lnv0/c$a;

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    check-cast v1, Lnv0/c$a;

    invoke-virtual {v1}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v1

    const-string v5, ""

    invoke-static {v4, v5, v1}, Lnv0/c;->g(Lnv0/c;Ljava/lang/String;Lnv0/b;)Lnv0/b;

    move-result-object v14

    const/16 v17, 0x4

    const/16 v18, 0x0

    const-string v15, ""

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lnv0/c$a;->b(Lnv0/c$a;Lnv0/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lnv0/c$a;

    move-result-object v1

    goto :goto_7

    :cond_10
    instance-of v4, v1, Lnv0/a$e;

    if-eqz v4, :cond_12

    iget-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v13, v4

    check-cast v13, Lnv0/c$a;

    iget-object v4, v0, Lnv0/c$f$a;->x:Lnv0/c;

    check-cast v1, Lnv0/a$e;

    invoke-virtual {v1}, Lnv0/a$e;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v6, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Lnv0/c$a;

    invoke-virtual {v6}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lnv0/c;->g(Lnv0/c;Ljava/lang/String;Lnv0/b;)Lnv0/b;

    move-result-object v14

    invoke-virtual {v1}, Lnv0/a$e;->a()Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lnv0/c$a;->b(Lnv0/c$a;Lnv0/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lnv0/c$a;

    move-result-object v1

    :goto_7
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lnv0/c$f$a;->y:Lec3/m;

    iget-object v2, v0, Lnv0/c$f$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lnv0/c$a;

    invoke-virtual {v2}, Lnv0/c$a;->c()Lnv0/b;

    move-result-object v2

    iput-object v12, v8, Lnv0/c$f$a$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Lnv0/c$f$a$a;->x:Ljava/lang/Object;

    iput-object v12, v8, Lnv0/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v12, v8, Lnv0/c$f$a$a;->z:Ljava/lang/Object;

    iput v11, v8, Lnv0/c$f$a$a;->H:I

    invoke-interface {v1, v2, v8}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_8
    return-object v3

    :cond_11
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnv0/a;

    invoke-virtual {p0, p1, p2}, Lnv0/c$f$a;->b(Lnv0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
