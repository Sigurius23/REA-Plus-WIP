.class public final Lm91/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm91/j$a;
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
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lm91/j;",
        "Lwc3/c;",
        "Lcom/whoop/design/item/DesignItemInteraction;",
        "<init>",
        "()V",
        "Lad3/k;",
        "jsonDecoder",
        "Lkotlinx/serialization/json/JsonElement;",
        "element",
        "",
        "c",
        "(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "f",
        "e",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "d",
        "(Lzc3/e;Lcom/whoop/design/item/DesignItemInteraction;)V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/design/item/DesignItemInteraction;",
        "Lyc3/g;",
        "a",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "design_release"
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
.field public static final b:Lm91/j$a;

.field public static final c:I

.field private static final d:Ltr2/n;


# instance fields
.field private final a:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm91/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm91/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm91/j;->b:Lm91/j$a;

    const/16 v0, 0x8

    sput v0, Lm91/j;->c:I

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DesignItemInteractionSerializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lm91/j;->d:Ltr2/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "DesignItemInteraction"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lm91/j;->a(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    iput-object v1, p0, Lm91/j;->a:Lyc3/g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final a(Lyc3/a;)Ll83/a0;
    .locals 3

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "action_argument"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lcom/whoop/analytics/AnalyticEventModel;->Companion:Lcom/whoop/analytics/AnalyticEventModel$a;

    invoke-virtual {v0}, Lcom/whoop/analytics/AnalyticEventModel$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "analytic_event"

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final c(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1, p2}, Lm91/j;->f(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lm91/j;->e(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {p2}, Lu82/h;->c(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    return-object v0
.end method

.method private final e(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    new-instance v1, Luw2/b;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v0, v2, v0}, Luw2/b;-><init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1, p2}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    instance-of p2, p1, Lcom/whoop/whoopaction/domain/models/UnknownAction;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :catch_0
    :goto_0
    return-object v0
.end method

.method private final f(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    new-instance v1, Lcom/whoop/navigation/json/a;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v0, v2, v0}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1, p2}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p2

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p2, :cond_0

    return-object p1

    :catch_0
    :cond_0
    return-object v0
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 7

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
    if-eqz p1, :cond_5

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "analytic_event"

    invoke-virtual {v0, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_2

    instance-of v4, v3, Lkotlinx/serialization/json/JsonNull;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/analytics/AnalyticEventModel;->Companion:Lcom/whoop/analytics/AnalyticEventModel$a;

    invoke-virtual {v5}, Lcom/whoop/analytics/AnalyticEventModel$a;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {v4, v5, v3}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/analytics/AnalyticEventModel;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    sget-object v4, Lm91/j;->d:Ltr2/n;

    const-string v5, "AnalyticEvent deserialization failed, returning null"

    new-array v6, v2, [Lqr2/a$a;

    invoke-interface {v4, v5, v3, v6}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_2
    move-object v3, v1

    :goto_2
    :try_start_1
    const-string v4, "action_argument"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_4

    instance-of v4, v0, Lkotlinx/serialization/json/JsonNull;

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_4

    invoke-direct {p0, p1, v0}, Lm91/j;->c(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception p1

    sget-object v0, Lm91/j;->d:Ltr2/n;

    const-string v4, "ActionArgument deserialization failed, returning null"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_4
    :goto_4
    new-instance p1, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {p1, v1, v3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "DesignItemInteractionSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lzc3/e;Lcom/whoop/design/item/DesignItemInteraction;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of DesignItemInteraction not supported. DesignItemInteraction only deserialized from backend."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm91/j;->b(Lzc3/d;)Lcom/whoop/design/item/DesignItemInteraction;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lm91/j;->a:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p0, p1, p2}, Lm91/j;->d(Lzc3/e;Lcom/whoop/design/item/DesignItemInteraction;)V

    return-void
.end method
