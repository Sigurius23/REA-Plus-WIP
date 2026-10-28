.class public final Lcom/whoop/profile/view/ProfileFullScreenModalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000f\u0010\u0008\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\t\u001a\u000f\u0010\u000c\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "Ll83/a0;",
        "onEvent",
        "ProfileContentAreaModal",
        "(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "PreviewProfileLoadingContentAreaModal",
        "(Landroidx/compose/runtime/Composer;I)V",
        "PreviewProfileNetworkErrorContentAreaModal",
        "PreviewProfileServerErrorContentAreaModal",
        "PreviewProfileSuccessContentAreaModal",
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
.method public static final PreviewProfileLoadingContentAreaModal(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x2aa6f991

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

    new-instance v1, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileLoadingContentAreaModal$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileLoadingContentAreaModal$$inlined$WhoopPreviewTheme$1;-><init>()V

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

    const/16 v1, 0xf

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewProfileLoadingContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileLoadingContentAreaModal(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final PreviewProfileNetworkErrorContentAreaModal(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x30f13fd5

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

    new-instance v1, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileNetworkErrorContentAreaModal$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileNetworkErrorContentAreaModal$$inlined$WhoopPreviewTheme$1;-><init>()V

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

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewProfileNetworkErrorContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileNetworkErrorContentAreaModal(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final PreviewProfileServerErrorContentAreaModal(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x672700c8

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

    new-instance v1, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileServerErrorContentAreaModal$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileServerErrorContentAreaModal$$inlined$WhoopPreviewTheme$1;-><init>()V

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

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewProfileServerErrorContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileServerErrorContentAreaModal(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final PreviewProfileSuccessContentAreaModal(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x75e33f36

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

    new-instance v1, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$$inlined$WhoopPreviewTheme$1;-><init>()V

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

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewProfileSuccessContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileSuccessContentAreaModal(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileContentAreaModal(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x303c6e8a

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v10

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_19

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v11, v7, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x26ea5f32

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->getState()Lsz0/q0;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v8

    instance-of v8, v8, Lsz0/p0$h;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    const v8, -0x4ee60d56

    invoke-static {v7, v8, v5}, Lvl/b;->d(Lp1/q;ILsz0/q0;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_a

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_9

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_6

    :cond_9
    move v4, v10

    goto :goto_7

    :cond_a
    :goto_6
    move v4, v9

    :goto_7
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_b

    move v3, v9

    goto :goto_8

    :cond_b
    move v3, v10

    :goto_8
    or-int/2addr v3, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    if-ne v4, v11, :cond_d

    :cond_c
    new-instance v4, Lcom/whoop/profile/view/b;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lcom/whoop/profile/view/b;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v16, v4

    check-cast v16, Lc93/a;

    new-instance v12, Lsz0/p0$h;

    const-wide/16 v14, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v3, Lsz0/p0$h;->h:I

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int v17, v3, v4

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v3, v9

    const/4 v9, 0x0

    move v4, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v13, v4

    move-object v4, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v3, v20

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    const/4 v10, 0x1

    goto/16 :goto_f

    :cond_e
    move v5, v3

    move v3, v10

    move v10, v9

    const v8, -0x4ee0f82f

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->getState()Lsz0/q0;

    move-result-object v8

    and-int/lit8 v9, v5, 0xe

    if-eq v9, v4, :cond_10

    and-int/lit8 v12, v5, 0x8

    if-eqz v12, :cond_f

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    goto :goto_9

    :cond_f
    move v12, v3

    goto :goto_a

    :cond_10
    :goto_9
    move v12, v10

    :goto_a
    and-int/lit8 v13, v5, 0x70

    if-ne v13, v6, :cond_11

    move v14, v10

    goto :goto_b

    :cond_11
    move v14, v3

    :goto_b
    or-int/2addr v12, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_12

    if-ne v14, v11, :cond_13

    :cond_12
    new-instance v14, Lcom/whoop/profile/view/b;

    const/4 v12, 0x1

    invoke-direct {v14, v0, v1, v12}, Lcom/whoop/profile/view/b;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v14, Lc93/a;

    if-eq v9, v4, :cond_15

    and-int/lit8 v4, v5, 0x8

    if-eqz v4, :cond_14

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_c

    :cond_14
    move v9, v3

    goto :goto_d

    :cond_15
    :goto_c
    move v9, v10

    :goto_d
    if-ne v13, v6, :cond_16

    move v4, v10

    goto :goto_e

    :cond_16
    move v4, v3

    :goto_e
    or-int/2addr v4, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_17

    if-ne v5, v11, :cond_18

    :cond_17
    new-instance v5, Lcom/whoop/profile/view/b;

    const/4 v4, 0x2

    invoke-direct {v5, v0, v1, v4}, Lcom/whoop/profile/view/b;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v6, v5

    check-cast v6, Lc93/a;

    move-object v4, v8

    sget v8, Lsz0/q0;->k:I

    const/4 v9, 0x0

    move-object v5, v14

    invoke-static/range {v4 .. v9}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_19
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_1a

    new-instance v4, Lce2/b;

    const/4 v5, 0x7

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final ProfileContentAreaModal$lambda$0$0$0$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->getPrimaryClickEvent()Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentAreaModal$lambda$0$0$1$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->getPrimaryClickEvent()Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentAreaModal$lambda$0$0$2$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->getSecondaryClickEvent()Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentAreaModal$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileSuccessContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileNetworkErrorContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileServerErrorContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileLoadingContentAreaModal$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal$lambda$0$0$1$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal$lambda$1(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal$lambda$0$0$2$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->ProfileContentAreaModal$lambda$0$0$0$0(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
