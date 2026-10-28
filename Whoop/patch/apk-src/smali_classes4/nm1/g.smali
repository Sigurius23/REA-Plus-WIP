.class public final synthetic Lnm1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lnm1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnm1/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;

    invoke-static {p1}, Lpl0/c;->c(Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;)Lhh0/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;

    invoke-static {p1}, Lpl0/c;->r(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    invoke-static {p1}, Lpl0/c;->s(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;)Lul0/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lpf/g;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    invoke-static {p1}, Lpc1/c;->a(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;)Lh31/q;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lpc1/c;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;

    invoke-static {p1}, Lpc1/a;->b(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;)Lh31/g;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lpc1/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;

    invoke-static {p1}, Lpb1/d;->a(Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;)Lf51/k;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lpb1/d;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;

    invoke-static {p1}, Lpb1/c;->b(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;)Lf51/h;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lpb1/c;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;

    invoke-static {p1}, Lpb1/b;->b(Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;)Lf51/e;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lpb1/b;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1}, Lp31/n;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lp31/j;

    invoke-static {p1}, Lp31/n;->d(Lp31/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lp31/d;

    invoke-static {p1}, Lp31/f;->e(Lp31/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lp31/f;->f(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lou0/f;->g(Ltb/a;)Lpu0/d;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lou0/d;->i(Ltb/a;)Lpu0/b;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lod1/u$a;

    invoke-static {p1}, Lod1/u;->b(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lod1/u$a;

    invoke-static {p1}, Lod1/u;->c(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lj02/c;

    invoke-static {p1}, Lo02/c;->c(Lj02/c;)Lj02/c;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lo02/a;->c(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Lny1/e$a;->a(Ljava/io/File;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lny0/u;->b(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lny0/p;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lny0/d;->d(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lny0/d;->c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lnm1/h;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

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
