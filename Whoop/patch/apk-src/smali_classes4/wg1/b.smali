.class public final Lwg1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwg1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lwg1/b;",
        "Lwg1/a;",
        "Ltr2/n;",
        "logger",
        "Lic/p0;",
        "workManager",
        "Lrg1/c;",
        "fwUpdateStateMachine",
        "<init>",
        "(Ltr2/n;Lic/p0;Lrg1/c;)V",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "",
        "userAcceptanceRequired",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V",
        "a",
        "Ltr2/n;",
        "Lic/p0;",
        "c",
        "Lrg1/c;",
        "d",
        "firmware-update-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lwg1/b$a;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lic/p0;

.field private final c:Lrg1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwg1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwg1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwg1/b;->d:Lwg1/b$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lic/p0;Lrg1/c;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwUpdateStateMachine"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwg1/b;->a:Ltr2/n;

    iput-object p2, p0, Lwg1/b;->b:Lic/p0;

    iput-object p3, p0, Lwg1/b;->c:Lrg1/c;

    return-void
.end method

.method private final b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V
    .locals 13

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "whoopDeviceSerialized"

    invoke-static {p1}, Lvg1/a;->b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "userAcceptanceRequired"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lic/g;

    invoke-direct {p2, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {p2}, Lpf/c;->X(Lic/g;)[B

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

    new-instance v0, Lic/z;

    const-class v2, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    sget-object v2, Lic/i0;->w:Lic/i0;

    iget-object v3, v0, Lic/q0;->c:Lqc/q;

    const/4 v4, 0x1

    iput-boolean v4, v3, Lqc/q;->q:Z

    iput-object v2, v3, Lqc/q;->r:Lic/i0;

    invoke-virtual {v0, p2}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p2

    check-cast p2, Lic/z;

    invoke-virtual {p2, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object p2

    check-cast p2, Lic/z;

    sget-object v0, Lic/a;->x:Lic/a;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p2

    check-cast p2, Lic/z;

    invoke-virtual {p2}, Lic/q0;->b()Lic/r0;

    move-result-object p2

    check-cast p2, Lic/a0;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FirmwareUpdateWorker_"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lwg1/b;->a:Ltr2/n;

    const-string v1, "Enqueueing "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lwg1/b;->b:Lic/p0;

    sget-object v1, Lic/l;->w:Lic/l;

    invoke-virtual {v0, p1, v1, p2}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method


# virtual methods
.method public a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-direct {p0, p1, p2}, Lwg1/b;->b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lwg1/b;->c:Lrg1/c;

    invoke-virtual {v0, p1}, Lrg1/c;->d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lwg1/b;->b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V

    return-void

    :cond_1
    iget-object p2, p0, Lwg1/b;->a:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Firmware update already in progress for device: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
