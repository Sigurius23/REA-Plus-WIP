.class public final Lio/sentry/android/replay/viewhierarchy/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lio/sentry/android/replay/viewhierarchy/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/viewhierarchy/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lio/sentry/android/replay/viewhierarchy/a;->w:Lio/sentry/android/replay/viewhierarchy/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-class v1, La3/n0;

    const-string v2, "getCollapsedSemantics$ui_release"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    return-object v0
.end method
