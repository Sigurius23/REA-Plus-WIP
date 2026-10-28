.class public final Llb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final w:Ltb/c;


# direct methods
.method public constructor <init>(Ltb/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/f;->w:Ltb/c;

    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->B0()Z

    move-result v0

    return v0
.end method

.method public final J0(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final L(ILjava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->reset()V

    invoke-interface {v0}, Ltb/c;->w()V

    return-void
.end method

.method public final e1()Z
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->e1()Z

    move-result v0

    return v0
.end method

.method public final getBlob(I)[B
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getBlob(I)[B

    move-result-object p1

    return-object p1
.end method

.method public final getColumnCount()I
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->getColumnCount()I

    move-result v0

    return v0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getColumnName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDouble(I)D
    .locals 2

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public final getLong(I)J
    .locals 2

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final isNull(I)Z
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->isNull(I)Z

    move-result p1

    return p1
.end method

.method public final p(IJ)V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public final q(I[B)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->q(I[B)V

    return-void
.end method

.method public final reset()V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->reset()V

    return-void
.end method

.method public final t(DI)V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->t(DI)V

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->u(I)V

    return-void
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Llb/f;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->w()V

    return-void
.end method
