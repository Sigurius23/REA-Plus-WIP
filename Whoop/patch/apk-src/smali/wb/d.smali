.class public final Lwb/d;
.super Lwb/f;
.source "SourceFile"


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lub/a;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwb/d;->z:I

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2}, Lwb/f;-><init>(Lub/a;Ljava/lang/String;)V

    .line 6
    invoke-interface {p1, p2}, Lub/a;->r0(Ljava/lang/String;)Lub/h;

    move-result-object p1

    iput-object p1, p0, Lwb/d;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lub/a;Ljava/lang/String;Lwb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lwb/d;->z:I

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lwb/f;-><init>(Lub/a;Ljava/lang/String;)V

    .line 2
    iput-object p3, p0, Lwb/d;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lub/a;Ljava/lang/String;Lwb/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lwb/d;->z:I

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lwb/f;-><init>(Lub/a;Ljava/lang/String;)V

    .line 4
    iput-object p3, p0, Lwb/d;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public B0()Z
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lwb/f;->B0()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-interface {v0}, Ltb/c;->B0()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final J0(I)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->J0(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(ILjava/lang/String;)V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x19

    const-string p2, "column index out of range"

    invoke-static {p1, p2}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0, p1, p2}, Lub/f;->n0(ILjava/lang/String;)V

    return-void

    :pswitch_1
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1, p2}, Lwb/e;->L(ILjava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwb/f;->y:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwb/f;->y:Z

    return-void

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0}, Lwb/e;->close()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e1()Z
    .locals 3

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lwb/f;->w:Lub/a;

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    invoke-interface {v1}, Lub/a;->u0()V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-interface {v1}, Lub/a;->P()V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Lub/a;->y()V

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Lub/a;->V()V

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Lub/a;->O()V

    invoke-interface {v1}, Lub/a;->V()V

    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0}, Lub/h;->execute()V

    const/4 v0, 0x0

    return v0

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0}, Lwb/e;->e1()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lwb/e;->J0(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "wal"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    iget-object v2, p0, Lwb/f;->w:Lub/a;

    if-eqz v0, :cond_5

    invoke-interface {v2}, Lub/a;->N()Z

    goto :goto_1

    :cond_5
    invoke-interface {v2}, Lub/a;->D()V

    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getBlob(I)[B
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->getBlob(I)[B

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getColumnCount()I
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x0

    return v0

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x0

    return v0

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0}, Lwb/e;->getColumnCount()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->getColumnName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDouble(I)D
    .locals 2

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->getDouble(I)D

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getLong(I)J
    .locals 2

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isNull(I)Z
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x15

    const-string v0, "no row"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->isNull(I)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(IJ)V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x19

    const-string p2, "column index out of range"

    invoke-static {p1, p2}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0, p1, p2, p3}, Lub/f;->p(IJ)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1, p2, p3}, Lwb/e;->p(IJ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(I[B)V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x19

    const-string p2, "column index out of range"

    invoke-static {p1, p2}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0, p1, p2}, Lub/f;->q(I[B)V

    return-void

    :pswitch_1
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1, p2}, Lwb/e;->q(I[B)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public reset()V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lwb/f;->reset()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0}, Lwb/e;->reset()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t(DI)V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x19

    const-string p2, "column index out of range"

    invoke-static {p1, p2}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0, p1, p2, p3}, Lub/f;->t(DI)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1, p2, p3}, Lwb/e;->t(DI)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(I)V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lwb/f;->b()V

    const/16 p1, 0x19

    const-string v0, "column index out of range"

    invoke-static {p1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0, p1}, Lub/f;->u(I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0, p1}, Lwb/e;->u(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w()V
    .locals 1

    iget v0, p0, Lwb/d;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lwb/f;->w()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {v0}, Lub/f;->w()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lwb/d;->E:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    invoke-virtual {v0}, Lwb/e;->w()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
