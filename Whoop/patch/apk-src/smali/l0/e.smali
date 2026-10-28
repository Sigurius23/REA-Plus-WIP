.class public final Ll0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/i;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(ILjava/lang/String;)Ll0/b;
    .locals 1

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    new-instance v0, Ll0/b;

    invoke-direct {v0, p0, p1}, Ll0/b;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static final d(ILjava/lang/String;)Ll0/z1;
    .locals 2

    sget-object p0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    new-instance p0, Ll0/z1;

    new-instance v0, Ll0/y0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ll0/y0;-><init>(IIII)V

    invoke-direct {p0, v0, p1}, Ll0/z1;-><init>(Ll0/y0;Ljava/lang/String;)V

    return-object p0
.end method

.method public static e(Landroidx/compose/runtime/Composer;)Ll0/c2;
    .locals 4

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ll0/c2;

    invoke-direct {v2, v0}, Ll0/c2;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Ll0/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_2

    :cond_1
    new-instance v3, Lbp0/n;

    const/16 v1, 0x1a

    invoke-direct {v3, v1, v2, v0}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, p0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object v2

    :goto_1
    monitor-exit v1

    throw p0
.end method


# virtual methods
.method public c(Ly3/c;I[ILy3/m;[I)V
    .locals 0

    iget p1, p0, Ll0/e;->a:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Ly3/m;->w:Ly3/m;

    if-ne p4, p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p3, p5, p1}, Ll0/m;->d([I[IZ)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p2, p3, p5, p1}, Ll0/m;->e(I[I[IZ)V

    :goto_0
    return-void

    :pswitch_0
    sget-object p1, Ly3/m;->w:Ly3/m;

    if-ne p4, p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p3, p5, p1}, Ll0/m;->e(I[I[IZ)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p3, p5, p1}, Ll0/m;->d([I[IZ)V

    :goto_1
    return-void

    :pswitch_1
    const/4 p1, 0x0

    invoke-static {p2, p3, p5, p1}, Ll0/m;->g(I[I[IZ)V

    return-void

    :pswitch_2
    const/4 p1, 0x0

    invoke-static {p2, p3, p5, p1}, Ll0/m;->e(I[I[IZ)V

    return-void

    :pswitch_3
    const/4 p1, 0x0

    invoke-static {p3, p5, p1}, Ll0/m;->d([I[IZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ll0/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "Arrangement#Start"

    return-object v0

    :pswitch_1
    const-string v0, "Arrangement#End"

    return-object v0

    :pswitch_2
    const-string v0, "AbsoluteArrangement#SpaceBetween"

    return-object v0

    :pswitch_3
    const-string v0, "AbsoluteArrangement#Right"

    return-object v0

    :pswitch_4
    const-string v0, "AbsoluteArrangement#Left"

    return-object v0

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
