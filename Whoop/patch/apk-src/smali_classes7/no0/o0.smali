.class public final synthetic Lno0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lno0/o0;->w:I

    iput-object p2, p0, Lno0/o0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lno0/o0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno0/o0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Llo0/v0;

    invoke-static {v0, v1}, Lno0/c1;->b(Lkotlin/jvm/functions/Function1;Llo0/v0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/models/AppointmentButtonModel;

    invoke-static {v0, v1}, Lno0/w0;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Llo0/k0;

    invoke-static {v0, v1}, Lno0/p0;->b(Lkotlin/jvm/functions/Function1;Llo0/k0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Llo0/d0;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lno0/l0;->G(Llo0/d0;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lz1/s;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Llo0/b0$b;

    invoke-static {v0, v1}, Lno0/g0;->m(Lz1/s;Llo0/b0$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v0, v1}, Lno0/p;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/AnyModal;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Lhy0/h0;

    invoke-static {v0, v1}, Lno0/p;->f(Lkotlin/jvm/functions/Function1;Lhy0/h0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Llo0/a;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lno0/b;->b(Llo0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lno0/o0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lno0/o0;->y:Ljava/lang/Object;

    check-cast v1, Ly3/c;

    invoke-static {v0, v1}, Lno0/n0$b;->f(Lp1/t2;Ly3/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
