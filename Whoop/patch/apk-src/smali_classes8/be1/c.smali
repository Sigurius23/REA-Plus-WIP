.class public final synthetic Lbe1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbe1/c;->w:I

    iput-object p2, p0, Lbe1/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbe1/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbe1/c;->w:I

    iput-object p1, p0, Lbe1/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbe1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbe1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->i(Lc93/m;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Ltr2/n;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->l(Ltr2/n;Lc93/m;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/service/network/model/DefaultImages;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->b(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Lcom/whoop/service/network/model/DefaultImages;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/TeamsDto;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Lcom/whoop/data/local/room/entity/TeamsDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/TeamInviteDto;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;Lcom/whoop/domain/model/teams/TeamInviteDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Lq83/d;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->h(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/MemberStory;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;Lcom/whoop/domain/model/teams/MemberStory;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->d(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;Lcom/whoop/data/local/room/entity/GpsMetaDataDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/GpsDto;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->b(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;Lcom/whoop/data/local/room/entity/GpsDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Lq83/d;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->a(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/FeatureTeam;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->g(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Lcom/whoop/domain/model/teams/FeatureTeam;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->c(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/settings/SettingItem;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/SettingItem;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcm0/a;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lcm0/d;->b(Lcm0/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v1, La11/r;

    invoke-static {v0, v1, p1}, Lck1/i;->k(Lkotlin/jvm/functions/Function1;La11/r;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lg1/s0;

    check-cast p1, Lzc1/d0;

    invoke-static {v0, v1, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;->E(Lbc3/c0;Lg1/s0;Lzc1/d0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcc2/c;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lld1/c;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcc2/f;->b(Lcc2/c;Lld1/c;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lc51/s;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Li2/t;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lc51/k;->k(Lc51/s;Li2/t;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, La42/a;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {v0, v1, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->f0(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lk91/b;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Li2/u0;

    check-cast p1, Lk2/c;

    invoke-static {v0, v1, p1}, Lc41/b1;->i(Lk91/b;Li2/u0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lc31/k;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, p1}, Lc31/i;->b(Lc31/k;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lav2/a;

    invoke-static {v0, v1, p1}, Lbv2/c;->b(Leb/u0;Ll83/h;Lav2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lds1/g;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lc93/o;

    invoke-static {v0, v1, p1}, Lbs1/c0;->b(Lds1/g;Lc93/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lbs1/c0;->g(Lkotlin/jvm/functions/Function1;Lc93/m;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lhv1/a;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1, p1}, Lbm2/z0;->b(Lhv1/a;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lbi2/j;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lyh2/a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lbi2/j;->b(Lbi2/j;Lyh2/a;Ljava/lang/String;)Lec3/f2;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lye0/a;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    check-cast p1, Lze0/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->B(Lye0/a;Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;Lze0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lbe1/c;->x:Ljava/lang/Object;

    check-cast v0, Lzd1/d$a;

    iget-object v1, p0, Lbe1/c;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ltp0/c;

    invoke-static {v0, v1, p1}, Lbe1/g;->x(Lzd1/d$a;Lkotlin/jvm/functions/Function1;Ltp0/c;)Ll83/a0;

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
