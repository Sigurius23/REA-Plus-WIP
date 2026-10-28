.class public final Lmx0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lmx0/b;",
        "",
        "Lic/p0;",
        "workManager",
        "Ltr2/n;",
        "logger",
        "Ljx0/f;",
        "dataSyncWorkDatabaseManager",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Lic/p0;Ltr2/n;Ljx0/f;Ljava/time/Clock;)V",
        "Ljava/util/UUID;",
        "id",
        "Ldt0/b;",
        "request",
        "Ll83/a0;",
        "b",
        "(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;",
        "e",
        "(Ldt0/b;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "triggerSource",
        "",
        "d",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lic/p0;",
        "c",
        "()Lic/p0;",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "Ljx0/f;",
        "getDataSyncWorkDatabaseManager",
        "()Ljx0/f;",
        "Ljava/time/Clock;",
        "getClock",
        "()Ljava/time/Clock;",
        "data-sync-service_release"
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
.field private final a:Lic/p0;

.field private final b:Ltr2/n;

.field private final c:Ljx0/f;

.field private final d:Ljava/time/Clock;


# direct methods
.method public constructor <init>(Lic/p0;Ltr2/n;Ljx0/f;Ljava/time/Clock;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncWorkDatabaseManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx0/b;->a:Lic/p0;

    iput-object p2, p0, Lmx0/b;->b:Ltr2/n;

    iput-object p3, p0, Lmx0/b;->c:Ljx0/f;

    iput-object p4, p0, Lmx0/b;->d:Ljava/time/Clock;

    return-void
.end method

.method public static final synthetic a(Lmx0/b;Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lmx0/b;->b(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Ldt0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lmx0/b$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lmx0/b$a;

    iget v2, v1, Lmx0/b$a;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lmx0/b$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lmx0/b$a;

    invoke-direct {v1, p0, v0}, Lmx0/b$a;-><init>(Lmx0/b;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lmx0/b$a;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lmx0/b$a;->F:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lmx0/b$a;->y:Ljava/lang/Object;

    check-cast p1, Ljx0/a;

    iget-object p1, v1, Lmx0/b$a;->x:Ljava/lang/Object;

    check-cast p1, Ldt0/b;

    iget-object v1, v1, Lmx0/b$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/UUID;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v3, p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance v5, Ljx0/a;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "toString(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ldt0/b;->a()Ldt0/c;

    move-result-object p1

    invoke-virtual {p1}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Ldt0/b;->a()Ldt0/c;

    move-result-object p1

    invoke-virtual {p1}, Ldt0/c;->f()J

    move-result-wide v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v5 .. v13}, Ljx0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJII)V

    iget-object p1, p0, Lmx0/b;->c:Ljx0/f;

    const/4 v0, 0x0

    iput-object v0, v1, Lmx0/b$a;->w:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v3, p2

    :try_start_2
    iput-object v3, v1, Lmx0/b$a;->x:Ljava/lang/Object;

    iput-object v0, v1, Lmx0/b$a;->y:Ljava/lang/Object;

    iput v4, v1, Lmx0/b$a;->F:I

    invoke-virtual {p1, v5, v1}, Ljx0/f;->d(Ljx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-ne p1, v2, :cond_3

    return-object v2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object/from16 v3, p2

    :goto_1
    iget-object p1, p0, Lmx0/b;->b:Ltr2/n;

    invoke-virtual {v3}, Ldt0/b;->a()Ldt0/c;

    move-result-object v1

    invoke-virtual {v1}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Couldn\'t insert new data sync request to db. Source: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final c()Lic/p0;
    .locals 1

    iget-object v0, p0, Lmx0/b;->a:Lic/p0;

    return-object v0
.end method

.method public final d(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmx0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmx0/b$b;

    iget v1, v0, Lmx0/b$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmx0/b$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmx0/b$b;

    invoke-direct {v0, p0, p2}, Lmx0/b$b;-><init>(Lmx0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmx0/b$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmx0/b$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmx0/b$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lmx0/b;->c:Ljx0/f;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lmx0/b;->d:Ljava/time/Clock;

    invoke-virtual {v2}, Ljava/time/Clock;->millis()J

    move-result-wide v4

    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v2, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    const/16 v6, 0xf

    invoke-static {v6, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v6

    sub-long/2addr v4, v6

    const/4 v2, 0x0

    iput-object v2, v0, Lmx0/b$b;->w:Ljava/lang/Object;

    iput v3, v0, Lmx0/b$b;->z:I

    invoke-virtual {p2, p1, v4, v5, v0}, Ljx0/f;->b(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    xor-int/2addr p1, v3

    goto :goto_3

    :goto_2
    iget-object p2, p0, Lmx0/b;->b:Ltr2/n;

    const-string v0, "Could not read from data sync database"

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move p1, v1

    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ldt0/b;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrc/e;

    sget-object v0, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v3, Lic/x;->x:Lic/x;

    new-instance v2, Lrc/e;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lic/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    move-wide v10, v8

    invoke-direct/range {v1 .. v12}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    invoke-virtual {p1}, Ldt0/b;->a()Ldt0/c;

    move-result-object v0

    invoke-virtual {v0}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v0

    sget-object v2, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->APP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-class v3, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    if-ne v0, v2, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v2, Lic/j0;

    invoke-direct {v2, v3}, Lic/j0;-><init>(Ljava/lang/Class;)V

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4, v0}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    const-string v2, "DATA_SYNC_INTERVAL_TAG"

    invoke-virtual {v0, v2}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    iget-object v3, v0, Lic/q0;->c:Lqc/q;

    iput-object v2, v3, Lqc/q;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    iget-object v1, p0, Lmx0/b;->a:Lic/p0;

    sget-object v3, Lic/k;->x:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, v0, Lic/r0;->a:Ljava/util/UUID;

    invoke-direct {p0, v0, p1, p2}, Lmx0/b;->b(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->Companion:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

    invoke-virtual {p1}, Ldt0/b;->a()Ldt0/c;

    move-result-object v2

    invoke-virtual {v2}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;->isProcessNow(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    new-instance v0, Lic/z;

    invoke-direct {v0, v3}, Lic/q0;-><init>(Ljava/lang/Class;)V

    const-string v3, "DATA_SYNC_PROCESS_NOW_TAG"

    invoke-virtual {v0, v3}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    iget-object v4, v0, Lic/q0;->c:Lqc/q;

    iput-object v3, v4, Lqc/q;->x:Ljava/lang/String;

    sget-object v4, Lic/i0;->w:Lic/i0;

    iget-object v5, v0, Lic/q0;->c:Lqc/q;

    iput-boolean v2, v5, Lqc/q;->q:Z

    iput-object v4, v5, Lqc/q;->r:Lic/i0;

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    iget-object v1, p0, Lmx0/b;->a:Lic/p0;

    sget-object v2, Lic/l;->w:Lic/l;

    invoke-virtual {v1, v3, v0}, Lic/p0;->a(Ljava/lang/String;Lic/a0;)Ljc/o;

    move-result-object v1

    invoke-virtual {v1}, Ljc/o;->U()Lic/e0;

    iget-object v0, v0, Lic/r0;->a:Ljava/util/UUID;

    invoke-direct {p0, v0, p1, p2}, Lmx0/b;->b(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_1
    new-instance v0, Lic/z;

    invoke-direct {v0, v3}, Lic/q0;-><init>(Ljava/lang/Class;)V

    const-string v3, "DATA_SYNC_UPLOAD_TAG"

    invoke-virtual {v0, v3}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    iget-object v4, v0, Lic/q0;->c:Lqc/q;

    iput-object v3, v4, Lqc/q;->x:Ljava/lang/String;

    sget-object v4, Lic/i0;->w:Lic/i0;

    iget-object v5, v0, Lic/q0;->c:Lqc/q;

    iput-boolean v2, v5, Lqc/q;->q:Z

    iput-object v4, v5, Lqc/q;->r:Lic/i0;

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    iget-object v1, p0, Lmx0/b;->a:Lic/p0;

    sget-object v2, Lic/l;->w:Lic/l;

    invoke-virtual {v1, v3, v0}, Lic/p0;->a(Ljava/lang/String;Lic/a0;)Ljc/o;

    move-result-object v1

    invoke-virtual {v1}, Ljc/o;->U()Lic/e0;

    iget-object v0, v0, Lic/r0;->a:Ljava/util/UUID;

    invoke-direct {p0, v0, p1, p2}, Lmx0/b;->b(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
