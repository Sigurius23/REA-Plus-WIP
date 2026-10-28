.class public final synthetic Leo0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;I)V
    .locals 0

    iput p2, p0, Leo0/d;->w:I

    iput-object p1, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leo0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->B(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->E(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->D(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->F(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Leo0/d;->x:Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->C(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;)Leo0/h;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
