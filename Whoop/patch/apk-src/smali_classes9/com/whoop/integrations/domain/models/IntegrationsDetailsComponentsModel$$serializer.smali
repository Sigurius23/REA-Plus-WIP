.class public final synthetic Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "integrations_release"
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

.field public static final INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel"

    const/16 v3, 0x18

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "reportingKey"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iconUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learn_more"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "connected"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "connected_status_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "button_text_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "connectionUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnect_popup_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnect_popup_description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnect_popup_primary_button_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnect_popup_secondary_button_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shouldPerformFullOauth"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "providerId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "upsellCtaTile"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "overridePrimaryButton"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "designItems"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "footerDisclaimer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "lastUpdated"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "descriptionFootnote"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "privacyControls"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    const/16 v13, 0x12

    aget-object v14, v0, v13

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/c;

    invoke-static {v14}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    const/16 v15, 0x13

    aget-object v16, v0, v15

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lwc3/c;

    invoke-static/range {v16 .. v16}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    const/16 v17, 0x14

    aget-object v0, v0, v17

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v18

    sget-object v19, Lcom/whoop/design/models/MarkdownTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MarkdownTextModel$$serializer;

    invoke-static/range {v19 .. v19}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v19

    sget-object v20, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;

    invoke-static/range {v20 .. v20}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v20

    move/from16 v21, v13

    const/16 v13, 0x18

    new-array v13, v13, [Lwc3/c;

    const/16 v22, 0x0

    aput-object v1, v13, v22

    const/16 v22, 0x1

    aput-object v1, v13, v22

    const/16 v22, 0x2

    aput-object v1, v13, v22

    const/16 v22, 0x3

    aput-object v1, v13, v22

    const/16 v22, 0x4

    aput-object v1, v13, v22

    const/16 v22, 0x5

    aput-object v1, v13, v22

    const/16 v22, 0x6

    aput-object v2, v13, v22

    const/4 v2, 0x7

    aput-object v3, v13, v2

    const/16 v2, 0x8

    aput-object v4, v13, v2

    const/16 v2, 0x9

    aput-object v1, v13, v2

    const/16 v1, 0xa

    aput-object v5, v13, v1

    const/16 v1, 0xb

    aput-object v6, v13, v1

    const/16 v1, 0xc

    aput-object v7, v13, v1

    const/16 v1, 0xd

    aput-object v8, v13, v1

    const/16 v1, 0xe

    aput-object v9, v13, v1

    const/16 v1, 0xf

    aput-object v10, v13, v1

    const/16 v1, 0x10

    aput-object v11, v13, v1

    const/16 v1, 0x11

    aput-object v12, v13, v1

    aput-object v14, v13, v21

    aput-object v16, v13, v15

    aput-object v0, v13, v17

    const/16 v0, 0x15

    aput-object v18, v13, v0

    const/16 v0, 0x16

    aput-object v19, v13, v0

    const/16 v0, 0x17

    aput-object v20, v13, v0

    return-object v13
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;
    .locals 73

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v13, 0xa

    const/16 v14, 0x9

    const/4 v15, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/16 v23, 0x14

    const/16 v24, 0x13

    const/16 v25, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    sget-object v11, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;

    invoke-interface {v0, v1, v4, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v13, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v28, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v27, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v26, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v22, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v21, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v29, v3

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v19, v2

    sget-object v2, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    move-object/from16 v20, v3

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/CtaTileModel;

    aget-object v3, v28, v25

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v25

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    aget-object v3, v28, v24

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v25, v2

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v3, v28, v23

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v24, v2

    move/from16 v2, v23

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v15, Lcom/whoop/design/models/MarkdownTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MarkdownTextModel$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/MarkdownTextModel;

    sget-object v15, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    const v12, 0xffffff

    move-object/from16 v71, v2

    move-object/from16 v69, v3

    move-object/from16 v54, v4

    move-object/from16 v53, v5

    move-object/from16 v51, v6

    move-object/from16 v56, v7

    move-object/from16 v52, v8

    move-object/from16 v50, v9

    move-object/from16 v49, v10

    move/from16 v55, v11

    move-object/from16 v58, v13

    move-object/from16 v57, v14

    move-object/from16 v70, v16

    move-object/from16 v68, v17

    move-object/from16 v65, v18

    move-object/from16 v63, v19

    move-object/from16 v64, v20

    move-object/from16 v62, v21

    move-object/from16 v61, v22

    move-object/from16 v67, v24

    move-object/from16 v66, v25

    move-object/from16 v60, v26

    move-object/from16 v59, v27

    move-object/from16 v48, v29

    :goto_0
    move/from16 v47, v12

    goto/16 :goto_9

    :cond_0
    move-object/from16 v28, v2

    move/from16 v43, v10

    move/from16 v38, v11

    move-object v2, v12

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v13, v10

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v29, v15

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v39, v34

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move/from16 v12, v38

    move-object/from16 v11, v42

    :goto_1
    if-eqz v43, :cond_1

    move-object/from16 v44, v6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;

    move-object/from16 v45, v8

    const/16 v8, 0x17

    invoke-interface {v0, v1, v8, v6, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    const/high16 v6, 0x800000

    :goto_2
    or-int/2addr v12, v6

    :goto_3
    move-object/from16 v6, v44

    move-object/from16 v8, v45

    goto :goto_1

    :pswitch_1
    move-object/from16 v45, v8

    const/16 v8, 0x17

    sget-object v6, Lcom/whoop/design/models/MarkdownTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MarkdownTextModel$$serializer;

    const/16 v8, 0x16

    invoke-interface {v0, v1, v8, v6, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/design/models/MarkdownTextModel;

    const/high16 v6, 0x400000

    goto :goto_2

    :pswitch_2
    move-object/from16 v45, v8

    const/16 v8, 0x16

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v8, 0x15

    invoke-interface {v0, v1, v8, v6, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ljava/lang/String;

    const/high16 v6, 0x200000

    goto :goto_2

    :pswitch_3
    move-object/from16 v45, v8

    const/16 v6, 0x14

    const/16 v8, 0x15

    aget-object v17, v28, v6

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v6, v8, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    const/high16 v8, 0x100000

    :goto_4
    or-int/2addr v12, v8

    goto :goto_3

    :pswitch_4
    move-object/from16 v45, v8

    const/16 v6, 0x14

    const/16 v8, 0x13

    aget-object v17, v28, v8

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v8, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/high16 v6, 0x80000

    goto :goto_2

    :pswitch_5
    move-object/from16 v45, v8

    const/16 v6, 0x12

    const/16 v8, 0x13

    aget-object v17, v28, v6

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v6, v8, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Lcom/whoop/design/models/DesignSystemModel;

    const/high16 v8, 0x40000

    goto :goto_4

    :pswitch_6
    move-object/from16 v45, v8

    const/16 v6, 0x12

    sget-object v8, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    const/16 v6, 0x11

    invoke-interface {v0, v1, v6, v8, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/design/models/items/CtaTileModel;

    const/high16 v8, 0x20000

    goto :goto_4

    :pswitch_7
    move-object/from16 v45, v8

    const/16 v6, 0x11

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x10

    invoke-interface {v0, v1, v6, v8, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/high16 v8, 0x10000

    goto :goto_4

    :pswitch_8
    move-object/from16 v45, v8

    const/16 v6, 0x10

    sget-object v8, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v6, 0xf

    invoke-interface {v0, v1, v6, v8, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Ljava/lang/Boolean;

    const v8, 0x8000

    goto :goto_4

    :pswitch_9
    move-object/from16 v45, v8

    const/16 v6, 0xf

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xe

    invoke-interface {v0, v1, v6, v8, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x4000

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v45, v8

    const/16 v6, 0xe

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xd

    invoke-interface {v0, v1, v6, v8, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x2000

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v45, v8

    const/16 v6, 0xd

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v26, v2

    move-object/from16 v6, v45

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v8, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x1000

    move-object/from16 v2, v26

    move-object/from16 v6, v44

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v26, v2

    move-object v6, v8

    const/16 v2, 0xc

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v2, v44

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v8, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x800

    move-object v8, v6

    move-object/from16 v3, v27

    move-object v6, v2

    move-object/from16 v2, v26

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object v6, v8

    move-object/from16 v2, v44

    const/16 v3, 0xb

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v37, v2

    move-object/from16 v3, v42

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v8, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v42, v3

    check-cast v42, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x400

    :goto_5
    move-object v8, v6

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    :goto_6
    move-object/from16 v6, v37

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object v6, v8

    move-object/from16 v3, v42

    move-object/from16 v37, v44

    const/16 v2, 0xa

    const/16 v8, 0x9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v34

    or-int/lit16 v12, v12, 0x200

    goto :goto_5

    :pswitch_f
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object v6, v8

    move-object/from16 v3, v42

    move-object/from16 v37, v44

    const/16 v8, 0x9

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v36, v3

    move-object/from16 v8, v41

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v2, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x100

    move-object v8, v6

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    move-object/from16 v42, v36

    goto :goto_6

    :pswitch_10
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object v6, v8

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x7

    const/16 v3, 0x8

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v38

    or-int/lit16 v12, v12, 0x80

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    :goto_7
    move-object v8, v6

    goto :goto_6

    :pswitch_11
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object v6, v8

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/16 v3, 0x8

    sget-object v2, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;

    move-object/from16 v35, v4

    move-object/from16 v3, v40

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v40, v2

    check-cast v40, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    or-int/lit8 v12, v12, 0x40

    :goto_8
    move-object/from16 v2, v26

    move-object/from16 v3, v27

    move-object/from16 v4, v35

    goto :goto_7

    :pswitch_12
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x5

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v33

    or-int/lit8 v12, v12, 0x20

    goto :goto_8

    :pswitch_13
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x4

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v32

    or-int/lit8 v12, v12, 0x10

    goto :goto_8

    :pswitch_14
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x3

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v31

    or-int/lit8 v12, v12, 0x8

    goto :goto_8

    :pswitch_15
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x2

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit8 v12, v12, 0x4

    goto :goto_8

    :pswitch_16
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x1

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v12, v12, 0x2

    goto :goto_8

    :pswitch_17
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x0

    const/4 v4, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v39

    or-int/lit8 v12, v12, 0x1

    goto/16 :goto_8

    :pswitch_18
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v37, v44

    const/4 v2, 0x0

    const/4 v4, 0x6

    move/from16 v43, v2

    goto/16 :goto_8

    :cond_1
    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v35, v4

    move-object/from16 v37, v6

    move-object v6, v8

    move-object/from16 v3, v40

    move-object/from16 v8, v41

    move-object/from16 v36, v42

    move-object/from16 v54, v3

    move-object/from16 v61, v5

    move-object/from16 v60, v6

    move-object/from16 v64, v7

    move-object/from16 v56, v8

    move-object/from16 v71, v9

    move-object/from16 v70, v10

    move-object/from16 v69, v11

    move-object/from16 v66, v13

    move-object/from16 v65, v14

    move-object/from16 v63, v15

    move-object/from16 v67, v26

    move-object/from16 v68, v27

    move-object/from16 v49, v29

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v52, v32

    move-object/from16 v53, v33

    move-object/from16 v57, v34

    move-object/from16 v62, v35

    move-object/from16 v58, v36

    move-object/from16 v59, v37

    move/from16 v55, v38

    move-object/from16 v48, v39

    goto/16 :goto_0

    :goto_9
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v46, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    const/16 v72, 0x0

    invoke-direct/range {v46 .. v72}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v46

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->write$Self$integrations_release(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;)V

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
