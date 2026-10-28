.class public final synthetic Lcz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/customersheet/CustomerSheetActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V
    .locals 0

    iput p2, p0, Lcz/c;->w:I

    iput-object p1, p0, Lcz/c;->x:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcz/c;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lcz/c;->x:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object v0

    sget-object v2, Lcz/s;->a:Lcz/s;

    invoke-virtual {v0, v2}, Lcz/n0;->n(Lcz/b0;)V

    return-object v1

    :pswitch_0
    sget v0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object v0

    sget-object v2, Lcz/m;->a:Lcz/m;

    invoke-virtual {v0, v2}, Lcz/n0;->n(Lcz/b0;)V

    return-object v1

    :pswitch_1
    iget-object v0, v2, Lcom/stripe/android/customersheet/CustomerSheetActivity;->x:Lcz/c;

    invoke-virtual {v0}, Lcz/c;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/a2;

    return-object v0

    :pswitch_2
    sget v0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    new-instance v0, La20/h;

    iget-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetActivity;->w:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcz/g;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_3
    sget v0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcz/g;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
