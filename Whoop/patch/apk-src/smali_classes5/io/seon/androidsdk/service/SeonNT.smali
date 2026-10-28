.class Lio/seon/androidsdk/service/SeonNT;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static b:Z

.field public static c:Landroid/content/SharedPreferences;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lio/seon/androidsdk/service/SeonNT;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sput-boolean v1, Lio/seon/androidsdk/service/SeonNT;->b:Z

    const/4 v0, 0x0

    sput-object v0, Lio/seon/androidsdk/service/SeonNT;->c:Landroid/content/SharedPreferences;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    const-string v1, "seon2US"

    :try_start_0
    sget-object v2, Lio/seon/androidsdk/service/SeonNT;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "seonLocalNtPreferences"

    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    sput-object v2, Lio/seon/androidsdk/service/SeonNT;->c:Landroid/content/SharedPreferences;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    sget-object v2, Lio/seon/androidsdk/service/SeonNT;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v5, 0x30

    const-string v6, "0"

    const-string v7, "1"

    if-eq v2, v5, :cond_1

    const/16 v3, 0x31

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_4
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, -0x1

    :goto_1
    const/16 v0, 0xc

    const-string v2, "Given context is null"

    const-string v5, "Beginning load of %s..."

    const-string v8, "seon2"

    if-eqz v3, :cond_5

    if-eq v3, v4, :cond_4

    :try_start_5
    sget-object v3, Lio/seon/androidsdk/service/SeonNT;->c:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v4, Ls/m2;

    invoke-direct {v4, v0}, Ls/m2;-><init>(I)V

    if-eqz p1, :cond_3

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4, p1, v8}, Ls/m2;->n(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v3, v1, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sput-boolean v4, Lio/seon/androidsdk/service/SeonNT;->b:Z

    goto :goto_2

    :cond_5
    new-instance v1, Ls/m2;

    invoke-direct {v1, v0}, Ls/m2;-><init>(I)V

    if-eqz p1, :cond_6

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v8}, Ls/m2;->n(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    :cond_7
    :goto_2
    return-void
.end method


# virtual methods
.method public native a()I
.end method

.method public native b()Ljava/lang/String;
.end method

.method public native d()I
.end method
