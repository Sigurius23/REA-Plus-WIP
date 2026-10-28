.class public final synthetic Lch/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(Ly2/j1;I)V
    .locals 0

    iput p2, p0, Lch/m;->w:I

    iput-object p1, p0, Lch/m;->x:Ly2/j1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch/m;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch/m;->x:Ly2/j1;

    check-cast p1, Ly2/i1;

    invoke-static {v0, p1}, Lr71/b;->h(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lch/m;->x:Ly2/j1;

    check-cast p1, Ly2/i1;

    invoke-static {v0, p1}, Lhb1/m;->p(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lch/m;->x:Ly2/j1;

    check-cast p1, Ly2/i1;

    invoke-static {v0, p1}, Lez0/b;->b(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lch/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
