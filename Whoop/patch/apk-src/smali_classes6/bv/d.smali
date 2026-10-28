.class public final Lbv/d;
.super Lav/e;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lbv/d;->e:I

    invoke-direct {p0, p1}, Lav/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lbv/d;->e:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "vector"

    return-object v0

    :pswitch_0
    const-string v0, "raster"

    return-object v0

    :pswitch_1
    const-string v0, "raster-dem"

    return-object v0

    :pswitch_2
    const-string v0, "raster-array"

    return-object v0

    :pswitch_3
    const-string v0, "image"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
