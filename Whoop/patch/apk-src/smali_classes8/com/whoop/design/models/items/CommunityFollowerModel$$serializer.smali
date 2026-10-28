.class public final synthetic Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/CommunityFollowerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/CommunityFollowerModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/CommunityFollowerModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/CommunityFollowerModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/CommunityFollowerModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/CommunityFollowerModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "design-models_release"
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.CommunityFollowerModel"

    const/16 v3, 0x15

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "noDataLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatarUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "streak"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "streakImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recoveryScore"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recoveryLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dayStrain"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strainLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepScore"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recoveryColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strainColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "backgroundStyle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatarRingColor"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iconUrls"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "interaction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleInteraction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/CommunityFollowerModel;->access$get$childSerializers$cp()[Ll83/h;

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

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    const/16 v18, 0x11

    aget-object v19, v0, v18

    invoke-interface/range {v19 .. v19}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lwc3/c;

    invoke-static/range {v19 .. v19}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v19

    const/16 v20, 0x12

    aget-object v0, v0, v20

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v21, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-static/range {v21 .. v21}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v22

    invoke-static/range {v21 .. v21}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v21

    move-object/from16 v23, v0

    const/16 v0, 0x15

    new-array v0, v0, [Lwc3/c;

    const/16 v24, 0x0

    aput-object v1, v0, v24

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v4, v0, v1

    const/4 v1, 0x4

    aput-object v5, v0, v1

    const/4 v1, 0x5

    aput-object v6, v0, v1

    const/4 v1, 0x6

    aput-object v7, v0, v1

    const/4 v1, 0x7

    aput-object v8, v0, v1

    const/16 v1, 0x8

    aput-object v9, v0, v1

    const/16 v1, 0x9

    aput-object v10, v0, v1

    const/16 v1, 0xa

    aput-object v11, v0, v1

    const/16 v1, 0xb

    aput-object v12, v0, v1

    const/16 v1, 0xc

    aput-object v13, v0, v1

    const/16 v1, 0xd

    aput-object v14, v0, v1

    const/16 v1, 0xe

    aput-object v15, v0, v1

    const/16 v1, 0xf

    aput-object v16, v0, v1

    const/16 v1, 0x10

    aput-object v17, v0, v1

    aput-object v19, v0, v18

    aput-object v23, v0, v20

    const/16 v1, 0x13

    aput-object v22, v0, v1

    const/16 v1, 0x14

    aput-object v21, v0, v1

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/CommunityFollowerModel;
    .locals 71

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/CommunityFollowerModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v11, 0xa

    const/16 v12, 0x9

    const/4 v13, 0x7

    const/4 v14, 0x6

    const/4 v15, 0x5

    const/4 v4, 0x3

    const/16 v5, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/16 v21, 0x12

    const/16 v22, 0x11

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v6, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v15, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v5, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v11, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    move-object/from16 v25, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v24, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v23, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v9, v25, v22

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v22

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v9, v25, v21

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move-object/from16 v22, v2

    move/from16 v2, v21

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 v16, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    const v9, 0x1fffff

    move-object/from16 v69, v2

    move-object/from16 v49, v3

    move-object/from16 v52, v4

    move-object/from16 v57, v5

    move-object/from16 v53, v6

    move-object/from16 v51, v7

    move-object/from16 v50, v8

    move/from16 v48, v9

    move-object/from16 v59, v11

    move-object/from16 v58, v12

    move-object/from16 v56, v13

    move-object/from16 v55, v14

    move-object/from16 v54, v15

    move-object/from16 v68, v16

    move-object/from16 v65, v17

    move-object/from16 v64, v18

    move-object/from16 v63, v19

    move-object/from16 v62, v20

    move-object/from16 v67, v21

    move-object/from16 v66, v22

    move-object/from16 v61, v23

    move-object/from16 v60, v24

    goto/16 :goto_5

    :cond_0
    move-object/from16 v25, v2

    move/from16 v44, v8

    move v2, v9

    move-object v3, v10

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v36, v15

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    :goto_0
    if-eqz v44, :cond_1

    move-object/from16 v45, v14

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v14, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    move-object/from16 v46, v13

    const/16 v13, 0x14

    invoke-interface {v0, v1, v13, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lcom/whoop/navigation/models/GenericInteraction;

    const/high16 v14, 0x100000

    :goto_1
    or-int/2addr v2, v14

    :goto_2
    move-object/from16 v14, v45

    move-object/from16 v13, v46

    goto :goto_0

    :pswitch_1
    move-object/from16 v46, v13

    const/16 v13, 0x14

    sget-object v14, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    const/16 v13, 0x13

    invoke-interface {v0, v1, v13, v14, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/navigation/models/GenericInteraction;

    const/high16 v14, 0x80000

    goto :goto_1

    :pswitch_2
    move-object/from16 v46, v13

    const/16 v13, 0x13

    const/16 v14, 0x12

    aget-object v16, v25, v14

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v13, v16

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v14, v13, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/navigation/e;

    const/high16 v13, 0x40000

    or-int/2addr v2, v13

    goto :goto_2

    :pswitch_3
    move-object/from16 v46, v13

    const/16 v13, 0x11

    const/16 v14, 0x12

    aget-object v16, v25, v13

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v14, v16

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v13, v14, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/high16 v14, 0x20000

    goto :goto_1

    :pswitch_4
    move-object/from16 v46, v13

    const/16 v13, 0x11

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0x10

    invoke-interface {v0, v1, v13, v14, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/high16 v14, 0x10000

    goto :goto_1

    :pswitch_5
    move-object/from16 v46, v13

    const/16 v13, 0x10

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xf

    invoke-interface {v0, v1, v13, v14, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const v14, 0x8000

    goto :goto_1

    :pswitch_6
    move-object/from16 v46, v13

    const/16 v13, 0xf

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xe

    invoke-interface {v0, v1, v13, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x4000

    goto :goto_2

    :pswitch_7
    move-object/from16 v46, v13

    const/16 v13, 0xe

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xd

    invoke-interface {v0, v1, v13, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x2000

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v46, v13

    const/16 v13, 0xd

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xc

    invoke-interface {v0, v1, v13, v14, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x1000

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v46, v13

    const/16 v13, 0xc

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xb

    invoke-interface {v0, v1, v13, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x800

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v46, v13

    const/16 v13, 0xb

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v13, 0xa

    invoke-interface {v0, v1, v13, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x400

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v46, v13

    const/16 v13, 0xa

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v35, v3

    move-object/from16 v13, v46

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x200

    move-object/from16 v3, v35

    move-object/from16 v14, v45

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v35, v3

    const/16 v3, 0x9

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v34, v4

    move-object/from16 v3, v45

    const/16 v4, 0x8

    invoke-interface {v0, v1, v4, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x100

    :goto_3
    move-object/from16 v4, v34

    move-object/from16 v3, v35

    goto/16 :goto_0

    :pswitch_d
    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v3, v45

    const/16 v4, 0x8

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v33, v3

    move-object/from16 v4, v43

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v14, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v43, v4

    check-cast v43, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x80

    :goto_4
    move-object/from16 v14, v33

    goto :goto_3

    :pswitch_e
    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v3, 0x7

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move/from16 v32, v2

    move-object/from16 v3, v42

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v42, v3

    check-cast v42, Ljava/lang/String;

    or-int/lit8 v3, v32, 0x40

    move v2, v3

    goto :goto_4

    :pswitch_f
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v3, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v2, 0x6

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v31, v3

    move-object/from16 v2, v41

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Ljava/lang/String;

    or-int/lit8 v2, v32, 0x20

    move-object/from16 v42, v31

    goto :goto_4

    :pswitch_10
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v2, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v3, 0x5

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v30, v2

    move-object/from16 v3, v40

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v40, v3

    check-cast v40, Ljava/lang/String;

    or-int/lit8 v3, v32, 0x10

    move v2, v3

    move-object/from16 v41, v30

    goto :goto_4

    :pswitch_11
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v3, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v2, 0x4

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v29, v3

    move-object/from16 v2, v39

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    check-cast v39, Ljava/lang/String;

    or-int/lit8 v2, v32, 0x8

    move-object/from16 v40, v29

    goto/16 :goto_4

    :pswitch_12
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v2, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v3, 0x3

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v3, v38

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v38, v3

    check-cast v38, Ljava/lang/String;

    or-int/lit8 v3, v32, 0x4

    move v2, v3

    move-object/from16 v39, v28

    goto/16 :goto_4

    :pswitch_13
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v3, v38

    move-object/from16 v28, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v2, 0x2

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v2, v37

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/lang/String;

    or-int/lit8 v2, v32, 0x2

    move-object/from16 v38, v27

    goto/16 :goto_4

    :pswitch_14
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v2, v37

    move-object/from16 v27, v38

    move-object/from16 v28, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v3, 0x1

    const/4 v14, 0x0

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit8 v26, v32, 0x1

    move/from16 v2, v26

    goto/16 :goto_4

    :pswitch_15
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v2, v37

    move-object/from16 v27, v38

    move-object/from16 v28, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v33, v45

    const/4 v3, 0x1

    const/4 v14, 0x0

    move/from16 v44, v14

    move/from16 v2, v32

    goto/16 :goto_4

    :cond_1
    move/from16 v32, v2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v14

    move-object/from16 v2, v37

    move-object/from16 v27, v38

    move-object/from16 v28, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v4, v43

    move-object/from16 v50, v2

    move-object/from16 v56, v4

    move-object/from16 v59, v5

    move-object/from16 v68, v6

    move-object/from16 v66, v7

    move-object/from16 v65, v8

    move-object/from16 v64, v9

    move-object/from16 v62, v10

    move-object/from16 v61, v11

    move-object/from16 v60, v12

    move-object/from16 v58, v13

    move-object/from16 v69, v15

    move-object/from16 v51, v27

    move-object/from16 v52, v28

    move-object/from16 v53, v29

    move-object/from16 v54, v30

    move-object/from16 v55, v31

    move/from16 v48, v32

    move-object/from16 v57, v33

    move-object/from16 v67, v34

    move-object/from16 v63, v35

    move-object/from16 v49, v36

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v47, Lcom/whoop/design/models/items/CommunityFollowerModel;

    const/16 v70, 0x0

    invoke-direct/range {v47 .. v70}, Lcom/whoop/design/models/items/CommunityFollowerModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v47

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/CommunityFollowerModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/CommunityFollowerModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/CommunityFollowerModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/CommunityFollowerModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/CommunityFollowerModel;)V

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
