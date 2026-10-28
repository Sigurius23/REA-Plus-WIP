.class public final synthetic Lcom/whoop/stress/domain/model/StressSession$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/stress/domain/model/StressSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/stress/domain/model/StressSession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/stress/domain/model/StressSession.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/stress/domain/model/StressSession;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/stress/domain/model/StressSession;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/stress/domain/model/StressSession;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "stress_release"
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

.field public static final INSTANCE:Lcom/whoop/stress/domain/model/StressSession$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/stress/domain/model/StressSession$$serializer;

    invoke-direct {v0}, Lcom/whoop/stress/domain/model/StressSession$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/stress/domain/model/StressSession$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressSession$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/stress/domain/model/StressSession$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.stress.domain.model.StressSession"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "background_image_url"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigation_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "duration"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "instruction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "button_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "intervention"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "customization"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/stress/domain/model/StressSession$$serializer;->descriptor:Lyc3/g;

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

    sget-object v0, Lcom/whoop/stress/domain/model/StressDuration$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDuration$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/stress/domain/model/StressCustomization$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomization$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    const/16 v2, 0x9

    new-array v2, v2, [Lwc3/c;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const/4 v4, 0x4

    aput-object v0, v2, v4

    sget-object v0, Lcom/whoop/stress/domain/model/StressInstruction$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInstruction$$serializer;

    const/4 v4, 0x5

    aput-object v0, v2, v4

    const/4 v0, 0x6

    aput-object v3, v2, v0

    sget-object v0, Lcom/whoop/stress/domain/model/StressIntervention$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressIntervention$$serializer;

    const/4 v3, 0x7

    aput-object v0, v2, v3

    const/16 v0, 0x8

    aput-object v1, v2, v0

    return-object v2
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/stress/domain/model/StressSession;
    .locals 33

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/stress/domain/model/StressSession$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    sget-object v11, Lcom/whoop/stress/domain/model/StressDuration$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDuration$$serializer;

    invoke-interface {v0, v1, v8, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/stress/domain/model/StressDuration;

    sget-object v11, Lcom/whoop/stress/domain/model/StressInstruction$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInstruction$$serializer;

    invoke-interface {v0, v1, v5, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/stress/domain/model/StressInstruction;

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Lcom/whoop/stress/domain/model/StressIntervention$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressIntervention$$serializer;

    invoke-interface {v0, v1, v3, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/stress/domain/model/StressIntervention;

    sget-object v11, Lcom/whoop/stress/domain/model/StressCustomization$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomization$$serializer;

    invoke-interface {v0, v1, v7, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/stress/domain/model/StressCustomization;

    const/16 v11, 0x1ff

    move-object/from16 v23, v2

    move-object/from16 v30, v3

    move-object/from16 v29, v4

    move-object/from16 v28, v5

    move-object/from16 v26, v6

    move-object/from16 v31, v7

    move-object/from16 v27, v8

    move-object/from16 v25, v9

    move-object/from16 v24, v10

    move/from16 v22, v11

    goto/16 :goto_4

    :cond_0
    move/from16 v20, v10

    move v2, v11

    move-object v6, v12

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    :goto_0
    if-eqz v20, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lcom/whoop/stress/domain/model/StressCustomization$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomization$$serializer;

    invoke-interface {v0, v1, v7, v8, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/stress/domain/model/StressCustomization;

    or-int/lit16 v2, v2, 0x100

    :goto_1
    const/4 v8, 0x4

    goto :goto_0

    :pswitch_1
    sget-object v8, Lcom/whoop/stress/domain/model/StressIntervention$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressIntervention$$serializer;

    invoke-interface {v0, v1, v3, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/stress/domain/model/StressIntervention;

    or-int/lit16 v2, v2, 0x80

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v2, v2, 0x40

    goto :goto_1

    :pswitch_3
    sget-object v8, Lcom/whoop/stress/domain/model/StressInstruction$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInstruction$$serializer;

    invoke-interface {v0, v1, v5, v8, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/stress/domain/model/StressInstruction;

    or-int/lit8 v2, v2, 0x20

    goto :goto_1

    :pswitch_4
    sget-object v8, Lcom/whoop/stress/domain/model/StressDuration$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDuration$$serializer;

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v8, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lcom/whoop/stress/domain/model/StressDuration;

    or-int/lit8 v2, v2, 0x10

    :goto_2
    move v8, v3

    :goto_3
    const/4 v3, 0x7

    goto :goto_0

    :pswitch_5
    const/4 v3, 0x4

    const/4 v8, 0x3

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v2, v2, 0x8

    goto :goto_2

    :pswitch_6
    const/4 v3, 0x4

    const/4 v8, 0x3

    const/4 v14, 0x2

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v2, v2, 0x4

    move v8, v3

    move-object/from16 v14, v18

    goto :goto_3

    :pswitch_7
    const/4 v3, 0x4

    const/4 v8, 0x3

    const/4 v13, 0x1

    const/16 v18, 0x2

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v2, v2, 0x2

    move v8, v3

    move-object/from16 v13, v16

    goto :goto_3

    :pswitch_8
    const/4 v3, 0x4

    const/4 v8, 0x3

    const/4 v12, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x2

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v2, v2, 0x1

    move v8, v3

    move-object/from16 v12, v19

    goto :goto_3

    :pswitch_9
    const/4 v8, 0x3

    const/16 v16, 0x1

    const/16 v18, 0x2

    const/16 v19, 0x0

    move/from16 v20, v19

    goto :goto_1

    :cond_1
    move/from16 v22, v2

    move-object/from16 v31, v6

    move-object/from16 v30, v9

    move-object/from16 v28, v10

    move-object/from16 v27, v11

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    move-object/from16 v29, v17

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v21, Lcom/whoop/stress/domain/model/StressSession;

    const/16 v32, 0x0

    invoke-direct/range {v21 .. v32}, Lcom/whoop/stress/domain/model/StressSession;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressDuration;Lcom/whoop/stress/domain/model/StressInstruction;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/StressCustomization;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v21

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/stress/domain/model/StressSession$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/stress/domain/model/StressSession;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressSession$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/stress/domain/model/StressSession;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/stress/domain/model/StressSession$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/stress/domain/model/StressSession;->write$Self$stress_release(Lcom/whoop/stress/domain/model/StressSession;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/stress/domain/model/StressSession;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/stress/domain/model/StressSession$$serializer;->serialize(Lzc3/e;Lcom/whoop/stress/domain/model/StressSession;)V

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
