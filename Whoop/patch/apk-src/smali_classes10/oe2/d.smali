.class public final synthetic Loe2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Loe2/d;->w:I

    iput-object p1, p0, Loe2/d;->x:Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loe2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loe2/d;->x:Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Loe2/d;->x:Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->y(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
