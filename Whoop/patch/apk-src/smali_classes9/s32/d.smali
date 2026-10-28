.class public final synthetic Ls32/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ls32/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ls32/d;->w:I

    const-string v1, "it"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;

    invoke-static {p1}, Lsc1/a;->a(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;)Lz31/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lsc1/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lqc0/a;

    invoke-static {p1}, Lsc0/h;->b(Lqc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lsc0/g;->d(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lsc0/g;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lqc0/a;

    invoke-static {p1}, Lsc0/g;->g(Lqc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lqc0/a;

    invoke-static {p1}, Lsc0/e;->a(Lqc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lsb0/f;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lqa0/a;

    invoke-static {p1}, Lsa0/b;->i(Lqa0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lkd0/a$c;

    invoke-static {p1}, Lsa0/b;->d(Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lkd0/a$c;

    invoke-static {p1}, Lsa0/b;->c(Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lqa0/a;

    invoke-static {p1}, Lsa0/b;->e(Lqa0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Li2/g0;

    invoke-static {p1}, Ls90/g;->k(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lk2/e;

    invoke-static {p1}, Ls90/g;->c(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Ls90/g;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Ls90/g;->f(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Ls90/g;->a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1}, Ls81/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1}, Ls71/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lk2/c;

    invoke-static {p1}, Ls51/g;->f(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Ls51/g;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ly00/j6;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_15
    check-cast p1, Lcom/stripe/android/core/model/CountryCode;

    sget-object v0, Lcom/stripe/android/view/CountryTextInputLayout;->k1:[Lj93/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_16
    check-cast p1, Lcom/stripe/android/core/model/Country;

    sget-object v0, Lcom/stripe/android/view/CountryTextInputLayout;->k1:[Lj93/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    return-object v2

    :pswitch_18
    check-cast p1, Ljava/util/List;

    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_19
    check-cast p1, Ly00/i;

    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_1a
    check-cast p1, Ly00/i;

    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_1b
    check-cast p1, Ls40/d;

    sget p1, Lcom/stripe/android/view/BecsDebitBsbEditText;->b0:I

    return-object v2

    :pswitch_1c
    invoke-static {p1}, Ls32/f;->d(Ljava/lang/Object;)Ll83/a0;

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
