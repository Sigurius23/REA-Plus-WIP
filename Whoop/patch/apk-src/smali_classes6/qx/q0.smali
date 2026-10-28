.class public final Lqx/q0;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lqx/v;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj93/g;Ljava/util/ArrayList;Ljava/util/ArrayList;Lqx/v;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqx/q0;->a:I

    .line 1
    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    .line 2
    iput-object p1, p0, Lqx/q0;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lqx/q0;->d:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lqx/q0;->e:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lqx/q0;->b:Lqx/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Lqx/q0;->a:I

    .line 6
    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    .line 7
    iput-object p1, p0, Lqx/q0;->c:Ljava/lang/Object;

    .line 8
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Enum;

    iput-object v1, p0, Lqx/q0;->e:Ljava/lang/Object;

    .line 9
    array-length v1, v1

    new-array v1, v1, [Ljava/lang/String;

    iput-object v1, p0, Lqx/q0;->d:Ljava/lang/Object;

    .line 10
    :goto_0
    iget-object v1, p0, Lqx/q0;->e:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Enum;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 11
    aget-object v1, v1, v0

    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    .line 13
    iget-object v2, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sget-object v4, Lrx/f;->a:Ljava/util/Set;

    .line 14
    const-class v4, Lqx/q;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lqx/q;

    if-nez v3, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {v3}, Lqx/q;->name()Ljava/lang/String;

    move-result-object v3

    .line 16
    const-string v4, "\u0000"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v3

    .line 17
    :goto_1
    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    .line 18
    :cond_2
    iget-object v0, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lqx/q0;->b:Lqx/v;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 19
    :goto_2
    new-instance v1, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Missing field in "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lqx/q0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqx/q0;->c:Ljava/lang/Object;

    check-cast v0, Lj93/g;

    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    sget-object v7, Lsx/d;->a:Ljava/lang/Object;

    if-ge v6, v3, :cond_0

    aput-object v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, p0, Lqx/q0;->b:Lqx/v;

    invoke-virtual {p1, v6}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v6

    const/4 v8, -0x1

    if-ne v6, v8, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_1

    :cond_2
    iget-object v8, p0, Lqx/q0;->e:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lsx/a;

    iget v8, v6, Lsx/a;->e:I

    iget-object v9, v6, Lsx/a;->c:Lj93/w;

    aget-object v10, v4, v8

    if-ne v10, v7, :cond_4

    iget-object v10, v6, Lsx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v10, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v4, v8

    if-nez v10, :cond_1

    invoke-interface {v9}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v8

    invoke-interface {v8}, Lj93/a0;->isMarkedNullable()Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v9}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v6, Lsx/a;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    :cond_4
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Multiple values for \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v9}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v1, :cond_6

    const/4 v6, 0x1

    goto :goto_2

    :cond_6
    move v6, v5

    :goto_2
    move v8, v5

    :goto_3
    if-ge v8, v1, :cond_b

    aget-object v9, v4, v8

    if-ne v9, v7, :cond_a

    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj93/q;

    invoke-interface {v9}, Lj93/q;->isOptional()Z

    move-result v9

    if-eqz v9, :cond_7

    move v6, v5

    goto :goto_4

    :cond_7
    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj93/q;

    invoke-interface {v9}, Lj93/q;->getType()Lj93/a0;

    move-result-object v9

    invoke-interface {v9}, Lj93/a0;->isMarkedNullable()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_8

    aput-object v10, v4, v8

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/q;

    invoke-interface {v0}, Lj93/q;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsx/a;

    if-eqz v1, :cond_9

    iget-object v10, v1, Lsx/a;->a:Ljava/lang/String;

    :cond_9
    invoke-static {v0, v10, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    :cond_a
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_b
    if-eqz v6, :cond_c

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_c
    new-instance p1, Lsx/b;

    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-direct {p1, v3, v4}, Lsx/b;-><init>(Ljava/util/List;[Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lj93/c;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_6
    if-ge v1, v0, :cond_e

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lsx/a;

    aget-object v5, v4, v1

    if-eq v5, v7, :cond_d

    iget-object v3, v3, Lsx/a;->c:Lj93/w;

    check-cast v3, Lj93/l;

    invoke-interface {v3, p1, v5}, Lj93/l;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_e
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqx/q0;->b:Lqx/v;

    invoke-virtual {p1, v0}, Lcom/squareup/moshi/JsonReader;->a0(Lqx/v;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_f

    iget-object p1, p0, Lqx/q0;->e:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Enum;

    aget-object p1, p1, v0

    return-object p1

    :cond_f
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected one of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, " but was "

    const-string v5, " at path "

    invoke-static {v4, p1, v5, v2, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lqx/q0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    iget-object v0, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsx/a;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lsx/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    iget-object v2, v1, Lsx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    iget-object v1, v1, Lsx/a;->c:Lj93/w;

    invoke-interface {v1, p2}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast p2, Ljava/lang/Enum;

    iget-object v0, p0, Lqx/q0;->d:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget-object p2, v0, p2

    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lqx/q0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KotlinJsonAdapter("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqx/q0;->c:Ljava/lang/Object;

    check-cast v1, Lj93/g;

    invoke-interface {v1}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JsonAdapter("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqx/q0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
