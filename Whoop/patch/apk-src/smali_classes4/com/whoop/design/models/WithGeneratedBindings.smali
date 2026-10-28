.class public interface abstract Lcom/whoop/design/models/WithGeneratedBindings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R*\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR?\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0002j\u0004\u0018\u0001`\r\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\t0\u00108&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0008\"\u0004\u0008\u0012\u0010\n\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;",
        "getAggregateBindings",
        "setAggregateBindings",
        "aggregateBindings",
        "state-binding-annotations"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation
.end method

.method public abstract getAggregateBindings()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBindings()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setAggregateBindings(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setBindings(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
