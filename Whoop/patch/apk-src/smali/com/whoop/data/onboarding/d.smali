.class public final synthetic Lcom/whoop/data/onboarding/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/onboarding/d;->w:I

    iput-object p1, p0, Lcom/whoop/data/onboarding/d;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/whoop/data/onboarding/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/onboarding/d;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->a(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/onboarding/d;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->b(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
