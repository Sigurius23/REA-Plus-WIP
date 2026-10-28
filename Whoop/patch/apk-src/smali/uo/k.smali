.class public final Luo/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Luo/k;

.field public static final c:Luo/l;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Luo/l;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Luo/l;-><init>(IZZII)V

    sput-object v0, Luo/k;->c:Luo/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Luo/k;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Luo/k;
    .locals 2

    const-class v0, Luo/k;

    monitor-enter v0

    :try_start_0
    sget-object v1, Luo/k;->b:Luo/k;

    if-nez v1, :cond_0

    new-instance v1, Luo/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Luo/k;->b:Luo/k;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Luo/k;->b:Luo/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
