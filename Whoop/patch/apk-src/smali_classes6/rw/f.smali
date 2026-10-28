.class public final Lrw/f;
.super Low/z;
.source "SourceFile"


# static fields
.field public static final e:Lrw/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrw/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lrw/a;-><init>(I)V

    sput-object v0, Lrw/f;->e:Lrw/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 11

    const/4 v0, 0x0

    iput v0, p0, Lrw/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lrw/f;->b:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lrw/f;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lrw/f;->d:Ljava/lang/Object;

    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    .line 6
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p1, v2

    .line 7
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v5, v3, 0x1

    .line 8
    aput-object v4, p1, v3

    move v3, v5

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/reflect/Field;

    const/4 v0, 0x1

    .line 10
    invoke-static {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 11
    array-length v0, p1

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    const/4 v4, 0x0

    .line 12
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Enum;

    .line 13
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v6

    .line 15
    const-class v7, Lpw/b;

    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lpw/b;

    if-eqz v3, :cond_2

    .line 16
    invoke-interface {v3}, Lpw/b;->value()Ljava/lang/String;

    move-result-object v5

    .line 17
    invoke-interface {v3}, Lpw/b;->alternate()[Ljava/lang/String;

    move-result-object v3

    array-length v7, v3

    move v8, v1

    :goto_3
    if-ge v8, v7, :cond_2

    aget-object v9, v3, v8

    .line 18
    iget-object v10, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/HashMap;

    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 19
    :cond_2
    iget-object v3, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v3, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    iget-object v3, p0, Lrw/f;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    .line 22
    :goto_4
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public constructor <init>(Low/m;Low/z;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lrw/f;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lrw/f;->b:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Lrw/f;->c:Ljava/lang/Object;

    .line 26
    iput-object p3, p0, Lrw/f;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrw/c;Lrw/f;Lrw/f;Lqw/o;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lrw/f;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Lrw/f;->b:Ljava/lang/Object;

    .line 29
    iput-object p3, p0, Lrw/f;->c:Ljava/lang/Object;

    .line 30
    iput-object p4, p0, Lrw/f;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lrw/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Low/z;

    invoke-virtual {v0, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto/16 :goto_4

    :cond_0
    iget-object v2, p0, Lrw/f;->d:Ljava/lang/Object;

    check-cast v2, Lqw/o;

    invoke-interface {v2}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/4 v3, 0x1

    const-string v4, "duplicate key: "

    if-ne v0, v3, :cond_3

    invoke-virtual {p1}, Lww/a;->beginArray()V

    :goto_0
    invoke-virtual {p1}, Lww/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lww/a;->beginArray()V

    iget-object v0, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v0, Lrw/f;

    iget-object v0, v0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Low/z;

    invoke-virtual {v0, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v1, Lrw/f;

    iget-object v1, v1, Lrw/f;->c:Ljava/lang/Object;

    check-cast v1, Low/z;

    invoke-virtual {v1, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lww/a;->endArray()V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-static {v0, v4}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Lww/a;->endArray()V

    :goto_1
    move-object p1, v2

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Lww/a;->beginObject()V

    :goto_2
    invoke-virtual {p1}, Lww/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lt9/p;->x:Lt9/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Lww/a;->G:I

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lww/a;->h()I

    move-result v0

    :cond_4
    const/16 v3, 0xd

    if-ne v0, v3, :cond_5

    iput v1, p1, Lww/a;->G:I

    goto :goto_3

    :cond_5
    const/16 v3, 0xc

    if-ne v0, v3, :cond_6

    const/16 v0, 0x8

    iput v0, p1, Lww/a;->G:I

    goto :goto_3

    :cond_6
    const/16 v3, 0xe

    if-ne v0, v3, :cond_8

    const/16 v0, 0xa

    iput v0, p1, Lww/a;->G:I

    :goto_3
    iget-object v0, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v0, Lrw/f;

    iget-object v0, v0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Low/z;

    invoke-virtual {v0, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v3, Lrw/f;

    iget-object v3, v3, Lrw/f;->c:Ljava/lang/Object;

    check-cast v3, Low/z;

    invoke-virtual {v3, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-static {v0, v4}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const-string v0, "a name"

    invoke-virtual {p1, v0}, Lww/a;->T0(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_9
    invoke-virtual {p1}, Lww/a;->endObject()V

    goto :goto_1

    :goto_4
    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-nez v0, :cond_b

    iget-object v0, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Enum;

    goto :goto_5

    :cond_b
    move-object p1, v0

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lrw/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Low/z;

    iget-object v1, p0, Lrw/f;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Type;

    if-eqz p2, :cond_1

    instance-of v2, v1, Ljava/lang/Class;

    if-nez v2, :cond_0

    instance-of v2, v1, Ljava/lang/reflect/TypeVariable;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eq v2, v1, :cond_7

    iget-object v1, p0, Lrw/f;->b:Ljava/lang/Object;

    check-cast v1, Low/m;

    new-instance v3, Lvw/a;

    invoke-direct {v3, v2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, v3}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v1

    instance-of v2, v1, Lrw/l;

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    move-object v2, v0

    :goto_1
    instance-of v3, v2, Low/l;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Low/l;

    iget-object v3, v3, Low/l;->a:Low/z;

    if-eqz v3, :cond_4

    if-ne v3, v2, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v3

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    instance-of v2, v2, Lrw/l;

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    move-object v0, v1

    :cond_7
    :goto_4
    invoke-virtual {v0, p1, p2}, Low/z;->c(Lww/b;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/util/Map;

    iget-object v0, p0, Lrw/f;->c:Ljava/lang/Object;

    check-cast v0, Lrw/f;

    if-nez p2, :cond_8

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Lww/b;->beginObject()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lww/b;->i(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lrw/f;->c(Lww/b;Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lww/b;->endObject()V

    :goto_6
    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Enum;

    if-nez p2, :cond_a

    const/4 p2, 0x0

    goto :goto_7

    :cond_a
    iget-object v0, p0, Lrw/f;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :goto_7
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
