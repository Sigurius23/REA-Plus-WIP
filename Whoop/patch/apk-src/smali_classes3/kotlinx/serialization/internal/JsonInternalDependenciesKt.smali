.class public final Lkotlinx/serialization/internal/JsonInternalDependenciesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lyc3/g;",
        "",
        "",
        "jsonCachedSerialNames",
        "(Lyc3/g;)Ljava/util/Set;",
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
.method public static final jsonCachedSerialNames(Lyc3/g;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyc3/g;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlinx/serialization/internal/CoreFriendModuleApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlinx/serialization/internal/Platform_commonKt;->cachedSerialNames(Lyc3/g;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
