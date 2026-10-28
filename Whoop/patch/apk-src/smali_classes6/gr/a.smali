.class public final Lgr/a;
.super Ls/x;
.source "SourceFile"


# static fields
.field public static final G:[[I


# instance fields
.field public E:Landroid/content/res/ColorStateList;

.field public F:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const v0, 0x101009e

    const v1, 0x10100a0

    filled-new-array {v0, v1}, [I

    move-result-object v2

    const v3, -0x10100a0

    filled-new-array {v0, v3}, [I

    move-result-object v0

    const v4, -0x101009e

    filled-new-array {v4, v1}, [I

    move-result-object v1

    filled-new-array {v4, v3}, [I

    move-result-object v3

    filled-new-array {v2, v0, v1, v3}, [[I

    move-result-object v0

    sput-object v0, Lgr/a;->G:[[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const v0, 0x7f1505de

    const v4, 0x7f040538

    invoke-static {p1, p2, v4, v0}, Lqr/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Ls/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f1505de

    new-array v6, v0, [I

    sget-object v3, Ljq/a;->z:[I

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcr/m;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1, v1, v0}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lgr/a;->F:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .locals 6

    iget-object v0, p0, Lgr/a;->E:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const v0, 0x7f04013e

    invoke-static {p0, v0}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v0

    const v1, 0x7f040151

    invoke-static {p0, v1}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v1

    const v2, 0x7f040168

    invoke-static {p0, v2}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2, v0}, Lrj/o;->x(FII)I

    move-result v0

    const v3, 0x3f0a3d71    # 0.54f

    invoke-static {v3, v2, v1}, Lrj/o;->x(FII)I

    move-result v3

    const v4, 0x3ec28f5c    # 0.38f

    invoke-static {v4, v2, v1}, Lrj/o;->x(FII)I

    move-result v5

    invoke-static {v4, v2, v1}, Lrj/o;->x(FII)I

    move-result v1

    filled-new-array {v0, v3, v5, v1}, [I

    move-result-object v0

    new-instance v1, Landroid/content/res/ColorStateList;

    sget-object v2, Lgr/a;->G:[[I

    invoke-direct {v1, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v1, p0, Lgr/a;->E:Landroid/content/res/ColorStateList;

    :cond_0
    iget-object v0, p0, Lgr/a;->E:Landroid/content/res/ColorStateList;

    return-object v0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lgr/a;->F:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lgr/a;->setUseMaterialThemeColors(Z)V

    :cond_0
    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .locals 0

    iput-boolean p1, p0, Lgr/a;->F:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lgr/a;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
