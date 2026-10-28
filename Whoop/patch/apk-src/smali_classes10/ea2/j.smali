.class public final synthetic Lea2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/OnboardingStatusDebugFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V
    .locals 0

    iput p2, p0, Lea2/j;->w:I

    iput-object p1, p0, Lea2/j;->x:Lcom/whoop/settings/OnboardingStatusDebugFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/j;->x:Lcom/whoop/settings/OnboardingStatusDebugFragment;

    invoke-static {v0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->z(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lea2/j;->x:Lcom/whoop/settings/OnboardingStatusDebugFragment;

    invoke-static {v0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->y(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lea2/j;->x:Lcom/whoop/settings/OnboardingStatusDebugFragment;

    invoke-static {v0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->D(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lea2/j;->x:Lcom/whoop/settings/OnboardingStatusDebugFragment;

    invoke-static {v0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->C(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
