.class public final synthetic Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/FeatureCommunityDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/domain/model/teams/FeatureCommunityDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/domain/model/teams/FeatureCommunityDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
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
.field public static final INSTANCE:Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.domain.model.teams.FeatureCommunityDto"

    const/16 v3, 0xe

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

    const-string v0, "invite_code"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xb

    aget-object v0, v0, v5

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v6, Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    sget-object v7, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    const/16 v8, 0xe

    new-array v8, v8, [Lwc3/c;

    sget-object v9, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v10, 0x0

    aput-object v9, v8, v10

    sget-object v10, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v11, 0x1

    aput-object v10, v8, v11

    const/4 v11, 0x2

    aput-object v1, v8, v11

    const/4 v1, 0x3

    aput-object v9, v8, v1

    const/4 v1, 0x4

    aput-object v10, v8, v1

    const/4 v1, 0x5

    aput-object v10, v8, v1

    const/4 v1, 0x6

    aput-object v10, v8, v1

    const/4 v1, 0x7

    aput-object v2, v8, v1

    const/16 v1, 0x8

    aput-object v3, v8, v1

    const/16 v1, 0x9

    aput-object v4, v8, v1

    const/16 v1, 0xa

    aput-object v10, v8, v1

    aput-object v0, v8, v5

    const/16 v0, 0xc

    aput-object v6, v8, v0

    const/16 v0, 0xd

    aput-object v7, v8, v0

    return-object v8
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0xa

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x3

    const/16 v12, 0x8

    const/4 v13, 0x4

    const/4 v14, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v17, 0xb

    const/4 v15, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v4

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v11

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v9

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    aget-object v2, v2, v17

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v14, v17

    invoke-interface {v0, v1, v14, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/TeamType;

    sget-object v14, Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/InviteCodeDto;

    sget-object v14, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/MetaDataDto;

    const/16 v14, 0x3fff

    move-object/from16 v42, v2

    move/from16 v30, v4

    move-object/from16 v31, v5

    move/from16 v39, v6

    move-object/from16 v38, v7

    move-object/from16 v36, v8

    move/from16 v35, v9

    move/from16 v34, v10

    move/from16 v32, v11

    move-object/from16 v37, v12

    move/from16 v33, v13

    move/from16 v28, v14

    move-object/from16 v41, v16

    move-object/from16 v40, v17

    :goto_0
    move/from16 v29, v3

    goto/16 :goto_7

    :cond_0
    move/from16 v26, v4

    move v3, v5

    move/from16 v18, v3

    move/from16 v19, v18

    move/from16 v20, v19

    move/from16 v21, v20

    move/from16 v22, v21

    move-object v4, v15

    move-object v9, v4

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object/from16 v24, v14

    move/from16 v15, v22

    :goto_1
    if-eqz v26, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;

    const/16 v12, 0xd

    invoke-interface {v0, v1, v12, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/domain/model/teams/MetaDataDto;

    or-int/lit16 v5, v5, 0x2000

    :goto_2
    const/4 v8, 0x7

    :goto_3
    const/16 v12, 0x8

    goto :goto_1

    :pswitch_1
    const/16 v12, 0xd

    sget-object v8, Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;

    const/16 v12, 0xc

    invoke-interface {v0, v1, v12, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/domain/model/teams/InviteCodeDto;

    or-int/lit16 v5, v5, 0x1000

    goto :goto_2

    :pswitch_2
    const/16 v8, 0xb

    const/16 v12, 0xc

    aget-object v16, v2, v8

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v12, v16

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v8, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/domain/model/teams/TeamType;

    or-int/lit16 v5, v5, 0x800

    goto :goto_2

    :pswitch_3
    const/16 v8, 0xb

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v18

    or-int/lit16 v5, v5, 0x400

    goto :goto_2

    :pswitch_4
    const/16 v8, 0xb

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v12, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x200

    goto :goto_2

    :pswitch_5
    const/16 v8, 0xb

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x8

    invoke-interface {v0, v1, v6, v12, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x100

    move v12, v6

    const/16 v6, 0xa

    :goto_4
    const/4 v8, 0x7

    goto :goto_1

    :pswitch_6
    move v6, v12

    const/16 v8, 0xb

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x7

    invoke-interface {v0, v1, v6, v12, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x80

    :goto_5
    move v8, v6

    const/16 v6, 0xa

    goto :goto_3

    :pswitch_7
    const/4 v6, 0x7

    const/16 v8, 0xb

    const/4 v12, 0x6

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v19

    or-int/lit8 v5, v5, 0x40

    goto :goto_5

    :pswitch_8
    const/4 v6, 0x5

    const/16 v8, 0xb

    const/4 v12, 0x6

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v20

    or-int/lit8 v5, v5, 0x20

    :goto_6
    const/16 v6, 0xa

    goto :goto_2

    :pswitch_9
    const/4 v6, 0x4

    const/16 v8, 0xb

    const/4 v12, 0x6

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v22

    or-int/lit8 v5, v5, 0x10

    goto :goto_6

    :pswitch_a
    const/4 v6, 0x3

    const/16 v8, 0xb

    const/4 v12, 0x6

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v21

    or-int/lit8 v5, v5, 0x8

    goto :goto_6

    :pswitch_b
    const/4 v6, 0x2

    const/16 v8, 0xb

    const/4 v12, 0x6

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v5, v5, 0x4

    goto :goto_6

    :pswitch_c
    const/4 v6, 0x2

    const/16 v8, 0xb

    const/4 v12, 0x6

    const/4 v15, 0x1

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v25

    or-int/lit8 v5, v5, 0x2

    move/from16 v15, v25

    goto :goto_6

    :pswitch_d
    const/4 v3, 0x0

    const/4 v6, 0x2

    const/16 v8, 0xb

    const/4 v12, 0x6

    const/16 v25, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit8 v5, v5, 0x1

    move/from16 v3, v23

    goto :goto_6

    :pswitch_e
    const/16 v8, 0xb

    const/16 v23, 0x0

    const/16 v25, 0x1

    move/from16 v26, v23

    goto :goto_4

    :cond_1
    move-object/from16 v36, v4

    move/from16 v28, v5

    move-object/from16 v42, v9

    move-object/from16 v41, v10

    move-object/from16 v38, v11

    move-object/from16 v40, v13

    move-object/from16 v37, v14

    move/from16 v30, v15

    move/from16 v39, v18

    move/from16 v35, v19

    move/from16 v34, v20

    move/from16 v32, v21

    move/from16 v33, v22

    move-object/from16 v31, v24

    goto/16 :goto_0

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v27, Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    const/16 v43, 0x0

    invoke-direct/range {v27 .. v43}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;-><init>(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v27

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
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/domain/model/teams/FeatureCommunityDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->write$Self$core_release(Lcom/whoop/domain/model/teams/FeatureCommunityDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/domain/model/teams/FeatureCommunityDto;)V

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
