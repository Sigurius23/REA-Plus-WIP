.class public final Ll1/e2;
.super Lg/m;
.source "SourceFile"


# instance fields
.field public E:Ll1/o2;

.field public F:J

.field public final G:Landroid/view/View;

.field public final H:Ll1/b2;

.field public z:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Ll1/o2;JLandroid/view/View;Ly3/m;Ly3/c;Ljava/util/UUID;Ld0/e;Lbc3/c0;)V
    .locals 8

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f150151

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lg/m;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Ll1/e2;->z:Lc93/a;

    iput-object p2, p0, Ll1/e2;->E:Ll1/o2;

    iput-wide p3, p0, Ll1/e2;->F:J

    iput-object p5, p0, Ll1/e2;->G:Landroid/view/View;

    const/16 p2, 0x8

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p3

    if-eqz p3, :cond_4

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x106000d

    invoke-virtual {p3, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    invoke-static {p3, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    new-instance v0, Ll1/b2;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p3}, Ll1/b2;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dialog:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, p8

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0a032f

    invoke-virtual {v0, v3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p7, p2}, Ly3/c;->q0(F)F

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setElevation(F)V

    new-instance p2, Lc4/c0;

    const/4 v2, 0x2

    invoke-direct {p2, v2}, Lc4/c0;-><init>(I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iput-object v0, p0, Ll1/e2;->H:Ll1/b2;

    invoke-virtual {p0, v0}, Lg/m;->setContentView(Landroid/view/View;)V

    invoke-static {p5}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object p2

    invoke-static {v0, p2}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-static {p5}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object p2

    invoke-static {v0, p2}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    invoke-static {p5}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object p1

    invoke-static {v0, p1}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    iget-object v3, p0, Ll1/e2;->z:Lc93/a;

    iget-object v4, p0, Ll1/e2;->E:Ll1/o2;

    iget-wide v5, p0, Ll1/e2;->F:J

    move-object v2, p0

    move-object v7, p6

    invoke-virtual/range {v2 .. v7}, Ll1/e2;->c(Lc93/a;Ll1/o2;JLy3/m;)V

    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    new-instance p2, Laj/d;

    invoke-direct {p2, p1}, Laj/d;-><init>(Landroid/view/View;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt p1, v0, :cond_0

    new-instance p1, Lh5/u1;

    invoke-direct {p1, p3, p2}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    new-instance p1, Lh5/s1;

    invoke-direct {p1, p3, p2}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lh5/r1;

    invoke-direct {p1, p3, p2}, Lh5/r1;-><init>(Landroid/view/Window;Laj/d;)V

    :goto_0
    iget-object p2, p0, Ll1/e2;->E:Ll1/o2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide p2, p0, Ll1/e2;->F:J

    sget-wide v3, Li2/x;->m:J

    invoke-static {p2, p3, v3, v4}, Li2/x;->d(JJ)Z

    move-result v0

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    if-nez v0, :cond_2

    invoke-static {p2, p3}, Li2/w0;->x(J)F

    move-result p2

    float-to-double p2, p2

    cmpg-double p2, p2, v5

    if-gtz p2, :cond_2

    move p2, p4

    goto :goto_1

    :cond_2
    move p2, v1

    :goto_1
    invoke-virtual {p1, p2}, Lbi/g;->Y(Z)V

    iget-object p2, p0, Ll1/e2;->E:Ll1/o2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide p2, p0, Ll1/e2;->F:J

    invoke-static {p2, p3, v3, v4}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2, p3}, Li2/w0;->x(J)F

    move-result p2

    float-to-double p2, p2

    cmpg-double p2, p2, v5

    if-gtz p2, :cond_3

    move v1, p4

    :cond_3
    invoke-virtual {p1, v1}, Lbi/g;->X(Z)V

    invoke-virtual {p0}, Lg/m;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance p2, Ll1/d2;

    iget-object p3, p0, Ll1/e2;->E:Ll1/o2;

    iget-boolean p3, p3, Ll1/o2;->b:Z

    new-instance p4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v0, 0x12

    invoke-direct {p4, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v0, p9

    move-object/from16 v1, p10

    invoke-direct {p2, p3, v1, v0, p4}, Ll1/d2;-><init>(ZLbc3/c0;Ld0/e;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;)V

    invoke-virtual {p1, p0, p2}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dialog has no window"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Lc93/a;Ll1/o2;JLy3/m;)V
    .locals 1

    iput-object p1, p0, Ll1/e2;->z:Lc93/a;

    iput-object p2, p0, Ll1/e2;->E:Ll1/o2;

    iput-wide p3, p0, Ll1/e2;->F:J

    iget-object p1, p2, Ll1/o2;->a:Lc4/k0;

    iget-object p2, p0, Ll1/e2;->G:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p3, p2, Landroid/view/WindowManager$LayoutParams;

    if-eqz p3, :cond_0

    check-cast p2, Landroid/view/WindowManager$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 p3, 0x1

    const/16 p4, 0x2000

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/2addr p2, p4

    if-eqz p2, :cond_1

    move p2, p3

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, p3, :cond_3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    move p2, v0

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    move p2, p3

    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz p2, :cond_5

    move p2, p4

    goto :goto_3

    :cond_5
    const/16 p2, -0x2001

    :goto_3
    invoke-virtual {p1, p2, p4}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-ne p1, p3, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    move p3, v0

    :goto_4
    iget-object p1, p0, Ll1/e2;->H:Ll1/b2;

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutDirection(I)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 p2, -0x1

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    :cond_8
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_a

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1e

    if-lt p2, p3, :cond_9

    const/16 p2, 0x30

    goto :goto_5

    :cond_9
    const/16 p2, 0x10

    :goto_5
    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_a
    return-void
.end method

.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll1/e2;->z:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return p1
.end method
