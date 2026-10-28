.class public final Lcp0/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcp0/z0;",
        "Lt2/a;",
        "Lcp0/y0;",
        "handler",
        "<init>",
        "(Lcp0/y0;)V",
        "Lh2/b;",
        "consumed",
        "available",
        "",
        "source",
        "J",
        "(JJI)J",
        "Ly3/q;",
        "p0",
        "(JLq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "a",
        "()V",
        "w",
        "Lcp0/y0;",
        "",
        "x",
        "Z",
        "dragging",
        "coach-everywhere_release"
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
.field private final w:Lcp0/y0;

.field private x:Z


# direct methods
.method public constructor <init>(Lcp0/y0;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/z0;->w:Lcp0/y0;

    return-void
.end method


# virtual methods
.method public J(JJI)J
    .locals 2

    const/4 p1, 0x1

    if-ne p5, p1, :cond_2

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p3

    long-to-int p2, v0

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p5

    const/4 v0, 0x0

    cmpg-float p5, p5, v0

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p5, p0, Lcp0/z0;->x:Z

    if-nez p5, :cond_1

    iget-object p5, p0, Lcp0/z0;->w:Lcp0/y0;

    invoke-virtual {p5}, Lcp0/y0;->k()V

    iput-boolean p1, p0, Lcp0/z0;->x:Z

    :cond_1
    iget-object p1, p0, Lcp0/z0;->w:Lcp0/y0;

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {p1, p2}, Lcp0/y0;->h(F)V

    const/4 p1, 0x2

    invoke-static {v0, v0, p3, p4, p1}, Lh2/b;->a(FFJI)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
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

.method public final a()V
    .locals 1

    iget-boolean v0, p0, Lcp0/z0;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcp0/z0;->w:Lcp0/y0;

    invoke-virtual {v0}, Lcp0/y0;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcp0/z0;->x:Z

    :cond_0
    return-void
.end method

.method public bridge l0(JI)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public p0(JLq83/d;)Ljava/lang/Object;
    .locals 0
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

    iget-boolean p1, p0, Lcp0/z0;->x:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcp0/z0;->w:Lcp0/y0;

    invoke-virtual {p1}, Lcp0/y0;->j()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcp0/z0;->x:Z

    :cond_0
    new-instance p1, Ly3/q;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ly3/q;-><init>(J)V

    return-object p1
.end method
