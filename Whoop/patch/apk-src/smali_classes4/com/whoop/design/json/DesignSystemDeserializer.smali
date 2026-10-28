.class public final Lcom/whoop/design/json/DesignSystemDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonDeserializer<",
        "Lcom/whoop/design/models/DesignSystemModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0018\u0008\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/json/DesignSystemDeserializer;",
        "Lcom/google/gson/JsonDeserializer;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "",
        "Lj93/d;",
        "additionalModels",
        "Lcom/whoop/design/json/DesignSystemTypeAdapter;",
        "adapter",
        "<init>",
        "(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;)V",
        "Lcom/google/gson/JsonElement;",
        "json",
        "Ljava/lang/reflect/Type;",
        "typeOfT",
        "Lcom/google/gson/JsonDeserializationContext;",
        "context",
        "a",
        "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/json/DesignSystemTypeAdapter;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/design/json/DesignSystemTypeAdapter;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/whoop/design/json/DesignSystemDeserializer;-><init>(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Lcom/whoop/design/json/DesignSystemTypeAdapter;",
            ")V"
        }
    .end annotation

    const-string v0, "additionalModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "adapter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/whoop/design/json/DesignSystemDeserializer;->a:Lcom/whoop/design/json/DesignSystemTypeAdapter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    new-instance p2, Lcom/whoop/design/json/DesignSystemTypeAdapter;

    invoke-direct {p2, p1}, Lcom/whoop/design/json/DesignSystemTypeAdapter;-><init>(Ljava/util/Map;)V

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/design/json/DesignSystemDeserializer;-><init>(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeOfT"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/design/json/DesignSystemDeserializer;->a:Lcom/whoop/design/json/DesignSystemTypeAdapter;

    invoke-virtual {v0, p1, p2, p3}, Lcom/whoop/design/json/DesignSystemTypeAdapter;->c(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/json/DesignSystemDeserializer;->a(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    return-object p1
.end method
