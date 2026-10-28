.class public final Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "C",
        "()Landroidx/recyclerview/widget/RecyclerView;",
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
        "Lyc1/b;",
        "<set-?>",
        "w",
        "Lcom/whoop/ui/b;",
        "z",
        "()Lyc1/b;",
        "B",
        "(Lyc1/b;)V",
        "binding",
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
.field static final synthetic x:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final y:I


# instance fields
.field private final w:Lcom/whoop/ui/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/design/showcase/databinding/FragmentDesignShowcaseLegacyGalleryBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->x:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->w:Lcom/whoop/ui/b;

    return-void
.end method

.method private static final A(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final B(Lyc1/b;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->w:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->x:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final C()Landroidx/recyclerview/widget/RecyclerView;
    .locals 2

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->z()Lyc1/b;

    move-result-object v0

    iget-object v0, v0, Lyc1/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lad1/a;

    invoke-direct {v1}, Lad1/a;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->A(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final z()Lyc1/b;
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->w:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->x:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc1/b;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lyc1/b;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lyc1/b;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->B(Lyc1/b;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->z()Lyc1/b;

    move-result-object p1

    invoke-virtual {p1}, Lyc1/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

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

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->C()Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->z()Lyc1/b;

    move-result-object p1

    iget-object p1, p1, Lyc1/b;->c:Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;

    sget-object p2, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v0, "Stress Test"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->setToolbarType(Lcom/whoop/design/atomic/organism/toolbar/d;)V

    invoke-direct {p0}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->z()Lyc1/b;

    move-result-object p1

    iget-object p1, p1, Lyc1/b;->c:Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;

    new-instance p2, La1/j;

    const/16 v0, 0xf

    invoke-direct {p2, p0, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->setOnLeftButtonClick(Lc93/a;)V

    return-void
.end method
