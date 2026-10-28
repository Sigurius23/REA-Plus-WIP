.class public final synthetic Laq1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Laq1/d;->w:I

    iput-object p2, p0, Laq1/d;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Laq1/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {p1, v0}, Lep1/w;->h(ILp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lep1/c;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Leg2/j;->s(Lp1/c1;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lea2/n;->d(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcom/whoop/settings/h;->a(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Le81/k;->d(Lp1/c1;Ljava/lang/Integer;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ld61/a;

    invoke-static {v0, p1}, Le61/i;->c(Lp1/c1;Ld61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ldo0/b;->b(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lw81/d;

    invoke-static {v0, p1}, Ldn0/p;->x(Lp1/c1;Lw81/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lkd0/c$b;

    invoke-static {v0, p1}, Ldb0/c;->p(Lp1/c1;Lkd0/c$b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/profile/domain/models/Gender;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->e(Lp1/c1;Lcom/whoop/profile/domain/models/Gender;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Landroid/graphics/Rect;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->a(Lp1/c1;Landroid/graphics/Rect;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->g(Lp1/c1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->t(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->q(Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->p(Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->u(Lp1/c1;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->a(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/ProfileScreenKt;->g(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {p1, v0, v1}, Lc51/c;->e(Lp1/c1;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {p1, v0, v1}, Lc51/c;->b(Lp1/c1;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {p1, v0, v1}, Lc51/c;->c(Lp1/c1;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lc41/v1;->c(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-static {v0, p1}, Lbd1/v;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v0, 0x0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    check-cast p1, Lh2/b;

    iget-object p1, p0, Laq1/d;->x:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb30/p3;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lb30/p3;->d:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    int-to-float p1, p1

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, v0

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    iget-object p1, p0, Laq1/d;->x:Lp1/c1;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lb01/p;->o(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Laq1/d;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Laq1/f;->b(Lp1/c1;Ljava/lang/String;)Ll83/a0;

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
