.class public final Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/PricingSelectionCardModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/PricingSelectionCardModel;
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
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

    invoke-direct {v0}, Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->INSTANCE:Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    .line 3
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
