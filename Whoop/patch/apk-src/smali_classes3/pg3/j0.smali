.class public final Lpg3/j0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/reflect/Method;

.field public final e:I

.field public final f:Lpg3/n;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILpg3/n;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lpg3/j0;->c:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpg3/j0;->d:Ljava/lang/reflect/Method;

    .line 3
    iput p2, p0, Lpg3/j0;->e:I

    .line 4
    iput-object p3, p0, Lpg3/j0;->f:Lpg3/n;

    .line 5
    iput-object p4, p0, Lpg3/j0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;ILud3/d0;Lpg3/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lpg3/j0;->c:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lpg3/j0;->d:Ljava/lang/reflect/Method;

    .line 8
    iput p2, p0, Lpg3/j0;->e:I

    .line 9
    iput-object p3, p0, Lpg3/j0;->g:Ljava/lang/Object;

    .line 10
    iput-object p4, p0, Lpg3/j0;->f:Lpg3/n;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 10

    iget v0, p0, Lpg3/j0;->c:I

    iget-object v1, p0, Lpg3/j0;->f:Lpg3/n;

    iget-object v2, p0, Lpg3/j0;->g:Ljava/lang/Object;

    iget-object v3, p0, Lpg3/j0;->d:Ljava/lang/reflect/Method;

    iget v4, p0, Lpg3/j0;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v7, "form-data; name=\""

    const-string v8, "\""

    invoke-static {v7, v6, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Content-Transfer-Encoding"

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    const-string v9, "Content-Disposition"

    filled-new-array {v9, v6, v7, v8}, [Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lud3/d0;->x:Lud3/d0;

    invoke-static {v6}, Lwb3/f;->R([Ljava/lang/String;)Lud3/d0;

    move-result-object v6

    invoke-interface {v1, v5}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lud3/v0;

    iget-object v7, p1, Lpg3/s0;->i:Lq30/w0;

    invoke-virtual {v7, v6, v5}, Lq30/w0;->e(Lud3/d0;Lud3/v0;)V

    goto :goto_0

    :cond_0
    const-string p1, "Part map contained null value for key \'"

    const-string p2, "\'."

    invoke-static {p1, v6, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v3, v4, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "Part map contained null key."

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v3, v4, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_2
    return-void

    :cond_3
    const-string p1, "Part map was null."

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v3, v4, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :pswitch_0
    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    :try_start_0
    invoke-interface {v1, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/v0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    check-cast v2, Lud3/d0;

    iget-object p1, p1, Lpg3/s0;->i:Lq30/w0;

    invoke-virtual {p1, v2, v0}, Lq30/w0;->e(Lud3/d0;Lud3/v0;)V

    :goto_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unable to convert "

    const-string v1, " to RequestBody"

    invoke-static {p2, v0, v1}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, v4, p2, p1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
