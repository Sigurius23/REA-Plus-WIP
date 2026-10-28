.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/a;->w:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

    iput-object p2, p0, Lcom/whoop/data/local/room/dao/persistent/a;->x:Ljava/util/List;

    iput-wide p3, p0, Lcom/whoop/data/local/room/dao/persistent/a;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/a;->y:J

    check-cast p1, Lq83/d;

    iget-object v2, p0, Lcom/whoop/data/local/room/dao/persistent/a;->w:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

    iget-object v3, p0, Lcom/whoop/data/local/room/dao/persistent/a;->x:Ljava/util/List;

    invoke-static {v2, v3, v0, v1, p1}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->d(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
