.class public final Lcom/whoop/ui/WhoopNewToolbar;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u000cJ\u0017\u0010\u0018\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u000cJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u000cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001f\u0010\u000cJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008 \u0010\u0015J!\u0010$\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!\u00a2\u0006\u0004\u0008$\u0010%J\u001b\u0010\'\u001a\u00020\n2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0&\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0012\u00a2\u0006\u0004\u0008*\u0010\u0015J\u001b\u0010+\u001a\u00020\n2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0&\u00a2\u0006\u0004\u0008+\u0010(J\r\u0010,\u001a\u00020\n\u00a2\u0006\u0004\u0008,\u0010-J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0012\u00a2\u0006\u0004\u0008/\u0010\u0015J\u0019\u00102\u001a\u00020\n2\u0008\u00101\u001a\u0004\u0018\u000100H\u0002\u00a2\u0006\u0004\u00082\u00103J\u0019\u00104\u001a\u00020\n2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00084\u0010\u000cJ\u0019\u00106\u001a\u00020\n2\u0008\u0008\u0001\u00105\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00086\u0010\u000cJ\u0019\u00107\u001a\u00020\n2\u0008\u0008\u0001\u00105\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00087\u0010\u000cJ\u0017\u00108\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00088\u0010\u0015J\u0017\u00109\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00089\u0010\u0015J\u0019\u0010:\u001a\u00020\n2\u0008\u0008\u0001\u00105\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008:\u0010\u000cR\u0016\u0010=\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010?\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u0016\u0010A\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010<R\u0016\u0010C\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010<R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008E\u0010F\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/ui/WhoopNewToolbar;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "resourceId",
        "Ll83/a0;",
        "setBackArrowResource",
        "(I)V",
        "",
        "data",
        "textColor",
        "t",
        "(Ljava/lang/String;I)V",
        "",
        "enable",
        "setToolbarDataVisibility",
        "(Z)V",
        "title",
        "setToolbarTitle",
        "setToolbarTitleText",
        "(Ljava/lang/String;)V",
        "setToolbarSubjectTitle",
        "setToolbarSubjectTitleByValue",
        "subTitle",
        "setToolbarSubjectSubTitle",
        "setSubjectImageDrawable",
        "setOptionItemImageDrawable",
        "setOptionItemImageDrawableVisibility",
        "Lkotlin/Function1;",
        "Landroid/view/View;",
        "onClick",
        "n",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lkotlin/Function0;",
        "r",
        "(Lc93/a;)V",
        "show",
        "setSubjectImageDrawableVisibility",
        "p",
        "l",
        "()V",
        "shouldGlow",
        "setGlowingIconEffect",
        "Landroid/content/res/TypedArray;",
        "arr",
        "m",
        "(Landroid/content/res/TypedArray;)V",
        "setToolbarTitleColor",
        "color",
        "setToolbarSubjectTitleColor",
        "setToolbarSubjectSubTitleColor",
        "setSubjectContainerVisibility",
        "setHelpButtonVisibility",
        "setToolbarBackgroundColor",
        "w",
        "I",
        "toolbarTitleColor",
        "x",
        "toolbarSubjectTitleColor",
        "y",
        "toolbarSubjectSubTitleColor",
        "z",
        "toolbarBackgroundColor",
        "Lof1/b;",
        "E",
        "Lof1/b;",
        "binding",
        "feature_release"
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
.field private E:Lof1/b;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->O:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->w:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnf1/b;->d:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->g:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->N:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->z:I

    sget-object v0, Lnf1/h;->h:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->m(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic f(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->q(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->s(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->o(Lkotlin/jvm/functions/Function1;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final m(Landroid/content/res/TypedArray;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lof1/b;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lof1/b;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz p1, :cond_7

    sget v0, Lnf1/h;->k:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, Lnf1/h;->k:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setOptionItemImageDrawable(I)V

    :cond_0
    sget v0, Lnf1/h;->l:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setOptionItemImageDrawableVisibility(Z)V

    sget v0, Lnf1/h;->p:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lnf1/h;->p:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setSubjectImageDrawable(I)V

    :cond_1
    sget v0, Lnf1/h;->t:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lnf1/h;->t:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarTitle(I)V

    sget v0, Lnf1/h;->u:I

    iget v2, p0, Lcom/whoop/ui/WhoopNewToolbar;->w:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarTitleColor(I)V

    goto :goto_0

    :cond_2
    sget v0, Lnf1/h;->u:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lnf1/h;->u:I

    iget v2, p0, Lcom/whoop/ui/WhoopNewToolbar;->w:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarTitleColor(I)V

    :cond_3
    :goto_0
    sget v0, Lnf1/h;->o:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setSubjectContainerVisibility(Z)V

    sget v0, Lnf1/h;->o:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lnf1/h;->r:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarSubjectTitle(I)V

    sget v0, Lnf1/h;->s:I

    iget v2, p0, Lcom/whoop/ui/WhoopNewToolbar;->x:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarSubjectTitleColor(I)V

    sget v0, Lnf1/h;->q:I

    iget v2, p0, Lcom/whoop/ui/WhoopNewToolbar;->y:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarSubjectSubTitleColor(I)V

    :cond_4
    sget v0, Lnf1/h;->n:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lnf1/g;->f:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lcom/whoop/ui/WhoopNewToolbar;->u(Lcom/whoop/ui/WhoopNewToolbar;Ljava/lang/String;IILjava/lang/Object;)V

    :cond_5
    sget v0, Lnf1/h;->j:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setHelpButtonVisibility(Z)V

    sget v0, Lnf1/h;->m:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Lnf1/h;->m:I

    iget v1, p0, Lcom/whoop/ui/WhoopNewToolbar;->z:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setToolbarBackgroundColor(I)V

    :cond_6
    sget v0, Lnf1/h;->i:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_7

    sget v0, Lnf1/h;->i:I

    sget v1, Lnf1/c;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->setBackArrowResource(I)V

    :cond_7
    return-void
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lc93/a;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setHelpButtonVisibility(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->d:Landroid/widget/ImageView;

    const-string v1, "helpButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final setSubjectContainerVisibility(Z)V
    .locals 6

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lof1/b;->j:Landroid/widget/LinearLayout;

    const-string v3, "titleSubjectLayout"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lof1/b;->e:Landroid/widget/TextView;

    const-string v1, "mainTitleTv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final setToolbarBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final setToolbarSubjectSubTitleColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final setToolbarSubjectTitleColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final setToolbarTitleColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic u(Lcom/whoop/ui/WhoopNewToolbar;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget p2, p0, Lcom/whoop/ui/WhoopNewToolbar;->w:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/WhoopNewToolbar;->t(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 11

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_4

    iget-object v0, v0, Lof1/b;->c:Landroid/widget/TextView;

    const-string v3, "dataTv"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lof1/b;->d:Landroid/widget/ImageView;

    const-string v4, "helpButton"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v5, Landroidx/constraintlayout/widget/p;

    invoke-direct {v5}, Landroidx/constraintlayout/widget/p;-><init>()V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lof1/b;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v5, v0}, Landroidx/constraintlayout/widget/p;->e(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    sget v6, Lnf1/d;->i:I

    sget v8, Lnf1/d;->m:I

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x6

    invoke-virtual/range {v5 .. v10}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    sget v6, Lnf1/d;->i:I

    sget v8, Lnf1/d;->m:I

    const/4 v9, 0x7

    const/4 v7, 0x7

    invoke-virtual/range {v5 .. v10}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v5, v0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->e:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final n(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->b:Landroid/widget/ImageView;

    const-string v1, "backIv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La61/a;

    const/16 v2, 0x18

    invoke-direct {v1, p1, v2}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final p(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->d:Landroid/widget/ImageView;

    const-string v1, "helpButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Laz1/b;

    const/16 v2, 0xa

    invoke-direct {v1, p1, v2}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final r(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->f:Landroid/widget/ImageView;

    const-string v1, "optionIv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Laz1/b;

    const/16 v2, 0xb

    invoke-direct {v1, p1, v2}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setBackArrowResource(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setGlowingIconEffect(Z)V
    .locals 2

    const-string v0, "binding"

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lof1/b;->f:Landroid/widget/ImageView;

    sget v0, Lnf1/c;->b:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    return-void

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object p1, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lof1/b;->f:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setOptionItemImageDrawable(I)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->f:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setOptionItemImageDrawableVisibility(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->f:Landroid/widget/ImageView;

    const-string v1, "optionIv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setSubjectImageDrawable(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopNewToolbar;->setSubjectImageDrawableVisibility(Z)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->l:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setSubjectImageDrawableVisibility(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->l:Lcom/whoop/ui/views/ColoredImageView;

    const-string v1, "toolbarSubjectIv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarDataVisibility(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->c:Landroid/widget/TextView;

    const-string v1, "dataTv"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarSubjectSubTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "subTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarSubjectTitle(I)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarSubjectTitleByValue(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarTitle(I)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setToolbarTitleText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lof1/b;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final t(Ljava/lang/String;I)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lof1/b;->c:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lof1/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopNewToolbar;->E:Lof1/b;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lof1/b;->c:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
