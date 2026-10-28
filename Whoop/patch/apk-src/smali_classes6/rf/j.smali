.class public final Lrf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Lne3/p0;

.field public final x:Lqg/d;

.field public final y:Lgf/c;


# direct methods
.method public constructor <init>(Lne3/j;Lqg/d;Lgf/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/j;->w:Lne3/p0;

    iput-object p2, p0, Lrf/j;->x:Lqg/d;

    iput-object p3, p0, Lrf/j;->y:Lgf/c;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lrf/j;->w:Lne3/p0;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrf/j;->w:Lne3/p0;

    invoke-interface {v0, p1, p2, p3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    iget-object p3, p0, Lrf/j;->x:Lqg/d;

    iget-object v0, p0, Lrf/j;->y:Lgf/c;

    invoke-static {p3, p1, p2, v0}, Lqg/d;->a(Lqg/d;JLgf/c;)V

    :cond_0
    return-wide p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lrf/j;->w:Lne3/p0;

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method
