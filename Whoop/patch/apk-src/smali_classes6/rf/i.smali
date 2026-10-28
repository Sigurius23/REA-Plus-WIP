.class public final Lrf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Lne3/i;

.field public final x:Lqg/d;

.field public final y:Lgf/c;


# direct methods
.method public constructor <init>(Lne3/i;Lqg/d;Lgf/c;)V
    .locals 1

    const-string v0, "counter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/i;->w:Lne3/i;

    iput-object p2, p0, Lrf/i;->x:Lqg/d;

    iput-object p3, p0, Lrf/i;->y:Lgf/c;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lrf/i;->w:Lne3/i;

    invoke-interface {v0}, Lne3/i;->e()Lne3/i;

    invoke-interface {v0}, Lne3/n0;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lrf/i;->w:Lne3/i;

    invoke-interface {v0}, Lne3/i;->flush()V

    return-void
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lrf/i;->w:Lne3/i;

    invoke-interface {v0}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrf/i;->w:Lne3/i;

    invoke-interface {v0, p1, p2, p3}, Lne3/n0;->write(Lne3/h;J)V

    iget-object p1, p0, Lrf/i;->x:Lqg/d;

    iget-object v0, p0, Lrf/i;->y:Lgf/c;

    invoke-static {p1, p2, p3, v0}, Lqg/d;->a(Lqg/d;JLgf/c;)V

    return-void
.end method
