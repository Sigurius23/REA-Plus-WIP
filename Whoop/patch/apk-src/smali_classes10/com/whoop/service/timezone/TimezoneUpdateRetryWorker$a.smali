.class public final Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;",
        "",
        "<init>",
        "()V",
        "Lic/a0;",
        "a",
        "()Lic/a0;",
        "",
        "WORK_NAME",
        "Ljava/lang/String;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lic/a0;
    .locals 13

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

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "start_time"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lic/g;

    invoke-direct {v2, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v2}, Lpf/c;->X(Lic/g;)[B

    new-instance v0, Lic/z;

    const-class v3, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;

    invoke-direct {v0, v3}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0, v2}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v2, 0xa

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    return-object v0
.end method
