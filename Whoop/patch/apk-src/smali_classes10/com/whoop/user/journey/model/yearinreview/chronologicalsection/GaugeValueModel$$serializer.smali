.class public final synthetic Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "user-journey_release"
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

.field public static final INSTANCE:Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.user.journey.model.yearinreview.chronologicalsection.GaugeValueModel"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "value"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "valueSuffix"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "fillPercentage"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "progressStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->descriptor:Lyc3/g;

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

    const/4 v0, 0x6

    new-array v0, v0, [Lwc3/c;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;
    .locals 27

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v8

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x3f

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move/from16 v18, v5

    move/from16 v21, v6

    move-object/from16 v20, v7

    move-wide/from16 v23, v8

    :goto_0
    move-object/from16 v19, v2

    goto :goto_3

    :cond_0
    const/4 v2, 0x0

    const-wide/16 v9, 0x0

    move-object v13, v2

    move/from16 v16, v7

    move v11, v8

    move v12, v11

    move-wide v14, v9

    move-object v9, v13

    move-object v10, v9

    :goto_1
    if-eqz v16, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v11, v11, 0x20

    :goto_2
    const/4 v8, 0x0

    goto :goto_1

    :pswitch_1
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v14

    or-int/lit8 v11, v11, 0x10

    goto :goto_2

    :pswitch_2
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v11, v11, 0x8

    goto :goto_2

    :pswitch_3
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v12

    or-int/lit8 v11, v11, 0x4

    goto :goto_2

    :pswitch_4
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v11, v11, 0x2

    goto :goto_2

    :pswitch_5
    const/4 v8, 0x0

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    or-int/lit8 v11, v11, 0x1

    goto :goto_1

    :pswitch_6
    const/4 v8, 0x0

    move/from16 v16, v8

    goto :goto_1

    :cond_1
    move-object/from16 v25, v9

    move-object/from16 v22, v10

    move/from16 v18, v11

    move/from16 v21, v12

    move-object/from16 v20, v13

    move-wide/from16 v23, v14

    goto :goto_0

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v17, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;

    const/16 v26, 0x0

    invoke-direct/range {v17 .. v26}, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v17

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;->write$Self$user_journey_release(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;)V

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
