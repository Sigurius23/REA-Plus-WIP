.class public final Lc20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lv03/e;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc20/g;->w:I

    iput-object p2, p0, Lc20/g;->x:Lv03/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv03/e;I)V
    .locals 0

    .line 2
    iput p2, p0, Lc20/g;->w:I

    iput-object p1, p0, Lc20/g;->x:Lv03/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lc20/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Lv00/c0;

    const-string v1, "paymentMethodMetadata"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lsz/e;

    invoke-direct {v1, v0}, Lsz/e;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_4
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k1;

    new-instance v1, Ls10/f;

    invoke-direct {v1, v0}, Ls10/f;-><init>(Landroidx/lifecycle/k1;)V

    return-object v1

    :pswitch_5
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Lh20/f0;

    const-string v1, "args"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lh20/f0;->G:Ljava/lang/String;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Li20/c0;

    const-string v1, "args"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Li20/p0;

    iget-object v0, v0, Li20/c0;->x:Ljava/lang/String;

    invoke-direct {v1, v0}, Li20/p0;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_9
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Ln20/u;

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ln20/u;->x:Landroidx/lifecycle/k1;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Ln10/l;

    new-instance v1, Ln10/m;

    invoke-direct {v1, v0}, Ln10/m;-><init>(Ln10/l;)V

    return-object v1

    :pswitch_c
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_2

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v1, "key_publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    sput-object v1, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-object v1

    :pswitch_d
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lv10/a;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPackageName(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lv10/a;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_f
    iget-object v0, p0, Lc20/g;->x:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    new-instance v1, Ld1/j;

    invoke-direct {v1, v0}, Ld1/j;-><init>(Lq83/j;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
