.class public Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0010\u0018\u0000 \u001d*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001dB\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JA\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0018\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n0\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJK\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u001a\u0010\u000c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0016R!\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;",
        "",
        "Value",
        "Lj93/d;",
        "kClass",
        "<init>",
        "(Lj93/d;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "jsonReader",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "",
        "mapAdapter",
        "valueAdapter",
        "parseWithExtraData",
        "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;",
        "Lqx/c0;",
        "jsonWriter",
        "value",
        "Ll83/a0;",
        "serializeWithExtraData",
        "(Lqx/c0;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V",
        "Lj93/d;",
        "",
        "memberNames$delegate",
        "Ll83/h;",
        "getMemberNames",
        "()Ljava/util/List;",
        "memberNames",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter$Companion;

.field private static final EXTRA_DATA:Ljava/lang/String; = "extraData"


# instance fields
.field private final kClass:Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj93/d;"
        }
    .end annotation
.end field

.field private final memberNames$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->Companion:Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter$Companion;

    return-void
.end method

.method public constructor <init>(Lj93/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            ")V"
        }
    .end annotation

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->kClass:Lj93/d;

    new-instance p1, La6/l0;

    const/16 v0, 0x16

    invoke-direct {p1, p0, v0}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->memberNames$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->memberNames_delegate$lambda$1(Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private final getMemberNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->memberNames$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final memberNames_delegate$lambda$1(Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;)Ljava/util/List;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->kClass:Lj93/d;

    invoke-interface {p0}, Lj93/d;->getMembers()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/c;

    invoke-interface {v1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p0, "extraData"

    invoke-static {v0, p0}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final parseWithExtraData(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TValue;>;)TValue;"
        }
    .end annotation

    const-string v0, "jsonReader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Map;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "extraData"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->getMemberNames()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final serializeWithExtraData(Lqx/c0;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx/c0;",
            "TValue;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TValue;>;)V"
        }
    .end annotation

    const-string v0, "jsonWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lqx/c0;->J()Lqx/c0;

    return-void

    :cond_0
    invoke-virtual {p4, p2}, Lcom/squareup/moshi/JsonAdapter;->toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string p4, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p2

    const-string p4, "extraData"

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Map;

    invoke-interface {p2, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p3, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void
.end method
