.class public abstract Lsr2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroid/app/Application;",
        "application",
        "Lnf3/b;",
        "a",
        "(Landroid/app/Application;)Lnf3/b;",
        "",
        "Ltf3/a;",
        "Ljava/util/List;",
        "getCommonModules",
        "()Ljava/util/List;",
        "commonModules",
        "app_prodStandardRelease"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltf3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lsr2/g;->a:Lsr2/g;

    invoke-virtual {v0}, Lsr2/g;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lnd1/k;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lsr2/k;->a:Ljava/util/List;

    return-void
.end method

.method public static final a(Landroid/app/Application;)Lnf3/b;
    .locals 3

    const-string v0, "application"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpf3/a;->a:Lpf3/a;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lnf3/b;

    invoke-direct {v1}, Lnf3/b;-><init>()V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-nez v2, :cond_0

    iget-object v2, v1, Lnf3/b;->a:Lnf3/a;

    sput-object v2, Lpf3/a;->b:Lnf3/a;

    invoke-static {p0, v1}, Lsr2/k;->b(Landroid/app/Application;Lnf3/b;)Ll83/a0;

    invoke-virtual {v1}, Lnf3/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p0, Lorg/koin/core/error/KoinAppAlreadyStartedException;

    invoke-direct {p0}, Lorg/koin/core/error/KoinAppAlreadyStartedException;-><init>()V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p0
.end method

.method private static final b(Landroid/app/Application;Lnf3/b;)Ll83/a0;
    .locals 4

    const-string v0, "$this$startKoin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lnf3/b;->a:Lnf3/a;

    new-instance v1, Lhf3/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lhf3/a;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Lnf3/a;->c:Lq83/g;

    const-string v1, "androidContext"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lq83/g;->D(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    const-string v3, "[init] declare Android Context"

    invoke-virtual {v1, v3}, Lq83/g;->C(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Lgb/u;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Lgb/u;-><init>(Landroid/content/Context;I)V

    new-instance p0, Ltf3/a;

    invoke-direct {p0}, Ltf3/a;-><init>()V

    invoke-virtual {v1, p0}, Lgb/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lnf3/a;->a(Ljava/util/List;Z)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lsr2/k;->a:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Lsr2/o;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    invoke-virtual {v1, v2}, Lq83/g;->D(I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, La3/z0;

    const/16 v2, 0x14

    invoke-direct {v1, v2, p1, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lv63/b;->f(Lc93/a;)D

    move-result-wide p0

    iget-object v1, v0, Lnf3/a;->b:Ls/m2;

    iget-object v1, v1, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    iget-object v0, v0, Lnf3/a;->c:Lq83/g;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "loaded "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " definitions - "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lq83/g;->C(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p1, Lnf3/b;->b:Z

    invoke-virtual {v0, p0, p1}, Lnf3/a;->a(Ljava/util/List;Z)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
