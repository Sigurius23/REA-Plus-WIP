.class public final Lj00/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lj00/n;->w:I

    iput-object p1, p0, Lj00/n;->x:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lj00/n;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lj00/n;

    iget-object v0, p0, Lj00/n;->x:Lc93/a;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lj00/n;-><init>(Lc93/a;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lj00/n;

    iget-object v0, p0, Lj00/n;->x:Lc93/a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lj00/n;-><init>(Lc93/a;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj00/n;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lj00/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj00/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lj00/n;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lj00/n;->x:Lc93/a;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
