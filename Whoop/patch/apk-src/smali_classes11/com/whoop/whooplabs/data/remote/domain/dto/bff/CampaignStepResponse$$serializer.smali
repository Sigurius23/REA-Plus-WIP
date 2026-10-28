.class public final synthetic Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
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

.field public static final INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepResponse"

    const/16 v3, 0x14

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "page_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "page_subtitle_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "content"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "image_alt_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "webview_url"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "webview_title_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "show_timer"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bthrs_step"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mystic_config"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cta_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "inputType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "inputConfig"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "countdown_timer_required"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "countdown_timer_seconds"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bthrs_config"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "surveyProvider"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "surveyFormId"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "surveyVendorMetadata"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    sget-object v10, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    sget-object v13, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    invoke-static {v13}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    const/16 v14, 0xc

    aget-object v15, v0, v14

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/c;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    sget-object v16, Lhx2/a;->a:Lhx2/a;

    invoke-static/range {v16 .. v16}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    sget-object v18, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;

    invoke-static/range {v18 .. v18}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v18

    const/16 v19, 0x11

    aget-object v0, v0, v19

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v20

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v21

    move/from16 v22, v14

    const/16 v14, 0x14

    new-array v14, v14, [Lwc3/c;

    const/16 v23, 0x0

    aput-object v1, v14, v23

    const/4 v1, 0x1

    aput-object v3, v14, v1

    const/4 v1, 0x2

    aput-object v4, v14, v1

    const/4 v1, 0x3

    aput-object v5, v14, v1

    const/4 v1, 0x4

    aput-object v6, v14, v1

    const/4 v1, 0x5

    aput-object v7, v14, v1

    const/4 v1, 0x6

    aput-object v8, v14, v1

    const/4 v1, 0x7

    aput-object v9, v14, v1

    const/16 v1, 0x8

    aput-object v11, v14, v1

    const/16 v1, 0x9

    aput-object v12, v14, v1

    const/16 v1, 0xa

    aput-object v13, v14, v1

    const/16 v1, 0xb

    aput-object v2, v14, v1

    aput-object v15, v14, v22

    const/16 v1, 0xd

    aput-object v16, v14, v1

    const/16 v1, 0xe

    aput-object v10, v14, v1

    const/16 v1, 0xf

    aput-object v17, v14, v1

    const/16 v1, 0x10

    aput-object v18, v14, v1

    aput-object v0, v14, v19

    const/16 v0, 0x12

    aput-object v20, v14, v0

    const/16 v0, 0x13

    aput-object v21, v14, v0

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;
    .locals 65

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v11, 0x9

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x2

    const/16 v20, 0x11

    const/4 v8, 0x1

    const/16 v22, 0xc

    const/4 v7, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v6, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v15, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v10, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v5, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v11, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    sget-object v11, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    move-object/from16 v25, v2

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    const/16 v11, 0xb

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    aget-object v23, v25, v22

    invoke-interface/range {v23 .. v23}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v24, v2

    move-object/from16 v2, v23

    check-cast v2, Lwc3/b;

    move/from16 v23, v3

    move/from16 v3, v22

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    sget-object v3, Lhx2/a;->a:Lhx2/a;

    move-object/from16 v22, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    move-object/from16 v19, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    move/from16 v21, v3

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    sget-object v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    aget-object v3, v25, v20

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v16, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v7, 0xfffff

    move-object/from16 v63, v2

    move-object/from16 v62, v3

    move-object/from16 v48, v4

    move-object/from16 v52, v5

    move-object/from16 v46, v6

    move/from16 v43, v7

    move-object/from16 v45, v8

    move-object/from16 v53, v10

    move-object/from16 v55, v11

    move-object/from16 v51, v12

    move-object/from16 v50, v13

    move-object/from16 v49, v14

    move-object/from16 v47, v15

    move-object/from16 v61, v16

    move-object/from16 v60, v17

    move-object/from16 v59, v18

    move-object/from16 v57, v19

    move/from16 v58, v21

    move-object/from16 v56, v22

    move/from16 v44, v23

    move-object/from16 v54, v24

    goto/16 :goto_7

    :cond_0
    move-object/from16 v25, v2

    move/from16 v33, v7

    move/from16 v34, v33

    move/from16 v39, v8

    move-object v2, v9

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v8, v6

    move-object v10, v8

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v32, v15

    move-object/from16 v35, v32

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move/from16 v9, v34

    move-object/from16 v7, v38

    :goto_0
    if-eqz v39, :cond_1

    move-object/from16 v40, v15

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v15

    packed-switch v15, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v41, v4

    const/16 v4, 0x13

    invoke-interface {v0, v1, v4, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/high16 v15, 0x80000

    :goto_1
    or-int/2addr v9, v15

    :goto_2
    move-object/from16 v15, v40

    move-object/from16 v4, v41

    goto :goto_0

    :pswitch_1
    move-object/from16 v41, v4

    const/16 v4, 0x13

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/high16 v15, 0x40000

    goto :goto_1

    :pswitch_2
    move-object/from16 v41, v4

    const/16 v4, 0x12

    const/16 v15, 0x11

    aget-object v16, v25, v15

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Lwc3/b;

    invoke-interface {v0, v1, v15, v4, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    const/high16 v4, 0x20000

    :goto_3
    or-int/2addr v9, v4

    goto :goto_2

    :pswitch_3
    move-object/from16 v41, v4

    const/16 v15, 0x11

    sget-object v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;

    const/16 v15, 0x10

    invoke-interface {v0, v1, v15, v4, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    const/high16 v4, 0x10000

    goto :goto_3

    :pswitch_4
    move-object/from16 v41, v4

    const/16 v15, 0x10

    sget-object v4, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15, v4, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const v4, 0x8000

    goto :goto_3

    :pswitch_5
    move-object/from16 v41, v4

    const/16 v4, 0xe

    const/16 v15, 0xf

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v33

    or-int/lit16 v9, v9, 0x4000

    goto :goto_2

    :pswitch_6
    move-object/from16 v41, v4

    const/16 v15, 0xf

    sget-object v4, Lhx2/a;->a:Lhx2/a;

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    or-int/lit16 v9, v9, 0x2000

    goto :goto_2

    :pswitch_7
    move-object/from16 v41, v4

    const/16 v4, 0xc

    const/16 v15, 0xd

    aget-object v21, v25, v4

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v15, v21

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    or-int/lit16 v9, v9, 0x1000

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v41, v4

    const/16 v4, 0xc

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v32

    or-int/lit16 v9, v9, 0x800

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v41, v4

    const/16 v15, 0xb

    sget-object v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v4, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    or-int/lit16 v9, v9, 0x400

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v41, v4

    const/16 v15, 0xa

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v15, 0x9

    invoke-interface {v0, v1, v15, v4, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit16 v9, v9, 0x200

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v41, v4

    const/16 v15, 0x9

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v15, 0x8

    invoke-interface {v0, v1, v15, v4, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/lang/Boolean;

    or-int/lit16 v9, v9, 0x100

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v41, v4

    const/16 v15, 0x8

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v15, 0x7

    invoke-interface {v0, v1, v15, v4, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v9, v9, 0x80

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v41, v4

    const/4 v15, 0x7

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v31, v2

    move-object/from16 v15, v41

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v4, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x40

    move-object/from16 v2, v31

    move-object/from16 v15, v40

    goto/16 :goto_0

    :pswitch_e
    move-object/from16 v31, v2

    move-object v15, v4

    const/4 v2, 0x6

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v30, v3

    move-object/from16 v2, v40

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x20

    move-object v4, v15

    move-object/from16 v3, v30

    move-object v15, v2

    :goto_4
    move-object/from16 v2, v31

    goto/16 :goto_0

    :pswitch_f
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v2, v40

    const/4 v3, 0x5

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v29, v2

    move-object/from16 v3, v38

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v4, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v38, v3

    check-cast v38, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x10

    :goto_5
    move-object v4, v15

    :goto_6
    move-object/from16 v15, v29

    move-object/from16 v3, v30

    goto :goto_4

    :pswitch_10
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v3, v38

    move-object/from16 v29, v40

    const/4 v2, 0x4

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v3

    move-object/from16 v2, v37

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x8

    move-object v4, v15

    move-object/from16 v38, v28

    goto :goto_6

    :pswitch_11
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v2, v37

    move-object/from16 v28, v38

    move-object/from16 v29, v40

    const/4 v3, 0x3

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v2

    move-object/from16 v3, v36

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2, v4, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v36, v3

    check-cast v36, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x4

    move-object v4, v15

    move-object/from16 v37, v27

    goto :goto_6

    :pswitch_12
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v3, v36

    move-object/from16 v27, v37

    move-object/from16 v28, v38

    move-object/from16 v29, v40

    const/4 v2, 0x2

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v26, v3

    move-object/from16 v2, v35

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x2

    move-object v4, v15

    move-object/from16 v36, v26

    goto :goto_6

    :pswitch_13
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v2, v35

    move-object/from16 v26, v36

    move-object/from16 v27, v37

    move-object/from16 v28, v38

    move-object/from16 v29, v40

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v34

    or-int/lit8 v9, v9, 0x1

    goto/16 :goto_5

    :pswitch_14
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object v15, v4

    move-object/from16 v2, v35

    move-object/from16 v26, v36

    move-object/from16 v27, v37

    move-object/from16 v28, v38

    move-object/from16 v29, v40

    const/4 v3, 0x1

    const/4 v4, 0x0

    move/from16 v39, v4

    goto/16 :goto_5

    :cond_1
    move-object/from16 v31, v2

    move-object/from16 v30, v3

    move-object/from16 v29, v15

    move-object/from16 v2, v35

    move-object/from16 v26, v36

    move-object/from16 v27, v37

    move-object/from16 v28, v38

    move-object v15, v4

    move-object/from16 v45, v2

    move-object/from16 v54, v5

    move-object/from16 v63, v6

    move-object/from16 v61, v7

    move-object/from16 v62, v8

    move/from16 v43, v9

    move-object/from16 v60, v10

    move-object/from16 v56, v11

    move-object/from16 v53, v12

    move-object/from16 v52, v13

    move-object/from16 v51, v14

    move-object/from16 v50, v15

    move-object/from16 v46, v26

    move-object/from16 v47, v27

    move-object/from16 v48, v28

    move-object/from16 v49, v29

    move-object/from16 v59, v30

    move-object/from16 v57, v31

    move-object/from16 v55, v32

    move/from16 v58, v33

    move/from16 v44, v34

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v42, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    const/16 v64, 0x0

    invoke-direct/range {v42 .. v64}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v42

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)V

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
