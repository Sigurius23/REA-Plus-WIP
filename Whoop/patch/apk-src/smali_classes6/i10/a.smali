.class public final Li10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;La30/h;Lb20/f;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li10/a;->a:I

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li10/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Li10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La30/h;Lb20/f;B)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Li10/a;->a:I

    const-string p4, "paymentElementCallbackIdentifier"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "errorReporter"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Li10/a;->b:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    .line 12
    iput-object p3, p0, Li10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwz/l1;Lyz/a;Lxz/n0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Li10/a;->a:I

    const-string v0, "linkAnalyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Li10/a;->b:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    .line 16
    iput-object p3, p0, Li10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwz/r0;Lxz/n0;Lxz/f0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li10/a;->a:I

    const-string v0, "linkPaymentLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Li10/a;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, Li10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public static l(Lp10/h;)Le10/t0;
    .locals 5

    new-instance v0, Le10/t0;

    iget-object v1, p0, Lp10/h;->w:Ly00/d5;

    iget-object v2, p0, Lp10/h;->x:Ly00/u5;

    iget-object v3, p0, Lp10/h;->y:Ly00/j5;

    iget-object p0, p0, Lp10/h;->z:Lp10/g;

    sget-object v4, Lp10/g;->x:Lp10/g;

    if-ne p0, v4, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Le10/l;Le10/k;)V
    .locals 6

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp10/a;

    check-cast p2, Lp10/b;

    check-cast p3, Lp10/h;

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lp10/a;->a:Lcom/whoop/profile/view/edit/n;

    new-instance p3, Lp10/c;

    iget-object p2, p2, Lp10/b;->a:Le10/v0;

    invoke-direct {p3, p2}, Lp10/c;-><init>(Le10/v0;)V

    invoke-virtual {p1, p3}, Lcom/whoop/profile/view/edit/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    move-object v0, p1

    check-cast v0, Lwz/r0;

    check-cast p2, Ll83/a0;

    check-cast p3, Lo10/a;

    const-string p1, "confirmationOption"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p3, Lo10/a;->w:Lwz/g0;

    iget-object v1, p4, Le10/k;->x:Lv00/c0;

    iget-object p1, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast p1, Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lwz/d;

    iget-object v5, p3, Lo10/a;->x:Lwz/n0;

    iget-object v4, p3, Lo10/a;->y:Lwz/h0;

    invoke-virtual/range {v0 .. v5}, Lwz/r0;->b(Lv00/c0;Lwz/d;Lwz/g0;Lwz/h0;Lwz/n0;)V

    return-void

    :pswitch_1
    check-cast p1, Lj/d;

    check-cast p2, Ll83/a0;

    check-cast p3, Lk10/a;

    const-string p2, "confirmationOption"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "confirmationArgs"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast p2, Lb20/f;

    sget-object p4, Lb20/d;->G:Lb20/d;

    iget-object v0, p3, Lk10/a;->w:Ljava/lang/String;

    const-string v1, "external_payment_method_type"

    invoke-static {v1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, p4, v3, v1, v2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p2, Lh20/m;

    iget-object p4, p0, Li10/a;->b:Ljava/lang/Object;

    check-cast p4, Ljava/lang/String;

    iget-object p3, p3, Lk10/a;->x:Ly00/v3;

    invoke-direct {p2, p4, v0, p3}, Lh20/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/v3;)V

    invoke-virtual {p1, p2, v3}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_2
    check-cast p1, Lj/d;

    check-cast p2, Ll83/a0;

    check-cast p3, Li10/b;

    const-string p2, "confirmationOption"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "confirmationArgs"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast p2, Lb20/f;

    sget-object p4, Lb20/d;->H:Lb20/d;

    iget-object v0, p3, Li10/b;->w:Lh20/y1;

    iget-object v1, v0, Lh20/y1;->w:Ljava/lang/String;

    const-string v2, "custom_payment_method_type"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, p4, v3, v1, v2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p2, Li10/c;

    iget-object p4, p0, Li10/a;->b:Ljava/lang/Object;

    check-cast p4, Ljava/lang/String;

    iget-object p3, p3, Li10/b;->x:Ly00/v3;

    invoke-direct {p2, p4, v0, p3}, Li10/c;-><init>(Ljava/lang/String;Lh20/y1;Ly00/v3;)V

    invoke-virtual {p1, p2, v3}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Le10/l;)Le10/l;
    .locals 1

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lp10/h;

    if-eqz v0, :cond_0

    check-cast p1, Lp10/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lo10/a;

    if-eqz v0, :cond_1

    check-cast p1, Lo10/a;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lk10/a;

    if-eqz v0, :cond_2

    check-cast p1, Lk10/a;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_2
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li10/b;

    if-eqz v0, :cond_3

    check-cast p1, Li10/b;

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Le10/l;Le10/k;)Z
    .locals 1

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp10/h;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Lo10/a;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lk10/a;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Li10/b;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lv00/c0;)V
    .locals 1

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_2
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;
    .locals 3

    iget p2, p0, Li10/a;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lp10/h;

    invoke-virtual {p0, p1, p3}, Li10/a;->i(Lp10/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lo10/a;

    new-instance p1, Le10/c;

    const/4 p2, 0x0

    const/4 p3, 0x0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0, p2, p3}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1

    :pswitch_1
    check-cast p1, Lk10/a;

    iget-object p1, p1, Lk10/a;->w:Ljava/lang/String;

    iget-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    check-cast p2, La30/h;

    invoke-virtual {p2}, La30/h;->get()Ljava/lang/Object;

    iget-object p2, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast p2, Lb20/f;

    sget-object p3, Lb20/c;->X:Lb20/c;

    const-string v0, "external_payment_method_type"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, p3, v2, v0, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p1, Le10/b;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object v0, Le10/o;->a:Le10/o;

    invoke-direct {p1, p2, p3, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1

    :pswitch_2
    check-cast p1, Li10/b;

    iget-object p1, p1, Li10/b;->w:Lh20/y1;

    iget-object p1, p1, Lh20/y1;->w:Ljava/lang/String;

    iget-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    check-cast p2, La30/h;

    invoke-virtual {p2}, La30/h;->get()Ljava/lang/Object;

    iget-object p2, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast p2, Lb20/f;

    sget-object p3, Lb20/c;->Y:Lb20/c;

    const-string v0, "custom_payment_method_type"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, p3, v2, v0, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "confirmCustomPaymentMethodCallback is null. Cannot process payment for payment selection: "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p1, Le10/b;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object v0, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Le10/l;Le10/k;Ln10/c0;Landroid/os/Parcelable;)Le10/i;
    .locals 2

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp10/h;

    check-cast p4, Lp10/c;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le10/g;

    iget-object p3, p4, Lp10/c;->w:Le10/v0;

    invoke-direct {p1, p3, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p1

    :pswitch_0
    check-cast p1, Lo10/a;

    check-cast p4, Lwz/q;

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p4, Lwz/m;

    if-eqz p1, :cond_0

    move-object v0, p4

    check-cast v0, Lwz/m;

    iget-object v0, v0, Lwz/m;->w:Lwz/l;

    sget-object v1, Lwz/l;->w:Lwz/l;

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Li10/a;->d:Ljava/lang/Object;

    check-cast v0, Lxz/n0;

    invoke-virtual {v0}, Lxz/n0;->a()V

    :cond_1
    instance-of v0, p4, Lwz/p;

    if-eqz v0, :cond_2

    new-instance p1, Le10/g;

    new-instance p3, Le10/u0;

    check-cast p4, Lwz/p;

    iget-object p4, p4, Lwz/p;->w:Ly00/o4;

    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-direct {p3, p4, v0, v1}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    invoke-direct {p1, p3, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    goto :goto_0

    :cond_2
    instance-of v0, p4, Lwz/o;

    if-eqz v0, :cond_3

    check-cast p4, Lwz/o;

    iget-object p1, p4, Lwz/o;->x:Lwz/e;

    invoke-virtual {p0, p1}, Li10/a;->m(Lwz/e;)V

    new-instance p1, Le10/f;

    iget-object p2, p4, Lwz/o;->w:Ljava/lang/Throwable;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, p4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    check-cast p4, Lwz/m;

    iget-object p1, p4, Lwz/m;->x:Lwz/e;

    invoke-virtual {p0, p1}, Li10/a;->m(Lwz/e;)V

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->w:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    goto :goto_0

    :cond_4
    instance-of p1, p4, Lwz/n;

    if-eqz p1, :cond_5

    check-cast p4, Lwz/n;

    iget-object p1, p4, Lwz/n;->w:Lwz/e;

    invoke-virtual {p0, p1}, Li10/a;->m(Lwz/e;)V

    new-instance p1, Le10/h;

    iget-object p2, p2, Le10/k;->y:Ly00/c8;

    const/4 p4, 0x1

    invoke-direct {p1, p2, p3, p4}, Le10/h;-><init>(Ly00/c8;Ln10/c0;Z)V

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    check-cast p1, Lk10/a;

    check-cast p4, Lg20/v;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p4, Lg20/t;

    if-eqz p1, :cond_6

    new-instance p1, Le10/h;

    iget-object p2, p2, Le10/k;->y:Ly00/c8;

    const/4 p3, 0x0

    const/4 p4, 0x1

    invoke-direct {p1, p2, p3, p4}, Le10/h;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_1

    :cond_6
    instance-of p1, p4, Lg20/u;

    if-eqz p1, :cond_7

    new-instance p1, Le10/f;

    check-cast p4, Lg20/u;

    iget-object p2, p4, Lg20/u;->w:Ljava/lang/Throwable;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/o;->a:Le10/o;

    invoke-direct {p1, p2, p3, p4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_1

    :cond_7
    instance-of p1, p4, Lg20/s;

    if-eqz p1, :cond_8

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->y:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    :goto_1
    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_2
    check-cast p1, Li10/b;

    check-cast p4, Li10/g;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p4, Li10/e;

    if-eqz p1, :cond_9

    new-instance p1, Le10/h;

    iget-object p2, p2, Le10/k;->y:Ly00/c8;

    const/4 p3, 0x0

    const/4 p4, 0x1

    invoke-direct {p1, p2, p3, p4}, Le10/h;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_2

    :cond_9
    instance-of p1, p4, Li10/f;

    if-eqz p1, :cond_a

    new-instance p1, Le10/f;

    check-cast p4, Li10/f;

    iget-object p2, p4, Li10/f;->w:Ljava/lang/Throwable;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, p4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_2

    :cond_a
    instance-of p1, p4, Li10/d;

    if-eqz p1, :cond_b

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->y:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    :goto_2
    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lp10/a;

    invoke-direct {p1, p2}, Lp10/a;-><init>(Lcom/whoop/profile/view/edit/n;)V

    return-object p1

    :pswitch_0
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li10/a;->b:Ljava/lang/Object;

    check-cast v0, Lwz/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lwz/r0;->b:Lcom/stripe/android/link/LinkActivityContract;

    new-instance v2, Lv10/p;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0, p2}, Lv10/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v1, v2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    iput-object p1, v0, Lwz/r0;->e:Lj/d;

    return-object v0

    :pswitch_1
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;

    iget-object v1, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast v1, Lb20/f;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;-><init>(Lb20/f;)V

    new-instance v1, Lf10/a;

    const/4 v2, 0x5

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;-><init>()V

    new-instance v1, Lf10/a;

    const/4 v2, 0x3

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "LinkInlineSignup"

    return-object v0

    :pswitch_0
    const-string v0, "Link"

    return-object v0

    :pswitch_1
    const-string v0, "ExternalPaymentMethod"

    return-object v0

    :pswitch_2
    const-string v0, "CustomPaymentMethod"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Li10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp10/a;

    return-void

    :pswitch_0
    check-cast p1, Lwz/r0;

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lwz/r0;->e:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Lwz/r0;->e:Lj/d;

    return-void

    :pswitch_1
    check-cast p1, Lj/d;

    return-void

    :pswitch_2
    check-cast p1, Lj/d;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lp10/h;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lp10/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp10/d;

    iget v1, v0, Lp10/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp10/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp10/d;

    invoke-direct {v0, p0, p2}, Lp10/d;-><init>(Li10/a;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lp10/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp10/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lp10/d;->y:I

    invoke-virtual {p0, p1, v0}, Li10/a;->k(Lp10/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Le10/v0;

    new-instance p1, Le10/c;

    new-instance v0, Lp10/b;

    invoke-direct {v0, p2}, Lp10/b;-><init>(Le10/v0;)V

    const/4 p2, 0x0

    invoke-direct {p1, v0, v3, p2}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1
.end method

.method public j(Lp10/h;Lj00/i0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lp10/e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lp10/e;

    iget v1, v0, Lp10/e;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp10/e;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp10/e;

    invoke-direct {v0, p0, p3}, Lp10/e;-><init>(Li10/a;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lp10/e;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp10/e;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lp10/e;->E:Lwz/g0;

    iget-object p2, v0, Lp10/e;->z:Ly00/j5;

    iget-object v1, v0, Lp10/e;->y:Lp10/g;

    iget-object v2, v0, Lp10/e;->x:Lp10/h;

    iget-object v0, v0, Lp10/e;->w:Li10/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p2, Lj00/g0;

    if-eqz p2, :cond_3

    iget-object p2, p0, Li10/a;->d:Ljava/lang/Object;

    check-cast p2, Lyz/a;

    iget-object p2, p2, Lyz/a;->a:Lyz/b;

    sget-object p3, Lyz/c;->I:Lyz/c;

    invoke-virtual {p2, p3, v3}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    invoke-static {p1}, Li10/a;->l(Lp10/h;)Le10/t0;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p1, Lp10/h;->w:Ly00/d5;

    iget-object p3, p1, Lp10/h;->z:Lp10/g;

    iget-object v2, p1, Lp10/h;->y:Ly00/j5;

    iget-object v5, p1, Lp10/h;->E:Lwz/g0;

    iget-object v6, p0, Li10/a;->b:Ljava/lang/Object;

    check-cast v6, Lwz/l1;

    iput-object p0, v0, Lp10/e;->w:Li10/a;

    iput-object p1, v0, Lp10/e;->x:Lp10/h;

    iput-object p3, v0, Lp10/e;->y:Lp10/g;

    iput-object v2, v0, Lp10/e;->z:Ly00/j5;

    iput-object v5, v0, Lp10/e;->E:Lwz/g0;

    iput v4, v0, Lp10/e;->H:I

    invoke-virtual {v6, v5, p2, v0}, Lwz/l1;->a(Lwz/g0;Ly00/d5;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    move-object v1, p3

    move-object p3, p2

    move-object p2, v2

    move-object v2, p1

    move-object p1, v5

    :goto_1
    instance-of v5, p3, Ll83/m;

    if-eqz v5, :cond_5

    move-object p3, v3

    :cond_5
    check-cast p3, Lwz/q0;

    instance-of v5, p3, Lwz/o0;

    const/4 v6, 0x3

    if-eqz v5, :cond_8

    iget-object v0, v0, Li10/a;->c:Ljava/lang/Object;

    check-cast v0, Lxz/n0;

    invoke-virtual {v0}, Lxz/n0;->a()V

    check-cast p3, Lwz/o0;

    iget-boolean p1, p1, Lwz/g0;->H:Z

    if-eqz p1, :cond_6

    new-instance p1, Ly00/l5;

    iget-object v0, v1, Lp10/g;->w:Ly00/o;

    invoke-direct {p1, v6, v3, v0}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ly00/n5;

    iget-object v0, v1, Lp10/g;->w:Ly00/o;

    invoke-direct {p1, v0}, Ly00/n5;-><init>(Ly00/o;)V

    :goto_2
    new-instance v0, Le10/t0;

    iget-object p3, p3, Lwz/o0;->x:Ly00/d5;

    sget-object v2, Lp10/g;->x:Lp10/g;

    if-ne v1, v2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v4, 0x0

    :goto_3
    invoke-direct {v0, p3, p1, p2, v4}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V

    return-object v0

    :cond_8
    instance-of p1, p3, Lwz/p0;

    if-eqz p1, :cond_b

    iget-object p1, v0, Li10/a;->c:Ljava/lang/Object;

    check-cast p1, Lxz/n0;

    invoke-virtual {p1}, Lxz/n0;->a()V

    check-cast p3, Lwz/p0;

    iget-object p1, p3, Lwz/p0;->y:Ly00/o4;

    sget-object p2, Ly00/o;->y:Ly00/o;

    sget-object p3, Lp10/g;->x:Lp10/g;

    if-ne v1, p3, :cond_9

    goto :goto_4

    :cond_9
    move-object p2, v3

    :goto_4
    if-nez p2, :cond_a

    sget-object p2, Ly00/o;->z:Ly00/o;

    :cond_a
    new-instance p3, Ly00/l5;

    invoke-direct {p3, v6, v3, p2}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    new-instance p2, Le10/u0;

    const/16 v0, 0x18

    invoke-direct {p2, p1, p3, v0}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    return-object p2

    :cond_b
    if-nez p3, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Li10/a;->l(Lp10/h;)Le10/t0;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public k(Lp10/h;Ls83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lp10/f;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lp10/f;

    iget v4, v3, Lp10/f;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lp10/f;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lp10/f;

    invoke-direct {v3, v0, v2}, Lp10/f;-><init>(Li10/a;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lp10/f;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lp10/f;->G:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lp10/f;->x:Lp10/h;

    iget-object v5, v3, Lp10/f;->w:Li10/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_c

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_4
    iget-object v1, v3, Lp10/f;->z:Lj00/i0;

    iget-object v5, v3, Lp10/f;->y:Lwz/g0;

    iget-object v9, v3, Lp10/f;->x:Lp10/h;

    iget-object v11, v3, Lp10/f;->w:Li10/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v1

    move-object v1, v9

    move-object v9, v5

    move-object v5, v11

    goto/16 :goto_a

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, Lp10/h;->E:Lwz/g0;

    iget-object v2, v1, Lp10/h;->w:Ly00/d5;

    iget-object v11, v1, Lp10/h;->F:Lj00/i0;

    instance-of v12, v11, Lj00/g0;

    if-eqz v12, :cond_6

    move-object v14, v11

    goto/16 :goto_9

    :cond_6
    instance-of v12, v11, Lj00/h0;

    if-eqz v12, :cond_1a

    check-cast v11, Lj00/h0;

    iget-object v12, v11, Lj00/h0;->x:Ljava/lang/String;

    if-eqz v12, :cond_7

    move v13, v9

    goto :goto_1

    :cond_7
    const/4 v13, 0x0

    :goto_1
    if-nez v12, :cond_8

    iget-object v12, v2, Ly00/d5;->P:Ly00/v3;

    if-eqz v12, :cond_9

    iget-object v12, v12, Ly00/v3;->z:Ljava/lang/String;

    :cond_8
    move-object/from16 v16, v12

    goto :goto_2

    :cond_9
    move-object/from16 v16, v10

    :goto_2
    if-eqz v13, :cond_a

    iget-object v2, v11, Lj00/h0;->y:Ljava/lang/String;

    :goto_3
    move-object/from16 v17, v2

    goto :goto_6

    :cond_a
    iget-object v12, v1, Lp10/h;->y:Ly00/j5;

    instance-of v13, v12, Ly00/f5;

    if-eqz v13, :cond_b

    check-cast v12, Ly00/f5;

    goto :goto_4

    :cond_b
    move-object v12, v10

    :goto_4
    if-eqz v12, :cond_c

    iget-object v12, v12, Ly00/f5;->y:Ljava/lang/String;

    goto :goto_5

    :cond_c
    move-object v12, v10

    :goto_5
    if-nez v12, :cond_e

    iget-object v2, v2, Ly00/d5;->P:Ly00/v3;

    if-eqz v2, :cond_d

    iget-object v2, v2, Ly00/v3;->w:Ly00/c;

    if-eqz v2, :cond_d

    iget-object v2, v2, Ly00/c;->x:Ljava/lang/String;

    goto :goto_3

    :cond_d
    move-object/from16 v17, v10

    goto :goto_6

    :cond_e
    move-object/from16 v17, v12

    :goto_6
    if-eqz v16, :cond_f

    const-string v2, "PHONE_NUMBER"

    :goto_7
    move-object/from16 v20, v2

    goto :goto_8

    :cond_f
    const-string v2, "BILLING_ADDRESS"

    goto :goto_7

    :goto_8
    iget-object v15, v11, Lj00/h0;->w:Ljava/lang/String;

    iget-object v2, v11, Lj00/h0;->z:Ljava/lang/String;

    iget-object v11, v11, Lj00/h0;->E:Lj00/e0;

    const-string v12, "email"

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "consentAction"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Lj00/h0;

    move-object/from16 v18, v2

    move-object/from16 v19, v11

    invoke-direct/range {v14 .. v20}, Lj00/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ljava/lang/String;)V

    :goto_9
    iget-object v2, v0, Li10/a;->b:Ljava/lang/Object;

    check-cast v2, Lwz/l1;

    const-string v11, "configuration"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object v2

    invoke-virtual {v2}, Ln20/e;->a()Lxz/x;

    move-result-object v2

    iget-object v2, v2, Lxz/x;->m:Landroidx/room/y;

    iput-object v0, v3, Lp10/f;->w:Li10/a;

    iput-object v1, v3, Lp10/f;->x:Lp10/h;

    iput-object v5, v3, Lp10/f;->y:Lwz/g0;

    iput-object v14, v3, Lp10/f;->z:Lj00/i0;

    iput v9, v3, Lp10/f;->G:I

    invoke-static {v2, v3}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_10

    goto :goto_d

    :cond_10
    move-object v9, v5

    move-object v5, v0

    :goto_a
    check-cast v2, Ld00/f;

    instance-of v11, v2, Ld00/e;

    if-eqz v11, :cond_12

    iput-object v10, v3, Lp10/f;->w:Li10/a;

    iput-object v10, v3, Lp10/f;->x:Lp10/h;

    iput-object v10, v3, Lp10/f;->y:Lwz/g0;

    iput-object v10, v3, Lp10/f;->z:Lj00/i0;

    iput v8, v3, Lp10/f;->G:I

    invoke-virtual {v5, v1, v14, v3}, Li10/a;->j(Lp10/h;Lj00/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    goto :goto_d

    :cond_11
    return-object v1

    :cond_12
    sget-object v8, Ld00/d;->a:Ld00/d;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    instance-of v8, v2, Ld00/b;

    if-eqz v8, :cond_13

    goto :goto_f

    :cond_13
    sget-object v8, Ld00/c;->a:Ld00/c;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    instance-of v2, v2, Ld00/a;

    if-eqz v2, :cond_14

    goto :goto_b

    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_15
    :goto_b
    iget-object v2, v5, Li10/a;->b:Ljava/lang/Object;

    check-cast v2, Lwz/l1;

    iput-object v5, v3, Lp10/f;->w:Li10/a;

    iput-object v1, v3, Lp10/f;->x:Lp10/h;

    iput-object v10, v3, Lp10/f;->y:Lwz/g0;

    iput-object v10, v3, Lp10/f;->z:Lj00/i0;

    iput v7, v3, Lp10/f;->G:I

    invoke-virtual {v2, v9, v14, v3}, Lwz/l1;->d(Lwz/g0;Lj00/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_16

    goto :goto_d

    :cond_16
    :goto_c
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_18

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v10, v3, Lp10/f;->w:Li10/a;

    iput-object v10, v3, Lp10/f;->x:Lp10/h;

    iput v6, v3, Lp10/f;->G:I

    invoke-virtual {v5, v1, v3}, Li10/a;->k(Lp10/h;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_17

    :goto_d
    return-object v4

    :cond_17
    :goto_e
    check-cast v2, Le10/v0;

    return-object v2

    :cond_18
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Li10/a;->l(Lp10/h;)Le10/t0;

    move-result-object v1

    return-object v1

    :cond_19
    :goto_f
    iget-object v2, v5, Li10/a;->d:Ljava/lang/Object;

    check-cast v2, Lyz/a;

    iget-object v2, v2, Lyz/a;->a:Lyz/b;

    sget-object v3, Lyz/c;->I:Lyz/c;

    invoke-virtual {v2, v3, v10}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    invoke-static {v1}, Li10/a;->l(Lp10/h;)Le10/t0;

    move-result-object v1

    return-object v1

    :cond_1a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public m(Lwz/e;)V
    .locals 1

    instance-of v0, p1, Lwz/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li10/a;->c:Ljava/lang/Object;

    check-cast v0, Lxz/f0;

    check-cast p1, Lwz/d;

    invoke-virtual {v0, p1}, Lxz/f0;->a(Lwz/d;)V

    return-void

    :cond_0
    sget-object v0, Lwz/b;->w:Lwz/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
