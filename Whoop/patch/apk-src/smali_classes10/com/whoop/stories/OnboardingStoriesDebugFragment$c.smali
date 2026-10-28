.class final Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/stories/OnboardingStoriesDebugFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# instance fields
.field final synthetic w:Lcom/whoop/stories/OnboardingStoriesDebugFragment;

.field final synthetic x:Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;


# direct methods
.method public constructor <init>(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;->w:Lcom/whoop/stories/OnboardingStoriesDebugFragment;

    iput-object p2, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;->x:Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;->w:Lcom/whoop/stories/OnboardingStoriesDebugFragment;

    iget-object v0, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;->x:Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    invoke-virtual {v0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;->b()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->K(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$c;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
