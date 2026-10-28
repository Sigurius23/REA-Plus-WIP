.class public final Lnk/l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnk/m;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lnk/l;->w:I

    iput-object p1, p0, Lnk/l;->x:Lnk/m;

    iput-object p2, p0, Lnk/l;->y:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lnk/l;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lnk/l;

    iget-object v0, p0, Lnk/l;->y:Ljava/lang/String;

    const/4 v1, 0x2

    iget-object v2, p0, Lnk/l;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lnk/l;

    iget-object v0, p0, Lnk/l;->y:Ljava/lang/String;

    const/4 v1, 0x1

    iget-object v2, p0, Lnk/l;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lnk/l;

    iget-object v0, p0, Lnk/l;->y:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lnk/l;->x:Lnk/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnk/l;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lnk/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lnk/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lnk/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnk/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnk/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lnk/l;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lnk/l;->y:Ljava/lang/String;

    iget-object v3, p0, Lnk/l;->x:Lnk/m;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Lnk/m;->a:Ldk/f;

    invoke-virtual {p1, v2}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Lnk/m;->a:Ldk/f;

    invoke-virtual {p1, v2}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Lnk/m;->a:Ldk/f;

    invoke-virtual {p1, v2}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
