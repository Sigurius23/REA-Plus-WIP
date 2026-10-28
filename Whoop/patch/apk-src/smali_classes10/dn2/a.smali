.class public final synthetic Ldn2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;I)V
    .locals 0

    iput p2, p0, Ldn2/a;->w:I

    iput-object p1, p0, Ldn2/a;->x:Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldn2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn2/a;->x:Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;

    invoke-static {v0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->z(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldn2/a;->x:Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;

    invoke-static {v0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->A(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
