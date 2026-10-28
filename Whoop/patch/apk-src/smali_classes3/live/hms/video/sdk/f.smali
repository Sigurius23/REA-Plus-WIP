.class public final synthetic Llive/hms/video/sdk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/sdk/SDKDelegate;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/sdk/f;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->n(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->d(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/HmsWhiteBoardManager;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->c(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->r(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/PermissionsHandlers;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->s(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->g(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/audio/HMSAudioManager;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->h(Llive/hms/video/sdk/SDKDelegate;)Landroid/os/Handler;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->m(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->k(Llive/hms/video/sdk/SDKDelegate;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->i(Llive/hms/video/sdk/SDKDelegate;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->o(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Llive/hms/video/sdk/f;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->i(Llive/hms/video/sdk/SDKDelegate;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
