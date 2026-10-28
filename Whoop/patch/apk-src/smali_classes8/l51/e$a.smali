.class public final Ll51/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll51/e;->a(Ln0/u;Lp1/a1;I)Lt2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "l51/e$a",
        "Lt2/a;",
        "Lh2/b;",
        "available",
        "",
        "source",
        "l0",
        "(JI)J",
        "Ly3/q;",
        "p0",
        "(JLq83/d;)Ljava/lang/Object;",
        "design_release"
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
.field final synthetic w:Ln0/u;

.field final synthetic x:I

.field final synthetic y:Lp1/a1;


# direct methods
.method public constructor <init>(Ln0/u;ILp1/a1;)V
    .locals 0

    iput-object p1, p0, Ll51/e$a;->w:Ln0/u;

    iput p2, p0, Ll51/e$a;->x:I

    iput-object p3, p0, Ll51/e$a;->y:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge J(JJI)J
    .locals 0

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

    new-instance p1, Ly3/q;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ly3/q;-><init>(J)V

    return-object p1
.end method

.method public l0(JI)J
    .locals 7

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object p2, p0, Ll51/e$a;->w:Ln0/u;

    invoke-virtual {p2}, Ln0/u;->c()Z

    move-result p2

    const/4 p3, 0x0

    cmpg-float v2, p1, p3

    const/16 v3, 0x20

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    if-gez v2, :cond_2

    neg-float p1, p1

    float-to-int p1, p1

    iget p2, p0, Ll51/e$a;->x:I

    iget-object v2, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    move v4, p1

    :goto_0
    if-lez v4, :cond_1

    iget-object p1, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p2

    add-int/2addr p2, v4

    invoke-virtual {p1, p2}, Lp1/h1;->y(I)V

    int-to-float p1, v4

    neg-float p1, p1

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    :goto_1
    int-to-long v4, p1

    shl-long p1, p2, v3

    and-long/2addr v0, v4

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    return-wide v5

    :cond_2
    cmpl-float v2, p1, p3

    if-lez v2, :cond_4

    if-nez p2, :cond_4

    iget-object p2, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    if-lez p2, :cond_4

    float-to-int p1, p1

    iget-object p2, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_3

    goto :goto_2

    :cond_3
    move v4, p1

    :goto_2
    if-lez v4, :cond_4

    iget-object p1, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p2

    sub-int/2addr p2, v4

    invoke-virtual {p1, p2}, Lp1/h1;->y(I)V

    int-to-float p1, v4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    goto :goto_1

    :cond_4
    return-wide v5
.end method

.method public p0(JLq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object p3, p0, Ll51/e$a;->w:Ln0/u;

    invoke-virtual {p3}, Ln0/u;->c()Z

    move-result p3

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    iget v2, p0, Ll51/e$a;->x:I

    if-ge v0, v2, :cond_0

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p1

    invoke-static {v1, p1}, Ls4/i;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    if-nez p3, :cond_1

    iget-object p3, p0, Ll51/e$a;->y:Lp1/a1;

    check-cast p3, Lp1/h1;

    invoke-virtual {p3}, Lp1/h1;->x()I

    move-result p3

    if-lez p3, :cond_1

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p1

    invoke-static {v1, p1}, Ls4/i;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    const-wide/16 p1, 0x0

    :goto_0
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method
