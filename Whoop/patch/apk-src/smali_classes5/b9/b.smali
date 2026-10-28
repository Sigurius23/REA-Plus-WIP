.class public final Lb9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/q;
.implements Lwy/b;


# static fields
.field public static F:Lb9/b;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Z

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lb9/b;->w:I

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 40
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    .line 41
    new-array v0, p1, [F

    iput-object v0, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 42
    new-array p1, p1, [F

    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 43
    new-instance p1, Llo/w;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Llo/w;-><init>(I)V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    return-void

    .line 44
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    .line 45
    new-array v0, p1, [F

    iput-object v0, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 46
    new-array p1, p1, [F

    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 47
    new-instance p1, Llo/w;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Llo/w;-><init>(I)V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lb9/c0;Lx8/p;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/b;->w:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 57
    invoke-virtual {p5, p2, p1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object p2

    iput-object p2, p0, Lb9/b;->E:Ljava/lang/Object;

    .line 58
    new-instance p2, Lb9/a;

    .line 59
    invoke-virtual {p5, p3, p1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object p1

    invoke-direct {p2, p0, p1, p4}, Lb9/a;-><init>(Lb9/b;Lx8/r;Lb9/c0;)V

    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llo/r;)V
    .locals 3

    const/4 v0, 0x4

    iput v0, p0, Lb9/b;->w:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p2, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 16
    new-instance v0, Lm23/d;

    invoke-direct {v0, p1}, Lm23/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 17
    iput-boolean v1, p0, Lb9/b;->x:Z

    .line 18
    invoke-virtual {v0, v1}, Lm23/d;->setZoomingAllowed$photoview_dialog_release(Z)V

    .line 19
    invoke-virtual {v0, v1}, Lm23/d;->setSwipeToDismissAllowed$photoview_dialog_release(Z)V

    .line 20
    iget-object v1, p2, Llo/r;->w:Ljava/lang/Object;

    check-cast v1, [I

    .line 21
    invoke-virtual {v0, v1}, Lm23/d;->setContainerPadding$photoview_dialog_release([I)V

    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Lm23/d;->setImagesMargin$photoview_dialog_release(I)V

    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Lm23/d;->setOverlayView$photoview_dialog_release(Landroid/view/View;)V

    const/high16 v1, -0x1000000

    .line 24
    invoke-virtual {v0, v1}, Lm23/d;->setBackgroundColor(I)V

    .line 25
    iget-object v1, p2, Llo/r;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    .line 26
    iget v2, p2, Llo/r;->x:I

    .line 27
    iget-object p2, p2, Llo/r;->z:Ljava/lang/Object;

    check-cast p2, Li23/a;

    .line 28
    invoke-virtual {v0, v1, v2, p2}, Lm23/d;->f(Ljava/util/ArrayList;ILi23/a;)V

    .line 29
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v1, 0x1a

    invoke-direct {p2, p0, v1}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p2}, Lm23/d;->setOnPageChange$photoview_dialog_release(Lkotlin/jvm/functions/Function1;)V

    .line 30
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v1, 0x14

    invoke-direct {p2, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p2}, Lm23/d;->setOnDismiss$photoview_dialog_release(Lc93/a;)V

    .line 31
    new-instance p2, Lm/i;

    const v1, 0x7f1501a9

    invoke-direct {p2, p1, v1}, Lm/i;-><init>(Landroid/content/Context;I)V

    .line 32
    invoke-virtual {p2, v0}, Lm/i;->setView(Landroid/view/View;)Lm/i;

    move-result-object p1

    .line 33
    new-instance p2, Ll23/a;

    invoke-direct {p2, p0}, Ll23/a;-><init>(Lb9/b;)V

    .line 34
    iget-object v0, p1, Lm/i;->a:Lm/e;

    .line 35
    iput-object p2, v0, Lm/e;->p:Landroid/content/DialogInterface$OnKeyListener;

    .line 36
    invoke-virtual {p1}, Lm/i;->create()Lm/j;

    move-result-object p1

    .line 37
    new-instance p2, Lhe1/b;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lhe1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 38
    new-instance p2, Lea2/c;

    invoke-direct {p2, p0, v0}, Lea2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 39
    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb9/b;->w:I

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 50
    const-string p1, "ScopeProviderImpl"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/w0;ZLc93/a;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lb9/b;->w:I

    const-string v0, "paymentMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 4
    iput-boolean p3, p0, Lb9/b;->x:Z

    .line 5
    iput-object p4, p0, Lb9/b;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/y0;ZLc93/a;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lb9/b;->w:I

    const-string v0, "setupMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 9
    iput-boolean p3, p0, Lb9/b;->x:Z

    .line 10
    iput-object p4, p0, Lb9/b;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkg/a;Lgm/r;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb9/b;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llu/c;Llu/b;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lb9/b;->w:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    .line 68
    iput-object p2, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 69
    iget-boolean p2, p2, Llu/b;->c:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 70
    :cond_0
    iget p1, p1, Llu/c;->G:I

    .line 71
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp0/a0;Ly2/u1;Lp0/a1;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lb9/b;->w:I

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 62
    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 63
    iput-object p3, p0, Lb9/b;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Lb9/b;->x:Z

    return-void
.end method

.method public constructor <init>(Lt9/q;Lqa/j;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lb9/b;->w:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 53
    iput-object p2, p0, Lb9/b;->z:Ljava/lang/Object;

    .line 54
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lth/e;Lth/b;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lb9/b;->w:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    iput-object p2, p0, Lb9/b;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 66
    new-array p1, p1, [Z

    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltk/d;Ltk/c;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lb9/b;->w:I

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    .line 73
    iput-object p2, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 74
    iget-boolean p2, p2, Ltk/c;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 75
    :cond_0
    iget p1, p1, Ltk/d;->G:I

    .line 76
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxd3/f;Lxd3/c;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lb9/b;->w:I

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    .line 78
    iput-object p2, p0, Lb9/b;->y:Ljava/lang/Object;

    .line 79
    iget-boolean p2, p2, Lxd3/c;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    .line 81
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c(Lb9/b;)Ltk/c;
    .locals 0

    iget-object p0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast p0, Ltk/c;

    return-object p0
.end method

.method public static synthetic d(Lb9/b;)[Z
    .locals 0

    iget-object p0, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast p0, [Z

    return-object p0
.end method

.method public static g([F[F)V
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/16 v1, 0xa

    aget v2, p1, v1

    mul-float/2addr v2, v2

    const/16 v3, 0x8

    aget v4, p1, v3

    mul-float/2addr v4, v4

    add-float/2addr v4, v2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v2, v4

    aget v4, p1, v1

    div-float/2addr v4, v2

    aput v4, p0, v0

    aget p1, p1, v3

    div-float v0, p1, v2

    const/4 v5, 0x2

    aput v0, p0, v5

    neg-float p1, p1

    div-float/2addr p1, v2

    aput p1, p0, v3

    aput v4, p0, v1

    return-void
.end method

.method public static h([F[F)V
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/16 v1, 0xa

    aget v2, p1, v1

    mul-float/2addr v2, v2

    const/16 v3, 0x8

    aget v4, p1, v3

    mul-float/2addr v4, v4

    add-float/2addr v4, v2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v2, v4

    aget v4, p1, v1

    div-float/2addr v4, v2

    aput v4, p0, v0

    aget p1, p1, v3

    div-float v0, p1, v2

    const/4 v5, 0x2

    aput v0, p0, v5

    neg-float p1, p1

    div-float/2addr p1, v2

    aput p1, p0, v3

    aput v4, p0, v1

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget v0, p0, Lb9/b;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lxd3/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb9/b;->x:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lxd3/c;

    iget-object v1, v1, Lxd3/c;->g:Lb9/b;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lxd3/f;->h(Lb9/b;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb9/b;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw v1

    :sswitch_0
    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Ltk/d;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ltk/d;->b(Ltk/d;Lb9/b;Z)V

    return-void

    :sswitch_1
    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Llu/c;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Llu/c;->b(Llu/c;Lb9/b;Z)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Lb9/b;->x:Z

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lb9/b;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    iget v0, p0, Lb9/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lxd3/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb9/b;->x:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lxd3/c;

    iget-object v1, v1, Lxd3/c;->g:Lb9/b;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0, v2}, Lxd3/f;->h(Lb9/b;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean v2, p0, Lb9/b;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw v1

    :pswitch_0
    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Ltk/d;

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Ltk/d;->b(Ltk/d;Lb9/b;Z)V

    iput-boolean v1, p0, Lb9/b;->x:Z

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public f(Z)V
    .locals 3

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lth/e;

    iget-object v1, v0, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Lb9/b;->x:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v2, Lth/b;

    iget-object v2, v2, Lth/b;->g:Lb9/b;

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, p0, p1}, Lth/e;->b(Lth/e;Lb9/b;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lb9/b;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, Lxd3/c;

    iget-object v1, v0, Lxd3/c;->g:Lb9/b;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Lxd3/f;

    iget-boolean v2, v1, Lxd3/f;->L:Z

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, p0, v0}, Lxd3/f;->h(Lb9/b;Z)V

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Lxd3/c;->f:Z

    :cond_1
    return-void
.end method

.method public j()V
    .locals 1

    :cond_0
    invoke-virtual {p0}, Lb9/b;->u()Lkg/f;

    move-result-object v0

    if-nez v0, :cond_0

    return-void
.end method

.method public k(I)Lne3/e0;
    .locals 4

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lth/e;

    iget-object v1, v0, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Lb9/b;->x:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v2, [Z

    const/4 v3, 0x1

    aput-boolean v3, v2, p1

    iget-object v2, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v2, Lth/b;

    iget-object v2, v2, Lth/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, v0, Lth/e;->Q:Lth/d;

    move-object v2, p1

    check-cast v2, Lne3/e0;

    invoke-virtual {v0, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lth/d;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    throw p1

    :catch_1
    :cond_0
    :goto_0
    check-cast p1, Lne3/e0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_3
    const-string p1, "editor is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lt9/q;

    invoke-interface {v1}, Lt9/q;->l()V

    iget-boolean v1, p0, Lb9/b;->x:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa/m;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lqa/m;->i:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic m(Lorg/json/JSONObject;)Lvy/b;
    .locals 1

    iget v0, p0, Lb9/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lb9/b;->x(Lorg/json/JSONObject;)Ly00/g6;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lb9/b;->w(Lorg/json/JSONObject;)Ly00/l3;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public n()Ljava/io/File;
    .locals 5

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Ltk/d;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Ltk/c;

    iget-object v2, v1, Ltk/c;->f:Lb9/b;

    if-ne v2, p0, :cond_2

    iget-boolean v2, v1, Ltk/c;->e:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v2, [Z

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, v1, Ltk/c;->d:[Ljava/io/File;

    aget-object v1, v1, v3

    iget-object v2, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v2, Ltk/d;

    iget-object v2, v2, Ltk/d;->w:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v2, Ltk/d;

    iget-object v2, v2, Ltk/d;->w:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_1
    monitor-exit v0

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public o(II)Lt9/k0;
    .locals 3

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lt9/q;

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb9/b;->x:Z

    invoke-interface {v1, p1, p2}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa/m;

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    new-instance v2, Lqa/m;

    invoke-interface {v1, p1, p2}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p2

    iget-object v1, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v1, Lqa/j;

    invoke-direct {v2, p2, v1}, Lqa/m;-><init>(Lt9/k0;Lqa/j;)V

    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public p()Lb23/k;
    .locals 1

    iget-object v0, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, Lkg/a;

    iget-object v0, v0, Lkg/a;->b:Lkg/d;

    invoke-virtual {v0}, Lkg/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r(I)Ljava/io/OutputStream;
    .locals 4

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Llu/c;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Llu/b;

    iget-object v2, v1, Llu/b;->d:Lb9/b;

    if-ne v2, p0, :cond_1

    iget-boolean v2, v1, Llu/b;->c:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v2, [Z

    const/4 v3, 0x1

    aput-boolean v3, v2, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v1, p1}, Llu/b;->b(I)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :try_start_2
    iget-object v1, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Llu/c;

    iget-object v1, v1, Llu/c;->w:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    new-instance p1, Llu/a;

    invoke-direct {p1, p0, v1}, Llu/a;-><init>(Lb9/b;Ljava/io/FileOutputStream;)V

    monitor-exit v0

    return-object p1

    :catch_1
    sget-object p1, Llu/c;->P:Las/a;

    monitor-exit v0

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public s(I)Lne3/n0;
    .locals 4

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lxd3/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb9/b;->x:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lxd3/c;

    iget-object v1, v1, Lxd3/c;->g:Lb9/b;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Lne3/e;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lxd3/c;

    iget-boolean v1, v1, Lxd3/c;->e:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v1, [Z

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Lxd3/c;

    iget-object v1, v1, Lxd3/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/e0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, v0, Lxd3/f;->x:Lxd3/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "file"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lxd3/e;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v1, Lxd3/g;

    new-instance v2, Lx30/j1;

    const/4 v3, 0x5

    invoke-direct {v2, v3, v0, p0}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, p1, v2}, Lxd3/g;-><init>(Lne3/n0;Lkotlin/jvm/functions/Function1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v1

    :catch_0
    :try_start_4
    new-instance p1, Lne3/e;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_2
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public t()Lb9/b;
    .locals 2

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb9/b;->j()V

    :cond_0
    invoke-virtual {p0}, Lb9/b;->u()Lkg/f;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    instance-of v1, v0, Lkg/a;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lb9/b;->u()Lkg/f;

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast v0, Lkg/a;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    invoke-static {v0, v1}, Lvd/f;->R(Lkg/a;Lgm/r;)Lb9/b;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public u()Lkg/f;
    .locals 7

    iget-object v0, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    iget-boolean v1, p0, Lb9/b;->x:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    iget-object v1, v0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Lxl/a;

    iget-object v3, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lm83/m;

    :goto_0
    iget v4, v3, Lm83/m;->y:I

    const/4 v5, 0x1

    if-le v5, v4, :cond_1

    iget-object v4, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Luf/c0;

    sget-object v6, Llg/a;->z:Llg/a;

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1}, Lxl/a;->x()Lkg/f;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lm83/m;->a()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lkg/f;

    iget-object v3, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v3, Lkg/a;

    if-eqz v1, :cond_6

    instance-of v4, v1, Lkg/b;

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    check-cast v1, Lkg/b;

    iget v4, v1, Lkg/b;->a:I

    iget v6, v3, Lkg/a;->a:I

    if-eq v4, v6, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, v1, Lkg/b;->b:Lkg/d;

    iget-object v3, v3, Lkg/a;->b:Lkg/d;

    invoke-virtual {v1, v3}, Lkg/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lgm/r;->M()Lkg/f;

    iput-boolean v5, p0, Lb9/b;->x:Z

    return-object v2

    :cond_6
    :goto_2
    invoke-virtual {v0}, Lgm/r;->M()Lkg/f;

    move-result-object v0

    return-object v0
.end method

.method public v(Lt9/e0;)V
    .locals 1

    iget-object v0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, Lt9/q;

    invoke-interface {v0, p1}, Lt9/q;->v(Lt9/e0;)V

    return-void
.end method

.method public w(Lorg/json/JSONObject;)Ly00/l3;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v2, Ly00/w0;

    const-string v3, "payment_method_types"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-static {v3}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    const-string v3, "unactivated_payment_method_types"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-static {v3}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "toLowerCase(...)"

    if-eqz v7, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v3, "link_funding_sources"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v7, 0x0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v9

    invoke-static {v7, v9}, Le93/b;->i0(II)Li93/j;

    move-result-object v7

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    move-object v10, v7

    check-cast v10, Li93/i;

    iget-boolean v10, v10, Li93/i;->y:Z

    if-eqz v10, :cond_2

    move-object v10, v7

    check-cast v10, Lm83/e0;

    invoke-virtual {v10}, Lm83/e0;->nextInt()I

    move-result v10

    invoke-virtual {v3, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v9, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v9, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const-string v5, "country_code"

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    iget-object v1, v2, Ly00/w0;->z:Ly00/e3;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v5, 0x1

    if-eq v1, v5, :cond_5

    const/4 v5, 0x2

    if-ne v1, v5, :cond_4

    sget-object v1, Ly00/e3;->E:Ly00/e3;

    :goto_3
    move-object v11, v1

    goto :goto_4

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    sget-object v1, Ly00/e3;->z:Ly00/e3;

    goto :goto_3

    :cond_6
    sget-object v1, Ly00/e3;->y:Ly00/e3;

    goto :goto_3

    :goto_4
    iget-object v1, v0, Lb9/b;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-boolean v1, v0, Lb9/b;->x:Z

    iget-object v7, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v7, Lc93/a;

    invoke-interface {v7}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v15

    iget-object v7, v2, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-wide v8, v2, Ly00/w0;->w:J

    iget-object v10, v2, Ly00/w0;->x:Ljava/lang/String;

    iget-object v2, v2, Ly00/w0;->E:Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v31

    move-object/from16 v27, v4

    new-instance v4, Ly00/l3;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/16 v29, 0x0

    const v32, 0x4de898

    move-object/from16 v24, v7

    move-object v7, v8

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v19, v1

    move-object/from16 v30, v2

    move-object/from16 v28, v3

    invoke-direct/range {v4 .. v32}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;ZI)V

    return-object v4
.end method

.method public x(Lorg/json/JSONObject;)Ly00/g6;
    .locals 12

    const-string v0, "payment_method_types"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v7

    const-string v0, "unactivated_payment_method_types"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "toLowerCase(...)"

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v0, "link_funding_sources"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-static {v2, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    move-object v5, v2

    check-cast v5, Li93/i;

    iget-boolean v5, v5, Li93/i;->y:Z

    if-eqz v5, :cond_2

    move-object v5, v2

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v4, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v4, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const-string v0, "country_code"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lb9/b;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-boolean v6, p0, Lb9/b;->x:Z

    iget-object p1, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iget-object p1, p0, Lb9/b;->z:Ljava/lang/Object;

    check-cast p1, Ly00/y0;

    iget-object v8, p1, Ly00/y0;->x:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    new-instance v1, Ly00/g6;

    invoke-direct/range {v1 .. v11}, Ly00/g6;-><init>(Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;Lcom/stripe/android/model/StripeIntent$Usage;Ljava/util/List;Ljava/util/List;Z)V

    return-object v1
.end method

.method public y(IJLa3/p;ZLkotlin/jvm/functions/Function1;)Lp0/y0;
    .locals 3

    new-instance v0, Lp0/y0;

    iget-object v1, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Lp0/a1;

    instance-of v2, v1, Lp0/a;

    invoke-direct {v0, p0, p1, p4, p6}, Lp0/y0;-><init>(Lb9/b;ILa3/p;Lkotlin/jvm/functions/Function1;)V

    new-instance p4, Ly3/a;

    invoke-direct {p4, p2, p3}, Ly3/a;-><init>(J)V

    iput-object p4, v0, Lp0/y0;->d:Ly3/a;

    if-eqz v2, :cond_1

    const/4 p2, 0x1

    if-eqz p5, :cond_0

    check-cast v1, Lp0/a;

    iget-object p3, v1, Lp0/a;->x:Ljava/util/PriorityQueue;

    new-instance p4, Lp0/d1;

    invoke-direct {p4, p2, v0}, Lp0/d1;-><init>(ILp0/y0;)V

    invoke-virtual {p3, p4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget-boolean p3, v1, Lp0/a;->y:Z

    if-nez p3, :cond_2

    iput-boolean p2, v1, Lp0/a;->y:Z

    iget-object p2, v1, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    check-cast v1, Lp0/a;

    iget-object p3, v1, Lp0/a;->x:Ljava/util/PriorityQueue;

    new-instance p4, Lp0/d1;

    const/4 p5, 0x0

    invoke-direct {p4, p5, v0}, Lp0/d1;-><init>(ILp0/y0;)V

    invoke-virtual {p3, p4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget-boolean p3, v1, Lp0/a;->y:Z

    if-nez p3, :cond_2

    iput-boolean p2, v1, Lp0/a;->y:Z

    iget-object p2, v1, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1, v0}, Lp0/a1;->a(Lp0/y0;)V

    :cond_2
    :goto_0
    const-string p2, "compose:lazy:schedule_prefetch:index"

    int-to-long p3, p1

    invoke-static {p3, p4, p2}, La4/a;->F(JLjava/lang/String;)V

    return-object v0
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Lx8/r;

    iget-boolean v1, p0, Lb9/b;->x:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Landroidx/fragment/app/m;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb9/b;->x:Z

    return-void
.end method
