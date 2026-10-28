.class public interface abstract Lcom/mapbox/common/LifecycleMonitorInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getLifecycleState(Lcom/mapbox/common/GetLifecycleStateCallback;)V
.end method

.method public abstract getMonitoringState(Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;)V
.end method

.method public abstract registerObserver(Lcom/mapbox/common/LifecycleObserver;)V
.end method

.method public abstract unregisterObserver(Lcom/mapbox/common/LifecycleObserver;)V
.end method
