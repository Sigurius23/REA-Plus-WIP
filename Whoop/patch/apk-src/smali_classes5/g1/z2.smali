.class public final Lg1/z2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public final e:Ld0/e;

.field public f:Lj0/h;

.field public g:Lj0/h;


# direct methods
.method public constructor <init>(FFFF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/z2;->a:F

    iput p2, p0, Lg1/z2;->b:F

    iput p3, p0, Lg1/z2;->c:F

    iput p4, p0, Lg1/z2;->d:F

    new-instance p2, Ld0/e;

    new-instance p3, Ly3/f;

    invoke-direct {p3, p1}, Ly3/f;-><init>(F)V

    sget-object p1, Ld0/f;->k:Ld0/f2;

    const/4 p4, 0x0

    const/16 v0, 0xc

    invoke-direct {p2, p3, p1, p4, v0}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object p2, p0, Lg1/z2;->e:Ld0/e;

    return-void
.end method


# virtual methods
.method public final a(Lj0/h;Ls83/c;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lg1/z2;->e:Ld0/e;

    instance-of v1, p2, Lg1/x2;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lg1/x2;

    iget v2, v1, Lg1/x2;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lg1/x2;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lg1/x2;

    invoke-direct {v1, p0, p2}, Lg1/x2;-><init>(Lg1/z2;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lg1/x2;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg1/x2;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lg1/x2;->w:Lj0/h;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lj0/l;

    if-eqz p2, :cond_3

    iget p2, p0, Lg1/z2;->b:F

    goto :goto_1

    :cond_3
    instance-of p2, p1, Lj0/f;

    if-eqz p2, :cond_4

    iget p2, p0, Lg1/z2;->c:F

    goto :goto_1

    :cond_4
    instance-of p2, p1, Lj0/d;

    if-eqz p2, :cond_5

    iget p2, p0, Lg1/z2;->d:F

    goto :goto_1

    :cond_5
    iget p2, p0, Lg1/z2;->a:F

    :goto_1
    iput-object p1, p0, Lg1/z2;->g:Lj0/h;

    :try_start_1
    iget-object v3, v0, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/f;

    iget v3, v3, Ly3/f;->w:F

    invoke-static {v3, p2}, Ly3/f;->b(FF)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, Lg1/z2;->f:Lj0/h;

    iput-object p1, v1, Lg1/x2;->w:Lj0/h;

    iput v4, v1, Lg1/x2;->z:I

    invoke-static {v0, p2, v3, p1, v1}, Lg1/t2;->a(Ld0/e;FLj0/h;Lj0/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p2, v2, :cond_6

    return-object v2

    :cond_6
    :goto_2
    iput-object p1, p0, Lg1/z2;->f:Lj0/h;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    iput-object p1, p0, Lg1/z2;->f:Lj0/h;

    throw p2
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lg1/y2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lg1/y2;

    iget v1, v0, Lg1/y2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/y2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/y2;

    invoke-direct {v0, p0, p1}, Lg1/y2;-><init>(Lg1/z2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lg1/y2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/y2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/z2;->g:Lj0/h;

    instance-of v2, p1, Lj0/l;

    if-eqz v2, :cond_3

    iget p1, p0, Lg1/z2;->b:F

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lj0/f;

    if-eqz v2, :cond_4

    iget p1, p0, Lg1/z2;->c:F

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lj0/d;

    if-eqz p1, :cond_5

    iget p1, p0, Lg1/z2;->d:F

    goto :goto_1

    :cond_5
    iget p1, p0, Lg1/z2;->a:F

    :goto_1
    iget-object v2, p0, Lg1/z2;->e:Ld0/e;

    iget-object v4, v2, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/f;

    iget v4, v4, Ly3/f;->w:F

    invoke-static {v4, p1}, Ly3/f;->b(FF)Z

    move-result v4

    if-nez v4, :cond_7

    :try_start_1
    new-instance v4, Ly3/f;

    invoke-direct {v4, p1}, Ly3/f;-><init>(F)V

    iput v3, v0, Lg1/y2;->y:I

    invoke-virtual {v2, v4, v0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    iget-object p1, p0, Lg1/z2;->g:Lj0/h;

    iput-object p1, p0, Lg1/z2;->f:Lj0/h;

    goto :goto_4

    :goto_3
    iget-object v0, p0, Lg1/z2;->g:Lj0/h;

    iput-object v0, p0, Lg1/z2;->f:Lj0/h;

    throw p1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
