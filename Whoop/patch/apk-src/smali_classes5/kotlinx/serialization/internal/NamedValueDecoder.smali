.class public abstract Lkotlinx/serialization/internal/NamedValueDecoder;
.super Lkotlinx/serialization/internal/TaggedDecoder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/internal/TaggedDecoder<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\'\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0008\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/serialization/internal/NamedValueDecoder;",
        "Lkotlinx/serialization/internal/TaggedDecoder;",
        "",
        "<init>",
        "()V",
        "Lyc3/g;",
        "",
        "index",
        "getTag",
        "(Lyc3/g;I)Ljava/lang/String;",
        "nestedName",
        "nested",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "descriptor",
        "elementName",
        "parentName",
        "childName",
        "composeName",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "renderTagStack",
        "()Ljava/lang/String;",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/serialization/internal/TaggedDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public composeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "parentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "childName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    const/16 v0, 0x2e

    invoke-static {v0, p1, p2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract synthetic decodeElementIndex(Lyc3/g;)I
.end method

.method public elementName(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getTag(Lyc3/g;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/NamedValueDecoder;->getTag(Lyc3/g;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getTag(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/NamedValueDecoder;->elementName(Lyc3/g;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/NamedValueDecoder;->nested(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final nested(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "nestedName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedDecoder;->getCurrentTagOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/NamedValueDecoder;->composeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final renderTagStack()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedDecoder;->getTagStack$kotlinx_serialization_core()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "$"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedDecoder;->getTagStack$kotlinx_serialization_core()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const-string v2, "."

    const-string v3, "$."

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
