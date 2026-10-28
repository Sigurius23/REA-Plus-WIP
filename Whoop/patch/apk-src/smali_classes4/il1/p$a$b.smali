.class public final Lil1/p$a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/p$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeDomainCombiner$combine$$inlined$combine$2$3"
    f = "HomeDomainCombiner.kt"
    l = {
        0xea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil1/p;


# direct methods
.method public constructor <init>(Lq83/d;Lil1/p;)V
    .locals 0

    iput-object p2, p0, Lil1/p$a$b;->z:Lil1/p;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lil1/p$a$b;

    iget-object v1, p0, Lil1/p$a$b;->z:Lil1/p;

    invoke-direct {v0, p3, v1}, Lil1/p$a$b;-><init>(Lq83/d;Lil1/p;)V

    iput-object p1, v0, Lil1/p$a$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil1/p$a$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/p$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/p$a$b;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lil1/p$a$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lil1/p$a$b;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v1, v0, Lil1/p$a$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lil1/p$a$b;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lil1/p$a$b;->y:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget-object v5, v4, v5

    aget-object v6, v4, v3

    const/4 v7, 0x2

    aget-object v7, v4, v7

    const/4 v8, 0x3

    aget-object v8, v4, v8

    const/4 v9, 0x4

    aget-object v9, v4, v9

    const/4 v10, 0x5

    aget-object v10, v4, v10

    const/4 v11, 0x6

    aget-object v11, v4, v11

    const/4 v12, 0x7

    aget-object v12, v4, v12

    const/16 v13, 0x8

    aget-object v13, v4, v13

    const/16 v14, 0x9

    aget-object v14, v4, v14

    const/16 v15, 0xa

    aget-object v15, v4, v15

    const/16 v16, 0xb

    aget-object v16, v4, v16

    const/16 v17, 0xc

    aget-object v17, v4, v17

    const/16 v18, 0xd

    aget-object v18, v4, v18

    const/16 v19, 0xe

    aget-object v19, v4, v19

    const/16 v20, 0xf

    aget-object v20, v4, v20

    const/16 v21, 0x10

    aget-object v21, v4, v21

    const/16 v22, 0x11

    aget-object v4, v4, v22

    check-cast v4, Ll83/k;

    move-object/from16 v43, v21

    check-cast v43, Lwl1/b;

    move-object/from16 v42, v20

    check-cast v42, Ljl1/a;

    move-object/from16 v41, v19

    check-cast v41, Lbm1/c;

    check-cast v18, Ljava/lang/Boolean;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v40

    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v39

    move-object/from16 v38, v16

    check-cast v38, Lcm1/a;

    move-object/from16 v37, v15

    check-cast v37, Ltl1/a;

    move-object/from16 v36, v14

    check-cast v36, Lvl1/a;

    move-object/from16 v35, v13

    check-cast v35, Lil1/f;

    move-object/from16 v34, v12

    check-cast v34, Lil1/h;

    move-object/from16 v33, v11

    check-cast v33, Lam1/b;

    move-object/from16 v31, v10

    check-cast v31, Lol1/a;

    move-object/from16 v30, v9

    check-cast v30, Lul1/b;

    move-object/from16 v28, v8

    check-cast v28, Lsl1/b;

    move-object/from16 v27, v7

    check-cast v27, Lsl1/a;

    move-object/from16 v26, v6

    check-cast v26, Lkl1/e;

    check-cast v5, Lil1/v;

    instance-of v6, v5, Lil1/v$b;

    if-eqz v6, :cond_2

    sget-object v4, Lil1/q$b;->a:Lil1/q$b;

    goto/16 :goto_1

    :cond_2
    instance-of v6, v5, Lil1/v$a;

    if-eqz v6, :cond_3

    new-instance v6, Lil1/q$a;

    check-cast v5, Lil1/v$a;

    invoke-virtual {v5}, Lil1/v$a;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v23

    invoke-virtual {v5}, Lil1/v$a;->b()Ljava/time/LocalDate;

    move-result-object v24

    invoke-virtual {v5}, Lil1/v$a;->c()I

    move-result v25

    invoke-virtual {v5}, Lil1/v$a;->d()Lxl1/c;

    move-result-object v29

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v44, v4

    check-cast v44, Ljava/lang/String;

    iget-object v4, v0, Lil1/p$a$b;->z:Lil1/p;

    const v45, 0x61e00

    const/16 v46, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v22 .. v46}, Lil1/p;->c(Lil1/p;Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILkl1/e;Lsl1/a;Lsl1/b;Lxl1/c;Lul1/b;Lol1/a;Lem1/r;Lam1/b;Lil1/h;Lil1/f;Lvl1/a;Ltl1/a;Lcm1/a;ZZLbm1/c;Ljl1/a;Lwl1/b;Ljava/lang/String;ILjava/lang/Object;)Lil1/n;

    move-result-object v4

    invoke-virtual {v5}, Lil1/v$a;->e()Z

    move-result v5

    invoke-direct {v6, v4, v5}, Lil1/q$a;-><init>(Lil1/n;Z)V

    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_3
    instance-of v6, v5, Lil1/v$d;

    if-eqz v6, :cond_4

    new-instance v6, Lil1/q$d;

    check-cast v5, Lil1/v$d;

    invoke-virtual {v5}, Lil1/v$d;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v23

    invoke-virtual {v5}, Lil1/v$d;->b()Ljava/time/LocalDate;

    move-result-object v24

    invoke-virtual {v5}, Lil1/v$d;->c()I

    move-result v25

    invoke-virtual {v5}, Lil1/v$d;->d()Lxl1/c;

    move-result-object v29

    invoke-virtual {v5}, Lil1/v$d;->e()Lem1/r;

    move-result-object v32

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v44, v4

    check-cast v44, Ljava/lang/String;

    iget-object v4, v0, Lil1/p$a$b;->z:Lil1/p;

    const/high16 v45, 0x20000

    const/16 v46, 0x0

    const/16 v40, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v22 .. v46}, Lil1/p;->c(Lil1/p;Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILkl1/e;Lsl1/a;Lsl1/b;Lxl1/c;Lul1/b;Lol1/a;Lem1/r;Lam1/b;Lil1/h;Lil1/f;Lvl1/a;Ltl1/a;Lcm1/a;ZZLbm1/c;Ljl1/a;Lwl1/b;Ljava/lang/String;ILjava/lang/Object;)Lil1/n;

    move-result-object v4

    invoke-direct {v6, v4}, Lil1/q$d;-><init>(Lil1/n;)V

    goto :goto_0

    :cond_4
    instance-of v6, v5, Lil1/v$c;

    if-eqz v6, :cond_6

    new-instance v6, Lil1/q$c;

    check-cast v5, Lil1/v$c;

    invoke-virtual {v5}, Lil1/v$c;->c()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v23

    invoke-virtual {v5}, Lil1/v$c;->d()Ljava/time/LocalDate;

    move-result-object v24

    invoke-virtual {v5}, Lil1/v$c;->e()I

    move-result v25

    invoke-virtual {v5}, Lil1/v$c;->f()Lxl1/c;

    move-result-object v29

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v44, v4

    check-cast v44, Ljava/lang/String;

    iget-object v4, v0, Lil1/p$a$b;->z:Lil1/p;

    const/16 v45, 0x200

    const/16 v46, 0x0

    const/16 v32, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v22 .. v46}, Lil1/p;->c(Lil1/p;Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILkl1/e;Lsl1/a;Lsl1/b;Lxl1/c;Lul1/b;Lol1/a;Lem1/r;Lam1/b;Lil1/h;Lil1/f;Lvl1/a;Ltl1/a;Lcm1/a;ZZLbm1/c;Ljl1/a;Lwl1/b;Ljava/lang/String;ILjava/lang/Object;)Lil1/n;

    move-result-object v4

    invoke-direct {v6, v4}, Lil1/q$c;-><init>(Lil1/n;)V

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    iput-object v5, v0, Lil1/p$a$b;->x:Ljava/lang/Object;

    iput-object v5, v0, Lil1/p$a$b;->y:Ljava/lang/Object;

    iput v3, v0, Lil1/p$a$b;->w:I

    invoke-interface {v2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
