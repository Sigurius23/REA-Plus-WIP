.class public final synthetic Lcom/whoop/data/onboarding/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/onboarding/b;->w:I

    iput-object p1, p0, Lcom/whoop/data/onboarding/b;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/data/onboarding/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/onboarding/b;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    check-cast p1, Lcom/whoop/domain/model/Login;

    invoke-static {v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->c(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Login;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/onboarding/b;->x:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    check-cast p1, Lcom/whoop/domain/model/Logout;

    invoke-static {v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->e(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Logout;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
