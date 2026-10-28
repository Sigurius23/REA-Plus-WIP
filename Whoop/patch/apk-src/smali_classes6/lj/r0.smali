.class public final Llj/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Llj/r0;

.field public static final b:Lad3/r;

.field public static final c:Lyc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Llj/r0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Llj/r0;->a:Llj/r0;

    sget-object v0, Llj/q0;->y:Llj/q0;

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Llj/r0;->b:Lad3/r;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    sget-object v1, Llj/q0;->x:Llj/q0;

    const-string v3, "TriggerConfig"

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v7, Lyc3/a;

    invoke-direct {v7, v3}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lyc3/h;

    sget-object v4, Lyc3/l;->a:Lyc3/l;

    iget-object v1, v7, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct/range {v2 .. v7}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    sput-object v2, Llj/r0;->c:Lyc3/h;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lad3/k;

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_a

    invoke-static {v0}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    const-string v1, "conditions"

    invoke-virtual {p1, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v2, Llj/r0;->b:Lad3/r;

    if-eqz v1, :cond_0

    sget-object v3, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v3}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v3

    invoke-static {v3}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v3

    invoke-static {v3}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, "data"

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v3, "after_time"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/amplitude/android/engagement/types/AfterTimeData;->Companion:Lcom/amplitude/android/engagement/types/b;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/b;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {v2, v0, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amplitude/android/engagement/types/AfterTimeData;

    if-eqz p1, :cond_2

    new-instance v0, Llj/k0;

    new-instance v2, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;

    invoke-direct {v2, v3, p1, v1}, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/AfterTimeData;Ljava/util/List;)V

    invoke-direct {v0, v2}, Llj/k0;-><init>(Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing data for after_time"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    const-string v2, "rage_click"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto/16 :goto_0

    :sswitch_2
    const-string v3, "analytics_event"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/amplitude/android/engagement/types/EventData;->Companion:Lcom/amplitude/android/engagement/types/v;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/v;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {v2, v0, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amplitude/android/engagement/types/EventData;

    if-eqz p1, :cond_3

    new-instance v0, Llj/o0;

    new-instance v2, Lcom/amplitude/android/engagement/types/EventTriggerConfig;

    invoke-direct {v2, v3, p1, v1}, Lcom/amplitude/android/engagement/types/EventTriggerConfig;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/EventData;Ljava/util/List;)V

    invoke-direct {v0, v2}, Llj/o0;-><init>(Lcom/amplitude/android/engagement/types/EventTriggerConfig;)V

    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing data for analytics_event"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_3
    const-string v2, "user_confusion"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :sswitch_4
    const-string v2, "none"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :sswitch_5
    const-string v2, "smart_delay"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :sswitch_6
    const-string v3, "element_clicked"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_4

    sget-object v0, Lcom/amplitude/android/engagement/types/ElementClickedData;->Companion:Lcom/amplitude/android/engagement/types/q;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/q;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {v2, v0, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amplitude/android/engagement/types/ElementClickedData;

    if-eqz p1, :cond_4

    new-instance v0, Llj/n0;

    new-instance v2, Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;

    invoke-direct {v2, v3, p1, v1}, Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementClickedData;Ljava/util/List;)V

    invoke-direct {v0, v2}, Llj/n0;-><init>(Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;)V

    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing data for element_clicked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_7
    const-string v2, "immediately"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    :goto_0
    invoke-static {}, Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;->values()[Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_6

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "toLowerCase(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_7

    sget-object v6, Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;->NONE:Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    :cond_7
    invoke-virtual {p1, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    new-instance v0, Llj/p0;

    new-instance v2, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-direct {v2, v6, v1, p1}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;-><init>(Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V

    invoke-direct {v0, v2}, Llj/p0;-><init>(Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;)V

    return-object v0

    :sswitch_8
    const-string v3, "element_appeared"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_8

    sget-object v0, Lcom/amplitude/android/engagement/types/ElementAppearedData;->Companion:Lcom/amplitude/android/engagement/types/o;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/o;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {v2, v0, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amplitude/android/engagement/types/ElementAppearedData;

    if-eqz p1, :cond_8

    new-instance v0, Llj/m0;

    new-instance v2, Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;

    invoke-direct {v2, v3, p1, v1}, Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementAppearedData;Ljava/util/List;)V

    invoke-direct {v0, v2}, Llj/m0;-><init>(Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;)V

    return-object v0

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing data for element_appeared"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown trigger type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing type field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x6ea90929 -> :sswitch_8
        -0x6b4a6302 -> :sswitch_7
        -0x3de3661c -> :sswitch_6
        -0x9aa8873 -> :sswitch_5
        0x33af38 -> :sswitch_4
        0x2e23a892 -> :sswitch_3
        0x30dc34a1 -> :sswitch_2
        0x48d30616 -> :sswitch_1
        0x5bef4f50 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Llj/r0;->c:Lyc3/h;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 7

    check-cast p2, Lcom/amplitude/android/engagement/types/TriggerConfig;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lad3/p;

    instance-of v0, p2, Llj/p0;

    const-string v1, "element"

    const-string v2, "data"

    const-string v3, "conditions"

    const-string v4, "type"

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p2, Llj/p0;

    iget-object p2, p2, Llj/p0;->a:Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getType()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toLowerCase(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lad3/c;->d:Lad3/b;

    sget-object v4, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v4}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v4

    invoke-static {v4}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v4

    invoke-static {v4}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v4

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getConditions()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5, v4}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getData()Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {v0, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    :cond_0
    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p2, Llj/o0;

    sget-object v5, Llj/r0;->b:Lad3/r;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v6, "analytics_event"

    invoke-static {v6}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lcom/amplitude/android/engagement/types/EventData;->Companion:Lcom/amplitude/android/engagement/types/v;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/v;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    check-cast p2, Llj/o0;

    iget-object p2, p2, Llj/o0;->a:Lcom/amplitude/android/engagement/types/EventTriggerConfig;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/EventTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/EventData;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/EventTriggerConfig;->getConditions()Ljava/util/List;

    move-result-object p2

    invoke-static {v5, p2, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p2, Llj/m0;

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v6, "element_appeared"

    invoke-static {v6}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lcom/amplitude/android/engagement/types/ElementAppearedData;->Companion:Lcom/amplitude/android/engagement/types/o;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/o;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    check-cast p2, Llj/m0;

    iget-object p2, p2, Llj/m0;->a:Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/ElementAppearedData;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;->getConditions()Ljava/util/List;

    move-result-object p2

    invoke-static {v5, p2, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p2, Llj/n0;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v6, "element_clicked"

    invoke-static {v6}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lcom/amplitude/android/engagement/types/ElementClickedData;->Companion:Lcom/amplitude/android/engagement/types/q;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/q;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    check-cast p2, Llj/n0;

    iget-object p2, p2, Llj/n0;->a:Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/ElementClickedData;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;->getConditions()Ljava/util/List;

    move-result-object p2

    invoke-static {v5, p2, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    goto :goto_0

    :cond_4
    instance-of v0, p2, Llj/k0;

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v6, "after_time"

    invoke-static {v6}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lcom/amplitude/android/engagement/types/AfterTimeData;->Companion:Lcom/amplitude/android/engagement/types/b;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/b;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    check-cast p2, Llj/k0;

    iget-object p2, p2, Llj/k0;->a:Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/AfterTimeData;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;->getConditions()Ljava/util/List;

    move-result-object p2

    invoke-static {v5, p2, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :goto_0
    invoke-interface {p1, p2}, Lad3/p;->c(Lkotlinx/serialization/json/JsonElement;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
