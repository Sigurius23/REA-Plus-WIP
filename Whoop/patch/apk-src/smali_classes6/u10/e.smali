.class public final synthetic Lu10/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V
    .locals 0

    iput p2, p0, Lu10/e;->w:I

    iput-object p1, p0, Lu10/e;->x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lu10/e;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lu10/e;->x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->p(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V

    invoke-virtual {v2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    return-object v1

    :pswitch_0
    invoke-virtual {v2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object v0

    sget-object v2, Lu10/k;->b:Lu10/k;

    invoke-virtual {v0, v2}, Lu10/q;->a(Lu10/j;)V

    return-object v1

    :pswitch_1
    sget v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    iget-object v0, v2, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu10/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    sget v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    new-instance v0, La20/h;

    new-instance v1, Lu10/e;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lu10/e;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_3
    sget v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "extra_activity_args"

    const-class v2, Lu10/i;

    invoke-static {v0, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu10/i;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
