.class public final Lcom/whoop/changepassword/view/reset/PasswordResetFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0013\u001a\u0004\u0008(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u0013\u001a\u0004\u0008-\u0010.\u00a8\u00062\u00b2\u0006\u000c\u00101\u001a\u0002008\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/changepassword/view/reset/PasswordResetFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "L",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Leo0/h;",
        "w",
        "Ll83/h;",
        "I",
        "()Leo0/h;",
        "screenArgs",
        "Lbo0/b;",
        "x",
        "K",
        "()Lbo0/b;",
        "viewModel",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lz92/a;",
        "z",
        "J",
        "()Lz92/a;",
        "userInfoAccessor",
        "Lo02/d;",
        "E",
        "H",
        "()Lo02/d;",
        "navigationReducer",
        "Ltn0/b;",
        "F",
        "G",
        "()Ltn0/b;",
        "changePasswordAnalytics",
        "Lbo0/c;",
        "viewState",
        "change-password_release"
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Leo0/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Leo0/d;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->w:Ll83/h;

    new-instance v1, Leo0/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Leo0/d;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    new-instance v2, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$f;

    invoke-direct {v2, p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$f;-><init>(Landroid/content/ComponentCallbacks;)V

    new-instance v3, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$g;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v2, v1}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->x:Ll83/h;

    new-instance v0, Leo0/d;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Leo0/d;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$b;

    invoke-direct {v2, p0, v4, v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$c;

    invoke-direct {v0, p0, v4, v4}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$d;

    invoke-direct {v0, p0, v4, v4}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->E:Ll83/h;

    new-instance v0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$e;

    invoke-direct {v0, p0, v4, v4}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->F:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->N(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->R(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Leo0/h;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->T(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Leo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->M(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->P(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->U(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final G()Ltn0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltn0/b;

    return-object v0
.end method

.method private final H()Lo02/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo02/d;

    return-object v0
.end method

.method private final I()Leo0/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo0/h;

    return-object v0
.end method

.method private final J()Lz92/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/a;

    return-object v0
.end method

.method private final L()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method private static final M(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object v1

    invoke-virtual {v1}, Lbo0/b;->getViewState()Lec3/l;

    move-result-object v5

    new-instance v6, Lbo0/c;

    const/16 v21, 0x7ff

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v22}, Lbo0/c;-><init>(Ljava/lang/String;Ljava/util/List;ZZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_1

    new-instance v9, Lyn0/c;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v10

    invoke-direct {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->J()Lz92/a;

    move-result-object v11

    invoke-direct {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->getNavigator()Lj02/o0;

    move-result-object v12

    invoke-direct {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->H()Lo02/d;

    move-result-object v13

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lyn0/c;-><init>(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v9

    :cond_1
    check-cast v2, Lyn0/c;

    invoke-virtual {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object v6

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_2

    if-ne v9, v5, :cond_3

    :cond_2
    new-instance v9, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$a;

    const/4 v7, 0x0

    invoke-direct {v9, v0, v2, v7}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment$a;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Lyn0/c;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v9, Lc93/m;

    invoke-static {v8, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_4

    if-ne v6, v5, :cond_5

    :cond_4
    new-instance v6, Leo0/d;

    const/4 v2, 0x3

    invoke-direct {v6, v0, v2}, Leo0/d;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lc93/a;

    invoke-static {v6, v4, v8, v4, v3}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v1}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->O(Lp1/t2;)Lbo0/c;

    move-result-object v1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    if-ne v3, v5, :cond_7

    :cond_6
    new-instance v3, Leo0/e;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Leo0/e;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    if-ne v3, v5, :cond_9

    :cond_8
    new-instance v3, Leo0/d;

    const/4 v2, 0x4

    invoke-direct {v3, v0, v2}, Leo0/d;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, v3

    check-cast v7, Lc93/a;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_a

    if-ne v3, v5, :cond_b

    :cond_a
    new-instance v3, Leo0/e;

    const/4 v2, 0x1

    invoke-direct {v3, v0, v2}, Leo0/e;-><init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v5, v1

    move-object v9, v8

    move-object v8, v3

    invoke-static/range {v5 .. v11}, Leo0/g;->M(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(Lp1/t2;)Lbo0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lbo0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbo0/c;

    return-object p0
.end method

.method private static final P(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object p0

    sget-object v0, Lbo0/a$a;->a:Lbo0/a$a;

    invoke-virtual {p0, v0}, Lbo0/b;->p(Lbo0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Lbo0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbo0/b;->p(Lbo0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object p0

    sget-object v0, Lbo0/a$a;->a:Lbo0/a$a;

    invoke-virtual {p0, v0}, Lbo0/b;->p(Lbo0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Ltn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->G()Ltn0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Ltn0/b;->a(Ltn0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Leo0/h;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    invoke-static {p0}, Leo0/i;->a(Landroid/os/Bundle;)Leo0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final U(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->I()Leo0/h;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Lbo0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->Q(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Lbo0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Ltn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->S(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Ltn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final K()Lbo0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo0/b;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->L()V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->K()Lbo0/b;

    move-result-object p1

    sget-object v0, Lbo0/a$e;->a:Lbo0/a$e;

    invoke-virtual {p1, v0}, Lbo0/b;->p(Lbo0/a;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x7a107e0c

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
