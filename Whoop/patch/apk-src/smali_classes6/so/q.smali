.class public final synthetic Lso/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/b;
.implements Lcq/d;
.implements Lwy/b;
.implements Lzx/f;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lso/q;->w:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lso/q;->x:Ljava/lang/Object;

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lw23/h;

    .line 7
    sget-object v4, Lx23/f;->w:Lx23/f;

    .line 8
    const-string v5, "unknown"

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 9
    const-string v3, ""

    invoke-direct/range {v0 .. v5}, Lw23/h;-><init>(Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;)V

    .line 10
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lso/q;->w:Ljava/lang/Object;

    .line 11
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lso/q;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lso/q;->w:Ljava/lang/Object;

    iput-object p2, p0, Lso/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Lso/b;

    iget-object v1, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-nez v2, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_1

    const-string v3, "google.messenger"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Lso/b;->a(Landroid/os/Bundle;)Lcq/u;

    move-result-object p1

    sget-object v0, Lso/p;->w:Lso/p;

    sget-object v1, Lso/e;->x:Lso/e;

    invoke-virtual {p1, v0, v1}, Lcq/u;->onSuccessTask(Ljava/util/concurrent/Executor;Lcq/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public b()Lts/e;
    .locals 4

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Lts/h;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_1

    iget v2, v0, Lts/h;->a:I

    iget-object v3, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Lct/a;

    iget-object v3, v3, Lct/a;->a:[B

    array-length v3, v3

    if-ne v2, v3, :cond_0

    new-instance v2, Lts/e;

    invoke-direct {v2, v0, v1}, Lts/e;-><init>(Lts/h;Lro/i;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lt30/w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt30/w;

    iget v1, v0, Lt30/w;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt30/w;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt30/w;

    invoke-direct {v0, p0, p2}, Lt30/w;-><init>(Lso/q;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lt30/w;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt30/w;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lt30/w;->x:Ljava/lang/String;

    iget-object v0, v0, Lt30/w;->w:Lso/q;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Lq30/w0;

    iget-object v2, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v2, Ln30/d;

    iget-object v5, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast v5, Lq83/j;

    invoke-direct {p2, p1, v2, v5}, Lq30/w0;-><init>(Ljava/lang/String;Ln30/d;Lq83/j;)V

    iput-object p0, v0, Lt30/w;->w:Lso/q;

    iput-object p1, v0, Lt30/w;->x:Ljava/lang/String;

    iput v3, v0, Lt30/w;->E:I

    new-instance v2, Lo23/p;

    const/4 v3, 0x6

    invoke-direct {v2, p2, v4, v3}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p2, Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p2, :cond_4

    :try_start_3
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception v1

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_6
    invoke-static {p2, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_4
    move-object v1, v4

    goto :goto_4

    :goto_2
    move-object v0, p0

    goto :goto_3

    :catchall_3
    move-exception p2

    goto :goto_2

    :goto_3
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_4
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object v0, v0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Ln30/d;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Could not get bitmap from url: "

    const-string v5, "."

    invoke-static {v3, p1, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ln30/c;

    invoke-virtual {v0, v2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_5
    instance-of p1, v1, Ll83/m;

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    move-object v4, v1

    :goto_5
    return-object v4
.end method

.method public d(Lzx/g;Lq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p1, Lzx/g;->g:Lzx/a;

    if-eqz p1, :cond_2

    iget-object p2, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lbi/p;

    iget-object p2, p2, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public f(Lro/i;)V
    .locals 0

    iput-object p1, p0, Lso/q;->x:Ljava/lang/Object;

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lso/q;->x:Ljava/lang/Object;

    return-void
.end method

.method public getLoading()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    return-object v0
.end method

.method public h(Lts/h;)V
    .locals 0

    iput-object p1, p0, Lso/q;->w:Ljava/lang/Object;

    return-void
.end method

.method public i(Lx23/f;)V
    .locals 9

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    :goto_0
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lw23/h;

    const/4 v7, 0x0

    const/16 v8, 0x17

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v8}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v6

    goto :goto_0
.end method

.method public m(Lorg/json/JSONObject;)Lvy/b;
    .locals 5

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    move-object v2, v0

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    iget-object v3, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast v3, Lz00/a;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "getJSONObject(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lz00/a;->a(Lorg/json/JSONObject;)Ly00/b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ly00/l;

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Lzx/a;

    invoke-direct {p1, v0, v1}, Ly00/l;-><init>(Lzx/a;Ljava/util/ArrayList;)V

    return-object p1
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object p1, p0, Lso/q;->x:Ljava/lang/Object;

    check-cast p1, Lpg3/o;

    iget-object p1, p1, Lpg3/o;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
