.class final Lsl1/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl1/d;->l(Lec3/l;)Lec3/l;
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
        "Los0/b;",
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
    c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$1$1"
    f = "StrapDomainInteractor.kt"
    l = {
        0xdc,
        0xdd,
        0xdf,
        0xe0,
        0xe1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsl1/d;


# direct methods
.method public constructor <init>(Lsl1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl1/d;",
            "Lq83/d<",
            "-",
            "Lsl1/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl1/d$i;->z:Lsl1/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lsl1/d$i;

    iget-object v1, p0, Lsl1/d$i;->z:Lsl1/d;

    invoke-direct {v0, v1, p2}, Lsl1/d$i;-><init>(Lsl1/d;Lq83/d;)V

    iput-object p1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lsl1/d$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl1/d$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl1/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl1/d$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lsl1/d$i;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const-wide/16 v10, 0xbb8

    if-eqz v3, :cond_5

    if-eq v3, v9, :cond_4

    if-eq v3, v8, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-wide v6, v0, Lsl1/d$i;->w:J

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-wide v7, v0, Lsl1/d$i;->w:J

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-wide v8, v0, Lsl1/d$i;->w:J

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-wide v12, v0, Lsl1/d$i;->w:J

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iget-object v3, v0, Lsl1/d$i;->z:Lsl1/d;

    invoke-static {v3}, Lsl1/d;->e(Lsl1/d;)J

    move-result-wide v14

    sub-long v14, v12, v14

    cmp-long v3, v14, v10

    if-ltz v3, :cond_6

    iget-object v3, v0, Lsl1/d$i;->z:Lsl1/d;

    invoke-static {v3}, Lsl1/d;->c(Lsl1/d;)Lbc3/c0;

    move-result-object v3

    new-instance v14, Lsl1/d$i$a;

    iget-object v15, v0, Lsl1/d$i;->z:Lsl1/d;

    invoke-direct {v14, v15, v4}, Lsl1/d$i$a;-><init>(Lsl1/d;Lq83/d;)V

    invoke-static {v3, v4, v4, v14, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v3, v0, Lsl1/d$i;->z:Lsl1/d;

    invoke-static {v3, v12, v13}, Lsl1/d;->j(Lsl1/d;J)V

    :cond_6
    sget-object v3, Los0/b$b;->a:Los0/b$b;

    iput-object v1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    iput-wide v12, v0, Lsl1/d$i;->w:J

    iput v9, v0, Lsl1/d$i;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_4

    :cond_7
    :goto_0
    iput-object v1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    iput-wide v12, v0, Lsl1/d$i;->w:J

    iput v8, v0, Lsl1/d$i;->x:I

    invoke-static {v10, v11, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_8

    goto :goto_4

    :cond_8
    move-wide v8, v12

    :goto_1
    iget-object v3, v0, Lsl1/d$i;->z:Lsl1/d;

    invoke-static {v3}, Lsl1/d;->f(Lsl1/d;)Ltr2/n;

    move-result-object v3

    const/4 v12, 0x0

    new-array v12, v12, [Lqr2/a$a;

    const-string v13, "Emitting RefreshShowDataTiles after pull to refresh delay"

    invoke-interface {v3, v13, v12}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v3, Los0/b$c;->a:Los0/b$c;

    iput-object v1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    iput-wide v8, v0, Lsl1/d$i;->w:J

    iput v7, v0, Lsl1/d$i;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_9

    goto :goto_4

    :cond_9
    move-wide v7, v8

    :goto_2
    iput-object v1, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    iput-wide v7, v0, Lsl1/d$i;->w:J

    iput v6, v0, Lsl1/d$i;->x:I

    invoke-static {v10, v11, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    goto :goto_4

    :cond_a
    move-wide v6, v7

    :goto_3
    sget-object v3, Los0/b$a;->a:Los0/b$a;

    iput-object v4, v0, Lsl1/d$i;->y:Ljava/lang/Object;

    iput-wide v6, v0, Lsl1/d$i;->w:J

    iput v5, v0, Lsl1/d$i;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    :goto_4
    return-object v2

    :cond_b
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
