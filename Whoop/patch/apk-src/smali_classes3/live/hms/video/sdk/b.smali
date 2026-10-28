.class public final synthetic Llive/hms/video/sdk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/sdk/b;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/b;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->f(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/b;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/RtcStatsObserverUseCase;

    invoke-static {v0}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->b(Llive/hms/video/sdk/RtcStatsObserverUseCase;)Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
