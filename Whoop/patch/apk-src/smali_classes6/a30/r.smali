.class public final La30/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:La30/a0;

.field public final synthetic F:Lbc3/j0;

.field public final synthetic G:Lbc3/j0;

.field public final synthetic H:Lbc3/j0;

.field public final synthetic I:Z

.field public final synthetic J:Lmy/a;

.field public w:La30/a0;

.field public x:Lbc3/i0;

.field public y:Lv00/c0;

.field public z:I


# direct methods
.method public constructor <init>(La30/a0;Lbc3/j0;Lbc3/j0;Lbc3/j0;ZLmy/a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La30/r;->E:La30/a0;

    iput-object p2, p0, La30/r;->F:Lbc3/j0;

    iput-object p3, p0, La30/r;->G:Lbc3/j0;

    iput-object p4, p0, La30/r;->H:Lbc3/j0;

    iput-boolean p5, p0, La30/r;->I:Z

    iput-object p6, p0, La30/r;->J:Lmy/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, La30/r;

    iget-boolean v5, p0, La30/r;->I:Z

    iget-object v6, p0, La30/r;->J:Lmy/a;

    iget-object v1, p0, La30/r;->E:La30/a0;

    iget-object v2, p0, La30/r;->F:Lbc3/j0;

    iget-object v3, p0, La30/r;->G:Lbc3/j0;

    iget-object v4, p0, La30/r;->H:Lbc3/j0;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, La30/r;-><init>(La30/a0;Lbc3/j0;Lbc3/j0;Lbc3/j0;ZLmy/a;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La30/r;->z:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, La30/r;->y:Lv00/c0;

    iget-object v3, p0, La30/r;->x:Lbc3/i0;

    iget-object v4, p0, La30/r;->w:La30/a0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, La30/r;->x:Lbc3/i0;

    iget-object v4, p0, La30/r;->w:La30/a0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La30/r;->E:La30/a0;

    iput-object p1, p0, La30/r;->w:La30/a0;

    iget-object v1, p0, La30/r;->F:Lbc3/j0;

    iput-object v1, p0, La30/r;->x:Lbc3/i0;

    iput v4, p0, La30/r;->z:I

    iget-object v4, p0, La30/r;->G:Lbc3/j0;

    invoke-virtual {v4, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v10, v4

    move-object v4, p1

    move-object p1, v10

    :goto_0
    check-cast p1, Lv00/c0;

    iput-object v4, p0, La30/r;->w:La30/a0;

    iput-object v1, p0, La30/r;->x:Lbc3/i0;

    iput-object p1, p0, La30/r;->y:Lv00/c0;

    iput v3, p0, La30/r;->z:I

    iget-object v3, p0, La30/r;->H:Lbc3/j0;

    invoke-virtual {v3, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v5, p1

    move-object p1, v3

    move-object v3, v4

    move-object v4, v1

    :goto_1
    move-object v6, p1

    check-cast v6, La30/a;

    iget-object p1, p0, La30/r;->J:Lmy/a;

    iget-object p1, p1, Lmy/a;->U:Lh20/q3;

    if-eqz p1, :cond_6

    iget-boolean p1, p1, Lh20/q3;->w:Z

    :goto_2
    move v8, p1

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const/4 p1, 0x0

    iput-object p1, p0, La30/r;->w:La30/a0;

    iput-object p1, p0, La30/r;->x:Lbc3/i0;

    iput-object p1, p0, La30/r;->y:Lv00/c0;

    iput v2, p0, La30/r;->z:I

    iget-boolean v7, p0, La30/r;->I:Z

    move-object v9, p0

    invoke-static/range {v3 .. v9}, La30/a0;->e(La30/a0;Lbc3/i0;Lv00/c0;La30/a;ZZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    return-object p1
.end method
