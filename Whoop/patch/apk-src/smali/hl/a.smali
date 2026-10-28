.class public final Lhl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lhl/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lxk/g;
    .locals 2

    iget v0, p0, Lhl/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    new-instance v0, Lxk/h;

    invoke-direct {v0, p1}, Lxk/h;-><init>(Landroid/os/ParcelFileDescriptor;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lf93/a;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/nio/ByteBuffer;

    new-instance v0, Lgl/h;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lgl/h;-><init>(Ljava/nio/ByteBuffer;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Class;
    .locals 2

    iget v0, p0, Lhl/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Landroid/os/ParcelFileDescriptor;

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
