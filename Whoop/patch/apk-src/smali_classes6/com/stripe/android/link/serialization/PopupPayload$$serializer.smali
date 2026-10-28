.class public final synthetic Lcom/stripe/android/link/serialization/PopupPayload$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/serialization/PopupPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/stripe/android/link/serialization/PopupPayload;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/stripe/android/link/serialization/PopupPayload.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/stripe/android/link/serialization/PopupPayload;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/stripe/android/link/serialization/PopupPayload;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/stripe/android/link/serialization/PopupPayload;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.stripe.android.link.serialization.PopupPayload"

    const/16 v3, 0x13

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "publishableKey"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stripeAccount"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "merchantInfo"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "customerInfo"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paymentInfo"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "appId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "locale"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paymentUserAgent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paymentObject"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "intentMode"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "setupFutureUsage"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cardBrandChoice"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "flags"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "linkFundingSources"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "clientAttributionMetadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "path"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "integrationType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "loggerMetadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "experiments"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->descriptor:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/stripe/android/link/serialization/PopupPayload;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xc

    aget-object v6, v0, v5

    const/16 v7, 0xd

    aget-object v8, v0, v7

    const/16 v9, 0xe

    aget-object v10, v0, v9

    const/16 v11, 0x11

    aget-object v12, v0, v11

    const/16 v13, 0x12

    aget-object v0, v0, v13

    const/16 v14, 0x13

    new-array v14, v14, [Lwc3/c;

    const/4 v15, 0x0

    aput-object v1, v14, v15

    const/4 v15, 0x1

    aput-object v2, v14, v15

    sget-object v2, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;

    const/4 v15, 0x2

    aput-object v2, v14, v15

    sget-object v2, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;

    const/4 v15, 0x3

    aput-object v2, v14, v15

    const/4 v2, 0x4

    aput-object v3, v14, v2

    const/4 v2, 0x5

    aput-object v1, v14, v2

    const/4 v2, 0x6

    aput-object v1, v14, v2

    const/4 v2, 0x7

    aput-object v1, v14, v2

    const/16 v2, 0x8

    aput-object v1, v14, v2

    const/16 v2, 0x9

    aput-object v1, v14, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v3, 0xa

    aput-object v2, v14, v3

    const/16 v2, 0xb

    aput-object v4, v14, v2

    aput-object v6, v14, v5

    aput-object v8, v14, v7

    aput-object v10, v14, v9

    const/16 v2, 0xf

    aput-object v1, v14, v2

    const/16 v2, 0x10

    aput-object v1, v14, v2

    aput-object v12, v14, v11

    aput-object v0, v14, v13

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/stripe/android/link/serialization/PopupPayload;
    .locals 55

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/stripe/android/link/serialization/PopupPayload;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0xa

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x3

    const/16 v13, 0x8

    const/4 v14, 0x4

    const/4 v15, 0x2

    const/16 v16, 0x12

    const/16 v17, 0x11

    const/16 v19, 0xe

    const/16 v20, 0xd

    const/4 v4, 0x1

    const/16 v21, 0xc

    const/4 v12, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v12, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v12, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;

    invoke-interface {v0, v1, v15, v12, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    sget-object v15, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;

    invoke-interface {v0, v1, v11, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    sget-object v15, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;

    invoke-interface {v0, v1, v14, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    sget-object v15, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;

    move-object/from16 v23, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    aget-object v15, v23, v21

    check-cast v15, Lwc3/b;

    move-object/from16 v22, v2

    move/from16 v2, v21

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v15, v23, v20

    check-cast v15, Lwc3/b;

    move-object/from16 v21, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v23, v19

    check-cast v15, Lwc3/b;

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    const/16 v5, 0x10

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    aget-object v18, v23, v17

    move-object/from16 p1, v2

    move-object/from16 v2, v18

    check-cast v2, Lwc3/b;

    move-object/from16 v18, v3

    move/from16 v3, v17

    move-object/from16 v17, v12

    const/4 v12, 0x0

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v3, v23, v16

    check-cast v3, Lwc3/b;

    move-object/from16 v19, v4

    move/from16 v4, v16

    invoke-interface {v0, v1, v4, v3, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const v4, 0x7ffff

    move-object/from16 v49, p1

    move-object/from16 v52, v2

    move-object/from16 v53, v3

    move/from16 v34, v4

    move-object/from16 v51, v5

    move/from16 v45, v6

    move-object/from16 v44, v7

    move-object/from16 v42, v8

    move-object/from16 v41, v9

    move-object/from16 v40, v10

    move-object/from16 v38, v11

    move-object/from16 v43, v13

    move-object/from16 v39, v14

    move-object/from16 v50, v15

    move-object/from16 v37, v17

    move-object/from16 v35, v18

    move-object/from16 v36, v19

    move-object/from16 v48, v20

    move-object/from16 v47, v21

    move-object/from16 v46, v22

    goto/16 :goto_5

    :cond_0
    move-object/from16 v23, v2

    move v2, v4

    move v3, v12

    move/from16 v4, v16

    move-object v12, v5

    move/from16 v32, v2

    move v5, v3

    move/from16 v31, v5

    move-object v2, v12

    move-object v3, v2

    move-object v7, v3

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v24, v15

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    :goto_0
    if-eqz v32, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v6, v23, v4

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v4, v6, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/Map;

    const/high16 v6, 0x40000

    or-int/2addr v5, v6

    :goto_1
    const/16 v6, 0xa

    goto :goto_0

    :pswitch_1
    const/16 v6, 0x11

    aget-object v17, v23, v6

    move-object/from16 v4, v17

    check-cast v4, Lwc3/b;

    invoke-interface {v0, v1, v6, v4, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/util/Map;

    const/high16 v4, 0x20000

    or-int/2addr v5, v4

    :goto_2
    const/16 v4, 0x12

    goto :goto_1

    :pswitch_2
    const/16 v4, 0x10

    const/16 v6, 0x11

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    const/high16 v17, 0x10000

    :goto_3
    or-int v5, v5, v17

    goto :goto_2

    :pswitch_3
    const/16 v4, 0xf

    const/16 v6, 0x11

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    const v17, 0x8000

    goto :goto_3

    :pswitch_4
    const/16 v4, 0xe

    const/16 v6, 0x11

    aget-object v17, v23, v4

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v4, v6, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/util/Map;

    or-int/lit16 v5, v5, 0x4000

    goto :goto_2

    :pswitch_5
    const/16 v4, 0xe

    const/16 v6, 0xd

    aget-object v17, v23, v6

    move-object/from16 v4, v17

    check-cast v4, Lwc3/b;

    invoke-interface {v0, v1, v6, v4, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/util/List;

    or-int/lit16 v5, v5, 0x2000

    goto :goto_2

    :pswitch_6
    const/16 v4, 0xc

    const/16 v6, 0xd

    aget-object v17, v23, v4

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v4, v6, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/util/Map;

    or-int/lit16 v5, v5, 0x1000

    goto :goto_2

    :pswitch_7
    const/16 v4, 0xc

    sget-object v6, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v6, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    or-int/lit16 v5, v5, 0x800

    goto :goto_2

    :pswitch_8
    const/16 v4, 0xb

    const/16 v6, 0xa

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v31

    or-int/lit16 v5, v5, 0x400

    :goto_4
    const/16 v4, 0x12

    goto/16 :goto_0

    :pswitch_9
    const/16 v4, 0x9

    const/16 v6, 0xa

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit16 v5, v5, 0x200

    goto :goto_4

    :pswitch_a
    const/16 v4, 0x8

    const/16 v6, 0xa

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v27

    or-int/lit16 v5, v5, 0x100

    goto :goto_4

    :pswitch_b
    const/4 v4, 0x7

    const/16 v6, 0xa

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit16 v5, v5, 0x80

    goto :goto_4

    :pswitch_c
    const/4 v4, 0x6

    const/16 v6, 0xa

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v5, v5, 0x40

    goto :goto_4

    :pswitch_d
    const/4 v4, 0x5

    const/16 v6, 0xa

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v5, v5, 0x20

    goto :goto_4

    :pswitch_e
    const/16 v6, 0xa

    sget-object v4, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v4, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    or-int/lit8 v5, v5, 0x10

    goto/16 :goto_2

    :pswitch_f
    const/4 v6, 0x4

    sget-object v4, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v4, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    or-int/lit8 v5, v5, 0x8

    goto/16 :goto_2

    :pswitch_10
    const/4 v6, 0x3

    sget-object v4, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;

    const/4 v6, 0x2

    invoke-interface {v0, v1, v6, v4, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    or-int/lit8 v5, v5, 0x4

    goto/16 :goto_2

    :pswitch_11
    const/4 v6, 0x2

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x1

    invoke-interface {v0, v1, v6, v4, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x2

    goto/16 :goto_2

    :pswitch_12
    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    or-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :pswitch_13
    const/4 v4, 0x0

    move/from16 v32, v4

    goto/16 :goto_2

    :cond_1
    move-object/from16 v37, v2

    move-object/from16 v36, v3

    move/from16 v34, v5

    move-object/from16 v53, v7

    move-object/from16 v49, v8

    move-object/from16 v48, v9

    move-object/from16 v47, v10

    move-object/from16 v39, v11

    move-object/from16 v35, v12

    move-object/from16 v52, v13

    move-object/from16 v46, v14

    move-object/from16 v38, v15

    move-object/from16 v40, v24

    move-object/from16 v41, v25

    move-object/from16 v42, v26

    move-object/from16 v43, v27

    move-object/from16 v44, v28

    move-object/from16 v50, v29

    move-object/from16 v51, v30

    move/from16 v45, v31

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v33, Lcom/stripe/android/link/serialization/PopupPayload;

    const/16 v54, 0x0

    invoke-direct/range {v33 .. v54}, Lcom/stripe/android/link/serialization/PopupPayload;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v33

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->deserialize(Lzc3/d;)Lcom/stripe/android/link/serialization/PopupPayload;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/stripe/android/link/serialization/PopupPayload;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/link/serialization/PopupPayload;->write$Self$paymentsheet_release(Lcom/stripe/android/link/serialization/PopupPayload;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/stripe/android/link/serialization/PopupPayload;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->serialize(Lzc3/e;Lcom/stripe/android/link/serialization/PopupPayload;)V

    return-void
.end method
