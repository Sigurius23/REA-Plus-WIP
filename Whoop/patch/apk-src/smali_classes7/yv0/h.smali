.class public final synthetic Lyv0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lyv0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lyv0/h;->w:I

    const-string v1, "</b>"

    const-string v2, "<b>"

    const/4 v3, 0x1

    const-string v4, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/h;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    invoke-static {p1}, Lyz1/f;->c(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyz1/f;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/f;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDetailsSectionModel;

    invoke-static {p1}, Lyz1/d;->c(Lcom/whoop/nativestore/pdp/domain/model/ProductDetailsSectionModel;)Lh02/x;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyz1/d;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/d;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;

    invoke-static {p1}, Lyz1/c;->a(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;)Lh02/s;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyz1/c;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/c;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;

    invoke-static {p1}, Lyz1/b;->a(Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;)Lh02/o;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyz1/b;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/b;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;

    invoke-static {p1}, Lyz1/a;->c(Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;)Lh02/c;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyz1/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyz1/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyy2/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1

    :pswitch_11
    check-cast p1, Landroid/content/Context;

    sget-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->w:Lab/i0;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/w0;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    invoke-direct {v0, p1}, Lq30/w0;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_12
    check-cast p1, Lyy/w;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyy/w;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lyb3/k;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v1}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyb3/l;

    invoke-virtual {p1, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<a href=\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "</a>"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lyb3/k;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyb3/l;

    invoke-virtual {p1, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2, v1}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lyb3/k;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyb3/l;

    invoke-virtual {p1, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2, v1}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lyy/d;

    invoke-static {p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->b(Lyy/d;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyx2/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    invoke-static {p1}, Lyv2/e;->c(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)Lzv2/f;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyv2/e;->d(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lyv2/e;->b(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyv2/e;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;

    invoke-static {p1}, Lyv0/i;->c(Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;)Lyv0/g;

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
