.class public final Ld0/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ld0/d;->w:I

    iput-object p1, p0, Ld0/d;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ld0/d;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld0/d;

    iget-object v1, p0, Ld0/d;->x:Ljava/lang/Object;

    check-cast v1, Ln00/k;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p1, v2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld0/d;

    iget-object v1, p0, Ld0/d;->x:Ljava/lang/Object;

    check-cast v1, Lh53/e;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p1, v2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Ld0/d;

    iget-object v1, p0, Ld0/d;->x:Ljava/lang/Object;

    check-cast v1, Lf53/j;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Ld0/d;

    iget-object v1, p0, Ld0/d;->x:Ljava/lang/Object;

    check-cast v1, Ld0/e;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld0/d;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Ld0/d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    invoke-virtual {p0, p1}, Ld0/d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_1
    invoke-virtual {p0, p1}, Ld0/d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_2
    invoke-virtual {p0, p1}, Ld0/d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ld0/d;->w:I

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Ld0/d;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ln00/k;

    sget-object p1, Ln00/d;->y:Ln00/d;

    sget v0, Ln00/k;->R:I

    invoke-virtual {v3, p1}, Ln00/k;->q(Ln00/d;)V

    invoke-virtual {v3, v1, v1}, Ln00/k;->o(Ljava/lang/Throwable;Lzy/c;)V

    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Lh53/e;

    new-instance p1, Lv33/x;

    new-instance v4, Lstream/video/sfu/event/SfuRequest;

    new-instance v6, Lstream/video/sfu/event/HealthCheckRequest;

    const/4 v0, 0x1

    invoke-direct {v6, v1, v0, v1}, Lstream/video/sfu/event/HealthCheckRequest;-><init>(Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lstream/video/sfu/event/SfuRequest;-><init>(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v4}, Lv33/x;-><init>(Lstream/video/sfu/event/SfuRequest;)V

    invoke-virtual {v3, p1}, Lh53/e;->e(Lv33/x;)Z

    return-object v2

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Lf53/j;

    iget-object p1, v3, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p1

    iget-object p1, p1, Ly43/b;->d:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg53/m;

    instance-of v0, p1, Lg53/c;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lg53/c;

    :cond_0
    if-eqz v1, :cond_1

    iget-object p1, v1, Lg53/c;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    if-eqz p1, :cond_1

    iget-object v0, v3, Lf53/j;->h:Lq/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lq/f;->C0(Lio/getstream/android/video/generated/models/VideoEvent;)Z

    :cond_1
    return-object v2

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ld0/e;

    invoke-static {v3}, Ld0/e;->b(Ld0/e;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
