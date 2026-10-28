.class public abstract Lxy/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# instance fields
.field public final a:Ljava/lang/Enum;

.field public final b:Lyc3/g;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>([Ljava/lang/Enum;Ljava/lang/Enum;)V
    .locals 8

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lxy/a;->a:Ljava/lang/Enum;

    invoke-static {p1}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-interface {p2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lyc3/e;->i:Lyc3/e;

    invoke-static {p2, v0}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object p2

    iput-object p2, p0, Lxy/a;->b:Lyc3/g;

    array-length p2, p1

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v0, 0x10

    if-ge p2, v0, :cond_0

    move p2, v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p2, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-class v4, Lwc3/h;

    if-ge v3, p2, :cond_3

    aget-object v5, p1, v3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lwc3/h;

    if-eqz v4, :cond_1

    invoke-interface {v4}, Lwc3/h;->value()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    :cond_1
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    :cond_2
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iput-object v1, p0, Lxy/a;->c:Ljava/util/LinkedHashMap;

    array-length p2, p1

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    if-ge p2, v0, :cond_4

    goto :goto_1

    :cond_4
    move v0, p2

    :goto_1
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_7

    aget-object v1, p1, v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lwc3/h;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Lwc3/h;->value()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    :cond_6
    invoke-interface {p2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iput-object p2, p0, Lxy/a;->d:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxy/a;->d:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Enum;

    if-nez p1, :cond_0

    iget-object p1, p0, Lxy/a;->a:Ljava/lang/Enum;

    :cond_0
    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lxy/a;->b:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/Enum;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxy/a;->c:Ljava/util/LinkedHashMap;

    invoke-static {p2, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
