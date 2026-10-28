.class public final Lui/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lqi/i;

.field public final synthetic F:I

.field public final synthetic G:F

.field public final synthetic H:Lui/o;

.field public final synthetic I:I

.field public final synthetic J:Lp1/c1;

.field public w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lui/b;


# direct methods
.method public constructor <init>(ZZLui/b;Lqi/i;IFLui/o;ILp1/c1;Lq83/d;)V
    .locals 0

    iput-boolean p1, p0, Lui/a;->x:Z

    iput-boolean p2, p0, Lui/a;->y:Z

    iput-object p3, p0, Lui/a;->z:Lui/b;

    iput-object p4, p0, Lui/a;->E:Lqi/i;

    iput p5, p0, Lui/a;->F:I

    iput p6, p0, Lui/a;->G:F

    iput-object p7, p0, Lui/a;->H:Lui/o;

    iput p8, p0, Lui/a;->I:I

    iput-object p9, p0, Lui/a;->J:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    new-instance v0, Lui/a;

    iget v8, p0, Lui/a;->I:I

    iget-object v9, p0, Lui/a;->J:Lp1/c1;

    iget-boolean v1, p0, Lui/a;->x:Z

    iget-boolean v2, p0, Lui/a;->y:Z

    iget-object v3, p0, Lui/a;->z:Lui/b;

    iget-object v4, p0, Lui/a;->E:Lqi/i;

    iget v5, p0, Lui/a;->F:I

    iget v6, p0, Lui/a;->G:F

    iget-object v7, p0, Lui/a;->H:Lui/o;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lui/a;-><init>(ZZLui/b;Lqi/i;IFLui/o;ILp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lui/a;->w:I

    iget-object v1, p0, Lui/a;->J:Lp1/c1;

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    iget-boolean v4, p0, Lui/a;->x:Z

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v4, :cond_9

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lui/a;->y:Z

    if-eqz v0, :cond_9

    iput v3, p0, Lui/a;->w:I

    iget-object v0, p0, Lui/a;->z:Lui/b;

    check-cast v0, Lui/i;

    invoke-virtual {v0}, Lui/i;->e()Lqi/i;

    move-result-object v3

    invoke-virtual {v0}, Lui/i;->d()Lui/o;

    move-result-object v5

    invoke-virtual {v0}, Lui/i;->l()F

    move-result v6

    const/4 v8, 0x0

    cmpg-float v6, v6, v8

    if-gez v6, :cond_3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    if-gez v6, :cond_6

    if-eqz v5, :cond_5

    invoke-virtual {v5, v3}, Lui/o;->a(Lqi/i;)F

    move-result v8

    goto :goto_1

    :cond_5
    :goto_0
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {v5, v3}, Lui/o;->b(Lqi/i;)F

    move-result v8

    :cond_7
    :goto_1
    const/16 v3, 0x9

    const/4 v5, 0x0

    invoke-static {v0, v5, v8, p0, v3}, Lj93/l0;->a0(Lui/b;Lqi/i;FLs83/i;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto :goto_2

    :cond_8
    move-object v0, v10

    :goto_2
    if-ne v0, v9, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    iget-object v0, p0, Lui/a;->z:Lui/b;

    move-object v1, v0

    check-cast v1, Lui/i;

    invoke-virtual {v1}, Lui/i;->k()F

    move-result v5

    iput v2, p0, Lui/a;->w:I

    iget-object v1, p0, Lui/a;->E:Lqi/i;

    iget v2, p0, Lui/a;->F:I

    iget v3, p0, Lui/a;->G:F

    iget-object v4, p0, Lui/a;->H:Lui/o;

    iget v6, p0, Lui/a;->I:I

    const/16 v8, 0x202

    move-object v7, p0

    invoke-static/range {v0 .. v8}, Lj93/l0;->i(Lui/b;Lqi/i;IFLui/o;FILs83/i;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_b

    :goto_4
    return-object v9

    :cond_b
    :goto_5
    return-object v10
.end method
