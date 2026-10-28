.class public final Lrq0/i$b;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ=\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010 *\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lrq0/i$b;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "Lcom/whoop/community/presentation/ui/SimpleDial;",
        "dial",
        "Ll83/a0;",
        "h",
        "(Lcom/whoop/community/presentation/ui/SimpleDial;)V",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "user",
        "Lrq0/k;",
        "viewModel",
        "Lrq0/i;",
        "adapter",
        "",
        "position",
        "Lkotlin/Function0;",
        "onInteract",
        "d",
        "(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V",
        "Landroid/animation/ValueAnimator;",
        "a",
        "Landroid/animation/ValueAnimator;",
        "getAnimator",
        "()Landroid/animation/ValueAnimator;",
        "setAnimator",
        "(Landroid/animation/ValueAnimator;)V",
        "animator",
        "g",
        "()I",
        "getUserId$delegate",
        "(Lrq0/i$b;)Ljava/lang/Object;",
        "userId",
        "community_release"
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
.field static final synthetic b:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final c:I


# instance fields
.field private a:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lrq0/i$b;

    const-string v2, "userId"

    const-string v3, "getUserId()I"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lrq0/i$b;->b:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lrq0/i$b;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    sget-object p1, Lor2/w1;->w:Lor2/w1;

    return-void
.end method

.method public static synthetic a(Lrq0/i;ILrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lrq0/i$b;->e(Lrq0/i;ILrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lc93/a;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/community/presentation/ui/SimpleDial;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/i$b;->i(Lcom/whoop/community/presentation/ui/SimpleDial;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Lrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lrq0/i$b;Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq0/i$b;->f(Lrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lrq0/i$b;Lc93/a;Landroid/view/View;)V

    return-void
.end method

.method private static final e(Lrq0/i;ILrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrq0/i;->i(Ljava/lang/Integer;)V

    invoke-virtual {p3}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result p0

    invoke-virtual {p3}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p0, p1, p4}, Lrq0/k;->e0(ILjava/lang/String;Lc93/a;)V

    return-void
.end method

.method private static final f(Lrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lrq0/i$b;Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result p4

    invoke-direct {p2}, Lrq0/i$b;->g()I

    move-result p2

    invoke-virtual {p0, p4, p2}, Lrq0/k;->i0(II)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result p2

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1, p3}, Lrq0/k;->j0(ILjava/lang/String;Lc93/a;)V

    :cond_0
    return-void
.end method

.method private final g()I
    .locals 3

    sget-object v0, Lor2/w1;->w:Lor2/w1;

    sget-object v1, Lrq0/i$b;->b:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lor2/w1;->a(Ljava/lang/Object;Lj93/z;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private final h(Lcom/whoop/community/presentation/ui/SimpleDial;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->u5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lxp0/z;->s:I

    invoke-static {v1, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lrq0/i$b;->a:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Ldb/e;

    const/16 v2, 0xa

    invoke-direct {v1, p1, v2}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Lrq0/i$b$a;

    invoke-direct {p1, p0}, Lrq0/i$b$a;-><init>(Lrq0/i$b;)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput-object v0, p0, Lrq0/i$b;->a:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private static final i(Lcom/whoop/community/presentation/ui/SimpleDial;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/community/presentation/ui/SimpleDial;->setProgress(F)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/TeamUser;",
            "Lrq0/k;",
            "Lrq0/i;",
            "I",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onInteract"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result v0

    invoke-virtual {p2, v0}, Lrq0/k;->U(I)Z

    move-result v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result v1

    invoke-virtual {p2, v1}, Lrq0/k;->S(I)Z

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v3, Lxp0/a0;->K3:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v3, Lxp0/a0;->A3:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v3, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lxp0/d0;->Q0:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    iget-object v3, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lxp0/d0;->P0:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getUserName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "@"

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v3, Lxp0/a0;->I:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {v2, v0}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v2, Lxp0/a0;->w5:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->B3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/c;->n:I

    invoke-static {v1, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v1

    sget v2, Lvu1/c;->n:I

    invoke-virtual {v1, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    :cond_3
    invoke-virtual {p3}, Lrq0/i;->e()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p4, v0, :cond_5

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->v5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/community/presentation/ui/SimpleDial;

    invoke-direct {p0, v0}, Lrq0/i$b;->h(Lcom/whoop/community/presentation/ui/SimpleDial;)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lrq0/i;->i(Ljava/lang/Integer;)V

    :cond_5
    :goto_2
    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->I:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lrq0/j;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lrq0/j;-><init>(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p2, Lxp0/a0;->u5:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    move-object v4, v2

    new-instance v2, Ldb/u;

    const/4 v7, 0x1

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Ldb/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    return-void
.end method
