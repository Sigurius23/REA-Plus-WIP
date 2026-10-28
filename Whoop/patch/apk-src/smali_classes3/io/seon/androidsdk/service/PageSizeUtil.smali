.class Lio/seon/androidsdk/service/PageSizeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lio/seon/androidsdk/service/PageSizeUtil;->b:Landroid/content/Context;

    return-void
.end method

.method private native getPageSizeInBytesNative()I
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    sget-boolean v1, Lio/seon/androidsdk/service/PageSizeUtil;->a:Z

    if-nez v1, :cond_0

    new-instance v1, Lio/seon/androidsdk/service/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1}, Lio/seon/androidsdk/service/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_0
    :try_start_2
    invoke-direct {p0}, Lio/seon/androidsdk/service/PageSizeUtil;->getPageSizeInBytesNative()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :goto_0
    return-object v0
.end method
