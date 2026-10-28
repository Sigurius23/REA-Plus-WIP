.class public final Lo23/g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo23/a;

.field public final synthetic y:Ln23/h;


# direct methods
.method public synthetic constructor <init>(Lo23/a;Ln23/h;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lo23/g;->w:I

    iput-object p1, p0, Lo23/g;->x:Lo23/a;

    iput-object p2, p0, Lo23/g;->y:Ln23/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lo23/g;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x5

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x4

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x3

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x2

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x1

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lo23/g;

    iget-object v0, p0, Lo23/g;->y:Ln23/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lo23/g;->x:Lo23/a;

    invoke-direct {p1, v2, v0, p2, v1}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo23/g;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lo23/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lo23/g;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lo23/g;->y:Ln23/h;

    iget-object v3, p0, Lo23/g;->x:Lo23/a;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lo23/a;->onResult(Ln23/h;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
