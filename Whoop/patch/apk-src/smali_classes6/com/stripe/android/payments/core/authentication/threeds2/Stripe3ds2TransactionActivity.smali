.class public final Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Ld20/r;",
        "viewModel",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:Ll83/p;

.field public x:Ld20/l;

.field public final y:La20/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Ld20/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ld20/j;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->w:Ll83/p;

    new-instance v0, La20/h;

    new-instance v1, Ld20/j;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Ld20/j;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->y:La20/h;

    return-void
.end method


# virtual methods
.method public final o(Lv10/b;)V
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 21

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "getIntent(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "extra_args"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ld20/l;

    if-eqz v3, :cond_3

    iget-object v0, v3, Ld20/l;->x:Lux/r;

    iget-object v0, v0, Lux/r;->x:Lux/s;

    iget-object v0, v0, Lux/s;->w:Lm30/h;

    iget-object v0, v0, Lm30/h;->F:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    :try_start_1
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    instance-of v4, v0, Ll83/m;

    if-eqz v4, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/Integer;

    goto :goto_1

    :catchall_1
    move-exception v0

    const/16 v16, 0x0

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v4

    new-instance v5, Lt30/p;

    iget-object v6, v3, Ld20/l;->z:Ly00/v7;

    const-string v7, "sdkData"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v6, Ly00/v7;->w:Ljava/lang/String;

    iget-object v8, v6, Ly00/v7;->x:Ljava/lang/String;

    iget-object v9, v6, Ly00/v7;->y:Ljava/lang/String;

    new-instance v10, Ly00/f7;

    iget-object v6, v6, Ly00/v7;->z:Ly00/u7;

    iget-object v11, v6, Ly00/u7;->w:Ljava/lang/String;

    iget-object v12, v6, Ly00/u7;->x:Ljava/lang/String;

    iget-object v13, v6, Ly00/u7;->y:Ljava/util/List;

    iget-object v6, v6, Ly00/u7;->z:Ljava/lang/String;

    const-string v14, "directoryServerId"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "dsCertificateData"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "rootCertsData"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "X.509"

    invoke-static {v14}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v16, 0x0

    :try_start_3
    new-instance v2, Ljava/io/ByteArrayInputStream;

    move-object/from16 v17, v13

    sget-object v13, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v12, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    const-string v13, "getBytes(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v12}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v15, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v2

    const-string v12, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    const-string v15, "getPublicKey(...)"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, v17

    check-cast v15, Ljava/lang/Iterable;

    move-object/from16 v17, v14

    new-instance v14, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v15, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v18, v1

    invoke-static/range {v17 .. v17}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    move-object/from16 v19, v4

    new-instance v4, Ljava/io/ByteArrayInputStream;

    move-object/from16 v20, v0

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v15, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v18

    move-object/from16 v4, v19

    move-object/from16 v0, v20

    goto :goto_2

    :cond_2
    move-object/from16 v20, v0

    move-object/from16 v19, v4

    invoke-direct {v10, v11, v2, v14, v6}, Ly00/f7;-><init>(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/ArrayList;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directoryServerName"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverTransactionId"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Ld20/l;->w:Lq30/q0;

    move-object/from16 v2, v20

    invoke-direct {v5, v8, v0, v2}, Lt30/p;-><init>(Ljava/lang/String;Lq30/q0;Ljava/lang/Integer;)V

    move-object/from16 v0, v19

    iput-object v5, v0, Landroidx/fragment/app/o1;->B:Landroidx/fragment/app/w0;

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    const-string v0, "Error while attempting to initiate 3DS2 transaction."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_4
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_7

    check-cast v3, Ld20/l;

    move-object/from16 v1, p0

    iput-object v3, v1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->x:Ld20/l;

    iget-object v8, v1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->w:Ll83/p;

    invoke-virtual {v8}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz/a;

    iget-object v0, v0, Liz/a;->a:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v1, v0}, Lm/m;->setContentView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->x:Ld20/l;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ld20/l;->G:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-gt v2, v3, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_4
    new-instance v0, Ld20/j;

    const/4 v9, 0x0

    invoke-direct {v0, v1, v9}, Ld20/j;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V

    new-instance v5, Landroidx/lifecycle/y1;

    const-class v2, Ld20/r;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ld20/k;

    invoke-direct {v3, v1, v9}, Ld20/k;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V

    new-instance v4, Ld20/k;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v6}, Ld20/k;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V

    invoke-direct {v5, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    new-instance v3, Lcom/whoop/profile/view/edit/n;

    const/16 v0, 0x8

    invoke-direct {v3, v0, v1, v5}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;-><init>()V

    new-instance v2, Laq0/o;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v0, v2}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v2

    new-instance v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract;

    invoke-direct {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract;-><init>()V

    new-instance v4, Laq0/o;

    const/4 v6, 0x3

    invoke-direct {v4, v1, v6}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v0, v4}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v4

    invoke-virtual {v5}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld20/r;

    iget-boolean v0, v0, Ld20/r;->M:Z

    if-nez v0, :cond_5

    invoke-static {v1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v10

    new-instance v0, Lcz/d;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct/range {v0 .. v7}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v10, v0}, Landroidx/lifecycle/b0;->b(Lc93/m;)V

    :cond_5
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v9}, Lpf/c;->V(Landroid/view/Window;Z)V

    invoke-virtual {v8}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz/a;

    iget-object v0, v0, Liz/a;->a:Landroidx/fragment/app/FragmentContainerView;

    new-instance v2, Lcom/mapbox/maps/l;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lcom/mapbox/maps/l;-><init>(I)V

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v2}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void

    :cond_6
    const-string v0, "args"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_7
    move-object/from16 v1, p0

    new-instance v2, Lv10/b;

    sget v3, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0x79

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->o(Lv10/b;)V

    return-void
.end method
