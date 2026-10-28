.class final Lcom/mapbox/common/RunloopErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/mapbox/common/RunloopErrorHandler;",
        "",
        "<init>",
        "()V",
        "",
        "error",
        "Ll83/a0;",
        "postErrorToMainLooper",
        "(Ljava/lang/Throwable;)V",
        "",
        "TAG",
        "Ljava/lang/String;",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/RunloopErrorHandler;

.field public static final TAG:Ljava/lang/String; = "run_loop"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/RunloopErrorHandler;

    invoke-direct {v0}, Lcom/mapbox/common/RunloopErrorHandler;-><init>()V

    sput-object v0, Lcom/mapbox/common/RunloopErrorHandler;->INSTANCE:Lcom/mapbox/common/RunloopErrorHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/RunloopErrorHandler;->postErrorToMainLooper$lambda$0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final postErrorToMainLooper(Ljava/lang/Throwable;)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Please check the following Java stacktrace for more information related to the exception: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "run_loop"

    invoke-static {v0, v1}, Lcom/mapbox/common/Log;->error(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/mapbox/common/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/mapbox/common/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final postErrorToMainLooper$lambda$0(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    throw p0
.end method
