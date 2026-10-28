.class public final synthetic Lvs2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V
    .locals 0

    iput p2, p0, Lvs2/b;->w:I

    iput-object p1, p0, Lvs2/b;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvs2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvs2/b;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    check-cast p1, Lts2/a;

    invoke-static {v0, p1}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->D(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lts2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvs2/b;->x:Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    check-cast p1, Lus2/d;

    invoke-static {v0, p1}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->B(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lus2/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
