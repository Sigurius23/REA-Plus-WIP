.class public final synthetic Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/activation/domain/models/steps/TrialPlanOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/activation/domain/models/steps/TrialPlanOption;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/activation/domain/models/steps/TrialPlanOption.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/activation/domain/models/steps/TrialPlanOption;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialPlanOption;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;",
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

.field public static final INSTANCE:Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;

    invoke-direct {v0}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.activation.domain.models.steps.TrialPlanOption"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "shouldSkipNextScreen"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "price"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "priceSubtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disclaimer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selected"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "membershipTier"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trackingLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tag"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strikethroughPrice"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "commitmentType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "destination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xd

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v3, Lmd1/a;->a:Lmd1/a;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v4, 0x4

    aput-object v3, v1, v4

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v4, 0x5

    aput-object v3, v1, v4

    const/4 v4, 0x6

    aput-object v2, v1, v4

    const/4 v2, 0x7

    aput-object v3, v1, v2

    const/16 v2, 0x8

    aput-object v3, v1, v2

    const/16 v2, 0x9

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v2

    const/16 v2, 0xa

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xb

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xc

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;
    .locals 40

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v15, 0x1

    const/16 p1, 0xc

    const/4 v13, 0x0

    const/16 v16, 0xb

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    sget-object v13, Lmd1/a;->a:Lmd1/a;

    invoke-interface {v0, v1, v15, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v12, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v9, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v11, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v7

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aget-object v13, v2, v16

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/steps/CommitmentType;

    aget-object v13, v17, p1

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v16, v15

    move/from16 v15, p1

    invoke-interface {v0, v1, v15, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/navigation/e;

    const/16 v14, 0x1fff

    move-object/from16 v37, v2

    move-object/from16 v36, v4

    move-object/from16 v35, v5

    move-object/from16 v33, v6

    move/from16 v32, v7

    move-object/from16 v31, v8

    move-object/from16 v29, v9

    move-object/from16 v34, v10

    move-object/from16 v30, v11

    move-object/from16 v28, v12

    move-object/from16 v38, v13

    move/from16 v25, v14

    move-object/from16 v27, v16

    :goto_0
    move/from16 v26, v3

    goto/16 :goto_7

    :cond_0
    move-object/from16 v17, v2

    move v2, v15

    move/from16 v15, p1

    move/from16 v23, v2

    move v3, v13

    move-object v2, v14

    move-object v6, v2

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move v14, v3

    :goto_1
    if-eqz v23, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v10, v17, v15

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v15, v10, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/navigation/e;

    or-int/lit16 v13, v13, 0x1000

    const/16 v10, 0x8

    goto :goto_1

    :pswitch_1
    const/16 v10, 0xb

    aget-object v16, v17, v10

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v15, v16

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v10, v15, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/CommitmentType;

    or-int/lit16 v13, v13, 0x800

    :goto_2
    const/16 v10, 0x8

    :goto_3
    const/16 v15, 0xc

    goto :goto_1

    :pswitch_2
    const/16 v10, 0xb

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x400

    goto :goto_2

    :pswitch_3
    const/16 v10, 0xb

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v15, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x200

    goto :goto_2

    :pswitch_4
    const/16 v10, 0xb

    const/16 v15, 0x8

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v13, v13, 0x100

    move v10, v15

    goto :goto_3

    :pswitch_5
    const/4 v4, 0x7

    const/16 v10, 0xb

    const/16 v15, 0x8

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit16 v13, v13, 0x80

    :goto_4
    move v10, v15

    :goto_5
    const/16 v4, 0xa

    goto :goto_3

    :pswitch_6
    const/4 v4, 0x7

    const/16 v10, 0xb

    const/4 v14, 0x6

    const/16 v15, 0x8

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v22

    or-int/lit8 v13, v13, 0x40

    move v10, v15

    move/from16 v14, v22

    goto :goto_5

    :pswitch_7
    const/4 v4, 0x5

    const/16 v10, 0xb

    const/16 v15, 0x8

    const/16 v22, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v13, v13, 0x20

    goto :goto_4

    :pswitch_8
    const/16 v10, 0xb

    const/16 v15, 0x8

    const/16 v22, 0x6

    sget-object v4, Lmd1/a;->a:Lmd1/a;

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v4, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v13, v13, 0x10

    :goto_6
    move v10, v15

    const/16 v4, 0xa

    const/16 v5, 0x9

    goto :goto_3

    :pswitch_9
    const/4 v5, 0x4

    const/16 v10, 0xb

    const/16 v15, 0x8

    const/16 v22, 0x6

    sget-object v4, Lmd1/a;->a:Lmd1/a;

    const/4 v5, 0x3

    invoke-interface {v0, v1, v5, v4, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v13, v13, 0x8

    goto :goto_6

    :pswitch_a
    const/4 v5, 0x3

    const/16 v10, 0xb

    const/16 v15, 0x8

    const/16 v22, 0x6

    sget-object v4, Lmd1/a;->a:Lmd1/a;

    const/4 v5, 0x2

    invoke-interface {v0, v1, v5, v4, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v13, v13, 0x4

    goto :goto_6

    :pswitch_b
    const/4 v5, 0x2

    const/16 v10, 0xb

    const/16 v15, 0x8

    const/16 v22, 0x6

    sget-object v4, Lmd1/a;->a:Lmd1/a;

    move-object/from16 v5, v18

    const/4 v10, 0x1

    invoke-interface {v0, v1, v10, v4, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v13, v13, 0x2

    move-object/from16 v18, v4

    goto :goto_6

    :pswitch_c
    move-object/from16 v5, v18

    const/4 v4, 0x0

    const/4 v10, 0x1

    const/16 v15, 0x8

    const/16 v22, 0x6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    or-int/lit8 v13, v13, 0x1

    goto :goto_6

    :pswitch_d
    move-object/from16 v5, v18

    const/4 v4, 0x0

    const/16 v15, 0x8

    const/16 v22, 0x6

    move/from16 v23, v4

    goto :goto_6

    :cond_1
    move-object/from16 v5, v18

    move-object/from16 v28, v2

    move-object/from16 v27, v5

    move-object/from16 v38, v6

    move-object/from16 v37, v7

    move-object/from16 v36, v8

    move-object/from16 v30, v9

    move-object/from16 v35, v11

    move-object/from16 v29, v12

    move/from16 v25, v13

    move/from16 v32, v14

    move-object/from16 v31, v19

    move-object/from16 v33, v20

    move-object/from16 v34, v21

    goto/16 :goto_0

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v24, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    const/16 v39, 0x0

    invoke-direct/range {v24 .. v39}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;-><init>(IZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

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
    invoke-virtual {p0, p1}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialPlanOption;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/TrialPlanOption;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialPlanOption;)V

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
