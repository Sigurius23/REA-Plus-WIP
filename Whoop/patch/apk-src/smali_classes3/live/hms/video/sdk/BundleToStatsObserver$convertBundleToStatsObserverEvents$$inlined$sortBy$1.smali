.class public final Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/BundleToStatsObserver;->convertBundleToStatsObserverEvents(Llive/hms/video/connection/degredation/StatsBundle;Llive/hms/video/connection/stats/HMSStatsObserver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "kotlin.jvm.PlatformType",
        "a",
        "b",
        "",
        "compare",
        "(Ljava/lang/Object;Ljava/lang/Object;)I",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/sdk/BundleToStatsObserver;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/BundleToStatsObserver;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;->this$0:Llive/hms/video/sdk/BundleToStatsObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    check-cast p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    iget-object v0, p0, Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;->this$0:Llive/hms/video/sdk/BundleToStatsObserver;

    invoke-virtual {p1}, Llive/hms/video/connection/stats/HMSLocalVideoStats;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object p1

    invoke-static {v0, p1}, Llive/hms/video/sdk/BundleToStatsObserver;->access$layerSortOrder(Llive/hms/video/sdk/BundleToStatsObserver;Llive/hms/video/media/settings/HMSLayer;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    iget-object v0, p0, Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;->this$0:Llive/hms/video/sdk/BundleToStatsObserver;

    invoke-virtual {p2}, Llive/hms/video/connection/stats/HMSLocalVideoStats;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object p2

    invoke-static {v0, p2}, Llive/hms/video/sdk/BundleToStatsObserver;->access$layerSortOrder(Llive/hms/video/sdk/BundleToStatsObserver;Llive/hms/video/media/settings/HMSLayer;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
