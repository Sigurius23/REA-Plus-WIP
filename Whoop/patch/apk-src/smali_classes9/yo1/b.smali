.class public final synthetic Lyo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyo1/b;->w:I

    iput-object p2, p0, Lyo1/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lyo1/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lyo1/b;->w:I

    iput-object p1, p0, Lyo1/b;->y:Ljava/lang/Object;

    iput-object p2, p0, Lyo1/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lyo1/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lyo1/b;->y:Ljava/lang/Object;

    iget-object v3, p0, Lyo1/b;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lzy2/f;

    invoke-static {v3, v2}, Lzy2/d;->h(Lkotlin/jvm/functions/Function1;Lzy2/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Lcom/whoop/membership/management/MembershipManagementFragment;

    check-cast v2, Leb/u0;

    invoke-static {v3, v2}, Lcom/whoop/membership/management/MembershipManagementFragment;->G(Lcom/whoop/membership/management/MembershipManagementFragment;Leb/u0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v3, Lg2/i;

    check-cast v2, Lp1/c1;

    invoke-static {v3, v2}, Lzv2/e;->d(Lg2/i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v2, Lzt2/h;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lzt2/i;->b(Lzt2/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lzt2/e;

    invoke-static {v3, v2}, Lzt2/d;->b(Lkotlin/jvm/functions/Function1;Lzt2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lzt2/b;

    invoke-static {v3, v2}, Lzt2/c;->b(Lkotlin/jvm/functions/Function1;Lzt2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lds1/a$a;

    invoke-static {v3, v2}, Lzr1/b;->d(Lkotlin/jvm/functions/Function1;Lds1/a$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v3, Lbc3/c0;

    check-cast v2, Lzq0/p;

    invoke-static {v3, v2}, Lzq0/f;->n(Lbc3/c0;Lzq0/p;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lzm1/f;

    invoke-static {v3, v2}, Lzm1/e;->f(Lkotlin/jvm/functions/Function1;Lzm1/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v3, Lr31/f;

    check-cast v2, Ljava/lang/String;

    invoke-static {v3, v2}, Lzl0/j;->b(Lr31/f;Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lyi1/o;

    invoke-static {v3, v2}, Lzi1/a0;->c(Lkotlin/jvm/functions/Function1;Lyi1/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lyi1/i;

    invoke-static {v3, v2}, Lzi1/q;->f(Lkotlin/jvm/functions/Function1;Lyi1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v2, Lyi1/k;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lzi1/d;->b(Lyi1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lti0/g;

    invoke-static {v3, v2}, Lzi0/c;->c(Lkotlin/jvm/functions/Function1;Lti0/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v3, Ln0/u;

    check-cast v2, Lp1/a1;

    invoke-static {v3, v2}, Lzi0/a;->h(Ln0/u;Lp1/a1;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lti0/e;

    invoke-static {v3, v2}, Lzi0/a;->e(Lkotlin/jvm/functions/Function1;Lti0/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v3, Lp1/c1;

    check-cast v2, Lid2/j;

    invoke-static {v3, v2}, Lzc1/k7;->a(Lp1/c1;Lid2/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lx50/c$c;

    invoke-static {v3, v2}, Lz50/d;->g(Lkotlin/jvm/functions/Function1;Lx50/c$c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v2, Lx50/c;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lz50/c;->c(Lx50/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v3, Landroid/content/Context;

    check-cast v2, Landroid/view/textclassifier/TextClassification;

    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const/high16 v4, 0xc000000

    invoke-static {v3, v0, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-lt v2, v3, :cond_1

    invoke-static {v0}, Lb3/g1;->q(Landroid/app/PendingIntent;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/app/PendingIntent;->send()V

    :goto_1
    return-object v1

    :pswitch_13
    check-cast v3, Lb1/f;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    invoke-interface {v3, v0}, Lb1/f;->G0(Ly2/y;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lvo/b;->C(J)J

    move-result-wide v0

    new-instance v2, Ly3/j;

    invoke-direct {v2, v0, v1}, Ly3/j;-><init>(J)V

    return-object v2

    :pswitch_14
    check-cast v3, Lx0/d;

    check-cast v2, Lx0/g;

    iget-object v0, v3, Lx0/d;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_15
    check-cast v3, Lkotlin/jvm/internal/g0;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v1

    :pswitch_16
    check-cast v2, Lyz0/c;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lyz0/b;->c(Lyz0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v3, Lab/i0;

    check-cast v2, Lyy/m0;

    iget-object v0, v3, Lab/i0;->z:Ljava/lang/Object;

    check-cast v0, Lyy/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "request"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyy/j0;

    new-instance v1, Lx31/a;

    const/16 v4, 0x14

    invoke-direct {v1, v4}, Lx31/a;-><init>(I)V

    new-instance v4, Ljava/net/URL;

    invoke-virtual {v2}, Lyy/m0;->getUrl()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1, v4, v2}, Lx31/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v4}, Lyy/j0;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    invoke-virtual {v2}, Lyy/m0;->getUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v3, Lab/i0;->F:Ljava/lang/Object;

    check-cast v2, Lqy/d;

    :try_start_0
    invoke-virtual {v0}, Lyy/j0;->b()Lyy/n0;

    move-result-object v0

    invoke-virtual {v0}, Lyy/n0;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lqy/d;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_2

    check-cast v0, Lyy/n0;

    return-object v0

    :cond_2
    const-string v0, "Exception while making Stripe API request"

    invoke-virtual {v2, v0, v3}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of v0, v3, Ljava/io/IOException;

    if-eqz v0, :cond_3

    sget v0, Lcom/stripe/android/core/exception/APIConnectionException;->F:I

    check-cast v3, Ljava/io/IOException;

    invoke-static {v3, v1}, Ls4/a;->a(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object v3

    :cond_3
    throw v3

    :pswitch_18
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lxu2/a;

    invoke-static {v3, v2}, Lyu2/e;->h(Lkotlin/jvm/functions/Function1;Lxu2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lwt2/q;

    invoke-static {v3, v2}, Lyt2/m;->b(Lkotlin/jvm/functions/Function1;Lwt2/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lwt2/k;

    invoke-static {v3, v2}, Lyt2/k;->r(Lkotlin/jvm/functions/Function1;Lwt2/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lwt2/f$a;

    invoke-static {v3, v2}, Lyt2/c;->a(Lkotlin/jvm/functions/Function1;Lwt2/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lyo1/d;

    invoke-static {v3, v2}, Lyo1/c;->a(Lkotlin/jvm/functions/Function1;Lyo1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

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
