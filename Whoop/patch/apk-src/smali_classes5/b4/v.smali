.class public final Lb4/v;
.super Lb4/l;
.source "SourceFile"


# instance fields
.field public final c0:Landroid/view/View;

.field public final d0:Lt2/d;

.field public e0:Ly1/e;

.field public f0:Lkotlin/jvm/functions/Function1;

.field public g0:Lkotlin/jvm/functions/Function1;

.field public h0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/o;Ly1/f;ILandroidx/compose/ui/node/Owner;)V
    .locals 7

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Landroid/view/View;

    new-instance v4, Lt2/d;

    invoke-direct {v4}, Lt2/d;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move v3, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb4/l;-><init>(Landroid/content/Context;Lp1/o;ILt2/d;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V

    iput-object v5, v0, Lb4/v;->c0:Landroid/view/View;

    iput-object v4, v0, Lb4/v;->d0:Lt2/d;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p4, :cond_0

    invoke-interface {p4, p1}, Ly1/f;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    instance-of p5, p3, Landroid/util/SparseArray;

    if-eqz p5, :cond_1

    move-object p2, p3

    check-cast p2, Landroid/util/SparseArray;

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v5, p2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_2
    if-eqz p4, :cond_3

    new-instance p2, Lb4/u;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lb4/u;-><init>(Lb4/v;I)V

    invoke-interface {p4, p2, p1}, Ly1/f;->b(Lc93/a;Ljava/lang/String;)Ly1/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lb4/v;->setSavableRegistryEntry(Ly1/e;)V

    :cond_3
    sget-object p1, Lb4/c;->E:Lb4/c;

    iput-object p1, v0, Lb4/v;->f0:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lb4/v;->g0:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lb4/v;->h0:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final n(Lb4/v;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb4/v;->setSavableRegistryEntry(Ly1/e;)V

    return-void
.end method

.method private final setSavableRegistryEntry(Ly1/e;)V
    .locals 1

    iget-object v0, p0, Lb4/v;->e0:Ly1/e;

    if-eqz v0, :cond_0

    check-cast v0, Ls/m2;

    invoke-virtual {v0}, Ls/m2;->u()V

    :cond_0
    iput-object p1, p0, Lb4/v;->e0:Ly1/e;

    return-void
.end method


# virtual methods
.method public final getDispatcher()Lt2/d;
    .locals 1

    iget-object v0, p0, Lb4/v;->d0:Lt2/d;

    return-object v0
.end method

.method public final getReleaseBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/v;->h0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getResetBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/v;->g0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public bridge synthetic getSubCompositionView()Lb3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUpdateBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/v;->f0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final setReleaseBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/v;->h0:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lb4/u;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lb4/u;-><init>(Lb4/v;I)V

    invoke-virtual {p0, p1}, Lb4/l;->setRelease(Lc93/a;)V

    return-void
.end method

.method public final setResetBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/v;->g0:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lb4/u;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lb4/u;-><init>(Lb4/v;I)V

    invoke-virtual {p0, p1}, Lb4/l;->setReset(Lc93/a;)V

    return-void
.end method

.method public final setUpdateBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/v;->f0:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lb4/u;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Lb4/u;-><init>(Lb4/v;I)V

    invoke-virtual {p0, p1}, Lb4/l;->setUpdate(Lc93/a;)V

    return-void
.end method
