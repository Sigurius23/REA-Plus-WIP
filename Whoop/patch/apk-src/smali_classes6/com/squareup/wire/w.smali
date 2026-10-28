.class public final Lcom/squareup/wire/w;
.super Lcom/squareup/wire/c;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public b:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 7

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "enumConstants"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    move-object v5, v4

    check-cast v5, Lcom/squareup/wire/y;

    const-string v6, "null cannot be cast to non-null type com.squareup.wire.WireEnum"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Lcom/squareup/wire/y;->getValue()I

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lcom/squareup/wire/y;

    sget-object v1, Lcom/squareup/wire/x;->x:Lcom/squareup/wire/x;

    invoke-direct {p0, v0, v1, v4}, Lcom/squareup/wire/c;-><init>(Lj93/d;Lcom/squareup/wire/x;Lcom/squareup/wire/y;)V

    iput-object p1, p0, Lcom/squareup/wire/w;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/squareup/wire/w;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/squareup/wire/w;

    invoke-virtual {p1}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object p1

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final fromValue(I)Lcom/squareup/wire/y;
    .locals 3

    iget-object v0, p0, Lcom/squareup/wire/w;->b:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/wire/w;->a:Ljava/lang/Class;

    const-string v2, "fromValue"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/wire/w;->b:Ljava/lang/reflect/Method;

    const-string v1, "javaType.getMethod(\"from\u2026romValueMethod = it\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/squareup/wire/y;

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
