.class public final Lg1/y3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lg1/a0;


# direct methods
.method public constructor <init>(Lg1/z3;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p5, p0, Lg1/y3;->a:Z

    new-instance v0, Lg1/a0;

    new-instance v2, Lg1/q0;

    const/4 v1, 0x1

    invoke-direct {v2, v1, p2}, Lg1/q0;-><init>(ILy3/c;)V

    new-instance v3, Lg1/r0;

    invoke-direct {v3, v1, p2}, Lg1/r0;-><init>(ILy3/c;)V

    move-object v1, p1

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lg1/a0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/a;Ld0/l;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lg1/y3;->b:Lg1/a0;

    if-eqz p5, :cond_1

    sget-object p1, Lg1/z3;->y:Lg1/z3;

    if-eq v1, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lg1/y3;Lg1/z3;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg1/y3;->b:Lg1/a0;

    iget-object v0, v0, Lg1/a0;->l:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    iget-object p0, p0, Lg1/y3;->b:Lg1/a0;

    invoke-static {p0, p1, v0, p2}, Lcom/squareup/wire/n;->m(Lg1/a0;Ljava/lang/Object;FLq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lg1/z3;
    .locals 1

    iget-object v0, p0, Lg1/y3;->b:Lg1/a0;

    iget-object v0, v0, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/z3;

    return-object v0
.end method

.method public final c()Lg1/z3;
    .locals 1

    iget-object v0, p0, Lg1/y3;->b:Lg1/a0;

    iget-object v0, v0, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/z3;

    return-object v0
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    invoke-static {p0, v0, p1}, Lg1/y3;->a(Lg1/y3;Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lg1/y3;->b:Lg1/a0;

    iget-object v0, v0, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lg1/z3;->w:Lg1/z3;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lg1/y3;->b:Lg1/a0;

    invoke-virtual {v0}, Lg1/a0;->e()Lg1/k3;

    move-result-object v1

    sget-object v2, Lg1/z3;->x:Lg1/z3;

    iget-object v1, v1, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0}, Lg1/y3;->b()Lg1/z3;

    move-result-object v3

    sget-object v4, Lg1/x3;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {v0}, Lg1/a0;->e()Lg1/k3;

    move-result-object v0

    sget-object v1, Lg1/z3;->y:Lg1/z3;

    iget-object v0, v0, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v2, v1

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lg1/z3;->w:Lg1/z3;

    :cond_2
    :goto_0
    invoke-static {p0, v2, p1}, Lg1/y3;->a(Lg1/y3;Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
