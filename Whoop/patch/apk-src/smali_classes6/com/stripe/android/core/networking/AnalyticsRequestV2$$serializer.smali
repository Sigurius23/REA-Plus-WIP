.class public final synthetic Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/AnalyticsRequestV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/stripe/android/core/networking/AnalyticsRequestV2.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/stripe/android/core/networking/AnalyticsRequestV2;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->INSTANCE:Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.stripe.android.core.networking.AnalyticsRequestV2"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "eventName"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "clientId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "origin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "created"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "params"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "postParameters"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "headers"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "method"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mimeType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "retryResponseCodes"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "url"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    const/4 v1, 0x6

    aget-object v2, v0, v1

    const/4 v3, 0x7

    aget-object v4, v0, v3

    const/16 v5, 0x8

    aget-object v6, v0, v5

    const/16 v7, 0x9

    aget-object v0, v0, v7

    const/16 v8, 0xb

    new-array v8, v8, [Lwc3/c;

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v10, 0x0

    aput-object v9, v8, v10

    const/4 v10, 0x1

    aput-object v9, v8, v10

    const/4 v10, 0x2

    aput-object v9, v8, v10

    sget-object v10, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v11, 0x3

    aput-object v10, v8, v11

    sget-object v10, Lad3/n;->a:Lad3/n;

    const/4 v11, 0x4

    aput-object v10, v8, v11

    const/4 v10, 0x5

    aput-object v9, v8, v10

    aput-object v2, v8, v1

    aput-object v4, v8, v3

    aput-object v6, v8, v5

    aput-object v0, v8, v7

    const/16 v0, 0xa

    aput-object v9, v8, v0

    return-object v8
.end method

.method public final deserialize(Lzc3/d;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 39

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0xa

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/16 v12, 0x8

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v16

    sget-object v6, Lad3/n;->a:Lad3/n;

    invoke-interface {v0, v1, v7, v6, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlinx/serialization/json/JsonElement;

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    aget-object v7, v2, v11

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v11, v7, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    aget-object v11, v2, v10

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v10, v11, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lyy/k0;

    aget-object v11, v2, v12

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v12, v11, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lyy/l0;

    aget-object v2, v2, v9

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v9, v2, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x7ff

    move-object/from16 v36, v2

    move-object/from16 v26, v3

    move-object/from16 v37, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v33, v7

    move-object/from16 v28, v8

    move/from16 v25, v9

    move-object/from16 v34, v10

    move-object/from16 v35, v11

    move-object/from16 v27, v13

    move-wide/from16 v29, v16

    goto/16 :goto_3

    :cond_0
    const-wide/16 v16, 0x0

    move/from16 v23, v13

    move v3, v14

    move-object v6, v15

    move-object v7, v6

    move-object v8, v7

    move-object v13, v8

    move-object v14, v13

    move-object/from16 v18, v14

    move-object/from16 v20, v18

    move-wide/from16 v21, v16

    move-object/from16 v16, v20

    move-object/from16 v17, v16

    :goto_0
    if-eqz v23, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit16 v3, v3, 0x400

    :goto_1
    const/4 v5, 0x5

    goto :goto_0

    :pswitch_1
    aget-object v5, v2, v9

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v9, v5, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/Iterable;

    or-int/lit16 v3, v3, 0x200

    goto :goto_1

    :pswitch_2
    aget-object v5, v2, v12

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v12, v5, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lyy/l0;

    or-int/lit16 v3, v3, 0x100

    goto :goto_1

    :pswitch_3
    aget-object v5, v2, v10

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v10, v5, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lyy/k0;

    or-int/lit16 v3, v3, 0x80

    goto :goto_1

    :pswitch_4
    aget-object v5, v2, v11

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v11, v5, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/util/Map;

    or-int/lit8 v3, v3, 0x40

    goto :goto_1

    :pswitch_5
    const/4 v5, 0x5

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v3, v3, 0x20

    goto :goto_0

    :pswitch_6
    const/4 v5, 0x5

    sget-object v4, Lad3/n;->a:Lad3/n;

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v4, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lkotlinx/serialization/json/JsonElement;

    or-int/lit8 v3, v3, 0x10

    :goto_2
    const/16 v4, 0xa

    goto :goto_1

    :pswitch_7
    const/4 v4, 0x3

    const/4 v5, 0x4

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v21

    or-int/lit8 v3, v3, 0x8

    goto :goto_2

    :pswitch_8
    const/4 v4, 0x2

    const/4 v5, 0x4

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v3, v3, 0x4

    goto :goto_2

    :pswitch_9
    const/4 v4, 0x1

    const/4 v5, 0x4

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v3, v3, 0x2

    goto :goto_2

    :pswitch_a
    const/4 v4, 0x1

    const/4 v5, 0x4

    const/4 v15, 0x0

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v3, v3, 0x1

    move-object/from16 v15, v19

    goto :goto_2

    :pswitch_b
    const/4 v4, 0x1

    const/16 v19, 0x0

    move/from16 v23, v19

    goto :goto_2

    :cond_1
    move/from16 v25, v3

    move-object/from16 v35, v6

    move-object/from16 v36, v7

    move-object/from16 v34, v8

    move-object/from16 v33, v13

    move-object/from16 v31, v14

    move-object/from16 v26, v15

    move-object/from16 v27, v16

    move-object/from16 v28, v17

    move-object/from16 v32, v18

    move-object/from16 v37, v20

    move-wide/from16 v29, v21

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v24, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    const/16 v38, 0x0

    invoke-direct/range {v24 .. v38}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lyy/k0;Lyy/l0;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v24

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->deserialize(Lzc3/d;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/stripe/android/core/networking/AnalyticsRequestV2;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->write$Self$stripe_core_release(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->serialize(Lzc3/e;Lcom/stripe/android/core/networking/AnalyticsRequestV2;)V

    return-void
.end method
