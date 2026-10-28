.class public final Lmi1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmi1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\n2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lmi1/c;",
        "Lmi1/a;",
        "Ltr2/n;",
        "logger",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Ltr2/n;Lci2/b;)V",
        "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;",
        "notificationHapticsPattern",
        "Lmi1/b;",
        "d",
        "(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;",
        "",
        "alarmId",
        "c",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "Lcom/whoop/domain/model/haptics/StoredAlarm;",
        "storedAlarmList",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
        "strapAlarmIdentifiable",
        "b",
        "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lci2/b;",
        "Ljk0/d;",
        "e",
        "()Ljk0/d;",
        "whoopStrap",
        "hapticsStrapService_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lci2/b;


# direct methods
.method public constructor <init>(Ltr2/n;Lci2/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi1/c;->a:Ltr2/n;

    iput-object p2, p0, Lmi1/c;->b:Lci2/b;

    return-void
.end method

.method private final e()Ljk0/d;
    .locals 1

    iget-object v0, p0, Lmi1/c;->b:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/haptics/StoredAlarm;",
            ">;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lmi1/c$d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lmi1/c$d;

    iget v2, v1, Lmi1/c$d;->H:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lmi1/c$d;->H:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lmi1/c$d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lmi1/c$d;-><init>(Lmi1/c;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lmi1/c$d;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lmi1/c$d;->H:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v1, Lmi1/c$d;->y:Ljava/lang/Object;

    check-cast v3, Lmi1/b;

    iget-object v4, v1, Lmi1/c$d;->x:Ljava/lang/Object;

    check-cast v4, Ljk0/d;

    iget-object v1, v1, Lmi1/c$d;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v1, Lmi1/c$d;->E:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/haptics/StoredAlarm;

    iget-object v4, v1, Lmi1/c$d;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v8, v1, Lmi1/c$d;->y:Ljava/lang/Object;

    check-cast v8, Lmi1/b;

    iget-object v8, v1, Lmi1/c$d;->x:Ljava/lang/Object;

    check-cast v8, Ljk0/d;

    iget-object v9, v1, Lmi1/c$d;->w:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v1

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v2}, Lmi1/c;->e()Ljk0/d;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lmi1/b$f;->a:Lmi1/b$f;

    return-object v0

    :cond_4
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v8, v0

    move-object v15, v1

    move-object v0, v7

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/haptics/StoredAlarm;

    invoke-virtual {v0}, Lcom/whoop/domain/model/haptics/StoredAlarm;->getStrapAlarmIdentifiable()Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;->getStrapAlarmId()I

    move-result v9

    invoke-virtual {v0}, Lcom/whoop/domain/model/haptics/StoredAlarm;->getHapticsPattern()Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/domain/model/haptics/StoredAlarm;->getAlarmTimeMillis()J

    move-result-wide v11

    iput-object v7, v15, Lmi1/c$d;->w:Ljava/lang/Object;

    iput-object v8, v15, Lmi1/c$d;->x:Ljava/lang/Object;

    iput-object v7, v15, Lmi1/c$d;->y:Ljava/lang/Object;

    iput-object v4, v15, Lmi1/c$d;->z:Ljava/lang/Object;

    iput-object v7, v15, Lmi1/c$d;->E:Ljava/lang/Object;

    iput v6, v15, Lmi1/c$d;->H:I

    const-wide/16 v13, 0x0

    const/16 v16, 0x8

    const/16 v17, 0x0

    invoke-static/range {v8 .. v17}, Ljk0/d;->u0(Ljk0/d;ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;JJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    goto :goto_5

    :cond_5
    :goto_2
    check-cast v0, Lzj0/v0;

    if-nez v0, :cond_7

    sget-object v0, Lmi1/b$d;->a:Lmi1/b$d;

    :cond_6
    :goto_3
    move-object v11, v15

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lzj0/h;->W()Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Lmi1/b$c;

    invoke-virtual {v0}, Lzj0/v0;->d0()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object v0

    invoke-direct {v1, v0}, Lmi1/b$c;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    move-object v0, v1

    goto :goto_1

    :cond_8
    new-instance v1, Lmi1/b$b;

    invoke-virtual {v0}, Lzj0/v0;->d0()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object v0

    invoke-direct {v1, v0}, Lmi1/b$b;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    move-object v0, v1

    goto :goto_3

    :goto_4
    if-nez v0, :cond_9

    new-instance v0, Lmi1/b$e;

    const-string v1, "Stored alarm list is empty!"

    invoke-direct {v0, v1}, Lmi1/b$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_9
    instance-of v1, v0, Lmi1/b$c;

    if-eqz v1, :cond_a

    return-object v0

    :cond_a
    iput-object v7, v11, Lmi1/c$d;->w:Ljava/lang/Object;

    iput-object v7, v11, Lmi1/c$d;->x:Ljava/lang/Object;

    iput-object v0, v11, Lmi1/c$d;->y:Ljava/lang/Object;

    iput-object v7, v11, Lmi1/c$d;->z:Ljava/lang/Object;

    iput-object v7, v11, Lmi1/c$d;->E:Ljava/lang/Object;

    iput v5, v11, Lmi1/c$d;->H:I

    const-wide/16 v9, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Ljk0/d;->t0(Ljk0/d;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_5
    return-object v3

    :cond_b
    return-object v0
.end method

.method public b(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmi1/c$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmi1/c$b;

    iget v1, v0, Lmi1/c$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmi1/c$b;->E:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmi1/c$b;

    invoke-direct {v0, p0, p2}, Lmi1/c$b;-><init>(Lmi1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v5, Lmi1/c$b;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lmi1/c$b;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v5, Lmi1/c$b;->x:Ljava/lang/Object;

    check-cast p1, Ljk0/d;

    iget-object p1, v5, Lmi1/c$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lmi1/c;->e()Ljk0/d;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object p1, Lmi1/b$f;->a:Lmi1/b$f;

    return-object p1

    :cond_3
    new-instance v4, Lxj0/i0$b;

    invoke-virtual {p1}, Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;->getStrapAlarmId()I

    move-result p1

    invoke-direct {v4, p1}, Lxj0/i0$b;-><init>(I)V

    const/4 p1, 0x0

    iput-object p1, v5, Lmi1/c$b;->w:Ljava/lang/Object;

    iput-object p1, v5, Lmi1/c$b;->x:Ljava/lang/Object;

    iput v2, v5, Lmi1/c$b;->E:I

    const-wide/16 v2, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Ljk0/d;->J0(Ljk0/d;JLxj0/i0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p2, Lzj0/p0;

    if-nez p2, :cond_5

    sget-object p1, Lmi1/b$d;->a:Lmi1/b$d;

    return-object p1

    :cond_5
    invoke-virtual {p2}, Lzj0/h;->W()Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lmi1/b$c;

    invoke-virtual {p2}, Lzj0/p0;->d0()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object p2

    invoke-direct {p1, p2}, Lmi1/b$c;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    return-object p1

    :cond_6
    new-instance p1, Lmi1/b$b;

    invoke-virtual {p2}, Lzj0/p0;->d0()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object p2

    invoke-direct {p1, p2}, Lmi1/b$b;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    return-object p1
.end method

.method public c(ILq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmi1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmi1/c$a;

    iget v1, v0, Lmi1/c$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmi1/c$a;->E:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmi1/c$a;

    invoke-direct {v0, p0, p2}, Lmi1/c$a;-><init>(Lmi1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v5, Lmi1/c$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lmi1/c$a;->E:I

    const/4 v8, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v8, :cond_1

    iget-object p1, v5, Lmi1/c$a;->x:Ljava/lang/Object;

    check-cast p1, Ljk0/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lmi1/c;->e()Ljk0/d;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object p1, Lmi1/b$f;->a:Lmi1/b$f;

    return-object p1

    :cond_3
    const/4 p2, 0x0

    iput-object p2, v5, Lmi1/c$a;->x:Ljava/lang/Object;

    iput p1, v5, Lmi1/c$a;->w:I

    iput v8, v5, Lmi1/c$a;->E:I

    const-wide/16 v2, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move v4, p1

    invoke-static/range {v1 .. v7}, Ljk0/d;->r(Ljk0/d;JILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p2, Lzj0/m;

    if-nez p2, :cond_5

    sget-object p1, Lmi1/b$d;->a:Lmi1/b$d;

    return-object p1

    :cond_5
    invoke-virtual {p2}, Lzj0/h;->W()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lmi1/b$a;

    invoke-virtual {p2}, Lzj0/c;->c0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v8, 0x0

    :goto_3
    invoke-virtual {p2}, Lzj0/c;->c0()J

    move-result-wide v0

    invoke-direct {p1, v8, v0, v1}, Lmi1/b$a;-><init>(ZJ)V

    return-object p1

    :cond_7
    new-instance p1, Lmi1/b$b;

    sget-object p2, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->UNKNOWN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    invoke-direct {p1, p2}, Lmi1/b$b;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    return-object p1
.end method

.method public d(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmi1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmi1/c$c;

    iget v1, v0, Lmi1/c$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmi1/c$c;->F:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmi1/c$c;

    invoke-direct {v0, p0, p2}, Lmi1/c$c;-><init>(Lmi1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v5, Lmi1/c$c;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lmi1/c$c;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v5, Lmi1/c$c;->y:Ljava/lang/Object;

    check-cast p1, Lxj0/j0;

    iget-object p1, v5, Lmi1/c$c;->x:Ljava/lang/Object;

    check-cast p1, Ljk0/d;

    iget-object p1, v5, Lmi1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lmi1/c;->e()Ljk0/d;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object p1, Lmi1/b$f;->a:Lmi1/b$f;

    return-object p1

    :cond_3
    move p2, v2

    new-instance v2, Lxj0/j0;

    invoke-direct {v2, p1}, Lxj0/j0;-><init>(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;)V

    const/4 p1, 0x0

    iput-object p1, v5, Lmi1/c$c;->w:Ljava/lang/Object;

    iput-object p1, v5, Lmi1/c$c;->x:Ljava/lang/Object;

    iput-object p1, v5, Lmi1/c$c;->y:Ljava/lang/Object;

    iput p2, v5, Lmi1/c$c;->F:I

    const-wide/16 v3, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Ljk0/d;->z0(Ljk0/d;Lxj0/j0;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p2, Lzj0/q0;

    if-nez p2, :cond_5

    sget-object p1, Lmi1/b$d;->a:Lmi1/b$d;

    return-object p1

    :cond_5
    invoke-virtual {p2}, Lzj0/h;->W()Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lmi1/b$c;

    invoke-virtual {p2}, Lzj0/q0;->X()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object p2

    invoke-direct {p1, p2}, Lmi1/b$c;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    return-object p1

    :cond_6
    new-instance p1, Lmi1/b$b;

    invoke-virtual {p2}, Lzj0/q0;->X()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object p2

    invoke-direct {p1, p2}, Lmi1/b$b;-><init>(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V

    return-object p1
.end method
