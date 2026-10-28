.class public final synthetic Ll72/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Ll72/k;->w:I

    iput-object p1, p0, Ll72/k;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll72/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll72/k;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    check-cast p1, La72/a;

    invoke-static {v0, p1}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->y(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;La72/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll72/k;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    check-cast p1, Lj72/h;

    invoke-static {v0, p1}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->B(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;Lj72/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
