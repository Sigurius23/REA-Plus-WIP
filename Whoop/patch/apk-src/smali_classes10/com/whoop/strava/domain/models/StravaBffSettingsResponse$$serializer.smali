.class public final synthetic Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/strava/domain/models/StravaBffSettingsResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "strava_release"
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

.field public static final INSTANCE:Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.strava.domain.models.StravaBffSettingsResponse"

    const/16 v3, 0x1d

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "state"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iconUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "descriptionDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "buttonDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learnMoreDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learnMoreUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learnMoreIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "privacyPolicyDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "privacyPolicyUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "webAuthorizationUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "appAuthorizationUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "statusIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "statusDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticallyImportDisplay"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticallyImportEnabled"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticallyImportDescriptionDisplay"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticPostDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticallyPostEnabled"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectedActivitiesItem"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "automaticallyPostDescriptionDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shareableGraphics"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shareableGraphicDescriptionDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnectBubbleTitleDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnectBubbleDescriptionDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnectBubbleConfirmButtonDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disconnectBubbleCancelButtonDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectableActivitiesList"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

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

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    sget-object v12, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    sget-object v16, Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;

    invoke-static/range {v16 .. v16}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    const/16 v18, 0x16

    aget-object v19, v0, v18

    invoke-interface/range {v19 .. v19}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lwc3/c;

    invoke-static/range {v19 .. v19}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v19

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v20

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v21

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v22

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v23

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v24

    const/16 v25, 0x1c

    aget-object v0, v0, v25

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    move-object/from16 v26, v0

    const/16 v0, 0x1d

    new-array v0, v0, [Lwc3/c;

    const/16 v27, 0x0

    aput-object v1, v0, v27

    const/16 v27, 0x1

    aput-object v1, v0, v27

    const/16 v27, 0x2

    aput-object v1, v0, v27

    const/16 v27, 0x3

    aput-object v1, v0, v27

    const/16 v27, 0x4

    aput-object v1, v0, v27

    const/16 v27, 0x5

    aput-object v1, v0, v27

    const/4 v1, 0x6

    aput-object v2, v0, v1

    const/4 v1, 0x7

    aput-object v3, v0, v1

    const/16 v1, 0x8

    aput-object v4, v0, v1

    const/16 v1, 0x9

    aput-object v5, v0, v1

    const/16 v1, 0xa

    aput-object v6, v0, v1

    const/16 v1, 0xb

    aput-object v7, v0, v1

    const/16 v1, 0xc

    aput-object v8, v0, v1

    const/16 v1, 0xd

    aput-object v9, v0, v1

    const/16 v1, 0xe

    aput-object v10, v0, v1

    const/16 v1, 0xf

    aput-object v11, v0, v1

    const/16 v1, 0x10

    aput-object v13, v0, v1

    const/16 v1, 0x11

    aput-object v14, v0, v1

    const/16 v1, 0x12

    aput-object v15, v0, v1

    const/16 v1, 0x13

    aput-object v12, v0, v1

    const/16 v1, 0x14

    aput-object v16, v0, v1

    const/16 v1, 0x15

    aput-object v17, v0, v1

    aput-object v19, v0, v18

    const/16 v1, 0x17

    aput-object v20, v0, v1

    const/16 v1, 0x18

    aput-object v21, v0, v1

    const/16 v1, 0x19

    aput-object v22, v0, v1

    const/16 v1, 0x1a

    aput-object v23, v0, v1

    const/16 v1, 0x1b

    aput-object v24, v0, v1

    aput-object v26, v0, v25

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;
    .locals 86

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v7, 0xa

    const/16 v8, 0x9

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x3

    const/16 v13, 0x8

    const/4 v14, 0x4

    const/4 v15, 0x2

    const/16 v29, 0x1c

    const/16 v30, 0x16

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v33, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v32, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v31, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v28, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v27, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v26, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v34, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    move-object/from16 v25, v3

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v24, v3

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v23, v3

    const/16 v3, 0x13

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    sget-object v3, Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;

    move-object/from16 v22, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v3, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aget-object v20, v33, v30

    invoke-interface/range {v20 .. v20}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v2

    move-object/from16 v2, v20

    check-cast v2, Lwc3/b;

    move-object/from16 v20, v3

    move/from16 v3, v30

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v3, 0x17

    invoke-interface {v0, v1, v3, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0x1a

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v16, v2

    const/16 v2, 0x1b

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v15, v33, v29

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 p1, v5

    move/from16 v5, v29

    invoke-interface {v0, v1, v5, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const v6, 0x1fffffff

    move-object/from16 v58, p1

    move-object/from16 v83, v2

    move-object/from16 v79, v3

    move-object/from16 v57, v4

    move-object/from16 v84, v5

    move-object/from16 v66, v7

    move-object/from16 v65, v8

    move-object/from16 v63, v9

    move-object/from16 v62, v10

    move-object/from16 v61, v11

    move-object/from16 v59, v12

    move-object/from16 v64, v13

    move-object/from16 v60, v14

    move-object/from16 v82, v16

    move-object/from16 v81, v17

    move-object/from16 v80, v18

    move-object/from16 v78, v19

    move-object/from16 v77, v20

    move-object/from16 v76, v21

    move-object/from16 v75, v22

    move-object/from16 v74, v23

    move-object/from16 v73, v24

    move-object/from16 v72, v25

    move-object/from16 v71, v26

    move-object/from16 v70, v27

    move-object/from16 v69, v28

    move-object/from16 v68, v31

    move-object/from16 v67, v32

    move-object/from16 v56, v34

    :goto_0
    move/from16 v55, v6

    goto/16 :goto_6

    :cond_0
    move-object/from16 v33, v2

    move v2, v5

    move/from16 v5, v29

    move/from16 v52, v4

    move-object v3, v6

    move-object v4, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v29, v15

    move-object/from16 v34, v29

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v40, v37

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

    move v6, v2

    move-object/from16 v2, v51

    :goto_1
    if-eqz v52, :cond_1

    move/from16 v53, v5

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v5, v33, v53

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/b;

    move-object/from16 v54, v2

    move/from16 v2, v53

    invoke-interface {v0, v1, v2, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/high16 v5, 0x10000000

    or-int/2addr v6, v5

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    move-object/from16 v2, v54

    const/4 v4, 0x6

    move-object/from16 v50, v3

    :goto_2
    const/4 v3, 0x0

    goto/16 :goto_5

    :pswitch_1
    move-object/from16 v54, v2

    move/from16 v2, v53

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v2, v50

    move-object/from16 v50, v3

    const/16 v3, 0x1b

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v5, 0x8000000

    or-int/2addr v6, v5

    move-object/from16 v16, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    :goto_3
    move-object/from16 v2, v54

    const/4 v3, 0x0

    const/4 v4, 0x6

    goto/16 :goto_5

    :pswitch_2
    move-object/from16 v54, v2

    move-object/from16 v2, v50

    move-object/from16 v50, v3

    const/16 v3, 0x1b

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v16, v2

    move-object/from16 v3, v49

    const/16 v2, 0x1a

    invoke-interface {v0, v1, v2, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v5, 0x4000000

    or-int/2addr v6, v5

    move-object/from16 v17, v3

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    goto :goto_3

    :pswitch_3
    move-object/from16 v54, v2

    move-object/from16 v16, v50

    const/16 v2, 0x1a

    move-object/from16 v50, v3

    move-object/from16 v3, v49

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v17, v3

    move-object/from16 v2, v48

    const/16 v3, 0x19

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v5, 0x2000000

    or-int/2addr v6, v5

    move-object/from16 v18, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    goto :goto_3

    :pswitch_4
    move-object/from16 v54, v2

    move-object/from16 v2, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    move-object/from16 v50, v3

    const/16 v3, 0x19

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v18, v2

    move-object/from16 v3, v47

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v5, 0x1000000

    or-int/2addr v6, v5

    move-object/from16 v19, v3

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    goto/16 :goto_3

    :pswitch_5
    move-object/from16 v54, v2

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x18

    move-object/from16 v50, v3

    move-object/from16 v3, v47

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v19, v3

    move-object/from16 v2, v46

    const/16 v3, 0x17

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v5, 0x800000

    or-int/2addr v6, v5

    move-object/from16 v30, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    goto/16 :goto_3

    :pswitch_6
    move-object/from16 v54, v2

    move-object/from16 v2, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v5, 0x16

    move-object/from16 v50, v3

    const/16 v3, 0x17

    aget-object v30, v33, v5

    invoke-interface/range {v30 .. v30}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v3, v30

    check-cast v3, Lwc3/b;

    move-object/from16 v30, v2

    move-object/from16 v2, v45

    invoke-interface {v0, v1, v5, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/high16 v3, 0x400000

    or-int/2addr v6, v3

    move-object/from16 v20, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    goto/16 :goto_3

    :pswitch_7
    move-object/from16 v54, v2

    move-object/from16 v2, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v5, 0x16

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v20, v2

    move-object/from16 v5, v44

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v5, 0x200000

    or-int/2addr v6, v5

    move-object/from16 v21, v3

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v54, v2

    move-object/from16 v5, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x15

    move-object/from16 v50, v3

    sget-object v3, Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;

    move-object/from16 v21, v5

    move-object/from16 v2, v43

    const/16 v5, 0x14

    invoke-interface {v0, v1, v5, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    const/high16 v3, 0x100000

    or-int/2addr v6, v3

    move-object/from16 v22, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    goto/16 :goto_3

    :pswitch_9
    move-object/from16 v54, v2

    move-object/from16 v2, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v5, 0x14

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v22, v2

    move-object/from16 v5, v42

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    const/high16 v5, 0x80000

    or-int/2addr v6, v5

    move-object/from16 v23, v3

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v54, v2

    move-object/from16 v5, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x13

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v23, v5

    move-object/from16 v2, v41

    const/16 v5, 0x12

    invoke-interface {v0, v1, v5, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v3, 0x40000

    or-int/2addr v6, v3

    move-object/from16 v24, v2

    move-object/from16 v39, v4

    move-object/from16 v5, v40

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v54, v2

    move-object/from16 v2, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v5, 0x12

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v24, v2

    move-object/from16 v5, v40

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v5, 0x20000

    or-int/2addr v6, v5

    move-object v5, v3

    :goto_4
    move-object/from16 v39, v4

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x11

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    const/high16 v7, 0x10000

    or-int/2addr v6, v7

    move-object v7, v3

    goto :goto_4

    :pswitch_d
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x10

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const v8, 0x8000

    or-int/2addr v6, v8

    move-object v8, v3

    goto :goto_4

    :pswitch_e
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xf

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x4000

    move-object v13, v3

    goto/16 :goto_4

    :pswitch_f
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xe

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x2000

    move-object v9, v3

    goto/16 :goto_4

    :pswitch_10
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xd

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x1000

    move-object v10, v3

    goto/16 :goto_4

    :pswitch_11
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xc

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x800

    move-object v11, v3

    goto/16 :goto_4

    :pswitch_12
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xb

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x400

    move-object v14, v3

    goto/16 :goto_4

    :pswitch_13
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0xa

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x200

    move-object v12, v3

    goto/16 :goto_4

    :pswitch_14
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x9

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x100

    move-object v15, v3

    goto/16 :goto_4

    :pswitch_15
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/16 v2, 0x8

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x80

    move-object/from16 v39, v3

    goto/16 :goto_3

    :pswitch_16
    move-object/from16 v54, v2

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v2, 0x7

    move-object/from16 v50, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v39, v4

    move-object/from16 v2, v54

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x40

    goto/16 :goto_2

    :pswitch_17
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v37

    or-int/lit8 v6, v6, 0x20

    goto/16 :goto_2

    :pswitch_18
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit8 v6, v6, 0x10

    goto/16 :goto_2

    :pswitch_19
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v35

    or-int/lit8 v6, v6, 0x8

    goto/16 :goto_2

    :pswitch_1a
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v34

    or-int/lit8 v6, v6, 0x4

    goto/16 :goto_2

    :pswitch_1b
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v6, v6, 0x2

    goto/16 :goto_2

    :pswitch_1c
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v38

    or-int/lit8 v6, v6, 0x1

    move-object/from16 v51, v38

    goto :goto_5

    :pswitch_1d
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    const/4 v4, 0x6

    move-object/from16 v50, v3

    const/4 v3, 0x0

    move/from16 v52, v3

    :goto_5
    move-object/from16 v40, v5

    move-object/from16 v49, v17

    move-object/from16 v48, v18

    move-object/from16 v47, v19

    move-object/from16 v45, v20

    move-object/from16 v44, v21

    move-object/from16 v43, v22

    move-object/from16 v42, v23

    move-object/from16 v41, v24

    move-object/from16 v46, v30

    move-object/from16 v4, v39

    move-object/from16 v3, v50

    const/16 v5, 0x1c

    move-object/from16 v50, v16

    goto/16 :goto_1

    :cond_1
    move-object/from16 v39, v4

    move-object/from16 v5, v40

    move-object/from16 v24, v41

    move-object/from16 v23, v42

    move-object/from16 v22, v43

    move-object/from16 v21, v44

    move-object/from16 v20, v45

    move-object/from16 v30, v46

    move-object/from16 v19, v47

    move-object/from16 v18, v48

    move-object/from16 v17, v49

    move-object/from16 v16, v50

    move-object/from16 v50, v3

    move-object/from16 v62, v2

    move-object/from16 v73, v5

    move-object/from16 v72, v7

    move-object/from16 v71, v8

    move-object/from16 v69, v9

    move-object/from16 v68, v10

    move-object/from16 v67, v11

    move-object/from16 v65, v12

    move-object/from16 v70, v13

    move-object/from16 v66, v14

    move-object/from16 v64, v15

    move-object/from16 v83, v16

    move-object/from16 v82, v17

    move-object/from16 v81, v18

    move-object/from16 v80, v19

    move-object/from16 v78, v20

    move-object/from16 v77, v21

    move-object/from16 v76, v22

    move-object/from16 v75, v23

    move-object/from16 v74, v24

    move-object/from16 v57, v29

    move-object/from16 v79, v30

    move-object/from16 v58, v34

    move-object/from16 v59, v35

    move-object/from16 v60, v36

    move-object/from16 v61, v37

    move-object/from16 v63, v39

    move-object/from16 v84, v50

    move-object/from16 v56, v51

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v54, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    const/16 v85, 0x0

    invoke-direct/range {v54 .. v85}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v54

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->write$Self$strava_release(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V

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
