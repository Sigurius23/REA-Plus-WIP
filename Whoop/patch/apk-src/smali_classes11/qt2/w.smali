.class public final synthetic Lqt2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqt2/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqt2/w;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly81/i;

    invoke-static {p1}, Lr61/i;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lr61/e;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lr61/e;->b(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lr61/e;->c(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lr61/a;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ll83/k;

    invoke-static {p1}, Lr51/e;->b(Ll83/k;)Lr51/g;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lr41/h;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lr32/c;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lr32/c;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecords;

    invoke-static {p1}, Lr32/a;->a(Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecords;)Ls32/g;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lr31/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Lr31/d;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ln23/e;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_c
    check-cast p1, Lmh/h;

    invoke-static {p1}, Lr21/f;->e(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ld30/x;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ld30/x;->a()Lzy/b;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/util/List;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0, p1}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/List;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1}, Lr01/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    invoke-static {p1}, Lqz1/d;->b(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lqz1/d;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lqz1/d;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;

    invoke-static {p1}, Lqz1/c;->b(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lqz1/c;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lqz1/c;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;

    invoke-static {p1}, Lqz1/b;->a(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lqz1/b;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lqz1/b;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lhu2/a;

    invoke-static {p1}, Lqu2/h;->f(Lhu2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lhu2/a;

    invoke-static {p1}, Lqu2/h;->G(Lhu2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lqt2/x;->a(Ljava/lang/Object;)Ll83/a0;

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
