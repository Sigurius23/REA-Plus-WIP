.class public Landroidx/room/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/f;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteProgram;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/room/m1;->w:I

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    return-void
.end method

.method public constructor <init>(Landroidx/room/n1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/room/m1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n0(ILjava/lang/String;)V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0, p1, p2}, Landroidx/room/n1;->n0(ILjava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(IJ)V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/room/n1;->p(IJ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(I[B)V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0, p1, p2}, Landroidx/room/n1;->q(I[B)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t(DI)V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p3, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/room/n1;->t(DI)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final u(I)V
    .locals 1

    iget v0, p0, Landroidx/room/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroidx/room/n1;

    invoke-virtual {v0, p1}, Landroidx/room/n1;->u(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Landroidx/room/m1;->x:Ljava/io/Closeable;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    return-void
.end method
