.class public final synthetic Lmm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lom/a;
.implements Lh5/u;
.implements Lbh3/g;
.implements Lp73/b;
.implements Lor/m;
.implements Lcq/f;
.implements Lo9/n;
.implements Lx8/d;
.implements Lnx/e;
.implements Lqw/o;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lmm/d;->w:I

    iput-object p1, p0, Lmm/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/Display;)V
    .locals 5

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lmo/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v1, p1

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v3, v1

    double-to-long v1, v3

    iput-wide v1, v0, Lmo/p;->i:J

    const-wide/16 v3, 0x50

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x64

    div-long/2addr v1, v3

    iput-wide v1, v0, Lmo/p;->j:J

    return-void

    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    const-string v1, "Unable to query display refresh rate"

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lmo/p;->i:J

    iput-wide v1, v0, Lmo/p;->j:J

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 7

    iget v0, p0, Lmm/d;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lqm2/i;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->U(Lqm2/i;Ljava/lang/Object;)V

    return-void

    :sswitch_0
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lqm2/i;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O(Lqm2/i;Ljava/lang/Object;)V

    return-void

    :sswitch_1
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lzr/d0;

    check-cast p1, Lqa/a;

    invoke-virtual {v0, p1}, Lzr/a0;->a(Ljava/lang/Object;)V

    return-void

    :sswitch_2
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lqa/h;

    check-cast p1, Lqa/a;

    new-instance v1, Lqa/g;

    iget-wide v2, p1, Lqa/a;->b:J

    iget-object v4, p1, Lqa/a;->a:Lzr/g0;

    iget-wide v5, p1, Lqa/a;->c:J

    invoke-static {v4, v5, v6}, Lng3/n;->h(Lzr/g0;J)[B

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lqa/g;-><init>(J[B)V

    iget-object v2, v0, Lqa/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v2, v0, Lqa/h;->j:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    iget-wide v4, p1, Lqa/a;->b:J

    cmp-long p1, v4, v2

    if-ltz p1, :cond_1

    :cond_0
    invoke-virtual {v0, v1}, Lqa/h;->a(Lqa/g;)V

    :cond_1
    return-void

    :sswitch_3
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->N(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :sswitch_4
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lo52/m;

    invoke-static {v0, p1}, Lo52/n;->P(Lo52/m;Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_4
        0xa -> :sswitch_3
        0x13 -> :sswitch_2
        0x14 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmm/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lod1/s;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lod1/s;->b(Lod1/s;Ljava/util/List;)Lxg3/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lny0/m;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->I(Lny0/m;Ljava/lang/Object;)Lxg3/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public c(ILu8/p0;[I)Lzr/w0;
    .locals 7

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo9/j;

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v1, p2, Lu8/p0;->a:I

    if-ge v4, v1, :cond_0

    new-instance v1, Lo9/g;

    aget v6, p3, v4

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lo9/g;-><init>(ILu8/p0;ILo9/j;I)V

    invoke-virtual {v0, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    return-object p1
.end method

.method public construct()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lmm/d;->w:I

    iget-object v1, p0, Lmm/d;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/lang/reflect/Constructor;

    const-string v0, "\' with no args"

    const-string v2, "Failed to invoke constructor \'"

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Ltw/c;->a:Ls30/b;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v3

    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ltw/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_2
    move-exception v3

    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ltw/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_0
    check-cast v1, Ljava/lang/Class;

    :try_start_1
    sget-object v0, Lqw/t;->a:Lqw/t;

    invoke-virtual {v0, v1}, Lqw/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    return-object v0

    :catch_3
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to create instance of "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public execute()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lmm/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v1, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lnm/d;

    check-cast v1, Lnm/i;

    new-instance v2, Llive/hms/video/factories/c;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {v1, v2}, Lnm/i;->i(Lnm/g;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgm/i;

    iget-object v3, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v3, Lgm/r;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v3, v2, v5, v4}, Lgm/r;->O(Lgm/i;IZ)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lev/i;

    iget-object v0, v0, Lev/i;->i:Ljava/lang/Object;

    check-cast v0, Lnm/c;

    check-cast v0, Lnm/i;

    invoke-virtual {v0}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    const-string v2, "DELETE FROM log_event_dropped"

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lnm/i;->x:Lpm/a;

    invoke-interface {v0}, Lpm/a;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lnm/d;

    check-cast v0, Lnm/i;

    iget-object v1, v0, Lnm/i;->x:Lpm/a;

    invoke-interface {v1}, Lpm/a;->getTime()J

    move-result-wide v1

    iget-object v3, v0, Lnm/i;->z:Lnm/a;

    iget-wide v3, v3, Lnm/a;->d:J

    sub-long/2addr v1, v3

    invoke-virtual {v0}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_1
    const-string v4, "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x1

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    int-to-long v6, v4

    sget-object v4, Ljm/c;->y:Ljm/c;

    invoke-virtual {v0, v6, v7, v4, v5}, Lnm/i;->m(JLjm/c;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :cond_1
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    const-string v0, "events"

    const-string v2, "timestamp_ms < ?"

    invoke-virtual {v3, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lor/h;I)V
    .locals 1

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/j;

    invoke-static {v0, p1, p2}, Lcom/whoop/realtime/presentation/j;->J(Lcom/whoop/realtime/presentation/j;Lor/h;I)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lmm/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/w;

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->o(Lio/w;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lrm/m0;

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->s(Lrm/m0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    iget v0, p0, Lmm/d;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->K(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->K(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/debug/PushDebugFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/debug/PushDebugFragment;->c0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lmm/d;->w:I

    iget-object v1, p0, Lmm/d;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast v1, Lp5/e;

    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-virtual {v1, p1}, Lp5/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast v1, Lp5/e;

    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-virtual {v1, p1}, Lp5/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v1, Lp5/e;

    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-virtual {v1, p1}, Lp5/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_3
    check-cast v1, Lp5/e;

    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-virtual {v1, p1}, Lp5/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_4
    check-cast v1, Lp5/c;

    invoke-static {v1, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$KkkjfkO_ppPgKkxx-IfBnKmqAeg(Lp5/c;Ljava/lang/Object;)V

    return-void

    :pswitch_5
    check-cast v1, Lo52/l0;

    invoke-static {v1, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->G(Lo52/l0;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
