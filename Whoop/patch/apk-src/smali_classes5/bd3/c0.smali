.class public final Lbd3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbd3/a;

.field public final b:Z

.field public c:I


# direct methods
.method public constructor <init>(Lad3/i;Lbd3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbd3/c0;->a:Lbd3/a;

    iget-boolean p1, p1, Lad3/i;->c:Z

    iput-boolean p1, p0, Lbd3/c0;->b:Z

    return-void
.end method

.method public static final a(Lbd3/c0;Ll83/b;Ls83/a;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lbd3/c0;->a:Lbd3/a;

    instance-of v1, p2, Lbd3/b0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lbd3/b0;

    iget v2, v1, Lbd3/b0;->H:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lbd3/b0;->H:I

    goto :goto_0

    :cond_0
    new-instance v1, Lbd3/b0;

    invoke-direct {v1, p0, p2}, Lbd3/b0;-><init>(Lbd3/c0;Ls83/a;)V

    :goto_0
    iget-object p2, v1, Lbd3/b0;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbd3/b0;->H:I

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x4

    const/4 v9, 0x1

    if-eqz v3, :cond_4

    if-ne v3, v9, :cond_3

    iget p0, v1, Lbd3/b0;->E:I

    iget-object p1, v1, Lbd3/b0;->z:Ljava/lang/String;

    iget-object v0, v1, Lbd3/b0;->y:Ljava/util/LinkedHashMap;

    iget-object v3, v1, Lbd3/b0;->x:Lbd3/c0;

    iget-object v10, v1, Lbd3/b0;->w:Ll83/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v3, Lbd3/c0;->a:Lbd3/a;

    invoke-virtual {p1}, Lbd3/a;->f()B

    move-result p1

    if-eq p1, v8, :cond_2

    if-ne p1, v7, :cond_1

    goto :goto_3

    :cond_1
    iget-object p0, v3, Lbd3/c0;->a:Lbd3/a;

    const-string p1, "Expected end of the object or comma"

    invoke-static {p0, p1, v6, v4, v5}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4

    :cond_2
    move v6, p0

    move-object p0, v3

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Lbd3/a;->g(B)B

    move-result p2

    invoke-virtual {v0}, Lbd3/a;->w()B

    move-result v3

    if-eq v3, v8, :cond_9

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v10, p1

    move p1, p2

    :goto_1
    iget-object p2, p0, Lbd3/c0;->a:Lbd3/a;

    invoke-virtual {p2}, Lbd3/a;->c()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-boolean p1, p0, Lbd3/c0;->b:Z

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lbd3/a;->j()Ljava/lang/String;

    move-result-object p1

    :goto_2
    const/4 v3, 0x5

    invoke-virtual {p2, v3}, Lbd3/a;->g(B)B

    iput-object v10, v1, Lbd3/b0;->w:Ll83/b;

    iput-object p0, v1, Lbd3/b0;->x:Lbd3/c0;

    iput-object v0, v1, Lbd3/b0;->y:Ljava/util/LinkedHashMap;

    iput-object p1, v1, Lbd3/b0;->z:Ljava/lang/String;

    iput v6, v1, Lbd3/b0;->E:I

    iput v9, v1, Lbd3/b0;->H:I

    invoke-virtual {v10, v1}, Ll83/b;->a(Lbd3/b0;)V

    return-object v2

    :cond_6
    move-object v3, p0

    :goto_3
    iget-object p0, v3, Lbd3/c0;->a:Lbd3/a;

    if-ne p1, v5, :cond_7

    invoke-virtual {p0, v7}, Lbd3/a;->g(B)B

    goto :goto_4

    :cond_7
    if-eq p1, v8, :cond_8

    :goto_4
    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object p0

    :cond_8
    const-string p1, "object"

    invoke-static {p0, p1}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    throw v4

    :cond_9
    const-string p0, "Unexpected leading comma"

    invoke-static {v0, p0, v6, v4, v5}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method


# virtual methods
.method public final b()Lkotlinx/serialization/json/JsonElement;
    .locals 9

    iget-object v0, p0, Lbd3/c0;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->w()B

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v2}, Lbd3/c0;->d(Z)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v3}, Lbd3/c0;->d(Z)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v4, 0x6

    const/4 v5, 0x0

    if-ne v1, v4, :cond_a

    iget v1, p0, Lbd3/c0;->c:I

    add-int/2addr v1, v2

    iput v1, p0, Lbd3/c0;->c:I

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    new-instance v0, Lhm/d;

    new-instance v1, Lbd3/a0;

    invoke-direct {v1, p0, v5}, Lbd3/a0;-><init>(Lbd3/c0;Lq83/d;)V

    const/16 v2, 0x1d

    invoke-direct {v0, v1, v2}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Ll83/a;->a(Lhm/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v4}, Lbd3/a;->g(B)B

    move-result v1

    invoke-virtual {v0}, Lbd3/a;->w()B

    move-result v2

    const/4 v6, 0x4

    if-eq v2, v6, :cond_9

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_3
    invoke-virtual {v0}, Lbd3/a;->c()Z

    move-result v7

    const/4 v8, 0x7

    if-eqz v7, :cond_6

    iget-boolean v1, p0, Lbd3/c0;->b:Z

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lbd3/a;->j()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v7, 0x5

    invoke-virtual {v0, v7}, Lbd3/a;->g(B)B

    invoke-virtual {p0}, Lbd3/c0;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v7

    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lbd3/a;->f()B

    move-result v1

    if-eq v1, v6, :cond_3

    if-ne v1, v8, :cond_5

    goto :goto_1

    :cond_5
    const-string v1, "Expected end of the object or comma"

    invoke-static {v0, v1, v3, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_6
    :goto_1
    if-ne v1, v4, :cond_7

    invoke-virtual {v0, v8}, Lbd3/a;->g(B)B

    goto :goto_2

    :cond_7
    if-eq v1, v6, :cond_8

    :goto_2
    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v2}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :goto_3
    iget v1, p0, Lbd3/c0;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lbd3/c0;->c:I

    return-object v0

    :cond_8
    const-string v1, "object"

    invoke-static {v0, v1}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    throw v5

    :cond_9
    const-string v1, "Unexpected leading comma"

    invoke-static {v0, v1, v3, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_a
    const/16 v2, 0x8

    if-ne v1, v2, :cond_b

    invoke-virtual {p0}, Lbd3/c0;->c()Lkotlinx/serialization/json/JsonArray;

    move-result-object v0

    return-object v0

    :cond_b
    invoke-static {v1}, Lbd3/q;->x(B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Cannot read Json element because of unexpected "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5
.end method

.method public final c()Lkotlinx/serialization/json/JsonArray;
    .locals 8

    iget-object v0, p0, Lbd3/c0;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->f()B

    move-result v1

    invoke-virtual {v0}, Lbd3/a;->w()B

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    if-eq v2, v5, :cond_6

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lbd3/a;->c()Z

    move-result v6

    const/16 v7, 0x9

    if-eqz v6, :cond_3

    invoke-virtual {p0}, Lbd3/c0;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lbd3/a;->f()B

    move-result v1

    if-eq v1, v5, :cond_0

    if-ne v1, v7, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    iget v7, v0, Lbd3/a;->a:I

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "Expected end of the array or comma"

    invoke-static {v0, v1, v7, v4, v5}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4

    :cond_3
    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    invoke-virtual {v0, v7}, Lbd3/a;->g(B)B

    goto :goto_2

    :cond_4
    if-eq v1, v5, :cond_5

    :goto_2
    new-instance v0, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {v0, v2}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_5
    const-string v1, "array"

    invoke-static {v0, v1}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    throw v4

    :cond_6
    const-string v1, "Unexpected leading comma"

    const/4 v2, 0x6

    invoke-static {v0, v1, v3, v4, v2}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method

.method public final d(Z)Lkotlinx/serialization/json/JsonPrimitive;
    .locals 3

    iget-boolean v0, p0, Lbd3/c0;->b:Z

    iget-object v1, p0, Lbd3/c0;->a:Lbd3/a;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lbd3/a;->j()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-nez p1, :cond_2

    const-string v1, "null"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-object p1

    :cond_2
    new-instance v1, Lad3/s;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lad3/s;-><init>(Ljava/lang/Object;ZLyc3/g;)V

    return-object v1
.end method
