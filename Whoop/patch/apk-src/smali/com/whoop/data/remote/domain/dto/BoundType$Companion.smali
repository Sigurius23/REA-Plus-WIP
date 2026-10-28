.class public final Lcom/whoop/data/remote/domain/dto/BoundType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/domain/dto/BoundType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/BoundType$Companion;",
        "",
        "<init>",
        "()V",
        "acceptableValues",
        "",
        "",
        "[Ljava/lang/String;",
        "fromBound",
        "Lcom/whoop/data/remote/domain/dto/BoundType;",
        "bound",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/BoundType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromBound(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 5

    const-string v0, "bound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/BoundType;->access$getAcceptableValues$cp()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/BoundType;->values()[Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/BoundType;->getChars()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Array contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string v0, "Bound was "

    const-string v1, ", but must be (, ), [, or ]"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
