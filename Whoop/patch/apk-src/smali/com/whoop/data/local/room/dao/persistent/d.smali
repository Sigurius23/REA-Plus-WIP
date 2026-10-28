.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    iput p3, p0, Lcom/whoop/data/local/room/dao/persistent/d;->w:I

    iput-wide p1, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lyt0/f;->h(JLtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Ly3/c;

    invoke-static {v0, v1, p1}, Lwm1/k;->j(JLy3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Ly3/c;

    invoke-static {v0, v1, p1}, Lwm1/k;->f(JLy3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Ly81/i;

    invoke-static {v0, v1, p1}, Lw61/d;->a(JLy81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lt61/b;->d(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1}, Lhy0/i2;->b(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-wide v0, p0, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->c(JLtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
