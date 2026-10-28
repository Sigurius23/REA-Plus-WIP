.class public abstract Lyn2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a9\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a5\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lwn2/i;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "Lkotlin/Function1;",
        "",
        "onViewEvent",
        "m",
        "(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "t",
        "(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lt0/i;",
        "a",
        "Lt0/i;",
        "BUY_NOW_SHEET_SHAPE",
        "Lwn2/i$c;",
        "b",
        "Lwn2/i$c;",
        "getBuyNowLoadedPreviewViewState",
        "()Lwn2/i$c;",
        "buyNowLoadedPreviewViewState",
        "",
        "isDismissible",
        "universal-checkout_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lt0/i;

.field private static final b:Lwn2/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr v0, v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v0, v0, v1, v1, v2}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v0

    sput-object v0, Lyn2/b;->a:Lt0/i;

    new-instance v1, Lwn2/i$c;

    new-instance v0, Lwn2/g;

    invoke-static {}, Lxn2/f;->d()Lxn2/g;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "BUY_NOW_ITEMS"

    const-string v4, "COMPACT"

    invoke-direct {v0, v3, v4, v2}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lwn2/g;

    new-instance v5, Lhy0/e;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v5, "divider_1"

    invoke-direct {v2, v5, v4, v3}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v3, Lwn2/g;

    sget-object v5, Ly71/o;->p:Ly71/o$c;

    const-string v6, "ADD A NEW SHIPPING ADDRESS"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v11, Ly71/g;

    sget-object v7, Lgz0/m0;->LOCATION_PIN:Lgz0/m0;

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    const/4 v9, 0x2

    invoke-direct {v11, v7, v8, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Ly71/g;

    sget-object v31, Lgz0/m0;->CARET_RIGHT:Lgz0/m0;

    invoke-virtual/range {v31 .. v31}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-direct {v13, v7, v8, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v29, 0x7fff5e

    const/16 v30, 0x0

    const/4 v7, 0x0

    move-object v10, v8

    move v12, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v34, v32

    move-object/from16 v32, v0

    move/from16 v0, v34

    move-object/from16 v34, v1

    move-object/from16 v1, v33

    invoke-static/range {v5 .. v30}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v33

    const-string v6, "****4242"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v7, "Payment details"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v11, Ly71/g;

    sget-object v7, Lgz0/m0;->CREDIT_CARD:Lgz0/m0;

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-direct {v11, v7, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Ly71/g;

    invoke-virtual/range {v31 .. v31}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-direct {v13, v7, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v29, 0x7fff56

    const/4 v7, 0x0

    invoke-static/range {v5 .. v30}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    new-array v0, v0, [Lm91/u;

    const/4 v5, 0x0

    aput-object v33, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "menu_items"

    invoke-direct {v3, v1, v4, v0}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Lwn2/g;

    new-instance v5, Lhy0/e;

    const/4 v9, 0x7

    const/4 v6, 0x0

    invoke-direct/range {v5 .. v10}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v5, "divider_2"

    invoke-direct {v0, v5, v4, v1}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v1, Lwn2/g;

    invoke-static {}, Lxn2/b;->f()Lxn2/c;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "BUY_NOW_CHECKOUT_INFO"

    const-string v6, "LARGE"

    invoke-direct {v1, v5, v6, v4}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v4, v32

    filled-new-array {v4, v2, v3, v0, v1}, [Lwn2/g;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lio2/h;

    const-string v0, "By placing an order, you agree to the [WHOOP Terms of Sale](https://www.whoop.com/termsofuse)."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v0, "PLACE ORDER"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-string v7, "/commerce-service/v2/mobile/payments/buy-now"

    const-string v8, "cart-123"

    invoke-direct/range {v4 .. v10}, Lio2/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/whoop/navigation/e;

    sget-object v6, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v7, "card_123"

    const-string v2, "Buy Now"

    move-object v6, v5

    const-string v5, "$49.00"

    move-object/from16 v1, v34

    invoke-direct/range {v1 .. v7}, Lwn2/i$c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    sput-object v1, Lyn2/b;->b:Lwn2/i$c;

    return-void
.end method

.method public static synthetic a(Lwn2/i;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyn2/b;->r(Lwn2/i;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyn2/b;->p(Lc93/a;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyn2/b;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwn2/i;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyn2/b;->u(Lwn2/i;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyn2/b;->x(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Ll1/x3;)Z
    .locals 0

    invoke-static {p0, p1}, Lyn2/b;->q(Lp1/t2;Ll1/x3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyn2/b;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyn2/b;->n(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lwn2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyn2/b;->v(Lkotlin/jvm/functions/Function1;Lwn2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyn2/b;->s(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v4, p0

    check-cast v4, Lp1/q;

    const p0, 0x5266946f

    invoke-virtual {v4, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v7, 0x1

    if-eqz p1, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v4, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v4, p0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, v4, v1, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v4, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget p0, Lgy0/a;->e:I

    const/4 v0, 0x6

    invoke-static {p0, v4, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const/16 v5, 0x30

    const/16 v6, 0x7c

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lv41/c;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lv41/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lyn2/b;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn2/i;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x530e9bba

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_7

    move v6, v9

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    instance-of v6, v1, Lwn2/i$d;

    if-nez v6, :cond_f

    instance-of v6, v1, Lwn2/i$a;

    if-eqz v6, :cond_8

    goto/16 :goto_8

    :cond_8
    const v6, 0x71004b28

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    instance-of v6, v1, Lwn2/i$f;

    if-nez v6, :cond_9

    instance-of v6, v1, Lwn2/i$e;

    if-nez v6, :cond_9

    move v6, v9

    goto :goto_6

    :cond_9
    move v6, v10

    :goto_6
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v5, v5, 0x70

    if-ne v5, v7, :cond_a

    goto :goto_7

    :cond_a
    move v9, v10

    :goto_7
    or-int v5, v8, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_b

    if-ne v7, v8, :cond_c

    :cond_b
    new-instance v7, Lcp0/t0;

    const/4 v5, 0x7

    invoke-direct {v7, v2, v6, v5}, Lcp0/t0;-><init>(Lc93/a;Lp1/c1;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v5, v7

    check-cast v5, Lc93/a;

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_d

    if-ne v9, v8, :cond_e

    :cond_d
    new-instance v9, Lyb0/e;

    const/4 v7, 0x6

    invoke-direct {v9, v7, v6}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    invoke-static {v6, v9, v0, v10}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v7

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->o()J

    move-result-wide v11

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->u()J

    move-result-wide v16

    new-instance v6, Lvv2/d;

    const/16 v8, 0xd

    invoke-direct {v6, v8, v1, v3}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v8, 0x6be60798

    invoke-static {v8, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v21

    const/16 v24, 0xc06

    const/16 v25, 0x193a

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v5 .. v25}, Ll1/n2;->a(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    goto :goto_a

    :cond_f
    :goto_8
    const v5, 0x70ff69ec

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-static {v5, v0, v10, v9}, Lyn2/d;->b(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lyn2/a;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lyn2/a;-><init>(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    :goto_9
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lyn2/a;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lyn2/a;-><init>(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    goto :goto_9

    :cond_11
    return-void
.end method

.method private static final n(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lyn2/b;->m(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final p(Lc93/a;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lyn2/b;->o(Lp1/t2;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/t2;Ll1/x3;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll1/x3;->w:Ll1/x3;

    if-ne p1, v0, :cond_1

    invoke-static {p0}, Lyn2/b;->o(Lp1/t2;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final r(Lwn2/i;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$ModalBottomSheet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lyn2/b;->t(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lyn2/b;->m(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn2/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p4

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v3, -0x192e3102

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v0, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int/2addr v3, v0

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v12

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v13, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_28

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_9

    move-object v6, v9

    goto :goto_7

    :cond_9
    move-object v6, v8

    :goto_7
    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, Lyn2/b;->a:Lt0/i;

    invoke-static {v10, v14}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {}, Lgb1/b0;->c0()Li2/t;

    move-result-object v14

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    invoke-static {v10, v14, v15, v8, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v4, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    invoke-static {v7, v13, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v12}, Lyn2/b;->k(Landroidx/compose/runtime/Composer;I)V

    instance-of v4, v1, Lwn2/i$c;

    sget-object v7, Lp1/l;->a:Lp1/v0;

    const/16 v8, 0x8

    if-eqz v4, :cond_16

    const v4, -0x6d2ecf5a

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    move-object/from16 v30, v1

    check-cast v30, Lwn2/i$c;

    invoke-virtual/range {v30 .. v30}, Lwn2/i$c;->e()Ljava/lang/String;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v13, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    invoke-virtual {v10, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    int-to-float v14, v5

    int-to-float v8, v8

    mul-float/2addr v8, v14

    invoke-static {v9, v8, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v28, v14, 0x12

    const v29, 0x2fff8

    move v15, v5

    move v14, v8

    move-object v5, v9

    const-wide/16 v8, 0x0

    move-object/from16 v20, v7

    move-wide/from16 v41, v10

    move-object v11, v6

    move-wide/from16 v6, v41

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move/from16 v23, v14

    const-wide/16 v13, 0x0

    move/from16 v25, v15

    const/4 v15, 0x0

    const/16 v27, 0x4

    const/16 v16, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x6

    const-wide/16 v17, 0x0

    const/16 v33, 0x20

    const/16 v19, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move/from16 v38, v25

    const/16 v25, 0x0

    move/from16 v39, v27

    const/16 v27, 0x30

    move/from16 v2, v31

    move-object/from16 v40, v34

    move/from16 v1, v36

    move/from16 v0, v37

    move/from16 v31, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    float-to-double v4, v3

    const-wide/16 v6, 0x0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_d

    const/4 v11, 0x1

    goto :goto_9

    :cond_d
    move v11, v1

    :goto_9
    if-nez v11, :cond_e

    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_e
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v3, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v15, 0x2

    invoke-static {v0, v2, v15}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v6

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    and-int/lit8 v0, v31, 0xe

    const/4 v2, 0x4

    if-eq v0, v2, :cond_11

    and-int/lit8 v0, v31, 0x8

    if-eqz v0, :cond_f

    move-object/from16 v0, p0

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_a

    :cond_f
    move-object/from16 v0, p0

    :cond_10
    move v11, v1

    goto :goto_b

    :cond_11
    move-object/from16 v0, p0

    :goto_a
    const/4 v11, 0x1

    :goto_b
    and-int/lit8 v2, v31, 0x70

    const/16 v14, 0x20

    if-ne v2, v14, :cond_12

    const/4 v2, 0x1

    goto :goto_c

    :cond_12
    move v2, v1

    :goto_c
    or-int/2addr v2, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_14

    move-object/from16 v5, v40

    if-ne v3, v5, :cond_13

    goto :goto_d

    :cond_13
    move-object/from16 v5, p1

    goto :goto_e

    :cond_14
    :goto_d
    new-instance v3, Lx30/j1;

    const/16 v2, 0xd

    move-object/from16 v5, p1

    invoke-direct {v3, v2, v0, v5}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/16 v14, 0x6180

    const/16 v15, 0x1ea

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v16, v13

    invoke-virtual/range {v30 .. v30}, Lwn2/i$c;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    invoke-static {}, Lwn2/f;->c()Lm91/p;

    move-result-object v3

    sget v4, Lm91/p;->b:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v5, v31, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int v7, v4, v5

    const/4 v8, 0x4

    const/4 v4, 0x0

    move-object/from16 v5, p1

    move-object/from16 v6, v16

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    goto :goto_f

    :cond_15
    move-object/from16 v3, p1

    move-object/from16 v13, v16

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v1, 0x1

    goto/16 :goto_19

    :cond_16
    move-object v0, v1

    move/from16 v31, v3

    move-object/from16 v35, v6

    move-object v5, v7

    move v1, v12

    const/16 v14, 0x20

    move-object v3, v2

    const/4 v2, 0x4

    instance-of v4, v0, Lwn2/i$b;

    if-eqz v4, :cond_23

    const v4, -0x6d1e4340

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    new-instance v16, Lsz0/p0$b;

    move-object v4, v0

    check-cast v4, Lwn2/i$b;

    invoke-virtual {v4}, Lwn2/i$b;->c()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_17

    goto :goto_12

    :cond_17
    :goto_11
    move-object/from16 v17, v6

    goto :goto_13

    :cond_18
    :goto_12
    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Luv0/c;->H:I

    const/4 v9, 0x2

    invoke-direct {v6, v7, v15, v9, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_11

    :goto_13
    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lwn2/i$b;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_19

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_1a

    :cond_19
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :cond_1a
    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v6, Luv0/c;->N:I

    const/4 v9, 0x2

    invoke-direct {v7, v6, v15, v9, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v6, v31, 0x70

    if-ne v6, v14, :cond_1b

    const/4 v11, 0x1

    goto :goto_14

    :cond_1b
    move v11, v1

    :goto_14
    and-int/lit8 v9, v31, 0xe

    if-eq v9, v2, :cond_1d

    and-int/lit8 v2, v31, 0x8

    if-eqz v2, :cond_1c

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_15

    :cond_1c
    move v2, v1

    goto :goto_16

    :cond_1d
    :goto_15
    const/4 v2, 0x1

    :goto_16
    or-int/2addr v2, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_1e

    if-ne v8, v5, :cond_1f

    :cond_1e
    new-instance v8, Lwr0/r;

    const/16 v2, 0x1c

    invoke-direct {v8, v3, v0, v2}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v8, Lc93/a;

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lgy0/f;->K:I

    const/4 v9, 0x2

    invoke-direct {v11, v2, v15, v9, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v6, v14, :cond_20

    const/4 v2, 0x1

    goto :goto_17

    :cond_20
    move v2, v1

    :goto_17
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_21

    if-ne v6, v5, :cond_22

    :cond_21
    new-instance v6, Lyk2/i;

    const/4 v2, 0x6

    invoke-direct {v6, v3, v2}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object v12, v6

    check-cast v12, Lc93/a;

    const/high16 v2, 0x30000

    sget v5, Lsz0/p0$b;->h:I

    or-int/2addr v2, v5

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v2, v5

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v5, 0x9

    or-int/2addr v2, v6

    shl-int/lit8 v5, v5, 0x15

    or-int v17, v2, v5

    const/16 v18, 0x6

    const/16 v19, 0xa44

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v5, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v26

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v16

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_23
    sget-object v2, Lwn2/i$f;->a:Lwn2/i$f;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    const v2, -0x1c4af31b

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v4, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v2, Lsz0/p0$c;->f:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v17, v2, v6

    const/16 v18, 0x6

    const/16 v19, 0xbfc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v16

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_24
    instance-of v2, v0, Lwn2/i$e;

    if-eqz v2, :cond_25

    const v2, -0x1c4ad6f3

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    new-instance v4, Lsz0/p0$h;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lln2/a;->f:I

    const/4 v9, 0x2

    invoke-direct {v5, v2, v15, v9, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v2, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v17, v2, v6

    const/16 v18, 0x6

    const/16 v19, 0xbfc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v16

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_25
    sget-object v2, Lwn2/i$d;->a:Lwn2/i$d;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    instance-of v2, v0, Lwn2/i$a;

    if-eqz v2, :cond_26

    goto :goto_18

    :cond_26
    const v0, -0x1c4bd752

    invoke-static {v0, v13, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_27
    :goto_18
    const v2, -0x1c4ab348

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :goto_19
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_28
    move-object v0, v1

    move-object v3, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v35, v8

    :goto_1a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_29

    new-instance v0, Lwr0/f;

    const/16 v6, 0x1b

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v2, v3

    move-object/from16 v3, v35

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final u(Lwn2/i;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 6

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lwn2/i$c;

    invoke-virtual {p0}, Lwn2/i$c;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn2/g;

    invoke-virtual {v0}, Lwn2/g;->a()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lyn2/b$a;->w:Lyn2/b$a;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lyn2/b$b;

    invoke-direct {v3, v1, v0}, Lyn2/b$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Lyn2/b$c;

    invoke-direct {v1, v0, p1}, Lyn2/b$c;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lx1/b;

    const/4 v4, 0x1

    const v5, 0x2fd4df92

    invoke-direct {v0, v1, v4, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v1, p2

    check-cast v1, Ln0/f;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3, v0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lwn2/i;)Ll83/a0;
    .locals 0

    check-cast p1, Lwn2/i$b;

    invoke-virtual {p1}, Lwn2/i$b;->b()Lwn2/e$i;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lwn2/e$a;->a:Lwn2/e$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyn2/b;->t(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
