.class public final synthetic Lvs2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V
    .locals 0

    iput p2, p0, Lvs2/a;->w:I

    iput-object p1, p0, Lvs2/a;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvs2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvs2/a;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->y(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Lts2/b;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvs2/a;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->z(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvs2/a;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->C(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
