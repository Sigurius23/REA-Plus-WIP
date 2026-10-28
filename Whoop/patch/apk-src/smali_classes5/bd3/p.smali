.class public final Lbd3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/serialization/internal/ElementMarker;

.field public b:Z


# direct methods
.method public constructor <init>(Lyc3/g;)V
    .locals 9

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkotlinx/serialization/internal/ElementMarker;

    new-instance v1, Landroidx/room/w0;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v2, 0x2

    const-class v4, Lbd3/p;

    const-string v5, "readIfAbsent"

    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/w0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v0, p1, v1}, Lkotlinx/serialization/internal/ElementMarker;-><init>(Lyc3/g;Lc93/m;)V

    iput-object v0, v3, Lbd3/p;->a:Lkotlinx/serialization/internal/ElementMarker;

    return-void
.end method
