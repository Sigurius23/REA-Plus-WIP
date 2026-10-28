.class public final Lc00/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc00/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc00/e;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    const-string v0, "PaymentSheet"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_1
    sget-object v0, Lb5/g;->b:Lb5/g;

    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v0

    invoke-virtual {v0}, Lb5/g;->c()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v1

    :cond_1
    return-object v1

    :pswitch_2
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->y:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v0

    :pswitch_3
    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_4
    new-instance v0, Li20/y0;

    sget-object v1, Li20/z;->w:Li20/z;

    invoke-direct {v0, v1}, Li20/y0;-><init>(Li20/b0;)V

    return-object v0

    :pswitch_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_6
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_7
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
