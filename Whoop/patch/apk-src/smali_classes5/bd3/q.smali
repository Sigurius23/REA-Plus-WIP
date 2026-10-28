.class public abstract Lbd3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqt/e;

.field public static final b:Lqt/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lbd3/q;->a:Lqt/e;

    new-instance v0, Lqt/e;

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lbd3/q;->b:Lqt/e;

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/internal/JsonEncodingException;
    .locals 3

    new-instance v0, Lkotlinx/serialization/json/internal/JsonEncodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected special floating-point value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'\nCurrent output: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, -0x1

    invoke-static {p1, p0}, Lbd3/q;->r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlinx/serialization/json/internal/JsonEncodingException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lyc3/g;)Lkotlinx/serialization/json/internal/JsonEncodingException;
    .locals 3

    const-string v0, "keyDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/json/internal/JsonEncodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Value of type \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' can\'t be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\'.\nUse \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlinx/serialization/json/internal/JsonEncodingException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/json/internal/JsonDecodingException;

    if-ltz p0, :cond_0

    const-string v1, "Unexpected JSON token at offset "

    const-string v2, ": "

    invoke-static {p0, v1, v2, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {v0, p1}, Lkotlinx/serialization/json/internal/JsonDecodingException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\nJSON input: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p0}, Lbd3/q;->r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lbd3/q;->c(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lwc3/j;Lwc3/j;Ljava/lang/String;)V
    .locals 4

    instance-of v0, p0, Lwc3/g;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/serialization/internal/JsonInternalDependenciesKt;->jsonCachedSerialNames(Lyc3/g;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    check-cast p0, Lwc3/g;

    invoke-virtual {p0}, Lwc3/g;->getDescriptor()Lyc3/g;

    move-result-object p0

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\' cannot be serialized as base class \'"

    const-string v2, "\' because it has property name that conflicts with JSON class discriminator \'"

    const-string v3, "Sealed class \'"

    invoke-static {v3, p1, v1, p0, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Ljava/util/LinkedHashMap;Lyc3/g;Ljava/lang/String;I)V
    .locals 4

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/j;->a:Lyc3/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "enum value"

    goto :goto_0

    :cond_0
    const-string v0, "property"

    :goto_0
    invoke-interface {p0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance v1, Lkotlinx/serialization/json/internal/JsonException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The suggested name \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, p3}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is already one of the names for "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p2, p0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-interface {p1, p0}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "message"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final g(Lyc3/g;Lcd3/f;)Lyc3/g;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/i;->a:Lyc3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lvb/g;->b(Lyc3/g;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {p1, v0, v2}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_3

    invoke-static {v1, p1}, Lbd3/q;->g(Lyc3/g;Lcd3/f;)Lyc3/g;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    invoke-interface {p0}, Lyc3/g;->isInline()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p0

    invoke-static {p0, p1}, Lbd3/q;->g(Lyc3/g;Lcd3/f;)Lyc3/g;

    move-result-object p0

    :cond_3
    :goto_0
    return-object p0
.end method

.method public static final h(C)B
    .locals 1

    const/16 v0, 0x7e

    if-ge p0, v0, :cond_0

    sget-object v0, Lbd3/i;->b:[B

    aget-byte p0, v0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final i(Lyc3/k;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lyc3/j;

    if-nez v0, :cond_2

    instance-of v0, p0, Lyc3/f;

    if-nez v0, :cond_1

    instance-of p0, p0, Lyc3/d;

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Actual serializer for polymorphic cannot be polymorphic itself"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Primitives cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Enums cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final j(Lad3/c;Lyc3/g;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getAnnotations()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    instance-of v1, v0, Lad3/h;

    if-eqz v1, :cond_0

    check-cast v0, Lad3/h;

    invoke-interface {v0}, Lad3/h;->discriminator()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p0, p0, Lad3/c;->a:Lad3/i;

    iget-object p0, p0, Lad3/i;->i:Ljava/lang/String;

    return-object p0
.end method

.method public static final k(Lad3/c;Lyc3/g;)Ljava/util/Map;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/c;->c:Lad3/z;

    new-instance v1, La11/l;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1, p0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "descriptor"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lbd3/q;->a:Lqt/e;

    invoke-virtual {v0, p1, p0}, Lad3/z;->l(Lyc3/g;Lqt/e;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    const-string v1, "value"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v2, Ljava/util/Map;

    return-object v2
.end method

.method public static final l(Lad3/c;Lbd3/v;Lwc3/j;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbd3/g0;

    sget-object v1, Lbd3/l0;->y:Lbd3/l0;

    sget-object v2, Lbd3/l0;->H:Lt83/b;

    invoke-virtual {v2}, Lm83/a;->a()I

    move-result v2

    new-array v2, v2, [Lad3/p;

    iget-object v3, p0, Lad3/c;->a:Lad3/i;

    iget-boolean v3, v3, Lad3/i;->e:Z

    if-eqz v3, :cond_0

    new-instance v3, Lbd3/n;

    invoke-direct {v3, p1, p0}, Lbd3/n;-><init>(Lbd3/v;Lad3/c;)V

    goto :goto_0

    :cond_0
    new-instance v3, Lbd3/k;

    invoke-direct {v3, p1}, Lbd3/k;-><init>(Lbd3/v;)V

    :goto_0
    invoke-direct {v0, v3, p0, v1, v2}, Lbd3/g0;-><init>(Lbd3/k;Lad3/c;Lbd3/l0;[Lad3/p;)V

    invoke-virtual {v0, p2, p3}, Lbd3/g0;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public static final m(Lyc3/g;Lad3/c;I)Ljava/lang/String;
    .locals 6

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lbd3/q;->s(Lad3/c;Lyc3/g;)Lad3/v;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p2}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object p1, p1, Lad3/c;->c:Lad3/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lbd3/q;->b:Lqt/e;

    invoke-virtual {p1, p0, v1}, Lad3/z;->l(Lyc3/g;Lqt/e;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lyc3/g;->getElementsCount()I

    move-result v2

    new-array v3, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {p0, v4}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, p0, v5}, Lad3/v;->a(Lyc3/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v3

    :goto_1
    check-cast v2, [Ljava/lang/String;

    aget-object p0, v2, p2

    return-object p0
.end method

.method public static final n(Lyc3/g;Lad3/c;Ljava/lang/String;)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lad3/c;->a:Lad3/i;

    iget-boolean v1, v0, Lad3/i;->m:Z

    const/4 v2, -0x3

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v1

    sget-object v3, Lyc3/j;->a:Lyc3/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "toLowerCase(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lbd3/q;->k(Lad3/c;Lyc3/g;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    return v2

    :cond_1
    invoke-static {p1, p0}, Lbd3/q;->s(Lad3/c;Lyc3/g;)Lad3/v;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {p1, p0}, Lbd3/q;->k(Lad3/c;Lyc3/g;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_2
    return v2

    :cond_3
    invoke-interface {p0, p2}, Lyc3/g;->getElementIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, v0, Lad3/i;->k:Z

    if-nez v0, :cond_5

    :goto_0
    return v1

    :cond_5
    invoke-static {p1, p0}, Lbd3/q;->k(Lad3/c;Lyc3/g;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_6
    return v2
.end method

.method public static final o(Lyc3/g;Lad3/c;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lbd3/q;->n(Lyc3/g;Lad3/c;Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x3

    if-eq p1, v0, :cond_0

    return p1

    :cond_0
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not contain element with name \'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final p(Lad3/c;Lyc3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lad3/c;->a:Lad3/i;

    iget-boolean p0, p0, Lad3/i;->b:Z

    if-nez p0, :cond_3

    invoke-interface {p1}, Lyc3/g;->getAnnotations()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/annotation/Annotation;

    instance-of p1, p1, Lad3/q;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final q(Lbd3/a;Ljava/lang/String;)V
    .locals 2

    const-string v0, "Trailing comma before the end of JSON "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lbd3/a;->a:I

    add-int/lit8 v0, v0, -0x1

    const-string v1, "Trailing commas are non-complaint JSON and not allowed by default. Use \'allowTrailingComma = true\' in \'Json {}\' builder to support them."

    invoke-virtual {p0, v0, p1, v1}, Lbd3/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0xc8

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    const-string v1, "....."

    if-ne p0, v0, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x3c

    if-gtz p0, :cond_1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p1, p0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, p0, -0x1e

    add-int/lit8 p0, p0, 0x1e

    const-string v2, ""

    if-gtz v0, :cond_3

    move-object v3, v2

    goto :goto_1

    :cond_3
    move-object v3, v1

    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lt p0, v4, :cond_4

    move-object v1, v2

    :cond_4
    invoke-static {v3}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-gez v0, :cond_5

    const/4 v0, 0x0

    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le p0, v3, :cond_6

    move p0, v3

    :cond_6
    invoke-interface {p1, v0, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lad3/c;Lyc3/g;)Lad3/v;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p1

    sget-object v0, Lyc3/l;->a:Lyc3/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lad3/c;->a:Lad3/i;

    iget-object p0, p0, Lad3/i;->l:Lad3/v;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final t(Lad3/c;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lwc3/b;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "discriminator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbd3/w;

    invoke-interface {p3}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-direct {v0, p0, p2, p1, v1}, Lbd3/w;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lyc3/g;)V

    invoke-virtual {v0, p3}, Lbd3/b;->decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Lad3/c;Lyc3/g;)Lbd3/l0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    instance-of v1, v0, Lyc3/d;

    if-eqz v1, :cond_0

    sget-object p0, Lbd3/l0;->F:Lbd3/l0;

    return-object p0

    :cond_0
    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Lbd3/l0;->z:Lbd3/l0;

    return-object p0

    :cond_1
    sget-object v1, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    iget-object v0, p0, Lad3/c;->b:Lcd3/f;

    invoke-static {p1, v0}, Lbd3/q;->g(Lyc3/g;Lcd3/f;)Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    instance-of v1, v0, Lyc3/f;

    if-nez v1, :cond_4

    sget-object v1, Lyc3/j;->a:Lyc3/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lad3/c;->a:Lad3/i;

    iget-boolean p0, p0, Lad3/i;->d:Z

    if-eqz p0, :cond_3

    sget-object p0, Lbd3/l0;->z:Lbd3/l0;

    return-object p0

    :cond_3
    invoke-static {p1}, Lbd3/q;->b(Lyc3/g;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_0
    sget-object p0, Lbd3/l0;->E:Lbd3/l0;

    return-object p0

    :cond_5
    sget-object p0, Lbd3/l0;->y:Lbd3/l0;

    return-object p0
.end method

.method public static final v(Lbd3/a;Ljava/lang/Number;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected special floating-point value "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". By default, non-finite floating point values are prohibited because they do not conform JSON specification"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final w(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
    .locals 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/json/internal/JsonEncodingException;

    const-string v1, "Class with serial name "

    const-string v2, " cannot be serialized polymorphically because it is represented as "

    invoke-static {v1, p0, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlinx/serialization/json/internal/JsonEncodingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final x(B)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "quotation mark \'\"\'"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "string escape sequence \'\\\'"

    return-object p0

    :cond_1
    const/4 v0, 0x4

    if-ne p0, v0, :cond_2

    const-string p0, "comma \',\'"

    return-object p0

    :cond_2
    const/4 v0, 0x5

    if-ne p0, v0, :cond_3

    const-string p0, "colon \':\'"

    return-object p0

    :cond_3
    const/4 v0, 0x6

    if-ne p0, v0, :cond_4

    const-string p0, "start of the object \'{\'"

    return-object p0

    :cond_4
    const/4 v0, 0x7

    if-ne p0, v0, :cond_5

    const-string p0, "end of the object \'}\'"

    return-object p0

    :cond_5
    const/16 v0, 0x8

    if-ne p0, v0, :cond_6

    const-string p0, "start of the array \'[\'"

    return-object p0

    :cond_6
    const/16 v0, 0x9

    if-ne p0, v0, :cond_7

    const-string p0, "end of the array \']\'"

    return-object p0

    :cond_7
    const/16 v0, 0xa

    if-ne p0, v0, :cond_8

    const-string p0, "end of the input"

    return-object p0

    :cond_8
    const/16 v0, 0x7f

    if-ne p0, v0, :cond_9

    const-string p0, "invalid token"

    return-object p0

    :cond_9
    const-string p0, "valid token"

    return-object p0
.end method

.method public static final y(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected special floating-point value "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with key "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'\nCurrent output: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, -0x1

    invoke-static {p0, p2}, Lbd3/q;->r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
