.class public final Lgm/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/j;
.implements Lxr/l;


# instance fields
.field public w:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgm/j;->w:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/j;->w:Landroid/content/Context;

    return-void

    .line 3
    :pswitch_0
    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lgm/j;->w:Landroid/content/Context;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Lgm/j;)Lm5/i;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-lt v0, v1, :cond_2

    new-instance v0, Lm5/l;

    iget-object v1, p0, Lgm/j;->w:Landroid/content/Context;

    invoke-direct {v0, v1}, Lm5/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lm5/l;->isAvailableOnDevice()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v2, v0

    :cond_0
    if-nez v2, :cond_1

    invoke-virtual {p0}, Lgm/j;->f()Lm5/i;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2

    :cond_2
    const/16 v1, 0x21

    if-gt v0, v1, :cond_3

    invoke-virtual {p0}, Lgm/j;->f()Lm5/i;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v2
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgm/j;->w:Landroid/content/Context;

    return-object v0
.end method

.method public b()Lgm/k;
    .locals 13

    iget-object v0, p0, Lgm/j;->w:Landroid/content/Context;

    if-eqz v0, :cond_0

    new-instance v1, Lgm/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lgm/n;->a:Lg73/a;

    invoke-static {v2}, Lim/a;->a(Lim/b;)Lk83/a;

    move-result-object v2

    iput-object v2, v1, Lgm/k;->w:Lk83/a;

    new-instance v2, Lf93/a;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v1, Lgm/k;->x:Lf93/a;

    new-instance v0, Lhm/d;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    const/16 v4, 0x12

    invoke-direct {v3, v4, v2, v0}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lim/a;->a(Lim/b;)Lk83/a;

    move-result-object v0

    iput-object v0, v1, Lgm/k;->y:Lk83/a;

    iget-object v0, v1, Lgm/k;->x:Lf93/a;

    new-instance v2, Lnm/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lnm/e;-><init>(Lk83/a;I)V

    iput-object v2, v1, Lgm/k;->z:Lnm/e;

    new-instance v2, Lnm/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lnm/e;-><init>(Lk83/a;I)V

    invoke-static {v2}, Lim/a;->a(Lim/b;)Lk83/a;

    move-result-object v0

    iget-object v2, v1, Lgm/k;->z:Lnm/e;

    new-instance v3, Lqg3/d;

    const/16 v4, 0x19

    invoke-direct {v3, v4, v2, v0}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lim/a;->a(Lim/b;)Lk83/a;

    move-result-object v7

    iput-object v7, v1, Lgm/k;->E:Lk83/a;

    new-instance v0, Lg73/d;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lg73/d;-><init>(I)V

    iget-object v2, v1, Lgm/k;->x:Lf93/a;

    new-instance v8, Lgm/r;

    const/16 v3, 0xe

    invoke-direct {v8, v2, v7, v0, v3}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v6, v1, Lgm/k;->w:Lk83/a;

    move-object v9, v7

    iget-object v7, v1, Lgm/k;->y:Lk83/a;

    new-instance v5, Lb30/m;

    const/4 v11, 0x7

    move-object v10, v9

    invoke-direct/range {v5 .. v11}, Lb30/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v0, v5

    new-instance v5, Lm63/d;

    move-object v11, v9

    move-object v12, v9

    move-object v9, v8

    move-object v8, v10

    move-object v10, v6

    move-object v6, v2

    invoke-direct/range {v5 .. v12}, Lm63/d;-><init>(Lk83/a;Lk83/a;Lk83/a;Lgm/r;Lk83/a;Lk83/a;Lk83/a;)V

    move-object v2, v9

    move-object v9, v8

    move-object v8, v2

    move-object v2, v5

    move-object v6, v10

    new-instance v5, La00/g;

    const/16 v10, 0x18

    move-object v7, v9

    invoke-direct/range {v5 .. v10}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v3, Lgm/r;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v2, v5, v4}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v3}, Lim/a;->a(Lim/b;)Lk83/a;

    move-result-object v0

    iput-object v0, v1, Lgm/k;->F:Lk83/a;

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Ly00/c8;I)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lgm/j;->w:Landroid/content/Context;

    const-string v1, "intent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    if-ne p2, v1, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f141003

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    iget-object p2, p2, Ly00/o4;->E:Ly00/f4;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    sget-object v2, Ly00/f4;->I:Ly00/f4;

    if-ne p2, v2, :cond_2

    invoke-interface {p1}, Ly00/c8;->m()Ly00/b8;

    move-result-object p2

    instance-of p2, p2, Ly00/v7;

    if-eqz p2, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-interface {p1}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->F:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq p2, v2, :cond_3

    invoke-interface {p1}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->E:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v2, :cond_b

    :cond_3
    instance-of p2, p1, Ly00/l3;

    const-string v2, "context"

    const v3, 0x7f141002

    if-eqz p2, :cond_8

    check-cast p1, Ly00/l3;

    iget-object p2, p1, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v4, p1, Ly00/l3;->S:Ly00/i3;

    sget-object v5, Lcom/stripe/android/model/StripeIntent$Status;->E:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v5, :cond_4

    iget-object p1, p1, Ly00/l3;->N:Ly00/o4;

    if-eqz p1, :cond_6

    iget-object p1, p1, Ly00/o4;->E:Ly00/f4;

    if-eqz p1, :cond_6

    iget-boolean p1, p1, Ly00/f4;->x:Z

    const/4 p2, 0x1

    if-ne p1, p2, :cond_6

    :cond_4
    if-eqz v4, :cond_5

    iget-object p1, v4, Ly00/i3;->x:Ljava/lang/String;

    goto :goto_1

    :cond_5
    move-object p1, v1

    :goto_1
    const-string p2, "payment_intent_authentication_failure"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    if-eqz v4, :cond_b

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v4, Ly00/i3;->E:Ljava/lang/String;

    iget-object p2, v4, Ly00/i3;->x:Ljava/lang/String;

    iget-object v1, v4, Ly00/i3;->y:Ljava/lang/String;

    invoke-static {v0, p1, p2, v1}, Lv8/b;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p2, p1, Ly00/g6;

    if-eqz p2, :cond_c

    check-cast p1, Ly00/g6;

    iget-object p1, p1, Ly00/g6;->M:Ly00/f6;

    if-eqz p1, :cond_9

    iget-object p2, p1, Ly00/f6;->w:Ljava/lang/String;

    goto :goto_2

    :cond_9
    move-object p2, v1

    :goto_2
    const-string v4, "setup_intent_authentication_failure"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    if-eqz p1, :cond_b

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Ly00/f6;->z:Ljava/lang/String;

    iget-object v1, p1, Ly00/f6;->w:Ljava/lang/String;

    iget-object p1, p1, Ly00/f6;->x:Ljava/lang/String;

    invoke-static {v0, p2, v1, p1}, Lv8/b;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_b
    :goto_3
    return-object v1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public e(La30/w0;)Li9/k;
    .locals 5

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lgm/j;->w:Landroid/content/Context;

    if-eqz v1, :cond_1

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.amazon.hardware.tv_screen"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p1, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lu8/p;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v0}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lx8/t;->A(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DMCodecAdapterFactory"

    invoke-static {v2, v1}, Lx8/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lqg3/d;

    new-instance v2, Lhn/b;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lhn/b;-><init>(II)V

    new-instance v3, Lhn/b;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Lhn/b;-><init>(II)V

    const/16 v0, 0x11

    invoke-direct {v1, v0, v2, v3}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lqg3/d;->n(La30/w0;)Li9/b;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lg73/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    invoke-virtual {v0, p1}, Lg73/d;->e(La30/w0;)Li9/k;

    move-result-object p1

    return-object p1
.end method

.method public f()Lm5/i;
    .locals 7

    iget-object v0, p0, Lgm/j;->w:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x84

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-eqz v1, :cond_1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz v5, :cond_0

    const-string v6, "androidx.credentials.CREDENTIAL_PROVIDER_KEY"

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    return-object v3

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v3

    :catchall_0
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :try_start_0
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.credentials.CredentialProvider"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lm5/i;

    invoke-interface {v4}, Lm5/i;->isAvailableOnDevice()Z

    move-result v5

    if-eqz v5, :cond_3

    if-eqz v2, :cond_4

    const-string v4, "CredProviderFactory"

    const-string v5, "Only one active OEM CredentialProvider allowed"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_4
    move-object v2, v4

    goto :goto_1

    :cond_5
    move-object v3, v2

    :goto_2
    return-object v3
.end method
