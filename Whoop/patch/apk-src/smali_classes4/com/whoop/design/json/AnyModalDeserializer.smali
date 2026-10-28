.class public final Lcom/whoop/design/json/AnyModalDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/json/AnyModalDeserializer$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonDeserializer<",
        "Lcom/whoop/design/models/modal/AnyModal;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/json/AnyModalDeserializer;",
        "Lcom/google/gson/JsonDeserializer;",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "<init>",
        "()V",
        "Lcom/google/gson/JsonElement;",
        "json",
        "Ljava/lang/reflect/Type;",
        "typeOfT",
        "Lcom/google/gson/JsonDeserializationContext;",
        "context",
        "a",
        "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/modal/AnyModal;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "b",
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


# static fields
.field private static final b:Lcom/whoop/design/json/AnyModalDeserializer$a;

.field public static final c:I


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/json/AnyModalDeserializer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/json/AnyModalDeserializer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/json/AnyModalDeserializer;->b:Lcom/whoop/design/json/AnyModalDeserializer$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/json/AnyModalDeserializer;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AnyModalDeserializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/design/json/AnyModalDeserializer;->a:Ltr2/n;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 6

    const-string v0, "Unknown modal type: "

    const-string v1, "json"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "typeOfT"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    const-string p2, "type"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object v1, Lcom/whoop/design/json/a;->b:Lcom/whoop/design/json/a$a;

    invoke-virtual {v1}, Lcom/whoop/design/json/a$a;->a()Ljava/util/Map;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d;

    if-eqz v1, :cond_1

    const-string p2, "content"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p2

    invoke-interface {p3, p1, p2}, Lcom/google/gson/JsonDeserializationContext;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lcom/whoop/design/models/modal/Modal;

    :goto_0
    move-object v1, p1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing \"content\" field"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing \"type\" field"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object p2, p0, Lcom/whoop/design/json/AnyModalDeserializer;->a:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Modal deserialization failed, returning UnknownModal"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/design/models/modal/UnknownModal;->INSTANCE:Lcom/whoop/design/models/modal/UnknownModal;

    goto :goto_0

    :goto_2
    new-instance v0, Lcom/whoop/design/models/modal/AnyModal;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/modal/AnyModal;-><init>(Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/json/AnyModalDeserializer;->a(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    return-object p1
.end method
