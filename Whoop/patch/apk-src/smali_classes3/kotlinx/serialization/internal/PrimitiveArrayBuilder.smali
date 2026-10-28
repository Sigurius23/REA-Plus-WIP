.class public abstract Lkotlinx/serialization/internal/PrimitiveArrayBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Array:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008!\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\t\u0008\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H \u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\r\u001a\u00028\u0000H \u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u00058 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;",
        "Array",
        "",
        "<init>",
        "()V",
        "",
        "requiredCapacity",
        "Ll83/a0;",
        "ensureCapacity$kotlinx_serialization_core",
        "(I)V",
        "ensureCapacity",
        "build$kotlinx_serialization_core",
        "()Ljava/lang/Object;",
        "build",
        "getPosition$kotlinx_serialization_core",
        "()I",
        "position",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ensureCapacity$kotlinx_serialization_core$default(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;IILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/PrimitiveArrayBuilder;->getPosition$kotlinx_serialization_core()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/PrimitiveArrayBuilder;->ensureCapacity$kotlinx_serialization_core(I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: ensureCapacity"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract build$kotlinx_serialization_core()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TArray;"
        }
    .end annotation
.end method

.method public abstract ensureCapacity$kotlinx_serialization_core(I)V
.end method

.method public abstract getPosition$kotlinx_serialization_core()I
.end method
