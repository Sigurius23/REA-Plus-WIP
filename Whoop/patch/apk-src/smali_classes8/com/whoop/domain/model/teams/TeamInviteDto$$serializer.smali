.class public final synthetic Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/TeamInviteDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/domain/model/teams/TeamInviteDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/domain/model/teams/TeamInviteDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/domain/model/teams/TeamInviteDto;",
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
.field public static final INSTANCE:Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.domain.model.teams.TeamInviteDto"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "status"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deleted"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "communityId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "senderId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recipientId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "community"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sender"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "community_invite_code"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "showBadge"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v1, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xa

    new-array v4, v4, [Lwc3/c;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v6, 0x1

    aput-object v0, v4, v6

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v6, 0x2

    aput-object v0, v4, v6

    const/4 v6, 0x3

    aput-object v5, v4, v6

    const/4 v6, 0x4

    aput-object v5, v4, v6

    const/4 v6, 0x5

    aput-object v5, v4, v6

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v1, 0x7

    aput-object v2, v4, v1

    const/16 v1, 0x8

    aput-object v3, v4, v1

    const/16 v1, 0x9

    aput-object v0, v4, v1

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/TeamInviteDto;
    .locals 35

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v3, 0x9

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v10

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    sget-object v12, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    invoke-interface {v0, v1, v5, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/domain/model/teams/CommunityDto;

    sget-object v12, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;

    invoke-interface {v0, v1, v4, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/domain/model/teams/CommunityMemberDto;

    sget-object v12, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    const/16 v12, 0x3ff

    move/from16 v33, v3

    move-object/from16 v31, v4

    move-object/from16 v30, v5

    move/from16 v29, v6

    move/from16 v27, v7

    move-object/from16 v32, v8

    move/from16 v28, v9

    move/from16 v26, v10

    move-object/from16 v25, v11

    :goto_0
    move/from16 v24, v2

    move/from16 v23, v12

    goto/16 :goto_4

    :cond_0
    move/from16 v21, v11

    move v2, v12

    move v14, v2

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    move-object v7, v13

    move-object v10, v7

    move-object v11, v10

    move-object/from16 v18, v11

    move/from16 v13, v17

    :goto_1
    if-eqz v21, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v13

    or-int/lit16 v12, v12, 0x200

    :goto_2
    const/4 v9, 0x4

    goto :goto_1

    :pswitch_1
    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v9, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x100

    goto :goto_2

    :pswitch_2
    sget-object v9, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;

    invoke-interface {v0, v1, v4, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/whoop/domain/model/teams/CommunityMemberDto;

    or-int/lit16 v12, v12, 0x80

    goto :goto_2

    :pswitch_3
    sget-object v9, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    invoke-interface {v0, v1, v5, v9, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcom/whoop/domain/model/teams/CommunityDto;

    or-int/lit8 v12, v12, 0x40

    goto :goto_2

    :pswitch_4
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v14

    or-int/lit8 v12, v12, 0x20

    goto :goto_2

    :pswitch_5
    const/4 v9, 0x4

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v16

    or-int/lit8 v12, v12, 0x10

    goto :goto_1

    :pswitch_6
    const/4 v9, 0x4

    const/4 v15, 0x3

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v20

    or-int/lit8 v12, v12, 0x8

    move/from16 v15, v20

    goto :goto_1

    :pswitch_7
    const/4 v3, 0x2

    const/4 v9, 0x4

    const/16 v20, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v17

    or-int/lit8 v12, v12, 0x4

    :goto_3
    const/16 v3, 0x9

    goto :goto_1

    :pswitch_8
    const/4 v3, 0x1

    const/4 v9, 0x4

    const/16 v20, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v12, v12, 0x2

    goto :goto_3

    :pswitch_9
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v9, 0x4

    const/16 v20, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v19

    or-int/lit8 v12, v12, 0x1

    move/from16 v2, v19

    goto :goto_3

    :pswitch_a
    const/4 v3, 0x1

    const/4 v9, 0x4

    const/16 v19, 0x0

    const/16 v20, 0x3

    move/from16 v21, v19

    goto :goto_3

    :cond_1
    move-object/from16 v32, v7

    move-object/from16 v31, v10

    move-object/from16 v30, v11

    move/from16 v33, v13

    move/from16 v29, v14

    move/from16 v27, v15

    move/from16 v28, v16

    move/from16 v26, v17

    move-object/from16 v25, v18

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v22, Lcom/whoop/domain/model/teams/TeamInviteDto;

    const/16 v34, 0x0

    invoke-direct/range {v22 .. v34}, Lcom/whoop/domain/model/teams/TeamInviteDto;-><init>(IILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v22

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/domain/model/teams/TeamInviteDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/domain/model/teams/TeamInviteDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/domain/model/teams/TeamInviteDto;->write$Self$core_release(Lcom/whoop/domain/model/teams/TeamInviteDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/domain/model/teams/TeamInviteDto;)V

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
