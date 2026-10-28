.class public final Lob/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput p1, p0, Lob/a;->w:I

    iput-object p2, p0, Lob/a;->y:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lob/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lob/a;

    iget-object v1, p0, Lob/a;->y:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p2}, Lob/a;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lob/a;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lob/a;

    iget-object v1, p0, Lob/a;->y:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p2}, Lob/a;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lob/a;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lob/a;->w:I

    check-cast p1, Landroidx/room/v1;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lob/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lob/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lob/a;->w:I

    iget-object v1, p0, Lob/a;->y:Lkotlin/jvm/functions/Function1;

    const-string v2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lob/a;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/room/v1;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb/b0;

    invoke-interface {p1}, Llb/b0;->d()Ltb/a;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lob/a;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/room/v1;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb/b0;

    invoke-interface {p1}, Llb/b0;->d()Ltb/a;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
