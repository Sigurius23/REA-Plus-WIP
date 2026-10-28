.class public final Lc0/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lc0/h;->w:I

    iput-object p1, p0, Lc0/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc0/h;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc0/h;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc0/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc0/h;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    :try_start_0
    iget-object v1, p0, Lc0/h;->y:Ljava/lang/Object;

    check-cast v1, Lne3/j;

    invoke-interface {v1, p1}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput p1, v0, Lkotlin/jvm/internal/e0;->w:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lc0/h;->z:Ljava/lang/Object;

    check-cast v0, Le63/e;

    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/net/SocketTimeoutException;

    invoke-static {v0, p1}, Lj93/l0;->e(Le63/e;Ljava/net/SocketTimeoutException;)Lio/ktor/client/network/sockets/SocketTimeoutException;

    move-result-object p1

    :cond_0
    throw p1

    :pswitch_0
    check-cast p1, Landroidx/lifecycle/g0;

    iget-object v0, p0, Lc0/h;->x:Ljava/lang/Object;

    check-cast v0, Lhb/f;

    iget-object v1, v0, Lhb/f;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Lc0/h;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/m0;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x1

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    if-nez v3, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_4

    iget-object v0, v0, Lhb/f;->i:La3/m1;

    iget-object v1, p0, Lc0/h;->z:Ljava/lang/Object;

    check-cast v1, Leb/q;

    invoke-virtual {v0, v1}, La3/m1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lc0/h;->x:Ljava/lang/Object;

    check-cast p1, Lg/z;

    iget-object v0, p0, Lc0/h;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lc0/h;->z:Ljava/lang/Object;

    check-cast v1, Lh/k;

    invoke-virtual {p1, v0, v1}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    new-instance p1, Lb3/q0;

    const/4 v0, 0x2

    invoke-direct {p1, v1, v0}, Lb3/q0;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_2
    check-cast p1, Li2/g0;

    iget-object v0, p0, Lc0/h;->y:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lc0/h;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_5

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    check-cast p1, Li2/x0;

    invoke-virtual {p1, v1}, Li2/x0;->a(F)V

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_2
    invoke-virtual {p1, v1}, Li2/x0;->p(F)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v2

    :cond_7
    invoke-virtual {p1, v2}, Li2/x0;->r(F)V

    iget-object v0, p0, Lc0/h;->z:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/e1;

    iget-wide v0, v0, Li2/e1;->a:J

    goto :goto_3

    :cond_8
    sget-wide v0, Li2/e1;->b:J

    :goto_3
    invoke-virtual {p1, v0, v1}, Li2/x0;->y(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lc0/h;->x:Ljava/lang/Object;

    check-cast p1, Lz1/p;

    iget-object v0, p0, Lc0/h;->z:Ljava/lang/Object;

    check-cast v0, Lc0/x;

    new-instance v1, Lc0/g;

    const/4 v2, 0x0

    iget-object v3, p0, Lc0/h;->y:Ljava/lang/Object;

    invoke-direct {v1, p1, v3, v0, v2}, Lc0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
