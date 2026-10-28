.class public final Lb30/l0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lb30/m0;


# direct methods
.method public synthetic constructor <init>(Lb30/m0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lb30/l0;->w:I

    iput-object p1, p0, Lb30/l0;->y:Lb30/m0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lb30/l0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lb30/l0;

    iget-object v1, p0, Lb30/l0;->y:Lb30/m0;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lb30/l0;-><init>(Lb30/m0;Lq83/d;I)V

    iput-object p1, v0, Lb30/l0;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lb30/l0;

    iget-object v1, p0, Lb30/l0;->y:Lb30/m0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lb30/l0;-><init>(Lb30/m0;Lq83/d;I)V

    iput-object p1, v0, Lb30/l0;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/l0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb30/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/l0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/l0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lh20/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/l0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/l0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/l0;->w:I

    iget-object v1, p0, Lb30/l0;->y:Lb30/m0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/l0;->x:Ljava/lang/Object;

    check-cast p1, Lb30/s;

    iget-object v0, v1, Lb30/m0;->j:Lb30/m;

    invoke-virtual {v1, p1, v0}, Lb30/m0;->c(Lb30/s;Lb30/m;)Lb30/c1;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/l0;->x:Ljava/lang/Object;

    check-cast p1, Lh20/a;

    iget-object v0, v1, Lb30/m0;->g:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
