.class public abstract Lad3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# instance fields
.field public final a:Lj93/d;

.field public final b:Lyc3/h;


# direct methods
.method public constructor <init>(Lj93/d;)V
    .locals 2

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad3/j;->a:Lj93/d;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JsonContentPolymorphicSerializer<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lyc3/c;->b:Lyc3/c;

    const/4 v1, 0x0

    new-array v1, v1, [Lyc3/g;

    invoke-static {p1, v0, v1}, Lvf3/b;->e(Ljava/lang/String;Lyc3/k;[Lyc3/g;)Lyc3/h;

    move-result-object p1

    iput-object p1, p0, Lad3/j;->b:Lyc3/h;

    return-void
.end method


# virtual methods
.method public abstract a(Lkotlinx/serialization/json/JsonElement;)Lwc3/b;
.end method

.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    move-result-object p1

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad3/j;->a(Lkotlinx/serialization/json/JsonElement;)Lwc3/b;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lwc3/c;

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lad3/j;->b:Lyc3/h;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lzc3/e;->getSerializersModule()Lcd3/f;

    move-result-object v0

    iget-object v1, p0, Lad3/j;->a:Lj93/d;

    invoke-virtual {v0, v1, p2}, Lcd3/f;->c(Lj93/d;Ljava/lang/Object;)Lwc3/j;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lwc3/j;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "in the scope of \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "\' is not registered for polymorphic serialization "

    const-string v2, ".\nMark the base class as \'sealed\' or register the serializer explicitly."

    const-string v3, "Class \'"

    invoke-static {v3, p2, v1, p1, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    check-cast v0, Lwc3/c;

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method
