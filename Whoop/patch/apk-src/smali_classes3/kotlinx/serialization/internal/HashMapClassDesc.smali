.class public final Lkotlinx/serialization/internal/HashMapClassDesc;
.super Lkotlinx/serialization/internal/MapLikeDescriptor;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlinx/serialization/internal/HashMapClassDesc;",
        "Lkotlinx/serialization/internal/MapLikeDescriptor;",
        "Lyc3/g;",
        "keyDesc",
        "valueDesc",
        "<init>",
        "(Lyc3/g;Lyc3/g;)V",
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
.method public constructor <init>(Lyc3/g;Lyc3/g;)V
    .locals 2

    const-string v0, "keyDesc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.collections.HashMap"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lkotlinx/serialization/internal/MapLikeDescriptor;-><init>(Ljava/lang/String;Lyc3/g;Lyc3/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
