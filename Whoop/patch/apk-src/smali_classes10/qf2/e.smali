.class public abstract Lqf2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a<\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhj0/n;",
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "smartAlarmApi",
        "Lrf2/a;",
        "smartAlarmUserInfoDao",
        "Lrr2/c;",
        "crashReporter",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
        "info",
        "",
        "a",
        "(Lhj0/n;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lrf2/a;Lrr2/c;Ltr2/n;Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;",
        "smart-alarm_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lhj0/n;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lrf2/a;Lrr2/c;Ltr2/n;Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj0/n;",
            "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
            "Lrf2/a;",
            "Lrr2/c;",
            "Ltr2/n;",
            "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lqf2/e$a;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lqf2/e$a;

    iget v1, v0, Lqf2/e$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqf2/e$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqf2/e$a;

    invoke-direct {v0, p6}, Lqf2/e$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p6, v0, Lqf2/e$a;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqf2/e$a;->I:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lqf2/e$a;->G:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object p1, v0, Lqf2/e$a;->F:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    iget-object p1, v0, Lqf2/e$a;->E:Ljava/lang/Object;

    check-cast p1, Ltr2/n;

    iget-object p2, v0, Lqf2/e$a;->z:Ljava/lang/Object;

    check-cast p2, Lrr2/c;

    iget-object p3, v0, Lqf2/e$a;->y:Ljava/lang/Object;

    check-cast p3, Lrf2/a;

    iget-object p3, v0, Lqf2/e$a;->x:Ljava/lang/Object;

    check-cast p3, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    iget-object p3, v0, Lqf2/e$a;->w:Ljava/lang/Object;

    check-cast p3, Lhj0/n;

    :try_start_0
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p3

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lqf2/e$a;->F:Ljava/lang/Object;

    move-object p5, p0

    check-cast p5, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    iget-object p0, v0, Lqf2/e$a;->E:Ljava/lang/Object;

    move-object p4, p0

    check-cast p4, Ltr2/n;

    iget-object p0, v0, Lqf2/e$a;->z:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Lrr2/c;

    iget-object p0, v0, Lqf2/e$a;->y:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lrf2/a;

    iget-object p0, v0, Lqf2/e$a;->x:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    iget-object p0, v0, Lqf2/e$a;->w:Ljava/lang/Object;

    check-cast p0, Lhj0/n;

    :try_start_1
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lqf2/e$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lqf2/e$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqf2/e$a;->y:Ljava/lang/Object;

    iput-object p3, v0, Lqf2/e$a;->z:Ljava/lang/Object;

    iput-object p4, v0, Lqf2/e$a;->E:Ljava/lang/Object;

    iput-object p5, v0, Lqf2/e$a;->F:Ljava/lang/Object;

    iput v3, v0, Lqf2/e$a;->I:I

    invoke-interface {p1, p5, v0}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->postSmartAlarmUserInfoAlarmService(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_1
    check-cast p6, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->toSmartAlarmUserInfo()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_2
    move-object p1, p4

    goto :goto_4

    :goto_3
    new-instance p6, Ljava/lang/StringBuilder;

    const-string v2, "Failed to post new smart alarm settings "

    invoke-direct {p6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p0, p1, p5}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-object p0, v5

    goto :goto_2

    :goto_4
    if-nez p0, :cond_5

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_5
    :try_start_3
    iput-object v5, v0, Lqf2/e$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lqf2/e$a;->x:Ljava/lang/Object;

    iput-object v5, v0, Lqf2/e$a;->y:Ljava/lang/Object;

    iput-object p3, v0, Lqf2/e$a;->z:Ljava/lang/Object;

    iput-object p1, v0, Lqf2/e$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lqf2/e$a;->F:Ljava/lang/Object;

    iput-object p0, v0, Lqf2/e$a;->G:Ljava/lang/Object;

    iput v4, v0, Lqf2/e$a;->I:I

    invoke-interface {p2, p0, v0}, Lrf2/a;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-ne p0, v1, :cond_6

    :goto_5
    return-object v1

    :catch_2
    move-exception p2

    move-object v6, p3

    move-object p3, p2

    move-object p2, v6

    :goto_6
    new-instance p4, Lcom/whoop/smart/alarm/data/util/SmartAlarmException;

    const-string p5, "Posted new smart alarm settings to backend, but failed to cache result locally.\nThe strap and our backend will be correct, but the user will see their out-of-date\nalarm settings in the app\'s UI."

    invoke-direct {p4, p5, p3}, Lcom/whoop/smart/alarm/data/util/SmartAlarmException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, p4, v5, v4, v5}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    const/4 p2, 0x0

    new-array p3, p2, [Lqr2/a$a;

    invoke-interface {p1, p5, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Result which wasn\'t cached: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, p0, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_6
    :goto_7
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method
