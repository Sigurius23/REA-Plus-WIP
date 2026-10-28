.class public final synthetic Llh2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stories/OnboardingStoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stories/OnboardingStoryFragment;I)V
    .locals 0

    iput p2, p0, Llh2/c;->w:I

    iput-object p1, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llh2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    check-cast p1, Lp12/g;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoryFragment;->M(Lcom/whoop/stories/OnboardingStoryFragment;Lp12/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    check-cast p1, Lp12/e;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoryFragment;->N(Lcom/whoop/stories/OnboardingStoryFragment;Lp12/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    check-cast p1, Lp12/e;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoryFragment;->L(Lcom/whoop/stories/OnboardingStoryFragment;Lp12/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoryFragment;->P(Lcom/whoop/stories/OnboardingStoryFragment;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Llh2/c;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    check-cast p1, Ltw0/c;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoryFragment;->F(Lcom/whoop/stories/OnboardingStoryFragment;Ltw0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
