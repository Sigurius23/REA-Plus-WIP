.class public final synthetic Lbz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lbz0/c;->w:I

    iput p1, p0, Lbz0/c;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbz0/c;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/preview/EditProfileFullScreenModalPreviewKt;->b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/preview/EditProfileAvatarSectionWithImagePreviewKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenContentKt;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileAvatarKt;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeKt;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lch0/u;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc41/f1;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc41/f1;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc41/b1;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc41/l0;->d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc31/b;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc31/b;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc01/g;->b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lc01/g;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget v0, p0, Lbz0/c;->x:I

    invoke-static {v0, p1, p2}, Lbz0/d;->a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
