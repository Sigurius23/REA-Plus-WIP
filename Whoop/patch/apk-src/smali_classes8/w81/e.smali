.class public final Lw81/e;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lw81/e;",
        "Landroidx/recyclerview/widget/o2;",
        "Le91/a;",
        "viewBinding",
        "<init>",
        "(Le91/a;)V",
        "",
        "page",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "pageContents",
        "b",
        "(ILkotlin/jvm/functions/Function3;)V",
        "d",
        "()V",
        "a",
        "Le91/a;",
        "design_release"
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
.field private final a:Le91/a;


# direct methods
.method public constructor <init>(Le91/a;)V
    .locals 1

    const-string v0, "viewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le91/a;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lw81/e;->a:Le91/a;

    iget-object p1, p1, Le91/a;->b:Landroidx/compose/ui/platform/ComposeView;

    sget-object v0, Lb3/h2;->x:Lb3/h2;

    invoke-virtual {p1, v0}, Lb3/a;->setViewCompositionStrategy(Lb3/h3;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw81/e;->c(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(ILkotlin/jvm/functions/Function3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    const-string v0, "pageContents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw81/e;->a:Le91/a;

    iget-object v0, v0, Le91/a;->b:Landroidx/compose/ui/platform/ComposeView;

    new-instance v1, Lbd1/j;

    const/4 v2, 0x4

    invoke-direct {v1, p2, p1, v2}, Lbd1/j;-><init>(Lkotlin/jvm/functions/Function3;II)V

    new-instance p1, Lx1/b;

    const/4 p2, 0x1

    const v2, -0x2f633534

    invoke-direct {p1, v1, p2, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lw81/e;->a:Le91/a;

    iget-object v0, v0, Le91/a;->b:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v0}, Lb3/a;->d()V

    return-void
.end method
