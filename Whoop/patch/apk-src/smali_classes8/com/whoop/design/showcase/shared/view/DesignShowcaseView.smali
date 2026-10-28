.class public final Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;
.super Ld91/e;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;",
        "Ld91/e;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "m",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function1;",
        "",
        "K",
        "Lkotlin/jvm/functions/Function1;",
        "getOnViewEvent",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnViewEvent",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onViewEvent",
        "Lid1/e;",
        "<set-?>",
        "L",
        "Lp1/c1;",
        "getViewState",
        "()Lid1/e;",
        "setViewState",
        "(Lid1/e;)V",
        "viewState",
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


# instance fields
.field private K:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final L:Lp1/c1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Ld91/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Lhb1/h;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lhb1/h;-><init>(I)V

    iput-object p1, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->K:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance v0, Lid1/e;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lid1/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lid1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->L:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic n(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->r(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->s(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->K:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getOnViewEvent()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->K:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getViewState()Lid1/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->L:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lid1/e;

    return-object v0
.end method

.method public m(Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p1, Lp1/q;

    const v0, -0x187de3ce

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->getViewState()Lid1/e;

    move-result-object v0

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Lhb2/c;

    const/4 v1, 0x1

    invoke-direct {v2, p0, v1}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, p1, v4, v4}, Lhd1/b;->e(Lid1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Ld71/c;

    const/16 v1, 0x11

    invoke-direct {v0, p0, p2, v1}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public final setOnViewEvent(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->K:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setViewState(Lid1/e;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->L:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
