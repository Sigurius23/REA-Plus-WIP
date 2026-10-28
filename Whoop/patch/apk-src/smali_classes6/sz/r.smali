.class public final Lsz/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

.field public final synthetic z:Lj/d;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lj/d;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lsz/r;->w:I

    iput-object p1, p0, Lsz/r;->y:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    iput-object p2, p0, Lsz/r;->z:Lj/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lsz/r;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lsz/r;

    iget-object v0, p0, Lsz/r;->z:Lj/d;

    const/4 v1, 0x1

    iget-object v2, p0, Lsz/r;->y:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    invoke-direct {p1, v2, v0, p2, v1}, Lsz/r;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lj/d;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lsz/r;

    iget-object v0, p0, Lsz/r;->z:Lj/d;

    const/4 v1, 0x0

    iget-object v2, p0, Lsz/r;->y:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    invoke-direct {p1, v2, v0, p2, v1}, Lsz/r;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lj/d;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsz/r;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lsz/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsz/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsz/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lsz/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsz/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsz/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsz/r;->w:I

    iget-object v1, p0, Lsz/r;->z:Lj/d;

    iget-object v2, p0, Lsz/r;->y:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lsz/r;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    new-instance v3, Lsz/r;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v2, v1, v5, v6}, Lsz/r;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lj/d;Lq83/d;I)V

    iput v4, p0, Lsz/r;->x:I

    invoke-static {v2, p1, v3, p0}, Landroidx/lifecycle/o1;->m(Landroidx/lifecycle/g0;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;

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

    iget v5, p0, Lsz/r;->x:I

    if-eqz v5, :cond_4

    if-eq v5, v4, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->z:I

    invoke-virtual {v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object p1

    iget-object p1, p1, Lsz/z;->N:Lec3/q1;

    new-instance v3, Landroidx/room/x;

    const/16 v5, 0xe

    invoke-direct {v3, v5, v1, v2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v4, p0, Lsz/r;->x:I

    iget-object p1, p1, Lec3/q1;->w:Lec3/t1;

    invoke-interface {p1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
