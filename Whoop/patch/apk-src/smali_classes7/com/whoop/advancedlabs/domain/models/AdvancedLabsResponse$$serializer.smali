.class public final synthetic Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/advancedlabs/domain/models/AdvancedLabsResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
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

.field public static final INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.advancedlabs.domain.models.AdvancedLabsResponse"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "metadata"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigationBar"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sections"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "analytics"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "initiallySelectedSegmentId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bottomStickyItems"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "attendedAppointmentDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    sget-object v3, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v2, 0x6

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
    .locals 28

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x6

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x5

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;

    invoke-interface {v0, v1, v10, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/MetaData;

    sget-object v10, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    invoke-interface {v0, v1, v9, v10, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    aget-object v10, v2, v8

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v8, v10, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    sget-object v10, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;

    invoke-interface {v0, v1, v5, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v6, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v7, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    sget-object v7, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;

    invoke-interface {v0, v1, v4, v7, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    const/16 v7, 0x7f

    move-object/from16 v25, v2

    move-object/from16 v20, v3

    move-object/from16 v26, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move/from16 v19, v7

    move-object/from16 v22, v8

    move-object/from16 v21, v9

    goto/16 :goto_3

    :cond_0
    move/from16 v16, v9

    move v3, v10

    move-object v9, v11

    move-object v10, v9

    move-object v12, v10

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v16, :cond_1

    move/from16 v17, v8

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;

    invoke-interface {v0, v1, v4, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    or-int/lit8 v3, v3, 0x40

    :goto_1
    move/from16 v8, v17

    goto :goto_0

    :pswitch_1
    aget-object v8, v2, v7

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v7, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/util/Map;

    or-int/lit8 v3, v3, 0x20

    goto :goto_1

    :pswitch_2
    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v6, v8, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x10

    goto :goto_1

    :pswitch_3
    sget-object v8, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;

    invoke-interface {v0, v1, v5, v8, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    or-int/lit8 v3, v3, 0x8

    goto :goto_1

    :pswitch_4
    aget-object v8, v2, v17

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v4, v17

    invoke-interface {v0, v1, v4, v8, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/List;

    or-int/lit8 v3, v3, 0x4

    move v8, v4

    const/4 v4, 0x6

    goto :goto_0

    :pswitch_5
    move/from16 v4, v17

    sget-object v8, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v8, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    or-int/lit8 v3, v3, 0x2

    :goto_2
    const/4 v4, 0x6

    const/4 v8, 0x2

    goto :goto_0

    :pswitch_6
    const/4 v4, 0x1

    sget-object v8, Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v8, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lcom/whoop/advancedlabs/domain/models/MetaData;

    or-int/lit8 v3, v3, 0x1

    goto :goto_2

    :pswitch_7
    const/4 v4, 0x0

    move/from16 v16, v4

    goto :goto_2

    :cond_1
    move/from16 v19, v3

    move-object/from16 v26, v9

    move-object/from16 v25, v10

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v18, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    const/16 v27, 0x0

    invoke-direct/range {v18 .. v27}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;-><init>(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v18

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;)V

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
