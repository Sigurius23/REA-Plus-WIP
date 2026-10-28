.class public final Lp0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[Lp0/t;

.field public b:Ly3/a;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/compose/foundation/lazy/layout/b;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/w;->h:Landroidx/compose/foundation/lazy/layout/b;

    sget-object p1, Lp0/y;->a:[Lp0/t;

    iput-object p1, p0, Lp0/w;->a:[Lp0/t;

    const/4 p1, 0x1

    iput p1, p0, Lp0/w;->e:I

    return-void
.end method

.method public static k(Lp0/w;Lp0/e0;Lbc3/c0;Li2/f0;II)V
    .locals 8

    iget-object v0, p0, Lp0/w;->h:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lp0/e0;->j(I)J

    move-result-wide v0

    invoke-interface {p1}, Lp0/e0;->e()Z

    move-result v2

    if-nez v2, :cond_0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_0
    long-to-int v0, v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, v0

    goto :goto_1

    :cond_0
    const/16 v2, 0x20

    shr-long/2addr v0, v2

    goto :goto_0

    :goto_1
    invoke-virtual/range {v1 .. v7}, Lp0/w;->j(Lp0/e0;Lbc3/c0;Li2/f0;III)V

    return-void
.end method


# virtual methods
.method public final a()[Lp0/t;
    .locals 1

    iget-object v0, p0, Lp0/w;->a:[Lp0/t;

    return-object v0
.end method

.method public final b()Ly3/a;
    .locals 1

    iget-object v0, p0, Lp0/w;->b:Ly3/a;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lp0/w;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lp0/w;->d:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lp0/w;->g:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lp0/w;->f:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lp0/w;->e:I

    return v0
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lp0/w;->d:I

    return-void
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Lp0/w;->e:I

    return-void
.end method

.method public final j(Lp0/e0;Lbc3/c0;Li2/f0;III)V
    .locals 6

    iget-object v0, p0, Lp0/w;->a:[Lp0/t;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    iget-boolean v4, v4, Lp0/t;->g:Z

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput p4, p0, Lp0/w;->f:I

    iput p5, p0, Lp0/w;->g:I

    :goto_1
    invoke-interface {p1}, Lp0/e0;->b()I

    move-result p4

    iget-object p5, p0, Lp0/w;->a:[Lp0/t;

    array-length p5, p5

    :goto_2
    if-ge p4, p5, :cond_3

    iget-object v0, p0, Lp0/w;->a:[Lp0/t;

    aget-object v0, v0, p4

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lp0/t;->i()V

    :cond_2
    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_3
    iget-object p4, p0, Lp0/w;->a:[Lp0/t;

    array-length p4, p4

    invoke-interface {p1}, Lp0/e0;->b()I

    move-result p5

    if-eq p4, p5, :cond_4

    iget-object p4, p0, Lp0/w;->a:[Lp0/t;

    invoke-interface {p1}, Lp0/e0;->b()I

    move-result p5

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    const-string p5, "copyOf(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, [Lp0/t;

    iput-object p4, p0, Lp0/w;->a:[Lp0/t;

    :cond_4
    invoke-interface {p1}, Lp0/e0;->d()J

    move-result-wide p4

    new-instance v0, Ly3/a;

    invoke-direct {v0, p4, p5}, Ly3/a;-><init>(J)V

    iput-object v0, p0, Lp0/w;->b:Ly3/a;

    iput p6, p0, Lp0/w;->c:I

    invoke-interface {p1}, Lp0/e0;->k()I

    move-result p4

    iput p4, p0, Lp0/w;->d:I

    invoke-interface {p1}, Lp0/e0;->f()I

    move-result p4

    iput p4, p0, Lp0/w;->e:I

    invoke-interface {p1}, Lp0/e0;->b()I

    move-result p4

    :goto_3
    if-ge v2, p4, :cond_8

    invoke-interface {p1, v2}, Lp0/e0;->h(I)Ljava/lang/Object;

    move-result-object p5

    invoke-static {p5}, Lp0/y;->h(Ljava/lang/Object;)Lp0/j;

    move-result-object p5

    if-nez p5, :cond_6

    iget-object p5, p0, Lp0/w;->a:[Lp0/t;

    aget-object p5, p5, v2

    if-eqz p5, :cond_5

    invoke-virtual {p5}, Lp0/t;->i()V

    :cond_5
    iget-object p5, p0, Lp0/w;->a:[Lp0/t;

    const/4 p6, 0x0

    aput-object p6, p5, v2

    goto :goto_4

    :cond_6
    iget-object p6, p0, Lp0/w;->a:[Lp0/t;

    aget-object p6, p6, v2

    if-nez p6, :cond_7

    new-instance p6, Lp0/t;

    new-instance v0, Lnr0/e;

    const/16 v1, 0x17

    iget-object v3, p0, Lp0/w;->h:Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {v0, v3, v1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p6, p2, p3, v0}, Lp0/t;-><init>(Lbc3/c0;Li2/f0;Lnr0/e;)V

    iget-object v0, p0, Lp0/w;->a:[Lp0/t;

    aput-object p6, v0, v2

    :cond_7
    iget-object v0, p5, Lp0/j;->O:Ld0/c0;

    iput-object v0, p6, Lp0/t;->d:Ld0/c0;

    iget-object v0, p5, Lp0/j;->P:Ld0/i1;

    iput-object v0, p6, Lp0/t;->e:Ld0/c0;

    iget-object p5, p5, Lp0/j;->Q:Ld0/c0;

    iput-object p5, p6, Lp0/t;->f:Ld0/c0;

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method
