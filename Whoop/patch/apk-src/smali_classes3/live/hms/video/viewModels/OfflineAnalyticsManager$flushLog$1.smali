.class final Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/viewModels/OfflineAnalyticsManager;->flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.viewModels.OfflineAnalyticsManager"
    f = "OfflineAnalyticsManager.kt"
    l = {
        0x1e
    }
    m = "flushLog"
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;


# direct methods
.method public constructor <init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/viewModels/OfflineAnalyticsManager;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->result:Ljava/lang/Object;

    iget p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    iget-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
