.class public final Lkotlinx/serialization/internal/InstantSerializer;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlinx/serialization/internal/InstantSerializer;",
        "Lwc3/c;",
        "Lkotlin/time/Instant;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lkotlin/time/Instant;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lkotlin/time/Instant;",
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

.annotation build Lkotlin/time/ExperimentalTime;
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/serialization/internal/InstantSerializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/InstantSerializer;

    invoke-direct {v0}, Lkotlinx/serialization/internal/InstantSerializer;-><init>()V

    sput-object v0, Lkotlinx/serialization/internal/InstantSerializer;->INSTANCE:Lkotlinx/serialization/internal/InstantSerializer;

    new-instance v0, Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;

    const-string v1, "kotlin.time.Instant"

    sget-object v2, Lyc3/e;->i:Lyc3/e;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;-><init>(Ljava/lang/String;Lyc3/f;)V

    sput-object v0, Lkotlinx/serialization/internal/InstantSerializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/InstantSerializer;->deserialize(Lzc3/d;)Lkotlin/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(Lzc3/d;)Lkotlin/time/Instant;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/Instant$Companion;

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/time/Instant$Companion;->parse(Ljava/lang/CharSequence;)Lkotlin/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lkotlinx/serialization/internal/InstantSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lkotlin/time/Instant;

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/InstantSerializer;->serialize(Lzc3/e;Lkotlin/time/Instant;)V

    return-void
.end method

.method public serialize(Lzc3/e;Lkotlin/time/Instant;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lkotlin/time/Instant;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
