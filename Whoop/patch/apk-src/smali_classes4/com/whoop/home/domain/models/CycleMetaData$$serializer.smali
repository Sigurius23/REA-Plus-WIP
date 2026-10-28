.class public final synthetic Lcom/whoop/home/domain/models/CycleMetaData$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/home/domain/models/CycleMetaData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/home/domain/models/CycleMetaData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/home/domain/models/CycleMetaData.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/home/domain/models/CycleMetaData;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/home/domain/models/CycleMetaData;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/home/domain/models/CycleMetaData;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "home_release"
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

.field public static final INSTANCE:Lcom/whoop/home/domain/models/CycleMetaData$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;

    invoke-direct {v0}, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleMetaData$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.home.domain.models.CycleMetaData"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "cycleId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cycleDays"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cycleDateDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "previousCycleDay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "nextCycleDay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "multiDayCycle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "has_multi_day_cycle_cta_tile"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepState"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "day_zero"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x9

    new-array v4, v4, [Lwc3/c;

    sget-object v5, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    sget-object v5, Lcom/whoop/home/domain/models/CycleDays$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleDays$$serializer;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const/4 v5, 0x2

    aput-object v0, v4, v5

    const/4 v5, 0x3

    aput-object v0, v4, v5

    const/4 v5, 0x4

    aput-object v0, v4, v5

    const/4 v0, 0x5

    aput-object v1, v4, v0

    const/4 v0, 0x6

    aput-object v1, v4, v0

    const/4 v0, 0x7

    aput-object v2, v4, v0

    const/16 v0, 0x8

    aput-object v3, v4, v0

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/home/domain/models/CycleMetaData;
    .locals 34

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->descriptor:Lyc3/g;

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

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v13

    sget-object v2, Lcom/whoop/home/domain/models/CycleDays$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleDays$$serializer;

    invoke-interface {v0, v1, v10, v2, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/home/domain/models/CycleDays;

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v4

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v3, v10, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v10, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v7, v10, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    const/16 v10, 0x1ff

    move-object/from16 v25, v2

    move-object/from16 v31, v3

    move/from16 v30, v4

    move/from16 v29, v5

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move-object/from16 v28, v8

    move-object/from16 v26, v9

    move/from16 v22, v10

    move-wide/from16 v23, v13

    goto/16 :goto_3

    :cond_0
    const-wide/16 v13, 0x0

    move/from16 v20, v10

    move v2, v11

    move-object v10, v12

    move-object v15, v10

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-wide/from16 v18, v13

    move v12, v2

    move v13, v12

    move-object/from16 v11, v17

    move-object v14, v11

    :goto_0
    if-eqz v20, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v9, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v7, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/Boolean;

    or-int/lit16 v13, v13, 0x100

    :goto_1
    const/4 v9, 0x2

    goto :goto_0

    :pswitch_1
    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v3, v9, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x80

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v2

    or-int/lit8 v13, v13, 0x40

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v12

    or-int/lit8 v13, v13, 0x20

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v13, v13, 0x10

    goto :goto_1

    :pswitch_5
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v13, v13, 0x8

    goto :goto_1

    :pswitch_6
    const/4 v9, 0x2

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v13, v13, 0x4

    goto :goto_0

    :pswitch_7
    const/4 v9, 0x2

    sget-object v3, Lcom/whoop/home/domain/models/CycleDays$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleDays$$serializer;

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/whoop/home/domain/models/CycleDays;

    or-int/lit8 v13, v13, 0x2

    :goto_2
    const/4 v3, 0x7

    const/4 v4, 0x6

    goto :goto_0

    :pswitch_8
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v9, 0x2

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v18

    or-int/lit8 v13, v13, 0x1

    goto :goto_2

    :pswitch_9
    const/4 v3, 0x0

    const/4 v9, 0x2

    move/from16 v20, v3

    const/4 v3, 0x7

    goto :goto_0

    :cond_1
    move/from16 v30, v2

    move-object/from16 v32, v10

    move-object/from16 v31, v11

    move/from16 v29, v12

    move/from16 v22, v13

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    move-object/from16 v27, v16

    move-object/from16 v28, v17

    move-wide/from16 v23, v18

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v21, Lcom/whoop/home/domain/models/CycleMetaData;

    const/16 v33, 0x0

    invoke-direct/range {v21 .. v33}, Lcom/whoop/home/domain/models/CycleMetaData;-><init>(IJLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v21

    nop

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
    invoke-virtual {p0, p1}, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/home/domain/models/CycleMetaData;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/home/domain/models/CycleMetaData;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/home/domain/models/CycleMetaData;->write$Self$home_release(Lcom/whoop/home/domain/models/CycleMetaData;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/home/domain/models/CycleMetaData;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->serialize(Lzc3/e;Lcom/whoop/home/domain/models/CycleMetaData;)V

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
