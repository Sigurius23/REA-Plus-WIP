.class public final Lfi0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfi0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lfi0/e;",
        "",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Lq83/j;",
        "ioDispatcher",
        "Landroidx/core/app/NotificationManagerCompat;",
        "notificationManager",
        "<init>",
        "(Landroid/content/SharedPreferences;Lq83/j;Landroidx/core/app/NotificationManagerCompat;)V",
        "Lfi0/d;",
        "c",
        "()Lfi0/d;",
        "b",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "e",
        "a",
        "Landroid/content/SharedPreferences;",
        "Lq83/j;",
        "Landroidx/core/app/NotificationManagerCompat;",
        "analytics_release"
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
.field public static final d:Lfi0/e$a;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Lq83/j;

.field private final c:Landroidx/core/app/NotificationManagerCompat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfi0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfi0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfi0/e;->d:Lfi0/e$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Lq83/j;Landroidx/core/app/NotificationManagerCompat;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi0/e;->a:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lfi0/e;->b:Lq83/j;

    iput-object p3, p0, Lfi0/e;->c:Landroidx/core/app/NotificationManagerCompat;

    return-void
.end method

.method public static final synthetic a(Lfi0/e;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lfi0/e;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method private final b()Lfi0/d;
    .locals 4

    iget-object v0, p0, Lfi0/e;->c:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannelsCompat()Ljava/util/List;

    move-result-object v0

    const-string v1, "getNotificationChannelsCompat(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/app/NotificationChannelCompat;

    invoke-virtual {v2}, Landroidx/core/app/NotificationChannelCompat;->getImportance()I

    move-result v2

    if-nez v2, :cond_1

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v0, 0x0

    throw v0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    sget-object v0, Lfi0/d;->UNKNOWN:Lfi0/d;

    return-object v0

    :cond_4
    if-nez v3, :cond_5

    sget-object v0, Lfi0/d;->ALLOWED:Lfi0/d;

    return-object v0

    :cond_5
    if-ne v1, v3, :cond_6

    sget-object v0, Lfi0/d;->DISABLED:Lfi0/d;

    return-object v0

    :cond_6
    if-le v1, v3, :cond_7

    sget-object v0, Lfi0/d;->PARTIAL:Lfi0/d;

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "impossible state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final c()Lfi0/d;
    .locals 4

    iget-object v0, p0, Lfi0/e;->c:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lfi0/d;->DISABLED:Lfi0/d;

    return-object v0

    :cond_0
    iget-object v0, p0, Lfi0/e;->c:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannelGroupsCompat()Ljava/util/List;

    move-result-object v0

    const-string v1, "getNotificationChannelGroupsCompat(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/app/NotificationChannelGroupCompat;

    invoke-virtual {v2}, Landroidx/core/app/NotificationChannelGroupCompat;->isBlocked()Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_1
    if-nez v1, :cond_5

    invoke-direct {p0}, Lfi0/e;->b()Lfi0/d;

    move-result-object v0

    return-object v0

    :cond_5
    if-nez v3, :cond_6

    invoke-direct {p0}, Lfi0/e;->b()Lfi0/d;

    move-result-object v0

    return-object v0

    :cond_6
    if-ne v1, v3, :cond_7

    sget-object v0, Lfi0/d;->DISABLED:Lfi0/d;

    return-object v0

    :cond_7
    if-le v1, v3, :cond_8

    sget-object v0, Lfi0/d;->PARTIAL:Lfi0/d;

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "impossible state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfi0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lfi0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfi0/e$b;

    iget v1, v0, Lfi0/e$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfi0/e$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfi0/e$b;

    invoke-direct {v0, p0, p1}, Lfi0/e$b;-><init>(Lfi0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lfi0/e$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfi0/e$b;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lfi0/e$b;->y:Ljava/lang/Object;

    check-cast v1, Lfi0/d;

    iget-object v2, v0, Lfi0/e$b;->x:Ljava/lang/Object;

    check-cast v2, Lfi0/d;

    iget-object v0, v0, Lfi0/e$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfi0/e;->b:Lq83/j;

    new-instance v2, Lfi0/e$d;

    invoke-direct {v2, p0, v5}, Lfi0/e$d;-><init>(Lfi0/e;Lq83/d;)V

    iput v4, v0, Lfi0/e$b;->F:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/String;

    invoke-static {}, Lfi0/d;->values()[Lfi0/d;

    move-result-object v2

    array-length v4, v2

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v4, :cond_6

    aget-object v7, v2, v6

    invoke-virtual {v7}, Lfi0/d;->getLabel()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    move-object v7, v5

    :goto_3
    invoke-direct {p0}, Lfi0/e;->c()Lfi0/d;

    move-result-object p1

    if-ne v7, p1, :cond_7

    return-object v5

    :cond_7
    iget-object v2, p0, Lfi0/e;->b:Lq83/j;

    new-instance v4, Lfi0/e$c;

    invoke-direct {v4, p0, p1, v5}, Lfi0/e$c;-><init>(Lfi0/e;Lfi0/d;Lq83/d;)V

    iput-object v5, v0, Lfi0/e$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Lfi0/e$b;->x:Ljava/lang/Object;

    iput-object p1, v0, Lfi0/e$b;->y:Ljava/lang/Object;

    iput v3, v0, Lfi0/e$b;->F:I

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    return-object p1
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfi0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lfi0/e$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfi0/e$e;

    iget v1, v0, Lfi0/e$e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfi0/e$e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfi0/e$e;

    invoke-direct {v0, p0, p1}, Lfi0/e$e;-><init>(Lfi0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lfi0/e$e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfi0/e$e;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lfi0/e$e;->w:Ljava/lang/Object;

    check-cast v0, Lfi0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lfi0/e;->c()Lfi0/d;

    move-result-object p1

    iget-object v2, p0, Lfi0/e;->b:Lq83/j;

    new-instance v4, Lfi0/e$f;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p1, v5}, Lfi0/e$f;-><init>(Lfi0/e;Lfi0/d;Lq83/d;)V

    iput-object p1, v0, Lfi0/e$e;->w:Ljava/lang/Object;

    iput v3, v0, Lfi0/e$e;->z:I

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
