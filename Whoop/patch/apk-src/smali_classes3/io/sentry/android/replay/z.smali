.class public final Lio/sentry/android/replay/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final E:Lio/sentry/android/replay/z;

.field public static final F:Lio/sentry/android/replay/z;

.field public static final x:Lio/sentry/android/replay/z;

.field public static final y:Lio/sentry/android/replay/z;

.field public static final z:Lio/sentry/android/replay/z;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/replay/z;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/z;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/z;->x:Lio/sentry/android/replay/z;

    new-instance v0, Lio/sentry/android/replay/z;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/z;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/z;->y:Lio/sentry/android/replay/z;

    new-instance v0, Lio/sentry/android/replay/z;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/z;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/z;->z:Lio/sentry/android/replay/z;

    new-instance v0, Lio/sentry/android/replay/z;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/z;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/z;->E:Lio/sentry/android/replay/z;

    new-instance v0, Lio/sentry/android/replay/z;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/z;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/z;->F:Lio/sentry/android/replay/z;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/z;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/sentry/android/replay/z;->w:I

    const-string v1, "WindowSpy"

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/android/replay/f0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v4, "mWindow"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected exception retrieving "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "#mWindow on API "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-object v3

    :pswitch_0
    :try_start_1
    const-string v0, "com.android.internal.policy.DecorView"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected exception loading DecorView on API "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-object v3

    :pswitch_1
    sget-object v0, Lio/sentry/android/replay/a0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    const-string v1, "getInstance"

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_1
    return-object v3

    :pswitch_2
    const-string v0, "android.view.WindowManagerGlobal"

    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    const-string v1, "WindowManagerSpy"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-object v3

    :pswitch_3
    sget-object v0, Lio/sentry/android/replay/a0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_2

    const-string v1, "mViews"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_2
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
