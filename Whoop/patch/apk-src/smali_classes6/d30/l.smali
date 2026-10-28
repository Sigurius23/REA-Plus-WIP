.class public final synthetic Ld30/l;
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

    iput p1, p0, Ld30/l;->w:I

    iput-object p2, p0, Ld30/l;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld30/l;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ld30/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v1, v1, Ly3/l;->a:J

    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v3

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lf1/w0;->f()Lu0/f0;

    move-result-object v6

    const/4 v7, -0x1

    if-nez v6, :cond_1

    move v6, v7

    goto :goto_0

    :cond_1
    sget-object v8, Lf1/x0;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v8, v6

    :goto_0
    if-eq v6, v7, :cond_5

    const/4 v4, 0x1

    if-eq v6, v4, :cond_4

    const/4 v4, 0x2

    if-eq v6, v4, :cond_3

    const/4 v0, 0x3

    if-eq v6, v0, :cond_2

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SelectionContainer does not support cursor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, v3, Lf1/u;->b:Lf1/t;

    invoke-static {v0, v1, v2, v3}, Lf1/y0;->s(Lf1/w0;JLf1/t;)J

    move-result-wide v4

    goto :goto_1

    :cond_4
    iget-object v3, v3, Lf1/u;->a:Lf1/t;

    invoke-static {v0, v1, v2, v3}, Lf1/y0;->s(Lf1/w0;JLf1/t;)J

    move-result-wide v4

    :cond_5
    :goto_1
    new-instance v0, Lh2/b;

    invoke-direct {v0, v4, v5}, Lh2/b;-><init>(J)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lf01/p1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lf01/o1;->c(Lf01/p1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lf01/a1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lf01/z0;->b(Lf01/a1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lf01/o0;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lf01/n0;->b(Lf01/o0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lf01/u;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lf01/t;->d(Lf01/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lf01/q;

    invoke-static {v0, v1}, Lf01/n;->k(Lkotlin/jvm/functions/Function1;Lf01/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lf0/i0;

    sget-object v2, Ly2/h1;->a:Lp1/b0;

    invoke-static {v1, v2}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lcy0/c$d;

    invoke-static {v0, v1}, Ley0/g;->m(Lkotlin/jvm/functions/Function1;Lcy0/c$d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Leu2/b;

    invoke-static {v0, v1}, Leu2/j;->a(Lkotlin/jvm/functions/Function1;Leu2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lcp1/r;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lep1/w;->j(Lcp1/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lcp1/h;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lep1/i;->d(Lcp1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lcp1/g;

    invoke-static {v0, v1}, Lep1/h;->i(Lkotlin/jvm/functions/Function1;Lcp1/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lcp1/e;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lep1/d;->i(Lcp1/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lcj1/m;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lej1/v;->b(Lcj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lcj1/e;

    invoke-static {v0, v1}, Lej1/g;->a(Lkotlin/jvm/functions/Function1;Lcj1/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Led1/b;

    invoke-static {v0, v1}, Led1/a;->c(Lkotlin/jvm/functions/Function1;Led1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Le90/c;

    invoke-static {v0, v1}, Le90/g;->h(Lkotlin/jvm/functions/Function1;Le90/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Le81/k0;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Le81/k;->w(Le81/k0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Le11/d;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Le11/c;->b(Le11/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lbw1/c$a;

    invoke-static {v0, v1}, Ldw1/d;->e(Lkotlin/jvm/functions/Function1;Lbw1/c$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lib1/a;

    invoke-static {v0, v1}, Ldn0/p;->u(Lld1/c;Lib1/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lxk1/b;

    invoke-static {v0, v1}, Ldl1/d;->f(Lkotlin/jvm/functions/Function1;Lxk1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lbk2/g$a;

    invoke-static {v0, v1}, Ldk2/h;->d(Lkotlin/jvm/functions/Function1;Lbk2/g$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Ldh/w;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/b0;

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v3, v0, Ldh/w;->a:Ldh/x;

    invoke-virtual {v3}, Ldh/x;->d1()Lne3/j;

    move-result-object v4

    sget-object v5, Ldh/r;->b:Lne3/l;

    const-wide/16 v6, 0x0

    invoke-interface {v4, v6, v7, v5}, Lne3/j;->d0(JLne3/l;)Z

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Ldh/r;->a:Lne3/l;

    invoke-interface {v4, v6, v7, v5}, Lne3/j;->d0(JLne3/l;)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    new-instance v4, Ldh/q;

    invoke-virtual {v3}, Ldh/x;->d1()Lne3/j;

    move-result-object v3

    invoke-direct {v4, v3}, Ldh/q;-><init>(Lne3/j;)V

    invoke-static {v4}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v3

    iget-object v4, v0, Ldh/w;->b:Lmh/m;

    iget-object v4, v4, Lmh/m;->a:Landroid/content/Context;

    new-instance v5, Ldh/z;

    new-instance v6, Lal0/f;

    const/4 v7, 0x3

    invoke-direct {v6, v4, v7}, Lal0/f;-><init>(Landroid/content/Context;I)V

    const/4 v4, 0x0

    invoke-direct {v5, v3, v6, v4}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    move-object v3, v5

    :cond_7
    :try_start_0
    invoke-virtual {v0, v3}, Ldh/w;->b(Ldh/x;)Landroid/graphics/ImageDecoder$Source;

    move-result-object v4

    new-instance v5, Ldh/u;

    invoke-direct {v5, v2, v0, v1}, Ldh/u;-><init>(Lkotlin/jvm/internal/g0;Ldh/w;Lkotlin/jvm/internal/b0;)V

    invoke-static {v4, v5}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/ImageDecoder;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/graphics/ImageDecoder;->close()V

    :cond_8
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/ImageDecoder;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/graphics/ImageDecoder;->close()V

    :cond_9
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    throw v0

    :pswitch_17
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Ld62/h;

    invoke-static {v0, v1}, Ld62/g;->c(Lkotlin/jvm/functions/Function1;Ld62/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lb62/b;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Ld62/d;

    invoke-static {v0, v1}, Ld62/c;->b(Lb62/b;Ld62/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lc42/q;

    invoke-static {v0, v1}, Ld42/p;->f(Lkotlin/jvm/functions/Function1;Lc42/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Ld41/h;

    invoke-static {v0, v1}, Ld41/b;->a(Lkotlin/jvm/functions/Function1;Ld41/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Ld30/v;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_a

    sget-object v2, Ld30/h1;->a:Ld30/h1;

    invoke-virtual {v0, v2}, Ld30/v;->a(Ld30/j1;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Ld30/l;->x:Ljava/lang/Object;

    check-cast v0, Ld30/u;

    iget-object v1, p0, Ld30/l;->y:Ljava/lang/Object;

    check-cast v1, Lu00/f;

    new-instance v2, Ld30/v0;

    iget-object v1, v1, Lu00/f;->a:Ljava/lang/String;

    invoke-direct {v2, v1}, Ld30/v0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ld30/u;->b(Ld30/z0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
