.class public final Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/design/models/binding/ContentBindingResolverKt;->resolveBinding(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0xb0
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;

    invoke-direct {v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;-><init>()V

    sput-object v0, Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;->INSTANCE:Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$1;->invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    .line 3
    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    .line 4
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method
