.class public final Lcom/whoop/navigation/json/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/json/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \"2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B/\u0012\u001c\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u00050\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/navigation/json/a;",
        "Lwc3/c;",
        "Lcom/whoop/navigation/e;",
        "",
        "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
        "Lj93/d;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "screenModelMap",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Ljava/util/Map;Liy1/c;)V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "b",
        "(Lzc3/e;Lcom/whoop/navigation/e;)V",
        "Lzc3/d;",
        "decoder",
        "a",
        "(Lzc3/d;)Lcom/whoop/navigation/e;",
        "Ljava/util/Map;",
        "Liy1/c;",
        "Ltr2/n;",
        "c",
        "Ltr2/n;",
        "logger",
        "Lyc3/g;",
        "d",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "e",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcom/whoop/navigation/json/a$a;

.field public static final f:I


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Liy1/c;

.field private final c:Ltr2/n;

.field private final d:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/json/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/json/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/json/a;->e:Lcom/whoop/navigation/json/a$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/json/a;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Liy1/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
            "+",
            "Lj93/d;",
            ">;",
            "Liy1/c;",
            ")V"
        }
    .end annotation

    const-string v0, "screenModelMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/navigation/json/a;->a:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Lcom/whoop/navigation/json/a;->b:Liy1/c;

    .line 4
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "NavigationActionSerializer"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/navigation/json/a;->c:Ltr2/n;

    const/4 p1, 0x0

    .line 5
    new-array p1, p1, [Lyc3/g;

    const-string p2, "NavigationAction"

    invoke-static {p2, p1}, Lvf3/b;->c(Ljava/lang/String;[Lyc3/g;)Lyc3/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/navigation/json/a;->d:Lyc3/g;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 6
    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 7
    sget-object p2, Liy1/f;->a:Liy1/f;

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;)V

    return-void
.end method


# virtual methods
.method public a(Lzc3/d;)Lcom/whoop/navigation/e;
    .locals 8

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_c

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    instance-of v2, v0, Lkotlinx/serialization/json/JsonObject;

    if-nez v2, :cond_1

    iget-object p1, p0, Lcom/whoop/navigation/json/a;->c:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to find the element NavigationAction: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    const-string v2, "screen"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_b

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    const-string v3, "parameters"

    invoke-virtual {v0, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-nez v3, :cond_2

    new-instance v3, Lkotlinx/serialization/json/JsonObject;

    sget-object v4, Lm83/z;->w:Lm83/z;

    invoke-direct {v3, v4}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_2
    instance-of v4, v3, Lkotlinx/serialization/json/JsonObject;

    if-eqz v4, :cond_a

    check-cast v3, Lkotlinx/serialization/json/JsonObject;

    :goto_1
    const-string v4, "tab"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v4, :cond_3

    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_4

    const-string v4, "id"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lj02/v0;

    invoke-direct {v1, v0}, Lj02/v0;-><init>(Ljava/lang/String;)V

    :cond_4
    sget-object v0, Lcom/whoop/navigation/AppScreen;->Companion:Lcom/whoop/navigation/AppScreen$q1;

    iget-object v4, p0, Lcom/whoop/navigation/json/a;->a:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    invoke-virtual {v6}, Lcom/whoop/navigation/FeatureSpecificAppScreen;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v0, v2, v5}, Lcom/whoop/navigation/AppScreen$q1;->a(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v4, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance p1, Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;

    invoke-direct {p1, v2, v3}, Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;-><init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V

    sget-object v0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->Companion:Lcom/whoop/navigation/exception/NavigationDeserializationException$a;

    iget-object v5, p0, Lcom/whoop/navigation/json/a;->c:Ltr2/n;

    iget-object v6, p0, Lcom/whoop/navigation/json/a;->b:Liy1/c;

    invoke-virtual {v0, v2, v3, v5, v6}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;->c(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ltr2/n;Liy1/c;)Lcom/whoop/navigation/exception/NavigationDeserializationException;

    new-instance v0, Lcom/whoop/navigation/e;

    invoke-direct {v0, v4, p1, v1}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)V

    return-object v0

    :cond_6
    instance-of v2, v0, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/whoop/navigation/json/a;->a:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/d;

    goto :goto_4

    :cond_7
    sget-object v2, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->d:Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;

    invoke-virtual {v2}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/d;

    :goto_4
    if-eqz v2, :cond_8

    invoke-static {v2}, Lvb/g;->i(Lj93/d;)Lwc3/c;

    move-result-object v2

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    check-cast v2, Lwc3/b;

    invoke-virtual {p1, v2, v3}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/navigation/NavigationScreenModel;

    if-nez p1, :cond_9

    :cond_8
    sget-object p1, Lcom/whoop/navigation/NavigationScreenModel$None;->INSTANCE:Lcom/whoop/navigation/NavigationScreenModel$None;

    :cond_9
    new-instance v2, Lcom/whoop/navigation/e;

    invoke-direct {v2, v0, p1, v1}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)V

    return-object v2

    :cond_a
    new-instance p1, Lkotlinx/serialization/SerializationException;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationAction \"parameters\" must be an object, got "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "NavigationAction is missing \"screen\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "NavigationActionSerializer only works with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lzc3/e;Lcom/whoop/navigation/e;)V
    .locals 5

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/p;

    if-eqz v0, :cond_0

    check-cast p1, Lad3/p;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/navigation/json/a;->a:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->d:Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;

    invoke-virtual {v1}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d;

    :goto_1
    if-eqz v1, :cond_2

    invoke-static {v1}, Lvb/g;->i(Lj93/d;)Lwc3/c;

    move-result-object v1

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/whoop/navigation/NavigationScreenModel$None;->INSTANCE:Lcom/whoop/navigation/NavigationScreenModel$None;

    invoke-virtual {v1}, Lcom/whoop/navigation/NavigationScreenModel$None;->serializer()Lwc3/c;

    move-result-object v1

    :goto_2
    const-string v2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<com.whoop.navigation.NavigationScreenModel>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v2

    check-cast v1, Lwc3/j;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v3, "element"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "screen"

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    const-string v0, "parameters"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->e()Lj02/v0;

    move-result-object p2

    if-eqz p2, :cond_3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p2}, Lj02/v0;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "id"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    const-string v0, "tab"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    :cond_3
    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v2}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    invoke-interface {p1, p2}, Lad3/p;->c(Lkotlinx/serialization/json/JsonElement;)V

    return-void

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string p2, "NavigationActionSerializer only works with JSON"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/navigation/json/a;->a(Lzc3/d;)Lcom/whoop/navigation/e;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/json/a;->d:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/navigation/json/a;->b(Lzc3/e;Lcom/whoop/navigation/e;)V

    return-void
.end method
