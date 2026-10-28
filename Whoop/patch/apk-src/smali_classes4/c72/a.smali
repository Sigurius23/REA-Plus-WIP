.class public final synthetic Lc72/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc72/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc72/a;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lcw0/c;->e(Lxf3/c;Luf3/a;)Lcom/whoop/core/details/network/api/CoreDetailsApi;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lcw0/c;->a(Lxf3/c;Luf3/a;)Lcw0/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lcw0/c;->o(Lxf3/c;Luf3/a;)Lyv0/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lcw0/c;->f(Lxf3/c;Luf3/a;)Lzv0/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lcw0/c;->t(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lcw0/c;->p(Lxf3/c;Luf3/a;)Lcom/whoop/core/details/activitytargets/domain/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lcw0/c;->q(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1, p2}, Lcq1/a;->a(Lxf3/c;Luf3/a;)Lcom/whoop/hrZones/network/HrZonesApi;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Lcn1/a;->d(Lxf3/c;Luf3/a;)Ljn1/c;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1, p2}, Lcn1/a;->g(Lxf3/c;Luf3/a;)Lkn1/a;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1, p2}, Lcn1/a;->f(Lxf3/c;Luf3/a;)Len1/d;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1, p2}, Lcn1/a;->b(Lxf3/c;Luf3/a;)Lbn1/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1, p2}, Lcn1/a;->h(Lxf3/c;Luf3/a;)Lhn1/c;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, p2}, Lcn1/a;->j(Lxf3/c;Luf3/a;)Lin1/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Lcn1/a;->i(Lxf3/c;Luf3/a;)Ldn1/b;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, p2}, Lcn1/a;->c(Lxf3/c;Luf3/a;)Lin1/c;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, p2}, Lcn1/a;->e(Lxf3/c;Luf3/a;)Lcom/whoop/homecustomization/domain/HomeCustomizationApi;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Lcb2/a;->j(Lxf3/c;Luf3/a;)Lab2/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, p2}, Lcb2/a;->f(Lxf3/c;Luf3/a;)Lza2/n;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, p2}, Lcb2/a;->e(Lxf3/c;Luf3/a;)Leb2/a;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1, p2}, Lcb2/a;->g(Lxf3/c;Luf3/a;)Lza2/d;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, p2}, Lcb2/a;->a(Lxf3/c;Luf3/a;)Lfb2/b;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1, p2}, Lcb2/a;->k(Lxf3/c;Luf3/a;)Lza2/k;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1, p2}, Lcb2/a;->b(Lxf3/c;Luf3/a;)Lza2/r;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Lcb2/a;->l(Lxf3/c;Luf3/a;)Lcom/whoop/settings/banner/api/BannersApi;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, p2}, Lcb2/a;->c(Lxf3/c;Luf3/a;)Lza2/c;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1, p2}, Lcb2/a;->d(Lxf3/c;Luf3/a;)Lza2/u;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1, p2}, Lcb2/a;->i(Lxf3/c;Luf3/a;)Lza2/p;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1, p2}, Lc72/b;->g(Lxf3/c;Luf3/a;)Lj72/i;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1, p2}, Lc72/b;->a(Lxf3/c;Luf3/a;)Lg72/c;

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
