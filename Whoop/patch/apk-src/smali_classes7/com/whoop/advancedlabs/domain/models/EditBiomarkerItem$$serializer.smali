.class public final synthetic Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/advancedlabs/domain/models/EditBiomarkerItem.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
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

.field public static final INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.advancedlabs.domain.models.EditBiomarkerItem"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "biomarkerName"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "biomarkerId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "calculatedFromBiomarkers"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "value"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "valueText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unit"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "included"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "maxValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "infoCallout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "valueLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unitLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "warning"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rightIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dependentOnBiomarkers"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dependentOnBiomarkersWarning"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "categoricalOptions"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    sget-object v4, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-static {v8}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    const/16 v12, 0xf

    aget-object v13, v0, v12

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/c;

    invoke-static {v13}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    sget-object v14, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;

    invoke-static {v14}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    const/16 v15, 0x11

    aget-object v0, v0, v15

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    move/from16 v16, v2

    const/16 v2, 0x12

    new-array v2, v2, [Lwc3/c;

    const/16 v17, 0x0

    aput-object v1, v2, v17

    const/16 v17, 0x1

    aput-object v1, v2, v17

    aput-object v3, v2, v16

    const/4 v3, 0x3

    aput-object v5, v2, v3

    const/4 v3, 0x4

    aput-object v6, v2, v3

    const/4 v3, 0x5

    aput-object v7, v2, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v5, 0x6

    aput-object v3, v2, v5

    const/4 v3, 0x7

    aput-object v4, v2, v3

    const/16 v3, 0x8

    aput-object v4, v2, v3

    const/16 v3, 0x9

    aput-object v8, v2, v3

    const/16 v3, 0xa

    aput-object v1, v2, v3

    const/16 v3, 0xb

    aput-object v1, v2, v3

    const/16 v1, 0xc

    aput-object v9, v2, v1

    const/16 v1, 0xd

    aput-object v10, v2, v1

    const/16 v1, 0xe

    aput-object v11, v2, v1

    aput-object v13, v2, v12

    const/16 v1, 0x10

    aput-object v14, v2, v1

    aput-object v0, v2, v15

    return-object v2
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;
    .locals 58

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v15, 0x8

    const/4 v14, 0x4

    const/16 v17, 0x11

    const/16 v18, 0xf

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    aget-object v6, v2, v4

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v4, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v6, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v20

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v22

    sget-object v10, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-interface {v0, v1, v9, v10, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xb

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v24, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v13, v24, v18

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v16, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v13, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    aget-object v13, v24, v17

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 p1, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v13, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const v7, 0x3ffff

    move-object/from16 v55, p1

    move-object/from16 v56, v2

    move-object/from16 v37, v3

    move-object/from16 v39, v4

    move-object/from16 v38, v5

    move-object/from16 v40, v6

    move-object/from16 v49, v8

    move-object/from16 v48, v9

    move-object/from16 v50, v10

    move/from16 v43, v11

    move-object/from16 v42, v12

    move-object/from16 v41, v14

    move-object/from16 v51, v15

    move-object/from16 v53, v16

    move-object/from16 v54, v18

    move-object/from16 v52, v19

    move-wide/from16 v44, v20

    move-wide/from16 v46, v22

    :goto_0
    move/from16 v36, v7

    goto/16 :goto_6

    :cond_0
    move-object/from16 v24, v2

    const-wide/16 v2, 0x0

    move-wide/from16 v28, v2

    move-wide/from16 v30, v28

    move/from16 v22, v4

    move/from16 v32, v5

    move/from16 v27, v6

    move-object v2, v7

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v8, v5

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v25, v15

    move-object/from16 v26, v25

    move/from16 v7, v27

    move-object/from16 v6, v26

    :goto_1
    move-object/from16 v33, v2

    if-eqz v32, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v2, 0x11

    aget-object v17, v24, v2

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v34, v3

    move-object/from16 v3, v17

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v2, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    const/high16 v3, 0x20000

    :goto_2
    or-int/2addr v7, v3

    :goto_3
    move-object/from16 v2, v33

    :goto_4
    move-object/from16 v3, v34

    goto :goto_1

    :pswitch_1
    move-object/from16 v34, v3

    const/16 v2, 0x11

    sget-object v3, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    const/high16 v3, 0x10000

    goto :goto_2

    :pswitch_2
    move-object/from16 v34, v3

    const/16 v2, 0x10

    const/16 v3, 0xf

    aget-object v18, v24, v3

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v2, v18

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v3, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    const v2, 0x8000

    or-int/2addr v7, v2

    goto :goto_3

    :pswitch_3
    move-object/from16 v34, v3

    const/16 v3, 0xf

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x4000

    goto :goto_3

    :pswitch_4
    move-object/from16 v34, v3

    const/16 v3, 0xe

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x2000

    goto :goto_3

    :pswitch_5
    move-object/from16 v34, v3

    const/16 v3, 0xd

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x1000

    goto :goto_3

    :pswitch_6
    move-object/from16 v34, v3

    const/16 v2, 0xb

    const/16 v3, 0xc

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit16 v7, v7, 0x800

    goto :goto_3

    :pswitch_7
    move-object/from16 v34, v3

    const/16 v2, 0xa

    const/16 v3, 0xc

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit16 v7, v7, 0x400

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v34, v3

    const/16 v3, 0xc

    sget-object v2, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/whoop/design/models/InfoCalloutTileModel;

    or-int/lit16 v7, v7, 0x200

    goto/16 :goto_3

    :pswitch_9
    move-object/from16 v34, v3

    const/16 v2, 0x8

    const/16 v3, 0x9

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v30

    or-int/lit16 v7, v7, 0x100

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v34, v3

    const/4 v2, 0x7

    const/16 v3, 0x9

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v28

    or-int/lit16 v7, v7, 0x80

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v34, v3

    const/4 v2, 0x6

    const/16 v3, 0x9

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v27

    or-int/lit8 v7, v7, 0x40

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v34, v3

    const/16 v3, 0x9

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    or-int/lit8 v7, v7, 0x20

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v34, v3

    const/4 v3, 0x5

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v7, v7, 0x10

    goto/16 :goto_3

    :pswitch_e
    move-object/from16 v34, v3

    const/4 v3, 0x4

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Double;

    or-int/lit8 v7, v7, 0x8

    goto/16 :goto_3

    :pswitch_f
    move-object/from16 v34, v3

    const/4 v3, 0x3

    aget-object v2, v24, v22

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v3, v22

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    or-int/lit8 v7, v7, 0x4

    goto/16 :goto_3

    :pswitch_10
    move/from16 v3, v22

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v7, v7, 0x2

    move-object/from16 v3, v21

    :goto_5
    move-object/from16 v2, v33

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v34, v3

    move/from16 v3, v22

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v7, v7, 0x1

    move-object/from16 v2, v20

    goto/16 :goto_4

    :pswitch_12
    move-object/from16 v34, v3

    const/4 v2, 0x0

    move/from16 v32, v2

    goto :goto_5

    :cond_1
    move-object/from16 v34, v3

    move-object/from16 v41, v4

    move-object/from16 v40, v5

    move-object/from16 v39, v6

    move-object/from16 v56, v8

    move-object/from16 v55, v9

    move-object/from16 v53, v10

    move-object/from16 v52, v11

    move-object/from16 v51, v12

    move-object/from16 v42, v13

    move-object/from16 v48, v14

    move-object/from16 v54, v15

    move-object/from16 v49, v25

    move-object/from16 v50, v26

    move/from16 v43, v27

    move-wide/from16 v44, v28

    move-wide/from16 v46, v30

    move-object/from16 v37, v33

    move-object/from16 v38, v34

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v35, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    const/16 v57, 0x0

    invoke-direct/range {v35 .. v57}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v35

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)V

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
