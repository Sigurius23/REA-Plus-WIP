.class public abstract Lxc3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;
    .locals 1

    const-string v0, "elementSerializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-direct {v0, p0}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final b(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/MapEntrySerializer;
    .locals 1

    const-string v0, "keySerializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/internal/MapEntrySerializer;

    invoke-direct {v0, p0, p1}, Lkotlinx/serialization/internal/MapEntrySerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static final c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;
    .locals 1

    const-string v0, "keySerializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v0, p0, p1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static final d(Lwc3/c;)Lwc3/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->isNullable()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lkotlinx/serialization/internal/NullableSerializer;

    invoke-direct {v0, p0}, Lkotlinx/serialization/internal/NullableSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method
