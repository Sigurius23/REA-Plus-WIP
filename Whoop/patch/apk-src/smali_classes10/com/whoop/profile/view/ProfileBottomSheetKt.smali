.class public final Lcom/whoop/profile/view/ProfileBottomSheetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a1\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "viewState",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "bodyContent",
        "ProfileBottomSheet",
        "(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;",
        "bottomSheetData",
        "ProfileBottomSheetContent",
        "(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V",
        "ProfileBottomSheetContentPreview",
        "(Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method public static final ProfileBottomSheet(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "bodyContent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, -0x42fbe851

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v11, 0x0

    if-eq v4, v5, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v11

    :goto_3
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v8, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lg1/z3;->w:Lg1/z3;

    const/16 v9, 0xc06

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v4 .. v10}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_5

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v5

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lbc3/c0;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getMembershipData()Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getBottomSheet()Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    move-result-object v7

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_9

    const v3, -0xb87486

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    new-instance v12, Lv41/g;

    const/16 v20, 0x7f

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v21}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lv41/f$a;

    invoke-direct {v3, v4}, Lv41/f$a;-><init>(Lg1/y3;)V

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_7

    if-ne v10, v6, :cond_8

    :cond_7
    new-instance v10, Lbf0/h;

    const/4 v6, 0x3

    invoke-direct {v10, v5, v4, v6}, Lbf0/h;-><init>(Lbc3/c0;Lg1/y3;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lc93/a;

    new-instance v6, Lb30/a1;

    const/4 v9, 0x5

    invoke-direct {v6, v7, v9}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v7, 0x7bb842e2

    invoke-static {v7, v8, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    new-instance v7, La01/d;

    const/16 v9, 0xa

    invoke-direct {v7, v1, v5, v4, v9}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, 0x15477aa6

    invoke-static {v4, v8, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    sget v4, Lv41/g;->h:I

    shl-int/lit8 v4, v4, 0x3

    const/high16 v5, 0xc00000

    or-int/2addr v4, v5

    sget v5, Lv41/f$a;->c:I

    shl-int/lit8 v5, v5, 0x6

    or-int v20, v4, v5

    const/16 v21, 0x6000

    const/16 v22, 0x3f69

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v19, v8

    move-object v8, v10

    const/4 v10, 0x0

    move-object v5, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v23, v6

    move-object v6, v3

    move v3, v11

    move-object/from16 v11, v23

    invoke-static/range {v4 .. v22}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v19

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    move v4, v11

    const v5, -0xaf0fd8

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_a

    new-instance v5, Lcom/whoop/design/models/modal/a;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lc93/a;

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v5, v8, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lce2/b;

    const/4 v5, 0x6

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final ProfileBottomSheet$lambda$0$0(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheet$1$1$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheet$1$1$1;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileBottomSheet$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "$this$BottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lkd1/o;->a:I

    invoke-static {p0, p2, p1}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileBottomSheet$lambda$2(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p4, v3

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_1

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_2

    :cond_1
    new-instance v0, Lbf0/h;

    const/4 p4, 0x2

    invoke-direct {v0, p1, p2, p4}, Lbf0/h;-><init>(Lbc3/c0;Lg1/y3;I)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileBottomSheet$lambda$2$0$0(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheet$3$1$1$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheet$3$1$1$1;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileBottomSheet$lambda$3$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ProfileBottomSheet$lambda$4(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0xc5e08cb

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v12, 0x2

    const/4 v13, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v13

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    const/4 v14, 0x0

    if-eq v3, v12, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    move v3, v14

    :goto_3
    and-int/2addr v2, v4

    invoke-virtual {v5, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->getImage()Lkd1/o;

    move-result-object v2

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-nez v2, :cond_4

    const v2, -0x32df61db    # -1.6841992E8f

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_4
    const v3, -0x32df61da

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    sget v3, Lcom/whoop/profile/R$string;->profile_bottom_sheet_icon_content_description:I

    invoke-static {v5, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc

    int-to-float v4, v4

    int-to-float v6, v13

    mul-float/2addr v4, v6

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x6180

    const/16 v11, 0x68

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move v7, v6

    sget-object v6, Ly2/j;->b:Ly2/b1;

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v12, v9

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-static {v12, v12, v15, v5, v14}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_4
    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->getTitle()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v14, Lw3/k;

    const/4 v8, 0x3

    invoke-direct {v14, v8}, Lw3/k;-><init>(I)V

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fdfa

    move-object v9, v3

    const/4 v3, 0x0

    move v10, v4

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    move-object/from16 v17, v12

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v21, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    const/4 v1, 0x2

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v1, v1

    int-to-float v0, v0

    mul-float/2addr v1, v0

    move-object/from16 v2, v30

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    move/from16 v10, v29

    move-object/from16 v9, v31

    invoke-virtual {v9, v5, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v9, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    new-instance v14, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v14, v11}, Lw3/k;-><init>(I)V

    move-wide v4, v3

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v2, 0x6

    int-to-float v2, v2

    invoke-static {v2, v0, v1, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v1, La41/i;

    const/16 v2, 0x1c

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final ProfileBottomSheetContent$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileBottomSheetContentPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x10f99de1

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheetContentPreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheetContentPreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0xe

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileBottomSheetContentPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContentPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$3$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$4(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContentPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$0$0(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$2$0$0(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheet$lambda$2(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContent$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
