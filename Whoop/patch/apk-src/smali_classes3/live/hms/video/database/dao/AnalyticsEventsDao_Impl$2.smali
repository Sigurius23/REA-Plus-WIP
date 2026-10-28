.class Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$2;
.super Landroidx/room/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/j;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;


# direct methods
.method public constructor <init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/z0;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$2;->this$0:Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;

    const-string p1, "database"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Landroidx/room/r1;-><init>(Landroidx/room/z0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lub/h;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Llive/hms/video/database/entity/AnalyticsEntityModel;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$2;->bind(Lub/h;Llive/hms/video/database/entity/AnalyticsEntityModel;)V

    return-void
.end method

.method public bind(Lub/h;Llive/hms/video/database/entity/AnalyticsEntityModel;)V
    .locals 2

    .line 2
    invoke-virtual {p2}, Llive/hms/video/database/entity/AnalyticsEntityModel;->getEventId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Lub/f;->u(I)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Llive/hms/video/database/entity/AnalyticsEntityModel;->getEventId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lub/f;->n0(ILjava/lang/String;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `analytics_table` WHERE `eventId` = ?"

    return-object v0
.end method
