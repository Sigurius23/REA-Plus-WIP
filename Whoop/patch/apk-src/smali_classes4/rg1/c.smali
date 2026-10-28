.class public final Lrg1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001cR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lrg1/c;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "Lec3/p1;",
        "Lgt0/h;",
        "c",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/p1;",
        "whoopFwDevice",
        "",
        "d",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Z",
        "Lec3/f2;",
        "b",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;",
        "progress",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;Lq83/d;)Ljava/lang/Object;",
        "",
        "f",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)I",
        "e",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "retryCount",
        "stateMachine",
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
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lec3/p1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lrg1/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private final c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/p1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            ")",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lgt0/h$h;->b:Lgt0/h$h;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lec3/p1;

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            "Lgt0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2, p3}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, Lrg1/c;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2, p3}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v1
.end method

.method public final b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "whoopFwDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lrg1/c;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/p1;

    move-result-object v0

    :cond_0
    check-cast v0, Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Z
    .locals 2

    const-string v0, "whoopFwDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrg1/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec3/p1;

    if-eqz p1, :cond_0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgt0/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    instance-of p1, p1, Lgt0/h$g;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final e(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrg1/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)I
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrg1/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrg1/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lrg1/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method
