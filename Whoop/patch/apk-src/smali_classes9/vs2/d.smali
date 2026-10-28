.class public final synthetic Lvs2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lvs2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvs2/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {p1}, Lw01/g;->h(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lw01/g;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lvz0/a;->a(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lvy1/c;

    invoke-static {p1}, Lvy1/b;->h(Lvy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lvy1/b;->m(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lvy0/y;

    invoke-static {p1}, Lvy0/c0;->l(Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lvy0/y;

    invoke-static {p1}, Lvy0/c0;->e(Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lvy0/x;->a(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lvy0/p;->h(Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lq3/y;

    invoke-static {p1}, Lvy0/p;->P(Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lvy0/p;->E(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lq3/y;

    invoke-static {p1}, Lvy0/p;->x(Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lmj0/e;

    invoke-static {p1}, Lvx0/c;->i(Lmj0/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lft0/b;

    invoke-static {p1}, Lvx0/c;->l(Lft0/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lvw1/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;

    invoke-static {p1}, Lvw1/a;->d(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;)Lq21/i;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;

    invoke-static {p1}, Lvw1/a;->b(Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;)Luw1/h;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;

    invoke-static {p1}, Lvw1/a;->a(Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;)Luw1/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lvw1/a;->e(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lvw1/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;->b(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;->a(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->b(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->a(Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;->a(Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lvv2/e;->a(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lvv2/e;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lvt2/f;->g(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lvt2/f;->f(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lts2/a;

    invoke-static {p1}, Lvs2/e;->q(Lts2/a;)Ll83/a0;

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
