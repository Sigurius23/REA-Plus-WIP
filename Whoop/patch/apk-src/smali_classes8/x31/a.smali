.class public final synthetic Lx31/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx31/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lx31/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lz6/a;

    check-cast p2, Lz6/f;

    iput-object p2, p1, Lz6/a;->b:Lz6/f;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lz6/a;

    check-cast p2, Ln6/o;

    iput-object p2, p1, Lz6/a;->d:Ln6/o;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lz6/a;

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lz6/a;->a:Ljava/lang/String;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lz22/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lz12/a;->g(Lxf3/c;Luf3/a;)Lv12/b;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lz12/a;->b(Lxf3/c;Luf3/a;)Lv12/d;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lz12/a;->c(Lxf3/c;Luf3/a;)Lt12/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lz12/a;->d(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lz12/a;->e(Lxf3/c;Luf3/a;)Ls12/a;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/net/HttpURLConnection;

    check-cast p2, Lyy/m0;

    const-string v0, "$this$open"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lyy/h;->a:I

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    sget v0, Lyy/h;->b:I

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {p2}, Lyy/m0;->getShouldCache()Z

    move-result v0

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    invoke-virtual {p2}, Lyy/m0;->getMethod()Lyy/k0;

    move-result-object v0

    iget-object v0, v0, Lyy/k0;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p2}, Lyy/m0;->getHeaders()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lyy/k0;->y:Lyy/k0;

    invoke-virtual {p2}, Lyy/m0;->getMethod()Lyy/k0;

    move-result-object v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {p2}, Lyy/m0;->getPostHeaders()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    :try_start_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Lyy/m0;->writePostBody(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    goto :goto_2

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyw1/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyw1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyk2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyf1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyd2/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyb0/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lyb0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Ly90/a;->a(Lxf3/c;Luf3/a;)Lx90/e;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Ly90/a;->b(Lxf3/c;Luf3/a;)Lx90/f;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly1/b;

    check-cast p2, Lp1/c1;

    instance-of v0, p2, Lz1/n;

    if-eqz v0, :cond_4

    check-cast p2, Lz1/n;

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lq3/y;->d:Lp0/n0;

    iget-object v1, v1, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p2}, Lz1/n;->h()Lp1/o2;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp1/k1;

    invoke-direct {v0, p1, p2}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lxr0/a;->b(Lxf3/c;Luf3/a;)Lwr0/b;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lxr0/a;->e(Lxf3/c;Luf3/a;)Lbs0/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lxr0/a;->d(Lxf3/c;Luf3/a;)Lyr0/c;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lxr0/a;->a(Lxf3/c;Luf3/a;)Lcom/whoop/communitymomentscontainer/api/CommunityMomentsContainerApi;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lxp2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lxh0/d;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lx6/l;

    check-cast p2, Lp6/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p2, Lp6/l;->a:Ljava/lang/String;

    new-instance p2, Ll83/k;

    const-string v0, "KEY"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p2}, [Ll83/k;

    move-result-object p1

    new-instance p2, Lb0/b;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lb0/b;-><init>(I)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {p2, p1, v0}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lb0/b;->b()Lic/g;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lx31/f;->e(II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lx31/b;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lx31/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
