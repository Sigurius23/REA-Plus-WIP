.class public final Lf0/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lj0/i;

.field public final synthetic G:Lf0/h;

.field public w:Z

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lh0/h2;


# direct methods
.method public constructor <init>(Lh0/h2;JLj0/i;Lf0/h;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lf0/d;->z:Lh0/h2;

    iput-wide p2, p0, Lf0/d;->E:J

    iput-object p4, p0, Lf0/d;->F:Lj0/i;

    iput-object p5, p0, Lf0/d;->G:Lf0/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lf0/d;

    iget-object v4, p0, Lf0/d;->F:Lj0/i;

    iget-object v5, p0, Lf0/d;->G:Lf0/h;

    iget-object v1, p0, Lf0/d;->z:Lh0/h2;

    iget-wide v2, p0, Lf0/d;->E:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lf0/d;-><init>(Lh0/h2;JLj0/i;Lf0/h;Lq83/d;)V

    iput-object p1, v0, Lf0/d;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf0/d;->x:I

    iget-object v4, v0, Lf0/d;->G:Lf0/h;

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const/4 v14, 0x1

    iget-object v15, v0, Lf0/d;->F:Lj0/i;

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v14, :cond_4

    if-eq v2, v13, :cond_3

    if-eq v2, v12, :cond_2

    if-eq v2, v11, :cond_1

    if-ne v2, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v3

    goto/16 :goto_6

    :cond_2
    iget-object v2, v0, Lf0/d;->y:Ljava/lang/Object;

    check-cast v2, Lj0/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v3

    goto/16 :goto_3

    :cond_3
    iget-boolean v2, v0, Lf0/d;->w:Z

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v3

    goto :goto_2

    :cond_4
    iget-object v2, v0, Lf0/d;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/k1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v3

    move-object/from16 v3, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lf0/d;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    move-object v5, v3

    new-instance v3, Lf0/c;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v5

    iget-wide v5, v0, Lf0/d;->E:J

    move-object/from16 v16, v7

    iget-object v7, v0, Lf0/d;->F:Lj0/i;

    move-object/from16 v10, v16

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v10, v10, v3, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v0, Lf0/d;->y:Ljava/lang/Object;

    iput v14, v0, Lf0/d;->x:I

    iget-object v3, v0, Lf0/d;->z:Lh0/h2;

    invoke-virtual {v3, v0}, Lh0/h2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v2}, Lbc3/k1;->isActive()Z

    move-result v5

    if-eqz v5, :cond_9

    iput-object v10, v0, Lf0/d;->y:Ljava/lang/Object;

    iput-boolean v3, v0, Lf0/d;->w:Z

    iput v13, v0, Lf0/d;->x:I

    invoke-static {v2, v0}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_5

    :cond_7
    move v2, v3

    :goto_2
    if-eqz v2, :cond_b

    new-instance v2, Lj0/l;

    iget-wide v5, v0, Lf0/d;->E:J

    invoke-direct {v2, v5, v6}, Lj0/l;-><init>(J)V

    new-instance v3, Lj0/m;

    invoke-direct {v3, v2}, Lj0/m;-><init>(Lj0/l;)V

    iput-object v3, v0, Lf0/d;->y:Ljava/lang/Object;

    iput v12, v0, Lf0/d;->x:I

    move-object v5, v15

    check-cast v5, Lj0/j;

    invoke-virtual {v5, v2, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_5

    :cond_8
    move-object v2, v3

    :goto_3
    iput-object v10, v0, Lf0/d;->y:Ljava/lang/Object;

    iput v11, v0, Lf0/d;->x:I

    check-cast v15, Lj0/j;

    invoke-virtual {v15, v2, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    goto :goto_5

    :cond_9
    iget-object v2, v4, Lf0/h;->b0:Lj0/l;

    if-eqz v2, :cond_b

    if-eqz v3, :cond_a

    new-instance v3, Lj0/m;

    invoke-direct {v3, v2}, Lj0/m;-><init>(Lj0/l;)V

    goto :goto_4

    :cond_a
    new-instance v3, Lj0/k;

    invoke-direct {v3, v2}, Lj0/k;-><init>(Lj0/l;)V

    :goto_4
    iput-object v10, v0, Lf0/d;->y:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Lf0/d;->x:I

    check-cast v15, Lj0/j;

    invoke-virtual {v15, v3, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    :goto_5
    return-object v1

    :cond_b
    :goto_6
    iput-object v10, v4, Lf0/h;->b0:Lj0/l;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
