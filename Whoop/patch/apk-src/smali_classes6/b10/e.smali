.class public final synthetic Lb10/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb10/z0;


# direct methods
.method public synthetic constructor <init>(Lb10/z0;I)V
    .locals 0

    iput p2, p0, Lb10/e;->w:I

    iput-object p1, p0, Lb10/e;->x:Lb10/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb10/e;->w:I

    check-cast p1, Ll83/n;

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->J:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->N:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->f0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_2
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->K:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v0, p0, Lb10/e;->x:Lb10/z0;

    invoke-virtual {v0, p1}, Lb10/z0;->x(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->o0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_4
    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->L:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_5
    iget-object p1, p0, Lb10/e;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->P:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->O:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v0, p0, Lb10/e;->x:Lb10/z0;

    invoke-virtual {v0, p1}, Lb10/z0;->x(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
