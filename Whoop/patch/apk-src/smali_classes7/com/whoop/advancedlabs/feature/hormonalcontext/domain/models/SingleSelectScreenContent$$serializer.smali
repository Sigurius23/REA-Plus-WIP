.class public final synthetic Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "advanced-labs_release"
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

.field public static final INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.advancedlabs.feature.hormonalcontext.domain.models.SingleSelectScreenContent"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "infoCallout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bottomSheet"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "footerText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "optionsHeader"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "optionsHeaderIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "options"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectedOptionId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "nextButtonTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "saveButtonTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xc

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x2

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const/4 v3, 0x5

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v3, 0x8

    aget-object v0, v0, v3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    const/16 v0, 0x9

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v0

    const/16 v0, 0xa

    aput-object v2, v1, v0

    const/16 v0, 0xb

    aput-object v2, v1, v0

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;
    .locals 36

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/16 v13, 0x8

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v5, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-interface {v0, v1, v10, v5, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/InfoCalloutTileModel;

    sget-object v10, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;

    invoke-interface {v0, v1, v11, v10, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;

    invoke-interface {v0, v1, v9, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    aget-object v2, v2, v13

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v13, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v1, v6, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/16 v6, 0xa

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    const/16 v11, 0xb

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    const/16 v13, 0xfff

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v32, v4

    move-object/from16 v26, v5

    move-object/from16 v33, v6

    move-object/from16 v30, v7

    move-object/from16 v29, v8

    move-object/from16 v28, v9

    move-object/from16 v27, v10

    move-object/from16 v34, v11

    move-object/from16 v25, v12

    move/from16 v22, v13

    move-object/from16 v24, v14

    goto/16 :goto_4

    :cond_0
    const/16 v3, 0xb

    move-object v5, v4

    move-object v9, v5

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v16, v12

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move/from16 v20, v14

    move v8, v15

    move-object/from16 v14, v19

    move-object v15, v14

    :goto_0
    if-eqz v20, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit16 v8, v8, 0x800

    :goto_1
    const/4 v7, 0x7

    goto :goto_0

    :pswitch_1
    const/16 v7, 0xa

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit16 v8, v8, 0x400

    goto :goto_1

    :pswitch_2
    const/16 v7, 0xa

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v6, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x200

    :goto_2
    const/16 v3, 0xb

    goto :goto_1

    :pswitch_3
    const/16 v7, 0xa

    aget-object v3, v2, v13

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v13, v3, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/util/List;

    or-int/lit16 v8, v8, 0x100

    goto :goto_2

    :pswitch_4
    const/4 v3, 0x7

    const/16 v7, 0xa

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit16 v8, v8, 0x80

    move v7, v3

    const/16 v3, 0xb

    goto :goto_0

    :pswitch_5
    const/4 v3, 0x6

    const/16 v7, 0xa

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v8, v8, 0x40

    goto :goto_2

    :pswitch_6
    const/16 v7, 0xa

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x5

    invoke-interface {v0, v1, v6, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x20

    :goto_3
    const/16 v3, 0xb

    const/16 v6, 0x9

    goto :goto_1

    :pswitch_7
    const/4 v6, 0x5

    const/16 v7, 0xa

    sget-object v3, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$$serializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;

    or-int/lit8 v8, v8, 0x10

    goto :goto_3

    :pswitch_8
    const/4 v6, 0x4

    const/16 v7, 0xa

    sget-object v3, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/whoop/design/models/InfoCalloutTileModel;

    or-int/lit8 v8, v8, 0x8

    goto :goto_3

    :pswitch_9
    const/4 v6, 0x3

    const/16 v7, 0xa

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x2

    invoke-interface {v0, v1, v6, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x4

    goto :goto_3

    :pswitch_a
    const/4 v6, 0x2

    const/16 v7, 0xa

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x1

    invoke-interface {v0, v1, v6, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x2

    goto :goto_3

    :pswitch_b
    const/4 v3, 0x0

    const/4 v6, 0x1

    const/16 v7, 0xa

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    or-int/lit8 v8, v8, 0x1

    goto :goto_3

    :pswitch_c
    const/4 v3, 0x0

    const/16 v7, 0xa

    move/from16 v20, v3

    goto/16 :goto_2

    :cond_1
    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move/from16 v22, v8

    move-object/from16 v32, v9

    move-object/from16 v28, v10

    move-object/from16 v31, v11

    move-object/from16 v27, v12

    move-object/from16 v26, v14

    move-object/from16 v25, v15

    move-object/from16 v29, v16

    move-object/from16 v30, v17

    move-object/from16 v33, v18

    move-object/from16 v34, v19

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v21, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;

    const/16 v35, 0x0

    invoke-direct/range {v21 .. v35}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v21

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$$serializer;->serialize(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;)V

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
