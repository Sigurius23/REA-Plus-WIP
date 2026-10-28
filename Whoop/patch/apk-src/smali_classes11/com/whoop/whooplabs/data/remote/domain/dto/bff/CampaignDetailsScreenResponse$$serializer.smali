.class public final synthetic Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
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

.field public static final INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse"

    const/16 v3, 0x1e

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "campaignId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "page_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "icon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "badge"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "badgeText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "badgeType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "badgeTextSubtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "background_image"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "contentBlocks"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "schedule_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scheduleCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "statusBadgeType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "status_badge"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "statusTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "statusBody"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tasks"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "descriptionCta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sub_description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "alert_title_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "alertDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "full_description_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cta"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "optionsConfig"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "documents"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "documentDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "connectedDeviceDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dataSubmittedCallout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x1e

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x5

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x6

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x7

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x8

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x9

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xa

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xb

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xc

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xd

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xe

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xf

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x10

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x11

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x12

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x13

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x14

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x15

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x16

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x17

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x18

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x19

    aput-object v3, v1, v4

    const/16 v3, 0x1a

    aget-object v0, v0, v3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v3

    const/16 v0, 0x1b

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v0

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x1c

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x1d

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;
    .locals 98

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v8, 0x9

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x3

    const/16 v14, 0x8

    const/4 v13, 0x4

    const/4 v15, 0x2

    const/16 v29, 0x1a

    const/16 v30, 0x11

    const/16 v4, 0xa

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v12, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v11, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    aget-object v34, v2, v4

    invoke-interface/range {v34 .. v34}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v34

    move-object/from16 v35, v2

    move-object/from16 v2, v34

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v4, v2, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v33, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v32, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v31, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v28, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v27, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v26, v35, v30

    invoke-interface/range {v26 .. v26}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v34, v2

    move-object/from16 v2, v26

    check-cast v2, Lwc3/b;

    move/from16 v26, v3

    move/from16 v3, v30

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v25, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v24, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v23, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v22, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v21, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    sget-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;

    move-object/from16 v30, v3

    const/16 v3, 0x19

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    aget-object v3, v35, v29

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v29

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v3, 0x1b

    invoke-interface {v0, v1, v3, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v15, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0x1c

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    sget-object v15, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0x1d

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/InfoCalloutTileModel;

    const v7, 0x3fffffff    # 1.9999999f

    move-object/from16 v96, v2

    move-object/from16 v94, v3

    move-object/from16 v78, v4

    move-object/from16 v68, v5

    move-object/from16 v69, v6

    move/from16 v66, v7

    move-object/from16 v76, v8

    move-object/from16 v74, v9

    move-object/from16 v73, v10

    move-object/from16 v72, v11

    move-object/from16 v70, v12

    move-object/from16 v71, v13

    move-object/from16 v75, v14

    move-object/from16 v95, v16

    move-object/from16 v93, v17

    move-object/from16 v92, v18

    move-object/from16 v91, v19

    move-object/from16 v90, v20

    move-object/from16 v89, v21

    move-object/from16 v88, v22

    move-object/from16 v87, v23

    move-object/from16 v86, v24

    move-object/from16 v84, v25

    move/from16 v67, v26

    move-object/from16 v82, v27

    move-object/from16 v81, v28

    move-object/from16 v85, v30

    move-object/from16 v80, v31

    move-object/from16 v79, v32

    move-object/from16 v77, v33

    move-object/from16 v83, v34

    goto/16 :goto_b

    :cond_0
    move-object/from16 v35, v2

    move/from16 v45, v4

    move/from16 v62, v5

    move/from16 v47, v6

    move/from16 v59, v47

    move-object v2, v7

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v8, v6

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v34, v15

    move-object/from16 v46, v34

    move-object/from16 v48, v46

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

    move-object/from16 v60, v58

    move-object/from16 v61, v60

    :goto_0
    if-eqz v62, :cond_1

    move-object/from16 v63, v6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    move-object/from16 v64, v5

    const/16 v5, 0x1d

    invoke-interface {v0, v1, v5, v6, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/InfoCalloutTileModel;

    const/high16 v6, 0x20000000

    :goto_1
    or-int v6, v59, v6

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v6

    :goto_2
    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    move-object/from16 v5, v64

    :goto_3
    const/4 v2, 0x0

    :goto_4
    const/4 v4, 0x3

    goto/16 :goto_a

    :pswitch_1
    move-object/from16 v64, v5

    const/16 v5, 0x1d

    sget-object v6, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;

    const/16 v5, 0x1c

    invoke-interface {v0, v1, v5, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    const/high16 v6, 0x10000000

    goto :goto_1

    :pswitch_2
    move-object/from16 v64, v5

    const/16 v5, 0x1c

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v5, 0x1b

    invoke-interface {v0, v1, v5, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/high16 v7, 0x8000000

    or-int v7, v59, v7

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v7

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v5, v64

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v7, v6

    move-object/from16 v6, v63

    goto/16 :goto_a

    :pswitch_3
    move-object/from16 v64, v5

    const/16 v5, 0x1b

    const/16 v6, 0x1a

    aget-object v17, v35, v6

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v5, v17

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v6, v5, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/high16 v5, 0x4000000

    or-int v5, v59, v5

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v5

    goto/16 :goto_2

    :pswitch_4
    move-object/from16 v64, v5

    const/16 v6, 0x1a

    sget-object v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;

    const/16 v6, 0x19

    invoke-interface {v0, v1, v6, v5, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    const/high16 v8, 0x2000000

    or-int v8, v59, v8

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v8

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v8, v5

    :goto_5
    move-object/from16 v5, v64

    goto/16 :goto_a

    :pswitch_5
    move-object/from16 v64, v5

    const/16 v6, 0x19

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x18

    invoke-interface {v0, v1, v6, v5, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v14, 0x1000000

    or-int v14, v59, v14

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v14

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v14, v5

    goto :goto_5

    :pswitch_6
    move-object/from16 v64, v5

    const/16 v6, 0x18

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x17

    invoke-interface {v0, v1, v6, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v9, 0x800000

    or-int v9, v59, v9

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v9

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v9, v5

    goto :goto_5

    :pswitch_7
    move-object/from16 v64, v5

    const/16 v6, 0x17

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x16

    invoke-interface {v0, v1, v6, v5, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v10, 0x400000

    or-int v10, v59, v10

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v10

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v10, v5

    goto/16 :goto_5

    :pswitch_8
    move-object/from16 v64, v5

    const/16 v6, 0x16

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x15

    invoke-interface {v0, v1, v6, v5, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v11, 0x200000

    or-int v11, v59, v11

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v11

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v11, v5

    goto/16 :goto_5

    :pswitch_9
    move-object/from16 v64, v5

    const/16 v6, 0x15

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x14

    invoke-interface {v0, v1, v6, v5, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v13, 0x100000

    or-int v13, v59, v13

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v13

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v13, v5

    goto/16 :goto_5

    :pswitch_a
    move-object/from16 v64, v5

    const/16 v6, 0x14

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x13

    invoke-interface {v0, v1, v6, v5, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v12, 0x80000

    or-int v12, v59, v12

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v12

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v12, v5

    goto/16 :goto_5

    :pswitch_b
    move-object/from16 v64, v5

    const/16 v6, 0x13

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x12

    invoke-interface {v0, v1, v6, v5, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v15, 0x40000

    or-int v15, v59, v15

    move-object/from16 v25, v2

    move-object/from16 v31, v4

    move/from16 v27, v15

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object v15, v5

    goto/16 :goto_5

    :pswitch_c
    move-object/from16 v64, v5

    const/16 v5, 0x11

    const/16 v6, 0x12

    aget-object v25, v35, v5

    invoke-interface/range {v25 .. v25}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v6, v25

    check-cast v6, Lwc3/b;

    move-object/from16 v25, v2

    move-object/from16 v2, v64

    invoke-interface {v0, v1, v5, v6, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/high16 v6, 0x20000

    or-int v6, v59, v6

    move-object v5, v2

    move-object/from16 v31, v4

    move/from16 v27, v6

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    move-object/from16 v6, v63

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v25, v2

    move-object v2, v5

    const/16 v5, 0x11

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v26, v2

    move-object/from16 v5, v63

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v6, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v6, 0x10000

    or-int v6, v59, v6

    move-object/from16 v31, v4

    move/from16 v27, v6

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move-object/from16 v28, v61

    const/4 v2, 0x0

    const/4 v4, 0x3

    :goto_6
    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    goto/16 :goto_a

    :pswitch_e
    move-object/from16 v25, v2

    move-object/from16 v26, v5

    move-object/from16 v5, v63

    const/16 v2, 0x10

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v2, v61

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v6, 0x8000

    or-int v6, v59, v6

    move-object/from16 v28, v2

    :goto_7
    move-object/from16 v31, v4

    move-object/from16 v3, v27

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    const/4 v2, 0x0

    const/4 v4, 0x3

    move/from16 v27, v6

    goto :goto_6

    :pswitch_f
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v5

    move-object/from16 v2, v61

    move-object/from16 v5, v63

    const/16 v3, 0xf

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v3, v60

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v6, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move/from16 v6, v59

    or-int/lit16 v6, v6, 0x4000

    move-object/from16 v60, v3

    goto :goto_7

    :pswitch_10
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v5

    move/from16 v6, v59

    move-object/from16 v3, v60

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v31, v4

    move-object/from16 v3, v58

    const/16 v4, 0xd

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v3, v6, 0x2000

    move-object/from16 v4, v27

    move/from16 v27, v3

    move-object v3, v4

    move-object/from16 v32, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    goto/16 :goto_3

    :pswitch_11
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/16 v4, 0xd

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v32, v3

    move-object/from16 v4, v57

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v6, 0x1000

    move-object/from16 v33, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v3, v27

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    :goto_8
    const/4 v2, 0x0

    move/from16 v27, v4

    goto/16 :goto_4

    :pswitch_12
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v4, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/16 v3, 0xc

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v33, v4

    move-object/from16 v3, v56

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v3, v6, 0x800

    move-object/from16 v4, v27

    move/from16 v27, v3

    move-object v3, v4

    move-object/from16 v45, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    goto/16 :goto_3

    :pswitch_13
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/16 v4, 0xb

    aget-object v2, v35, v45

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v4, v45

    move-object/from16 v45, v3

    move v3, v4

    move-object/from16 v4, v55

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit16 v4, v6, 0x400

    move-object/from16 v44, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v3, v27

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    goto/16 :goto_8

    :pswitch_14
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move/from16 v3, v45

    move-object/from16 v4, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v44, v4

    move-object/from16 v3, v54

    const/16 v4, 0x9

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v3, v6, 0x200

    move-object/from16 v4, v27

    move/from16 v27, v3

    move-object v3, v4

    move-object/from16 v43, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    goto/16 :goto_3

    :pswitch_15
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/16 v4, 0x9

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v43, v3

    move-object/from16 v4, v53

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v6, 0x100

    move-object/from16 v42, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v3, v27

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    goto/16 :goto_8

    :pswitch_16
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v4, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/16 v3, 0x8

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v42, v4

    move-object/from16 v3, v52

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v3, v6, 0x80

    move-object/from16 v4, v27

    move/from16 v27, v3

    move-object v3, v4

    move-object/from16 v41, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    goto/16 :goto_3

    :pswitch_17
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v4, 0x7

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v41, v3

    move-object/from16 v4, v51

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v4, v6, 0x40

    move-object/from16 v40, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v3, v27

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    goto/16 :goto_8

    :pswitch_18
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v4, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v3, 0x6

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v40, v4

    move-object/from16 v3, v50

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v3, v6, 0x20

    move-object/from16 v4, v27

    move/from16 v27, v3

    move-object v3, v4

    move-object/from16 v39, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v48

    move-object/from16 v38, v49

    goto/16 :goto_3

    :pswitch_19
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v4, 0x5

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v39, v3

    move-object/from16 v4, v49

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v4, v6, 0x10

    move-object/from16 v38, v2

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v3, v27

    move-object/from16 v26, v48

    goto/16 :goto_8

    :pswitch_1a
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v4, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v3, 0x4

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v38, v4

    move-object/from16 v3, v48

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v3, v6, 0x8

    move-object/from16 v6, v27

    move/from16 v27, v3

    move-object v3, v6

    move-object v6, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v2

    :goto_9
    const/4 v2, 0x0

    goto/16 :goto_a

    :pswitch_1b
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v2, 0x2

    const/4 v4, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v34

    or-int/lit8 v6, v6, 0x4

    move-object/from16 v2, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v27

    move/from16 v27, v6

    move-object v6, v5

    move-object v5, v2

    goto :goto_9

    :pswitch_1c
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v37

    or-int/lit8 v6, v6, 0x2

    move-object/from16 v2, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v27

    move/from16 v27, v6

    move-object v6, v5

    move-object v5, v2

    move-object/from16 v46, v37

    goto :goto_9

    :pswitch_1d
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v36

    or-int/lit8 v6, v6, 0x1

    move-object/from16 v47, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v27

    move/from16 v27, v6

    move-object v6, v5

    move-object/from16 v5, v47

    move/from16 v47, v36

    goto :goto_a

    :pswitch_1e
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object/from16 v3, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v5, v63

    const/4 v2, 0x0

    const/4 v4, 0x3

    move-object/from16 v62, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v27

    move/from16 v27, v6

    move-object v6, v5

    move-object/from16 v5, v62

    move/from16 v62, v2

    :goto_a
    move-object/from16 v2, v25

    move-object/from16 v48, v26

    move/from16 v59, v27

    move-object/from16 v61, v28

    move-object/from16 v4, v31

    move-object/from16 v58, v32

    move-object/from16 v57, v33

    move-object/from16 v49, v38

    move-object/from16 v50, v39

    move-object/from16 v51, v40

    move-object/from16 v52, v41

    move-object/from16 v53, v42

    move-object/from16 v54, v43

    move-object/from16 v55, v44

    move-object/from16 v56, v45

    const/16 v45, 0xa

    goto/16 :goto_0

    :cond_1
    move-object/from16 v25, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v26, v5

    move-object v5, v6

    move-object/from16 v3, v48

    move-object/from16 v38, v49

    move-object/from16 v39, v50

    move-object/from16 v40, v51

    move-object/from16 v41, v52

    move-object/from16 v42, v53

    move-object/from16 v43, v54

    move-object/from16 v44, v55

    move-object/from16 v45, v56

    move-object/from16 v33, v57

    move-object/from16 v32, v58

    move/from16 v6, v59

    move-object/from16 v28, v61

    move-object/from16 v70, v3

    move-object/from16 v83, v5

    move/from16 v66, v6

    move-object/from16 v94, v7

    move-object/from16 v92, v8

    move-object/from16 v90, v9

    move-object/from16 v89, v10

    move-object/from16 v88, v11

    move-object/from16 v86, v12

    move-object/from16 v87, v13

    move-object/from16 v91, v14

    move-object/from16 v85, v15

    move-object/from16 v95, v25

    move-object/from16 v84, v26

    move-object/from16 v96, v27

    move-object/from16 v82, v28

    move-object/from16 v93, v31

    move-object/from16 v80, v32

    move-object/from16 v79, v33

    move-object/from16 v69, v34

    move-object/from16 v71, v38

    move-object/from16 v72, v39

    move-object/from16 v73, v40

    move-object/from16 v74, v41

    move-object/from16 v75, v42

    move-object/from16 v76, v43

    move-object/from16 v77, v44

    move-object/from16 v78, v45

    move-object/from16 v68, v46

    move/from16 v67, v47

    move-object/from16 v81, v60

    :goto_b
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v65, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    const/16 v97, 0x0

    invoke-direct/range {v65 .. v97}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v65

    nop

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
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;)V

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
