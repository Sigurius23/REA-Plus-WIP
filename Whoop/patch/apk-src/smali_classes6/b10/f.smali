.class public final synthetic Lb10/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb10/z0;

.field public final synthetic y:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lb10/z0;Ljava/util/Set;I)V
    .locals 0

    iput p3, p0, Lb10/f;->w:I

    iput-object p1, p0, Lb10/f;->x:Lb10/z0;

    iput-object p2, p0, Lb10/f;->y:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb10/f;->w:I

    check-cast p1, Ll83/n;

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lb10/f;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->G:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3c

    iget-object v2, p0, Lb10/f;->y:Ljava/util/Set;

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
    iget-object p1, p0, Lb10/f;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->F:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3c

    iget-object v2, p0, Lb10/f;->y:Ljava/util/Set;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lb10/f;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "productUsageTokens"

    iget-object v2, p0, Lb10/f;->y:Ljava/util/Set;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->H:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lb10/f;->x:Lb10/z0;

    iget-object v0, p1, Lb10/z0;->j:Lb10/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "productUsageTokens"

    iget-object v2, p0, Lb10/f;->y:Ljava/util/Set;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->H:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    iget-object p1, p1, Lb10/z0;->h:Lyy/j;

    invoke-virtual {p1, v0}, Lyy/j;->a(Lyy/b;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
