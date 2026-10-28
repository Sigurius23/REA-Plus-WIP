.class public final La6/i1;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/FileOutputStream;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La6/i1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput-object p1, p0, La6/i1;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lne3/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La6/i1;->w:I

    iput-object p1, p0, La6/i1;->x:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 0

    return-void
.end method

.method private final h()V
    .locals 0

    return-void
.end method

.method private final i()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, La6/i1;->w:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget v0, p0, La6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, La6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v1, Lne3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final write(I)V
    .locals 1

    iget v0, p0, La6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    .line 2
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    return-void

    .line 3
    :pswitch_0
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public write([B)V
    .locals 1

    iget v0, p0, La6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    :pswitch_0
    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final write([BII)V
    .locals 1

    iget v0, p0, La6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Lne3/h;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->write([BII)V

    return-void

    .line 5
    :pswitch_0
    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, La6/i1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileOutputStream;->write([BII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
