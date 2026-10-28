.class public final Luw0/l$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luw0/l;->I(Ln0/u;)Lt2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "uw0/l$k",
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
        "custombottomsheet_release"
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


# direct methods
.method public constructor <init>(Ln0/u;)V
    .locals 0

    iput-object p1, p0, Luw0/l$k;->w:Ln0/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(JJI)J
    .locals 2

    iget-object p1, p0, Luw0/l$k;->w:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->c()Z

    move-result p1

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p3

    long-to-int p2, v0

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    const/4 p5, 0x0

    cmpl-float p2, p2, p5

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    return-wide p3

    :cond_1
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
    .locals 2

    iget-object p3, p0, Luw0/l$k;->w:Ln0/u;

    invoke-virtual {p3}, Ln0/u;->c()Z

    move-result p3

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public p0(JLq83/d;)Ljava/lang/Object;
    .locals 2
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

    iget-object p3, p0, Luw0/l$k;->w:Ln0/u;

    invoke-virtual {p3}, Ln0/u;->c()Z

    move-result p3

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 p1, 0x0

    :goto_1
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method
