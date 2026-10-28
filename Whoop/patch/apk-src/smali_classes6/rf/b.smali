.class public final Lrf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrf/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrf/b;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "initiating TLS connection"

    return-object v0

    :pswitch_0
    const-string v0, "cache satisfaction failure"

    return-object v0

    :pswitch_1
    const-string v0, "response headers start"

    return-object v0

    :pswitch_2
    const-string v0, "response failed"

    return-object v0

    :pswitch_3
    const-string v0, "response body available"

    return-object v0

    :pswitch_4
    const-string v0, "sending request headers"

    return-object v0

    :pswitch_5
    const-string v0, "finished sending request headers"

    return-object v0

    :pswitch_6
    const-string v0, "request failed"

    return-object v0

    :pswitch_7
    const-string v0, "sending request body"

    return-object v0

    :pswitch_8
    const-string v0, "call cancelled"

    return-object v0

    :pswitch_9
    const-string v0, "call started"

    return-object v0

    :pswitch_a
    const-string v0, "call failed"

    return-object v0

    :pswitch_b
    const-string v0, "call complete"

    return-object v0

    :pswitch_c
    const-string v0, "cache miss"

    return-object v0

    :pswitch_d
    const-string v0, "cache hit"

    return-object v0

    :pswitch_e
    const-string v0, "cache conditional hit"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
