.class public final Lcom/whoop/profile/view/ProfileScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a_\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0016\u001a+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001c\u001a+\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003\u00a2\u0006\u0004\u0008 \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\"\u00a2\u0006\u0004\u0008#\u0010$\u001a?\u0010(\u001a\u00020\u000e2\u0008\u0008\u0002\u0010%\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0008\u0008\u0002\u0010\'\u001a\u00020&H\u0001\u00a2\u0006\u0004\u0008(\u0010)\u001a\u0013\u0010,\u001a\u00020+*\u00020*H\u0002\u00a2\u0006\u0004\u0008,\u0010-\"\u0014\u0010.\u001a\u00020&8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\"\u0014\u00100\u001a\u00020&8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u00080\u0010/\"\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010/\u00a8\u00068\u00b2\u0006\u000c\u00104\u001a\u0002038\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\'\u001a\u00020&8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u00107\u001a\u0002058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
        "navRouter",
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "actionRouter",
        "Ltr2/n;",
        "logger",
        "",
        "source",
        "",
        "targetUserId",
        "communityId",
        "educationType",
        "Landroidx/fragment/app/r0;",
        "activity",
        "Ll83/a0;",
        "ProfileScreen",
        "(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "onEvent",
        "(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkd1/o;",
        "image",
        "EntitlementLogo",
        "(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "SettingsIcon",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "ProfileOverflowMenu",
        "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "dialogState",
        "ProfileReportDialog",
        "(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "entitlementImageEffect",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "scrollOffset",
        "ProfileToolbar",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;",
        "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
        "toMembershipAnalyticsProperties",
        "(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
        "TRANSITIONSTART",
        "F",
        "TRANSITIONEND",
        "Ly3/f;",
        "TOOLBAR_ICON_TOUCH_AREA_SIZE",
        "Lcom/whoop/profile/presentation/ProfileViewModel;",
        "viewModel",
        "",
        "hasLoggedScreenView",
        "isMenuExpanded",
        "profile_release"
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
.field private static final TOOLBAR_ICON_TOUCH_AREA_SIZE:F

.field public static final TRANSITIONEND:F = 200.0f

.field public static final TRANSITIONSTART:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lcom/whoop/profile/view/ProfileScreenKt;->TOOLBAR_ICON_TOUCH_AREA_SIZE:F

    return-void
.end method

