.class public final Lu0/j1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lj0/i;

.field public w:I

.field public synthetic x:Lh0/h2;

.field public synthetic y:J

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lp1/c1;Lj0/i;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lu0/j1;->z:Lbc3/c0;

    iput-object p2, p0, Lu0/j1;->E:Lp1/c1;

    iput-object p3, p0, Lu0/j1;->F:Lj0/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lh0/h2;

    check-cast p2, Lh2/b;

    iget-wide v0, p2, Lh2/b;->a:J

    check-cast p3, Lq83/d;

    new-instance p2, Lu0/j1;

    iget-object v2, p0, Lu0/j1;->E:Lp1/c1;

    iget-object v3, p0, Lu0/j1;->F:Lj0/i;

    iget-object v4, p0, Lu0/j1;->z:Lbc3/c0;

    invoke-direct {p2, v4, v2, v3, p3}, Lu0/j1;-><init>(Lbc3/c0;Lp1/c1;Lj0/i;Lq83/d;)V

    iput-object p1, p2, Lu0/j1;->x:Lh0/h2;

    iput-wide v0, p2, Lu0/j1;->y:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lu0/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lu0/j1;->w:I

    const/4 v3, 0x3

    iget-object v4, v0, Lu0/j1;->z:Lbc3/c0;

    const/4 v9, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lu0/j1;->x:Lh0/h2;

    iget-wide v12, v0, Lu0/j1;->y:J

    new-instance v10, Lf0/c;

    const/4 v15, 0x0

    const/16 v16, 0x7

    iget-object v11, v0, Lu0/j1;->E:Lp1/c1;

    iget-object v14, v0, Lu0/j1;->F:Lj0/i;

    invoke-direct/range {v10 .. v16}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    invoke-static {v4, v9, v9, v10, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput v5, v0, Lu0/j1;->w:I

    invoke-virtual {v2, v0}, Lh0/h2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    new-instance v5, La30/u;

    iget-object v8, v0, Lu0/j1;->F:Lj0/i;

    const/4 v10, 0x6

    iget-object v6, v0, Lu0/j1;->E:Lp1/c1;

    invoke-direct/range {v5 .. v10}, La30/u;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    invoke-static {v4, v9, v9, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
