.class public Lcom/whoop/whooplive/selfie/SelfieActivity;
.super Lhj0/f;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplive/selfie/SelfieActivity$i;,
        Lcom/whoop/whooplive/selfie/SelfieActivity$g;,
        Lcom/whoop/whooplive/selfie/SelfieActivity$j;,
        Lcom/whoop/whooplive/selfie/SelfieActivity$h;
    }
.end annotation


# instance fields
.field private I:Lp92/i;

.field private J:Lsz2/a;

.field private K:Ljava/io/File;

.field private L:Lrz2/b;

.field private M:J

.field private N:J

.field private O:Z

.field private P:Landroid/view/View;

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Ljava/util/Timer;

.field private U:Ljava/util/Timer;

.field private V:Landroid/os/Handler;

.field private W:Ljava/lang/Runnable;

.field private X:Lu92/d;

.field private Y:Ltr2/n;

.field private Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

.field private a0:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private b0:Lmh3/c;

.field private c0:Lmh3/c;

.field private d0:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private e0:Landroid/graphics/Bitmap;

.field private f0:Landroid/graphics/Bitmap;

.field private g0:Landroid/graphics/Paint;

.field private h0:Landroid/graphics/Canvas;

.field private i0:Landroid/graphics/ColorFilter;

.field private j0:Landroid/graphics/Matrix;

.field private k0:Landroid/graphics/Matrix;

.field private l0:Z

.field private m0:Lrz2/c;

