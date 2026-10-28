.class public final Lkotlinx/serialization/internal/InlineClassDescriptor;
.super Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0013\u0010\r\u001a\u00020\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkotlinx/serialization/internal/InlineClassDescriptor;",
        "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;",
        "name",
        "",
        "generatedSerializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "<init>",
        "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V",
        "isInline",
        "",
        "()Z",
        "hashCode",
        "",
        "equals",
        "other",
        "",
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
.field private final isInline:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/internal/GeneratedSerializer<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generatedSerializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    iput-boolean v0, p0, Lkotlinx/serialization/internal/InlineClassDescriptor;->isInline:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lkotlinx/serialization/internal/InlineClassDescriptor;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lyc3/g;

    invoke-interface {v2}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    check-cast p1, Lkotlinx/serialization/internal/InlineClassDescriptor;

    invoke-virtual {p1}, Lkotlinx/serialization/internal/InlineClassDescriptor;->isInline()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->getTypeParameterDescriptors$kotlinx_serialization_core()[Lyc3/g;

    move-result-object v0

    invoke-virtual {p1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->getTypeParameterDescriptors$kotlinx_serialization_core()[Lyc3/g;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, Lyc3/g;->getElementsCount()I

    move-result p1

    invoke-interface {v2}, Lyc3/g;->getElementsCount()I

    move-result v0

    if-eq p1, v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p0}, Lyc3/g;->getElementsCount()I

    move-result p1

    move v0, v1

    :goto_0
    if-ge v0, p1, :cond_6

    invoke-interface {p0, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v3

    invoke-interface {v3}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v4

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p0, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v3

    invoke-interface {v3}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v3

    invoke-interface {v2, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v4

    invoke-interface {v4}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_7
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-boolean v0, p0, Lkotlinx/serialization/internal/InlineClassDescriptor;->isInline:Z

    return v0
.end method
