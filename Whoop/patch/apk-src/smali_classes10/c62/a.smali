.class public final synthetic Lc62/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc62/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc62/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lzh0/a;

    invoke-static {p1}, Lci0/d;->a(Lzh0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lai0/a;

    invoke-static {p1}, Lci0/d;->j(Lai0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lch0/t0;->a(J)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lch0/o0;->c(J)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lch0/m0;->k(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lyg0/b;

    invoke-static {p1}, Lch0/m0;->p(Lyg0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lch0/m0;->n(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lch0/c0;->j(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lyg0/b;

    invoke-static {p1}, Lch0/c0;->k(Lyg0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lzg0/g;

    invoke-static {p1}, Lch0/c0;->d(Lzg0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lch0/c0;->o(Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lch0/c0;->g(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lch0/c0;->p(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lch0/c0;->c(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lzg0/a;

    invoke-static {p1}, Lch0/u;->b(Lzg0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lzg0/g;

    invoke-static {p1}, Lch0/u;->k(Lzg0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lnl0/k;

    invoke-static {p1}, Lch0/n;->g(Lnl0/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lnl0/m;

    invoke-static {p1}, Lch0/n;->p(Lnl0/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lch0/b;

    invoke-static {p1}, Lch0/n;->m(Lch0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lch0/n;->a(Lc93/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/design/util/TextResource;

    invoke-static {p1}, Lch0/n;->b(Lcom/whoop/design/util/TextResource;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lch0/n;->d(Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lmh/h;

    invoke-static {p1}, Lce2/c;->l(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lce1/c;

    invoke-static {p1}, Lce1/b;->a(Lce1/c;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lce1/c;

    invoke-static {p1}, Lce1/b;->b(Lce1/c;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lzc0/a;

    invoke-static {p1}, Lcd0/b;->e(Lzc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1}, Lcc2/f;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1}, Lc90/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;

    invoke-static {p1}, Lc62/b;->a(Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;)Ld62/h;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lc62/b;->c(Llb1/z0;)Ll83/a0;

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
