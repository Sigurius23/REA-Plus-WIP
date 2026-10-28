.class public final Liq0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008`\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Liq0/f;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ljava/util/HashMap;",
        "",
        "Liq0/g;",
        "Lkotlin/collections/HashMap;",
        "a",
        "(Lio/getstream/chat/android/models/Message;)Ljava/util/HashMap;",
        "community_release"
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
.field public static final a:Liq0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liq0/f;

    invoke-direct {v0}, Liq0/f;-><init>()V

    sput-object v0, Liq0/f;->a:Liq0/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/getstream/chat/android/models/Message;)Ljava/util/HashMap;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Liq0/g;",
            ">;"
        }
    .end annotation

    const-string v0, "message"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Liq0/g;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "love"

    invoke-direct/range {v2 .. v8}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ll83/k;

    const-string v0, "love"

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Liq0/g;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "like"

    invoke-direct/range {v4 .. v10}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ll83/k;

    const-string v2, "like"

    invoke-direct {v0, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Liq0/g;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v8, 0x0

    const-string v9, "dislike"

    invoke-direct/range {v5 .. v11}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ll83/k;

    const-string v4, "dislike"

    invoke-direct {v2, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Liq0/g;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v9, 0x0

    const-string v10, "haha"

    invoke-direct/range {v6 .. v12}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ll83/k;

    const-string v5, "haha"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Liq0/g;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v10, 0x0

    const-string v11, "wow"

    invoke-direct/range {v7 .. v13}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ll83/k;

    const-string v6, "wow"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Liq0/g;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v11, 0x0

    const-string v12, "sad"

    invoke-direct/range {v8 .. v14}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Ll83/k;

    const-string v7, "sad"

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Liq0/g;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v12, 0x0

    const-string v13, "strong"

    invoke-direct/range {v9 .. v15}, Liq0/g;-><init>(IZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ll83/k;

    const-string v8, "strong"

    invoke-direct {v7, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v6

    move-object v9, v7

    move-object v6, v4

    move-object v7, v5

    move-object v4, v0

    move-object v5, v2

    filled-new-array/range {v3 .. v9}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Liq0/g;

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Liq0/g;->b(Liq0/g;IZZLjava/lang/String;ILjava/lang/Object;)Liq0/g;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Liq0/g;

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Liq0/g;->b(Liq0/g;IZZLjava/lang/String;ILjava/lang/Object;)Liq0/g;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-object v0
.end method
