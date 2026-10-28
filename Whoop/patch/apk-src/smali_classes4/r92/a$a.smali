.class public final Lr92/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr92/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jk\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lr92/a$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ljava/lang/Class;",
        "Lys0/a;",
        "implClass",
        "Lys0/a$a;",
        "bleHandlerCallback",
        "",
        "testFlag",
        "Lc92/a;",
        "bluetoothHelper",
        "Lrr2/c;",
        "crashReporter",
        "Lm32/a;",
        "permissionChecker",
        "",
        "",
        "requiredPermissions",
        "",
        "sdkVersion",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "a",
        "(Landroid/content/Context;Ljava/lang/Class;Lys0/a$a;ZLc92/a;Lrr2/c;Lm32/a;Ljava/util/List;ILcom/whoop/data/repositories/FeatureFlagChecker;)Lys0/a;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr92/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/Class;Lys0/a$a;ZLc92/a;Lrr2/c;Lm32/a;Ljava/util/List;ILcom/whoop/data/repositories/FeatureFlagChecker;)Lys0/a;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Lys0/a;",
            ">;",
            "Lys0/a$a;",
            "Z",
            "Lc92/a;",
            "Lrr2/c;",
            "Lm32/a;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            ")",
            "Lys0/a;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "implClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "bleHandlerCallback"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "bluetoothHelper"

    move-object/from16 v4, p5

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "crashReporter"

    move-object/from16 v5, p6

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "permissionChecker"

    move-object/from16 v6, p7

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "requiredPermissions"

    move-object/from16 v7, p8

    invoke-static {v7, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "featureFlagChecker"

    move-object/from16 v2, p10

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    new-instance p1, Ls92/a;

    invoke-direct {p1}, Ls92/a;-><init>()V

    return-object p1

    :cond_0
    new-instance v10, Landroid/os/HandlerThread;

    const-string p2, "WhoopBleCallback"

    invoke-direct {v10, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    new-instance v9, Landroid/os/Handler;

    invoke-virtual {v10}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {v9, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ls92/e;

    move-object v1, p1

    move-object v3, p3

    move/from16 v8, p9

    invoke-direct/range {v0 .. v10}, Ls92/e;-><init>(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lys0/a$a;Lc92/a;Lrr2/c;Lm32/a;Ljava/util/List;ILandroid/os/Handler;Landroid/os/HandlerThread;)V

    return-object v0
.end method
