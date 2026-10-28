.class public final Lh0/i3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh0/h2;


# direct methods
.method public synthetic constructor <init>(Lh0/h2;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lh0/i3;->w:I

    iput-object p1, p0, Lh0/i3;->x:Lh0/h2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lh0/i3;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Lh0/i3;

    iget-object v0, p0, Lh0/i3;->x:Lh0/h2;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/i3;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lh0/i3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/i3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lh0/i3;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lh0/i3;->x:Lh0/h2;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->c()V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->b()V

    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->c()V

    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->c()V

    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->b()V

    return-object v1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->c()V

    return-object v1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->c()V

    return-object v1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh0/h2;->b()V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
