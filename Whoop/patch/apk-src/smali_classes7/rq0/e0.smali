.class public final synthetic Lrq0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lrq0/e0;->a:I

    iput-object p1, p0, Lrq0/e0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    iget v0, p0, Lrq0/e0;->a:I

    iget-object v1, p0, Lrq0/e0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/whoop/community/CommunityRemoveMembersFragment;

    invoke-static {v1, p1, p2}, Lcom/whoop/community/CommunityRemoveMembersFragment;->O(Lcom/whoop/community/CommunityRemoveMembersFragment;Landroid/view/View;Z)V

    return-void

    :pswitch_0
    check-cast v1, Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-static {v1, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->F(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Z)V

    return-void

    :pswitch_1
    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iget-object v0, v1, Lcom/stripe/android/view/StripeEditText;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View$OnFocusChangeListener;

    invoke-interface {v2, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lcom/stripe/android/view/StripeEditText;->T:Landroid/view/View$OnFocusChangeListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_1
    return-void

    :pswitch_2
    check-cast v1, Lcom/stripe/android/view/ExpiryDateEditText;

    sget-object p1, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    if-nez p2, :cond_3

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean p1, v1, Lcom/stripe/android/view/ExpiryDateEditText;->W:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_3
    :goto_1
    return-void

    :pswitch_3
    check-cast v1, Lcom/stripe/android/view/CvcEditText;

    invoke-static {v1, p2}, Lcom/stripe/android/view/CvcEditText;->d(Lcom/stripe/android/view/CvcEditText;Z)V

    return-void

    :pswitch_4
    check-cast v1, Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-static {v1, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->O(Lcom/stripe/android/view/CountryTextInputLayout;Z)V

    return-void

    :pswitch_5
    check-cast v1, Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v1, p2}, Lcom/stripe/android/view/CardNumberEditText;->d(Lcom/stripe/android/view/CardNumberEditText;Z)V

    return-void

    :pswitch_6
    check-cast v1, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-static {v1, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->I(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/view/View;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
