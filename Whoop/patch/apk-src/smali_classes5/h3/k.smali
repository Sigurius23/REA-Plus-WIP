.class public final Lh3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li3/p;

.field public final b:I

.field public final c:Ly3/k;

.field public final d:Landroidx/compose/ui/node/NodeCoordinator;


# direct methods
.method public constructor <init>(Li3/p;ILy3/k;Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/k;->a:Li3/p;

    iput p2, p0, Lh3/k;->b:I

    iput-object p3, p0, Lh3/k;->c:Ly3/k;

    iput-object p4, p0, Lh3/k;->d:Landroidx/compose/ui/node/NodeCoordinator;

    return-void
.end method


# virtual methods
.method public final a()Ly2/y;
    .locals 1

    iget-object v0, p0, Lh3/k;->d:Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final b()Li3/p;
    .locals 1

    iget-object v0, p0, Lh3/k;->a:Li3/p;

    return-object v0
.end method

.method public final c()Ly3/k;
    .locals 1

    iget-object v0, p0, Lh3/k;->c:Ly3/k;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScrollCaptureCandidate(node="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh3/k;->a:Li3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", depth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh3/k;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", viewportBoundsInWindow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh3/k;->c:Ly3/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coordinates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh3/k;->d:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
