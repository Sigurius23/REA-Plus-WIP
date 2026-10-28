.class public final Ld0/b1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ld0/f1;

.field public final synthetic F:Ld0/z1;

.field public final synthetic G:F

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V
    .locals 0

    iput-object p1, p0, Ld0/b1;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld0/b1;->z:Ljava/lang/Object;

    iput-object p3, p0, Ld0/b1;->E:Ld0/f1;

    iput-object p4, p0, Ld0/b1;->F:Ld0/z1;

    iput p5, p0, Ld0/b1;->G:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Ld0/b1;

    iget-object v4, p0, Ld0/b1;->F:Ld0/z1;

    iget v5, p0, Ld0/b1;->G:F

    iget-object v1, p0, Ld0/b1;->y:Ljava/lang/Object;

    iget-object v2, p0, Ld0/b1;->z:Ljava/lang/Object;

    iget-object v3, p0, Ld0/b1;->E:Ld0/f1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ld0/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V

    iput-object p1, v0, Ld0/b1;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld0/b1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/b1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld0/b1;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    iget-object v4, p0, Ld0/b1;->E:Ld0/f1;

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/b1;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v1, p0, Ld0/b1;->y:Ljava/lang/Object;

    iget-object v5, p0, Ld0/b1;->z:Ljava/lang/Object;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    invoke-static {v4}, Ld0/f1;->H0(Ld0/f1;)V

    goto :goto_0

    :cond_2
    iput-object v7, v4, Ld0/f1;->O:Ld0/y0;

    iget-object v6, v4, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    return-object v2

    :cond_3
    :goto_0
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    iget v6, p0, Ld0/b1;->G:F

    if-nez v5, :cond_4

    iget-object v5, p0, Ld0/b1;->F:Ld0/z1;

    invoke-virtual {v5, v1}, Ld0/z1;->p(Ljava/lang/Object;)V

    const-wide/16 v8, 0x0

    invoke-virtual {v5, v8, v9}, Ld0/z1;->n(J)V

    iget-object v8, v4, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v8, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Ld0/z1;->j(F)V

    :cond_4
    invoke-virtual {v4, v6}, Ld0/f1;->Q0(F)V

    iget-object v1, v4, Ld0/f1;->N:La0/q0;

    invoke-virtual {v1}, La0/q0;->h()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, La20/b;

    const/16 v5, 0xc

    invoke-direct {v1, v4, v7, v5}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v5, 0x3

    invoke-static {p1, v7, v7, v1, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_5
    const-wide/high16 v5, -0x8000000000000000L

    iput-wide v5, v4, Ld0/f1;->M:J

    :goto_1
    iput v3, p0, Ld0/b1;->w:I

    invoke-static {v4, p0}, Ld0/f1;->K0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    invoke-virtual {v4}, Ld0/f1;->P0()V

    return-object v2
.end method
