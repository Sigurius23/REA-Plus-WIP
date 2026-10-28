.class public final Lkotlinx/serialization/internal/UShortSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlinx/serialization/internal/UShortSerializer;",
        "Lwc3/c;",
        "Ll83/y;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize-i8woANY",
        "(Lzc3/e;S)V",
        "serialize",
        "Lzc3/d;",
        "decoder",
        "deserialize-BwKQO78",
        "(Lzc3/d;)S",
        "deserialize",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
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


# static fields
.field public static final INSTANCE:Lkotlinx/serialization/internal/UShortSerializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/UShortSerializer;

    invoke-direct {v0}, Lkotlinx/serialization/internal/UShortSerializer;-><init>()V

    sput-object v0, Lkotlinx/serialization/internal/UShortSerializer;->INSTANCE:Lkotlinx/serialization/internal/UShortSerializer;

    const-string v0, "kotlin.UShort"

    sget-object v1, Lkotlinx/serialization/internal/ShortSerializer;->INSTANCE:Lkotlinx/serialization/internal/ShortSerializer;

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/InlineClassDescriptorKt;->InlinePrimitiveDescriptor(Ljava/lang/String;Lwc3/c;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lkotlinx/serialization/internal/UShortSerializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/UShortSerializer;->deserialize-BwKQO78(Lzc3/d;)S

    move-result p1

    new-instance v0, Ll83/y;

    invoke-direct {v0, p1}, Ll83/y;-><init>(S)V

    return-object v0
.end method

.method public deserialize-BwKQO78(Lzc3/d;)S
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/UShortSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->decodeInline(Lyc3/g;)Lzc3/d;

    move-result-object p1

    invoke-interface {p1}, Lzc3/d;->decodeShort()S

    move-result p1

    return p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lkotlinx/serialization/internal/UShortSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ll83/y;

    iget-short p2, p2, Ll83/y;->w:S

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/UShortSerializer;->serialize-i8woANY(Lzc3/e;S)V

    return-void
.end method

.method public serialize-i8woANY(Lzc3/e;S)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/UShortSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    invoke-interface {p1, p2}, Lzc3/e;->encodeShort(S)V

    return-void
.end method
