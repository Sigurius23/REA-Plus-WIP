.class public final Ld0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public E:J

.field public F:Z

.field public final w:Ld0/f2;

.field public final x:Lp1/k1;

.field public y:Ld0/r;

.field public z:J


# direct methods
.method public synthetic constructor <init>(Ld0/f2;Ljava/lang/Object;Ld0/r;I)V
    .locals 9

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v8}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V

    return-void
.end method

.method public constructor <init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ld0/m;->w:Ld0/f2;

    .line 4
    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/m;->x:Lp1/k1;

    if-eqz p3, :cond_0

    .line 5
    invoke-static {p3}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p1, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    invoke-virtual {p1}, Ld0/r;->d()V

    .line 8
    :goto_0
    iput-object p1, p0, Ld0/m;->y:Ld0/r;

    .line 9
    iput-wide p4, p0, Ld0/m;->z:J

    .line 10
    iput-wide p6, p0, Ld0/m;->E:J

    .line 11
    iput-boolean p8, p0, Ld0/m;->F:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ld0/m;->w:Ld0/f2;

    iget-object v0, v0, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/m;->y:Ld0/r;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnimationState(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", velocity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ld0/m;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isRunning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ld0/m;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lastFrameTimeNanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ld0/m;->z:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", finishedTimeNanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ld0/m;->E:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
