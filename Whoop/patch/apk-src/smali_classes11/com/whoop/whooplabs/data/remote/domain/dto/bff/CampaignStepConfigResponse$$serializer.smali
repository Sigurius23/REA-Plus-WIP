.class public final synthetic Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "whooplabs_release"
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

.field public static final INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse"

    const/16 v3, 0x1e

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "dataTypes"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "additionalDataCollection"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bthrAdditionalDataCollection"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submittingText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "successIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "successText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "successSubtext"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "successBackgroundUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submitErrorTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submitErrorBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submit_error_positive_cta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submit_error_negative_cta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submittedText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submittedCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelDialogTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelDialogBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelDialogPositiveCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelDialogNegativeCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startErrorTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startErrorBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startErrorPositiveCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startErrorNegativeCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startErrorMissingStrapBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "start_error_bthr_failed_body"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "webViewErrorTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "webViewErrorBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "web_view_error_positive_cta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "web_view_error_negative_cta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x1e

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const/16 v3, 0x10

    aput-object v2, v1, v3

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const/16 v3, 0x12

    aput-object v2, v1, v3

    const/16 v3, 0x13

    aput-object v2, v1, v3

    const/16 v3, 0x14

    aput-object v2, v1, v3

    const/16 v3, 0x15

    aput-object v2, v1, v3

    const/16 v3, 0x16

    aput-object v2, v1, v3

    const/16 v3, 0x17

    aput-object v2, v1, v3

    const/16 v3, 0x18

    aput-object v2, v1, v3

    const/16 v3, 0x19

    aput-object v2, v1, v3

    const/16 v3, 0x1a

    aput-object v2, v1, v3

    const/16 v3, 0x1b

    aput-object v2, v1, v3

    const/16 v3, 0x1c

    aput-object v2, v1, v3

    const/16 v2, 0x1d

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
    .locals 95

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v9, 0xa

    const/16 v10, 0x9

    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/16 v15, 0x8

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/16 v31, 0x1d

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v7

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v7, v3, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v7, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v6, v7, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-interface {v0, v1, v5, v7, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    const/16 v8, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v33, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v30, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v29, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v27, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v23, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v22, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0x1a

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v2

    const/16 v2, 0x1b

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    const/16 v2, 0x1c

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    aget-object v32, v33, v31

    invoke-interface/range {v32 .. v32}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v32

    move-object/from16 p1, v2

    move-object/from16 v2, v32

    check-cast v2, Lwc3/b;

    move-object/from16 v32, v7

    move/from16 v7, v31

    move-object/from16 v31, v6

    const/4 v6, 0x0

    invoke-interface {v0, v1, v7, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/e;

    const v6, 0x3fffffff    # 1.9999999f

    move-object/from16 v92, p1

    move-object/from16 v93, v2

    move-object/from16 v64, v3

    move-object/from16 v68, v4

    move-object/from16 v66, v5

    move-object/from16 v76, v8

    move-object/from16 v74, v9

    move-object/from16 v73, v10

    move-object/from16 v71, v11

    move-object/from16 v70, v12

    move-object/from16 v69, v13

    move-object/from16 v72, v14

    move-object/from16 v75, v15

    move-object/from16 v91, v16

    move-object/from16 v90, v17

    move-object/from16 v89, v18

    move-object/from16 v88, v19

    move-object/from16 v87, v20

    move-object/from16 v86, v21

    move-object/from16 v85, v22

    move-object/from16 v84, v23

    move-object/from16 v83, v24

    move-object/from16 v82, v25

    move-object/from16 v81, v26

    move-object/from16 v80, v27

    move-object/from16 v79, v28

    move-object/from16 v78, v29

    move-object/from16 v77, v30

    move-object/from16 v65, v31

    move-object/from16 v67, v32

    :goto_0
    move/from16 v63, v6

    goto/16 :goto_5

    :cond_0
    move-object/from16 v33, v2

    move v2, v6

    move v3, v7

    move-object v6, v8

    move/from16 v7, v31

    move/from16 v60, v2

    move/from16 v31, v3

    move-object v2, v6

    move-object v5, v2

    move-object v8, v5

    move-object/from16 v34, v8

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v56, v55

    move-object/from16 v57, v56

    move-object/from16 v58, v57

    move-object/from16 v59, v58

    move/from16 v6, v31

    move-object/from16 v3, v59

    :goto_1
    if-eqz v60, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v14, v33, v7

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v7, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/navigation/e;

    const/high16 v14, 0x20000000

    or-int/2addr v6, v14

    :goto_2
    const/4 v14, 0x3

    goto :goto_1

    :pswitch_1
    const/16 v14, 0x1c

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v59

    const/high16 v61, 0x10000000

    or-int v6, v6, v61

    goto :goto_2

    :pswitch_2
    const/16 v7, 0x1b

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v58

    const/high16 v16, 0x8000000

    or-int v6, v6, v16

    :goto_3
    const/16 v7, 0x1d

    goto :goto_2

    :pswitch_3
    const/16 v7, 0x1a

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v57

    const/high16 v17, 0x4000000

    or-int v6, v6, v17

    goto :goto_3

    :pswitch_4
    const/16 v7, 0x19

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v56

    const/high16 v18, 0x2000000

    or-int v6, v6, v18

    goto :goto_3

    :pswitch_5
    const/16 v7, 0x18

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v55

    const/high16 v19, 0x1000000

    or-int v6, v6, v19

    goto :goto_3

    :pswitch_6
    const/16 v7, 0x17

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v54

    const/high16 v20, 0x800000

    or-int v6, v6, v20

    goto :goto_3

    :pswitch_7
    const/16 v7, 0x16

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v53

    const/high16 v21, 0x400000

    or-int v6, v6, v21

    goto :goto_3

    :pswitch_8
    const/16 v7, 0x15

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v52

    const/high16 v22, 0x200000

    or-int v6, v6, v22

    goto :goto_3

    :pswitch_9
    const/16 v7, 0x14

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v51

    const/high16 v23, 0x100000

    or-int v6, v6, v23

    goto :goto_3

    :pswitch_a
    const/16 v7, 0x13

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v50

    const/high16 v24, 0x80000

    or-int v6, v6, v24

    goto :goto_3

    :pswitch_b
    const/16 v7, 0x12

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v49

    const/high16 v25, 0x40000

    or-int v6, v6, v25

    goto :goto_3

    :pswitch_c
    const/16 v7, 0x11

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v48

    const/high16 v26, 0x20000

    or-int v6, v6, v26

    goto/16 :goto_3

    :pswitch_d
    const/16 v7, 0x10

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v47

    const/high16 v27, 0x10000

    or-int v6, v6, v27

    goto/16 :goto_3

    :pswitch_e
    const/16 v7, 0xf

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v46

    const v28, 0x8000

    or-int v6, v6, v28

    goto/16 :goto_3

    :pswitch_f
    const/16 v7, 0xe

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v45

    or-int/lit16 v6, v6, 0x4000

    goto/16 :goto_3

    :pswitch_10
    const/16 v7, 0xd

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v44

    or-int/lit16 v6, v6, 0x2000

    goto/16 :goto_3

    :pswitch_11
    const/16 v7, 0xc

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v43

    or-int/lit16 v6, v6, 0x1000

    goto/16 :goto_3

    :pswitch_12
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v42

    or-int/lit16 v6, v6, 0x800

    goto/16 :goto_3

    :pswitch_13
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v41

    or-int/lit16 v6, v6, 0x400

    goto/16 :goto_3

    :pswitch_14
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v40

    or-int/lit16 v6, v6, 0x200

    goto/16 :goto_3

    :pswitch_15
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v39

    or-int/lit16 v6, v6, 0x100

    goto/16 :goto_3

    :pswitch_16
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v38

    or-int/lit16 v6, v6, 0x80

    goto/16 :goto_3

    :pswitch_17
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v37

    or-int/lit8 v6, v6, 0x40

    goto/16 :goto_3

    :pswitch_18
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit8 v6, v6, 0x20

    goto/16 :goto_3

    :pswitch_19
    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v35

    or-int/lit8 v6, v6, 0x10

    goto/16 :goto_3

    :pswitch_1a
    const/4 v4, 0x3

    const/16 v7, 0xb

    const/16 v14, 0x1c

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v34

    or-int/lit8 v6, v6, 0x8

    move v14, v4

    const/4 v4, 0x4

    const/16 v7, 0x1d

    goto/16 :goto_1

    :pswitch_1b
    const/16 v7, 0xb

    const/16 v14, 0x1c

    sget-object v4, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    or-int/lit8 v6, v6, 0x4

    :goto_4
    const/4 v4, 0x4

    goto/16 :goto_3

    :pswitch_1c
    const/4 v7, 0x2

    const/16 v14, 0x1c

    sget-object v4, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v7, 0x1

    invoke-interface {v0, v1, v7, v4, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    or-int/lit8 v6, v6, 0x2

    goto :goto_4

    :pswitch_1d
    const/4 v7, 0x1

    const/16 v14, 0x1c

    aget-object v4, v33, v31

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    move/from16 v7, v31

    invoke-interface {v0, v1, v7, v4, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/util/List;

    or-int/lit8 v6, v6, 0x1

    goto :goto_4

    :pswitch_1e
    move/from16 v7, v31

    move/from16 v60, v31

    goto/16 :goto_3

    :cond_1
    move-object/from16 v66, v2

    move-object/from16 v65, v3

    move-object/from16 v93, v5

    move-object/from16 v64, v8

    move-object/from16 v67, v34

    move-object/from16 v68, v35

    move-object/from16 v69, v36

    move-object/from16 v70, v37

    move-object/from16 v71, v38

    move-object/from16 v72, v39

    move-object/from16 v73, v40

    move-object/from16 v74, v41

    move-object/from16 v75, v42

    move-object/from16 v76, v43

    move-object/from16 v77, v44

    move-object/from16 v78, v45

    move-object/from16 v79, v46

    move-object/from16 v80, v47

    move-object/from16 v81, v48

    move-object/from16 v82, v49

    move-object/from16 v83, v50

    move-object/from16 v84, v51

    move-object/from16 v85, v52

    move-object/from16 v86, v53

    move-object/from16 v87, v54

    move-object/from16 v88, v55

    move-object/from16 v89, v56

    move-object/from16 v90, v57

    move-object/from16 v91, v58

    move-object/from16 v92, v59

    goto/16 :goto_0

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v62, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    const/16 v94, 0x0

    invoke-direct/range {v62 .. v94}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;-><init>(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v62

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1e
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
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V

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
