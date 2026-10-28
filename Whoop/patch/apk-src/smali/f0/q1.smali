.class public final synthetic Lf0/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf0/q1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf0/q1;->w:I

    const/4 v1, 0x0

    const/high16 v2, 0x43910000    # 290.0f

    const/16 v3, 0x29a

    const/4 v4, 0x0

    const/16 v5, 0x534

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/home/domain/models/ProgressPlotTileModel;

    invoke-static {p1}, Lgm1/c;->o(Lcom/whoop/home/domain/models/ProgressPlotTileModel;)Lmm1/f;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;

    invoke-static {p1}, Lgm1/c;->m(Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;)Lvn1/q;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/home/domain/models/CoachActivityTileModel;

    invoke-static {p1}, Lgm1/c;->a(Lcom/whoop/home/domain/models/CoachActivityTileModel;)Llm1/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;

    invoke-static {p1}, Lgm1/c;->n(Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;)Lvn1/q;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lgm1/c;->g(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;

    invoke-static {p1}, Lgm1/c;->q(Lcom/whoop/home/domain/models/NotificationsWrapperModel;)Lvn1/q;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/home/domain/models/MciHomeTileModel;

    invoke-static {p1}, Lgm1/c;->j(Lcom/whoop/home/domain/models/MciHomeTileModel;)Lmm1/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/items/ItemsCardModel;

    invoke-static {p1}, Lgm1/c;->f(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/home/domain/models/DayZeroCardsModel;

    invoke-static {p1}, Lgm1/c;->l(Lcom/whoop/home/domain/models/DayZeroCardsModel;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/home/domain/models/DayOneTransitionWrapperModelV2;

    invoke-static {p1}, Lgm1/c;->i(Lcom/whoop/home/domain/models/DayOneTransitionWrapperModelV2;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;

    invoke-static {p1}, Lgm1/c;->c(Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;

    invoke-static {p1}, Lgm1/c;->k(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/home/domain/models/dailyoutlook/CoachEntryPointModel;

    invoke-static {p1}, Lgm1/c;->r(Lcom/whoop/home/domain/models/dailyoutlook/CoachEntryPointModel;)Lnm1/c;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/home/domain/models/JournalHomeTileWrapperModel;

    invoke-static {p1}, Lgm1/c;->u(Lcom/whoop/home/domain/models/JournalHomeTileWrapperModel;)Ljs1/m;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;

    invoke-static {p1}, Lgm1/c;->d(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;)Lkm1/e;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lgm1/c;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {p1}, Lgk0/b;->f(B)Llt0/a;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {p1}, Lgk0/b;->e(B)Llt0/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {p1}, Lgk0/a;->f(B)Llt0/a;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {p1}, Lgk0/a;->e(B)Llt0/a;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Li3/z;

    invoke-static {p1}, Lgb1/d;->a(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ll3/r0;

    sget-object p1, Lg1/f9;->a:Lp1/b0;

    return-object v6

    :pswitch_15
    check-cast p1, Li3/z;

    invoke-static {p1}, Li3/w;->d(Li3/z;)V

    return-object v6

    :pswitch_16
    check-cast p1, Ld0/o0;

    iput v5, p1, Ld0/o0;->a:I

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v1, Lg1/v4;->h:Ld0/v;

    iput-object v1, v0, Ld0/n0;->b:Ld0/z;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p1, Ld0/o0;->a:I

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v6

    :pswitch_17
    check-cast p1, Ld0/o0;

    iput v5, p1, Ld0/o0;->a:I

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v1, Lg1/v4;->h:Ld0/v;

    iput-object v1, v0, Ld0/n0;->b:Ld0/z;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v6

    :pswitch_18
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Li3/w;->i(Li3/z;I)V

    return-object v6

    :pswitch_19
    check-cast p1, Li3/z;

    invoke-static {p1}, Lf61/i;->p(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Li3/z;

    invoke-static {p1}, Lf61/i;->d(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Li3/z;

    invoke-static {p1}, Lf61/i;->r(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Lf0/r1;

    invoke-direct {v0, p1}, Lf0/r1;-><init>(I)V

    return-object v0

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
