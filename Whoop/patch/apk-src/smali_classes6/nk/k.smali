.class public final Lnk/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnk/m;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lnk/k;->w:I

    iput-object p1, p0, Lnk/k;->x:Lnk/m;

    iput-object p2, p0, Lnk/k;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lnk/k;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lnk/k;

    iget-object v0, p0, Lnk/k;->y:Ljava/lang/Object;

    const/4 v1, 0x3

    iget-object v2, p0, Lnk/k;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lnk/k;

    iget-object v0, p0, Lnk/k;->y:Ljava/lang/Object;

    const/4 v1, 0x2

    iget-object v2, p0, Lnk/k;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lnk/k;

    iget-object v0, p0, Lnk/k;->y:Ljava/lang/Object;

    const/4 v1, 0x1

    iget-object v2, p0, Lnk/k;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lnk/k;

    iget-object v0, p0, Lnk/k;->y:Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lnk/k;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnk/k;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lnk/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lnk/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lnk/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lnk/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lnk/k;->w:I

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lnk/k;->y:Ljava/lang/Object;

    iget-object v4, p0, Lnk/k;->x:Lnk/m;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lnk/m;->a:Ldk/f;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ldk/f;->h(Ljava/lang/String;)V

    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lnk/m;->a:Ldk/f;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ldk/f;->h(Ljava/lang/String;)V

    return-object v2

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lnk/m;->a:Ldk/f;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ldk/f;->h(Ljava/lang/String;)V

    return-object v2

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lnk/m;->a:Ldk/f;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ldk/f;->h(Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
