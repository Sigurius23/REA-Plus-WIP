.class public final synthetic Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/activation/domain/models/steps/HeightAndWeightStepModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "activation_release"
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

.field public static final INSTANCE:Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.activation.domain.models.steps.HeightAndWeightStepModel"

    const/16 v3, 0x1d

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "imperialTitle"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metricTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "feetText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "inchesText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "poundsText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "centimetersText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "kilogramsText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightFeetMinValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightFeetMaxValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightPoundsMinValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightPoundsMaxValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightCentimetersMinValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightCentimetersMaxValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightCentimetersPreselectedValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightKilogramsMinValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightKilogramsMaxValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightKilogramsPreselectedValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightFeetPreselectedValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightPoundsPreselectedValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigationBarText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mobileScreenName"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "analyticsName"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "progressCircle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "footerButtons"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x1c

    aget-object v0, v0, v4

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v5, 0x1d

    new-array v5, v5, [Lwc3/c;

    sget-object v6, Lmd1/a;->a:Lmd1/a;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const/4 v7, 0x2

    aput-object v6, v5, v7

    const/4 v7, 0x3

    aput-object v6, v5, v7

    const/4 v7, 0x4

    aput-object v1, v5, v7

    const/4 v7, 0x5

    aput-object v1, v5, v7

    const/4 v7, 0x6

    aput-object v1, v5, v7

    const/4 v7, 0x7

    aput-object v1, v5, v7

    const/16 v7, 0x8

    aput-object v1, v5, v7

    sget-object v7, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v8, 0x9

    aput-object v7, v5, v8

    const/16 v8, 0xa

    aput-object v7, v5, v8

    const/16 v8, 0xb

    aput-object v7, v5, v8

    const/16 v8, 0xc

    aput-object v7, v5, v8

    const/16 v8, 0xd

    aput-object v7, v5, v8

    const/16 v8, 0xe

    aput-object v7, v5, v8

    const/16 v8, 0xf

    aput-object v7, v5, v8

    const/16 v8, 0x10

    aput-object v7, v5, v8

    const/16 v8, 0x11

    aput-object v7, v5, v8

    const/16 v8, 0x12

    aput-object v7, v5, v8

    const/16 v8, 0x13

    aput-object v6, v5, v8

    const/16 v6, 0x14

    aput-object v1, v5, v6

    const/16 v6, 0x15

    aput-object v1, v5, v6

    const/16 v6, 0x16

    aput-object v7, v5, v6

    const/16 v6, 0x17

    aput-object v7, v5, v6

    const/16 v6, 0x18

    aput-object v2, v5, v6

    const/16 v2, 0x19

    aput-object v1, v5, v2

    const/16 v2, 0x1a

    aput-object v1, v5, v2

    const/16 v1, 0x1b

    aput-object v3, v5, v1

    aput-object v0, v5, v4

    return-object v5
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;
    .locals 87

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/16 v30, 0x1c

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lmd1/a;->a:Lmd1/a;

    invoke-interface {v0, v1, v6, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v5, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v4, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v13, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v8

    const/16 v7, 0xb

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    move-object/from16 v34, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v31, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v29, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v28, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v27, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v26, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v25, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v24, v2

    move-object/from16 v23, v6

    const/16 v2, 0x13

    const/4 v6, 0x0

    invoke-interface {v0, v1, v2, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/util/TextResource;

    const/16 v3, 0x14

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x15

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v20, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v19, v2

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v22, v3

    move-object/from16 v18, v5

    const/16 v3, 0x18

    const/4 v5, 0x0

    invoke-interface {v0, v1, v3, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v3, 0x19

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x1a

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v16, v2

    sget-object v2, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    move-object/from16 v17, v3

    move-object/from16 p1, v4

    const/16 v3, 0x1b

    const/4 v4, 0x0

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/ProgressButtonModel;

    aget-object v3, v34, v30

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v32, v13

    move/from16 v13, v30

    invoke-interface {v0, v1, v13, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const v4, 0x1fffffff

    move-object/from16 v59, p1

    move-object/from16 v84, v2

    move-object/from16 v85, v3

    move/from16 v56, v4

    move-object/from16 v83, v5

    move-object/from16 v78, v6

    move/from16 v68, v7

    move/from16 v67, v8

    move/from16 v66, v9

    move-object/from16 v64, v10

    move-object/from16 v63, v11

    move-object/from16 v62, v12

    move-object/from16 v65, v14

    move-object/from16 v61, v15

    move-object/from16 v81, v16

    move-object/from16 v82, v17

    move-object/from16 v58, v18

    move/from16 v80, v19

    move/from16 v79, v20

    move-object/from16 v76, v21

    move-object/from16 v77, v22

    move-object/from16 v57, v23

    move/from16 v75, v24

    move/from16 v74, v25

    move/from16 v73, v26

    move/from16 v72, v27

    move/from16 v71, v28

    move/from16 v70, v29

    move/from16 v69, v31

    move-object/from16 v60, v32

    goto/16 :goto_9

    :cond_0
    move-object/from16 v34, v2

    move v3, v4

    move-object v4, v7

    move v2, v13

    move/from16 v13, v30

    move-object v2, v4

    move-object v3, v2

    move-object v11, v3

    move-object v12, v11

    move-object v15, v12

    move-object/from16 v40, v15

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v48, v46

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move/from16 v54, v5

    move v7, v6

    move/from16 v30, v7

    move/from16 v33, v30

    move/from16 v35, v33

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v47, v39

    move/from16 v52, v47

    move/from16 v53, v52

    move-object/from16 v5, v51

    move/from16 v4, v53

    :goto_0
    if-eqz v54, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v10, v34, v13

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v13, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/util/List;

    const/high16 v10, 0x10000000

    or-int/2addr v6, v10

    const/4 v10, 0x7

    goto :goto_0

    :pswitch_1
    sget-object v10, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    const/16 v13, 0x1b

    invoke-interface {v0, v1, v13, v10, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/design/models/ProgressButtonModel;

    const/high16 v10, 0x8000000

    :goto_1
    or-int/2addr v6, v10

    :goto_2
    const/4 v10, 0x7

    :goto_3
    const/16 v13, 0x1c

    goto :goto_0

    :pswitch_2
    const/16 v10, 0x1a

    const/16 v13, 0x1b

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v51

    const/high16 v16, 0x4000000

    or-int v6, v6, v16

    goto :goto_2

    :pswitch_3
    const/16 v10, 0x19

    const/16 v13, 0x1b

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v50

    const/high16 v17, 0x2000000

    or-int v6, v6, v17

    goto :goto_2

    :pswitch_4
    const/16 v13, 0x1b

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0x18

    invoke-interface {v0, v1, v13, v10, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, Ljava/lang/String;

    const/high16 v10, 0x1000000

    goto :goto_1

    :pswitch_5
    const/16 v10, 0x17

    const/16 v13, 0x18

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v39

    const/high16 v18, 0x800000

    :goto_4
    or-int v6, v6, v18

    goto :goto_2

    :pswitch_6
    const/16 v10, 0x16

    const/16 v13, 0x18

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v38

    const/high16 v18, 0x400000

    goto :goto_4

    :pswitch_7
    const/16 v10, 0x15

    const/16 v13, 0x18

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v49

    const/high16 v18, 0x200000

    goto :goto_4

    :pswitch_8
    const/16 v10, 0x14

    const/16 v13, 0x18

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v48

    const/high16 v18, 0x100000

    goto :goto_4

    :pswitch_9
    const/16 v13, 0x18

    sget-object v10, Lmd1/a;->a:Lmd1/a;

    const/16 v13, 0x13

    invoke-interface {v0, v1, v13, v10, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/util/TextResource;

    const/high16 v10, 0x80000

    goto :goto_1

    :pswitch_a
    const/16 v10, 0x12

    const/16 v13, 0x13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v37

    const/high16 v23, 0x40000

    :goto_5
    or-int v6, v6, v23

    goto :goto_2

    :pswitch_b
    const/16 v10, 0x11

    const/16 v13, 0x13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v36

    const/high16 v23, 0x20000

    goto :goto_5

    :pswitch_c
    const/16 v10, 0x10

    const/16 v13, 0x13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v35

    const/high16 v23, 0x10000

    goto :goto_5

    :pswitch_d
    const/16 v10, 0xf

    const/16 v13, 0x13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v33

    const v23, 0x8000

    goto :goto_5

    :pswitch_e
    const/16 v10, 0xe

    const/16 v13, 0x13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v30

    or-int/lit16 v6, v6, 0x4000

    goto/16 :goto_2

    :pswitch_f
    const/16 v7, 0xd

    const/16 v10, 0xe

    const/16 v13, 0x13

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit16 v6, v6, 0x2000

    move/from16 v7, v23

    goto/16 :goto_2

    :pswitch_10
    const/16 v4, 0xc

    const/16 v10, 0xe

    const/16 v13, 0x13

    const/16 v29, 0xd

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit16 v6, v6, 0x1000

    move/from16 v4, v23

    goto/16 :goto_2

    :pswitch_11
    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v47

    or-int/lit16 v6, v6, 0x800

    goto/16 :goto_2

    :pswitch_12
    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v52

    or-int/lit16 v6, v6, 0x400

    goto/16 :goto_2

    :pswitch_13
    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v53

    or-int/lit16 v6, v6, 0x200

    goto/16 :goto_2

    :pswitch_14
    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v46

    or-int/lit16 v6, v6, 0x100

    goto/16 :goto_2

    :pswitch_15
    const/4 v8, 0x7

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v45

    or-int/lit16 v6, v6, 0x80

    move v10, v8

    const/16 v8, 0xa

    goto/16 :goto_3

    :pswitch_16
    const/4 v8, 0x6

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v44

    or-int/lit8 v6, v6, 0x40

    :goto_6
    const/16 v8, 0xa

    goto/16 :goto_2

    :pswitch_17
    const/4 v8, 0x5

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v43

    or-int/lit8 v6, v6, 0x20

    goto :goto_6

    :pswitch_18
    const/4 v8, 0x4

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v42

    or-int/lit8 v6, v6, 0x10

    goto :goto_6

    :pswitch_19
    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    sget-object v8, Lmd1/a;->a:Lmd1/a;

    const/4 v9, 0x3

    invoke-interface {v0, v1, v9, v8, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v6, v6, 0x8

    :goto_7
    const/16 v8, 0xa

    :goto_8
    const/16 v9, 0x9

    goto/16 :goto_2

    :pswitch_1a
    const/4 v9, 0x3

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    sget-object v8, Lmd1/a;->a:Lmd1/a;

    const/4 v9, 0x2

    invoke-interface {v0, v1, v9, v8, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v6, v6, 0x4

    goto :goto_7

    :pswitch_1b
    const/4 v9, 0x2

    const/16 v10, 0xb

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    sget-object v8, Lmd1/a;->a:Lmd1/a;

    move-object/from16 v9, v41

    const/4 v10, 0x1

    invoke-interface {v0, v1, v10, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v6, v6, 0x2

    move-object/from16 v41, v8

    goto :goto_7

    :pswitch_1c
    move-object/from16 v9, v41

    const/4 v10, 0x1

    const/16 v13, 0x13

    const/16 v29, 0xd

    const/16 v31, 0xc

    sget-object v8, Lmd1/a;->a:Lmd1/a;

    move-object/from16 v10, v40

    const/4 v13, 0x0

    invoke-interface {v0, v1, v13, v8, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v40, v8

    check-cast v40, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v6, v6, 0x1

    goto :goto_7

    :pswitch_1d
    move-object/from16 v10, v40

    move-object/from16 v9, v41

    const/4 v13, 0x0

    const/16 v29, 0xd

    const/16 v31, 0xc

    move/from16 v54, v13

    goto :goto_8

    :cond_1
    move-object/from16 v10, v40

    move-object/from16 v9, v41

    move-object/from16 v76, v2

    move-object/from16 v60, v3

    move/from16 v69, v4

    move-object/from16 v59, v5

    move/from16 v56, v6

    move/from16 v70, v7

    move-object/from16 v58, v9

    move-object/from16 v57, v10

    move-object/from16 v85, v11

    move-object/from16 v84, v12

    move-object/from16 v81, v15

    move/from16 v71, v30

    move/from16 v72, v33

    move/from16 v73, v35

    move/from16 v74, v36

    move/from16 v75, v37

    move/from16 v79, v38

    move/from16 v80, v39

    move-object/from16 v61, v42

    move-object/from16 v62, v43

    move-object/from16 v63, v44

    move-object/from16 v64, v45

    move-object/from16 v65, v46

    move/from16 v68, v47

    move-object/from16 v77, v48

    move-object/from16 v78, v49

    move-object/from16 v82, v50

    move-object/from16 v83, v51

    move/from16 v67, v52

    move/from16 v66, v53

    :goto_9
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v55, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    const/16 v86, 0x0

    invoke-direct/range {v55 .. v86}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v55

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
    invoke-virtual {p0, p1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)V

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
