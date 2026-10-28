.class public final Lcom/whoop/video/VideoActivity;
.super Lhj0/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/video/VideoActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00128\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0014\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/video/VideoActivity;",
        "Lhj0/i;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "G",
        "O",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onDestroy",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "(Landroid/content/res/Configuration;)V",
        "I",
        "H",
        "",
        "E",
        "Ljava/lang/String;",
        "videoUrl",
        "",
        "F",
        "Z",
        "userViewedFullVideo",
        "shouldSubtitlesDefaultToOff",
        "shouldForceHdVideo",
        "v",
        "()Ljava/lang/String;",
        "logTag",
        "J",
        "a",
        "video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final J:Lcom/whoop/video/VideoActivity$a;

.field public static final K:I


# instance fields
.field private E:Ljava/lang/String;

.field private F:Z

.field private G:Z

.field private H:Z

.field private final I:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/video/VideoActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/video/VideoActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/video/VideoActivity;->J:Lcom/whoop/video/VideoActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/video/VideoActivity;->K:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lhj0/i;-><init>()V

    const-string v0, "VideoActivity"

    iput-object v0, p0, Lcom/whoop/video/VideoActivity;->I:Ljava/lang/String;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/video/VideoActivity;->L(Lcom/whoop/video/VideoActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/video/VideoActivity;->M(Lcom/whoop/video/VideoActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/video/VideoActivity;->K(Lcom/whoop/video/VideoActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/video/VideoActivity;->N(Lcom/whoop/video/VideoActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Lcom/whoop/video/VideoActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/video/VideoActivity;->O()V

    return-void
.end method

.method private final G()V
    .locals 2

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    new-instance v1, Lcom/whoop/video/VideoActivity$b;

    invoke-direct {v1, p0}, Lcom/whoop/video/VideoActivity$b;-><init>(Lcom/whoop/video/VideoActivity;)V

    invoke-virtual {v0, p0, v1}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void
.end method

.method private static final J(Lcom/whoop/video/VideoActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 21

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v4, v0, Lcom/whoop/video/VideoActivity;->E:Ljava/lang/String;

    if-eqz v4, :cond_9

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-boolean v6, v0, Lcom/whoop/video/VideoActivity;->G:Z

    iget-boolean v7, v0, Lcom/whoop/video/VideoActivity;->H:Z

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_1

    if-ne v5, v8, :cond_2

    :cond_1
    new-instance v5, Lbs2/a;

    const/4 v2, 0x0

    invoke-direct {v5, v0, v2}, Lbs2/a;-><init>(Lcom/whoop/video/VideoActivity;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v13, v5

    check-cast v13, Lc93/a;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_3

    if-ne v5, v8, :cond_4

    :cond_3
    new-instance v5, Lbs2/a;

    const/4 v2, 0x1

    invoke-direct {v5, v0, v2}, Lbs2/a;-><init>(Lcom/whoop/video/VideoActivity;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v14, v5

    check-cast v14, Lc93/a;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_5

    if-ne v5, v8, :cond_6

    :cond_5
    new-instance v5, Lbs2/a;

    const/4 v2, 0x2

    invoke-direct {v5, v0, v2}, Lbs2/a;-><init>(Lcom/whoop/video/VideoActivity;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v15, v5

    check-cast v15, Lc93/a;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_7

    if-ne v5, v8, :cond_8

    :cond_7
    new-instance v5, Lbs2/a;

    const/4 v2, 0x3

    invoke-direct {v5, v0, v2}, Lbs2/a;-><init>(Lcom/whoop/video/VideoActivity;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v16, v5

    check-cast v16, Lc93/a;

    const/16 v19, 0x0

    const/16 v20, 0x3e4

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    move-object/from16 v17, v3

    move-object v3, v1

    invoke-static/range {v3 .. v20}, Lbs2/f;->f(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZZZZZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_9
    const-string v0, "videoUrl"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_a
    move-object/from16 v17, v3

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    invoke-virtual {p0}, Lcom/whoop/video/VideoActivity;->I()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/video/VideoActivity;->H()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/video/VideoActivity;->O()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/video/VideoActivity;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/video/VideoActivity;->F:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final O()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "USER_VIEWED_FULL_VIDEO"

    iget-boolean v2, p0, Lcom/whoop/video/VideoActivity;->F:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic z(Lcom/whoop/video/VideoActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/video/VideoActivity;->J(Lcom/whoop/video/VideoActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final H()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->show(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public final I()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1006

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->hide(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lm/m;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/video/VideoActivity;->I()V

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/video/VideoActivity;->H()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lhj0/i;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-direct {p0}, Lcom/whoop/video/VideoActivity;->G()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "videoUrl"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lcom/whoop/video/VideoActivity;->E:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "SHOULD_SUBTITLES_DEFAULT_TO_OFF"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/whoop/video/VideoActivity;->G:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "SHOULD_FORCE_HD_VIDEO"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/whoop/video/VideoActivity;->H:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p1, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    new-instance p1, La80/c;

    const/16 v0, 0x12

    invoke-direct {p1, p0, v0}, La80/c;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x271d118b

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v0, Lj02/l0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/l0;

    const-string v0, "VideoActivity"

    invoke-interface {p1, v0}, Lj02/l0;->J(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lhj0/i;->onDestroy()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/video/VideoActivity;->I:Ljava/lang/String;

    return-object v0
.end method
