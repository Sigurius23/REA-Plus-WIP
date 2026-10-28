.class public abstract Lcom/whoop/design/json/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0008\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u00032\u001c\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00050\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001aI\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0018\u0008\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u00032\u001c\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00050\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aS\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0008\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u00032\u001c\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00050\u0003H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lxf3/c;",
        "Lcom/google/gson/GsonBuilder;",
        "gsonBuilder",
        "",
        "",
        "Lj93/d;",
        "featureModels",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "featureActions",
        "e",
        "(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;",
        "d",
        "(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;",
        "Liy1/c;",
        "metricWriter",
        "b",
        "(Lcom/google/gson/GsonBuilder;Liy1/c;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/AiAction;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/design/json/d;->c(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/AiAction;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/google/gson/GsonBuilder;Liy1/c;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/GsonBuilder;",
            "Liy1/c;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;)",
            "Lcom/google/gson/GsonBuilder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureModels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureActions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->LOWER_CASE_WITH_UNDERSCORES:Lcom/google/gson/FieldNamingPolicy;

    invoke-virtual {p0, v0}, Lcom/google/gson/GsonBuilder;->setFieldNamingStrategy(Lcom/google/gson/FieldNamingStrategy;)Lcom/google/gson/GsonBuilder;

    new-instance v0, Lcom/whoop/design/json/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Lcom/whoop/navigation/AiAction;

    invoke-virtual {p0, v1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance v0, Lcom/whoop/design/json/DesignSystemDeserializer;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p2, v1, v2, v1}, Lcom/whoop/design/json/DesignSystemDeserializer;-><init>(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class p2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {p0, p2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p2, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;

    const/4 v0, 0x1

    invoke-direct {p2, v1, p1, v0, v1}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class p1, Lcom/whoop/navigation/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;

    invoke-direct {p1, p3, v1, v2, v1}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;-><init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class p2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/design/json/AnyModalDeserializer;

    invoke-direct {p1}, Lcom/whoop/design/json/AnyModalDeserializer;-><init>()V

    const-class p2, Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/design/json/GraphPlotDeserializer;

    invoke-direct {p1}, Lcom/whoop/design/json/GraphPlotDeserializer;-><init>()V

    const-class p2, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/design/json/TextResourceDeserializer;

    invoke-direct {p1}, Lcom/whoop/design/json/TextResourceDeserializer;-><init>()V

    const-class p2, Lcom/whoop/design/util/TextResource;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory;

    invoke-direct {p1}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory;-><init>()V

    invoke-virtual {p0, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    new-instance p1, Lcom/whoop/navigation/json/AppScreenTypeAdapterFactory;

    invoke-direct {p1, v1, v0, v1}, Lcom/whoop/navigation/json/AppScreenTypeAdapterFactory;-><init>(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    invoke-static {p0}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    return-object p0
.end method

.method private static final c(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/AiAction;
    .locals 0

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "toString(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {p2}, Lcom/whoop/navigation/AiAction$a;->serializer()Lwc3/c;

    move-result-object p2

    check-cast p2, Lwc3/b;

    invoke-virtual {p1, p2, p0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/AiAction;

    return-object p0
.end method

.method public static final d(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/GsonBuilder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;)",
            "Lcom/google/gson/GsonBuilder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureActions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Liy1/f;->a:Liy1/f;

    invoke-static {p0, v0, p1, p2}, Lcom/whoop/design/json/d;->b(Lcom/google/gson/GsonBuilder;Liy1/c;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf3/c;",
            "Lcom/google/gson/GsonBuilder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;)",
            "Lcom/google/gson/GsonBuilder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gsonBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureModels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureActions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Liy1/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liy1/c;

    invoke-static {p1, p0, p2, p3}, Lcom/whoop/design/json/d;->b(Lcom/google/gson/GsonBuilder;Liy1/c;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, Lcom/whoop/design/json/d;->d(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/json/d;->e(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    return-object p0
.end method
