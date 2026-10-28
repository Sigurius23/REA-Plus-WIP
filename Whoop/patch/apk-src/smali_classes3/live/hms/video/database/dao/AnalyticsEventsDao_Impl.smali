.class public final Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/database/dao/AnalyticsEventsDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __deletionAdapterOfAnalyticsEntityModel:Landroidx/room/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/j;"
        }
    .end annotation
.end field

.field private final __insertionAdapterOfAnalyticsEntityModel:Landroidx/room/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/l;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteLogById:Landroidx/room/r1;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$1;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/z0;)V

    iput-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__insertionAdapterOfAnalyticsEntityModel:Landroidx/room/l;

    new-instance v0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$2;

    invoke-direct {v0, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$2;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/z0;)V

    iput-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__deletionAdapterOfAnalyticsEntityModel:Landroidx/room/j;

    new-instance v0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$3;

    invoke-direct {v0, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$3;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/z0;)V

    iput-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__preparedStmtOfDeleteLogById:Landroidx/room/r1;

    return-void
.end method

.method public static synthetic access$000(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;)Landroidx/room/z0;
    .locals 0

    iget-object p0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    return-object p0
.end method

.method public static synthetic access$100(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;)Landroidx/room/l;
    .locals 0

    iget-object p0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__insertionAdapterOfAnalyticsEntityModel:Landroidx/room/l;

    return-object p0
.end method

.method public static synthetic access$200(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;)Landroidx/room/j;
    .locals 0

    iget-object p0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__deletionAdapterOfAnalyticsEntityModel:Landroidx/room/j;

    return-object p0
.end method

.method public static synthetic access$300(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;)Landroidx/room/r1;
    .locals 0

    iget-object p0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__preparedStmtOfDeleteLogById:Landroidx/room/r1;

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public addEvent(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$4;

    invoke-direct {v1, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$4;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Llive/hms/video/database/entity/AnalyticsEntityModel;)V

    sget-object p1, Landroidx/room/f;->a:Lu00/e;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1, p2}, Lu00/e;->s(Landroidx/room/z0;ZLjava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$5;

    invoke-direct {v1, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$5;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Llive/hms/video/database/entity/AnalyticsEntityModel;)V

    sget-object p1, Landroidx/room/f;->a:Lu00/e;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1, p2}, Lu00/e;->s(Landroidx/room/z0;ZLjava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteLogById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$6;

    invoke-direct {v1, p0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$6;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Ljava/lang/String;)V

    sget-object p1, Landroidx/room/f;->a:Lu00/e;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1, p2}, Lu00/e;->s(Landroidx/room/z0;ZLjava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAllEvents(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Landroidx/room/n1;->I:Ljava/util/TreeMap;

    const/4 v0, 0x0

    const-string v1, "Select * FROM analytics_table"

    invoke-static {v0, v1}, Lq83/g;->h(ILjava/lang/String;)Landroidx/room/n1;

    move-result-object v0

    new-instance v1, Landroid/os/CancellationSignal;

    invoke-direct {v1}, Landroid/os/CancellationSignal;-><init>()V

    iget-object v2, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v3, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;

    invoke-direct {v3, p0, v0}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/n1;)V

    sget-object v0, Landroidx/room/f;->a:Lu00/e;

    invoke-virtual {v0, v2, v1, v3, p1}, Lu00/e;->r(Landroidx/room/z0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