.field private n0:Lor2/a0;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/f;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    sget-object v1, Lrz2/b;->START:Lrz2/b;

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    const-wide/16 v1, 0x3a98

    iput-wide v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->N:J

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->R:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    new-instance v3, Ljava/util/Timer;

    invoke-direct {v3}, Ljava/util/Timer;-><init>()V

    iput-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->T:Ljava/util/Timer;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v1}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v3

    iput-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    new-instance v3, Lmh3/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    new-instance v3, Lmh3/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->c0:Lmh3/c;

    sget-object v3, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->NONE:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-static {v3, v1}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->g0:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/LightingColorFilter;

    const v3, -0x7f7f80

    invoke-direct {v1, v3, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->i0:Landroid/graphics/ColorFilter;

    const-class v1, Lor2/a0;

    invoke-static {v1, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/a0;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->n0:Lor2/a0;

    return-void
.end method

.method private A0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->D:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic A1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    sget-object v0, Lvz2/g;->OFF:Lvz2/g;

    invoke-virtual {p1, v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->setFlashMode(Lvz2/g;)V

    return-void
.end method

.method private A2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->i()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->z:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->P:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v1, Lnf1/c;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private B0(Z)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    check-cast v0, Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_1

    if-lez v2, :cond_1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z0()I

    move-result p1

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->b1()I

    move-result p1

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->k0:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_0
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    const/4 p1, 0x0

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->j0:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopZoomageView;->q()V

    :goto_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method private synthetic B1(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {p1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->l()V

    return-void
.end method

.method private C0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->S:Landroid/widget/TextView;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xa

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic C1(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {p1}, Lrz2/c;->U()V

    return-void
.end method

.method public static synthetic D(Lcom/whoop/whooplive/selfie/SelfieActivity;Lrz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->u2(Lrz2/a;)V

    return-void
.end method

.method private D0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->k:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xf

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic D1(Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/whoop/whooplive/selfie/SelfieActivity$f;->b:[I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->i2()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->s2()V

    return-void

    :cond_2
    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->X:Lu92/d;

    const-string v1, "cameraFacingFront"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "Live"

    const-string v2, "Video"

    invoke-virtual {p1, v0, v1, v2}, Lz82/e;->L0(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p2()V

    return-void
.end method

.method public static synthetic E(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->t1(Landroid/view/View;)V

    return-void
.end method

.method private E0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->j:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x10

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic E1(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->e1()V

    return-void
.end method

.method public static synthetic F(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->k1(Landroid/view/View;)V

    return-void
.end method

.method private static F0(I)D
    .locals 4

    int-to-double v0, p0

    const-wide v2, 0x4010bc6a7ef9db23L    # 4.184

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private synthetic F1(Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget v0, Lpz2/g;->l:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lg/l;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public static synthetic G(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->N1()V

    return-void
.end method

.method private G0(IIII)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    mul-int v2, p3, p2

    mul-int v3, p4, p1

    if-le v2, v3, :cond_0

    int-to-float p1, p2

    int-to-float p2, p4

    :goto_0
    div-float/2addr p1, p2

    goto :goto_1

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p3

    goto :goto_0

    :goto_1
    invoke-virtual {v1, p1, p1}, Landroid/graphics/Matrix;->setScale(FF)V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->j0:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->k0:Landroid/graphics/Matrix;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->b1()I

    move-result p2

    neg-int p2, p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    invoke-virtual {p1}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->k0:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->j0:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method private synthetic G1(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->e1()V

    return-void
.end method

.method public static synthetic H(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->y1(Landroid/view/View;)V

    return-void
.end method

.method private H0(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->O:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {p1}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private synthetic H1(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->i2()V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->F1(Landroid/view/View;)V

    return-void
.end method

.method private I0()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "VideoFragment has been closed"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-static {v0, v0}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/a;->n(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    invoke-virtual {v0}, Landroidx/fragment/app/a;->j()I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    :cond_0
    return-void
.end method

.method private synthetic I1(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->g2()V

    return-void
.end method

.method public static synthetic J(Lcom/whoop/whooplive/selfie/SelfieActivity;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->v1(Ljava/lang/Integer;)V

    return-void
.end method

.method private J0()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->t()Lxg3/g;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v2}, Lcom/whoop/whooplive/selfie/OverlayView;->w()Lxg3/g;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/whoop/whooplive/selfie/camera/CameraView;->m(Lxg3/g;Lxg3/g;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->h()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/16 v3, 0x9

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    new-instance v3, Luz2/e;

    const/16 v4, 0x13

    invoke-direct {v3, p0, v4}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2, v3}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->g()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/16 v3, 0x16

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->f()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/16 v3, 0x17

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    new-instance v2, Luz2/e;

    const/16 v3, 0x18

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method private synthetic J1(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->t2()V

    return-void
.end method

.method public static synthetic K(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->M1()V

    return-void
.end method

.method private K0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->T1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->E0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->S0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->D0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->R0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->W0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->R1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->V0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->U0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->h2()V

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->R:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->m2()V

    :goto_0
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->A0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->d2()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->e2()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->P1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->C0()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->R:Landroid/widget/ImageView;

    new-instance v1, Ljo/j;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic K1()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->v2()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->r()Z

    :cond_0
    return-void
.end method

.method public static synthetic L(Lcom/whoop/whooplive/selfie/SelfieActivity;Luz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->W1(Luz2/a;)V

    return-void
.end method

.method private L0()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$g;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity$g;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$g;->q()Lcom/whoop/service/network/model/cycles/Cycle;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Couldn\'t load Snap - no cycle in Intent?"

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1, v0}, Lcom/whoop/whooplive/selfie/OverlayView;->setCycle(Lcom/whoop/service/network/model/cycles/Cycle;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/whoop/whooplive/selfie/SelfieActivity$b;

    invoke-direct {v2, p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$b;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private synthetic L1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->J:Lcom/whoop/ui/ProgressDial;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->h:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->i()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->getColorMode()Luz2/a;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y0()I

    move-result v3

    invoke-virtual {v2, v3}, Lrz2/c;->M(I)V

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v2}, Lrz2/c;->L()V

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-eqz v1, :cond_1

    sget-object v2, Luz2/a;->TINTED:Luz2/a;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->getTintColor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lsz2/a;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lsz2/a;->J(Luz2/a;)V

    :cond_1
    :goto_0
    sget-object v0, Lrz2/b;->RECORDING:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->n2()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->q2()V

    return-void
.end method

.method public static synthetic M(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->C1(Landroid/view/View;)V

    return-void
.end method

.method private M0()V
    .locals 3

    new-instance v0, Lut2/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lut2/a;-><init>(I)V

    const-class v1, Lp92/i;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp92/i;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->I:Lp92/i;

    return-void
.end method

.method private synthetic M1()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v1, Lrz2/b;->RECORDING:Lrz2/b;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->r2()V

    :cond_0
    return-void
.end method

.method public static synthetic N(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->A1(Landroid/view/View;)V

    return-void
.end method

.method private N0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->t()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->w()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->u()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method private synthetic N1()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v1, Lrz2/b;->RECORDING:Lrz2/b;

    if-ne v0, v1, :cond_0

    sget-object v0, Lrz2/b;->DONE:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->J:Lcom/whoop/ui/ProgressDial;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->I:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v2, Lnf1/c;->c:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->t()Z

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v0}, Lrz2/c;->G()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->U1()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lsz2/a;->K(Landroid/graphics/Bitmap;)V

    :cond_2
    return-void
.end method

.method public static synthetic O(Lcom/whoop/whooplive/selfie/SelfieActivity;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p1(Ljava/lang/Throwable;)V

    return-void
.end method

.method private O0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/whoop/whooplive/selfie/SelfieActivity$c;

    invoke-direct {v2, p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$c;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->v()Lxg3/g;

    move-result-object v1

    new-instance v2, Luz2/e;

    const/16 v3, 0x19

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method private synthetic O1()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    invoke-virtual {v0}, Lsz2/a;->I()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y0()I

    move-result v1

    invoke-virtual {v0, v1}, Lrz2/c;->M(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v0}, Lrz2/c;->L()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->z()V

    :cond_1
    return-void
.end method

.method public static synthetic P(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->E1(Landroid/view/View;)V

    return-void
.end method

.method private P0()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->I:Lp92/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/i;->b()V

    :cond_0
    return-void
.end method

.method private P1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->O:Landroid/widget/ImageView;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x14

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic Q(Lcom/whoop/whooplive/selfie/SelfieActivity;Lvz2/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->q1(Lvz2/g;)V

    return-void
.end method

.method private Q0()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v1, Lnf1/c;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->M:Landroid/widget/ImageView;

    sget v1, Lpz2/d;->a:I

    invoke-static {p0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private Q1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->M:Landroid/widget/ImageView;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x11

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic R(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->B1(Landroid/view/View;)V

    return-void
.end method

.method private R0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->C:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private R1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x15

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic S(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->m1(Landroid/view/View;)V

    return-void
.end method

.method private S0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->B:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xb

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private S1()V
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->l0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a1(Luz2/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz82/e;->s0(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a1(Luz2/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz82/e;->r0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic T(Lcom/whoop/whooplive/selfie/SelfieActivity;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->o1([B)V

    return-void
.end method

.method private T0()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->I:Lp92/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/i;->a()V

    :cond_0
    return-void
.end method

.method private T1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->h:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xe

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic U(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->z1(Landroid/view/View;)V

    return-void
.end method

.method private U0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->o:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private U1()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    invoke-static {p0, v0, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v1, v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->k(Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->n()V

    :cond_0
    return-void
.end method

.method public static synthetic V(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->K1()V

    return-void
.end method

.method private V0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->n:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xd

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private V1(Landroid/graphics/Bitmap;)V
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    if-nez v2, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->h0:Landroid/graphics/Canvas;

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->h0:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->g0:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public static synthetic W(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->I1(Landroid/view/View;)V

    return-void
.end method

.method private W0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->p:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x8

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private W1(Luz2/a;)V
    .locals 1

    sget-object v0, Luz2/a;->TINTED:Luz2/a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    :cond_0
    sget-object v0, Luz2/a;->DARK:Luz2/a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->i0:Landroid/graphics/ColorFilter;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public static synthetic X()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplive/selfie/SelfieActivity;->u1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private X0(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p1, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method private X1()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->V:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->W:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic Y(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->J1(Landroid/view/View;)V

    return-void
.end method

.method private Y0()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lrz2/c;->J()Lrz2/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrz2/c;->M(I)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lrz2/c;->J()Lrz2/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lrz2/c;->M(I)V

    :goto_0
    invoke-static {}, Lrz2/c;->J()Lrz2/c;

    move-result-object v0

    invoke-virtual {v0}, Lrz2/c;->I()I

    move-result v0

    return v0
.end method

.method private Y1()V
    .locals 4

    const-string v0, "android.permission.CAMERA"

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    const-string v3, "android.permission.RECORD_AUDIO"

    if-nez v1, :cond_0

    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_0
    invoke-direct {p0, v3}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public static synthetic Z(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->G1(Landroid/view/View;)V

    return-void
.end method

.method private Z0()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->c:Lcom/whoop/whooplive/live/views/AspectLetterboxView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->getAspectRatio()F

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v0, v1

    return v0
.end method

.method private Z1()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->l()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->f()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lrz2/b;->START:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c2()V

    iput-boolean v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->b2()V

    :goto_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->h:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->p:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public static synthetic a0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->x1(Landroid/view/View;)V

    return-void
.end method

.method private a1(Luz2/b;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    const-string p1, "Sleep"

    return-object p1

    :cond_1
    const-string p1, "Recovery"

    return-object p1

    :cond_2
    const-string p1, "Strain"

    return-object p1

    :cond_3
    const-string p1, "Overview"

    return-object p1

    :cond_4
    const-string p1, "Live"

    return-object p1
.end method

.method private a2()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->l()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->f()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    sget-object v0, Lrz2/b;->START:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c2()V

    iput-boolean v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->b2()V

    :goto_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->O:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->M:Landroid/widget/ImageView;

    sget v1, Lpz2/d;->b:I

    invoke-static {p0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->y()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->z2()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public static synthetic b0(Lcom/whoop/whooplive/selfie/SelfieActivity;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->s1(Ljava/lang/Boolean;)V

    return-void
.end method

.method private b1()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z0()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method private b2()V
    .locals 9

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string v2, "Resetting Media Recorder."

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c1()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v6, v0, Landroid/graphics/Point;->y:I

    iget v5, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v3, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->n(Ljava/io/File;IILandroid/media/MediaRecorder$OnErrorListener;Landroid/media/MediaRecorder$OnInfoListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Couldn\'t re-init recording "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public static synthetic c0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->l1(Landroid/view/View;)V

    return-void
.end method

.method private c1()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WhoopLive_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lor2/u;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".mp4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private c2()V
    .locals 9

    const-string v0, "android.permission.CAMERA"

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string v1, "Resetting Video Fragment "

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v6, v0, Landroid/graphics/Point;->y:I

    iget v5, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string v1, "display Metrics Media  Recorder Height: "

    invoke-static {v6, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string v1, "display Metrics Media  Recorder Width: "

    invoke-static {v5, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-nez v0, :cond_2

    invoke-static {v6}, Lvz2/a;->b(I)I

    move-result v0

    invoke-static {v5}, Lvz2/a;->a(I)I

    move-result v1

    if-le v0, v5, :cond_0

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    if-le v1, v6, :cond_1

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    new-instance v3, Lsz2/a;

    invoke-direct {v3, p0, v0, v1}, Lsz2/a;-><init>(Landroid/content/Context;II)V

    iput-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    :cond_2
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f2(Lsz2/a;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->q()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c1()Ljava/io/File;

    move-result-object v4

    iput-object v4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    :try_start_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v3, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->n(Ljava/io/File;IILandroid/media/MediaRecorder$OnErrorListener;Landroid/media/MediaRecorder$OnInfoListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Couldn\'t re-init recording "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v1, "SelfieActivity"

    const-string v2, "Couldn\'t re-init recording"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y1()V

    return-void
.end method

.method public static synthetic d0(Lcom/whoop/whooplive/selfie/SelfieActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->w1(Ljava/lang/String;)V

    return-void
.end method

.method private d1()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x1602

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method private d2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->Q:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic e0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->L1()V

    return-void
.end method

.method private e1()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    sget-object v1, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {v0, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {v0, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->O:Z

    if-nez v0, :cond_2

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v2, Lrz2/b;->DONE:Lrz2/b;

    if-ne v1, v2, :cond_2

    sget-object v0, Lrz2/b;->START:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->y2()V

    return-void

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v1, Lrz2/b;->DONE:Lrz2/b;

    if-ne v0, v1, :cond_3

    sget-object v0, Lrz2/b;->START:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a2()V

    return-void

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method private e2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->I:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0x12

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic f0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->H1(Landroid/view/View;)V

    return-void
.end method

.method private f1(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private f2(Lsz2/a;)V
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "WhoopVideoFragment"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Lrz2/c;

    iput-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    return-void

    :cond_0
    invoke-static {}, Lrz2/c;->J()Lrz2/c;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v2, v3}, Lrz2/c;->O(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)V

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v2, p1}, Lrz2/c;->P(Lsz2/b;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lrz2/c;->M(I)V

    new-instance p1, Landroidx/fragment/app/a;

    invoke-direct {p1, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    const/4 v4, 0x1

    invoke-virtual {p1, v2, v3, v1, v4}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroidx/fragment/app/a;->j()I

    invoke-virtual {v0, v4}, Landroidx/fragment/app/o1;->z(Z)Z

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->G()V

    return-void
.end method

.method public static synthetic g0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->n1(Landroid/view/View;)V

    return-void
.end method

.method private g1()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->O:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->M:Landroid/widget/ImageView;

    sget v2, Lpz2/d;->c:I

    invoke-static {p0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->l()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    return-void
.end method

.method private g2()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->F:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    invoke-virtual {v4}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z0()I

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sub-int/2addr v3, v4

    mul-int/lit8 v3, v3, -0x1

    shr-int/2addr v3, v1

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v5, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v3

    const-string v4, "whoop_share.jpg"

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v5, 0x64

    invoke-virtual {v2, v3, v5, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "image/jpeg"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".provider"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3, v0}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v0, Lpz2/g;->a:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lg/l;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->S1()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string v2, "Could not share"

    const/4 v3, 0x0

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget v0, Lpz2/g;->d:I

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static synthetic h0(Lcom/whoop/whooplive/selfie/SelfieActivity;Lvz2/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->r1(Lvz2/f;)V

    return-void
.end method

.method private h1()V
    .locals 2

    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/ColorMatrix;->setSaturation(F)V

    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v1, v0}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->g0:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method private h2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->E:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic i0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->O1()V

    return-void
.end method

.method public static i1(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILjava/lang/Long;ZI)Lcom/whoop/whooplive/selfie/SelfieActivity$g;
    .locals 29

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v0, "complete"

    const-string v1, "pending"

    if-eqz p7, :cond_0

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    move-object v11, v0

    goto :goto_0

    :cond_0
    move-object v11, v1

    :goto_0
    if-lez p6, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz p5, :cond_2

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    :cond_2
    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$g;

    move-object/from16 v2, p0

    invoke-direct {v0, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$g;-><init>(Landroid/content/Context;)V

    new-instance v17, Lcom/whoop/service/network/model/cycles/Cycle;

    new-instance v2, Lcom/whoop/service/network/model/cycles/Period;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct {v2, v4, v5}, Lcom/whoop/service/network/model/cycles/Period;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v18, Lcom/whoop/service/network/model/cycles/Strain;

    invoke-static/range {p9 .. p9}, Lcom/whoop/whooplive/selfie/SelfieActivity;->F0(I)D

    move-result-wide v22

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v24

    const-wide/high16 v26, -0x4010000000000000L    # -1.0

    const/16 v28, 0x0

    const/16 v19, 0x0

    const/high16 v20, -0x40800000    # -1.0f

    const/16 v21, -0x1

    invoke-direct/range {v18 .. v28}, Lcom/whoop/service/network/model/cycles/Strain;-><init>(Ljava/lang/String;FIDDD[Lcom/whoop/service/network/model/cycles/Workout;)V

    new-instance v9, Lcom/whoop/service/network/model/cycles/Sleep;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v10, -0x1

    const/4 v12, -0x1

    const/4 v14, 0x0

    move-object/from16 v13, p7

    invoke-direct/range {v9 .. v16}, Lcom/whoop/service/network/model/cycles/Sleep;-><init>(ILjava/lang/String;ILjava/lang/Long;Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;[Lcom/whoop/service/network/model/cycles/SleepActivity;[Lcom/whoop/service/network/model/cycles/SleepActivity;)V

    move-object/from16 v20, v9

    new-instance v21, Lcom/whoop/service/network/model/cycles/Recovery;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const/4 v10, 0x1

    move-object/from16 v16, v2

    const/4 v2, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v8

    move/from16 v4, p6

    move-object/from16 v1, v21

    invoke-direct/range {v1 .. v11}, Lcom/whoop/service/network/model/cycles/Recovery;-><init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;ZLjava/lang/Integer;)V

    move-object/from16 v12, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-wide/from16 v13, p1

    invoke-direct/range {v12 .. v21}, Lcom/whoop/service/network/model/cycles/Cycle;-><init>(J[Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Strain;Lcom/whoop/service/network/model/cycles/Sleep;Lcom/whoop/service/network/model/cycles/Recovery;)V

    invoke-virtual {v0, v12}, Lcom/whoop/whooplive/selfie/SelfieActivity$g;->r(Lcom/whoop/service/network/model/cycles/Cycle;)Lcom/whoop/whooplive/selfie/SelfieActivity$g;

    move-result-object v0

    return-object v0
.end method

.method private i2()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a1(Luz2/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz82/e;->r0(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    invoke-static {p0, v0, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.intent.action.SEND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "video/mp4"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v0, Lpz2/g;->n:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method public static synthetic j0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->D1(Landroid/view/View;)V

    return-void
.end method

.method public static j1(Landroid/content/Context;)Z
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.camera"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p0

    invoke-virtual {p0}, Le50/b;->d()Ltr2/n;

    move-result-object p0

    const-string v0, "Selfie disabled: Camera=false"

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p0, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return v1
.end method

.method private j2(Landroid/net/Uri;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/b;->f(Landroid/view/View;)Lcom/bumptech/glide/h;

    move-result-object v0

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/bumptech/glide/f;->a0:Z

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->k2(Lcom/bumptech/glide/f;Z)V

    return-void
.end method

.method public static synthetic k0(Lcom/whoop/whooplive/selfie/SelfieActivity;Lcom/whoop/whooplive/selfie/SelfieActivity$i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->w2(Lcom/whoop/whooplive/selfie/SelfieActivity$i;)V

    return-void
.end method

.method private synthetic k1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {p1}, Lcom/whoop/whooplive/selfie/OverlayView;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private k2(Lcom/bumptech/glide/f;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/f;",
            "Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lpl/d;

    invoke-direct {p2}, Lpl/a;-><init>()V

    new-instance v0, Lxz2/a;

    invoke-direct {v0}, Lxz2/a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Lpl/a;->u(Lwk/l;Z)Lpl/a;

    move-result-object p2

    check-cast p2, Lpl/d;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    :cond_0
    new-instance p2, Lcom/whoop/whooplive/selfie/SelfieActivity$e;

    invoke-direct {p2, p0}, Lcom/whoop/whooplive/selfie/SelfieActivity$e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    iget-object v0, p1, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p1, Lcom/bumptech/glide/f;->U:Lcom/bumptech/glide/h;

    new-instance v0, Lql/f;

    invoke-direct {v0, p2}, Lql/f;-><init>(Lcom/bumptech/glide/h;)V

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->g:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static bridge synthetic l0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    return-object p0
.end method

.method private synthetic l1(Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "package"

    invoke-static {v2, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private l2([BZ)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/b;->f(Landroid/view/View;)Lcom/bumptech/glide/h;

    move-result-object v0

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/bumptech/glide/f;->a0:Z

    const/4 v1, 0x4

    iget v2, v0, Lpl/a;->w:I

    invoke-static {v2, v1}, Lpl/a;->g(II)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lpl/d;

    invoke-direct {v1}, Lpl/a;-><init>()V

    sget-object v2, Lzk/k;->c:Lzk/k;

    invoke-virtual {v1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v1

    check-cast v1, Lpl/d;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v0

    :cond_0
    const/16 v1, 0x100

    iget v2, v0, Lpl/a;->w:I

    invoke-static {v2, v1}, Lpl/a;->g(II)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lpl/d;->T:Lpl/d;

    if-nez v1, :cond_3

    new-instance v1, Lpl/d;

    invoke-direct {v1}, Lpl/a;-><init>()V

    invoke-virtual {v1, p1}, Lpl/a;->r(Z)Lpl/a;

    move-result-object v1

    check-cast v1, Lpl/d;

    iget-boolean v2, v1, Lpl/a;->P:Z

    if-eqz v2, :cond_2

    iget-boolean v2, v1, Lpl/a;->Q:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-boolean p1, v1, Lpl/a;->Q:Z

    iput-boolean p1, v1, Lpl/a;->P:Z

    sput-object v1, Lpl/d;->T:Lpl/d;

    :cond_3
    sget-object p1, Lpl/d;->T:Lpl/d;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v0

    :cond_4
    invoke-direct {p0, v0, p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->k2(Lcom/bumptech/glide/f;Z)V

    return-void
.end method

.method public static bridge synthetic m0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->R:Z

    return p0
.end method

.method private synthetic m1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->q0()V

    return-void
.end method

.method private m2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    new-instance v1, Las2/a;

    new-instance v2, Luz2/e;

    const/16 v3, 0xc

    invoke-direct {v2, p0, v3}, Luz2/e;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-direct {v1, v2}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static bridge synthetic n0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private synthetic n1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->p0()V

    return-void
.end method

.method private n2()V
    .locals 2

    new-instance v0, Luz2/d;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Luz2/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic o0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    return-object p0
.end method

.method private synthetic o1([B)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->d()Z

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->l2([BZ)V

    return-void
.end method

.method private o2()V
    .locals 2

    new-instance v0, Luz2/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Luz2/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    return-object p0
.end method

.method private synthetic p1(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Capture failed"

    invoke-interface {v0, v3, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->g:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    sget p1, Lpz2/g;->b:I

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private p2()V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->g1()V

    sget-object v0, Lrz2/b;->RECORDING:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y0()I

    move-result v1

    invoke-virtual {v0, v1}, Lrz2/c;->M(I)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->n2()V

    return-void
.end method

.method public static bridge synthetic q0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    return-void
.end method

.method private synthetic q1(Lvz2/g;)V
    .locals 1

    sget-object v0, Lvz2/g;->ON:Lvz2/g;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->n:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->o:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    return-void
.end method

.method private q2()V
    .locals 4

    new-instance v0, Luz2/d;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Luz2/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->W:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->V:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->N:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static bridge synthetic r0(Lcom/whoop/whooplive/selfie/SelfieActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->B0(Z)V

    return-void
.end method

.method private synthetic r1(Lvz2/f;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    invoke-virtual {p1}, Lvz2/f;->b()Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->p:Landroid/view/View;

    invoke-virtual {p1}, Lvz2/f;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    move v2, v3

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private r2()V
    .locals 2

    new-instance v0, Luz2/d;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Luz2/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic s0(Lcom/whoop/whooplive/selfie/SelfieActivity;IIII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/whooplive/selfie/SelfieActivity;->G0(IIII)V

    return-void
.end method

.method private synthetic s1(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->c:Lcom/whoop/whooplive/live/views/AspectLetterboxView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->A:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->B0(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->c:Lcom/whoop/whooplive/live/views/AspectLetterboxView;

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->j:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->A:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->B0(Z)V

    return-void
.end method

.method private s2()V
    .locals 3

    sget-object v0, Lrz2/b;->DONE:Lrz2/b;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->t()Z

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-virtual {v0}, Lrz2/c;->G()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->U1()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lsz2/a;->K(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic t0(Lcom/whoop/whooplive/selfie/SelfieActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->H0(Z)V

    return-void
.end method

.method private synthetic t1(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method private t2()V
    .locals 5

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->X:Lu92/d;

    const-string v2, "cameraFacingFront"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v2}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a1(Luz2/b;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Photo"

    invoke-virtual {v0, v1, v2, v4}, Lz82/e;->L0(ZLjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->g:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->k()V

    iput-boolean v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->l0:Z

    return-void
.end method

.method public static bridge synthetic u0(Lcom/whoop/whooplive/selfie/SelfieActivity;)I
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->b1()I

    move-result p0

    return p0
.end method

.method private static synthetic u1()Luf3/a;
    .locals 1

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private u2(Lrz2/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lsz2/a;->H(Lrz2/a;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic v0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->V1(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private synthetic v1(Ljava/lang/Integer;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method private v2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v1, Lrz2/b;->RECORDING:Lrz2/b;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->T:Ljava/util/Timer;

    new-instance v1, Lcom/whoop/whooplive/selfie/SelfieActivity$d;

    invoke-direct {v1, p0}, Lcom/whoop/whooplive/selfie/SelfieActivity$d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    const-wide/16 v2, 0x19

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->P:Landroid/view/View;

    invoke-direct {p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->X0(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsz2/a;->K(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v0

    sget-object v1, Luz2/b;->LIVE:Luz2/b;

    if-eq v0, v1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->M:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    iget-wide v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->N:J

    long-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->J:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {v1, v0}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic w0(Lcom/whoop/whooplive/selfie/SelfieActivity;Luz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->W1(Luz2/a;)V

    return-void
.end method

.method private synthetic w1(Ljava/lang/String;)V
    .locals 3

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lse/a;->O([Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->r:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->E:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->E:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private w2(Lcom/whoop/whooplive/selfie/SelfieActivity$i;)V
    .locals 1

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->y2()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->x2()V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->A2()V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne p1, v0, :cond_3

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->z2()V

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->g:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static bridge synthetic x0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->o2()V

    return-void
.end method

.method private synthetic x1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->q0()V

    return-void
.end method

.method private x2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->k()Z

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->i()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->z:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->f:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->P:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v1, Lnf1/c;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public static bridge synthetic y0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->v2()V

    return-void
.end method

.method private synthetic y1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->a0:Llh3/b;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->p0()V

    return-void
.end method

.method private y2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->k()Z

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iput-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0:Landroid/graphics/Bitmap;

    :cond_0
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    iput-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->f0:Landroid/graphics/Bitmap;

    :cond_1
    iget-boolean v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->J:Lsz2/a;

    invoke-virtual {v1}, Lsz2/a;->I()V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0:Lrz2/c;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y0()I

    move-result v3

    invoke-virtual {v1, v3}, Lrz2/c;->M(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->x()V

    goto :goto_0

    :cond_2
    iput-boolean v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    :goto_0
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->j()V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz v0, :cond_3

    move v3, v2

    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->z:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->N:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->f:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->P:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v1, Lvu1/c;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private synthetic z1(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    sget-object v0, Lvz2/g;->ON:Lvz2/g;

    invoke-virtual {p1, v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->setFlashMode(Lvz2/g;)V

    return-void
.end method

.method private z2()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/OverlayView;->k()Z

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    :cond_0
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->i()V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz v0, :cond_1

    move v3, v2

    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->z:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->f:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->N:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->P:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v1, Lvu1/c;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Luz2/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Luz2/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    :try_start_0
    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->j2(Landroid/net/Uri;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->l0:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const-string p3, "User selected an image but we could not load it"

    const/4 v0, 0x0

    new-array v1, v0, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget p1, Lpz2/g;->c:I

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Lhj0/f;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->e1()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lhj0/f;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->d()Ltr2/n;

    move-result-object v0

    const-string v1, "SelfieActivity"

    invoke-direct {p1, v0, v1}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    invoke-static {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->j1(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Selfie feature is not supported on this device"

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->h1()V

    sget v0, Lpz2/f;->a:I

    invoke-virtual {p0, v0}, Lm/m;->setContentView(I)V

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    invoke-direct {v0, p0}, Lcom/whoop/whooplive/selfie/SelfieActivity$j;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->d1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->K0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->L0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->J0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->N0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->O0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->M0()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->Y1()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c2()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->V:Landroid/os/Handler;

    new-instance v0, Lvf3/c;

    const-string v2, "mainPrefs"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lu92/d;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->X:Lu92/d;

    const-string v2, "cameraFacingFront"

    invoke-virtual {v0, v2, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    const-string v0, "WHOOP Live"

    invoke-virtual {p1, v0}, Lz82/e;->g0(Ljava/lang/String;)V

    const-class p1, Lj02/l0;

    invoke-static {p1, v3, v3}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/l0;

    invoke-interface {p1, v1}, Lj02/l0;->J(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lhj0/f;->onDestroy()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->X:Lu92/d;

    if-eqz v0, :cond_0

    const-string v1, "cameraFacingFront"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->s()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->b0:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->n0:Lor2/a0;

    invoke-virtual {v0}, Lor2/a0;->d()V

    return-void
.end method

.method public onPause()V
    .locals 5

    invoke-super {p0}, Lhj0/f;->onPause()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->p()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->i()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v3, Lrz2/b;->RECORDING:Lrz2/b;

    if-ne v0, v3, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->s2()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->l()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->I0()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v1, Lrz2/b;->DONE:Lrz2/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->l()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->I0()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->c0:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->I0()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/r0;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const-string p1, "android.permission.CAMERA"

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x0

    const/16 p3, 0x8

    if-eqz p1, :cond_0

    const-string p1, "android.permission.RECORD_AUDIO"

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->q:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->H:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->q:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->H:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onResume()V
    .locals 6

    invoke-super {p0}, Lhj0/f;->onResume()V

    const-string v0, "android.permission.CAMERA"

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->f1(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->H:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->K:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v2, Lrz2/b;->DONE:Lrz2/b;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->n()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->c2()V

    iput-boolean v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->S:Z

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->c0:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {v1}, Lxg3/g;->a()Lxg3/g;

    move-result-object v1

    invoke-virtual {v1}, Lxg3/g;->k()Lxg3/g;

    move-result-object v1

    new-instance v2, Lcom/whoop/whooplive/selfie/b;

    invoke-direct {v2, p0}, Lcom/whoop/whooplive/selfie/b;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->NONE:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->d0:Llh3/b;

    sget-object v1, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {v0, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-super {p0}, Lm/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->T0()V

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Lm/m;->onStop()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->P0()V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const-wide/16 v0, 0x96

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    const/4 v2, 0x0

    if-eq p1, p2, :cond_0

    return v2

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->U:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->X1()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->M:J

    sub-long/2addr v3, v5

    cmp-long p1, v3, v0

    if-gez p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->t2()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->L:Lrz2/b;

    sget-object v0, Lrz2/b;->RECORDING:Lrz2/b;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->X:Lu92/d;

    const-string v1, "cameraFacingFront"

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Z:Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->getMode()Luz2/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->a1(Luz2/b;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Video"

    invoke-virtual {p1, v0, v1, v2}, Lz82/e;->L0(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->r2()V

    :cond_2
    :goto_0
    return p2

    :cond_3
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->U:Ljava/util/Timer;

    new-instance v2, Lcom/whoop/whooplive/selfie/SelfieActivity$a;

    invoke-direct {v2, p0}, Lcom/whoop/whooplive/selfie/SelfieActivity$a;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    invoke-virtual {p1, v2, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->M:J

    return p2
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity;->Q:Z

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->d1()V

    :cond_0
    return-void
.end method
