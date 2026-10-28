.class public final Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "bottomSheetType",
        "Ll83/a0;",
        "EditProfileBottomSheetPreview",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final EditProfileBottomSheetPreview(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Landroidx/compose/runtime/Composer;II)V
    .locals 5

    check-cast p1, Lp1/q;

    const v0, 0x43c7d35

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p2, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v2, p2, 0x6

    if-nez v2, :cond_3

    if-nez p0, :cond_1

    const/4 v2, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    :goto_0
    invoke-virtual {p1, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x4

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    or-int/2addr v2, p2

    goto :goto_2

    :cond_3
    move v2, p2

    :goto_2
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    if-eq v3, v1, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/2addr v2, v4

    invoke-virtual {p1, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v0, :cond_5

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->GENDER:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    :cond_5
    sget-object v0, Lg1/z3;->x:Lg1/z3;

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    invoke-static {v3, v2, v1}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v3, v2, v1}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lfy1/i;->a:Lfy1/i;

    invoke-static {v2, v3, v1}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v2, v3}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v2, Lb3/v1;->l:Lp1/u2;

    iget-object v3, v1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v2, v1, v3}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v1

    new-array v1, v1, [Lp1/u1;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lp1/u1;

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v2, v0, p0}, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;-><init>(Lg1/z3;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;)V

    const v0, -0x124c2861

    invoke-static {v0, p1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p1, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lcom/whoop/profile/presentation/edit/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p3, v1}, Lcom/whoop/profile/presentation/edit/b;-><init>(Ljava/lang/Object;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final EditProfileBottomSheetPreview$lambda$1(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt;->EditProfileBottomSheetPreview(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt;->EditProfileBottomSheetPreview$lambda$1(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
