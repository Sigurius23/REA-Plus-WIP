.class final Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/LifecycleMonitorAndroid;->getLifecycleState(Lcom/mapbox/common/GetLifecycleStateCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/mapbox/common/LifecycleState;",
        "state",
        "Ll83/a0;",
        "invoke",
        "(Lcom/mapbox/common/LifecycleState;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/mapbox/common/GetLifecycleStateCallback;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/GetLifecycleStateCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;->$callback:Lcom/mapbox/common/GetLifecycleStateCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/mapbox/common/LifecycleState;

    invoke-virtual {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;->invoke(Lcom/mapbox/common/LifecycleState;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lcom/mapbox/common/LifecycleState;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;->$callback:Lcom/mapbox/common/GetLifecycleStateCallback;

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/mapbox/common/GetLifecycleStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method
