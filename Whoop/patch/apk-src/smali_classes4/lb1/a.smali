.class public final synthetic Llb1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/cards/ButtonCardModel;

    invoke-static {p1}, Llb1/w;->a(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/w;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;

    invoke-static {p1}, Llb1/u;->b(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/u;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/items/BiomarkerModel;

    invoke-static {p1}, Llb1/t;->b(Lcom/whoop/design/models/items/BiomarkerModel;)Lb01/c;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/t;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/design/models/items/BiomarkerCardModel;

    invoke-static {p1}, Llb1/s;->b(Lcom/whoop/design/models/items/BiomarkerCardModel;)La01/h;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/s;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/design/models/items/BinaryFeedbackModel;

    invoke-static {p1}, Llb1/r;->a(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/r;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    invoke-static {p1}, Llb1/q;->b(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/q;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/design/models/items/AppointmentCardModel;

    invoke-static {p1}, Llb1/l;->a(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/l;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    invoke-static {p1}, Llb1/j;->b(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/j;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;

    invoke-static {p1}, Llb1/i;->b(Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;)Ly41/f;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/i;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/design/models/items/AiChatTalkTextModel;

    invoke-static {p1}, Llb1/h;->b(Lcom/whoop/design/models/items/AiChatTalkTextModel;)Ly31/e;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/h;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    invoke-static {p1}, Llb1/g;->b(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;)Ly31/e;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/g;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;

    invoke-static {p1}, Llb1/f;->a(Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;)Lc41/f0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/f;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    invoke-static {p1}, Llb1/e;->a(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;)Lf01/h;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/e;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;

    invoke-static {p1}, Llb1/c;->a(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/c;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    invoke-static {p1}, Llb1/b;->b(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Ltz0/c;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/b;->a(Llb1/z0;)Ll83/a0;

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
