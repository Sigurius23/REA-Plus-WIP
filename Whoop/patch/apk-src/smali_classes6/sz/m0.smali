.class public final synthetic Lsz/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;I)V
    .locals 0

    iput p2, p0, Lsz/m0;->w:I

    iput-object p1, p0, Lsz/m0;->x:Landroid/app/Application;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lsz/m0;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "context"

    iget-object v1, p0, Lsz/m0;->x:Landroid/app/Application;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_2

    new-instance v0, Lux/x;

    invoke-direct {v0, v1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

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

    move-object v0, v3

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    sput-object v0, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    iget-object v0, v0, Lux/y;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    const-string v0, "context"

    iget-object v1, p0, Lsz/m0;->x:Landroid/app/Application;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_5

    new-instance v0, Lux/x;

    invoke-direct {v0, v1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v1, "key_publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v3

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    sput-object v0, Lux/y;->y:Lux/y;

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
