.class public final synthetic Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/educationModels/FeatureEducationScreenDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/educationModels/FeatureEducationScreenDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationScreenDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "education-models_release"
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

.field public static final INSTANCE:Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.educationModels.FeatureEducationScreenDto"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paragraphs"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sections"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "created_at"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updated_at"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "feature_id"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "background"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "image"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "video"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sort_order"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "ctabutton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigation_bar"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cta_tiles"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xe

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const/4 v4, 0x5

    aput-object v3, v1, v4

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v3, 0x7

    sget-object v4, Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/educationModels/ImageDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/ImageDto$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x8

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x9

    aput-object v3, v1, v4

    const/16 v3, 0xa

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/educationModels/NavBarDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/NavBarDto$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationScreenDto;
    .locals 45

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0xa

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x3

    const/16 v12, 0x8

    const/4 v13, 0x4

    const/4 v15, 0x2

    const/16 p1, 0xd

    const/4 v14, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    aget-object v4, v2, v14

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-interface {v0, v1, v14, v4, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    aget-object v14, v2, v15

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v15, v14, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v9

    sget-object v15, Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;

    invoke-interface {v0, v1, v8, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/educationModels/FeatureEducationBackgroundDto;

    sget-object v15, Lcom/whoop/educationModels/ImageDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/ImageDto$$serializer;

    invoke-interface {v0, v1, v12, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/educationModels/ImageDto;

    sget-object v15, Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;

    invoke-interface {v0, v1, v7, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/educationModels/FeatureEducationVideoDto;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    sget-object v15, Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/educationModels/FeatureEducationButtonDto;

    sget-object v15, Lcom/whoop/educationModels/NavBarDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/NavBarDto$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/educationModels/NavBarDto;

    aget-object v15, v18, p1

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v4

    move/from16 v4, p1

    invoke-interface {v0, v1, v4, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/16 v5, 0x3fff

    move-object/from16 v42, v2

    move-object/from16 v43, v4

    move/from16 v40, v6

    move-object/from16 v39, v7

    move-object/from16 v37, v8

    move/from16 v36, v9

    move-object/from16 v35, v10

    move-object/from16 v33, v11

    move-object/from16 v38, v12

    move-object/from16 v34, v13

    move-object/from16 v31, v16

    move-object/from16 v41, v17

    :goto_0
    move/from16 v30, v3

    move/from16 v29, v5

    move-object/from16 v32, v14

    goto/16 :goto_6

    :cond_0
    move-object/from16 v18, v2

    move v2, v4

    move/from16 v4, p1

    move v3, v2

    move/from16 v25, v3

    move/from16 v26, v25

    move-object v8, v5

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object/from16 v20, v13

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move/from16 v19, v14

    move/from16 v27, v19

    move/from16 v23, v15

    move/from16 v5, v26

    move-object/from16 v2, v22

    move-object v14, v2

    move-object v15, v14

    :goto_1
    if-eqz v27, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v12

    packed-switch v12, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v12}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v12, v18, v4

    invoke-interface {v12}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v4, v12, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    or-int/lit16 v5, v5, 0x2000

    :goto_2
    const/16 v12, 0x8

    goto :goto_1

    :pswitch_1
    sget-object v12, Lcom/whoop/educationModels/NavBarDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/NavBarDto$$serializer;

    const/16 v4, 0xc

    invoke-interface {v0, v1, v4, v12, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/educationModels/NavBarDto;

    or-int/lit16 v5, v5, 0x1000

    :goto_3
    const/16 v4, 0xd

    goto :goto_2

    :pswitch_2
    const/16 v4, 0xc

    sget-object v12, Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationButtonDto$$serializer;

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v12, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/educationModels/FeatureEducationButtonDto;

    or-int/lit16 v5, v5, 0x800

    goto :goto_3

    :pswitch_3
    const/16 v4, 0xb

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v25

    or-int/lit16 v5, v5, 0x400

    goto :goto_3

    :pswitch_4
    const/16 v4, 0xb

    sget-object v12, Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;

    invoke-interface {v0, v1, v7, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/educationModels/FeatureEducationVideoDto;

    or-int/lit16 v5, v5, 0x200

    goto :goto_3

    :pswitch_5
    const/16 v4, 0xb

    sget-object v12, Lcom/whoop/educationModels/ImageDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/ImageDto$$serializer;

    const/16 v4, 0x8

    invoke-interface {v0, v1, v4, v12, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/educationModels/ImageDto;

    or-int/lit16 v5, v5, 0x100

    move v12, v4

    const/16 v4, 0xd

    goto :goto_1

    :pswitch_6
    const/16 v4, 0x8

    sget-object v12, Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationBackgroundDto$$serializer;

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v12, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Lcom/whoop/educationModels/FeatureEducationBackgroundDto;

    or-int/lit16 v5, v5, 0x80

    goto :goto_3

    :pswitch_7
    const/4 v4, 0x7

    const/4 v12, 0x6

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v26

    or-int/lit8 v5, v5, 0x40

    goto :goto_3

    :pswitch_8
    const/4 v4, 0x5

    const/4 v12, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v5, v5, 0x20

    goto :goto_3

    :pswitch_9
    const/4 v4, 0x4

    const/4 v12, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v5, v5, 0x10

    goto :goto_3

    :pswitch_a
    const/4 v4, 0x3

    const/4 v12, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v5, v5, 0x8

    goto :goto_3

    :pswitch_b
    const/4 v4, 0x3

    const/4 v12, 0x6

    aget-object v24, v18, v23

    invoke-interface/range {v24 .. v24}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v4, v24

    check-cast v4, Lwc3/b;

    move/from16 v6, v23

    invoke-interface {v0, v1, v6, v4, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/util/List;

    or-int/lit8 v5, v5, 0x4

    const/16 v4, 0xd

    const/16 v6, 0xa

    goto/16 :goto_2

    :pswitch_c
    move/from16 v6, v23

    const/4 v12, 0x6

    aget-object v4, v18, v19

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    move/from16 v6, v19

    invoke-interface {v0, v1, v6, v4, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit8 v5, v5, 0x2

    :goto_4
    const/16 v4, 0xd

    const/16 v6, 0xa

    :goto_5
    const/16 v12, 0x8

    const/16 v23, 0x2

    goto/16 :goto_1

    :pswitch_d
    move/from16 v6, v19

    const/4 v4, 0x0

    const/4 v12, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    or-int/lit8 v5, v5, 0x1

    goto :goto_4

    :pswitch_e
    const/4 v4, 0x0

    const/4 v12, 0x6

    move/from16 v27, v4

    const/16 v4, 0xd

    goto :goto_5

    :cond_1
    move-object/from16 v31, v2

    move-object/from16 v43, v8

    move-object/from16 v42, v9

    move-object/from16 v41, v10

    move-object/from16 v38, v11

    move-object/from16 v39, v13

    move-object/from16 v37, v15

    move-object/from16 v33, v20

    move-object/from16 v34, v21

    move-object/from16 v35, v22

    move/from16 v40, v25

    move/from16 v36, v26

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v28, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    const/16 v44, 0x0

    invoke-direct/range {v28 .. v44}, Lcom/whoop/educationModels/FeatureEducationScreenDto;-><init>(IILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/FeatureEducationBackgroundDto;Lcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;ILcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/NavBarDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v28

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
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
    invoke-virtual {p0, p1}, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationScreenDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationScreenDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->write$Self$education_models_release(Lcom/whoop/educationModels/FeatureEducationScreenDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationScreenDto;)V

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
