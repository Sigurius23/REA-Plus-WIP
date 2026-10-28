.class public final La9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:[B

.field public c:I

.field public d:[I

.field public e:[I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Landroid/media/MediaCodec$CryptoInfo;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object p1, p0, La9/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, Lxl/a;

    invoke-direct {v0, p1}, Lxl/a;-><init>(Landroid/media/MediaCodec$CryptoInfo;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, La9/c;->j:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object p1, p0, La9/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    sget v0, Llo/y;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    new-instance v0, Lt9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lt9/u;->w:Ljava/lang/Object;

    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, v0, Lt9/u;->x:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, La9/c;->j:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