.method private static final EntitlementLogo(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v1, -0x61d57cee

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v8, 0x2

    const/4 v9, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v9

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v2, v7, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_4

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v10, 0x1

    if-eq v2, v4, :cond_5

    move v2, v10

    goto :goto_4

    :cond_5
    move v2, v5

    :goto_4
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v15, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, -0x2

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v11, v4

    mul-float/2addr v2, v11

    const-wide/high16 v12, -0x4020000000000000L    # -0.5

    double-to-float v4, v12

    mul-float/2addr v4, v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v2, v4}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/profile/view/ProfileScreenKt;->entitlementImageEffect(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v4, v1, 0x70

    if-ne v4, v3, :cond_6

    move v3, v10

    goto :goto_5

    :cond_6
    move v3, v5

    :goto_5
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lbf0/a;

    const/16 v3, 0x1c

    invoke-direct {v4, v6, v3}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lc93/a;

    const/4 v3, 0x3

    const/4 v13, 0x0

    invoke-static {v2, v5, v13, v4, v3}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    invoke-static {v4, v15, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lkd1/o;->a:I

    and-int/lit8 v1, v1, 0xe

    or-int v4, v2, v1

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v15

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    sget v2, Lcom/whoop/profile/R$string;->profile_entitlement_logo_content_description:I

    invoke-static {v15, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    int-to-float v3, v9

    mul-float/2addr v11, v3

    int-to-float v4, v8

    mul-float/2addr v4, v3

    invoke-static {v12, v11, v4}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v16, 0x6180

    const/16 v17, 0x68

    const/4 v11, 0x0

    sget-object v12, Ly2/j;->b:Ly2/b1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v1

    move-object v9, v2

    move v1, v10

    move-object v10, v3

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lce2/b;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v6, v7, v3}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final EntitlementLogo$lambda$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    sget-object v1, Lcom/whoop/profile/presentation/NavigateToAccountViewState;->INSTANCE:Lcom/whoop/profile/presentation/NavigateToAccountViewState;

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;-><init>(Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EntitlementLogo$lambda$2(Lkd1/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->EntitlementLogo(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x22510626

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v10, 0x4

    const/4 v11, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v10

    goto :goto_0

    :cond_0
    move v2, v11

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v12, 0x1

    const/4 v4, 0x0

    if-eq v3, v11, :cond_2

    move v3, v12

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/2addr v2, v12

    invoke-virtual {v6, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_3

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v13, v2

    check-cast v13, Lp1/c1;

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v6, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v6, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lcom/whoop/profile/view/ProfileScreenKt;->TOOLBAR_ICON_TOUCH_AREA_SIZE:F

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v14, Lny0/o;

    sget-object v15, Lny0/q$a;->f:Lny0/q$a;

    sget-object v2, Lgz0/m0;->DOT_MENU:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v16

    const/16 v25, 0x3fc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lcom/whoop/profile/R$string;->profile_more_menu_content_description:I

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_7

    new-instance v5, Lb01/m;

    const/16 v3, 0x10

    invoke-direct {v5, v3, v13}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lc93/a;

    sget v3, Lny0/o;->k:I

    or-int/lit16 v8, v3, 0x6180

    const/16 v9, 0x8

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    move-object v3, v2

    move-object v2, v14

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lg1/c1;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->v()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    const/16 v21, 0x1fdf

    const-wide/16 v15, 0x0

    invoke-static/range {v14 .. v21}, Lg1/c1;->a(Lg1/c1;JJJI)Lg1/c1;

    move-result-object v2

    sget-object v3, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/l5;

    int-to-float v4, v11

    int-to-float v5, v10

    mul-float/2addr v4, v5

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-static {v3, v6, v4, v5}, Lg1/l5;->a(Lg1/l5;Lt0/i;Lt0/i;I)Lg1/l5;

    move-result-object v4

    new-instance v3, Lcom/whoop/profile/view/f;

    const/4 v5, 0x0

    invoke-direct {v3, v13, v0, v5}, Lcom/whoop/profile/view/f;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    const v5, 0x4b437734    # 1.2810036E7f

    invoke-static {v5, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    move-object v6, v7

    const/16 v7, 0xc00

    const/4 v8, 0x2

    const/4 v3, 0x0

    invoke-static/range {v2 .. v8}, Lio/sentry/config/a;->g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v6

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    move-object v7, v6

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lcd0/a;

    const/4 v4, 0x4

    invoke-direct {v3, v0, v1, v4}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final ProfileOverflowMenu$lambda$1(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final ProfileOverflowMenu$lambda$2(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final ProfileOverflowMenu$lambda$3$0$0(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$1(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$2(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu$lambda$3$1(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$1(Lp1/c1;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_1

    new-instance p2, Lb01/m;

    const/16 p3, 0x11

    invoke-direct {p2, p3, p0}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p2

    check-cast v2, Lc93/a;

    new-instance p2, Lcom/whoop/profile/view/e;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p0, p3}, Lcom/whoop/profile/view/e;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    const p0, 0x76c42061

    invoke-static {p0, v9, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x180030

    const/16 v11, 0x3c

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu$lambda$3$1$0$0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$2(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu$lambda$3$1$1(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string v0, "$this$DropdownMenu"

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

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_2

    :cond_1
    new-instance p3, Lbs1/i;

    const/4 p2, 0x4

    invoke-direct {p3, p0, p1, p2}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v0, p3

    check-cast v0, Lc93/a;

    sget-object p0, Lcom/whoop/profile/view/ComposableSingletons$ProfileScreenKt;->INSTANCE:Lcom/whoop/profile/view/ComposableSingletons$ProfileScreenKt;

    invoke-virtual {p0}, Lcom/whoop/profile/view/ComposableSingletons$ProfileScreenKt;->getLambda$2006682372$profile_release()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    const/high16 v6, 0x30000

    const/16 v7, 0x1e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f0;->b(Lc93/a;Landroidx/compose/ui/Modifier;ZLl0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu$lambda$3$1$1$0$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$2(Lp1/c1;Z)V

    sget-object p1, Lcom/whoop/profile/presentation/ProfileEvent$Report;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Report;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileOverflowMenu$lambda$4(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileReportDialog(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x605f772b

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    if-eq v5, v7, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v3, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    move v5, v4

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move v7, v5

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getPrimaryActionText()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getPrimaryActionColor()Ly81/e;

    move-result-object v11

    if-nez v11, :cond_5

    sget-object v11, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getSecondaryActionText()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move v13, v7

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getUseSolidButtons()Z

    move-result v7

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getShowCloseIcon()Z

    move-result v15

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getTopDialogStyle()Lj11/p;

    move-result-object v16

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    and-int/lit8 v13, v13, 0x70

    if-ne v13, v6, :cond_6

    const/16 v17, 0x1

    goto :goto_4

    :cond_6
    const/16 v17, 0x0

    :goto_4
    or-int v14, v14, v17

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v14, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    new-instance v8, Lcom/whoop/profile/view/d;

    const/4 v14, 0x0

    invoke-direct {v8, v0, v1, v14}, Lcom/whoop/profile/view/d;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v25, v8

    check-cast v25, Lc93/a;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-ne v13, v6, :cond_9

    const/16 v17, 0x1

    goto :goto_5

    :cond_9
    const/16 v17, 0x0

    :goto_5
    or-int v6, v8, v17

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_a

    if-ne v8, v9, :cond_b

    :cond_a
    new-instance v8, Lcom/whoop/profile/view/d;

    const/4 v6, 0x1

    invoke-direct {v8, v0, v1, v6}, Lcom/whoop/profile/view/d;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v27, v8

    check-cast v27, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v6, 0x3

    shl-int/lit8 v9, v6, 0x6

    or-int/2addr v8, v9

    shl-int/lit8 v9, v6, 0x9

    or-int/2addr v8, v9

    shl-int/lit8 v6, v6, 0x1b

    or-int v32, v8, v6

    const/16 v34, 0x0

    const v35, 0xebfcdc1

    move-object/from16 v31, v3

    const/4 v3, 0x0

    const/4 v9, 0x0

    move-object v6, v10

    const/4 v10, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    invoke-static/range {v3 .. v35}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    goto :goto_6

    :cond_c
    move-object/from16 v31, v3

    invoke-virtual/range {v31 .. v31}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v31 .. v31}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, Lce2/b;

    const/16 v5, 0x9

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final ProfileReportDialog$lambda$0$0(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getDismissEvent()Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileReportDialog$lambda$1$0(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->getApproveEvent()Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileReportDialog$lambda$2(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileReportDialog(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileScreen(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move/from16 v9, p9

    const-string v0, "navRouter"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v10, p2

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    move-object/from16 v14, p8

    check-cast v14, Lp1/q;

    const v0, 0x66c41b63

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p10, 0x8

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0xc00

    :cond_4
    move-object/from16 v5, p3

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v9, 0xc00

    if-nez v5, :cond_4

    move-object/from16 v5, p3

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_3

    :cond_6
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p10, 0x10

    if-eqz v6, :cond_8

    or-int/lit16 v0, v0, 0x6000

    :cond_7
    move-object/from16 v11, p4

    goto :goto_6

    :cond_8
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_7

    move-object/from16 v11, p4

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x4000

    goto :goto_5

    :cond_9
    const/16 v12, 0x2000

    :goto_5
    or-int/2addr v0, v12

    :goto_6
    and-int/lit8 v12, p10, 0x20

    const/high16 v15, 0x30000

    if-eqz v12, :cond_b

    or-int/2addr v0, v15

    :cond_a
    move-object/from16 v15, p5

    goto :goto_8

    :cond_b
    and-int/2addr v15, v9

    if-nez v15, :cond_a

    move-object/from16 v15, p5

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_c
    const/high16 v16, 0x10000

    :goto_7
    or-int v0, v0, v16

    :goto_8
    and-int/lit8 v16, p10, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_d

    or-int v0, v0, v17

    move-object/from16 v4, p6

    goto :goto_a

    :cond_d
    and-int v17, v9, v17

    move-object/from16 v4, p6

    if-nez v17, :cond_f

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v17, 0x80000

    :goto_9
    or-int v0, v0, v17

    :cond_f
    :goto_a
    const/high16 v17, 0xc00000

    and-int v17, v9, v17

    if-nez v17, :cond_11

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v17, 0x400000

    :goto_b
    or-int v0, v0, v17

    :cond_11
    const v17, 0x492413

    and-int v13, v0, v17

    const v7, 0x492412

    const/4 v15, 0x0

    if-eq v13, v7, :cond_12

    const/4 v7, 0x1

    goto :goto_c

    :cond_12
    move v7, v15

    :goto_c
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v14, v13, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_34

    if-eqz v3, :cond_13

    .line 2
    const-string v3, "unknown_source"

    move-object v4, v3

    goto :goto_d

    :cond_13
    move-object v4, v5

    :goto_d
    if-eqz v6, :cond_14

    const/4 v5, 0x0

    goto :goto_e

    :cond_14
    move-object v5, v11

    :goto_e
    if-eqz v12, :cond_15

    const/4 v6, 0x0

    goto :goto_f

    :cond_15
    move-object/from16 v6, p5

    :goto_f
    if-eqz v16, :cond_16

    const/16 v20, 0x0

    goto :goto_10

    :cond_16
    move-object/from16 v20, p6

    :goto_10
    const v7, 0xe000

    and-int/2addr v7, v0

    const/16 v11, 0x4000

    if-ne v7, v11, :cond_17

    const/4 v7, 0x1

    goto :goto_11

    :cond_17
    move v7, v15

    :goto_11
    const/high16 v11, 0x70000

    and-int/2addr v11, v0

    const/high16 v12, 0x20000

    if-ne v11, v12, :cond_18

    const/4 v11, 0x1

    goto :goto_12

    :cond_18
    move v11, v15

    :goto_12
    or-int/2addr v7, v11

    .line 3
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    .line 4
    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_19

    if-ne v11, v12, :cond_1a

    .line 5
    :cond_19
    new-instance v11, Lcom/whoop/profile/view/g;

    const/4 v7, 0x0

    invoke-direct {v11, v5, v6, v7}, Lcom/whoop/profile/view/g;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 6
    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 7
    :cond_1a
    check-cast v11, Lc93/a;

    const v7, -0x649fae96

    invoke-virtual {v14, v7}, Lp1/q;->f0(I)V

    .line 8
    sget-object v7, Lpf3/a;->b:Lnf3/a;

    const-string v13, "KoinApplication has not been started"

    if-eqz v7, :cond_33

    .line 9
    iget-object v7, v7, Lnf3/a;->a:Lwf3/a;

    .line 10
    iget-object v7, v7, Lwf3/a;->d:Lxf3/c;

    const v3, -0x649fad62

    move-object/from16 p4, v13

    const v13, -0x384098

    .line 11
    invoke-static {v14, v3, v14, v15, v13}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v3

    const/4 v13, 0x0

    .line 12
    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    .line 13
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v16, :cond_1c

    if-ne v15, v12, :cond_1b

    goto :goto_14

    :cond_1b
    move-object/from16 v18, v4

    :goto_13
    const/4 v3, 0x0

    goto :goto_15

    .line 14
    :cond_1c
    :goto_14
    sget-object v15, Ll83/i;->y:Ll83/i;

    move-object/from16 v18, v4

    new-instance v4, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;

    invoke-direct {v4, v7, v13, v11, v3}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v15, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v15

    .line 15
    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_13

    .line 16
    :goto_15
    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    .line 17
    move-object v4, v15

    check-cast v4, Ll83/h;

    .line 18
    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    .line 19
    invoke-static {v4}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/ProfileViewModel;->getViewState()Lec3/l;

    move-result-object v11

    .line 20
    new-instance v21, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v22, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object v7, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v7}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v23

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v22 .. v28}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v28, 0x3d

    const/16 v29, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v21 .. v29}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v15, 0x0

    const/16 v16, 0x2

    const/4 v13, 0x0

    move v9, v3

    move-object v7, v12

    move-object/from16 v12, v21

    const/16 v19, 0x1

    move-object/from16 v3, p4

    .line 21
    invoke-static/range {v11 .. v16}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v11

    .line 22
    invoke-static {v4}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object v12

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    .line 23
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_1e

    if-ne v15, v7, :cond_1d

    goto :goto_16

    :cond_1d
    const/4 v13, 0x0

    goto :goto_17

    .line 24
    :cond_1e
    :goto_16
    new-instance v15, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$1$1;

    const/4 v13, 0x0

    invoke-direct {v15, v4, v13}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$1$1;-><init>(Ll83/h;Lq83/d;)V

    .line 25
    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 26
    :goto_17
    check-cast v15, Lc93/m;

    invoke-static {v14, v15, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-array v12, v9, [Ljava/lang/Object;

    .line 27
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v7, :cond_1f

    .line 28
    new-instance v15, Lcom/whoop/design/models/modal/a;

    const/16 v13, 0xa

    invoke-direct {v15, v13}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    .line 29
    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 30
    :cond_1f
    check-cast v15, Lc93/a;

    const/16 v13, 0x30

    invoke-static {v12, v15, v14, v13}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lp1/c1;

    .line 31
    invoke-static {v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v13

    invoke-static {v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    and-int/lit16 v9, v0, 0x1c00

    move/from16 v21, v0

    const/16 v0, 0x800

    if-ne v9, v0, :cond_20

    move/from16 v0, v19

    goto :goto_18

    :cond_20
    const/4 v0, 0x0

    :goto_18
    or-int v0, v16, v0

    .line 32
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_22

    if-ne v9, v7, :cond_21

    goto :goto_19

    :cond_21
    move-object/from16 p3, v11

    move-object v11, v4

    move-object/from16 v4, p3

    move-object v0, v3

    move-object/from16 p3, v5

    move-object/from16 v22, v6

    move-object v12, v7

    move-object/from16 v7, v18

    move-object v3, v2

    move-object v2, v9

    const/4 v9, 0x0

    goto :goto_1a

    .line 33
    :cond_22
    :goto_19
    new-instance v2, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;

    move-object v0, v7

    const/4 v7, 0x0

    move-object/from16 p3, v5

    move-object/from16 v22, v6

    move-object v6, v11

    move-object v5, v12

    const/4 v9, 0x0

    move-object v12, v0

    move-object v0, v3

    move-object v11, v4

    move-object/from16 v4, v18

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;-><init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Ljava/lang/String;Lp1/c1;Lp1/t2;Lq83/d;)V

    move-object v7, v4

    move-object v4, v6

    .line 34
    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 35
    :goto_1a
    check-cast v2, Lc93/m;

    invoke-static {v13, v15, v2, v14}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    .line 36
    invoke-static {v4}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v2

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 37
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_23

    if-ne v6, v12, :cond_24

    .line 38
    :cond_23
    new-instance v6, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$3$1;

    invoke-direct {v6, v4, v8, v9}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$3$1;-><init>(Lp1/t2;Landroidx/fragment/app/r0;Lq83/d;)V

    .line 39
    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 40
    :cond_24
    check-cast v6, Lc93/m;

    invoke-static {v14, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x3636f461

    .line 41
    invoke-virtual {v14, v2}, Lp1/q;->f0(I)V

    .line 42
    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_32

    .line 43
    iget-object v0, v2, Lnf3/a;->a:Lwf3/a;

    .line 44
    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const v2, -0x384098

    .line 45
    invoke-virtual {v14, v2}, Lp1/q;->f0(I)V

    .line 46
    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    .line 47
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_26

    if-ne v5, v12, :cond_25

    goto :goto_1c

    :cond_25
    :goto_1b
    const/4 v0, 0x0

    goto :goto_1d

    .line 48
    :cond_26
    :goto_1c
    const-class v2, Lfi0/a;

    .line 49
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    .line 50
    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    .line 51
    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1b

    .line 52
    :goto_1d
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    .line 53
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    .line 54
    move-object v13, v5

    check-cast v13, Lfi0/a;

    .line 55
    invoke-static {v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object v0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 56
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_28

    if-ne v2, v12, :cond_27

    goto :goto_1e

    :cond_27
    move-object v15, v4

    goto :goto_1f

    .line 57
    :cond_28
    :goto_1e
    new-instance v0, Lcom/whoop/profile/view/ProfileScreenEventRouter;

    .line 58
    invoke-static {v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v15, v4

    const/4 v4, 0x0

    move-object/from16 v30, v3

    move-object v3, v1

    move-object/from16 v1, v30

    .line 59
    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/view/ProfileScreenEventRouter;-><init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v3

    .line 60
    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    .line 61
    :goto_1f
    move-object v0, v2

    check-cast v0, Lcom/whoop/profile/view/ProfileScreenEventRouter;

    .line 62
    invoke-static {v15}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState;->getPendingNavigation()Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    move-result-object v2

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v14, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 63
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_29

    if-ne v4, v12, :cond_2a

    .line 64
    :cond_29
    new-instance v4, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$4$1;

    invoke-direct {v4, v15, v1, v11, v9}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$4$1;-><init>(Lp1/t2;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Ll83/h;Lq83/d;)V

    .line 65
    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 66
    :cond_2a
    check-cast v4, Lc93/m;

    invoke-static {v14, v4, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 67
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    .line 68
    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 69
    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    .line 70
    invoke-static {v3, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    .line 71
    iget-wide v4, v14, Lp1/q;->T:J

    .line 72
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    .line 73
    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    .line 74
    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 75
    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    sget-object v6, La3/k;->b:La3/j;

    .line 77
    invoke-virtual {v14}, Lp1/q;->i0()V

    .line 78
    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_2b

    .line 79
    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    .line 80
    :cond_2b
    invoke-virtual {v14}, Lp1/q;->s0()V

    .line 81
    :goto_20
    sget-object v6, La3/k;->g:La3/i;

    .line 82
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 83
    sget-object v3, La3/k;->f:La3/i;

    .line 84
    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 85
    sget-object v3, La3/k;->j:La3/i;

    .line 86
    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_2c

    .line 87
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    .line 88
    :cond_2c
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    .line 89
    :cond_2d
    sget-object v3, La3/k;->d:La3/i;

    .line 90
    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 91
    invoke-static {v15}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v1

    .line 92
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    .line 93
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2e

    if-ne v3, v12, :cond_2f

    .line 94
    :cond_2e
    new-instance v3, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$5$1$1;

    invoke-direct {v3, v0}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$5$1$1;-><init>(Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 96
    :cond_2f
    check-cast v3, Lj93/g;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v2, v21, 0xf

    and-int/lit8 v5, v2, 0x70

    const/4 v6, 0x0

    move-object v4, v14

    move-object/from16 v2, v20

    .line 97
    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 98
    invoke-static {v15}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/ProfileViewState;->getDesignModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v11

    .line 99
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    .line 100
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_30

    if-ne v3, v12, :cond_31

    .line 101
    :cond_30
    new-instance v3, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$5$2$1;

    invoke-direct {v3, v0}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$5$2$1;-><init>(Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 103
    :cond_31
    check-cast v3, Lj93/g;

    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 104
    sget v18, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    const/16 v19, 0x34

    move-object v5, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v14

    move-object v14, v5

    .line 105
    invoke-static/range {v11 .. v19}, La81/o;->P(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v17

    const/4 v0, 0x1

    .line 106
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, p3

    move-object v4, v7

    move-object/from16 v6, v22

    move-object v7, v2

    goto :goto_21

    .line 107
    :cond_32
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_33
    move-object v0, v13

    .line 108
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 109
    :cond_34
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object v4, v5

    move-object v5, v11

    .line 110
    :goto_21
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_35

    new-instance v0, Lb90/b;

    const/4 v11, 0x5

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p9

    move-object v3, v10

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lb90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 111
    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_35
    return-void
.end method

.method public static final ProfileScreen(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x687377f3

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v15, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_6

    :cond_8
    move v7, v15

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    move/from16 v16, v5

    move-object v5, v2

    move/from16 v2, v16

    goto :goto_7

    :cond_9
    move v2, v5

    move-object v5, v3

    .line 121
    :goto_7
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_b

    .line 122
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_a

    .line 123
    new-instance v2, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v6, 0x15

    invoke-direct {v2, v6}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    .line 124
    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 125
    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v2, v6

    .line 126
    :goto_8
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_c

    const/4 v3, 0x0

    .line 127
    invoke-static {v3, v12}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v6

    .line 128
    :cond_c
    check-cast v6, Lp1/c1;

    .line 129
    new-instance v3, La80/f;

    const/16 v7, 0x8

    invoke-direct {v3, v1, v2, v6, v7}, La80/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v6, 0x379be1aa

    invoke-static {v6, v12, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    and-int/lit8 v6, v0, 0xe

    or-int/lit8 v6, v6, 0x30

    .line 130
    invoke-static {v1, v3, v12, v6}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 131
    invoke-virtual {v1}, Lcom/whoop/profile/presentation/ProfileViewState;->getPopUpDialog()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    move-result-object v3

    if-nez v3, :cond_d

    const v3, 0x154a5088

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    .line 132
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v6, 0x154a5089

    .line 133
    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    shr-int/lit8 v6, v0, 0x3

    and-int/lit8 v6, v6, 0x70

    .line 134
    invoke-static {v3, v2, v12, v6}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileReportDialog(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 135
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    .line 136
    :goto_9
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    .line 137
    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    .line 138
    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    if-eqz v5, :cond_e

    const v3, 0x154da050

    .line 139
    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v13, v0, 0xe

    const/16 v14, 0x7e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 140
    invoke-static/range {v5 .. v14}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v5

    .line 141
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    move-object v0, v5

    .line 142
    const-string v5, "profile-achievements-overlay"

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    const v3, 0x154fc3c7

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    const/16 v14, 0x7e

    .line 143
    const-string v5, "OVERLAY_ACHIEVEMENTS_PROFILE"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v14}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    .line 144
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v3, 0x15514a2f

    .line 145
    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    .line 146
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_a
    move-object v3, v2

    move-object v2, v0

    goto :goto_b

    .line 147
    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    .line 148
    :goto_b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lc41/d1;

    const/16 v6, 0x11

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 149
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final ProfileScreen$lambda$0$0(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lcom/whoop/profile/presentation/ProfileViewModel;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/presentation/ProfileViewModel;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$12(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$13$0(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$15(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final ProfileScreen$lambda$16(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final ProfileScreen$lambda$17(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v3, p3

    const-string v0, "onOpenBottomSheet"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p5, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p5

    :goto_1
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v1, v2, :cond_2

    move v1, v9

    goto :goto_2

    :cond_2
    move v1, v8

    :goto_2
    and-int/lit8 v2, v0, 0x1

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v14, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v14, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState;->getFullScreenModal()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    move-result-object v1

    if-eqz v1, :cond_6

    const v0, 0x2d4f7cff

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState;->getFullScreenModal()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    move-result-object v0

    move-object/from16 v12, p1

    invoke-static {v0, v12, v14, v8}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move-object/from16 v12, p1

    const v1, 0x2d530499

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    move v1, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState;->getScreenContent()Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    move-result-object v0

    move v2, v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_7

    new-instance v4, Laq1/d;

    const/16 v5, 0xb

    move-object/from16 v11, p2

    invoke-direct {v4, v5, v11}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    move-object/from16 v11, p2

    :goto_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v2, v2, 0x9

    and-int/lit16 v2, v2, 0x1c00

    or-int/lit16 v6, v2, 0x6000

    const/4 v7, 0x0

    move-object v2, v12

    move-object v5, v14

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Lb2/e;->x:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v10, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$15(Lp1/c1;)F

    move-result v13

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    invoke-static/range {v10 .. v16}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ProfileScreen$lambda$17$0$0$0(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$16(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$19(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/profile/presentation/ProfileViewState;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/presentation/ProfileViewState;

    return-object p0
.end method

.method private static final ProfileScreen$lambda$4$0()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final ProfileScreen$lambda$5(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final ProfileScreen$lambda$6(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final ProfileToolbar(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/profile/presentation/ProfileViewState;",
            "Lkotlin/jvm/functions/Function1;",
            "F",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x5a7b1e26

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move/from16 v9, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_7

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_4

    :cond_9
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit16 v10, v4, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    const/4 v15, 0x1

    if-eq v10, v11, :cond_a

    move v10, v15

    goto :goto_6

    :cond_a
    move v10, v13

    :goto_6
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1a

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_b

    move-object v1, v10

    :cond_b
    const/4 v0, 0x0

    if-eqz v6, :cond_c

    move/from16 v16, v0

    goto :goto_7

    :cond_c
    move/from16 v16, v9

    :goto_7
    sub-float v6, v16, v0

    const/high16 v9, 0x43480000    # 200.0f

    div-float/2addr v6, v9

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v6, v0, v9}, Le93/b;->m(FFF)F

    move-result v6

    const-wide v17, 0xff283339L

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Li2/x;->i(J)F

    move-result v11

    mul-float/2addr v11, v6

    invoke-static/range {v17 .. v18}, Li2/x;->h(J)F

    move-result v14

    mul-float/2addr v14, v6

    invoke-static/range {v17 .. v18}, Li2/x;->f(J)F

    move-result v17

    mul-float v8, v17, v6

    invoke-static {v11, v14, v8, v6, v7}, Li2/w0;->f(FFFFI)J

    move-result-wide v6

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    const v11, 0x57d41a9a

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    sget-object v11, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v12}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v11

    iget-object v11, v11, Ll0/c2;->g:Ll0/b;

    invoke-virtual {v11}, Ll0/b;->e()Lv4/b;

    move-result-object v11

    iget v11, v11, Lv4/b;->b:I

    invoke-interface {v8, v11}, Ly3/c;->e0(I)F

    move-result v8

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    float-to-double v13, v8

    const-wide/high16 v17, 0x3ff8000000000000L    # 1.5

    mul-double v13, v13, v17

    double-to-float v8, v13

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v13}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    neg-float v14, v8

    invoke-static {v13, v0, v14, v15}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v6, v7, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v6, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    invoke-static {v7, v12, v7, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v0, v9, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object v15, v1

    move-object v9, v11

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-eqz v5, :cond_10

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v12, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v1, v12, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v12, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getEntitlementImage()Lkd1/o;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_a

    :cond_13
    move-object v0, v1

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getShowSettingsButton()Z

    move-result v2

    if-eqz v2, :cond_14

    const v0, -0x47addfa7

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lcom/whoop/profile/view/h;

    const/4 v11, 0x0

    invoke-direct {v0, v3, v11}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v1, 0x1c93a8a4

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_b
    move-object/from16 v28, v1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_14
    if-eqz v0, :cond_15

    const v1, -0x47ac0744

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    new-instance v1, La0;

    const/16 v2, 0x12

    invoke-direct {v1, v2, v0, v3}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd71bd9b

    invoke-static {v0, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    const/4 v11, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v0

    if-nez v0, :cond_16

    const v0, -0x47a9a1ce

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lcom/whoop/profile/view/h;

    const/4 v1, 0x1

    invoke-direct {v0, v3, v1}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v1, 0x3414e81c

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_16
    const v0, -0x47a808c1

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v18, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v0, Lcom/whoop/profile/R$string;->profile_title:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    sget-object v0, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    sget v0, Luv0/c;->E:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v22

    const v35, 0xfdf2

    const/16 v36, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v18 .. v36}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v4, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_17

    const/4 v0, 0x1

    goto :goto_d

    :cond_17
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_18

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_19

    :cond_18
    new-instance v1, Lcom/whoop/profile/view/i;

    const/4 v11, 0x0

    invoke-direct {v1, v3, v11}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v9, v1

    check-cast v9, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v13, v0, 0x6

    const/16 v14, 0x34

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, v18

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object v1, v15

    move/from16 v4, v16

    goto :goto_e

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move v4, v9

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Lcom/whoop/profile/view/j;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/j;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;FIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final ProfileToolbar$lambda$1$0$1(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, v2}, Lcom/whoop/profile/view/ProfileScreenKt;->SettingsIcon(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileToolbar$lambda$1$0$2(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    sget p3, Lkd1/o;->a:I

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->EntitlementLogo(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileToolbar$lambda$1$0$3(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, v2}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileToolbar$lambda$1$0$4$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileToolbar$lambda$2(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final SettingsIcon(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x33b72498    # -5.265347E7f

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-eq v5, v3, :cond_2

    move v3, v8

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v7, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    sget v5, Lcom/whoop/profile/view/ProfileScreenKt;->TOOLBAR_ICON_TOUCH_AREA_SIZE:F

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v9, Lny0/o;

    sget-object v10, Lny0/q$a;->f:Lny0/q$a;

    sget-object v5, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v11

    const/16 v20, 0x3fc

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v9 .. v21}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v5, Lcom/whoop/profile/R$string;->profile_settings_content_description:I

    invoke-static {v7, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v4, :cond_3

    move v6, v8

    :cond_3
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_5

    :cond_4
    new-instance v2, Lbf0/a;

    const/16 v4, 0x1d

    invoke-direct {v2, v0, v4}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v2

    check-cast v6, Lc93/a;

    sget v2, Lny0/o;->k:I

    or-int/lit16 v8, v2, 0x180

    move-object v2, v9

    const/16 v9, 0x8

    move-object v4, v3

    move-object v3, v5

    const/4 v5, 0x0

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lcd0/a;

    const/4 v4, 0x5

    invoke-direct {v3, v0, v1, v4}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final SettingsIcon$lambda$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    sget-object v1, Lcom/whoop/profile/presentation/NavigateToSettingsViewState;->INSTANCE:Lcom/whoop/profile/presentation/NavigateToSettingsViewState;

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;-><init>(Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final SettingsIcon$lambda$1(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->SettingsIcon(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$3$1$1(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$1(Ll83/h;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$ProfileScreen$lambda$5(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$5(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$ProfileScreen$lambda$6(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$6(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic access$toMembershipAnalyticsProperties(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->toMembershipAnalyticsProperties(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$19(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileReportDialog$lambda$1$0(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar$lambda$1$0$2(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar$lambda$1$0$3(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final entitlementImageEffect(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lck1/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lck1/h;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final entitlementImageEffect$lambda$0(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x3c6c91c2

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->r()J

    move-result-wide v0

    const/4 p2, 0x2

    int-to-float p2, p2

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {p0, p2, v2, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    double-to-float p2, v0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-static {p0, p2, p2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static synthetic f(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->SettingsIcon$lambda$1(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$17$0$0$0(Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar$lambda$1$0$1(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar$lambda$2(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$3$0$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Lp1/c1;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$4$0()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$17(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$4(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileToolbar$lambda$1$0$4$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$3$1$0$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$13$0(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$12(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->SettingsIcon$lambda$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$3$1(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->entitlementImageEffect$lambda$0(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final toMembershipAnalyticsProperties(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;
    .locals 4

    new-instance v0, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getFollowingState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getCommunityVisible()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getAgeVisible()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getLocationVisible()Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static synthetic u(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen$lambda$0$0(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileReportDialog$lambda$0$0(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileReportDialog$lambda$2(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileOverflowMenu$lambda$3$1$1$0$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lkd1/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenKt;->EntitlementLogo$lambda$2(Lkd1/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenKt;->EntitlementLogo$lambda$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
