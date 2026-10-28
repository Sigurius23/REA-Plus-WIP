.class public final Lbc3/i2;
.super Lhc3/u;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final E:J


# direct methods
.method public constructor <init>(JLq83/d;)V
    .locals 1

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    iput-wide p1, p0, Lbc3/i2;->E:J

    return-void
.end method


# virtual methods
.method public final N()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lbc3/t1;->N()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lbc3/i2;->E:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final run()V
    .locals 3

    iget-object v0, p0, Lbc3/a;->y:Lq83/j;

    invoke-static {v0}, Lbc3/m0;->d(Lq83/j;)Lbc3/k0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Timed out waiting for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lbc3/i2;->E:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkotlinx/coroutines/TimeoutCancellationException;

    invoke-direct {v1, v0, p0}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Lbc3/k1;)V

    invoke-virtual {p0, v1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    return-void
.end method
