.class public final synthetic Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "community-everyday-stats_release"
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

.field public static final INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "progressSegmentCount"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activeSegmentIndex"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "nextAction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backAction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "photoRevealFraction"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "items"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "headerOverlayItems"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "footerOverlayItems"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "achievementBackgroundStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "colors"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "securityPolicy"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "borderStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xe

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v4, 0x2

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v4, 0x4

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v4

    const/4 v3, 0x5

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    const/4 v2, 0x6

    sget-object v3, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x8

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x9

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;
    .locals 45

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0xa

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/16 v13, 0x9

    const/4 v14, 0x7

    const/16 v15, 0x8

    const/16 p1, 0xd

    const/4 v12, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v4

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v11

    sget-object v12, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-interface {v0, v1, v9, v12, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {v0, v1, v10, v12, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/navigation/models/GenericInteraction;

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v12, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v7

    aget-object v12, v2, v14

    invoke-interface {v12}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v14, v12, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    aget-object v14, v2, v15

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v15, v14, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    aget-object v15, v2, v13

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v13, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    invoke-interface {v0, v1, v6, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/AchievementsBackgroundStyle;

    sget-object v15, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/colortheme/ColorThemeModel;

    sget-object v15, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    aget-object v15, v18, p1

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v2

    move/from16 v2, p1

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxq0/a;

    const/16 v5, 0x3fff

    move-object/from16 v43, v2

    move/from16 v31, v4

    move-object/from16 v40, v6

    move/from16 v36, v7

    move-object/from16 v35, v8

    move-object/from16 v33, v9

    move-object/from16 v34, v10

    move/from16 v32, v11

    move-object/from16 v37, v12

    move-object/from16 v39, v13

    move-object/from16 v38, v14

    move-object/from16 v42, v16

    move-object/from16 v41, v17

    :goto_0
    move-object/from16 v30, v3

    move/from16 v29, v5

    goto/16 :goto_8

    :cond_0
    move-object/from16 v18, v2

    const/4 v2, 0x0

    move/from16 v24, v2

    move v2, v4

    move/from16 v25, v2

    move-object v3, v5

    move-object v7, v3

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move/from16 v26, v12

    move/from16 v23, v13

    move/from16 v21, v14

    move/from16 v22, v15

    move/from16 v5, v25

    move-object v4, v11

    move-object v12, v4

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v26, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v6, 0xd

    aget-object v27, v18, v6

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move/from16 p1, v2

    move-object/from16 v2, v27

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v6, v2, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lxq0/a;

    or-int/lit16 v5, v5, 0x2000

    :goto_2
    move/from16 v2, p1

    const/16 v6, 0xa

    goto :goto_1

    :pswitch_1
    move/from16 p1, v2

    const/16 v6, 0xd

    sget-object v2, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;

    const/16 v6, 0xc

    invoke-interface {v0, v1, v6, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    or-int/lit16 v5, v5, 0x1000

    goto :goto_2

    :pswitch_2
    move/from16 p1, v2

    const/16 v6, 0xc

    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/whoop/design/models/colortheme/ColorThemeModel;

    or-int/lit16 v5, v5, 0x800

    goto :goto_2

    :pswitch_3
    move/from16 p1, v2

    const/16 v6, 0xb

    sget-object v2, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    const/16 v6, 0xa

    invoke-interface {v0, v1, v6, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/design/models/AchievementsBackgroundStyle;

    or-int/lit16 v5, v5, 0x400

    move/from16 v2, p1

    goto :goto_1

    :pswitch_4
    move/from16 p1, v2

    const/16 v6, 0xa

    aget-object v2, v18, v23

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v6, v23

    invoke-interface {v0, v1, v6, v2, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/List;

    or-int/lit16 v5, v5, 0x200

    goto :goto_2

    :pswitch_5
    move/from16 p1, v2

    move/from16 v6, v23

    aget-object v2, v18, v22

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v6, v22

    invoke-interface {v0, v1, v6, v2, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/List;

    or-int/lit16 v5, v5, 0x100

    move/from16 v2, p1

    const/16 v6, 0xa

    :goto_3
    const/16 v23, 0x9

    goto/16 :goto_1

    :pswitch_6
    move/from16 p1, v2

    move/from16 v6, v22

    aget-object v2, v18, v21

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v6, v21

    invoke-interface {v0, v1, v6, v2, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/List;

    or-int/lit16 v5, v5, 0x80

    :goto_4
    move/from16 v2, p1

    const/16 v6, 0xa

    :goto_5
    const/16 v22, 0x8

    goto :goto_3

    :pswitch_7
    move/from16 p1, v2

    move/from16 v6, v21

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v24

    or-int/lit8 v5, v5, 0x40

    goto :goto_4

    :pswitch_8
    move/from16 p1, v2

    move/from16 v6, v21

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x5

    invoke-interface {v0, v1, v6, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x20

    :goto_6
    move/from16 v2, p1

    :goto_7
    const/16 v6, 0xa

    const/16 v21, 0x7

    goto :goto_5

    :pswitch_9
    move/from16 p1, v2

    const/4 v6, 0x5

    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/whoop/navigation/models/GenericInteraction;

    or-int/lit8 v5, v5, 0x10

    goto :goto_6

    :pswitch_a
    move/from16 p1, v2

    const/4 v6, 0x4

    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/navigation/models/GenericInteraction;

    or-int/lit8 v5, v5, 0x8

    goto :goto_6

    :pswitch_b
    move/from16 p1, v2

    const/4 v2, 0x2

    const/4 v6, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v25

    or-int/lit8 v5, v5, 0x4

    goto :goto_6

    :pswitch_c
    const/4 v2, 0x1

    const/4 v6, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v20

    or-int/lit8 v5, v5, 0x2

    move/from16 v2, v20

    goto :goto_7

    :pswitch_d
    move/from16 p1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v6, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v5, v5, 0x1

    move/from16 v2, p1

    move-object/from16 v3, v19

    goto :goto_7

    :pswitch_e
    move/from16 p1, v2

    const/16 v19, 0x0

    move/from16 v26, v19

    goto :goto_7

    :cond_1
    move/from16 p1, v2

    move/from16 v31, p1

    move-object/from16 v33, v4

    move-object/from16 v40, v7

    move-object/from16 v39, v8

    move-object/from16 v37, v9

    move-object/from16 v38, v10

    move-object/from16 v35, v11

    move-object/from16 v34, v12

    move-object/from16 v43, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move/from16 v36, v24

    move/from16 v32, v25

    goto/16 :goto_0

    :goto_8
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v28, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    const/16 v44, 0x0

    invoke-direct/range {v28 .. v44}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;-><init>(ILjava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v28

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
    invoke-virtual {p0, p1}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->write$Self$community_everyday_stats_release(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)V

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
