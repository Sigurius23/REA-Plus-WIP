.class public final Ld0/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/h;


# instance fields
.field public final a:Ld0/g2;

.field public final b:Ld0/f2;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ld0/r;

.field public f:Ld0/r;

.field public final g:Ld0/r;

.field public h:J

.field public i:Ld0/r;


# direct methods
.method public constructor <init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V
    .locals 0

    invoke-interface {p1, p2}, Ld0/l;->a(Ld0/f2;)Ld0/g2;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/p1;->a:Ld0/g2;

    iput-object p2, p0, Ld0/p1;->b:Ld0/f2;

    iput-object p4, p0, Ld0/p1;->c:Ljava/lang/Object;

    iput-object p3, p0, Ld0/p1;->d:Ljava/lang/Object;

    iget-object p1, p2, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    iput-object p1, p0, Ld0/p1;->e:Ld0/r;

    iget-object p1, p2, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld0/r;

    iput-object p2, p0, Ld0/p1;->f:Ld0/r;

    if-eqz p5, :cond_0

    invoke-static {p5}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    invoke-virtual {p1}, Ld0/r;->c()Ld0/r;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld0/p1;->g:Ld0/r;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ld0/p1;->h:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Ld0/p1;->a:Ld0/g2;

    invoke-interface {v0}, Ld0/g2;->a()Z

    move-result v0

    return v0
.end method

.method public final b(J)Ld0/r;
    .locals 7

    invoke-interface {p0, p1, p2}, Ld0/h;->c(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v4, p0, Ld0/p1;->e:Ld0/r;

    iget-object v5, p0, Ld0/p1;->f:Ld0/r;

    iget-object v6, p0, Ld0/p1;->g:Ld0/r;

    iget-object v1, p0, Ld0/p1;->a:Ld0/g2;

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Ld0/p1;->i:Ld0/r;

    if-nez p1, :cond_1

    iget-object p1, p0, Ld0/p1;->e:Ld0/r;

    iget-object p2, p0, Ld0/p1;->f:Ld0/r;

    iget-object v0, p0, Ld0/p1;->g:Ld0/r;

    iget-object v1, p0, Ld0/p1;->a:Ld0/g2;

    invoke-interface {v1, p1, p2, v0}, Ld0/g2;->f(Ld0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    iput-object p1, p0, Ld0/p1;->i:Ld0/r;

    :cond_1
    return-object p1
.end method

.method public final d()J
    .locals 4

    iget-wide v0, p0, Ld0/p1;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Ld0/p1;->e:Ld0/r;

    iget-object v1, p0, Ld0/p1;->f:Ld0/r;

    iget-object v2, p0, Ld0/p1;->g:Ld0/r;

    iget-object v3, p0, Ld0/p1;->a:Ld0/g2;

    invoke-interface {v3, v0, v1, v2}, Ld0/g2;->c(Ld0/r;Ld0/r;Ld0/r;)J

    move-result-wide v0

    iput-wide v0, p0, Ld0/p1;->h:J

    :cond_0
    iget-wide v0, p0, Ld0/p1;->h:J

    return-wide v0
.end method

.method public final e()Ld0/f2;
    .locals 1

    iget-object v0, p0, Ld0/p1;->b:Ld0/f2;

    return-object v0
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 7

    invoke-interface {p0, p1, p2}, Ld0/h;->c(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v4, p0, Ld0/p1;->e:Ld0/r;

    iget-object v5, p0, Ld0/p1;->f:Ld0/r;

    iget-object v6, p0, Ld0/p1;->g:Ld0/r;

    iget-object v1, p0, Ld0/p1;->a:Ld0/g2;

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Ld0/g2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    invoke-virtual {p1}, Ld0/r;->b()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    invoke-virtual {p1, v0}, Ld0/r;->a(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "AnimationVector cannot contain a NaN. "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Animation: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", playTimeNanos: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ld0/u0;->b(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ld0/p1;->b:Ld0/f2;

    iget-object p2, p2, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, Ld0/p1;->c:Ljava/lang/Object;

    return-object p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/p1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ld0/p1;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ld0/p1;->d:Ljava/lang/Object;

    iget-object v0, p0, Ld0/p1;->b:Ld0/f2;

    iget-object v0, v0, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    iput-object p1, p0, Ld0/p1;->e:Ld0/r;

    const/4 p1, 0x0

    iput-object p1, p0, Ld0/p1;->i:Ld0/r;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ld0/p1;->h:J

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ld0/p1;->c:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ld0/p1;->c:Ljava/lang/Object;

    iget-object v0, p0, Ld0/p1;->b:Ld0/f2;

    iget-object v0, v0, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    iput-object p1, p0, Ld0/p1;->f:Ld0/r;

    const/4 p1, 0x0

    iput-object p1, p0, Ld0/p1;->i:Ld0/r;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ld0/p1;->h:J

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TargetBasedAnimation: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld0/p1;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/p1;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",initial velocity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/p1;->g:Ld0/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ld0/h;->d()J

    move-result-wide v1

    const-wide/32 v3, 0xf4240

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms,animationSpec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/p1;->a:Ld0/g2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
