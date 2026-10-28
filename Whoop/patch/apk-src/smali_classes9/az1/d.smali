.class public final synthetic Laz1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/mfa/setup/view/MfaSetupFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/mfa/setup/view/MfaSetupFragment;I)V
    .locals 0

    iput p2, p0, Laz1/d;->w:I

    iput-object p1, p0, Laz1/d;->x:Lcom/whoop/mfa/setup/view/MfaSetupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laz1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laz1/d;->x:Lcom/whoop/mfa/setup/view/MfaSetupFragment;

    invoke-static {v0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->y(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laz1/d;->x:Lcom/whoop/mfa/setup/view/MfaSetupFragment;

    invoke-static {v0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->z(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
