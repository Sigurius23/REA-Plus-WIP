.class public final Lbd3/x;
.super Lbd3/b;
.source "SourceFile"


# instance fields
.field public final d:Lkotlinx/serialization/json/JsonArray;

.field public final e:I

.field public f:I


# direct methods
.method public constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonArray;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbd3/b;-><init>(Lad3/c;Ljava/lang/String;)V

    iput-object p2, p0, Lbd3/x;->d:Lkotlinx/serialization/json/JsonArray;

    invoke-virtual {p2}, Lkotlinx/serialization/json/JsonArray;->size()I

    move-result p1

    iput p1, p0, Lbd3/x;->e:I

    const/4 p1, -0x1

    iput p1, p0, Lbd3/x;->f:I

    return-void
.end method


# virtual methods
.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lbd3/x;->f:I

    iget v0, p0, Lbd3/x;->e:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lbd3/x;->f:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final e(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/x;->d:Lkotlinx/serialization/json/JsonArray;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Lkotlinx/serialization/json/JsonArray;->get(I)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final elementName(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lbd3/x;->d:Lkotlinx/serialization/json/JsonArray;

    return-object v0
.end method
