.class public final Lb4/q;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Landroid/view/View;

.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/o;

.field public final synthetic z:Ly1/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/o;Ly1/f;ILandroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lb4/q;->w:Landroid/content/Context;

    iput-object p2, p0, Lb4/q;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lb4/q;->y:Lp1/o;

    iput-object p4, p0, Lb4/q;->z:Ly1/f;

    iput p5, p0, Lb4/q;->E:I

    iput-object p6, p0, Lb4/q;->F:Landroid/view/View;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    new-instance v0, Lb4/v;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.node.Owner"

    iget-object v2, p0, Lb4/q;->F:Landroid/view/View;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v2

    check-cast v6, Landroidx/compose/ui/node/Owner;

    iget-object v1, p0, Lb4/q;->w:Landroid/content/Context;

    iget-object v2, p0, Lb4/q;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lb4/q;->y:Lp1/o;

    iget-object v4, p0, Lb4/q;->z:Ly1/f;

    iget v5, p0, Lb4/q;->E:I

    invoke-direct/range {v0 .. v6}, Lb4/v;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/o;Ly1/f;ILandroidx/compose/ui/node/Owner;)V

    invoke-virtual {v0}, Lb4/l;->getLayoutNode()La3/n0;

    move-result-object v0

    return-object v0
.end method
