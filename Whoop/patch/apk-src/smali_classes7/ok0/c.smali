.class public abstract Lok0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lnj0/f$b;",
        "Lkt0/b;",
        "d",
        "(Lnj0/f$b;)Lkt0/b;",
        "Lzj0/h;",
        "Lkt0/a;",
        "f",
        "(Lzj0/h;)Lkt0/a;",
        "Ljava/time/Clock;",
        "clock",
        "Lst0/v;",
        "deviceType",
        "Lxj0/b;",
        "e",
        "(Ljava/time/Clock;Lst0/v;)Lxj0/b;",
        "",
        "Lnj0/f;",
        "a",
        "Ljava/util/Map;",
        "c",
        "()Ljava/util/Map;",
        "sensorHandshakes",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "logger",
        "connectivity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnj0/f;",
            "Lkt0/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lnj0/f;->a:Lnj0/f$a;

    invoke-virtual {v0}, Lnj0/f$a;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnj0/f$b;

    invoke-static {v1}, Lok0/c;->d(Lnj0/f$b;)Lkt0/b;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sput-object v2, Lok0/c;->a:Ljava/util/Map;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "SensorHandshake"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lok0/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Ljava/time/Clock;Lst0/v;)Lxj0/b;
    .locals 0

    invoke-static {p0, p1}, Lok0/c;->e(Ljava/time/Clock;Lst0/v;)Lxj0/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lzj0/h;)Lkt0/a;
    .locals 0

    invoke-static {p0}, Lok0/c;->f(Lzj0/h;)Lkt0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnj0/f;",
            "Lkt0/b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lok0/c;->a:Ljava/util/Map;

    return-object v0
.end method

.method private static final d(Lnj0/f$b;)Lkt0/b;
    .locals 2

    sget-object v0, Lnj0/f$b$b;->b:Lnj0/f$b$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lok0/a;

    invoke-direct {p0}, Lok0/a;-><init>()V

    return-object p0

    :cond_0
    sget-object v0, Lnj0/f$b$c;->b:Lnj0/f$b$c;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lok0/b;

    invoke-static {p0}, Ljk0/i;->a(Lnj0/f;)Lst0/v;

    move-result-object p0

    sget-object v1, Llt0/j;->REVISION_3:Llt0/j;

    invoke-direct {v0, p0, v1}, Lok0/b;-><init>(Lst0/v;Llt0/j;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Lnj0/f$b$a;

    if-eqz v0, :cond_2

    new-instance v0, Lok0/b;

    invoke-static {p0}, Ljk0/i;->a(Lnj0/f;)Lst0/v;

    move-result-object p0

    sget-object v1, Llt0/j;->REVISION_2:Llt0/j;

    invoke-direct {v0, p0, v1}, Lok0/b;-><init>(Lst0/v;Llt0/j;)V

    return-object v0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final e(Ljava/time/Clock;Lst0/v;)Lxj0/b;
    .locals 4

    new-instance v0, Lxj0/v0;

    new-instance v1, Lfk2/a;

    invoke-virtual {p0}, Ljava/time/Clock;->millis()J

    move-result-wide v2

    sget-object p0, Lfk2/a$c;->MILLIS:Lfk2/a$c;

    invoke-direct {v1, v2, v3, p0}, Lfk2/a;-><init>(JLfk2/a$c;)V

    invoke-direct {v0, v1, p1}, Lxj0/v0;-><init>(Lfk2/a;Lst0/v;)V

    return-object v0
.end method

.method private static final f(Lzj0/h;)Lkt0/a;
    .locals 5

    instance-of v0, p0, Lzj0/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lzj0/t;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lzj0/h;->W()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    sget-object v0, Lok0/c;->b:Ltr2/n;

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "hello answered "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", so there is no serial to read"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, p0, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_2
    :try_start_0
    new-instance p0, Lkt0/a;

    invoke-interface {v0}, Lzj0/t;->y()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkt0/a;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Lok0/c;->b:Ltr2/n;

    const-string v2, "hello body is too short to hold a serial"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v0, v2, p0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v1
.end method
