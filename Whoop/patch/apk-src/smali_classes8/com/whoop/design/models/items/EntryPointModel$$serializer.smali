.class public final synthetic Lcom/whoop/design/models/items/EntryPointModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/EntryPointModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/EntryPointModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/EntryPointModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/EntryPointModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/EntryPointModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/EntryPointModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/design/models/items/EntryPointModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/EntryPointModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/EntryPointModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.EntryPointModel"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "body"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "callToAction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "destination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigationTag"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dismissAction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "analyticEvents"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "genericInteraction"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dismissId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/EntryPointModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lmd1/a;->a:Lmd1/a;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/4 v7, 0x7

    aget-object v8, v0, v7

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/c;

    invoke-static {v8}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-static {v9}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    const/16 v10, 0x9

    aget-object v0, v0, v10

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v11, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;

    invoke-static {v11}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    sget-object v12, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    const/16 v14, 0xd

    new-array v14, v14, [Lwc3/c;

    const/4 v15, 0x0

    aput-object v2, v14, v15

    const/4 v2, 0x1

    aput-object v4, v14, v2

    const/4 v2, 0x2

    aput-object v5, v14, v2

    const/4 v2, 0x3

    aput-object v3, v14, v2

    const/4 v2, 0x4

    aput-object v1, v14, v2

    const/4 v1, 0x5

    aput-object v6, v14, v1

    sget-object v1, Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;

    const/4 v2, 0x6

    aput-object v1, v14, v2

    aput-object v8, v14, v7

    const/16 v1, 0x8

    aput-object v9, v14, v1

    aput-object v0, v14, v10

    const/16 v0, 0xa

    aput-object v11, v14, v0

    const/16 v0, 0xb

    aput-object v12, v14, v0

    const/16 v0, 0xc

    aput-object v13, v14, v0

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/EntryPointModel;
    .locals 39

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/EntryPointModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/16 v13, 0x9

    const/4 v14, 0x7

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v6, Lmd1/a;->a:Lmd1/a;

    invoke-interface {v0, v1, v15, v6, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v12, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v6, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v8, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v11, Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;

    invoke-interface {v0, v1, v7, v11, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/EntryPointModelCta;

    aget-object v11, v2, v14

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v14, v11, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/navigation/e;

    sget-object v14, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-interface {v0, v1, v10, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/TagModel;

    aget-object v2, v2, v13

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v13, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whoopaction/domain/models/Action;

    sget-object v13, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;

    const/16 v14, 0xa

    invoke-interface {v0, v1, v14, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    sget-object v14, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v5, 0x1fff

    move-object/from16 v36, v2

    move-object/from16 v37, v3

    move-object/from16 v25, v4

    move-object/from16 v28, v6

    move-object/from16 v31, v7

    move-object/from16 v30, v8

    move-object/from16 v29, v9

    move-object/from16 v33, v10

    move-object/from16 v27, v12

    move-object/from16 v35, v13

    move-object/from16 v26, v15

    move-object/from16 v34, v16

    :goto_0
    move/from16 v24, v5

    move-object/from16 v32, v11

    goto/16 :goto_8

    :cond_0
    move-object v3, v5

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v18, v12

    move/from16 v20, v13

    move/from16 v19, v14

    move/from16 v21, v15

    move v5, v4

    move-object/from16 v4, v18

    move-object v13, v4

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v21, :cond_1

    move-object/from16 v22, v2

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v23, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x1000

    :goto_2
    move-object/from16 v2, v22

    move-object/from16 v3, v23

    goto :goto_1

    :pswitch_1
    move-object/from16 v23, v3

    const/16 v3, 0xc

    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v2, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/whoop/navigation/models/GenericInteraction;

    or-int/lit16 v5, v5, 0x800

    goto :goto_2

    :pswitch_2
    move-object/from16 v23, v3

    const/16 v3, 0xb

    sget-object v2, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    or-int/lit16 v5, v5, 0x400

    goto :goto_2

    :pswitch_3
    move-object/from16 v23, v3

    const/16 v3, 0xa

    aget-object v2, v22, v20

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v3, v20

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/whoopaction/domain/models/Action;

    or-int/lit16 v5, v5, 0x200

    goto :goto_2

    :pswitch_4
    move-object/from16 v23, v3

    move/from16 v3, v20

    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v2, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/whoop/design/models/items/TagModel;

    or-int/lit16 v5, v5, 0x100

    :goto_3
    move-object/from16 v2, v22

    move-object/from16 v3, v23

    :goto_4
    const/16 v20, 0x9

    goto :goto_1

    :pswitch_5
    move-object/from16 v23, v3

    const/16 v3, 0x8

    aget-object v2, v22, v19

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v3, v19

    invoke-interface {v0, v1, v3, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/whoop/navigation/e;

    or-int/lit16 v5, v5, 0x80

    goto :goto_3

    :pswitch_6
    move-object/from16 v23, v3

    move/from16 v3, v19

    sget-object v2, Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/whoop/design/models/items/EntryPointModelCta;

    or-int/lit8 v5, v5, 0x40

    :goto_5
    move-object/from16 v2, v22

    move-object/from16 v3, v23

    :goto_6
    const/16 v19, 0x7

    goto :goto_4

    :pswitch_7
    move-object/from16 v23, v3

    const/4 v3, 0x6

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x20

    goto :goto_5

    :pswitch_8
    move-object/from16 v23, v3

    const/4 v2, 0x4

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v5, v5, 0x10

    goto :goto_5

    :pswitch_9
    move-object/from16 v23, v3

    const/4 v3, 0x5

    sget-object v2, Lmd1/a;->a:Lmd1/a;

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v5, v5, 0x8

    goto :goto_5

    :pswitch_a
    move-object/from16 v23, v3

    const/4 v3, 0x3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x4

    goto :goto_5

    :pswitch_b
    move-object/from16 v23, v3

    const/4 v3, 0x2

    sget-object v2, Lmd1/a;->a:Lmd1/a;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v5, v5, 0x2

    goto :goto_5

    :pswitch_c
    move-object/from16 v23, v3

    const/4 v3, 0x1

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v17, v4

    move-object/from16 v3, v23

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x1

    :goto_7
    move-object/from16 v4, v17

    move-object/from16 v2, v22

    goto :goto_6

    :pswitch_d
    move-object/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v21, v4

    goto :goto_7

    :cond_1
    move-object/from16 v17, v4

    move-object/from16 v25, v3

    move-object/from16 v26, v6

    move-object/from16 v34, v7

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v36, v10

    move-object/from16 v30, v12

    move-object/from16 v37, v13

    move-object/from16 v35, v14

    move-object/from16 v28, v15

    move-object/from16 v27, v17

    move-object/from16 v29, v18

    goto/16 :goto_0

    :goto_8
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v23, Lcom/whoop/design/models/items/EntryPointModel;

    const/16 v38, 0x0

    invoke-direct/range {v23 .. v38}, Lcom/whoop/design/models/items/EntryPointModel;-><init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v23

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
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

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/EntryPointModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/EntryPointModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/EntryPointModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/EntryPointModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/EntryPointModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/EntryPointModel;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-super {p0}, Lkotlinx/serialization/internal/GeneratedSerializer;->typeParametersSerializers()[Lwc3/c;

    move-result-object v0

    return-object v0
.end method
