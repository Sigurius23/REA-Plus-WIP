.class public final Lce3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lce3/p;->w:I

    iput-object p2, p0, Lce3/p;->y:Ljava/lang/Object;

    iput-object p3, p0, Lce3/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p4, p0, Lce3/p;->w:I

    iput-object p1, p0, Lce3/p;->x:Ljava/lang/Object;

    iput-object p2, p0, Lce3/p;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lce3/p;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lu93/i;

    invoke-virtual {v1}, Lu93/i;->e()Llb3/q0;

    move-result-object v1

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v3, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    new-instance v4, Lbg/j;

    const/16 v5, 0xf

    invoke-direct {v4, p0, v5}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    sget-object v5, Lkb3/k;->e:Lkb3/b;

    const-string v6, "NO_LOCKS"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v5, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;-><init>(Lkb3/n;Lc93/a;)V

    const/4 v4, 0x0

    invoke-static {v2, v3, v0, v1, v4}, Llb3/o;->k(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lq93/p;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lkb3/k;

    invoke-virtual {v0}, Lq93/p;->g()Lq93/i;

    move-result-object v2

    iget-object v2, v2, Lq93/i;->a:Lu93/e0;

    sget-object v3, Lq93/g;->d:Lq93/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lq93/g;->h:Lva3/c;

    new-instance v4, Lzt/q;

    invoke-virtual {v0}, Lq93/p;->g()Lq93/i;

    move-result-object v0

    iget-object v0, v0, Lq93/i;->a:Lu93/e0;

    invoke-direct {v4, v1, v0}, Lzt/q;-><init>(Lkb3/k;Lr93/b0;)V

    invoke-static {v2, v3, v4}, Lhg3/i;->O(Lr93/b0;Lva3/c;Lzt/q;)Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lq93/j;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lkb3/k;

    new-instance v2, Lq93/p;

    invoke-virtual {v0}, Lo93/h;->l()Lu93/e0;

    move-result-object v3

    const-string v4, "getBuiltInsModule(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lfa3/u;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v5}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v3, v1, v4}, Lq93/p;-><init>(Lu93/e0;Lkb3/k;Lfa3/u;)V

    return-object v2

    :pswitch_2
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lq93/g;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkb3/k;

    new-instance v2, Lu93/l;

    iget-object v1, v0, Lq93/g;->b:Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Lq93/g;->a:Lu93/e0;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lr93/k;

    sget-object v4, Lq93/g;->g:Lva3/h;

    sget-object v5, Lr93/a0;->E:Lr93/a0;

    sget-object v6, Lr93/f;->x:Lr93/f;

    iget-object v0, v0, Lu93/e0;->E:Lo93/h;

    invoke-virtual {v0}, Lo93/h;->e()Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-direct/range {v2 .. v8}, Lu93/l;-><init>(Lr93/k;Lva3/h;Lr93/a0;Lr93/f;Ljava/util/Collection;Lkb3/n;)V

    new-instance v0, Lq93/a;

    invoke-direct {v0, v8, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;-><init>(Lkb3/n;Lu93/b;)V

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Lu93/l;->X(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Ljava/util/Set;Lu93/j;)V

    return-object v2

    :pswitch_3
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lja3/v;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->b:Laj/c;

    iget-object v1, v1, Lja3/v;->o:Lja3/q;

    iget-object v1, v1, Lu93/g0;->F:Lva3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "packageFqName"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lia3/d;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lx93/x;

    new-instance v2, Lja3/q;

    iget-object v0, v0, Lia3/d;->a:Lzt/q;

    invoke-direct {v2, v0, v1}, Lja3/q;-><init>(Lzt/q;Lx93/x;)V

    return-object v2

    :pswitch_5
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lr93/g;

    invoke-interface {v1}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "additionalAnnotations"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v2, v2, Lia3/a;->q:Lfa3/b;

    iget-object v0, v0, Lzt/q;->z:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa3/t;

    invoke-static {v2, v0, v1}, Lfa3/b;->b(Lfa3/b;Lfa3/t;Ls93/i;)Lfa3/t;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    check-cast v0, Lhb3/h0;

    iget-object v1, p0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v1, Lqa3/w0;

    iget-object v0, v0, Lhb3/h0;->a:Lhb3/k;

    iget-object v2, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->e:Lhb3/a;

    iget-object v0, v0, Lhb3/k;->b:Lsa3/f;

    invoke-interface {v2, v1, v0}, Lhb3/c;->A(Lqa3/w0;Lsa3/f;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lce3/p;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lce3/q;

    iget-object v0, p0, Lce3/p;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lce3/u;

    sget-object v3, Lce3/a;->E:Lce3/a;

    const/4 v0, 0x1

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2, v0, p0}, Lce3/u;->b(ZLce3/p;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0, p0}, Lce3/u;->b(ZLce3/p;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v5, Lce3/a;->y:Lce3/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v0, Lce3/a;->H:Lce3/a;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1, v5, v0, v4}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    :goto_0
    invoke-static {v2}, Lwd3/f;->b(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v4, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, v3

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v4, v0

    move-object v5, v3

    goto :goto_1

    :cond_1
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v5, "Required SETTINGS preface not received"

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    :try_start_3
    sget-object v0, Lce3/a;->z:Lce3/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v1, v0, v0, v4}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_3
    invoke-virtual {v1, v5, v3, v4}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    invoke-static {v2}, Lwd3/f;->b(Ljava/io/Closeable;)V

    throw v0

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
