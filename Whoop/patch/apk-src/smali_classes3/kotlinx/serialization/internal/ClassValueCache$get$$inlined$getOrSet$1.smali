.class public final Lkotlinx/serialization/internal/ClassValueCache$get$$inlined$getOrSet$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/serialization/internal/ClassValueCache;->get(Lj93/d;)Lwc3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $key$inlined:Lj93/d;

.field final synthetic this$0:Lkotlinx/serialization/internal/ClassValueCache;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/internal/ClassValueCache;Lj93/d;)V
    .locals 0

    iput-object p1, p0, Lkotlinx/serialization/internal/ClassValueCache$get$$inlined$getOrSet$1;->this$0:Lkotlinx/serialization/internal/ClassValueCache;

    iput-object p2, p0, Lkotlinx/serialization/internal/ClassValueCache$get$$inlined$getOrSet$1;->$key$inlined:Lj93/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lkotlinx/serialization/internal/CacheEntry;

    iget-object v1, p0, Lkotlinx/serialization/internal/ClassValueCache$get$$inlined$getOrSet$1;->this$0:Lkotlinx/serialization/internal/ClassValueCache;

    invoke-virtual {v1}, Lkotlinx/serialization/internal/ClassValueCache;->getCompute()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, p0, Lkotlinx/serialization/internal/ClassValueCache$get$$inlined$getOrSet$1;->$key$inlined:Lj93/d;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/CacheEntry;-><init>(Lwc3/c;)V

    return-object v0
.end method
