.class public final Lt9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Lt9/q;

.field public g:Lt9/k0;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt9/g0;->a:I

    iput p2, p0, Lt9/g0;->b:I

    iput-object p3, p0, Lt9/g0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 0

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Lt9/g0;->e:I

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p2, p0, Lt9/g0;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lt9/g0;->d:I

    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 3

    iput-object p1, p0, Lt9/g0;->f:Lt9/q;

    const/16 v0, 0x400

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    iput-object p1, p0, Lt9/g0;->g:Lt9/k0;

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    iget-object v1, p0, Lt9/g0;->c:Ljava/lang/String;

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lu8/o;->l:Ljava/lang/String;

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lu8/o;->m:Ljava/lang/String;

    invoke-static {v0, p1}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    iget-object p1, p0, Lt9/g0;->f:Lt9/q;

    invoke-interface {p1}, Lt9/q;->l()V

    iget-object p1, p0, Lt9/g0;->f:Lt9/q;

    new-instance v0, Lt9/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Lt9/q;->v(Lt9/e0;)V

    const/4 p1, 0x1

    iput p1, p0, Lt9/g0;->e:I

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lt9/g0;->b:I

    iget v3, p0, Lt9/g0;->a:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    if-eq v2, v4, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-static {v4}, Lva3/g;->i(Z)V

    new-instance v4, Lx8/n;

    invoke-direct {v4, v2}, Lx8/n;-><init>(I)V

    iget-object v5, v4, Lx8/n;->a:[B

    check-cast p1, Lt9/k;

    invoke-virtual {p1, v5, v1, v2, v1}, Lt9/k;->c([BIIZ)Z

    invoke-virtual {v4}, Lx8/n;->z()I

    move-result p1

    if-ne p1, v3, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 9

    iget p2, p0, Lt9/g0;->e:I

    const/4 v0, -0x1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    if-ne p2, v1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object p2, p0, Lt9/g0;->g:Lt9/k0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x400

    invoke-interface {p2, p1, v3, v2}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result p1

    const/4 p2, 0x0

    if-ne p1, v0, :cond_2

    iput v1, p0, Lt9/g0;->e:I

    iget-object v2, p0, Lt9/g0;->g:Lt9/k0;

    iget v6, p0, Lt9/g0;->d:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    invoke-interface/range {v2 .. v8}, Lt9/k0;->b(JIIILt9/j0;)V

    iput p2, p0, Lt9/g0;->d:I

    return p2

    :cond_2
    iget v0, p0, Lt9/g0;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lt9/g0;->d:I

    return p2
.end method

.method public final release()V
    .locals 0

    return-void
.end method
