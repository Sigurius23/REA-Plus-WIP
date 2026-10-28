.class public final Lcom/whoop/design/models/binding/StateBindingDeserializerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\u0008\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u0001\"\u0006\u0008\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0008\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a$\u0010\u0008\u001a\u0004\u0018\u00018\u0000\"\u0006\u0008\u0000\u0010\u0000\u0018\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0086\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a@\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u0006\u0008\u0000\u0010\n\u0018\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"!\u0010\u0018\u001a\u00020\u00118@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u0012\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "T",
        "Lkotlinx/serialization/json/JsonElement;",
        "deserializeFromState",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "value",
        "encodeForStateBinding",
        "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;",
        "",
        "coerceNumericState",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "E",
        "",
        "",
        "accumulatedState",
        "",
        "coerceListState",
        "(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/List;",
        "Lad3/c;",
        "stateBindingJson$delegate",
        "Ll83/h;",
        "getStateBindingJson",
        "()Lad3/c;",
        "getStateBindingJson$annotations",
        "()V",
        "stateBindingJson",
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


# static fields
.field private static final stateBindingJson$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr70/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lr70/b;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->stateBindingJson$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a()Lad3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->stateBindingJson_delegate$lambda$0()Lad3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final coerceListState(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_2
    instance-of v1, p0, Ljava/util/List;

    if-eqz v1, :cond_7

    new-instance v1, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_6

    :goto_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    return-object v1

    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/WithGeneratedBindings;

    if-nez v3, :cond_4

    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, p1}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_5
    return-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_7
    return-object v0
.end method

.method public static coerceListState$default(Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;
    .locals 2

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    const-string p2, "accumulatedState"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    instance-of p3, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz p3, :cond_3

    new-instance p3, Ljava/util/ArrayList;

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p2

    :cond_3
    instance-of p3, p0, Ljava/util/List;

    if-eqz p3, :cond_8

    new-instance p3, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    :goto_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    return-object p3

    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/WithGeneratedBindings;

    if-nez v1, :cond_5

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    check-cast v0, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v0, p1}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p2

    :cond_6
    return-object p0

    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p2

    :cond_8
    return-object p2
.end method

.method public static final coerceNumericState(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final deserializeFromState(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public static final encodeForStateBinding(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    const/4 p0, 0x0

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public static final getStateBindingJson()Lad3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->stateBindingJson$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    return-object v0
.end method

.method public static synthetic getStateBindingJson$annotations()V
    .locals 0

    return-void
.end method

.method private static final stateBindingJson_delegate$lambda$0()Lad3/c;
    .locals 7

    const/16 v5, 0x1f

    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/design/json/b;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object v0

    return-object v0
.end method
