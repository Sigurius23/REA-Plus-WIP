.class public final synthetic Llh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stories/OnboardingStoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stories/OnboardingStoryFragment;I)V
    .locals 0

    iput p2, p0, Llh2/d;->w:I

    iput-object p1, p0, Llh2/d;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llh2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh2/d;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-static {v0}, Lcom/whoop/stories/OnboardingStoryFragment;->E(Lcom/whoop/stories/OnboardingStoryFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llh2/d;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-static {v0}, Lcom/whoop/stories/OnboardingStoryFragment;->J(Lcom/whoop/stories/OnboardingStoryFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llh2/d;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-static {v0}, Lcom/whoop/stories/OnboardingStoryFragment;->I(Lcom/whoop/stories/OnboardingStoryFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llh2/d;->x:Lcom/whoop/stories/OnboardingStoryFragment;

    invoke-static {v0}, Lcom/whoop/stories/OnboardingStoryFragment;->H(Lcom/whoop/stories/OnboardingStoryFragment;)Luf3/a;

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
