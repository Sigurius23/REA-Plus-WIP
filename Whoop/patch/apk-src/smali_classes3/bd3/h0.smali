.class public abstract Lbd3/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, Lkotlinx/serialization/internal/UIntSerializer;->INSTANCE:Lkotlinx/serialization/internal/UIntSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/ULongSerializer;->INSTANCE:Lkotlinx/serialization/internal/ULongSerializer;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    sget-object v2, Lkotlinx/serialization/internal/UByteSerializer;->INSTANCE:Lkotlinx/serialization/internal/UByteSerializer;

    invoke-interface {v2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/UShortSerializer;->INSTANCE:Lkotlinx/serialization/internal/UShortSerializer;

    invoke-interface {v3}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Lyc3/g;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lbd3/h0;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Lyc3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lad3/m;->a:Lyc3/g;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lyc3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbd3/h0;->a:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
