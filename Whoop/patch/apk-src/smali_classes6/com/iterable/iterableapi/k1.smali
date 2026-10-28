.class public final synthetic Lcom/iterable/iterableapi/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/iterable/iterableapi/k1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr9/i;)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, Lcom/iterable/iterableapi/k1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/k1;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-static {}, Lorg/webrtc/EglBase14Impl$EglConnection;->b()V

    return-void

    :pswitch_1
    invoke-static {}, Lorg/webrtc/EglBase10Impl$EglConnection;->a()V

    return-void

    :pswitch_2
    sget v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;->a:I

    return-void

    :pswitch_3
    invoke-static {}, Lcom/mapbox/bindgen/Cleaner;->a()V

    return-void

    :pswitch_4
    const/4 v0, 0x0

    :try_start_0
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "Exception in subscriber initialization callback"

    const-string v2, "IterableInitCallbackMgr"

    invoke-static {v2, v1, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
