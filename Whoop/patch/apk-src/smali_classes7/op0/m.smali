.class public final Lop0/m;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J_\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lop0/m;",
        "Landroidx/recyclerview/widget/o2;",
        "Lgf2/r;",
        "binding",
        "<init>",
        "(Lgf2/r;)V",
        "Lop0/c;",
        "sleepCoachOnBoardingItem",
        "",
        "position",
        "Lkotlin/Function2;",
        "Ll83/a0;",
        "onNextClick",
        "onBackClick",
        "Lkotlin/Function0;",
        "closeIconClick",
        "d",
        "(Lop0/c;ILc93/m;Lc93/m;Lc93/a;)V",
        "a",
        "Lgf2/r;",
        "getBinding",
        "()Lgf2/r;",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lgf2/r;


# direct methods
.method public constructor <init>(Lgf2/r;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lop0/m;->a:Lgf2/r;

    return-void
.end method

.method public static synthetic a(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lop0/m;->f(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lop0/m;->g(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lop0/m;->e(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d(Lop0/c;ILc93/m;Lc93/m;Lc93/a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lop0/c;",
            "I",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "sleepCoachOnBoardingItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNextClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeIconClick"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lop0/m;->a:Lgf2/r;

    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v2, Lqe2/e;->t0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lop0/c;->getBackgroundImage()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v2, Lqe2/e;->w0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lop0/c;->getTitle()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v2, Lqe2/e;->u0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lop0/c;->getDescriptionOne()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v2, Lqe2/e;->v0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lop0/c;->getDescriptionTwo()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_3
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v2, Lqe2/e;->p0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lop0/c;->getNextButtonText()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p1}, Lop0/c;->getNextButtonVisibility()Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v3

    goto :goto_0

    :cond_4
    move v4, v2

    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v4, Lqe2/e;->p:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lop0/c;->getBackButtonVisibility()Z

    move-result v4

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_1

    :cond_6
    move v4, v2

    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    invoke-virtual {v0}, Lgf2/r;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    sget v4, Lqe2/e;->w:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lop0/c;->isCloseIconVisible()Z

    move-result v4

    if-eqz v4, :cond_8

    move v2, v3

    :cond_8
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_9
    iget-object v1, v0, Lgf2/r;->g:Landroid/widget/TextView;

    const-string v2, "nextScreen"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lop0/l;

    const/4 v3, 0x0

    invoke-direct {v2, p3, p1, p2, v3}, Lop0/l;-><init>(Lc93/m;Lop0/c;II)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p3, v0, Lgf2/r;->b:Landroid/widget/TextView;

    const-string v1, "backScreen"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lop0/l;

    const/4 v2, 0x1

    invoke-direct {v1, p4, p1, p2, v2}, Lop0/l;-><init>(Lc93/m;Lop0/c;II)V

    invoke-static {p3, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lgf2/r;->c:Landroid/widget/ImageView;

    const-string p2, "closeOnboarding"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lh0/l0;

    const/16 p3, 0x14

    invoke-direct {p2, p5, p3}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
