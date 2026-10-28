.class public final Lzn1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzn1/a$a;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lzn1/a;",
        "Lwc3/c;",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)V",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "hormonal-insights_release"
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
.field public static final a:Lzn1/a;

.field private static final b:Lyc3/g;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lzn1/a;

    invoke-direct {v0}, Lzn1/a;-><init>()V

    sput-object v0, Lzn1/a;->a:Lzn1/a;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "HormonalScreen"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lzn1/a;->a(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    sput-object v1, Lzn1/a;->b:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lzn1/a;->c:I

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

.method private static final a(Lyc3/a;)Ll83/a0;
    .locals 4

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "id"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "type"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "navigation_title"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "navigation_subtitle"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lad3/k;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lad3/k;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_f

    invoke-interface {v0}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-static {v1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v1

    const-string v3, "id"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    const-string v4, ""

    if-eqz v3, :cond_1

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    move-object v3, v4

    :cond_2
    sget-object v5, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->UNKNOWN:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_4

    aget-object v10, v6, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    move-object v10, v2

    :goto_2
    if-nez v10, :cond_5

    move-object v12, v5

    goto :goto_3

    :cond_5
    move-object v12, v10

    :goto_3
    const-string v3, "type"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    move-object v3, v4

    :cond_7
    sget-object v5, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;->UNKNOWN:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;

    move-result-object v6

    array-length v7, v6

    :goto_4
    if-ge v8, v7, :cond_9

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_9
    move-object v9, v2

    :goto_5
    if-nez v9, :cond_a

    move-object v13, v5

    goto :goto_6

    :cond_a
    move-object v13, v9

    :goto_6
    const-string v3, "navigation_title"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_c

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_7

    :cond_b
    move-object v15, v3

    goto :goto_8

    :cond_c
    :goto_7
    move-object v15, v4

    :goto_8
    const-string v3, "navigation_subtitle"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_d

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    invoke-virtual {v4}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    :cond_d
    move-object/from16 v16, v2

    const-string v2, "content"

    invoke-virtual {v1, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    if-nez v1, :cond_e

    new-instance v1, Lkotlinx/serialization/json/JsonObject;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-direct {v1, v2}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :cond_e
    sget-object v2, Lzn1/a$a;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/UnknownScreen;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/UnknownScreen;

    :goto_9
    move-object v14, v0

    goto/16 :goto_a

    :pswitch_1
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto :goto_9

    :pswitch_2
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto :goto_9

    :pswitch_3
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto :goto_9

    :pswitch_4
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalSaveScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalSaveScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalSaveScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto :goto_9

    :pswitch_5
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNameScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNameScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNameScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto :goto_9

    :pswitch_6
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_7
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_8
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_9
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_a
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_b
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :pswitch_c
    invoke-interface {v0}, Lad3/k;->a()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen$Companion;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v0, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    goto/16 :goto_9

    :goto_a
    new-instance v11, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;

    invoke-direct/range {v11 .. v16}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;Ljava/lang/String;Ljava/lang/String;)V

    return-object v11

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HormonalScreenSerializer can only be used with JSON"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of HormonalScreen is not supported. Avoid calling this method."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lzn1/a;->b(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lzn1/a;->b:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;

    invoke-virtual {p0, p1, p2}, Lzn1/a;->c(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)V

    return-void
.end method
