.class public final Lwd3/d;
.super Lud3/a1;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final y:Lud3/h0;

.field public final z:J


# direct methods
.method public constructor <init>(Lud3/h0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd3/d;->y:Lud3/h0;

    iput-wide p2, p0, Lwd3/d;->z:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final d1()Lne3/j;
    .locals 1

    invoke-static {p0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    return-object v0
.end method

.method public final h1(Lne3/h;J)J
    .locals 0

    const-string p2, "sink"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lwd3/d;->z:J

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lwd3/d;->y:Lud3/h0;

    return-object v0
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method
