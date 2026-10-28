.class public final Lis0/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/n0;->a(Lc93/a;Lis0/m0;Lh0/p3;)Lt2/a;
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
        "is0/n0$a",
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
        "community-reactions-arch-mini_release"
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
.field final synthetic w:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic x:Lis0/m0;

.field final synthetic y:Lh0/p3;


# direct methods
.method public constructor <init>(Lc93/a;Lis0/m0;Lh0/p3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lis0/m0;",
            "Lh0/p3;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lis0/n0$a;->w:Lc93/a;

    iput-object p2, p0, Lis0/n0$a;->x:Lis0/m0;

    iput-object p3, p0, Lis0/n0$a;->y:Lh0/p3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(JJI)J
    .locals 2

    const/4 p1, 0x1

    const-wide/16 v0, 0x0

    if-ne p5, p1, :cond_0

    const-wide p1, 0xffffffffL

    and-long/2addr p3, p1

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    const/4 p4, 0x0

    cmpl-float p5, p3, p4

    if-lez p5, :cond_0

    iget-object p5, p0, Lis0/n0$a;->x:Lis0/m0;

    invoke-virtual {p5, p3}, Lis0/m0;->e(F)F

    move-result p3

    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p4

    int-to-long p4, p4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v0, p3

    const/16 p3, 0x20

    shl-long p3, p4, p3

    and-long/2addr p1, v0

    or-long/2addr p1, p3

    return-wide p1

    :cond_0
    return-wide v0
.end method

.method public V(JJLq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p5, Lis0/n0$a$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lis0/n0$a$a;

    iget v1, v0, Lis0/n0$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lis0/n0$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lis0/n0$a$a;

    invoke-direct {v0, p0, p5}, Lis0/n0$a$a;-><init>(Lis0/n0$a;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lis0/n0$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lis0/n0$a$a;->E:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget-wide p3, v0, Lis0/n0$a$a;->x:J

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result p5

    cmpl-float p5, p5, v5

    if-gtz p5, :cond_4

    iget-object p5, p0, Lis0/n0$a;->x:Lis0/m0;

    invoke-virtual {p5}, Lis0/m0;->m()Z

    move-result p5

    if-eqz p5, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ly3/q;

    invoke-direct {p1, v3, v4}, Ly3/q;-><init>(J)V

    return-object p1

    :cond_4
    :goto_1
    iget-object p5, p0, Lis0/n0$a;->x:Lis0/m0;

    iget-object v2, p0, Lis0/n0$a;->y:Lh0/p3;

    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result v7

    iput-wide p1, v0, Lis0/n0$a$a;->w:J

    iput-wide p3, v0, Lis0/n0$a$a;->x:J

    iput v6, v0, Lis0/n0$a$a;->E:I

    invoke-virtual {p5, v2, v7, v0}, Lis0/m0;->n(Lh0/p3;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result p1

    cmpl-float p1, p1, v5

    if-lez p1, :cond_6

    move-wide v3, p3

    :cond_6
    new-instance p1, Ly3/q;

    invoke-direct {p1, v3, v4}, Ly3/q;-><init>(J)V

    return-object p1
.end method

.method public l0(JI)J
    .locals 5

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    if-ne p3, v0, :cond_1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p3, p1, p2

    if-lez p3, :cond_0

    iget-object p3, p0, Lis0/n0$a;->w:Lc93/a;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lis0/n0$a;->x:Lis0/m0;

    invoke-virtual {p3}, Lis0/m0;->l()Z

    move-result p3

    :goto_0
    if-eqz p3, :cond_1

    iget-object p3, p0, Lis0/n0$a;->x:Lis0/m0;

    invoke-virtual {p3, p1}, Lis0/m0;->e(F)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long p1, p2, p1

    and-long/2addr v0, v3

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    return-wide v1
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

    instance-of v0, p3, Lis0/n0$a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lis0/n0$a$b;

    iget v1, v0, Lis0/n0$a$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lis0/n0$a$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lis0/n0$a$b;

    invoke-direct {v0, p0, p3}, Lis0/n0$a$b;-><init>(Lis0/n0$a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lis0/n0$a$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lis0/n0$a$b;->E:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget p1, v0, Lis0/n0$a$b;->x:I

    iget-wide v0, v0, Lis0/n0$a$b;->w:J

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lis0/n0$a;->w:Lc93/a;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p3

    const/4 v2, 0x0

    cmpl-float p3, p3, v2

    if-lez p3, :cond_3

    move p3, v5

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    :goto_1
    if-nez p3, :cond_5

    iget-object v2, p0, Lis0/n0$a;->x:Lis0/m0;

    invoke-virtual {v2}, Lis0/m0;->m()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Ly3/q;

    invoke-direct {p1, v3, v4}, Ly3/q;-><init>(J)V

    return-object p1

    :cond_5
    :goto_2
    iget-object v2, p0, Lis0/n0$a;->x:Lis0/m0;

    iget-object v6, p0, Lis0/n0$a;->y:Lh0/p3;

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v7

    iput-wide p1, v0, Lis0/n0$a$b;->w:J

    iput p3, v0, Lis0/n0$a$b;->x:I

    iput v5, v0, Lis0/n0$a$b;->E:I

    invoke-virtual {v2, v6, v7, v0}, Lis0/m0;->n(Lh0/p3;FLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    return-object v1

    :cond_6
    move-wide v0, p1

    move p1, p3

    :goto_3
    if-eqz p1, :cond_7

    move-wide v3, v0

    :cond_7
    new-instance p1, Ly3/q;

    invoke-direct {p1, v3, v4}, Ly3/q;-><init>(J)V

    return-object p1
.end method
