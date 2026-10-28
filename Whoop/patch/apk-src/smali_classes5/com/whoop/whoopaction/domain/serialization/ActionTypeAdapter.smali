.class public final Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/JsonSerializer;
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonSerializer<",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        ">;",
        "Lcom/google/gson/JsonDeserializer<",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B/\u0012\u001c\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00060\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;",
        "Lcom/google/gson/JsonSerializer;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/google/gson/JsonDeserializer;",
        "",
        "",
        "Lj93/d;",
        "customActionTypes",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljava/util/Map;Ltr2/n;)V",
        "src",
        "Ljava/lang/reflect/Type;",
        "typeOfSrc",
        "Lcom/google/gson/JsonSerializationContext;",
        "context",
        "Lcom/google/gson/JsonElement;",
        "d",
        "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;",
        "json",
        "typeOfT",
        "Lcom/google/gson/JsonDeserializationContext;",
        "b",
        "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/whoopaction/domain/models/Action;",
        "a",
        "Ljava/util/Map;",
        "Ltr2/n;",
        "Luw2/b;",
        "c",
        "Luw2/b;",
        "actionSerializer",
        "Lad3/c;",
        "Lad3/c;",
        "jsonModule",
        "whoop-action_release"
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
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ltr2/n;

.field private final c:Luw2/b;

.field private final d:Lad3/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;-><init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "customActionTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->a:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->b:Ltr2/n;

    .line 5
    new-instance v0, Luw2/b;

    invoke-direct {v0, p1, p2}, Luw2/b;-><init>(Ljava/util/Map;Ltr2/n;)V

    iput-object v0, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->c:Luw2/b;

    .line 6
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p1

    new-instance p2, Lto1/h;

    const/16 v0, 0x16

    invoke-direct {p2, v0}, Lto1/h;-><init>(I)V

    invoke-static {p1, p2}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->d:Lad3/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 7
    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 8
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ActionTypeAdapter"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;-><init>(Ljava/util/Map;Ltr2/n;)V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->c(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lad3/g;)Ll83/a0;
    .locals 4

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    new-instance v1, Lcom/whoop/navigation/json/a;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v2, v2, v3, v2}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v2, Lcom/whoop/navigation/e;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcd3/g;->k(Lj93/d;Lwc3/c;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object v0

    iput-object v0, p0, Lad3/g;->o:Lcd3/f;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public b(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeOfT"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p2, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->d:Lad3/c;

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "toString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->d:Lad3/c;

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->c:Luw2/b;

    invoke-virtual {p2, p3, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->b:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Action deserialization failed, returning UnknownAction"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/whoopaction/domain/models/UnknownAction;->INSTANCE:Lcom/whoop/whoopaction/domain/models/UnknownAction;

    return-object p1
.end method

.method public d(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
    .locals 0

    const-string p1, "typeOfSrc"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of Action not supported. Actions only deserialized from backend."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->b(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
    .locals 0

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->d(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;

    move-result-object p1

    return-object p1
.end method
