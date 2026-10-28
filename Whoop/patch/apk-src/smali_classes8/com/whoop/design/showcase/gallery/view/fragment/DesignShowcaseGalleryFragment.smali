.class public final Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R!\u0010)\u001a\u0008\u0012\u0004\u0012\u00020$0#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lbc3/k1;",
        "H",
        "()Lbc3/k1;",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lcd1/i;",
        "w",
        "Leb/i;",
        "C",
        "()Lcd1/i;",
        "args",
        "Lyc1/a;",
        "<set-?>",
        "x",
        "Lcom/whoop/ui/b;",
        "D",
        "()Lyc1/a;",
        "G",
        "(Lyc1/a;)V",
        "binding",
        "Lid1/c;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "y",
        "Ll83/h;",
        "E",
        "()Lid1/c;",
        "viewModel",
        "design-showcase_release"
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
.field public static final E:I

.field static final synthetic z:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Leb/i;

.field private final x:Lcom/whoop/ui/b;

.field private final y:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/design/showcase/databinding/FragmentDesignShowcaseBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->z:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Leb/i;

    const-class v1, Lcd1/i;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$b;

    invoke-direct {v2, p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$b;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->w:Leb/i;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->x:Lcom/whoop/ui/b;

    sget-object v0, Lf91/e;->a:Lf91/e;

    invoke-virtual {v0}, Lf91/e;->c()Lvf3/c;

    move-result-object v0

    new-instance v1, Lcd1/h;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcd1/h;-><init>(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;I)V

    new-instance v2, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$c;

    invoke-direct {v2, p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$d;

    invoke-direct {v4, p0, v0, v2, v1}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->y:Ll83/h;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Lyc1/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->D()Lyc1/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Lid1/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->E()Lid1/c;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lcd1/i;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->w:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcd1/i;

    return-object v0
.end method

.method private final D()Lyc1/a;
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->x:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc1/a;

    return-object v0
.end method

.method private final E()Lid1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lid1/c<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lid1/c;

    return-object v0
.end method

.method private static final F(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final G(Lyc1/a;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->x:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final H()Lbc3/k1;
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a;-><init>(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;Lq83/d;)V

    new-instance v3, Le;

    invoke-direct {v3, v0, v1, v2}, Le;-><init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    return-object v0
.end method

.method private static final I(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Luf3/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->C()Lcd1/i;

    move-result-object p0

    invoke-virtual {p0}, Lcd1/i;->a()Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->F(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->I(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lyc1/a;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lyc1/a;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->G(Lyc1/a;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->D()Lyc1/a;

    move-result-object p1

    invoke-virtual {p1}, Lyc1/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->D()Lyc1/a;

    move-result-object p1

    iget-object p1, p1, Lyc1/a;->c:Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;

    sget-object p2, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->C()Lcd1/i;

    move-result-object v0

    invoke-virtual {v0}, Lcd1/i;->a()Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->setToolbarType(Lcom/whoop/design/atomic/organism/toolbar/d;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->D()Lyc1/a;

    move-result-object p1

    iget-object p1, p1, Lyc1/a;->c:Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;

    new-instance p2, Lcd1/h;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcd1/h;-><init>(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;I)V

    invoke-virtual {p1, p2}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->setOnLeftButtonClick(Lc93/a;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->H()Lbc3/k1;

    return-void
.end method
