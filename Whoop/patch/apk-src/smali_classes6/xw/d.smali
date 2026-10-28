.class public abstract Lxw/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Low/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Low/n;

    invoke-direct {v0}, Low/n;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Low/n;->l:I

    const/4 v1, 0x1

    iput-boolean v1, v0, Low/n;->g:Z

    sget-object v1, Low/x;->y:Low/v;

    iput-object v1, v0, Low/n;->n:Low/x;

    const/4 v1, 0x0

    iput-boolean v1, v0, Low/n;->j:Z

    invoke-virtual {v0}, Low/n;->a()Low/m;

    move-result-object v0

    sput-object v0, Lxw/d;->a:Low/m;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;
    .locals 0

    invoke-static {p0, p1}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Lxw/b;

    invoke-direct {p1, p0}, Lxw/a;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static b(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Date;
    .locals 3

    const-class v0, Ljava/lang/Number;

    invoke-static {p1, p0, v0}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr p0, v1

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public static c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string p2, "Unexpected type of JSON object member "

    const-string v0, ""

    invoke-static {p2, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    const-class v0, Ljava/util/Map;

    invoke-static {p1, p0, v0}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/text/ParseException;

    const-string v0, "JSON object member "

    const-string v1, " not a JSON object"

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    return-object p1
.end method

.method public static e(Ljava/lang/String;Ljava/util/Map;)J
    .locals 2

    const-class v0, Ljava/lang/Number;

    invoke-static {p1, p0, v0}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p1, Ljava/text/ParseException;

    const-string v0, "JSON object member "

    const-string v1, " is missing or null"

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public static f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    const-class v0, Ljava/lang/String;

    invoke-static {p1, p0, v0}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
    .locals 3

    const-class v0, Ljava/util/List;

    invoke-static {p1, p0, v0}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :catch_0
    new-instance p1, Ljava/text/ParseException;

    const-string v0, "JSON object member "

    const-string v2, " is not an array of strings"

    invoke-static {v0, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public static h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;
    .locals 1

    invoke-static {p0, p1}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_0
    new-instance p1, Ljava/net/URI;

    invoke-direct {p1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/text/ParseException;

    invoke-virtual {p0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public static i(ILjava/lang/String;)Ljava/util/Map;
    .locals 13

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, "Invalid JSON object"

    if-nez v1, :cond_8

    if-ltz p0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/text/ParseException;

    const-string v1, "The parsed string is longer than the max accepted size of "

    const-string v2, " characters"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_1
    :goto_0
    const/4 p0, 0x2

    new-array v1, p0, [Ljava/lang/reflect/Type;

    const-class v3, Ljava/lang/String;

    aput-object v3, v1, v0

    const-class v3, Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-class v3, Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v4

    array-length v5, v4

    if-ne p0, v5, :cond_7

    invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Raw type "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is not supported because it requires specifying an owner type"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    move p0, v0

    :goto_2
    if-ge p0, v5, :cond_6

    aget-object v6, v1, p0

    const-string v7, "Type argument must not be null"

    invoke-static {v6, v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {v6}, Lqw/g;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    aget-object v8, v4, p0

    invoke-interface {v8}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v9

    array-length v10, v9

    move v11, v0

    :goto_3
    if-ge v11, v10, :cond_5

    aget-object v12, v9, v11

    invoke-static {v12}, Lqw/g;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_4

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Type argument "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not satisfy bounds for type variable "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " declared by "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_6
    new-instance p0, Lqw/e;

    const/4 v4, 0x0

    invoke-direct {p0, v4, v3, v1}, Lqw/e;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    invoke-static {p0}, Lqw/g;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lqw/g;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    :try_start_0
    sget-object v1, Lxw/d;->a:Low/m;

    invoke-virtual {v1, p1, p0}, Low/m;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/text/ParseException;

    const-string p1, "Excessive JSON object and / or array nesting"

    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :catch_1
    new-instance p0, Ljava/text/ParseException;

    invoke-direct {p0, v2, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " requires "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " type arguments, but got 2"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/text/ParseException;

    invoke-direct {p0, v2, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_9
    new-instance p0, Ljava/text/ParseException;

    const-string p1, "The JSON object string must not be null"

    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static j(Ljava/util/Map;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lxw/d;->a:Low/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    new-instance v3, Lww/b;

    invoke-direct {v3, v2}, Lww/b;-><init>(Ljava/io/Writer;)V

    iget-object v4, v0, Low/m;->h:Low/i;

    invoke-virtual {v3, v4}, Lww/b;->x(Low/i;)V

    iget-boolean v4, v0, Low/m;->g:Z

    iput-boolean v4, v3, Lww/b;->I:Z

    iget v4, v0, Low/m;->i:I

    if-nez v4, :cond_0

    const/4 v4, 0x2

    :cond_0
    invoke-virtual {v3, v4}, Lww/b;->J(I)V

    iget-boolean v4, v0, Low/m;->f:Z

    iput-boolean v4, v3, Lww/b;->K:Z

    check-cast p0, Ljava/util/Map;

    invoke-virtual {v0, p0, v1, v3}, Low/m;->d(Ljava/util/Map;Ljava/lang/Class;Lww/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
