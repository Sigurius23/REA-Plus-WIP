.class public final Lzq0/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/q;->a(Lzq0/p;Lc93/a;FFLc93/a;Lc93/a;)Lt2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "zq0/q$a",
        "Lt2/a;",
        "Lh2/b;",
        "available",
        "",
        "source",
        "l0",
        "(JI)J",
        "consumed",
        "J",
        "(JJI)J",
        "Ly3/q;",
        "p0",
        "(JLq83/d;)Ljava/lang/Object;",
        "V",
        "(JJLq83/d;)Ljava/lang/Object;",
        "community-everyday-stats_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic w:Lzq0/p;

.field final synthetic x:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic y:F

.field final synthetic z:F


# direct methods
.method public constructor <init>(Lzq0/p;Lc93/a;FFLc93/a;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq0/p;",
            "Lc93/a;",
            "FF",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzq0/q$a;->w:Lzq0/p;

    iput-object p2, p0, Lzq0/q$a;->x:Lc93/a;

    iput p3, p0, Lzq0/q$a;->y:F

    iput p4, p0, Lzq0/q$a;->z:F

    iput-object p5, p0, Lzq0/q$a;->E:Lc93/a;

    iput-object p6, p0, Lzq0/q$a;->F:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(JJI)J
    .locals 6

    const/4 v0, 0x1

    if-ne p5, v0, :cond_2

    iget-object p5, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p5}, Lzq0/p;->f()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_1

    :cond_0
    iget-object p5, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p5}, Lzq0/p;->g()F

    move-result p5

    iget-object v1, p0, Lzq0/q$a;->w:Lzq0/p;

    const/16 v2, 0x20

    shr-long v3, p3, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p3, v4

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    iget-object p4, p0, Lzq0/q$a;->x:Lc93/a;

    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_1

    iget-object p1, p0, Lzq0/q$a;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v3, p3, p4, v0}, Lzq0/p;->l(FFZZ)V

    iget-object p1, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p1}, Lzq0/p;->g()F

    move-result p1

    sub-float/2addr p1, p5

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p4, p1

    shl-long p1, p2, v2

    and-long p3, p4, v4

    or-long/2addr p1, p3

    return-wide p1

    :cond_2
    :goto_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public V(JJLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ly3/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p1}, Lzq0/p;->o()V

    new-instance p1, Ly3/q;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ly3/q;-><init>(J)V

    return-object p1
.end method

.method public l0(JI)J
    .locals 1

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    iget-object p3, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p3}, Lzq0/p;->f()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lzq0/q$a;->w:Lzq0/p;

    iget-object v0, p0, Lzq0/q$a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p3, v0}, Lzq0/p;->d(Z)V

    iget-object p3, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p3, p1, p2}, Lzq0/p;->b(J)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public p0(JLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ly3/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p3}, Lzq0/p;->f()Z

    move-result p3

    const-wide/16 v0, 0x0

    if-eqz p3, :cond_0

    new-instance p1, Ly3/q;

    invoke-direct {p1, v0, v1}, Ly3/q;-><init>(J)V

    return-object p1

    :cond_0
    iget-object v2, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-static {p1, p2}, Ly3/q;->d(J)F

    move-result v3

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v4

    iget-object p3, p0, Lzq0/q$a;->x:Lc93/a;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget v6, p0, Lzq0/q$a;->y:F

    iget v7, p0, Lzq0/q$a;->z:F

    invoke-virtual/range {v2 .. v7}, Lzq0/p;->e(FFZFF)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p3, p0, Lzq0/q$a;->E:Lc93/a;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3

    :cond_1
    iget-object p1, p0, Lzq0/q$a;->w:Lzq0/p;

    invoke-virtual {p1}, Lzq0/p;->t()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lzq0/q$a;->F:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    new-instance p1, Ly3/q;

    invoke-direct {p1, v0, v1}, Ly3/q;-><init>(J)V

    return-object p1
.end method
