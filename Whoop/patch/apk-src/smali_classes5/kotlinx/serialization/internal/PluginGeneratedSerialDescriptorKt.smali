.class public final Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001aA\u0010\u0007\u001a\u00020\u0005\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a!\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\tH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Lyc3/g;",
        "SD",
        "",
        "other",
        "Lkotlin/Function1;",
        "",
        "typeParamsAreEqual",
        "equalsImpl",
        "(Lyc3/g;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z",
        "",
        "typeParams",
        "",
        "hashCodeImpl",
        "(Lyc3/g;[Lyc3/g;)I",
        "",
        "toStringImpl",
        "(Lyc3/g;)Ljava/lang/String;",
        "kotlinx-serialization-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lyc3/g;I)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt;->toStringImpl$lambda$2(Lyc3/g;I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final equalsImpl(Lyc3/g;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SD::",
            "Lyc3/g;",
            ">(TSD;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            ")Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParamsAreEqual"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final hashCodeImpl(Lyc3/g;[Lyc3/g;)I
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v0, p1

    new-instance p1, La0/i1;

    invoke-direct {p1, p0}, La0/i1;-><init>(Lyc3/g;)V

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    invoke-virtual {p1}, La0/i1;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {p1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x1f

    check-cast v3, Lyc3/g;

    invoke-interface {v3}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :cond_0
    add-int/2addr v2, v4

    goto :goto_0

    :cond_1
    new-instance p1, La0/i1;

    invoke-direct {p1, p0}, La0/i1;-><init>(Lyc3/g;)V

    :goto_1
    invoke-virtual {p1}, La0/i1;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {p1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object p0

    mul-int/lit8 v1, v1, 0x1f

    check-cast p0, Lyc3/g;

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lyc3/k;->hashCode()I

    move-result p0

    goto :goto_2

    :cond_2
    move p0, v4

    :goto_2
    add-int/2addr v1, p0

    goto :goto_1

    :cond_3
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public static final toStringImpl(Lyc3/g;)Ljava/lang/String;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p0}, Lyc3/g;->getElementsCount()I

    move-result v1

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v0, 0x12

    invoke-direct {v6, p0, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    const/16 v7, 0x18

    const-string v3, ", "

    const-string v5, ")"

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final toStringImpl$lambda$2(Lyc3/g;I)Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0, p1}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p0

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
