.class public final Ld0/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ld0/j2;

.field public c:Z

.field public d:F

.field public final e:Ld0/n;

.field public f:Ld0/n;

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld0/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    iput-object v0, p0, Ld0/y0;->e:Ld0/n;

    return-void
.end method


# virtual methods
.method public final a()Ld0/g2;
    .locals 1

    iget-object v0, p0, Ld0/y0;->b:Ld0/j2;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Ld0/y0;->h:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ld0/y0;->g:J

    return-wide v0
.end method

.method public final d()Ld0/n;
    .locals 1

    iget-object v0, p0, Ld0/y0;->f:Ld0/n;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Ld0/y0;->a:J

    return-wide v0
.end method

.method public final f()Ld0/n;
    .locals 1

    iget-object v0, p0, Ld0/y0;->e:Ld0/n;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Ld0/y0;->d:F

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Ld0/y0;->c:Z

    return v0
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Ld0/y0;->h:J

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Ld0/y0;->c:Z

    return-void
.end method

.method public final k(J)V
    .locals 0

    iput-wide p1, p0, Ld0/y0;->g:J

    return-void
.end method

.method public final l(J)V
    .locals 0

    iput-wide p1, p0, Ld0/y0;->a:J

    return-void
.end method

.method public final m(F)V
    .locals 0

    iput p1, p0, Ld0/y0;->d:F

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "progress nanos: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ld0/y0;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/y0;->b:Ld0/j2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isComplete: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ld0/y0;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ld0/y0;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/y0;->e:Ld0/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialVelocity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/y0;->f:Ld0/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", durationNanos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ld0/y0;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpecDuration: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ld0/y0;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
