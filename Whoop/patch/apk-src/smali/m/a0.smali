.class public final Lm/a0;
.super Lm/q;
.source "SourceFile"

# interfaces
.implements Lr/j;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final H0:La0/f1;

.field public static final I0:[I

.field public static final J0:Z


# instance fields
.field public final A0:Landroidx/databinding/s;

.field public B0:Z

.field public C0:Landroid/graphics/Rect;

.field public D0:Landroid/graphics/Rect;

.field public E0:Lm/f0;

.field public F0:Landroid/window/OnBackInvokedDispatcher;

.field public G0:Landroid/window/OnBackInvokedCallback;

.field public final J:Ljava/lang/Object;

.field public final K:Landroid/content/Context;

.field public L:Landroid/view/Window;

.field public M:Lm/w;

.field public final N:Ljava/lang/Object;

.field public O:Lm/b;

.field public P:Lq/j;

.field public Q:Ljava/lang/CharSequence;

.field public R:Ls/a1;

.field public S:Lm/s;

.field public T:Lm/s;

.field public U:Lq/b;

.field public V:Landroidx/appcompat/widget/ActionBarContextView;

.field public W:Landroid/widget/PopupWindow;

.field public X:Lbq/b;

.field public Y:Lh5/t0;

.field public Z:Z

.field public a0:Landroid/view/ViewGroup;

.field public b0:Landroid/widget/TextView;

.field public c0:Landroid/view/View;

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:Z

.field public l0:[Lm/z;

.field public m0:Lm/z;

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public q0:Z

.field public r0:Landroid/content/res/Configuration;

.field public final s0:I

.field public t0:I

.field public u0:I

.field public v0:Z

.field public w0:Lm/x;

.field public x0:Lm/x;

.field public y0:Z

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La0/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    sput-object v0, Lm/a0;->H0:La0/f1;

    const v0, 0x1010054

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lm/a0;->I0:[I

    const-string v0, "robolectric"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lm/a0;->J0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lm/n;Ljava/lang/Object;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lm/a0;->Y:Lh5/t0;

    const/16 v1, -0x64

    iput v1, p0, Lm/a0;->s0:I

    new-instance v2, Landroidx/databinding/s;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, Lm/a0;->A0:Landroidx/databinding/s;

    iput-object p1, p0, Lm/a0;->K:Landroid/content/Context;

    iput-object p3, p0, Lm/a0;->N:Ljava/lang/Object;

    iput-object p4, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    instance-of p3, p1, Lm/m;

    if-eqz p3, :cond_0

    move-object v0, p1

    check-cast v0, Lm/m;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lm/m;->getDelegate()Lm/q;

    move-result-object p1

    check-cast p1, Lm/a0;

    iget p1, p1, Lm/a0;->s0:I

    iput p1, p0, Lm/a0;->s0:I

    :cond_2
    iget p1, p0, Lm/a0;->s0:I

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lm/a0;->J:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lm/a0;->H0:La0/f1;

    invoke-virtual {p3, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lm/a0;->s0:I

    iget-object p1, p0, Lm/a0;->J:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Lm/a0;->t(Landroid/view/Window;)V

    :cond_4
    invoke-static {}, Ls/p;->d()V

    return-void
.end method

.method public static u(Landroid/content/Context;)Lb5/g;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm/q;->y:Lb5/g;

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-static {p0}, Lm/u;->b(Landroid/content/res/Configuration;)Lb5/g;

    move-result-object p0

    invoke-static {v0, p0}, Lo73/a;->u(Lb5/g;Lb5/g;)Lb5/g;

    move-result-object v0

    invoke-virtual {v0}, Lb5/g;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static y(Landroid/content/Context;ILb5/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    goto :goto_0

    :cond_1
    const/16 p0, 0x20

    goto :goto_0

    :cond_2
    const/16 p0, 0x10

    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    const/4 p4, 0x0

    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_3

    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p0, p3

    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_4

    invoke-static {p1, p2}, Lm/u;->d(Landroid/content/res/Configuration;Lb5/g;)V

    :cond_4
    return-object p1
.end method


# virtual methods
.method public final A(I)V
    .locals 3

    invoke-virtual {p0, p1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-object v1, v0, Lm/z;->h:Lr/l;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lm/z;->h:Lr/l;

    invoke-virtual {v2, v1}, Lr/l;->u(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Lm/z;->p:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Lm/z;->h:Lr/l;

    invoke-virtual {v1}, Lr/l;->z()V

    iget-object v1, v0, Lm/z;->h:Lr/l;

    invoke-virtual {v1}, Lr/l;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lm/z;->o:Z

    iput-boolean v1, v0, Lm/z;->n:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iput-boolean p1, v0, Lm/z;->k:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public final B()V
    .locals 11

    iget-boolean v0, p0, Lm/a0;->Z:Z

    if-nez v0, :cond_1b

    iget-object v0, p0, Lm/a0;->K:Landroid/content/Context;

    sget-object v1, Ll/a;->j:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v3, 0x75

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    const/16 v4, 0x7e

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v6, 0x6c

    const/4 v7, 0x1

    if-eqz v4, :cond_0

    invoke-virtual {p0, v7}, Lm/a0;->l(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v6}, Lm/a0;->l(I)Z

    :cond_1
    :goto_0
    const/16 v3, 0x76

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v4, 0x6d

    if-eqz v3, :cond_2

    invoke-virtual {p0, v4}, Lm/a0;->l(I)Z

    :cond_2
    const/16 v3, 0x77

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    invoke-virtual {p0, v3}, Lm/a0;->l(I)Z

    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lm/a0;->i0:Z

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lm/a0;->C()V

    iget-object v2, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-boolean v3, p0, Lm/a0;->j0:Z

    const/4 v8, 0x0

    if-nez v3, :cond_9

    iget-boolean v3, p0, Lm/a0;->i0:Z

    if-eqz v3, :cond_4

    const v3, 0x7f0d000c

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-boolean v5, p0, Lm/a0;->g0:Z

    iput-boolean v5, p0, Lm/a0;->f0:Z

    goto/16 :goto_2

    :cond_4
    iget-boolean v2, p0, Lm/a0;->f0:Z

    if-eqz v2, :cond_8

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v9, 0x7f04000c

    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v3, :cond_5

    new-instance v3, Lq/d;

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v3, v0, v2}, Lq/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    move-object v3, v0

    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0d0017

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x7f0a03a3

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ls/a1;

    iput-object v3, p0, Lm/a0;->R:Ls/a1;

    iget-object v9, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v9

    invoke-interface {v3, v9}, Ls/a1;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v3, p0, Lm/a0;->g0:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Lm/a0;->R:Ls/a1;

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m(I)V

    :cond_6
    iget-boolean v3, p0, Lm/a0;->d0:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Lm/a0;->R:Ls/a1;

    const/4 v4, 0x2

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m(I)V

    :cond_7
    iget-boolean v3, p0, Lm/a0;->e0:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, Lm/a0;->R:Ls/a1;

    const/4 v4, 0x5

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m(I)V

    goto :goto_2

    :cond_8
    move-object v2, v8

    goto :goto_2

    :cond_9
    iget-boolean v3, p0, Lm/a0;->h0:Z

    if-eqz v3, :cond_a

    const v3, 0x7f0d0016

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_a
    const v3, 0x7f0d0015

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    new-instance v3, Lbu/c;

    invoke-direct {v3, p0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v2, v3}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    iget-object v3, p0, Lm/a0;->R:Ls/a1;

    if-nez v3, :cond_c

    const v3, 0x7f0a0c8d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lm/a0;->b0:Landroid/widget/TextView;

    :cond_c
    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    const-string v4, "ViewUtils"

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-string v10, "makeOptionalFitsSystemWindows"

    invoke-virtual {v9, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_3

    :catch_0
    move-exception v9

    goto :goto_4

    :catch_1
    move-exception v9

    goto :goto_5

    :cond_d
    :goto_3
    invoke-virtual {v9, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_4
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    :goto_5
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    const v3, 0x7f0a0049

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v4, p0, Lm/a0;->L:Landroid/view/Window;

    const v9, 0x1020002

    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_f

    :goto_7
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    if-lez v10, :cond_e

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_7

    :cond_e
    const/4 v10, -0x1

    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    instance-of v10, v4, Landroid/widget/FrameLayout;

    if-eqz v10, :cond_f

    check-cast v4, Landroid/widget/FrameLayout;

    invoke-virtual {v4, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    iget-object v4, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v4, Lad3/z;

    const/16 v8, 0x16

    invoke-direct {v4, p0, v8}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Ls/z0;)V

    iput-object v2, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    iget-object v2, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_10

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lm/a0;->Q:Ljava/lang/CharSequence;

    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    iget-object v3, p0, Lm/a0;->R:Ls/a1;

    if-eqz v3, :cond_11

    invoke-interface {v3, v2}, Ls/a1;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_11
    iget-object v3, p0, Lm/a0;->O:Lm/b;

    if-eqz v3, :cond_12

    invoke-virtual {v3, v2}, Lm/b;->x(Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_12
    iget-object v3, p0, Lm/a0;->b0:Landroid/widget/TextView;

    if-eqz v3, :cond_13

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    :goto_9
    iget-object v2, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v3, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->G:Landroid/graphics/Rect;

    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x7c

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7d

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7a

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    const/16 v1, 0x79

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    iput-boolean v7, p0, Lm/a0;->Z:Z

    invoke-virtual {p0, v5}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-boolean v1, p0, Lm/a0;->q0:Z

    if-nez v1, :cond_1b

    iget-object v0, v0, Lm/z;->h:Lr/l;

    if-nez v0, :cond_1b

    invoke-virtual {p0, v6}, Lm/a0;->F(I)V

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lm/a0;->f0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lm/a0;->g0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lm/a0;->i0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lm/a0;->h0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lm/a0;->j0:Z

    const-string v3, " }"

    invoke-static {v1, v2, v3}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_a
    return-void
.end method

.method public final C()V
    .locals 2

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/a0;->t(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final D(I)Lm/z;
    .locals 4

    iget-object v0, p0, Lm/a0;->l0:[Lm/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    if-gt v2, p1, :cond_2

    :cond_0
    add-int/lit8 v2, p1, 0x1

    new-array v2, v2, [Lm/z;

    if-eqz v0, :cond_1

    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v2, p0, Lm/a0;->l0:[Lm/z;

    move-object v0, v2

    :cond_2
    aget-object v2, v0, p1

    if-nez v2, :cond_3

    new-instance v2, Lm/z;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput p1, v2, Lm/z;->a:I

    iput-boolean v1, v2, Lm/z;->n:Z

    aput-object v2, v0, p1

    :cond_3
    return-object v2
.end method

.method public final E()V
    .locals 3

    invoke-virtual {p0}, Lm/a0;->B()V

    iget-boolean v0, p0, Lm/a0;->f0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v1, Lm/n0;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, Lm/a0;->g0:Z

    invoke-direct {v1, v0, v2}, Lm/n0;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Lm/a0;->O:Lm/b;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    if-eqz v1, :cond_2

    new-instance v1, Lm/n0;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, Lm/n0;-><init>(Landroid/app/Dialog;)V

    iput-object v1, p0, Lm/a0;->O:Lm/b;

    :cond_2
    :goto_0
    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lm/a0;->B0:Z

    invoke-virtual {v0, v1}, Lm/b;->n(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final F(I)V
    .locals 2

    iget v0, p0, Lm/a0;->z0:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lm/a0;->z0:I

    iget-boolean p1, p0, Lm/a0;->y0:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, Lm/a0;->A0:Landroidx/databinding/s;

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Lm/a0;->y0:Z

    :cond_0
    return-void
.end method

.method public final G(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_6

    if-eq p2, v1, :cond_5

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_5

    const/4 v0, 0x2

    if-eq p2, v0, :cond_5

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lm/a0;->x0:Lm/x;

    if-nez p2, :cond_0

    new-instance p2, Lm/x;

    invoke-direct {p2, p0, p1}, Lm/x;-><init>(Lm/a0;Landroid/content/Context;)V

    iput-object p2, p0, Lm/a0;->x0:Lm/x;

    :cond_0
    iget-object p1, p0, Lm/a0;->x0:Lm/x;

    invoke-virtual {p1}, Lm/x;->L()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lm/a0;->w0:Lm/x;

    if-nez p2, :cond_4

    new-instance p2, Lm/x;

    invoke-static {p1}, Lgm/r;->I(Landroid/content/Context;)Lgm/r;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lm/x;-><init>(Lm/a0;Lgm/r;)V

    iput-object p2, p0, Lm/a0;->w0:Lm/x;

    :cond_4
    iget-object p1, p0, Lm/a0;->w0:Lm/x;

    invoke-virtual {p1}, Lm/x;->L()I

    move-result p1

    return p1

    :cond_5
    return p2

    :cond_6
    :goto_0
    return v1
.end method

.method public final H()Z
    .locals 5

    iget-boolean v0, p0, Lm/a0;->n0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lm/a0;->n0:Z

    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v2

    iget-boolean v3, v2, Lm/z;->m:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    if-nez v0, :cond_2

    invoke-virtual {p0, v2, v4}, Lm/a0;->x(Lm/z;Z)V

    return v4

    :cond_0
    iget-object v0, p0, Lm/a0;->U:Lq/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lq/b;->c()V

    return v4

    :cond_1
    invoke-virtual {p0}, Lm/a0;->E()V

    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lm/b;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    return v4

    :cond_3
    return v1
.end method

.method public final I(Lm/z;Landroid/view/KeyEvent;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v1, Lm/z;->m:Z

    iget v3, v1, Lm/z;->a:I

    if-nez v2, :cond_17

    iget-boolean v2, v0, Lm/a0;->q0:Z

    if-eqz v2, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v2, v0, Lm/a0;->K:Landroid/content/Context;

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0xf

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v4, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    iget-object v6, v1, Lm/z;->h:Lr/l;

    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0, v1, v5}, Lm/a0;->x(Lm/z;Z)V

    return-void

    :cond_2
    const-string v4, "window"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/WindowManager;

    if-nez v4, :cond_3

    goto/16 :goto_9

    :cond_3
    invoke-virtual/range {p0 .. p2}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_9

    :cond_4
    iget-object v6, v1, Lm/z;->e:Lm/y;

    const/4 v7, 0x0

    const/4 v8, -0x2

    if-eqz v6, :cond_6

    iget-boolean v9, v1, Lm/z;->n:Z

    if-eqz v9, :cond_5

    goto :goto_0

    :cond_5
    iget-object v2, v1, Lm/z;->g:Landroid/view/View;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_15

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v6, -0x1

    if-ne v2, v6, :cond_15

    move v10, v6

    goto/16 :goto_7

    :cond_6
    :goto_0
    if-nez v6, :cond_b

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v6, v0, Lm/a0;->O:Lm/b;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lm/b;->e()Landroid/content/Context;

    move-result-object v6

    goto :goto_1

    :cond_7
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    move-object v2, v6

    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    const v10, 0x7f040005

    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_9

    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_9
    const v10, 0x7f0404e1

    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_a

    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_3

    :cond_a
    const v6, 0x7f15037f

    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :goto_3
    new-instance v6, Lq/d;

    invoke-direct {v6, v2, v7}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, Lq/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v6, v1, Lm/z;->j:Lq/d;

    sget-object v2, Ll/a;->j:[I

    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v6, 0x56

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v1, Lm/z;->b:I

    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v1, Lm/z;->d:I

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v2, Lm/y;

    iget-object v6, v1, Lm/z;->j:Lq/d;

    invoke-direct {v2, v0, v6}, Lm/y;-><init>(Lm/a0;Lq/d;)V

    iput-object v2, v1, Lm/z;->e:Lm/y;

    const/16 v2, 0x51

    iput v2, v1, Lm/z;->c:I

    goto :goto_4

    :cond_b
    iget-boolean v2, v1, Lm/z;->n:Z

    if-eqz v2, :cond_c

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_c

    iget-object v2, v1, Lm/z;->e:Lm/y;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_c
    :goto_4
    iget-object v2, v1, Lm/z;->g:Landroid/view/View;

    if-eqz v2, :cond_d

    iput-object v2, v1, Lm/z;->f:Landroid/view/View;

    goto :goto_5

    :cond_d
    iget-object v2, v1, Lm/z;->h:Lr/l;

    if-nez v2, :cond_e

    goto/16 :goto_8

    :cond_e
    iget-object v2, v0, Lm/a0;->T:Lm/s;

    if-nez v2, :cond_f

    new-instance v2, Lm/s;

    const/4 v6, 0x1

    invoke-direct {v2, v0, v6}, Lm/s;-><init>(Lm/a0;I)V

    iput-object v2, v0, Lm/a0;->T:Lm/s;

    :cond_f
    iget-object v2, v0, Lm/a0;->T:Lm/s;

    iget-object v6, v1, Lm/z;->i:Lr/h;

    if-nez v6, :cond_10

    new-instance v6, Lr/h;

    iget-object v9, v1, Lm/z;->j:Lq/d;

    invoke-direct {v6, v9}, Lr/h;-><init>(Landroid/content/Context;)V

    iput-object v6, v1, Lm/z;->i:Lr/h;

    invoke-virtual {v6, v2}, Lr/h;->h(Lr/w;)V

    iget-object v2, v1, Lm/z;->h:Lr/l;

    iget-object v6, v1, Lm/z;->i:Lr/h;

    invoke-virtual {v2, v6}, Lr/l;->b(Lr/x;)V

    :cond_10
    iget-object v2, v1, Lm/z;->i:Lr/h;

    iget-object v6, v1, Lm/z;->e:Lm/y;

    invoke-virtual {v2, v6}, Lr/h;->c(Landroid/view/ViewGroup;)Lr/z;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iput-object v2, v1, Lm/z;->f:Landroid/view/View;

    if-eqz v2, :cond_16

    :goto_5
    iget-object v2, v1, Lm/z;->f:Landroid/view/View;

    if-nez v2, :cond_11

    goto :goto_8

    :cond_11
    iget-object v2, v1, Lm/z;->g:Landroid/view/View;

    if-eqz v2, :cond_12

    goto :goto_6

    :cond_12
    iget-object v2, v1, Lm/z;->i:Lr/h;

    invoke-virtual {v2}, Lr/h;->a()Lr/g;

    move-result-object v2

    invoke-virtual {v2}, Lr/g;->getCount()I

    move-result v2

    if-lez v2, :cond_16

    :goto_6
    iget-object v2, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-nez v2, :cond_13

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_13
    iget v6, v1, Lm/z;->b:I

    iget-object v9, v1, Lm/z;->e:Lm/y;

    invoke-virtual {v9, v6}, Lm/y;->setBackgroundResource(I)V

    iget-object v6, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v9, v6, Landroid/view/ViewGroup;

    if-eqz v9, :cond_14

    check-cast v6, Landroid/view/ViewGroup;

    iget-object v9, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_14
    iget-object v6, v1, Lm/z;->e:Lm/y;

    iget-object v9, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-nez v2, :cond_15

    iget-object v2, v1, Lm/z;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    :cond_15
    move v10, v8

    :goto_7
    iput-boolean v7, v1, Lm/z;->l:Z

    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    const/high16 v15, 0x820000

    const/16 v16, -0x3

    const/4 v11, -0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x3ea

    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v2, v1, Lm/z;->c:I

    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v2, v1, Lm/z;->d:I

    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v2, v1, Lm/z;->e:Lm/y;

    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v5, v1, Lm/z;->m:Z

    if-nez v3, :cond_17

    invoke-virtual {v0}, Lm/a0;->M()V

    return-void

    :cond_16
    :goto_8
    iput-boolean v5, v1, Lm/z;->n:Z

    :cond_17
    :goto_9
    return-void
.end method

.method public final J(Lm/z;ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lm/z;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object p1, p1, Lm/z;->h:Lr/l;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Lr/l;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    return v1
.end method

.method public final K(Lm/z;Landroid/view/KeyEvent;)Z
    .locals 12

    iget-boolean v0, p0, Lm/a0;->q0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-boolean v0, p1, Lm/z;->k:Z

    iget v2, p1, Lm/z;->a:I

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    return v3

    :cond_1
    iget-object v0, p0, Lm/a0;->m0:Lm/z;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lm/a0;->x(Lm/z;Z)V

    :cond_2
    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p1, Lm/z;->g:Landroid/view/View;

    :cond_3
    const/16 v4, 0x6c

    if-eqz v2, :cond_5

    if-ne v2, v4, :cond_4

    goto :goto_0

    :cond_4
    move v5, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v5, v3

    :goto_1
    if-eqz v5, :cond_6

    iget-object v6, p0, Lm/a0;->R:Ls/a1;

    if-eqz v6, :cond_6

    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r()V

    :cond_6
    iget-object v6, p1, Lm/z;->g:Landroid/view/View;

    if-nez v6, :cond_1e

    if-eqz v5, :cond_7

    iget-object v6, p0, Lm/a0;->O:Lm/b;

    instance-of v6, v6, Lm/i0;

    if-nez v6, :cond_1e

    :cond_7
    iget-object v6, p1, Lm/z;->h:Lr/l;

    const/4 v7, 0x0

    if-eqz v6, :cond_8

    iget-boolean v8, p1, Lm/z;->o:Z

    if-eqz v8, :cond_18

    :cond_8
    if-nez v6, :cond_11

    iget-object v6, p0, Lm/a0;->K:Landroid/content/Context;

    if-eqz v2, :cond_9

    if-ne v2, v4, :cond_d

    :cond_9
    iget-object v4, p0, Lm/a0;->R:Ls/a1;

    if-eqz v4, :cond_d

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    const v9, 0x7f04000c

    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    const v10, 0x7f04000d

    if-eqz v9, :cond_a

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_a
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v9, v7

    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_c

    if-nez v9, :cond_b

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_b
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_c
    if-eqz v9, :cond_d

    new-instance v4, Lq/d;

    invoke-direct {v4, v6, v1}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Lq/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v6, v4

    :cond_d
    new-instance v4, Lr/l;

    invoke-direct {v4, v6}, Lr/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, p0}, Lr/l;->v(Lr/j;)V

    iget-object v6, p1, Lm/z;->h:Lr/l;

    if-ne v4, v6, :cond_e

    goto :goto_3

    :cond_e
    if-eqz v6, :cond_f

    iget-object v8, p1, Lm/z;->i:Lr/h;

    invoke-virtual {v6, v8}, Lr/l;->s(Lr/x;)V

    :cond_f
    iput-object v4, p1, Lm/z;->h:Lr/l;

    iget-object v6, p1, Lm/z;->i:Lr/h;

    if-eqz v6, :cond_10

    invoke-virtual {v4, v6}, Lr/l;->b(Lr/x;)V

    :cond_10
    :goto_3
    iget-object v4, p1, Lm/z;->h:Lr/l;

    if-nez v4, :cond_11

    goto :goto_5

    :cond_11
    if-eqz v5, :cond_13

    iget-object v4, p0, Lm/a0;->R:Ls/a1;

    if-eqz v4, :cond_13

    iget-object v6, p0, Lm/a0;->S:Lm/s;

    if-nez v6, :cond_12

    new-instance v6, Lm/s;

    const/4 v8, 0x0

    invoke-direct {v6, p0, v8}, Lm/s;-><init>(Lm/a0;I)V

    iput-object v6, p0, Lm/a0;->S:Lm/s;

    :cond_12
    iget-object v6, p1, Lm/z;->h:Lr/l;

    iget-object v8, p0, Lm/a0;->S:Lm/s;

    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q(Landroid/view/Menu;Lr/w;)V

    :cond_13
    iget-object v4, p1, Lm/z;->h:Lr/l;

    invoke-virtual {v4}, Lr/l;->z()V

    iget-object v4, p1, Lm/z;->h:Lr/l;

    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_17

    iget-object p2, p1, Lm/z;->h:Lr/l;

    if-nez p2, :cond_14

    goto :goto_4

    :cond_14
    if-eqz p2, :cond_15

    iget-object v0, p1, Lm/z;->i:Lr/h;

    invoke-virtual {p2, v0}, Lr/l;->s(Lr/x;)V

    :cond_15
    iput-object v7, p1, Lm/z;->h:Lr/l;

    :goto_4
    if-eqz v5, :cond_16

    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    if-eqz p1, :cond_16

    iget-object p2, p0, Lm/a0;->S:Lm/s;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q(Landroid/view/Menu;Lr/w;)V

    :cond_16
    :goto_5
    return v1

    :cond_17
    iput-boolean v1, p1, Lm/z;->o:Z

    :cond_18
    iget-object v2, p1, Lm/z;->h:Lr/l;

    invoke-virtual {v2}, Lr/l;->z()V

    iget-object v2, p1, Lm/z;->p:Landroid/os/Bundle;

    if-eqz v2, :cond_19

    iget-object v4, p1, Lm/z;->h:Lr/l;

    invoke-virtual {v4, v2}, Lr/l;->t(Landroid/os/Bundle;)V

    iput-object v7, p1, Lm/z;->p:Landroid/os/Bundle;

    :cond_19
    iget-object v2, p1, Lm/z;->g:Landroid/view/View;

    iget-object v4, p1, Lm/z;->h:Lr/l;

    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_1b

    if-eqz v5, :cond_1a

    iget-object p2, p0, Lm/a0;->R:Ls/a1;

    if-eqz p2, :cond_1a

    iget-object v0, p0, Lm/a0;->S:Lm/s;

    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q(Landroid/view/Menu;Lr/w;)V

    :cond_1a
    iget-object p1, p1, Lm/z;->h:Lr/l;

    invoke-virtual {p1}, Lr/l;->y()V

    return v1

    :cond_1b
    if-eqz p2, :cond_1c

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_6

    :cond_1c
    const/4 p2, -0x1

    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v3, :cond_1d

    move p2, v3

    goto :goto_7

    :cond_1d
    move p2, v1

    :goto_7
    iget-object v0, p1, Lm/z;->h:Lr/l;

    invoke-virtual {v0, p2}, Lr/l;->setQwertyMode(Z)V

    iget-object p2, p1, Lm/z;->h:Lr/l;

    invoke-virtual {p2}, Lr/l;->y()V

    :cond_1e
    iput-boolean v3, p1, Lm/z;->k:Z

    iput-boolean v1, p1, Lm/z;->l:Z

    iput-object p1, p0, Lm/a0;->m0:Lm/z;

    return v3
.end method

.method public final L()V
    .locals 2

    iget-boolean v0, p0, Lm/a0;->Z:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final M()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-boolean v0, v0, Lm/z;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lm/a0;->U:Lq/b;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    iget-object v0, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    if-nez v0, :cond_3

    iget-object v0, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v0, p0}, Lm/v;->b(Ljava/lang/Object;Lm/a0;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    return-void

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v1, v0}, Lm/v;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    :cond_4
    return-void
.end method

.method public final a(Lr/l;Landroid/view/MenuItem;)Z
    .locals 7

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lm/a0;->q0:Z

    if-nez v2, :cond_3

    invoke-virtual {p1}, Lr/l;->l()Lr/l;

    move-result-object p1

    iget-object v2, p0, Lm/a0;->l0:[Lm/z;

    if-eqz v2, :cond_0

    array-length v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    iget-object v6, v5, Lm/z;->h:Lr/l;

    if-ne v6, p1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_3

    iget p1, v5, Lm/z;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final b(Lr/l;)V
    .locals 5

    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lm/a0;->K:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_0
    iget-object p1, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, Lm/a0;->R:Ls/a1;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_1

    iget-object v0, p0, Lm/a0;->R:Ls/a1;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()Z

    iget-boolean v0, p0, Lm/a0;->q0:Z

    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-object v0, v0, Lm/z;->h:Lr/l;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_1
    if-eqz p1, :cond_3

    iget-boolean v2, p0, Lm/a0;->q0:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lm/a0;->y0:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lm/a0;->z0:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lm/a0;->A0:Landroidx/databinding/s;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v2}, Landroidx/databinding/s;->run()V

    :cond_2
    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-object v2, v0, Lm/z;->h:Lr/l;

    if-eqz v2, :cond_3

    iget-boolean v4, v0, Lm/z;->o:Z

    if-nez v4, :cond_3

    iget-object v4, v0, Lm/z;->g:Landroid/view/View;

    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lm/z;->h:Lr/l;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->s()Z

    :cond_3
    return-void

    :cond_4
    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object p1

    iput-boolean v0, p1, Lm/z;->n:Z

    invoke-virtual {p0, p1, v1}, Lm/a0;->x(Lm/z;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm/a0;->I(Lm/z;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lm/a0;->K:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lm/a0;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lm/a0;->E()V

    iget-object v0, p0, Lm/a0;->O:Lm/b;

    invoke-virtual {v0}, Lm/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm/a0;->F(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/a0;->o0:Z

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lm/a0;->s(ZZ)Z

    invoke-virtual {p0}, Lm/a0;->C()V

    iget-object v1, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    :try_start_0
    check-cast v1, Landroid/app/Activity;

    invoke-static {v1}, Landroidx/core/app/NavUtils;->getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lm/a0;->O:Lm/b;

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lm/a0;->B0:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v0}, Lm/b;->n(Z)V

    :cond_1
    :goto_1
    sget-object v1, Lm/q;->H:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    invoke-static {p0}, Lm/q;->k(Lm/a0;)V

    sget-object v2, Lm/q;->G:La0/h;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, La0/h;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    iget-object v2, p0, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v1, p0, Lm/a0;->r0:Landroid/content/res/Configuration;

    iput-boolean v0, p0, Lm/a0;->p0:Z

    return-void
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Lm/q;->H:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lm/q;->k(Lm/a0;)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lm/a0;->y0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lm/a0;->A0:Landroidx/databinding/s;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/a0;->q0:Z

    iget v0, p0, Lm/a0;->s0:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lm/a0;->H0:La0/f1;

    iget-object v1, p0, Lm/a0;->J:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lm/a0;->s0:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v0, Lm/a0;->H0:La0/f1;

    iget-object v1, p0, Lm/a0;->J:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lm/b;->h()V

    :cond_3
    iget-object v0, p0, Lm/a0;->w0:Lm/x;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lb3/b;->h()V

    :cond_4
    iget-object v0, p0, Lm/a0;->x0:Lm/x;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lb3/b;->h()V

    :cond_5
    return-void
.end method

.method public final l(I)Z
    .locals 5

    const/16 v0, 0x8

    const/16 v1, 0x6d

    const/16 v2, 0x6c

    const-string v3, "AppCompatDelegate"

    if-ne p1, v0, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lm/a0;->j0:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne p1, v2, :cond_2

    return v3

    :cond_2
    iget-boolean v0, p0, Lm/a0;->f0:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v4, :cond_3

    iput-boolean v3, p0, Lm/a0;->f0:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    if-eq p1, v2, :cond_5

    if-eq p1, v1, :cond_4

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->g0:Z

    return v4

    :cond_5
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->f0:Z

    return v4

    :cond_6
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->h0:Z

    return v4

    :cond_7
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->e0:Z

    return v4

    :cond_8
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->d0:Z

    return v4

    :cond_9
    invoke-virtual {p0}, Lm/a0;->L()V

    iput-boolean v4, p0, Lm/a0;->j0:Z

    return v4
.end method

.method public final m(I)V
    .locals 2

    invoke-virtual {p0}, Lm/a0;->B()V

    iget-object v0, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lm/a0;->K:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lm/a0;->M:Lm/w;

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm/w;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lm/a0;->B()V

    iget-object v0, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lm/a0;->M:Lm/w;

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm/w;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final o(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lm/a0;->B()V

    iget-object v0, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lm/a0;->M:Lm/w;

    iget-object p2, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/w;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object p1, p0, Lm/a0;->E0:Lm/f0;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Ll/a;->j:[I

    iget-object v1, p0, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v2, 0x74

    .line 3
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v2, :cond_0

    .line 5
    new-instance p1, Lm/f0;

    invoke-direct {p1}, Lm/f0;-><init>()V

    iput-object p1, p0, Lm/a0;->E0:Lm/f0;

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/f0;

    iput-object p1, p0, Lm/a0;->E0:Lm/f0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Falling back to default."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppCompatDelegate"

    invoke-static {v2, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    new-instance p1, Lm/f0;

    invoke-direct {p1}, Lm/f0;-><init>()V

    iput-object p1, p0, Lm/a0;->E0:Lm/f0;

    .line 11
    :cond_1
    :goto_0
    iget-object p1, p0, Lm/a0;->E0:Lm/f0;

    .line 12
    sget v1, Ls/v2;->a:I

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    sget-object v1, Ll/a;->y:[I

    const/4 v2, 0x0

    invoke-virtual {p3, p4, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v3, 0x4

    .line 15
    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_2

    .line 16
    const-string v5, "AppCompatViewInflater"

    const-string v6, "app:theme is now deprecated. Please move to using android:theme instead."

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    :cond_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v4, :cond_4

    .line 18
    instance-of v1, p3, Lq/d;

    if-eqz v1, :cond_3

    move-object v1, p3

    check-cast v1, Lq/d;

    .line 19
    iget v1, v1, Lq/d;->a:I

    if-eq v1, v4, :cond_4

    .line 20
    :cond_3
    new-instance v1, Lq/d;

    invoke-direct {v1, p3, v4}, Lq/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_4
    move-object v1, p3

    .line 21
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x3

    sparse-switch v4, :sswitch_data_0

    :goto_2
    move v3, v6

    goto/16 :goto_3

    :sswitch_0
    const-string v3, "Button"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const/16 v3, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v3, "EditText"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const/16 v3, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v3, "CheckBox"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    const/16 v3, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v3, "AutoCompleteTextView"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_2

    :cond_8
    const/16 v3, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v3, "ImageView"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_2

    :cond_9
    const/16 v3, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v3, "ToggleButton"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_2

    :cond_a
    const/16 v3, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v3, "RadioButton"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_2

    :cond_b
    const/4 v3, 0x7

    goto :goto_3

    :sswitch_7
    const-string v3, "Spinner"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_2

    :cond_c
    const/4 v3, 0x6

    goto :goto_3

    :sswitch_8
    const-string v3, "SeekBar"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_2

    :cond_d
    const/4 v3, 0x5

    goto :goto_3

    :sswitch_9
    const-string v4, "ImageButton"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_2

    :sswitch_a
    const-string v3, "TextView"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto/16 :goto_2

    :cond_e
    move v3, v7

    goto :goto_3

    :sswitch_b
    const-string v3, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto/16 :goto_2

    :cond_f
    const/4 v3, 0x2

    goto :goto_3

    :sswitch_c
    const-string v3, "CheckedTextView"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto/16 :goto_2

    :cond_10
    move v3, v5

    goto :goto_3

    :sswitch_d
    const-string v3, "RatingBar"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto/16 :goto_2

    :cond_11
    move v3, v2

    :cond_12
    :goto_3
    packed-switch v3, :pswitch_data_0

    move-object v3, v0

    goto :goto_4

    .line 22
    :pswitch_0
    invoke-virtual {p1, v1, p4}, Lm/f0;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v3

    goto :goto_4

    .line 23
    :pswitch_1
    new-instance v3, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-direct {v3, v1, p4}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 24
    :pswitch_2
    invoke-virtual {p1, v1, p4}, Lm/f0;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v3

    goto :goto_4

    .line 25
    :pswitch_3
    invoke-virtual {p1, v1, p4}, Lm/f0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Ls/l;

    move-result-object v3

    goto :goto_4

    .line 26
    :pswitch_4
    new-instance v3, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-direct {v3, v1, p4}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 27
    :pswitch_5
    new-instance v3, Ls/y0;

    invoke-direct {v3, v1, p4}, Ls/y0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 28
    :pswitch_6
    invoke-virtual {p1, v1, p4}, Lm/f0;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Ls/x;

    move-result-object v3

    goto :goto_4

    .line 29
    :pswitch_7
    new-instance v3, Ls/l0;

    invoke-direct {v3, v1, p4}, Ls/l0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_8
    new-instance v3, Ls/a0;

    invoke-direct {v3, v1, p4}, Ls/a0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 31
    :pswitch_9
    new-instance v3, Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-direct {v3, v1, p4}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 32
    :pswitch_a
    invoke-virtual {p1, v1, p4}, Lm/f0;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v3

    goto :goto_4

    .line 33
    :pswitch_b
    new-instance v3, Ls/u;

    invoke-direct {v3, v1, p4}, Ls/u;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 34
    :pswitch_c
    new-instance v3, Ls/n;

    invoke-direct {v3, v1, p4}, Ls/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 35
    :pswitch_d
    new-instance v3, Ls/y;

    invoke-direct {v3, v1, p4}, Ls/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v3, :cond_17

    if-eq p3, v1, :cond_17

    .line 36
    iget-object p3, p1, Lm/f0;->a:[Ljava/lang/Object;

    const-string v3, "view"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 37
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 38
    :cond_13
    :try_start_1
    aput-object v1, p3, v2

    .line 39
    aput-object p4, p3, v5

    const/16 v3, 0x2e

    .line 40
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ne v6, v3, :cond_16

    move v3, v2

    .line 41
    :goto_5
    sget-object v4, Lm/f0;->g:[Ljava/lang/String;

    if-ge v3, v7, :cond_15

    .line 42
    aget-object v4, v4, v3

    invoke-virtual {p1, v1, p2, v4}, Lm/f0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_14

    .line 43
    aput-object v0, p3, v2

    .line 44
    aput-object v0, p3, v5

    move-object v0, v4

    goto :goto_7

    :cond_14
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 45
    :cond_15
    aput-object v0, p3, v2

    .line 46
    aput-object v0, p3, v5

    goto :goto_7

    .line 47
    :cond_16
    :try_start_2
    invoke-virtual {p1, v1, p2, v0}, Lm/f0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    aput-object v0, p3, v2

    .line 49
    aput-object v0, p3, v5

    move-object v0, p1

    goto :goto_7

    .line 50
    :goto_6
    aput-object v0, p3, v2

    .line 51
    aput-object v0, p3, v5

    .line 52
    throw p1

    .line 53
    :catch_0
    aput-object v0, p3, v2

    .line 54
    aput-object v0, p3, v5

    :goto_7
    move-object v3, v0

    :cond_17
    if-eqz v3, :cond_1f

    .line 55
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 56
    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_1a

    invoke-virtual {v3}, Landroid/view/View;->hasOnClickListeners()Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_8

    .line 57
    :cond_18
    sget-object p2, Lm/f0;->c:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 58
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_19

    .line 59
    new-instance p3, Lm/e0;

    invoke-direct {p3, v3, p2}, Lm/e0;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    :cond_19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    :cond_1a
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-le p1, p2, :cond_1b

    goto :goto_9

    .line 62
    :cond_1b
    sget-object p1, Lm/f0;->d:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 63
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1c

    .line 64
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    sget-object p3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    .line 65
    new-instance p3, Lh5/d0;

    invoke-direct {p3, v7}, Lh5/d0;-><init>(I)V

    .line 66
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, v3, p2}, Lh5/d0;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 67
    :cond_1c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    sget-object p1, Lm/f0;->e:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    .line 70
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Lh5/p0;->o(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 71
    :cond_1d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 72
    sget-object p1, Lm/f0;->f:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 73
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1e

    .line 74
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 75
    sget-object p3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    .line 76
    new-instance p3, Lh5/d0;

    invoke-direct {p3, v2}, Lh5/d0;-><init>(I)V

    .line 77
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, v3, p2}, Lh5/d0;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 78
    :cond_1e
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1f
    :goto_9
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 79
    invoke-virtual {p0, v0, p1, p2, p3}, Lm/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lm/a0;->Q:Ljava/lang/CharSequence;

    iget-object v0, p0, Lm/a0;->R:Ls/a1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ls/a1;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lm/b;->x(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, Lm/a0;->b0:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public final q(Lq/a;)Lq/b;
    .locals 8

    if-eqz p1, :cond_12

    iget-object v0, p0, Lm/a0;->U:Lq/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/b;->c()V

    :cond_0
    new-instance v0, Lqg3/d;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lqg3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {p0}, Lm/a0;->E()V

    iget-object p1, p0, Lm/a0;->O:Lm/b;

    iget-object v1, p0, Lm/a0;->N:Ljava/lang/Object;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lm/b;->y(Lqg3/d;)Lq/b;

    move-result-object p1

    iput-object p1, p0, Lm/a0;->U:Lq/b;

    if-eqz p1, :cond_1

    invoke-interface {v1, p1}, Lm/n;->onSupportActionModeStarted(Lq/b;)V

    :cond_1
    iget-object p1, p0, Lm/a0;->U:Lq/b;

    if-nez p1, :cond_11

    iget-object p1, p0, Lm/a0;->Y:Lh5/t0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lh5/t0;->b()V

    :cond_2
    iget-object p1, p0, Lm/a0;->U:Lq/b;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lq/b;->c()V

    :cond_3
    iget-boolean p1, p0, Lm/a0;->q0:Z

    const/4 v3, 0x0

    if-nez p1, :cond_4

    :try_start_0
    invoke-interface {v1, v0}, Lm/n;->onWindowStartingSupportActionMode(Lq/a;)Lq/b;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_4
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_5

    iput-object p1, p0, Lm/a0;->U:Lq/b;

    goto/16 :goto_5

    :cond_5
    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x1

    if-nez p1, :cond_a

    iget-boolean p1, p0, Lm/a0;->i0:Z

    iget-object v5, p0, Lm/a0;->K:Landroid/content/Context;

    if-eqz p1, :cond_7

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f04000c

    invoke-virtual {v6, v7, p1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_6

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v6, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v6, Lq/d;

    invoke-direct {v6, v5, v2}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, Lq/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v5, v6

    :cond_6
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v6, v5}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v6, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v6, Landroid/widget/PopupWindow;

    const v7, 0x7f04001b

    invoke-direct {v6, v5, v3, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v6, p0, Lm/a0;->W:Landroid/widget/PopupWindow;

    invoke-static {v6}, Lup/d;->Q(Landroid/widget/PopupWindow;)V

    iget-object v6, p0, Lm/a0;->W:Landroid/widget/PopupWindow;

    iget-object v7, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v6, p0, Lm/a0;->W:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f040006

    invoke-virtual {v6, v7, p1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {p1, v5}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p1

    iget-object v5, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object p1, p0, Lm/a0;->W:Landroid/widget/PopupWindow;

    const/4 v5, -0x2

    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance p1, Lbq/b;

    const/16 v5, 0x11

    invoke-direct {p1, p0, v5}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lm/a0;->X:Lbq/b;

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v6, 0x7f0a008b

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lm/a0;->E()V

    iget-object v6, p0, Lm/a0;->O:Lm/b;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lm/b;->e()Landroid/content/Context;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v3

    :goto_1
    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    move-object v5, v6

    :goto_2
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_a
    :goto_3
    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lm/a0;->Y:Lh5/t0;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lh5/t0;->b()V

    :cond_b
    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    new-instance p1, Lq/e;

    iget-object v5, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {p1, v5, v6, v0}, Lq/e;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lqg3/d;)V

    invoke-virtual {p1}, Lq/e;->e()Lr/l;

    move-result-object v5

    invoke-virtual {v0, p1, v5}, Lqg3/d;->t(Lq/b;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lq/e;->i()V

    iget-object v0, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lq/b;)V

    iput-object p1, p0, Lm/a0;->U:Lq/b;

    iget-boolean p1, p0, Lm/a0;->Z:Z

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_c

    iget-object p1, p0, Lm/a0;->a0:Landroid/view/ViewGroup;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Lh5/p0;->a(Landroid/view/View;)Lh5/t0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lh5/t0;->a(F)V

    iput-object p1, p0, Lm/a0;->Y:Lh5/t0;

    new-instance v0, Lm/r;

    invoke-direct {v0, p0, v4}, Lm/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lh5/t0;->d(Lh5/u0;)V

    goto :goto_4

    :cond_c
    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lh5/f0;->c(Landroid/view/View;)V

    :cond_d
    :goto_4
    iget-object p1, p0, Lm/a0;->W:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lm/a0;->X:Lbq/b;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_e
    iput-object v3, p0, Lm/a0;->U:Lq/b;

    :cond_f
    :goto_5
    iget-object p1, p0, Lm/a0;->U:Lq/b;

    if-eqz p1, :cond_10

    invoke-interface {v1, p1}, Lm/n;->onSupportActionModeStarted(Lq/b;)V

    :cond_10
    invoke-virtual {p0}, Lm/a0;->M()V

    iget-object p1, p0, Lm/a0;->U:Lq/b;

    iput-object p1, p0, Lm/a0;->U:Lq/b;

    :cond_11
    invoke-virtual {p0}, Lm/a0;->M()V

    iget-object p1, p0, Lm/a0;->U:Lq/b;

    return-object p1

    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(ZZ)Z
    .locals 16

    move-object/from16 v1, p0

    iget-boolean v0, v1, Lm/a0;->q0:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/16 v0, -0x64

    iget v3, v1, Lm/a0;->s0:I

    if-eq v3, v0, :cond_1

    goto :goto_0

    :cond_1
    sget v3, Lm/q;->x:I

    :goto_0
    iget-object v4, v1, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual {v1, v4, v3}, Lm/a0;->G(Landroid/content/Context;I)I

    move-result v5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    const/4 v7, 0x0

    if-ge v0, v6, :cond_2

    invoke-static {v4}, Lm/a0;->u(Landroid/content/Context;)Lb5/g;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    if-nez p2, :cond_3

    if-eqz v6, :cond_3

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-static {v6}, Lm/u;->b(Landroid/content/res/Configuration;)Lb5/g;

    move-result-object v6

    :cond_3
    invoke-static {v4, v5, v6, v7, v2}, Lm/a0;->y(Landroid/content/Context;ILb5/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v8

    iget-boolean v9, v1, Lm/a0;->v0:Z

    const/4 v10, 0x1

    iget-object v11, v1, Lm/a0;->J:Ljava/lang/Object;

    if-nez v9, :cond_6

    instance-of v9, v11, Landroid/app/Activity;

    if-eqz v9, :cond_6

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    if-nez v9, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    const/16 v12, 0x1d

    if-lt v0, v12, :cond_5

    const/high16 v0, 0x100c0000

    goto :goto_2

    :cond_5
    const/high16 v0, 0xc0000

    :goto_2
    :try_start_0
    new-instance v12, Landroid/content/ComponentName;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-direct {v12, v4, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v9, v12, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    if-eqz v0, :cond_6

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput v0, v1, Lm/a0;->u0:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v9, "AppCompatDelegate"

    const-string v12, "Exception while getting ActivityInfo"

    invoke-static {v9, v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput v2, v1, Lm/a0;->u0:I

    :cond_6
    :goto_3
    iput-boolean v10, v1, Lm/a0;->v0:Z

    iget v0, v1, Lm/a0;->u0:I

    :goto_4
    iget-object v9, v1, Lm/a0;->r0:Landroid/content/res/Configuration;

    if-nez v9, :cond_7

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    :cond_7
    iget v12, v9, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v12, v12, 0x30

    iget v13, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v13, v13, 0x30

    invoke-static {v9}, Lm/u;->b(Landroid/content/res/Configuration;)Lb5/g;

    move-result-object v9

    if-nez v6, :cond_8

    move-object v14, v7

    goto :goto_5

    :cond_8
    invoke-static {v8}, Lm/u;->b(Landroid/content/res/Configuration;)Lb5/g;

    move-result-object v14

    :goto_5
    if-eq v12, v13, :cond_9

    const/16 v12, 0x200

    goto :goto_6

    :cond_9
    move v12, v2

    :goto_6
    if-eqz v14, :cond_a

    invoke-virtual {v9, v14}, Lb5/g;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    or-int/lit16 v12, v12, 0x2004

    :cond_a
    not-int v9, v0

    and-int/2addr v9, v12

    if-eqz v9, :cond_d

    if-eqz p1, :cond_d

    iget-boolean v9, v1, Lm/a0;->o0:Z

    if-eqz v9, :cond_d

    sget-boolean v9, Lm/a0;->J0:Z

    if-nez v9, :cond_b

    iget-boolean v9, v1, Lm/a0;->p0:Z

    if-eqz v9, :cond_d

    :cond_b
    instance-of v9, v11, Landroid/app/Activity;

    if-eqz v9, :cond_d

    move-object v9, v11

    check-cast v9, Landroid/app/Activity;

    invoke-virtual {v9}, Landroid/app/Activity;->isChild()Z

    move-result v15

    if-nez v15, :cond_d

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v15, v2, :cond_c

    and-int/lit16 v2, v12, 0x2000

    if-eqz v2, :cond_c

    invoke-virtual {v9}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v8}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_c
    invoke-static {v9}, Landroidx/core/app/ActivityCompat;->recreate(Landroid/app/Activity;)V

    move v2, v10

    goto :goto_7

    :cond_d
    const/4 v2, 0x0

    :goto_7
    if-nez v2, :cond_12

    if-eqz v12, :cond_12

    and-int/2addr v0, v12

    if-ne v0, v12, :cond_e

    move v2, v10

    goto :goto_8

    :cond_e
    const/4 v2, 0x0

    :goto_8
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v8, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    iget v9, v9, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, -0x31

    or-int/2addr v9, v13

    iput v9, v8, Landroid/content/res/Configuration;->uiMode:I

    if-eqz v14, :cond_f

    invoke-static {v8, v14}, Lm/u;->d(Landroid/content/res/Configuration;Lb5/g;)V

    :cond_f
    invoke-virtual {v0, v8, v7}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    iget v0, v1, Lm/a0;->t0:I

    if-eqz v0, :cond_10

    invoke-virtual {v4, v0}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v7, v1, Lm/a0;->t0:I

    invoke-virtual {v0, v7, v10}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_10
    if-eqz v2, :cond_13

    instance-of v0, v11, Landroid/app/Activity;

    if-eqz v0, :cond_13

    move-object v0, v11

    check-cast v0, Landroid/app/Activity;

    instance-of v2, v0, Landroidx/lifecycle/g0;

    if-eqz v2, :cond_11

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/g0;

    invoke-interface {v2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v2

    sget-object v7, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v2, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_13

    invoke-virtual {v0, v8}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_11
    iget-boolean v2, v1, Lm/a0;->p0:Z

    if-eqz v2, :cond_13

    iget-boolean v2, v1, Lm/a0;->q0:Z

    if-nez v2, :cond_13

    invoke-virtual {v0, v8}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_12
    move v10, v2

    :cond_13
    :goto_9
    if-eqz v10, :cond_15

    instance-of v0, v11, Lm/m;

    if-eqz v0, :cond_15

    and-int/lit16 v0, v12, 0x200

    if-eqz v0, :cond_14

    move-object v0, v11

    check-cast v0, Lm/m;

    invoke-virtual {v0, v5}, Lm/m;->onNightModeChanged(I)V

    :cond_14
    and-int/lit8 v0, v12, 0x4

    if-eqz v0, :cond_15

    check-cast v11, Lm/m;

    invoke-virtual {v11, v6}, Lm/m;->onLocalesChanged(Lb5/g;)V

    :cond_15
    if-eqz v14, :cond_16

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {v0}, Lm/u;->b(Landroid/content/res/Configuration;)Lb5/g;

    move-result-object v0

    invoke-static {v0}, Lm/u;->c(Lb5/g;)V

    :cond_16
    if-nez v3, :cond_18

    iget-object v0, v1, Lm/a0;->w0:Lm/x;

    if-nez v0, :cond_17

    new-instance v0, Lm/x;

    invoke-static {v4}, Lgm/r;->I(Landroid/content/Context;)Lgm/r;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm/x;-><init>(Lm/a0;Lgm/r;)V

    iput-object v0, v1, Lm/a0;->w0:Lm/x;

    :cond_17
    iget-object v0, v1, Lm/a0;->w0:Lm/x;

    invoke-virtual {v0}, Lb3/b;->H()V

    goto :goto_a

    :cond_18
    iget-object v0, v1, Lm/a0;->w0:Lm/x;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lb3/b;->h()V

    :cond_19
    :goto_a
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1b

    iget-object v0, v1, Lm/a0;->x0:Lm/x;

    if-nez v0, :cond_1a

    new-instance v0, Lm/x;

    invoke-direct {v0, v1, v4}, Lm/x;-><init>(Lm/a0;Landroid/content/Context;)V

    iput-object v0, v1, Lm/a0;->x0:Lm/x;

    :cond_1a
    iget-object v0, v1, Lm/a0;->x0:Lm/x;

    invoke-virtual {v0}, Lb3/b;->H()V

    goto :goto_b

    :cond_1b
    iget-object v0, v1, Lm/a0;->x0:Lm/x;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Lb3/b;->h()V

    :cond_1c
    :goto_b
    return v10
.end method

.method public final t(Landroid/view/Window;)V
    .locals 3

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lm/w;

    if-nez v2, :cond_4

    new-instance v1, Lm/w;

    invoke-direct {v1, p0, v0}, Lm/w;-><init>(Lm/a0;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lm/a0;->M:Lm/w;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lm/a0;->K:Landroid/content/Context;

    sget-object v1, Lm/a0;->I0:[I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ls/m2;->p(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ls/m2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls/m2;->k(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0}, Ls/m2;->r()V

    iput-object p1, p0, Lm/a0;->L:Landroid/view/Window;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    if-nez p1, :cond_3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Lm/v;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Lm/a0;->G0:Landroid/window/OnBackInvokedCallback;

    :cond_1
    iget-object p1, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lm/v;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    goto :goto_0

    :cond_2
    iput-object v2, p0, Lm/a0;->F0:Landroid/window/OnBackInvokedDispatcher;

    :goto_0
    invoke-virtual {p0}, Lm/a0;->M()V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(ILm/z;Lr/l;)V
    .locals 3

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lm/a0;->l0:[Lm/z;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Lm/z;->h:Lr/l;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Lm/z;->m:Z

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lm/a0;->q0:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lm/a0;->M:Lm/w;

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v1, p2, Lm/w;->E:Z

    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p2, Lm/w;->E:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v2, p2, Lm/w;->E:Z

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final w(Lr/l;)V
    .locals 2

    iget-boolean v0, p0, Lm/a0;->k0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/a0;->k0:Z

    iget-object v0, p0, Lm/a0;->R:Ls/a1;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f()V

    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lm/a0;->q0:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lm/a0;->k0:Z

    return-void
.end method

.method public final x(Lm/z;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lm/z;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lm/a0;->R:Ls/a1;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lm/z;->h:Lr/l;

    invoke-virtual {p0, p1}, Lm/a0;->w(Lr/l;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm/a0;->K:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lm/z;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lm/z;->e:Lm/y;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lm/z;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lm/a0;->v(ILm/z;Lr/l;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lm/z;->k:Z

    iput-boolean p2, p1, Lm/z;->l:Z

    iput-boolean p2, p1, Lm/z;->m:Z

    iput-object v1, p1, Lm/z;->f:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lm/z;->n:Z

    iget-object p2, p0, Lm/a0;->m0:Lm/z;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lm/a0;->m0:Lm/z;

    :cond_2
    iget p1, p1, Lm/z;->a:I

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lm/a0;->M()V

    :cond_3
    return-void
.end method

.method public final z(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v1, v0, Lh5/j;

    if-nez v1, :cond_0

    instance-of v0, v0, Lm/c0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lvd/f;->o()V

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x52

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lm/a0;->M:Lm/w;

    iget-object v4, p0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iput-boolean v3, v0, Lm/w;->z:Z

    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, v0, Lm/w;->z:Z

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    iput-boolean v1, v0, Lm/w;->z:Z

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    const/4 v5, 0x4

    if-nez v4, :cond_6

    if-eq v0, v5, :cond_4

    if-eq v0, v2, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-boolean v1, v0, Lm/z;->m:Z

    if-nez v1, :cond_11

    invoke-virtual {p0, v0, p1}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    return v3

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move v3, v1

    :goto_0
    iput-boolean v3, p0, Lm/a0;->n0:Z

    return v1

    :cond_6
    if-eq v0, v5, :cond_10

    if-eq v0, v2, :cond_7

    goto/16 :goto_5

    :cond_7
    iget-object v0, p0, Lm/a0;->U:Lq/b;

    if-eqz v0, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-virtual {p0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-object v2, p0, Lm/a0;->R:Ls/a1;

    iget-object v4, p0, Lm/a0;->K:Landroid/content/Context;

    if-eqz v2, :cond_a

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lm/a0;->R:Ls/a1;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o()Z

    move-result v2

    if-nez v2, :cond_9

    iget-boolean v2, p0, Lm/a0;->q0:Z

    if-nez v2, :cond_d

    invoke-virtual {p0, v0, p1}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->s()Z

    move-result p1

    goto :goto_3

    :cond_9
    iget-object p1, p0, Lm/a0;->R:Ls/a1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()Z

    move-result p1

    goto :goto_3

    :cond_a
    iget-boolean v2, v0, Lm/z;->m:Z

    if-nez v2, :cond_e

    iget-boolean v5, v0, Lm/z;->l:Z

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    iget-boolean v2, v0, Lm/z;->k:Z

    if-eqz v2, :cond_d

    iget-boolean v2, v0, Lm/z;->o:Z

    if-eqz v2, :cond_c

    iput-boolean v1, v0, Lm/z;->k:Z

    invoke-virtual {p0, v0, p1}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    move-result v2

    goto :goto_1

    :cond_c
    move v2, v3

    :goto_1
    if-eqz v2, :cond_d

    invoke-virtual {p0, v0, p1}, Lm/a0;->I(Lm/z;Landroid/view/KeyEvent;)V

    move p1, v3

    goto :goto_3

    :cond_d
    move p1, v1

    goto :goto_3

    :cond_e
    :goto_2
    invoke-virtual {p0, v0, v3}, Lm/a0;->x(Lm/z;Z)V

    move p1, v2

    :goto_3
    if-eqz p1, :cond_11

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_f

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    return v3

    :cond_f
    const-string p1, "AppCompatDelegate"

    const-string v0, "Couldn\'t get audio manager"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_10
    invoke-virtual {p0}, Lm/a0;->H()Z

    move-result p1

    if-eqz p1, :cond_12

    :cond_11
    :goto_4
    return v3

    :cond_12
    :goto_5
    return v1
.end method
