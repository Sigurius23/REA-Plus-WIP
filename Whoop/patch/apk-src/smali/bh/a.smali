.class public final Lbh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbh/a;

.field public static b:Lbh/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbh/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbh/a;->a:Lbh/a;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lbh/e;
    .locals 3

    sget-object v0, Lbh/a;->b:Lbh/e;

    if-nez v0, :cond_3

    sget-object v1, Lbh/a;->a:Lbh/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lbh/a;->b:Lbh/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit v1

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v2, v0, Lbh/f;

    if-eqz v2, :cond_1

    check-cast v0, Lbh/f;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lbh/f;->a()Lbh/e;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lkotlin/jvm/internal/j;->x(Landroid/content/Context;)Lbh/j;

    move-result-object p0

    :goto_1
    sput-object p0, Lbh/a;->b:Lbh/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p0

    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_3
    return-object v0
.end method
