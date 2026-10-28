.class public final synthetic Lsg2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lsg2/b;->w:I

    iput-object p1, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsg2/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ldq/j;

    iget-object p1, p1, Ldq/j;->w:Landroid/app/PendingIntent;

    const-string v0, "getPaymentCardRecognitionPendingIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string v0, "getIntentSender(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2, v2}, Lj/l;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    iget-object p1, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Luz1/h;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lrv2/d;

    invoke-static {v0, p1}, Luu2/s;->a(Lkotlin/jvm/functions/Function1;Lrv2/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lui0/r;->b(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    invoke-static {v0, p1}, Lui0/n;->g(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/whoop/settings/journalv2/e;->d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/whoop/settings/journalv2/e;->f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lu21/b;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lu11/i;->s(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lu11/i;->B(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ltz0/a;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lty1/i;->j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Ltx0/d;->e(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Ltu2/b;->g(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Ltu2/b;->a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lqu1/c$a;

    invoke-static {v0, p1}, Ltu1/d;->c(Lkotlin/jvm/functions/Function1;Lqu1/c$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lqu1/b;

    invoke-static {v0, p1}, Ltu1/d;->a(Lkotlin/jvm/functions/Function1;Lqu1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ltj1/b;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lte1/b;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lt80/a;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lt71/m;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lt11/e;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lsz0/r1;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lsx0/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lsv2/e;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lsu1/c;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lnj1/a;

    invoke-static {v0, p1}, Lsj1/a;->c(Lkotlin/jvm/functions/Function1;Lnj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lsg2/j;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lsg2/c;->a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lsg2/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lsg2/c;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

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
