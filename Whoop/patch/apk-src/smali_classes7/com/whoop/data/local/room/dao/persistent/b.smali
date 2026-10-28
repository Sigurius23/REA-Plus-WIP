.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IJJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/whoop/data/local/room/dao/persistent/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/local/room/dao/persistent/b;->z:I

    iput-wide p2, p0, Lcom/whoop/data/local/room/dao/persistent/b;->x:J

    iput-wide p4, p0, Lcom/whoop/data/local/room/dao/persistent/b;->y:J

    return-void
.end method

.method public synthetic constructor <init>(JJI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/data/local/room/dao/persistent/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/data/local/room/dao/persistent/b;->x:J

    iput-wide p3, p0, Lcom/whoop/data/local/room/dao/persistent/b;->y:J

    iput p5, p0, Lcom/whoop/data/local/room/dao/persistent/b;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget v1, p0, Lcom/whoop/data/local/room/dao/persistent/b;->z:I

    move-object v6, p1

    check-cast v6, Ltb/a;

    iget-wide v2, p0, Lcom/whoop/data/local/room/dao/persistent/b;->x:J

    iget-wide v4, p0, Lcom/whoop/data/local/room/dao/persistent/b;->y:J

    invoke-static/range {v1 .. v6}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->d(IJJLtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v3, p0, Lcom/whoop/data/local/room/dao/persistent/b;->y:J

    move-object v5, p1

    check-cast v5, Ltb/a;

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/b;->z:I

    iget-wide v1, p0, Lcom/whoop/data/local/room/dao/persistent/b;->x:J

    invoke-static/range {v0 .. v5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->b(IJJLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
