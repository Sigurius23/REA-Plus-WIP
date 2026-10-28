.class public abstract Lkotlinx/serialization/internal/ListLikeDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc3/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001B\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u001e\u001a\u0004\u0008\u0014\u0010\u001fR\u001a\u0010 \u001a\u00020\u00058\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u0082\u0001\u0005\'()*+\u00a8\u0006,"
    }
    d2 = {
        "Lkotlinx/serialization/internal/ListLikeDescriptor;",
        "Lyc3/g;",
        "elementDescriptor",
        "<init>",
        "(Lyc3/g;)V",
        "",
        "index",
        "",
        "getElementName",
        "(I)Ljava/lang/String;",
        "name",
        "getElementIndex",
        "(Ljava/lang/String;)I",
        "",
        "isElementOptional",
        "(I)Z",
        "",
        "",
        "getElementAnnotations",
        "(I)Ljava/util/List;",
        "getElementDescriptor",
        "(I)Lyc3/g;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "Lyc3/g;",
        "()Lyc3/g;",
        "elementsCount",
        "I",
        "getElementsCount",
        "Lyc3/k;",
        "getKind",
        "()Lyc3/k;",
        "kind",
        "Lkotlinx/serialization/internal/ArrayClassDesc;",
        "Lkotlinx/serialization/internal/ArrayListClassDesc;",
        "Lkotlinx/serialization/internal/HashSetClassDesc;",
        "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;",
        "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;",
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


# instance fields
.field private final elementDescriptor:Lyc3/g;

.field private final elementsCount:I


# direct methods
.method private constructor <init>(Lyc3/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementsCount:I

    return-void
.end method

.method public synthetic constructor <init>(Lyc3/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlinx/serialization/internal/ListLikeDescriptor;-><init>(Lyc3/g;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkotlinx/serialization/internal/ListLikeDescriptor;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    check-cast p1, Lkotlinx/serialization/internal/ListLikeDescriptor;

    iget-object v3, p1, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public getElementAnnotations(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    const-string v0, "Illegal index "

    const-string v1, ", "

    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expects only non-negative indices"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getElementDescriptor()Lyc3/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    return-object v0
.end method

.method public getElementDescriptor(I)Lyc3/g;
    .locals 2

    if-ltz p1, :cond_0

    .line 2
    iget-object p1, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    return-object p1

    .line 3
    :cond_0
    const-string v0, "Illegal index "

    const-string v1, ", "

    .line 4
    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expects only non-negative indices"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getElementIndex(Ljava/lang/String;)I
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " is not a valid list index"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getElementName(I)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getElementsCount()I
    .locals 1

    iget v0, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementsCount:I

    return v0
.end method

.method public getKind()Lyc3/k;
    .locals 1

    sget-object v0, Lyc3/l;->b:Lyc3/l;

    return-object v0
.end method

.method public abstract synthetic getSerialName()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public isElementOptional(I)Z
    .locals 2

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "Illegal index "

    const-string v1, ", "

    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expects only non-negative indices"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNullable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ListLikeDescriptor;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlinx/serialization/internal/ListLikeDescriptor;->elementDescriptor:Lyc3/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
