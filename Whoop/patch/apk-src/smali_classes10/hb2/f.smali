.class public final synthetic Lhb2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhb2/f;->w:I

    iput-object p1, p0, Lhb2/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk83/a;I)V
    .locals 0

    .line 2
    const/4 p2, 0x4

    iput p2, p0, Lhb2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb2/f;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhb2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->y(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lkc2/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lkc2/f;->z(Lkc2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lcom/whoop/domain/model/UnitSystem;

    invoke-static {v0, p1, p2}, Lkc1/a;->b(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/gifthub/GiftHubFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/gifthub/GiftHubFragment;->C(Lcom/whoop/settings/gifthub/GiftHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lk03/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lk03/c;->s(Lk03/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/feature/WhoopLabsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/whooplabs/feature/WhoopLabsFragment;->F(Lcom/whoop/whooplabs/feature/WhoopLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/videocall/view/VideoCallFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/videocall/view/VideoCallFragment;->z(Lcom/whoop/videocall/view/VideoCallFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/integrations/view/IntegrationsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/integrations/view/IntegrationsFragment;->H(Lcom/whoop/integrations/view/IntegrationsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Ljp2/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ljp2/d;->c(Ljp2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->A(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lj81/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lj81/f;->g(Lj81/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lj50/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lj50/c;->b(Lj50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lj1/l;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v0, Lj1/l;->e:Lp1/g1;

    invoke-virtual {p2, p1}, Lp1/g1;->y(F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lio2/o0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lio2/m0;->h(Lio2/o0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    check-cast p1, Ll83/k;

    check-cast p2, Ll83/k;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->r(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ll83/k;Ll83/k;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->H(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;ILjava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;

    check-cast p1, Ljava/util/Map;

    check-cast p2, Lio/getstream/chat/android/models/TypingEvent;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->c(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->p0(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)Lo23/d;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;->z(Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;->z(Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;->C(Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/education/FeatureEducationDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/education/FeatureEducationDebugFragment;->z(Lcom/whoop/education/FeatureEducationDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;->A(Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/email/EditEmailFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/email/EditEmailFragment;->z(Lcom/whoop/settings/email/EditEmailFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;->B(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Li20/l1;->h(Lk83/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lhr2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lhr2/f;->a(Lhr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lge2/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lhe2/c;->c(Lge2/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->D(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lhb2/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/debug/QnaFormDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/debug/QnaFormDebugFragment;->z(Lcom/whoop/settings/debug/QnaFormDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
