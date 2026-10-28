.class public final Lgb/y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:F

.field public final synthetic y:Ld0/f1;

.field public final synthetic z:Leb/q;


# direct methods
.method public constructor <init>(FLd0/f1;Leb/q;Lq83/d;)V
    .locals 0

    iput p1, p0, Lgb/y;->x:F

    iput-object p2, p0, Lgb/y;->y:Ld0/f1;

    iput-object p3, p0, Lgb/y;->z:Leb/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Lgb/y;

    iget-object v0, p0, Lgb/y;->y:Ld0/f1;

    iget-object v1, p0, Lgb/y;->z:Leb/q;

    iget v2, p0, Lgb/y;->x:F

    invoke-direct {p1, v2, v0, v1, p2}, Lgb/y;-><init>(FLd0/f1;Leb/q;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgb/y;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgb/y;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgb/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgb/y;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lgb/y;->y:Ld0/f1;

    const/4 v4, 0x0

    iget v5, p0, Lgb/y;->x:F

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v7, :cond_1

    if-ne v1, v6, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    cmpl-float p1, v5, v4

    if-lez p1, :cond_3

    iput v7, p0, Lgb/y;->w:I

    iget-object p1, v3, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v5, p1, p0}, Ld0/f1;->O0(FLjava/lang/Object;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    cmpg-float p1, v5, v4

    if-nez p1, :cond_7

    iput v6, p0, Lgb/y;->w:I

    iget-object p1, v3, Ld0/f1;->F:Ld0/z1;

    if-nez p1, :cond_5

    :cond_4
    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_5
    iget-object v1, v3, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Lgb/y;->z:Leb/q;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v3, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    iget-object v1, v3, Ld0/f1;->L:Ld0/t0;

    new-instance v5, Ld0/z0;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, p1, v6}, Ld0/z0;-><init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V

    invoke-static {v1, v5, p0}, Ld0/t0;->a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_2
    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    return-object v2
.end method
