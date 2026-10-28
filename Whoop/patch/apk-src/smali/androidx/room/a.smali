.class public final Landroidx/room/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final synthetic w:Ltb/c;


# direct methods
.method public constructor <init>(Ltb/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/a;->w:Ltb/c;

    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->B0()Z

    move-result v0

    return v0
.end method

.method public final J0(I)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final L(ILjava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e1()Z
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getBlob(I)[B
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getColumnCount()I
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDouble(I)D
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getLong(I)J
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isNull(I)Z
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public final q(I[B)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->q(I[B)V

    return-void
.end method

.method public final reset()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only bind*() calls are allowed on the RoomRawQuery received statement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(DI)V
    .locals 1

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->t(DI)V

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->u(I)V

    return-void
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Landroidx/room/a;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->w()V

    return-void
.end method
