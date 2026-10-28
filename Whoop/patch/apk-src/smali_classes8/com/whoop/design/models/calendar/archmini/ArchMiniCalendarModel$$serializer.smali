.class public final synthetic Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/calendar/archmini/ArchMiniCalendarModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->$stable:I

    new-instance v2, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v3, "com.whoop.design.models.calendar.archmini.ArchMiniCalendarModel"

    invoke-direct {v2, v3, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "request"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cachePolicy"

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "content"

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectedDate"

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "futureMonthsShown"

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "showsDefaultDateSelector"

    invoke-virtual {v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pageHeightRatio"

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heightConfiguration"

    invoke-virtual {v2, v0, v1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v2, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v3, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0x8

    new-array v5, v5, [Lwc3/c;

    sget-object v6, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    aput-object v0, v5, v6

    const/4 v0, 0x2

    aput-object v1, v5, v0

    const/4 v0, 0x3

    aput-object v2, v5, v0

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v1, 0x4

    aput-object v0, v5, v1

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v1, 0x5

    aput-object v0, v5, v1

    const/4 v0, 0x6

    aput-object v3, v5, v0

    const/4 v0, 0x7

    aput-object v4, v5, v0

    return-object v5
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;
    .locals 29

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    invoke-interface {v0, v1, v10, v2, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/ApiRequest;

    sget-object v10, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    invoke-interface {v0, v1, v9, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/navigation/CachePolicyModel;

    sget-object v10, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;

    invoke-interface {v0, v1, v8, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    sget-object v10, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-interface {v0, v1, v4, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v3, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v10, 0xff

    move-object/from16 v20, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v4

    move/from16 v25, v5

    move-object/from16 v23, v6

    move/from16 v24, v7

    move-object/from16 v22, v8

    move-object/from16 v21, v9

    move/from16 v19, v10

    goto/16 :goto_3

    :cond_0
    move/from16 v17, v9

    move v2, v10

    move v12, v2

    move-object v9, v11

    move-object v13, v9

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move v11, v12

    move-object/from16 v10, v16

    :goto_0
    if-eqz v17, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v3, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x80

    :goto_1
    const/4 v8, 0x2

    goto :goto_0

    :pswitch_1
    sget-object v8, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-interface {v0, v1, v4, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/Float;

    or-int/lit8 v12, v12, 0x40

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v2

    or-int/lit8 v12, v12, 0x20

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v11

    or-int/lit8 v12, v12, 0x10

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v12, v12, 0x8

    goto :goto_1

    :pswitch_5
    sget-object v8, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v8, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    or-int/lit8 v12, v12, 0x4

    move v8, v3

    const/4 v3, 0x7

    goto :goto_0

    :pswitch_6
    const/4 v3, 0x2

    sget-object v8, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v8, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/navigation/CachePolicyModel;

    or-int/lit8 v12, v12, 0x2

    :goto_2
    const/4 v3, 0x7

    goto :goto_1

    :pswitch_7
    const/4 v3, 0x1

    sget-object v8, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v8, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Lcom/whoop/navigation/models/ApiRequest;

    or-int/lit8 v12, v12, 0x1

    goto :goto_2

    :pswitch_8
    const/4 v3, 0x0

    move/from16 v17, v3

    goto :goto_2

    :cond_1
    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v26, v10

    move/from16 v24, v11

    move/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v16

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v18, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    const/16 v28, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;-><init>(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v18

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->write$Self$design_models_release(Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;)V

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
