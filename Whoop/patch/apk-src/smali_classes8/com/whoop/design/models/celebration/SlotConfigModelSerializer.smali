.class public final Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/SlotConfigModelSerializer$WhenMappings;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;",
        "Lwc3/c;",
        "Lcom/whoop/design/models/celebration/SlotConfigModel;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/celebration/SlotConfigModel;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/celebration/SlotConfigModel;)V",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;

    invoke-direct {v0}, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->INSTANCE:Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "SlotConfigModel"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->descriptor$lambda$0(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    sput-object v1, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->descriptor:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->$stable:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final descriptor$lambda$0(Lyc3/a;)Ll83/a0;
    .locals 4

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "name"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "mode"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonObject;->Companion:Lad3/y;

    invoke-virtual {v0}, Lad3/y;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "options"

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Lcom/whoop/design/models/celebration/SlotConfigModel;
    .locals 5

    .line 2
    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    check-cast p1, Lad3/k;

    .line 4
    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    .line 5
    const-string v1, "name"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_7

    invoke-static {v1}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v1

    .line 6
    const-string v2, "mode"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_6

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v2

    .line 7
    sget-object v3, Lcom/whoop/design/models/celebration/SlotModeModel;->Companion:Lcom/whoop/design/models/celebration/SlotModeModel$Companion;

    invoke-virtual {v3, v2}, Lcom/whoop/design/models/celebration/SlotModeModel$Companion;->getMode(Ljava/lang/String;)Lcom/whoop/design/models/celebration/SlotModeModel;

    move-result-object v2

    .line 8
    const-string v3, "options"

    invoke-virtual {v0, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v3}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 9
    :cond_0
    sget-object v3, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-eq v3, v4, :cond_3

    const/4 v4, 0x4

    if-eq v3, v4, :cond_2

    const/4 p1, 0x5

    if-ne v3, p1, :cond_1

    .line 10
    sget-object p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;->INSTANCE:Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;

    goto :goto_0

    .line 11
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 12
    :cond_2
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v3, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;

    invoke-virtual {v3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {p1, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel;

    goto :goto_0

    .line 13
    :cond_3
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v3, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel$Companion;

    invoke-virtual {v3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {p1, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel;

    goto :goto_0

    .line 14
    :cond_4
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v3, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel$Companion;

    invoke-virtual {v3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {p1, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel;

    goto :goto_0

    .line 15
    :cond_5
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v3, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;

    invoke-virtual {v3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {p1, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel;

    .line 16
    :goto_0
    new-instance v0, Lcom/whoop/design/models/celebration/SlotConfigModel;

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/design/models/celebration/SlotConfigModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)V

    return-object v0

    .line 17
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SlotConfigModel: required field \'mode\' is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SlotConfigModel: required field \'name\' is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/celebration/SlotConfigModel;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/whoop/design/models/celebration/SlotConfigModel;)V
    .locals 5

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    check-cast p1, Lad3/p;

    .line 3
    invoke-virtual {p2}, Lcom/whoop/design/models/celebration/SlotConfigModel;->getOptions()Lcom/whoop/design/models/celebration/SlotOptionsModel;

    move-result-object v0

    .line 4
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {v1, v2, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_0
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {v1, v2, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_1
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;

    if-eqz v1, :cond_2

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {v1, v2, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_2
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {v1, v2, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_3
    instance-of v0, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;

    if-eqz v0, :cond_4

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 9
    :goto_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    invoke-virtual {p2}, Lcom/whoop/design/models/celebration/SlotConfigModel;->getName()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-static {v2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    .line 12
    const-string v3, "element"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const-string v4, "name"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    .line 14
    invoke-virtual {p2}, Lcom/whoop/design/models/celebration/SlotConfigModel;->getMode()Lcom/whoop/design/models/celebration/SlotModeModel;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "toLowerCase(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    .line 16
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const-string v2, "mode"

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    .line 18
    const-string p2, "options"

    .line 19
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    .line 20
    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 21
    invoke-interface {p1, p2}, Lad3/p;->c(Lkotlinx/serialization/json/JsonElement;)V

    return-void

    .line 22
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/design/models/celebration/SlotConfigModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->serialize(Lzc3/e;Lcom/whoop/design/models/celebration/SlotConfigModel;)V

    return-void
.end method
