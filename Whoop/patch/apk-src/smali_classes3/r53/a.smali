.class public final synthetic Lr53/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/nio/ByteBuffer;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 0

    iput p2, p0, Lr53/a;->w:I

    iput-object p1, p0, Lr53/a;->x:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lr53/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr53/a;->x:Ljava/nio/ByteBuffer;

    sget-object v1, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    invoke-virtual {v1, v0}, Lio/github/crow_misia/libyuv/Yuv;->freeNativeBuffer(Ljava/nio/ByteBuffer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lr53/a;->x:Ljava/nio/ByteBuffer;

    sget-object v1, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    invoke-virtual {v1, v0}, Lio/github/crow_misia/libyuv/Yuv;->freeNativeBuffer(Ljava/nio/ByteBuffer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
