.class public final Lwb/e;
.super Lwb/f;
.source "SourceFile"


# instance fields
.field public E:[J

.field public F:[D

.field public G:[Ljava/lang/String;

.field public H:[[B

.field public I:Landroid/database/Cursor;

.field public z:[I


# direct methods
.method public constructor <init>(Lub/a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lwb/f;-><init>(Lub/a;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lwb/e;->z:[I

    new-array p2, p1, [J

    iput-object p2, p0, Lwb/e;->E:[J

    new-array p2, p1, [D

    iput-object p2, p0, Lwb/e;->F:[D

    new-array p2, p1, [Ljava/lang/String;

    iput-object p2, p0, Lwb/e;->G:[Ljava/lang/String;

    new-array p1, p1, [[B

    iput-object p1, p0, Lwb/e;->H:[[B

    return-void
.end method

.method public static k(Landroid/database/Cursor;I)V
    .locals 0

    if-ltz p1, :cond_0

    invoke-interface {p0}, Landroid/database/Cursor;->getColumnCount()I

    move-result p0

    if-ge p1, p0, :cond_0

    return-void

    :cond_0
    const/16 p0, 0x19

    const-string p1, "column index out of range"

    invoke-static {p0, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final J0(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->m()Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final L(ILjava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1}, Lwb/e;->h(II)V

    iget-object v1, p0, Lwb/e;->z:[I

    aput v0, v1, p1

    iget-object v0, p0, Lwb/e;->G:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lwb/f;->y:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwb/e;->w()V

    invoke-virtual {p0}, Lwb/e;->reset()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwb/f;->y:Z

    return-void
.end method

.method public final e1()Z
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->i()V

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getBlob(I)[B
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->m()Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    const-string v0, "getBlob(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getColumnCount()I
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->i()V

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->i()V

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getColumnName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDouble(I)D
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->m()Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public final getLong(I)J
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->m()Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(II)V
    .locals 4

    const/4 v0, 0x1

    add-int/2addr p2, v0

    iget-object v1, p0, Lwb/e;->z:[I

    array-length v2, v1

    const-string v3, "copyOf(...)"

    if-ge v2, p2, :cond_0

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lwb/e;->z:[I

    :cond_0
    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lwb/e;->H:[[B

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [[B

    iput-object p1, p0, Lwb/e;->H:[[B

    return-void

    :cond_2
    iget-object p1, p0, Lwb/e;->G:[Ljava/lang/String;

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lwb/e;->G:[Ljava/lang/String;

    return-void

    :cond_3
    iget-object p1, p0, Lwb/e;->F:[D

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwb/e;->F:[D

    return-void

    :cond_4
    iget-object p1, p0, Lwb/e;->E:[J

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwb/e;->E:[J

    :cond_5
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-nez v0, :cond_0

    new-instance v0, Lu93/d0;

    invoke-direct {v0, p0}, Lu93/d0;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lwb/f;->w:Lub/a;

    invoke-interface {v1, v0}, Lub/a;->l0(Lub/g;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    :cond_0
    return-void
.end method

.method public final isNull(I)Z
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    invoke-virtual {p0}, Lwb/e;->m()Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lwb/e;->k(Landroid/database/Cursor;I)V

    invoke-interface {v0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result p1

    return p1
.end method

.method public final m()Landroid/database/Cursor;
    .locals 2

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x15

    const-string v1, "no row"

    invoke-static {v0, v1}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final p(IJ)V
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lwb/e;->h(II)V

    iget-object v1, p0, Lwb/e;->z:[I

    aput v0, v1, p1

    iget-object v0, p0, Lwb/e;->E:[J

    aput-wide p2, v0, p1

    return-void
.end method

.method public final q(I[B)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lwb/e;->h(II)V

    iget-object v1, p0, Lwb/e;->z:[I

    aput v0, v1, p1

    iget-object v0, p0, Lwb/e;->H:[[B

    aput-object p2, v0, p1

    return-void
.end method

.method public final reset()V
    .locals 1

    invoke-virtual {p0}, Lwb/f;->b()V

    iget-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lwb/e;->I:Landroid/database/Cursor;

    return-void
.end method

.method public final t(DI)V
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p3}, Lwb/e;->h(II)V

    iget-object v1, p0, Lwb/e;->z:[I

    aput v0, v1, p3

    iget-object v0, p0, Lwb/e;->F:[D

    aput-wide p1, v0, p3

    return-void
.end method

.method public final u(I)V
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1}, Lwb/e;->h(II)V

    iget-object v1, p0, Lwb/e;->z:[I

    aput v0, v1, p1

    return-void
.end method

.method public final w()V
    .locals 2

    invoke-virtual {p0}, Lwb/f;->b()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, Lwb/e;->z:[I

    new-array v1, v0, [J

    iput-object v1, p0, Lwb/e;->E:[J

    new-array v1, v0, [D

    iput-object v1, p0, Lwb/e;->F:[D

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lwb/e;->G:[Ljava/lang/String;

    new-array v0, v0, [[B

    iput-object v0, p0, Lwb/e;->H:[[B

    return-void
.end method
