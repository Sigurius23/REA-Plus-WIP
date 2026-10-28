.class public final Lqn1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpn1/a;",
        "Lqn1/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lqn1/b;",
        "Lod1/g;",
        "Lpn1/a;",
        "Lqn1/d;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lpn1/c;",
        "refreshHook",
        "<init>",
        "(Lnm0/e;Lpn1/c;)V",
        "",
        "shouldShimmer",
        "",
        "path",
        "userCategory",
        "Lec3/l;",
        "d",
        "(ZLjava/lang/String;Ljava/lang/String;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;",
        "e",
        "(Ljava/lang/String;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lpn1/c;",
        "home-notifications-center_release"
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
.field private final a:Lnm0/e;

.field private final b:Lpn1/c;


# direct methods
.method public constructor <init>(Lnm0/e;Lpn1/c;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshHook"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqn1/b;->a:Lnm0/e;

    iput-object p2, p0, Lqn1/b;->b:Lpn1/c;

    return-void
.end method

.method public static final synthetic c(Lqn1/b;ZLjava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lqn1/b;->d(ZLjava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d(ZLjava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lqn1/b;->e(Ljava/lang/String;)Lec3/l;

    move-result-object p2

    new-instance v0, Lqn1/b$a;

    invoke-direct {v0, p2, p1, p3}, Lqn1/b$a;-><init>(Lec3/l;ZLjava/lang/String;)V

    new-instance p1, Lqn1/b$b;

    const/4 p2, 0x0

    invoke-direct {p1, v0, p2}, Lqn1/b$b;-><init>(Lec3/l;Lq83/d;)V

    new-instance p2, Lec3/s1;

    invoke-direct {p2, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p2
.end method

.method private final e(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    if-nez p1, :cond_0

    const-string p1, "app-notifications-service/v1/app/notification-cards"

    :cond_0
    new-instance v0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterGetRequest;

    invoke-direct {v0, p1}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterGetRequest;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "home"

    const-string v2, "notifications"

    const-string v3, "cycle"

    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v1, v0, p1}, Lsm0/a;->a(Lec3/l;Ljava/util/Set;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lqn1/b;->a:Lnm0/e;

    new-instance v1, Lqn1/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lqn1/b$c;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqn1/b$d;

    invoke-direct {v0, p1}, Lqn1/b$d;-><init>(Lec3/l;)V

    iget-object p1, p0, Lqn1/b;->b:Lpn1/c;

    invoke-virtual {p1}, Lpn1/c;->a()Lec3/t1;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Lec3/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lor2/e0;->a(Lec3/l;[Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lqn1/b$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lqn1/b$e;-><init>(Lq83/d;Lqn1/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
