.class public final synthetic Lcom/whoop/design/models/items/ButtonCellModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/ButtonCellModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/ButtonCellModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/ButtonCellModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/ButtonCellModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/ButtonCellModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/ButtonCellModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/ButtonCellModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ButtonCellModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.ButtonCellModel"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "leadingIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "leadingImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trailingIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "message"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "style"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatars"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tintColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "enabled"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "destination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "modal"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    const/16 v9, 0x8

    aget-object v10, v0, v9

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/c;

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    const/16 v11, 0x9

    aget-object v12, v0, v11

    invoke-interface {v12}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lwc3/c;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    const/16 v13, 0xb

    aget-object v14, v0, v13

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/c;

    invoke-static {v14}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    const/16 v15, 0xc

    aget-object v0, v0, v15

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    move/from16 v16, v9

    const/16 v9, 0xd

    new-array v9, v9, [Lwc3/c;

    const/16 v17, 0x0

    aput-object v1, v9, v17

    const/4 v1, 0x1

    aput-object v2, v9, v1

    const/4 v1, 0x2

    aput-object v3, v9, v1

    const/4 v1, 0x3

    aput-object v4, v9, v1

    const/4 v1, 0x4

    aput-object v5, v9, v1

    const/4 v1, 0x5

    aput-object v6, v9, v1

    const/4 v1, 0x6

    aput-object v7, v9, v1

    const/4 v1, 0x7

    aput-object v8, v9, v1

    aput-object v10, v9, v16

    aput-object v12, v9, v11

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v2, 0xa

    aput-object v1, v9, v2

    aput-object v14, v9, v13

    aput-object v0, v9, v15

    return-object v9
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/ButtonCellModel;
    .locals 40

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0xa

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/16 v13, 0x9

    const/16 v14, 0x8

    const/4 v15, 0x1

    const/16 p1, 0xc

    const/4 v11, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v15, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v6, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v5, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    aget-object v11, v2, v14

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v14, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    aget-object v14, v2, v13

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v13, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly81/f;

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v4

    aget-object v14, v2, v16

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/e;

    aget-object v14, v17, p1

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move-object/from16 v16, v11

    move/from16 v11, p1

    invoke-interface {v0, v1, v11, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/modal/AnyModal;

    const/16 v12, 0x1fff

    move-object/from16 v37, v2

    move-object/from16 v26, v3

    move/from16 v36, v4

    move-object/from16 v33, v5

    move-object/from16 v32, v6

    move-object/from16 v31, v7

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v28, v10

    move-object/from16 v38, v11

    move-object/from16 v35, v13

    move-object/from16 v27, v15

    move-object/from16 v34, v16

    :goto_0
    move/from16 v25, v12

    goto/16 :goto_6

    :cond_0
    move-object/from16 v17, v2

    move v2, v11

    move/from16 v11, p1

    move v3, v2

    move-object v4, v12

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object/from16 v18, v10

    move/from16 v20, v13

    move/from16 v19, v14

    move/from16 v21, v15

    move v12, v3

    move-object/from16 v2, v18

    move-object v13, v2

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v21, :cond_1

    move/from16 v22, v11

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v11

    packed-switch v11, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v11, v17, v22

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v23, v3

    move/from16 v3, v22

    invoke-interface {v0, v1, v3, v11, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/modal/AnyModal;

    or-int/lit16 v12, v12, 0x1000

    move v11, v3

    move/from16 v3, v23

    goto :goto_1

    :pswitch_1
    move/from16 v23, v3

    move/from16 v3, v22

    const/16 v11, 0xb

    aget-object v16, v17, v11

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v11, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/whoop/navigation/e;

    or-int/lit16 v12, v12, 0x800

    :goto_2
    move/from16 v3, v23

    :goto_3
    const/16 v11, 0xc

    goto :goto_1

    :pswitch_2
    const/16 v3, 0xa

    const/16 v11, 0xb

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v16

    or-int/lit16 v12, v12, 0x400

    move/from16 v3, v16

    goto :goto_3

    :pswitch_3
    move/from16 v23, v3

    const/16 v3, 0xa

    const/16 v11, 0xb

    aget-object v16, v17, v20

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    move/from16 v11, v20

    invoke-interface {v0, v1, v11, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ly81/f;

    or-int/lit16 v12, v12, 0x200

    goto :goto_2

    :pswitch_4
    move/from16 v23, v3

    move/from16 v11, v20

    aget-object v3, v17, v19

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move/from16 v11, v19

    invoke-interface {v0, v1, v11, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    or-int/lit16 v12, v12, 0x100

    move/from16 v3, v23

    const/16 v11, 0xc

    :goto_4
    const/16 v20, 0x9

    goto/16 :goto_1

    :pswitch_5
    move/from16 v23, v3

    move/from16 v11, v19

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x7

    invoke-interface {v0, v1, v11, v3, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x80

    :goto_5
    move/from16 v3, v23

    const/16 v11, 0xc

    const/16 v19, 0x8

    goto :goto_4

    :pswitch_6
    move/from16 v23, v3

    const/4 v11, 0x7

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x6

    invoke-interface {v0, v1, v11, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x40

    goto :goto_5

    :pswitch_7
    move/from16 v23, v3

    const/4 v11, 0x6

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x5

    invoke-interface {v0, v1, v11, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x20

    goto :goto_5

    :pswitch_8
    move/from16 v23, v3

    const/4 v11, 0x5

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x4

    invoke-interface {v0, v1, v11, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x10

    goto :goto_5

    :pswitch_9
    move/from16 v23, v3

    const/4 v11, 0x4

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x3

    invoke-interface {v0, v1, v11, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x8

    goto :goto_5

    :pswitch_a
    move/from16 v23, v3

    const/4 v11, 0x3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x2

    invoke-interface {v0, v1, v11, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x4

    goto :goto_5

    :pswitch_b
    move/from16 v23, v3

    const/4 v11, 0x2

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v11, 0x1

    invoke-interface {v0, v1, v11, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x2

    goto :goto_5

    :pswitch_c
    move/from16 v23, v3

    const/4 v3, 0x0

    const/4 v11, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v12, v12, 0x1

    goto :goto_5

    :pswitch_d
    move/from16 v23, v3

    const/4 v3, 0x0

    move/from16 v21, v3

    goto :goto_5

    :cond_1
    move/from16 v23, v3

    move-object/from16 v27, v2

    move-object/from16 v38, v4

    move-object/from16 v34, v5

    move-object/from16 v33, v6

    move-object/from16 v32, v7

    move-object/from16 v30, v8

    move-object/from16 v31, v9

    move-object/from16 v29, v10

    move-object/from16 v37, v13

    move-object/from16 v35, v14

    move-object/from16 v28, v15

    move-object/from16 v26, v18

    move/from16 v36, v23

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v24, Lcom/whoop/design/models/items/ButtonCellModel;

    const/16 v39, 0x0

    invoke-direct/range {v24 .. v39}, Lcom/whoop/design/models/items/ButtonCellModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v24

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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/ButtonCellModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/ButtonCellModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/ButtonCellModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/ButtonCellModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/ButtonCellModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/ButtonCellModel;)V

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
