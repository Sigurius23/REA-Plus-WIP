.class public final synthetic Lcom/whoop/design/models/items/TagModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/TagModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/TagModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/TagModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/TagModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/TagModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/TagModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/TagModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/TagModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.TagModel"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "leftIcon"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rightIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tagStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "textColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "destination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "action"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "value"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatars"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iconSize"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "interaction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/TagModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x3

    aget-object v5, v0, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/c;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    const/4 v8, 0x6

    aget-object v9, v0, v8

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/c;

    invoke-static {v9}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    const/4 v10, 0x7

    aget-object v11, v0, v10

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/c;

    invoke-static {v11}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    const/16 v14, 0xa

    aget-object v15, v0, v14

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/c;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    const/16 v16, 0xb

    aget-object v0, v0, v16

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v17, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-static/range {v17 .. v17}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    move/from16 v18, v4

    const/16 v4, 0xd

    new-array v4, v4, [Lwc3/c;

    const/16 v19, 0x0

    aput-object v2, v4, v19

    const/4 v2, 0x1

    aput-object v1, v4, v2

    const/4 v1, 0x2

    aput-object v3, v4, v1

    aput-object v5, v4, v18

    const/4 v1, 0x4

    aput-object v6, v4, v1

    const/4 v1, 0x5

    aput-object v7, v4, v1

    aput-object v9, v4, v8

    aput-object v11, v4, v10

    const/16 v1, 0x8

    aput-object v12, v4, v1

    const/16 v1, 0x9

    aput-object v13, v4, v1

    aput-object v15, v4, v14

    aput-object v0, v4, v16

    const/16 v0, 0xc

    aput-object v17, v4, v0

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/TagModel;
    .locals 42

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/TagModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v5, 0x9

    const/4 v6, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x3

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/16 v16, 0xb

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v1, v9, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    aget-object v17, v2, v14

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    const/16 v18, 0xa

    move-object/from16 v11, v17

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v14, v11, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/TagBackgroundStyle;

    invoke-interface {v0, v1, v8, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v6, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aget-object v14, v2, v13

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v13, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/navigation/e;

    aget-object v14, v2, v12

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v12, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {v0, v1, v7, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v5, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aget-object v5, v2, v18

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/b;

    move/from16 v14, v18

    invoke-interface {v0, v1, v14, v5, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    aget-object v2, v2, v16

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v14, v16

    invoke-interface {v0, v1, v14, v2, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/IconSize;

    sget-object v14, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    const/16 v10, 0x1fff

    move-object/from16 v40, v2

    move-object/from16 v37, v3

    move-object/from16 v28, v4

    move-object/from16 v38, v5

    move-object/from16 v33, v6

    move-object/from16 v36, v7

    move-object/from16 v32, v8

    move-object/from16 v30, v9

    move-object/from16 v31, v11

    move-object/from16 v35, v12

    move-object/from16 v34, v13

    move-object/from16 v29, v15

    move-object/from16 v39, v16

    :goto_0
    move/from16 v27, v10

    goto/16 :goto_9

    :cond_0
    move-object/from16 v23, v2

    move-object v2, v10

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move/from16 v22, v12

    move/from16 v21, v13

    move/from16 v20, v14

    move/from16 v24, v15

    move v10, v4

    move-object v4, v11

    move-object v12, v4

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v24, :cond_1

    move-object/from16 v25, v11

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v11

    packed-switch v11, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v11, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    move-object/from16 v26, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v11, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    or-int/lit16 v10, v10, 0x1000

    :goto_2
    move-object/from16 v11, v25

    move-object/from16 v3, v26

    goto :goto_1

    :pswitch_1
    move-object/from16 v26, v3

    const/16 v3, 0xc

    const/16 v11, 0xb

    aget-object v16, v23, v11

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v11, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/whoop/design/models/items/IconSize;

    or-int/lit16 v10, v10, 0x800

    goto :goto_2

    :pswitch_2
    move-object/from16 v26, v3

    const/16 v3, 0xa

    const/16 v11, 0xb

    aget-object v16, v23, v3

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v3, v11, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit16 v10, v10, 0x400

    goto :goto_2

    :pswitch_3
    move-object/from16 v26, v3

    const/16 v3, 0xa

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v10, v10, 0x200

    goto :goto_2

    :pswitch_4
    move-object/from16 v26, v3

    const/16 v3, 0x9

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v11, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v10, v10, 0x100

    goto :goto_2

    :pswitch_5
    move-object/from16 v26, v3

    const/16 v3, 0x8

    aget-object v11, v23, v22

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v3, v22

    invoke-interface {v0, v1, v3, v11, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/whoopaction/domain/models/Action;

    or-int/lit16 v10, v10, 0x80

    goto :goto_2

    :pswitch_6
    move-object/from16 v26, v3

    move/from16 v3, v22

    aget-object v11, v23, v21

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v3, v21

    invoke-interface {v0, v1, v3, v11, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/navigation/e;

    or-int/lit8 v10, v10, 0x40

    move-object/from16 v11, v25

    move-object/from16 v3, v26

    :goto_3
    const/16 v22, 0x7

    goto/16 :goto_1

    :pswitch_7
    move-object/from16 v26, v3

    move/from16 v3, v21

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v11, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v10, v10, 0x20

    :goto_4
    move-object/from16 v11, v25

    move-object/from16 v3, v26

    :goto_5
    const/16 v21, 0x6

    goto :goto_3

    :pswitch_8
    move-object/from16 v26, v3

    const/4 v3, 0x5

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    or-int/lit8 v10, v10, 0x10

    goto :goto_4

    :pswitch_9
    move-object/from16 v26, v3

    const/4 v3, 0x4

    aget-object v11, v23, v20

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v3, v20

    invoke-interface {v0, v1, v3, v11, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, Lcom/whoop/design/models/items/TagBackgroundStyle;

    or-int/lit8 v10, v10, 0x8

    goto :goto_4

    :pswitch_a
    move-object/from16 v26, v3

    move/from16 v3, v20

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v11, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v10, v10, 0x4

    move-object/from16 v11, v25

    :goto_6
    move-object/from16 v3, v26

    :goto_7
    const/16 v20, 0x3

    goto :goto_5

    :pswitch_b
    move-object/from16 v26, v3

    const/4 v3, 0x2

    const/4 v11, 0x1

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v10, v10, 0x2

    move-object/from16 v11, v19

    goto :goto_6

    :pswitch_c
    move-object/from16 v26, v3

    const/4 v11, 0x1

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v17, v2

    move-object/from16 v11, v26

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v10, v10, 0x1

    :goto_8
    move-object/from16 v2, v17

    move-object/from16 v11, v25

    goto :goto_7

    :pswitch_d
    move-object/from16 v17, v2

    move-object v11, v3

    const/4 v2, 0x0

    move/from16 v24, v2

    goto :goto_8

    :cond_1
    move-object/from16 v17, v2

    move-object/from16 v25, v11

    move-object v11, v3

    move-object/from16 v30, v4

    move-object/from16 v39, v5

    move-object/from16 v35, v6

    move-object/from16 v38, v7

    move-object/from16 v34, v8

    move-object/from16 v32, v9

    move-object/from16 v28, v11

    move-object/from16 v37, v12

    move-object/from16 v36, v13

    move-object/from16 v33, v14

    move-object/from16 v31, v15

    move-object/from16 v40, v17

    move-object/from16 v29, v25

    goto/16 :goto_0

    :goto_9
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v26, Lcom/whoop/design/models/items/TagModel;

    const/16 v41, 0x0

    invoke-direct/range {v26 .. v41}, Lcom/whoop/design/models/items/TagModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v26

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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/TagModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/TagModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/TagModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/TagModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/TagModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/TagModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/TagModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/TagModel;)V

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
