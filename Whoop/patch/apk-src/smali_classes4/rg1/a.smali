.class public final Lrg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lrg1/a;",
        "Lgt0/e;",
        "Ltr2/n;",
        "logger",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lrg1/b;",
        "firmwareUpdateManager",
        "Lwg1/a;",
        "firmwareUpdateScheduler",
        "Lgt0/d;",
        "firmwareAnalyticsHelper",
        "<init>",
        "(Ltr2/n;Lci2/b;Lrg1/b;Lwg1/a;Lgt0/d;)V",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "",
        "userAcceptanceRequired",
        "Lec3/l;",
        "Lgt0/h;",
        "c",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;",
        "a",
        "()Z",
        "Lgt0/g;",
        "action",
        "b",
        "(Lgt0/g;)Lec3/l;",
        "Ltr2/n;",
        "Lci2/b;",
        "Lrg1/b;",
        "d",
        "Lwg1/a;",
        "e",
        "Lgt0/d;",
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


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lci2/b;

.field private final c:Lrg1/b;

.field private final d:Lwg1/a;

.field private final e:Lgt0/d;


# direct methods
.method public constructor <init>(Ltr2/n;Lci2/b;Lrg1/b;Lwg1/a;Lgt0/d;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareUpdateManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareUpdateScheduler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareAnalyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg1/a;->a:Ltr2/n;

    iput-object p2, p0, Lrg1/a;->b:Lci2/b;

    iput-object p3, p0, Lrg1/a;->c:Lrg1/b;

    iput-object p4, p0, Lrg1/a;->d:Lwg1/a;

    iput-object p5, p0, Lrg1/a;->e:Lgt0/d;

    return-void
.end method

.method private final c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lrg1/a;->d:Lwg1/a;

    invoke-interface {v3, p1, p2}, Lwg1/a;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V

    iget-object p2, p0, Lrg1/a;->c:Lrg1/b;

    invoke-interface {p2, p1}, Lrg1/b;->d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    iget-object p2, p0, Lrg1/a;->a:Ltr2/n;

    const-string v3, "Something went wrong when trying to serialize WhoopFwDevice to String"

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p2, v3, p1, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lgt0/h$b;

    sget-object p2, Lgt0/f$i;->b:Lgt0/f$i;

    invoke-direct {p1, p2, v2, v1, v0}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, La6/u;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_2

    :goto_1
    iget-object p2, p0, Lrg1/a;->a:Ltr2/n;

    const-string v3, "Failed to serialize WhoopFwDevice to String"

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p2, v3, p1, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lgt0/h$b;

    sget-object p2, Lgt0/f$i;->b:Lgt0/f$i;

    invoke-direct {p1, p2, v2, v1, v0}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, La6/u;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_2
    return-object p2
.end method


# virtual methods
.method public a()Z
    .locals 11

    iget-object v0, p0, Lrg1/a;->b:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    iget-object v2, p0, Lrg1/a;->c:Lrg1/b;

    invoke-interface {v2, v0}, Lrg1/b;->d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgt0/h;

    instance-of v3, v2, Lgt0/h$g;

    if-eqz v3, :cond_0

    check-cast v2, Lgt0/h$g;

    invoke-virtual {v2}, Lgt0/h$g;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lrg1/a;->e:Lgt0/d;

    sget-object v3, Lgt0/b;->LIVE_FEATURE:Lgt0/b;

    sget-object v4, Lgt0/c;->BLOCKED:Lgt0/c;

    invoke-virtual {v0}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return v1
.end method

.method public b(Lgt0/g;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgt0/g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgt0/g$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrg1/a;->c:Lrg1/b;

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-interface {v0, p1}, Lrg1/b;->e(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lgt0/g$a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lrg1/a;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lgt0/g$e;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lrg1/a;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lgt0/g$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lrg1/a;->c:Lrg1/b;

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-interface {v0, p1}, Lrg1/b;->d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lgt0/g$f;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lrg1/a;->c:Lrg1/b;

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-interface {v0, p1}, Lrg1/b;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lgt0/g$c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lrg1/a;->c:Lrg1/b;

    invoke-virtual {p1}, Lgt0/g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-interface {v0, p1}, Lrg1/b;->b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
