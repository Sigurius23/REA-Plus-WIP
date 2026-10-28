.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    iput-object p2, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/whoop/data/local/room/dao/persistent/h;->w:I

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    iput p2, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UPDATE workspec SET stop_reason=? WHERE id=?"

    invoke-interface {p1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v2, 0x1

    int-to-long v3, v0

    :try_start_0
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)"

    invoke-interface {p1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v2, 0x1

    :try_start_1
    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    invoke-interface {p1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v2, 0x1

    :try_start_2
    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string v0, "work_spec_id"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "generation"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "system_id"

    invoke-static {p1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v1, v3

    invoke-interface {p1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v3, Lqc/h;

    invoke-direct {v3, v0, v1, v2}, Lqc/h;-><init>(Ljava/lang/String;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_2
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/h;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/persistent/h;->x:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->e(ILjava/lang/String;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
