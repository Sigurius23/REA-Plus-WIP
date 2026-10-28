.class public final Lrf/g;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final a:Lud3/v0;

.field public final b:Lqg/d;

.field public final c:Lgf/c;


# direct methods
.method public constructor <init>(Lud3/v0;Lqg/d;Lgf/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/g;->a:Lud3/v0;

    iput-object p2, p0, Lrf/g;->b:Lqg/d;

    iput-object p3, p0, Lrf/g;->c:Lgf/c;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lrf/g;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lrf/g;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v0

    return-object v0
.end method

.method public final isDuplex()Z
    .locals 1

    iget-object v0, p0, Lrf/g;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->isDuplex()Z

    move-result v0

    return v0
.end method

.method public final isOneShot()Z
    .locals 1

    iget-object v0, p0, Lrf/g;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->isOneShot()Z

    move-result v0

    return v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 3

    new-instance v0, Lrf/i;

    iget-object v1, p0, Lrf/g;->b:Lqg/d;

    iget-object v2, p0, Lrf/g;->c:Lgf/c;

    invoke-direct {v0, p1, v1, v2}, Lrf/i;-><init>(Lne3/i;Lqg/d;Lgf/c;)V

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    iget-object v0, p0, Lrf/g;->a:Lud3/v0;

    invoke-virtual {v0, p1}, Lud3/v0;->writeTo(Lne3/i;)V

    iget-boolean v0, p1, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lne3/h0;->e()Lne3/i;

    :cond_0
    return-void
.end method
