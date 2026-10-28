.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/data/local/room/dao/persistent/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->f(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->a(Landroid/graphics/Rect;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->a(Landroid/graphics/Rect;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->d(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->a(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->i(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->a(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ll83/k;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->e(Ll83/k;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenKt;->p(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Runnable;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->b(Ljava/lang/Runnable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenContentKt;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenContentKt;->g(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenContentKt;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lf2/d;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->h(Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->m(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->d(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    invoke-static {p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->b(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;)Lcom/whoop/profile/view/components/ReferralsTileViewState;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/profile/domain/models/components/StreakTileModel;

    invoke-static {p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->c(Lcom/whoop/profile/domain/models/components/StreakTileModel;)Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;

    invoke-static {p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->e(Lcom/whoop/profile/domain/models/components/ContextHubTileModel;)Lcom/whoop/profile/view/components/ContextHubTileViewState;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->d(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->a(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->f(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->g(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->d(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->h(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->a(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->g(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->b(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->b(Ltb/a;)Ljava/lang/Integer;

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
