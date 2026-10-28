.class public final Lqn1/c;
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
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ/\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J/\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\'\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lqn1/c;",
        "Lod1/g;",
        "Lpn1/a;",
        "Lqn1/d;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lnn1/a;",
        "homeNotificationsCenterAnalyticsHelper",
        "<init>",
        "(Lnm0/e;Lnn1/a;)V",
        "",
        "cardId",
        "Lvn1/a;",
        "cardDismissAction",
        "path",
        "Lec3/l;",
        "f",
        "(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "i",
        "(Ljava/lang/String;)Lec3/l;",
        "h",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lnn1/a;",
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

.field private final b:Lnn1/a;


# direct methods
.method public constructor <init>(Lnm0/e;Lnn1/a;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homeNotificationsCenterAnalyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqn1/c;->a:Lnm0/e;

    iput-object p2, p0, Lqn1/c;->b:Lnn1/a;

    return-void
.end method

.method public static final synthetic c(Lqn1/c;)Lnn1/a;
    .locals 0

    iget-object p0, p0, Lqn1/c;->b:Lnn1/a;

    return-object p0
.end method

.method public static final synthetic d(Lqn1/c;Ljava/lang/String;Lvn1/a;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lqn1/c;->f(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lqn1/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lqn1/c;->i(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvn1/a;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1, p3}, Lqn1/c;->g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p3

    new-instance v0, Lqn1/c$c;

    invoke-direct {v0, p3, p1, p2, p0}, Lqn1/c$c;-><init>(Lec3/l;Ljava/lang/String;Lvn1/a;Lqn1/c;)V

    return-object v0
.end method

.method private final g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "app-notifications-service/v1/app/notification-cards"

    :cond_0
    new-instance v0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object p2, p0, Lqn1/c;->a:Lnm0/e;

    new-instance v0, Lqn1/c$d;

    invoke-direct {v0, v1, p2}, Lqn1/c$d;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 3
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
    new-instance v0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;

    invoke-direct {v0, p1}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lqn1/c;->a:Lnm0/e;

    new-instance v1, Lqn1/c$e;

    invoke-direct {v1, v2, v0}, Lqn1/c$e;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqn1/c;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    new-instance v0, Lqn1/c$f;

    invoke-direct {v0, p1, p0}, Lqn1/c$f;-><init>(Lec3/l;Lqn1/c;)V

    new-instance p1, Lqn1/c$g;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lqn1/c$g;-><init>(Lec3/l;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lqn1/c$a;

    invoke-direct {v0, p1}, Lqn1/c$a;-><init>(Lec3/l;)V

    new-instance p1, Lqn1/c$b;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Lqn1/c$b;-><init>(Lq83/d;Lqn1/c;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
