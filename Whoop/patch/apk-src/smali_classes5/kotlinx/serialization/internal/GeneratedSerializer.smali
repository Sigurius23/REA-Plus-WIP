.class public interface abstract Lkotlinx/serialization/internal/GeneratedSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/internal/GeneratedSerializer$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\u0008g\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "T",
        "Lwc3/c;",
        "",
        "childSerializers",
        "()[Lwc3/c;",
        "typeParametersSerializers",
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
.method public static synthetic access$typeParametersSerializers$jd(Lkotlinx/serialization/internal/GeneratedSerializer;)[Lwc3/c;
    .locals 0

    invoke-super {p0}, Lkotlinx/serialization/internal/GeneratedSerializer;->typeParametersSerializers()[Lwc3/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract childSerializers()[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation
.end method

.method public abstract synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
.end method

.method public abstract synthetic getDescriptor()Lyc3/g;
.end method

.method public abstract synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
.end method

.method public typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lkotlinx/serialization/internal/PluginHelperInterfacesKt;->EMPTY_SERIALIZER_ARRAY:[Lwc3/c;

    return-object v0
.end method
