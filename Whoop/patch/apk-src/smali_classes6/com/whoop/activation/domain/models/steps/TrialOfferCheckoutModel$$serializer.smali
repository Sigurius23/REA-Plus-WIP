.class public final synthetic Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/activation/domain/models/steps/TrialOfferCheckoutModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;",
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

.field public static final INSTANCE:Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "orderDetails"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paymentMethod"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "joinCtaTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "securityFooter"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disclaimerFooterMarkdown"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "payload"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isTrialMember"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "promoCode"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "membershipTier"

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

    sput-object v1, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/16 v7, 0xd

    aget-object v0, v0, v7

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v8, 0xe

    new-array v8, v8, [Lwc3/c;

    sget-object v9, Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;

    const/4 v10, 0x0

    aput-object v9, v8, v10

    sget-object v9, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;

    const/4 v10, 0x1

    aput-object v9, v8, v10

    const/4 v9, 0x2

    aput-object v2, v8, v9

    sget-object v2, Lmd1/a;->a:Lmd1/a;

    const/4 v9, 0x3

    aput-object v2, v8, v9

    const/4 v2, 0x4

    aput-object v1, v8, v2

    const/4 v2, 0x5

    aput-object v1, v8, v2

    const/4 v2, 0x6

    aput-object v3, v8, v2

    const/4 v2, 0x7

    aput-object v4, v8, v2

    const/16 v2, 0x8

    aput-object v1, v8, v2

    const/16 v2, 0x9

    aput-object v5, v8, v2

    const/16 v2, 0xa

    aput-object v1, v8, v2

    const/16 v2, 0xb

    aput-object v1, v8, v2

    const/16 v1, 0xc

    aput-object v6, v8, v1

    aput-object v0, v8, v7

    return-object v8
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;
    .locals 42

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x3

    const/16 v12, 0x8

    const/4 v13, 0x4

    const/4 v14, 0x2

    const/16 p1, 0xd

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;

    invoke-interface {v0, v1, v4, v3, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/steps/OrderDetails;

    sget-object v4, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;

    invoke-interface {v0, v1, v15, v4, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    sget-object v6, Lmd1/a;->a:Lmd1/a;

    invoke-interface {v0, v1, v11, v6, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/util/TextResource;

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    sget-object v13, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v9, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v8, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v7, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/16 v13, 0xa

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v2

    sget-object v2, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    move-object/from16 v17, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/ProgressButtonModel;

    aget-object v3, v18, p1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v16, v4

    move/from16 v4, p1

    invoke-interface {v0, v1, v4, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/16 v4, 0x3fff

    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v26, v4

    move-object/from16 v30, v6

    move-object/from16 v36, v7

    move-object/from16 v34, v8

    move-object/from16 v33, v9

    move-object/from16 v32, v10

    move-object/from16 v31, v11

    move-object/from16 v35, v12

    move-object/from16 v37, v13

    move-object/from16 v29, v14

    move-object/from16 v38, v15

    move-object/from16 v28, v16

    move-object/from16 v27, v17

    goto/16 :goto_5

    :cond_0
    move-object/from16 v18, v2

    move v2, v4

    move/from16 v4, p1

    move v3, v2

    move-object v2, v5

    move-object v6, v2

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object/from16 v19, v14

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move/from16 v24, v15

    move-object/from16 v15, v23

    :goto_0
    if-eqz v24, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v8, v18, v4

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v4, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/util/List;

    or-int/lit16 v3, v3, 0x2000

    :goto_1
    const/4 v8, 0x7

    goto :goto_0

    :pswitch_1
    sget-object v8, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    const/16 v4, 0xc

    invoke-interface {v0, v1, v4, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/design/models/ProgressButtonModel;

    or-int/lit16 v3, v3, 0x1000

    :goto_2
    const/16 v4, 0xd

    goto :goto_1

    :pswitch_2
    const/16 v4, 0xc

    const/16 v8, 0xb

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit16 v3, v3, 0x800

    goto :goto_2

    :pswitch_3
    const/16 v4, 0xa

    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit16 v3, v3, 0x400

    goto :goto_2

    :pswitch_4
    const/16 v8, 0xb

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v4, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x200

    goto :goto_2

    :pswitch_5
    const/16 v8, 0xb

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v3, v3, 0x100

    goto :goto_2

    :pswitch_6
    const/16 v8, 0xb

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7, v4, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x80

    move v8, v7

    const/16 v4, 0xd

    const/16 v7, 0x9

    goto :goto_0

    :pswitch_7
    const/4 v7, 0x7

    const/16 v8, 0xb

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v4, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x40

    :goto_3
    const/16 v4, 0xd

    :goto_4
    const/16 v7, 0x9

    goto :goto_1

    :pswitch_8
    const/4 v4, 0x5

    const/4 v7, 0x6

    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v3, v3, 0x20

    goto :goto_3

    :pswitch_9
    const/4 v4, 0x4

    const/4 v7, 0x6

    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v3, v3, 0x10

    goto :goto_3

    :pswitch_a
    const/4 v7, 0x6

    const/16 v8, 0xb

    sget-object v4, Lmd1/a;->a:Lmd1/a;

    const/4 v7, 0x3

    invoke-interface {v0, v1, v7, v4, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lcom/whoop/design/util/TextResource;

    or-int/lit8 v3, v3, 0x8

    goto :goto_3

    :pswitch_b
    const/4 v7, 0x3

    const/16 v8, 0xb

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x4

    goto :goto_3

    :pswitch_c
    const/4 v7, 0x2

    const/16 v8, 0xb

    sget-object v4, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;

    const/4 v7, 0x1

    invoke-interface {v0, v1, v7, v4, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    or-int/lit8 v3, v3, 0x2

    goto :goto_3

    :pswitch_d
    const/4 v7, 0x1

    const/16 v8, 0xb

    sget-object v4, Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;

    const/4 v7, 0x0

    invoke-interface {v0, v1, v7, v4, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/activation/domain/models/steps/OrderDetails;

    or-int/lit8 v3, v3, 0x1

    goto :goto_3

    :pswitch_e
    const/4 v7, 0x0

    const/16 v8, 0xb

    move/from16 v24, v7

    goto :goto_4

    :cond_1
    move-object/from16 v29, v2

    move/from16 v26, v3

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move-object/from16 v40, v9

    move-object/from16 v39, v10

    move-object/from16 v34, v11

    move-object/from16 v36, v13

    move-object/from16 v33, v14

    move-object/from16 v30, v15

    move-object/from16 v31, v19

    move-object/from16 v32, v20

    move-object/from16 v35, v21

    move-object/from16 v37, v22

    move-object/from16 v38, v23

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v25, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    const/16 v41, 0x0

    invoke-direct/range {v25 .. v41}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;-><init>(ILcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v25

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)V

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
