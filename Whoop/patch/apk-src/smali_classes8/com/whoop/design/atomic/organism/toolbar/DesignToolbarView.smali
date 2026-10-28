.class public final Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;
.super Ld91/e;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\n2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0014R\u001c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;",
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
        "Lcom/whoop/design/atomic/organism/toolbar/d;",
        "state",
        "setToolbarType",
        "(Lcom/whoop/design/atomic/organism/toolbar/d;)V",
        "Lkotlin/Function0;",
        "onClick",
        "setOnLeftButtonClick",
        "(Lc93/a;)V",
        "setOnRightButtonClick",
        "K",
        "Lc93/a;",
        "onLeftButtonClick",
        "L",
        "onRightButtonClick",
        "Lp1/c1;",
        "M",
        "Lp1/c1;",
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
.field private K:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private L:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private M:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p3}, Ld91/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v1, Lnx1/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lnx1/a;-><init>(I)V

    iput-object v1, v0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->K:Lc93/a;

    .line 4
    new-instance v1, Lnx1/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lnx1/a;-><init>(I)V

    iput-object v1, v0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->L:Lc93/a;

    .line 5
    new-instance v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const/16 v19, 0x7fff

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v20}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->M:Lp1/c1;

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

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic n(Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->r(Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final r(Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public m(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, -0x694af5b1

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    if-eq v1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p1, v2

    invoke-virtual {v6, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->M:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d;

    iget-object v3, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->K:Lc93/a;

    iget-object v4, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->L:Lc93/a;

    const/4 v7, 0x0

    const/16 v8, 0x25

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lk71/i;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, p2, v1}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public final setOnLeftButtonClick(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->K:Lc93/a;

    return-void
.end method

.method public final setOnRightButtonClick(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->L:Lc93/a;

    return-void
.end method

.method public final setToolbarType(Lcom/whoop/design/atomic/organism/toolbar/d;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;->M:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
