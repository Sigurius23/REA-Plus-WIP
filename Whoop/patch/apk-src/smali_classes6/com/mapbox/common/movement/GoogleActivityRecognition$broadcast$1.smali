.class public final Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/movement/GoogleActivityRecognition;-><init>(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/mapbox/common/movement/GoogleActivityRecognition$broadcast$1",
        "Landroid/content/BroadcastReceiver;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/common/movement/GoogleActivityRecognition;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/movement/GoogleActivityRecognition;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;->this$0:Lcom/mapbox/common/movement/GoogleActivityRecognition;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;->this$0:Lcom/mapbox/common/movement/GoogleActivityRecognition;

    invoke-static {p1}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$getMode$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    move-result-object p1

    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "ActivityRecognitionObserver"

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_9

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    goto/16 :goto_9

    :cond_0
    const-string p1, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->b(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    :goto_0
    sget-object v3, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v4, "Activity recognition result received"

    invoke-virtual {v3, v0, v4}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->b(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    move-object p1, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, [B

    if-eqz v0, :cond_5

    check-cast p1, [B

    sget-object v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    goto :goto_2

    :cond_5
    instance-of v0, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    :goto_2
    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->b(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    goto :goto_4

    :cond_8
    :goto_3
    move-object p1, v1

    :goto_4
    if-eqz p1, :cond_d

    sget-object p2, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    invoke-static {p2, p1, v1, v2, v1}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->toMovementInfo$default(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;ILjava/lang/Object;)Lcom/mapbox/common/MovementInfo;

    move-result-object p1

    if-eqz p1, :cond_d

    iget-object p2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;->this$0:Lcom/mapbox/common/movement/GoogleActivityRecognition;

    invoke-static {p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$getObservers$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;

    invoke-interface {v0, p1}, Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;->onMovementInfo(Lcom/mapbox/common/MovementInfo;)V

    goto :goto_5

    :cond_9
    const-string p1, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_9

    :cond_a
    sget-object v3, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v4, "Activity transition result received"

    invoke-virtual {v3, v0, v4}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    move-object p1, v1

    goto :goto_7

    :cond_b
    sget-object v0, Ltp/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_c

    move-object p1, v1

    goto :goto_6

    :cond_c
    invoke-static {p1, v0}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object p1

    :goto_6
    check-cast p1, Ltp/e;

    :goto_7
    if-eqz p1, :cond_d

    sget-object p2, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    invoke-static {p2, p1, v1, v2, v1}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->toMovementInfo$default(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Ltp/e;Lcom/mapbox/common/MovementModeProvider;ILjava/lang/Object;)Lcom/mapbox/common/MovementInfo;

    move-result-object p1

    if-eqz p1, :cond_d

    iget-object p2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;->this$0:Lcom/mapbox/common/movement/GoogleActivityRecognition;

    invoke-static {p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$getObservers$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;

    invoke-interface {v0, p1}, Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;->onMovementInfo(Lcom/mapbox/common/MovementInfo;)V

    goto :goto_8

    :cond_d
    :goto_9
    return-void
.end method
