.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JJLjava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lcom/whoop/data/local/room/dao/persistent/c;->w:I

    iput-object p5, p0, Lcom/whoop/data/local/room/dao/persistent/c;->z:Ljava/lang/Object;

    iput-wide p1, p0, Lcom/whoop/data/local/room/dao/persistent/c;->x:J

    iput-wide p3, p0, Lcom/whoop/data/local/room/dao/persistent/c;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-wide v4, p0, Lcom/whoop/data/local/room/dao/persistent/c;->y:J

    move-object v6, p1

    check-cast v6, Lg2/v;

    iget-wide v2, p0, Lcom/whoop/data/local/room/dao/persistent/c;->x:J

    invoke-static/range {v1 .. v6}, Lhy0/l1;->a(Lp1/c1;JJLg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

    iget-wide v4, p0, Lcom/whoop/data/local/room/dao/persistent/c;->y:J

    move-object v6, p1

    check-cast v6, Lq83/d;

    iget-wide v2, p0, Lcom/whoop/data/local/room/dao/persistent/c;->x:J

    invoke-static/range {v1 .. v6}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->e(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
