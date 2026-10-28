.class public final Las/a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Las/a;->w:I

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method private final b(I)V
    .locals 0

    return-void
.end method

.method private final h(I)V
    .locals 0

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Las/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "ByteStreams.nullOutputStream()"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final write(I)V
    .locals 0

    .line 1
    iget p1, p0, Las/a;->w:I

    return-void
.end method

.method public write([B)V
    .locals 1

    iget v0, p0, Las/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    .line 2
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public write([BII)V
    .locals 1

    iget v0, p0, Las/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/2addr p3, p2

    .line 4
    array-length p1, p1

    invoke-static {p2, p3, p1}, Lrj/o;->l(III)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
