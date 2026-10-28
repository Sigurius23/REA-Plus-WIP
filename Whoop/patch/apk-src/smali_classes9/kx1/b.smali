.class public final synthetic Lkx1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkx1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lkx1/b;->w:I

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lk2/c;

    invoke-static {p1}, Ll51/d;->f(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Li2/g0;

    invoke-static {p1}, Ll51/d;->e(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Ll51/d;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroid/widget/TimePicker;

    invoke-static {p1}, Ll41/d;->c(Landroid/widget/TimePicker;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Ll32/c;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    new-instance v0, Lw3/s;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lw3/r;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, v1, Lw3/r;->a:I

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    move-object v2, p1

    check-cast v2, Ljava/lang/Boolean;

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lw3/s;-><init>(IZ)V

    return-object v0

    :pswitch_5
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Lw3/e;

    invoke-direct {v0, p1}, Lw3/e;-><init>(I)V

    return-object v0

    :pswitch_6
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    move-object v2, p1

    check-cast v2, Ll3/p;

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance p1, Ll3/e0;

    invoke-direct {p1, v0, v3}, Ll3/e0;-><init>(ZI)V

    return-object p1

    :pswitch_7
    check-cast p1, Ll3/y;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Ll3/y;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Ll3/y;->c:I

    const/16 v1, 0x29

    invoke-static {v0, p1, v1}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Ll21/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Ll11/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Li3/z;

    invoke-static {p1}, Li3/w;->d(Li3/z;)V

    return-object v5

    :pswitch_b
    check-cast p1, Ld0/o0;

    const/16 v0, 0x1770

    iput v0, p1, Ld0/o0;->a:I

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x12c

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v2

    sget-object v3, Lo1/o;->b:Ld0/v;

    iput-object v3, v2, Ld0/n0;->b:Ld0/z;

    const/16 v2, 0x5dc

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x708

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    const/16 v2, 0xbb8

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    const/high16 v1, 0x43870000    # 270.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0xce4

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    const/16 v2, 0x1194

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x12c0

    invoke-virtual {p1, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    invoke-virtual {p1, v0, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v5

    :pswitch_c
    check-cast p1, Li3/z;

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->w:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v5

    :pswitch_d
    check-cast p1, Li3/z;

    invoke-static {p1}, Li3/w;->n(Li3/z;)V

    return-object v5

    :pswitch_e
    check-cast p1, Ll1/x3;

    sget p1, Ll1/n2;->a:F

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_f
    check-cast p1, Li3/z;

    new-instance v0, Li3/j;

    new-instance v1, Ll1/f0;

    invoke-direct {v1, v4}, Ll1/f0;-><init>(I)V

    new-instance v2, Ll1/f0;

    invoke-direct {v2, v4}, Ll1/f0;-><init>(I)V

    invoke-direct {v0, v1, v2}, Li3/j;-><init>(Lc93/a;Lc93/a;)V

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->t:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-object v5

    :pswitch_10
    check-cast p1, Li3/z;

    invoke-static {p1}, Li3/w;->d(Li3/z;)V

    return-object v5

    :pswitch_11
    check-cast p1, Li3/z;

    invoke-static {p1}, Li3/w;->d(Li3/z;)V

    return-object v5

    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    return-object p1

    :pswitch_13
    check-cast p1, Li3/z;

    return-object v5

    :pswitch_14
    check-cast p1, Li3/z;

    invoke-static {p1, v3}, Li3/w;->i(Li3/z;I)V

    return-object v5

    :pswitch_15
    check-cast p1, Ll1/x3;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_16
    check-cast p1, Ly2/i1;

    return-object v5

    :pswitch_17
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lkz2/f;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lmh/h;

    invoke-static {p1}, Lkz2/e;->b(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lkz2/e;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    invoke-static {p1}, Lkx1/c;->h(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;)Ljx1/v;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;

    invoke-static {p1}, Lkx1/c;->f(Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;)Ljx1/y;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;

    invoke-static {p1}, Lkx1/c;->d(Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;)Ljx1/i;

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
