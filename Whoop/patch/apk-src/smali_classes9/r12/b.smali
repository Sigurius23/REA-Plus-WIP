.class public final synthetic Lr12/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;I)V
    .locals 0

    iput p2, p0, Lr12/b;->w:I

    iput-object p1, p0, Lr12/b;->x:Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr12/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr12/b;->x:Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;

    invoke-static {v0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->y(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lr12/b;->x:Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;

    invoke-static {v0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->A(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lr12/b;->x:Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;

    invoke-static {v0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->z(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
