.class final Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->storeEntriesInLocalDatabase(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.onboarding.OnboardingStatusInteractor"
    f = "OnboardingStatusInteractor.kt"
    l = {
        0x9d,
        0x9f
    }
    m = "storeEntriesInLocalDatabase"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$storeEntriesInLocalDatabase(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
