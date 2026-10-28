.class public final Ld0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld0/f2;

.field public final b:Ljava/lang/Object;

.field public final c:Ld0/m;

.field public final d:Lp1/k1;

.field public final e:Lp1/k1;

.field public final f:Ld0/t0;

.field public final g:Ld0/i1;

.field public final h:Ld0/r;

.field public final i:Ld0/r;

.field public final j:Ld0/r;

.field public final k:Ld0/r;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Ld0/e;->a:Ld0/f2;

    .line 3
    iput-object p3, p0, Ld0/e;->b:Ljava/lang/Object;

    .line 4
    new-instance v0, Ld0/m;

    const/4 v1, 0x0

    const/16 v2, 0x3c

    invoke-direct {v0, p2, p1, v1, v2}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;I)V

    iput-object v0, p0, Ld0/e;->c:Ld0/m;

    .line 5
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ld0/e;->d:Lp1/k1;

    .line 6
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/e;->e:Lp1/k1;

    .line 7
    new-instance p1, Ld0/t0;

    invoke-direct {p1}, Ld0/t0;-><init>()V

    iput-object p1, p0, Ld0/e;->f:Ld0/t0;

    .line 8
    new-instance p1, Ld0/i1;

    const/4 p2, 0x3

    invoke-direct {p1, p3, p2}, Ld0/i1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld0/e;->g:Ld0/i1;

    .line 9
    iget-object p1, v0, Ld0/m;->y:Ld0/r;

    .line 10
    instance-of p2, p1, Ld0/n;

    if-eqz p2, :cond_0

    sget-object p3, Ld0/f;->e:Ld0/n;

    goto :goto_0

    .line 11
    :cond_0
    instance-of p3, p1, Ld0/o;

    if-eqz p3, :cond_1

    sget-object p3, Ld0/f;->f:Ld0/o;

    goto :goto_0

    .line 12
    :cond_1
    instance-of p3, p1, Ld0/p;

    if-eqz p3, :cond_2

    sget-object p3, Ld0/f;->g:Ld0/p;

    goto :goto_0

    .line 13
    :cond_2
    sget-object p3, Ld0/f;->h:Ld0/q;

    .line 14
    :goto_0
    iput-object p3, p0, Ld0/e;->h:Ld0/r;

    if-eqz p2, :cond_3

    .line 15
    sget-object p1, Ld0/f;->a:Ld0/n;

    goto :goto_1

    .line 16
    :cond_3
    instance-of p2, p1, Ld0/o;

    if-eqz p2, :cond_4

    sget-object p1, Ld0/f;->b:Ld0/o;

    goto :goto_1

    .line 17
    :cond_4
    instance-of p1, p1, Ld0/p;

    if-eqz p1, :cond_5

    sget-object p1, Ld0/f;->c:Ld0/p;

    goto :goto_1

    .line 18
    :cond_5
    sget-object p1, Ld0/f;->d:Ld0/q;

    .line 19
    :goto_1
    iput-object p1, p0, Ld0/e;->i:Ld0/r;

    .line 20
    iput-object p3, p0, Ld0/e;->j:Ld0/r;

    .line 21
    iput-object p1, p0, Ld0/e;->k:Ld0/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 22
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;)V

    return-void
.end method

.method public static final a(Ld0/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ld0/e;->a:Ld0/f2;

    iget-object v1, p0, Ld0/e;->k:Ld0/r;

    iget-object v2, p0, Ld0/e;->j:Ld0/r;

    iget-object v3, p0, Ld0/e;->h:Ld0/r;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p0, p0, Ld0/e;->i:Ld0/r;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p0, v0, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld0/r;

    invoke-virtual {p0}, Ld0/r;->b()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_3

    invoke-virtual {p0, v4}, Ld0/r;->a(I)F

    move-result v6

    invoke-virtual {v2, v4}, Ld0/r;->a(I)F

    move-result v7

    cmpg-float v6, v6, v7

    if-ltz v6, :cond_1

    invoke-virtual {p0, v4}, Ld0/r;->a(I)F

    move-result v6

    invoke-virtual {v1, v4}, Ld0/r;->a(I)F

    move-result v7

    cmpl-float v6, v6, v7

    if-lez v6, :cond_2

    :cond_1
    invoke-virtual {p0, v4}, Ld0/r;->a(I)F

    move-result v5

    invoke-virtual {v2, v4}, Ld0/r;->a(I)F

    move-result v6

    invoke-virtual {v1, v4}, Ld0/r;->a(I)F

    move-result v7

    invoke-static {v5, v6, v7}, Le93/b;->m(FFF)F

    move-result v5

    invoke-virtual {p0, v5, v4}, Ld0/r;->e(FI)V

    const/4 v5, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-eqz v5, :cond_4

    iget-object p1, v0, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    return-object p1
.end method

.method public static final b(Ld0/e;)V
    .locals 3

    iget-object v0, p0, Ld0/e;->c:Ld0/m;

    iget-object v1, v0, Ld0/m;->y:Ld0/r;

    invoke-virtual {v1}, Ld0/r;->d()V

    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, v0, Ld0/m;->z:J

    iget-object p0, p0, Ld0/e;->d:Lp1/k1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;
    .locals 6

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    iget-object p2, p0, Ld0/e;->g:Ld0/i1;

    :cond_0
    move-object v2, p2

    iget-object p2, p0, Ld0/e;->a:Ld0/f2;

    iget-object p2, p2, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ld0/e;->c:Ld0/m;

    iget-object v0, v0, Ld0/m;->y:Ld0/r;

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    and-int/lit8 p2, p5, 0x8

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Ld0/e;->c(Ljava/lang/Object;Ld0/l;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ld0/l;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v5

    new-instance v2, Ld0/p1;

    iget-object v4, p0, Ld0/e;->a:Ld0/f2;

    iget-object v0, v4, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ld0/r;

    move-object v6, p1

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    iget-object v0, p0, Ld0/e;->c:Ld0/m;

    iget-wide v4, v0, Ld0/m;->z:J

    new-instance v0, Ld0/b;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v6, p4

    move-object v3, v2

    move-object v2, p3

    invoke-direct/range {v0 .. v7}, Ld0/b;-><init>(Ld0/e;Ljava/lang/Object;Ld0/p1;JLkotlin/jvm/functions/Function1;Lq83/d;)V

    iget-object v2, p0, Ld0/e;->f:Ld0/t0;

    invoke-static {v2, v0, p5}, Ld0/t0;->a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/e;->c:Ld0/m;

    iget-object v0, v0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Ld0/e;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ld0/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ld0/c;-><init>(Ld0/e;Ljava/lang/Object;Lq83/d;)V

    iget-object p1, p0, Ld0/e;->f:Ld0/t0;

    invoke-static {p1, v0, p2}, Ld0/t0;->a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final h(Ls83/i;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ld0/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iget-object v1, p0, Ld0/e;->f:Ld0/t0;

    invoke-static {v1, v0, p1}, Ld0/t0;->a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
