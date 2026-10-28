.class public final synthetic Lcom/whoop/domain/model/teams/CommunityDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/CommunityDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/domain/model/teams/CommunityDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/domain/model/teams/CommunityDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/domain/model/teams/CommunityDto;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "core_release"
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
.field public static final INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.domain.model.teams.CommunityDto"

    const/16 v3, 0x11

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deleted"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "ownerId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shareStrain"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shareRecovery"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shareSleep"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "about"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "banner"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatar"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "private"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "teamType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "user_rank"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unreadCount"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "chatEnabled"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "chatChannels"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/domain/model/teams/CommunityDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    const/16 v6, 0xb

    aget-object v7, v0, v6

    invoke-interface {v7}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwc3/c;

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    sget-object v8, Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;

    invoke-static {v8}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    const/16 v11, 0x10

    aget-object v0, v0, v11

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v12, 0x11

    new-array v12, v12, [Lwc3/c;

    const/4 v13, 0x0

    aput-object v1, v12, v13

    sget-object v13, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v14, 0x1

    aput-object v13, v12, v14

    const/4 v14, 0x2

    aput-object v2, v12, v14

    const/4 v2, 0x3

    aput-object v1, v12, v2

    const/4 v1, 0x4

    aput-object v13, v12, v1

    const/4 v1, 0x5

    aput-object v13, v12, v1

    const/4 v1, 0x6

    aput-object v13, v12, v1

    const/4 v1, 0x7

    aput-object v3, v12, v1

    const/16 v1, 0x8

    aput-object v4, v12, v1

    const/16 v1, 0x9

    aput-object v5, v12, v1

    const/16 v1, 0xa

    aput-object v13, v12, v1

    aput-object v7, v12, v6

    const/16 v1, 0xc

    aput-object v8, v12, v1

    const/16 v1, 0xd

    aput-object v9, v12, v1

    const/16 v1, 0xe

    aput-object v10, v12, v1

    const/16 v1, 0xf

    aput-object v13, v12, v1

    aput-object v0, v12, v11

    return-object v12
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 52

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/domain/model/teams/CommunityDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/16 v18, 0x10

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/16 v20, 0xb

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v13

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v8

    aget-object v15, v2, v20

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v21, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/TeamType;

    sget-object v15, Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;

    move-object/from16 v20, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    move-object/from16 v19, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    move-object/from16 v17, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v15

    aget-object v16, v21, v18

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v2

    move-object/from16 v2, v16

    check-cast v2, Lwc3/b;

    move/from16 v16, v7

    move/from16 v7, v18

    invoke-interface {v0, v1, v7, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const v5, 0x1ffff

    move-object/from16 v48, p1

    move-object/from16 v50, v2

    move-object/from16 v36, v4

    move/from16 v35, v6

    move/from16 v44, v8

    move-object/from16 v43, v9

    move-object/from16 v41, v10

    move/from16 v40, v11

    move/from16 v39, v12

    move/from16 v38, v13

    move-object/from16 v42, v14

    move/from16 v49, v15

    move/from16 v37, v16

    move-object/from16 v47, v17

    move-object/from16 v46, v19

    move-object/from16 v45, v20

    :goto_0
    move/from16 v34, v3

    move/from16 v33, v5

    goto/16 :goto_4

    :cond_0
    move-object/from16 v21, v2

    move v2, v7

    move/from16 v7, v18

    move v3, v2

    move/from16 v23, v3

    move/from16 v24, v23

    move/from16 v25, v24

    move/from16 v26, v25

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v29, v28

    move-object v4, v5

    move-object v10, v4

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v18, v15

    move/from16 v30, v6

    move/from16 v5, v29

    move-object/from16 v2, v18

    move-object v6, v2

    :goto_1
    if-eqz v30, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v14, v21, v7

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v7, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    const/high16 v14, 0x10000

    or-int/2addr v5, v14

    :goto_2
    const/16 v14, 0x8

    goto :goto_1

    :pswitch_1
    const/16 v14, 0xf

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v29

    const v31, 0x8000

    or-int v5, v5, v31

    goto :goto_2

    :pswitch_2
    const/16 v14, 0xf

    sget-object v7, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v14, 0xe

    invoke-interface {v0, v1, v14, v7, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ljava/lang/Integer;

    or-int/lit16 v5, v5, 0x4000

    :goto_3
    const/16 v7, 0x10

    goto :goto_2

    :pswitch_3
    const/16 v14, 0xe

    sget-object v7, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v14, 0xd

    invoke-interface {v0, v1, v14, v7, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ljava/lang/Integer;

    or-int/lit16 v5, v5, 0x2000

    goto :goto_3

    :pswitch_4
    const/16 v14, 0xd

    sget-object v7, Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14, v7, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    or-int/lit16 v5, v5, 0x1000

    goto :goto_3

    :pswitch_5
    const/16 v7, 0xb

    const/16 v14, 0xc

    aget-object v19, v21, v7

    invoke-interface/range {v19 .. v19}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v14, v19

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v7, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/domain/model/teams/TeamType;

    or-int/lit16 v5, v5, 0x800

    goto :goto_3

    :pswitch_6
    const/16 v7, 0xb

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v25

    or-int/lit16 v5, v5, 0x400

    goto :goto_3

    :pswitch_7
    const/16 v7, 0xb

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v9, v14, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x200

    goto :goto_3

    :pswitch_8
    const/16 v7, 0xb

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0x8

    invoke-interface {v0, v1, v7, v14, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x100

    move v14, v7

    const/16 v7, 0x10

    goto/16 :goto_1

    :pswitch_9
    const/16 v7, 0x8

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x80

    goto :goto_3

    :pswitch_a
    const/4 v7, 0x7

    const/4 v14, 0x6

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v26

    or-int/lit8 v5, v5, 0x40

    goto :goto_3

    :pswitch_b
    const/4 v7, 0x5

    const/4 v14, 0x6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v27

    or-int/lit8 v5, v5, 0x20

    goto/16 :goto_3

    :pswitch_c
    const/4 v7, 0x4

    const/4 v14, 0x6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v28

    or-int/lit8 v5, v5, 0x10

    goto/16 :goto_3

    :pswitch_d
    const/4 v7, 0x3

    const/4 v14, 0x6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v24

    or-int/lit8 v5, v5, 0x8

    goto/16 :goto_3

    :pswitch_e
    const/4 v7, 0x2

    const/4 v14, 0x6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v5, v5, 0x4

    goto/16 :goto_3

    :pswitch_f
    const/4 v7, 0x1

    const/4 v14, 0x6

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v23

    or-int/lit8 v5, v5, 0x2

    goto/16 :goto_3

    :pswitch_10
    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v14, 0x6

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v22

    or-int/lit8 v5, v5, 0x1

    move/from16 v3, v22

    goto/16 :goto_3

    :pswitch_11
    const/16 v22, 0x0

    move/from16 v30, v22

    goto/16 :goto_2

    :cond_1
    move-object/from16 v41, v2

    move-object/from16 v43, v4

    move-object/from16 v42, v6

    move-object/from16 v50, v10

    move-object/from16 v48, v11

    move-object/from16 v47, v12

    move-object/from16 v45, v13

    move-object/from16 v46, v15

    move-object/from16 v36, v18

    move/from16 v35, v23

    move/from16 v37, v24

    move/from16 v44, v25

    move/from16 v40, v26

    move/from16 v39, v27

    move/from16 v38, v28

    move/from16 v49, v29

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v32, Lcom/whoop/domain/model/teams/CommunityDto;

    const/16 v51, 0x0

    invoke-direct/range {v32 .. v51}, Lcom/whoop/domain/model/teams/CommunityDto;-><init>(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v32

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/domain/model/teams/CommunityDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/domain/model/teams/CommunityDto;->write$Self$core_release(Lcom/whoop/domain/model/teams/CommunityDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/domain/model/teams/CommunityDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/domain/model/teams/CommunityDto;)V

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
