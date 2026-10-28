.class public final Lbd3/s;
.super Lbd3/b;
.source "SourceFile"


# instance fields
.field public final d:Lkotlinx/serialization/json/JsonElement;


# direct methods
.method public synthetic constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonElement;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lbd3/s;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p3}, Lbd3/b;-><init>(Lad3/c;Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, Lbd3/s;->d:Lkotlinx/serialization/json/JsonElement;

    .line 4
    const-string p1, "primitive"

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/TaggedDecoder;->pushTag(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final e(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitive"

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lbd3/s;->d:Lkotlinx/serialization/json/JsonElement;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This input can only handle primitives with \'primitive\' tag"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lbd3/s;->d:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method
