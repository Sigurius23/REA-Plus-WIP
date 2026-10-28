.class public final Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;",
        "",
        "<init>",
        "()V",
        "Lic/e;",
        "c",
        "()Lic/e;",
        "",
        "isConsole",
        "Lic/k0;",
        "e",
        "(Z)Lic/k0;",
        "Lic/a0;",
        "d",
        "(Z)Lic/a0;",
        "Lic/p0;",
        "workManager",
        "Ll83/a0;",
        "b",
        "(Lic/p0;)V",
        "a",
        "",
        "DATA_KEY_IS_CONSOLE",
        "Ljava/lang/String;",
        "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_CONSOLE",
        "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_FIRMWARE",
        "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_CONSOLE",
        "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_FIRMWARE",
        "puffin_release"
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
    invoke-direct {p0}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;-><init>()V

    return-void
.end method

.method private final c()Lic/e;
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

    return-object v1
.end method

.method private final d(Z)Lic/a0;
    .locals 3

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->c()Lic/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v2, "isConsole"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lic/g;

    invoke-direct {p1, v1}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {p1}, Lpf/c;->X(Lic/g;)[B

    invoke-virtual {v0, p1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    sget-object v0, Lic/a;->w:Lic/a;

    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    move-result-object v0

    const-string v1, "ofSeconds(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lic/a;->x:Lic/a;

    const/4 v2, 0x1

    iput-boolean v2, p1, Lic/q0;->a:Z

    iget-object v2, p1, Lic/q0;->c:Lqc/q;

    iput-object v1, v2, Lqc/q;->l:Lic/a;

    invoke-virtual {v0}, Ljava/time/Duration;->toMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lqc/q;->d(J)V

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method

.method private final e(Z)Lic/k0;
    .locals 4

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/time/Duration;->ofHours(J)Ljava/time/Duration;

    move-result-object v0

    const-string v1, "ofHours(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;

    invoke-direct {v1, v2, v0}, Lic/j0;-><init>(Ljava/lang/Class;Ljava/time/Duration;)V

    invoke-direct {p0}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->c()Lic/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v2, "isConsole"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lic/g;

    invoke-direct {p1, v1}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {p1}, Lpf/c;->X(Lic/g;)[B

    invoke-virtual {v0, p1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/j0;

    sget-object v0, Lic/a;->x:Lic/a;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/j0;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/k0;

    return-object p1
.end method


# virtual methods
.method public final a(Lic/p0;)V
    .locals 3

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/l;->x:Lic/l;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->d(Z)Lic/a0;

    move-result-object v1

    const-string v2, "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_CONSOLE"

    invoke-virtual {p1, v2, v0, v1}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->d(Z)Lic/a0;

    move-result-object v1

    const-string v2, "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_FIRMWARE"

    invoke-virtual {p1, v2, v0, v1}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method

.method public final b(Lic/p0;)V
    .locals 3

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/k;->w:Lic/k;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->e(Z)Lic/k0;

    move-result-object v1

    const-string v2, "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_CONSOLE"

    invoke-virtual {p1, v2, v0, v1}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->e(Z)Lic/k0;

    move-result-object v1

    const-string v2, "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_FIRMWARE"

    invoke-virtual {p1, v2, v0, v1}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method
