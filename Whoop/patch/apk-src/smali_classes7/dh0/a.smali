.class public final synthetic Ldh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldh0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldh0/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lzn0/a;

    invoke-static {p1}, Ldo0/b;->f(Lzn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Ldn0/p;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Ldn0/p;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/time/LocalDate;

    invoke-static {p1}, Ldn0/p;->i(Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Ldn0/p;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ldn0/p;->k(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ldn0/p;->l(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lo02/e;

    invoke-static {p1}, Ldm1/b;->a(Lo02/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lk2/c;

    invoke-static {p1}, Ldk2/l;->b(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ldk2/j;->k(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Luj2/a;

    invoke-static {p1}, Ldk2/j;->e(Luj2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ldk2/h;->c(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lak2/a;

    invoke-static {p1}, Ldk2/h;->e(Lak2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbk2/b;

    invoke-static {p1}, Ldk2/h;->a(Lbk2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lak2/a;

    invoke-static {p1}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->D(Lak2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Ldj2/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ldj1/c;->o(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;

    invoke-static {p1}, Ldj1/c;->f(Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;)Lej1/y;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    invoke-static {p1}, Ldj1/c;->r(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;)Lcj1/r;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;

    invoke-static {p1}, Ldj1/c;->p(Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;)Lfj1/m;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;

    invoke-static {p1}, Ldj1/c;->k(Lcom/whoop/health/domain/models/EntryPointLockedCardModel;)Lfj1/c;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    invoke-static {p1}, Ldj1/c;->e(Lcom/whoop/health/domain/models/DataVisualizationCardModel;)Lcj1/e;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    invoke-static {p1}, Ldj1/c;->h(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;)Lcj1/a;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-static {p1}, Ldj1/c;->i(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Ldj1/c;->m(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ldj1/c;->g(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ldj1/c;->n(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lre/a1;

    invoke-static {p1}, Ldj0/b;->d(Lre/a1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Ldh0/c;->b(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Ldh0/c;->c(Ljava/lang/Object;)Ll83/a0;

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
