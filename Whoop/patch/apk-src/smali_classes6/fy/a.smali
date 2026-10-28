.class public final Lfy/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lfy/a;->w:I

    iput-object p1, p0, Lfy/a;->y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lfy/a;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lfy/a;

    iget-object v0, p0, Lfy/a;->y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lfy/a;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lfy/a;

    iget-object v0, p0, Lfy/a;->y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lfy/a;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfy/a;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lfy/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfy/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfy/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lfy/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfy/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfy/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lfy/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfy/a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfy/a;->y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    iget-object v1, p1, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfy/g;

    iput v2, p0, Lfy/a;->x:I

    invoke-virtual {v1, p1, p0}, Lfy/g;->g(Landroidx/fragment/app/r0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfy/a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfy/a;->y:Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    iget-object v1, p1, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfy/g;

    iget-object v1, v1, Lfy/g;->z:Lec3/w1;

    new-instance v3, Lu;

    const/16 v4, 0x8

    invoke-direct {v3, p1, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lfy/a;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
