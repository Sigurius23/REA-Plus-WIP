.class public final Lb3/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/k1;


# static fields
.field public static final b:Lb3/l1;

.field public static final c:Lb3/l1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb3/l1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb3/l1;-><init>(I)V

    sput-object v0, Lb3/l1;->b:Lb3/l1;

    new-instance v0, Lb3/l1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb3/l1;-><init>(I)V

    sput-object v0, Lb3/l1;->c:Lb3/l1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb3/l1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 10

    iget v0, p0, Lb3/l1;->a:I

    const-string v1, "null cannot be cast to non-null type android.graphics.Rect"

    const-string v2, "getBounds"

    const/4 v3, 0x1

    const-string v4, "windowConfiguration"

    const-class v5, Landroid/content/res/Configuration;

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    :try_start_0
    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v2, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Rect;

    invoke-direct {v3, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    instance-of v1, v0, Ljava/lang/NoSuchFieldException;

    if-nez v1, :cond_1

    instance-of v1, v0, Ljava/lang/NoSuchMethodException;

    if-nez v1, :cond_1

    instance-of v1, v0, Ljava/lang/IllegalAccessException;

    if-nez v1, :cond_1

    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    sget-object v0, Lb3/l1;->b:Lb3/l1;

    invoke-virtual {v0, p1}, Lb3/l1;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object v3

    :goto_1
    return-object v3

    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    :try_start_1
    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5, v2, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_4

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v5, "getAppBounds"

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :goto_2
    instance-of v2, v1, Ljava/lang/NoSuchFieldException;

    if-nez v2, :cond_4

    instance-of v2, v1, Ljava/lang/NoSuchMethodException;

    if-nez v2, :cond_4

    instance-of v2, v1, Ljava/lang/IllegalAccessException;

    if-nez v2, :cond_4

    instance-of v2, v1, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    throw v1

    :cond_4
    :goto_3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    :goto_4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_8

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const-string v7, "dimen"

    const-string v8, "android"

    const-string v9, "navigation_bar_height"

    invoke-virtual {v4, v9, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_5

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    goto :goto_5

    :cond_5
    move v4, v5

    :goto_5
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v4

    iget v8, v2, Landroid/graphics/Point;->y:I

    if-ne v7, v8, :cond_6

    iput v7, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_6

    :cond_6
    iget v7, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v4

    iget v8, v2, Landroid/graphics/Point;->x:I

    if-ne v7, v8, :cond_7

    iput v7, v0, Landroid/graphics/Rect;->right:I

    goto :goto_6

    :cond_7
    iget v7, v0, Landroid/graphics/Rect;->left:I

    if-ne v7, v4, :cond_8

    iput v5, v0, Landroid/graphics/Rect;->left:I

    :cond_8
    :goto_6
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget v7, v2, Landroid/graphics/Point;->x:I

    if-lt v4, v7, :cond_9

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    iget v7, v2, Landroid/graphics/Point;->y:I

    if-ge v4, v7, :cond_f

    :cond_9
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result p1

    if-nez p1, :cond_f

    :try_start_2
    const-string p1, "android.view.DisplayInfo"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v7, "getDisplayInfo"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v4, "displayCutout"

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/view/DisplayCutout;

    if-eqz v1, :cond_b

    check-cast p1, Landroid/view/DisplayCutout;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v6, p1

    goto :goto_7

    :catch_2
    move-exception p1

    instance-of v1, p1, Ljava/lang/ClassNotFoundException;

    if-nez v1, :cond_b

    instance-of v1, p1, Ljava/lang/NoSuchMethodException;

    if-nez v1, :cond_b

    instance-of v1, p1, Ljava/lang/NoSuchFieldException;

    if-nez v1, :cond_b

    instance-of v1, p1, Ljava/lang/IllegalAccessException;

    if-nez v1, :cond_b

    instance-of v1, p1, Ljava/lang/reflect/InvocationTargetException;

    if-nez v1, :cond_b

    instance-of v1, p1, Ljava/lang/InstantiationException;

    if-eqz v1, :cond_a

    goto :goto_7

    :cond_a
    throw p1

    :cond_b
    :goto_7
    if-eqz v6, :cond_f

    iget p1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v1

    if-ne p1, v1, :cond_c

    iput v5, v0, Landroid/graphics/Rect;->left:I

    :cond_c
    iget p1, v2, Landroid/graphics/Point;->x:I

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, v1

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v1

    if-ne p1, v1, :cond_d

    iget p1, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v1

    add-int/2addr v1, p1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    :cond_d
    iget p1, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v1

    if-ne p1, v1, :cond_e

    iput v5, v0, Landroid/graphics/Rect;->top:I

    :cond_e
    iget p1, v2, Landroid/graphics/Point;->y:I

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v1

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v1

    if-ne p1, v1, :cond_f

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v1

    add-int/2addr v1, p1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    :cond_f
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
