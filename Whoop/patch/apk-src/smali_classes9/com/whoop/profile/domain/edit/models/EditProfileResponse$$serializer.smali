.class public final synthetic Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/profile/domain/edit/models/EditProfileResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "profile_release"
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

.field public static final INSTANCE:Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->INSTANCE:Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.profile.domain.edit.models.EditProfileResponse"

    const/16 v3, 0x1d

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatar_url"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "first_name"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "last_name"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "username"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "email"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "city"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "country"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "state"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "member_since"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "age"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "founding_member"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "user_id"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weight"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "birthday"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unit_system"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height_feet_min_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height_feet_max_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height_meters_min_value"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height_meters_max_value"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weight_pounds_min_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weight_pounds_max_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weight_kilograms_min_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weight_kilograms_max_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "gender"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "physiological_baseline"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "countries"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "locked_fields"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x1d

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x1

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v3, 0x6

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v3, 0x8

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x9

    sget-object v4, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v4, 0xa

    aput-object v3, v1, v4

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xb

    aput-object v4, v1, v5

    const/16 v4, 0xc

    aput-object v3, v1, v4

    sget-object v4, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/16 v5, 0xd

    aput-object v4, v1, v5

    const/16 v5, 0xe

    aput-object v4, v1, v5

    const/16 v5, 0xf

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    aput-object v6, v1, v5

    const/16 v5, 0x10

    aput-object v2, v1, v5

    const/16 v2, 0x11

    aput-object v3, v1, v2

    const/16 v2, 0x12

    aput-object v3, v1, v2

    const/16 v2, 0x13

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v2

    const/16 v2, 0x14

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v2

    const/16 v2, 0x15

    aput-object v3, v1, v2

    const/16 v2, 0x16

    aput-object v3, v1, v2

    const/16 v2, 0x17

    aput-object v3, v1, v2

    const/16 v2, 0x18

    aput-object v3, v1, v2

    const/16 v2, 0x19

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x1a

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x1b

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x1c

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 87

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v5, 0xa

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v11, 0x8

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/16 v27, 0x1c

    const/16 v28, 0x1b

    const/16 v29, 0x1a

    const/16 v30, 0x19

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v15, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v12, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v8, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v11, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v32

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    sget-object v6, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v34, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v6, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v6, 0xc

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    const/16 v4, 0xd

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v4

    move-object/from16 v26, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v2

    move/from16 v25, v2

    move-object/from16 v24, v15

    const/16 v2, 0xf

    const/4 v15, 0x0

    invoke-interface {v0, v1, v2, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0x11

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v15

    move-object/from16 v22, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v21, v2

    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    move-object/from16 v23, v3

    move-object/from16 v20, v14

    const/16 v3, 0x13

    const/4 v14, 0x0

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    move-object/from16 v31, v3

    const/16 v3, 0x14

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    const/16 v14, 0x16

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v14

    move-object/from16 v17, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v16, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    aget-object v18, v34, v30

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move/from16 p1, v2

    move-object/from16 v2, v18

    check-cast v2, Lwc3/b;

    move/from16 v18, v3

    move-object/from16 v19, v13

    move/from16 v3, v30

    const/4 v13, 0x0

    invoke-interface {v0, v1, v3, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/profile/domain/models/Gender;

    aget-object v3, v34, v29

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v30, v2

    move/from16 v2, v29

    invoke-interface {v0, v1, v2, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    aget-object v3, v34, v28

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v29, v2

    move/from16 v2, v28

    invoke-interface {v0, v1, v2, v3, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v3, v34, v27

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v28, v2

    move/from16 v2, v27

    invoke-interface {v0, v1, v2, v3, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const v3, 0x1fffffff

    move/from16 v81, p1

    move-object/from16 v85, v2

    move/from16 v55, v3

    move/from16 v70, v4

    move/from16 v67, v5

    move/from16 v69, v6

    move-object/from16 v63, v7

    move-object/from16 v62, v8

    move-object/from16 v61, v9

    move-object/from16 v59, v10

    move-object/from16 v64, v11

    move-object/from16 v60, v12

    move/from16 v79, v14

    move/from16 v74, v15

    move/from16 v80, v16

    move-object/from16 v77, v17

    move/from16 v78, v18

    move-object/from16 v58, v19

    move-object/from16 v57, v20

    move/from16 v75, v21

    move-object/from16 v72, v22

    move-object/from16 v73, v23

    move-object/from16 v56, v24

    move/from16 v71, v25

    move-object/from16 v68, v26

    move-object/from16 v84, v28

    move-object/from16 v83, v29

    move-object/from16 v82, v30

    move-object/from16 v76, v31

    move-wide/from16 v65, v32

    goto/16 :goto_9

    :cond_0
    move-object/from16 v34, v2

    move v2, v13

    move v3, v14

    move-object v13, v4

    move v4, v15

    const-wide/16 v14, 0x0

    const/16 v32, 0x0

    move/from16 v51, v3

    move/from16 v35, v4

    move/from16 v44, v35

    move/from16 v45, v44

    move/from16 v46, v45

    move/from16 v47, v46

    move/from16 v48, v47

    move-object v2, v13

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v36, v12

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v43, v41

    move-wide/from16 v49, v14

    move/from16 v42, v32

    move/from16 v14, v48

    move v15, v14

    :goto_0
    if-eqz v51, :cond_1

    move/from16 v52, v14

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v14, 0x1c

    aget-object v27, v34, v14

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move/from16 v53, v15

    move-object/from16 v15, v27

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v14, v15, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    const/high16 v15, 0x10000000

    :goto_1
    or-int/2addr v4, v15

    :goto_2
    move/from16 v14, v52

    :goto_3
    move/from16 v15, v53

    goto :goto_0

    :pswitch_1
    move/from16 v53, v15

    const/16 v14, 0x1c

    const/16 v15, 0x1b

    aget-object v27, v34, v15

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v14, v27

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v15, v14, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/high16 v14, 0x8000000

    :goto_4
    or-int/2addr v4, v14

    goto :goto_2

    :pswitch_2
    move/from16 v53, v15

    const/16 v14, 0x1a

    const/16 v15, 0x1b

    aget-object v27, v34, v14

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v15, v27

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v14, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    const/high16 v15, 0x4000000

    goto :goto_1

    :pswitch_3
    move/from16 v53, v15

    const/16 v14, 0x1a

    const/16 v15, 0x19

    aget-object v27, v34, v15

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v14, v27

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v15, v14, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/profile/domain/models/Gender;

    const/high16 v14, 0x2000000

    goto :goto_4

    :pswitch_4
    const/16 v14, 0x18

    const/16 v15, 0x19

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v27

    const/high16 v53, 0x1000000

    or-int v4, v4, v53

    move/from16 v15, v27

    :goto_5
    move/from16 v14, v52

    goto/16 :goto_0

    :pswitch_5
    move/from16 v53, v15

    const/16 v14, 0x17

    const/16 v15, 0x19

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v16

    const/high16 v27, 0x800000

    or-int v4, v4, v27

    move/from16 v14, v16

    goto :goto_3

    :pswitch_6
    move/from16 v53, v15

    const/16 v14, 0x16

    const/16 v15, 0x19

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v47

    const/high16 v16, 0x400000

    :goto_6
    or-int v4, v4, v16

    goto/16 :goto_2

    :pswitch_7
    move/from16 v53, v15

    const/16 v14, 0x15

    const/16 v15, 0x19

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v35

    const/high16 v16, 0x200000

    goto :goto_6

    :pswitch_8
    move/from16 v53, v15

    const/16 v15, 0x19

    sget-object v14, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/16 v15, 0x14

    invoke-interface {v0, v1, v15, v14, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    const/high16 v14, 0x100000

    goto/16 :goto_4

    :pswitch_9
    move/from16 v53, v15

    const/16 v15, 0x14

    sget-object v14, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/16 v15, 0x13

    invoke-interface {v0, v1, v15, v14, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    const/high16 v14, 0x80000

    goto/16 :goto_4

    :pswitch_a
    move/from16 v53, v15

    const/16 v14, 0x12

    const/16 v15, 0x13

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v44

    const/high16 v20, 0x40000

    :goto_7
    or-int v4, v4, v20

    goto/16 :goto_2

    :pswitch_b
    move/from16 v53, v15

    const/16 v14, 0x11

    const/16 v15, 0x13

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v48

    const/high16 v20, 0x20000

    goto :goto_7

    :pswitch_c
    move/from16 v53, v15

    const/16 v14, 0x10

    const/16 v15, 0x13

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v43

    const/high16 v20, 0x10000

    goto :goto_7

    :pswitch_d
    move/from16 v53, v15

    const/16 v15, 0x13

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15, v14, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const v14, 0x8000

    goto/16 :goto_4

    :pswitch_e
    move/from16 v53, v15

    const/16 v14, 0xe

    const/16 v15, 0xf

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v32

    or-int/lit16 v4, v4, 0x4000

    goto/16 :goto_2

    :pswitch_f
    move/from16 v53, v15

    const/16 v14, 0xd

    const/16 v15, 0xf

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v42

    or-int/lit16 v4, v4, 0x2000

    goto/16 :goto_2

    :pswitch_10
    move/from16 v53, v15

    const/16 v14, 0xc

    const/16 v15, 0xf

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v46

    or-int/lit16 v4, v4, 0x1000

    goto/16 :goto_2

    :pswitch_11
    move/from16 v53, v15

    const/16 v15, 0xf

    sget-object v14, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit16 v4, v4, 0x800

    goto/16 :goto_2

    :pswitch_12
    move/from16 v53, v15

    const/16 v14, 0xa

    const/16 v15, 0xb

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v45

    or-int/lit16 v4, v4, 0x400

    goto/16 :goto_2

    :pswitch_13
    move/from16 v53, v15

    const/16 v14, 0x9

    const/16 v15, 0xb

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v49

    or-int/lit16 v4, v4, 0x200

    goto/16 :goto_2

    :pswitch_14
    move/from16 v53, v15

    const/16 v15, 0xb

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x8

    invoke-interface {v0, v1, v15, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v4, v4, 0x100

    goto/16 :goto_2

    :pswitch_15
    move/from16 v53, v15

    const/4 v14, 0x7

    const/16 v15, 0x8

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v41

    or-int/lit16 v4, v4, 0x80

    goto/16 :goto_2

    :pswitch_16
    move/from16 v53, v15

    const/16 v15, 0x8

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v15, 0x6

    invoke-interface {v0, v1, v15, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v4, v4, 0x40

    goto/16 :goto_2

    :pswitch_17
    move/from16 v53, v15

    const/4 v14, 0x5

    const/4 v15, 0x6

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v40

    or-int/lit8 v4, v4, 0x20

    goto/16 :goto_2

    :pswitch_18
    move/from16 v53, v15

    const/4 v15, 0x6

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v15, 0x4

    invoke-interface {v0, v1, v15, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v4, v4, 0x10

    goto/16 :goto_2

    :pswitch_19
    move/from16 v53, v15

    const/4 v14, 0x3

    const/4 v15, 0x4

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v39

    or-int/lit8 v4, v4, 0x8

    goto/16 :goto_2

    :pswitch_1a
    move/from16 v53, v15

    const/4 v14, 0x2

    const/4 v15, 0x4

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v38

    or-int/lit8 v4, v4, 0x4

    goto/16 :goto_2

    :pswitch_1b
    move/from16 v53, v15

    const/4 v15, 0x4

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v15, v37

    move-object/from16 v37, v2

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v4, v4, 0x2

    move-object/from16 v2, v37

    move/from16 v15, v53

    move-object/from16 v37, v14

    goto/16 :goto_5

    :pswitch_1c
    move/from16 v53, v15

    move-object/from16 v15, v37

    move-object/from16 v37, v2

    const/4 v2, 0x1

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v33, v3

    move-object/from16 v2, v36

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/String;

    or-int/lit8 v4, v4, 0x1

    :goto_8
    move-object/from16 v3, v33

    move-object/from16 v2, v37

    move/from16 v14, v52

    move-object/from16 v37, v15

    goto/16 :goto_3

    :pswitch_1d
    move-object/from16 v33, v3

    move/from16 v53, v15

    move-object/from16 v15, v37

    const/4 v3, 0x0

    move-object/from16 v37, v2

    move-object/from16 v2, v36

    move/from16 v51, v3

    goto :goto_8

    :cond_1
    move-object/from16 v33, v3

    move/from16 v52, v14

    move/from16 v53, v15

    move-object/from16 v15, v37

    move-object/from16 v37, v2

    move-object/from16 v2, v36

    move-object/from16 v56, v2

    move/from16 v55, v4

    move-object/from16 v84, v5

    move-object/from16 v83, v6

    move-object/from16 v77, v7

    move-object/from16 v76, v8

    move-object/from16 v72, v9

    move-object/from16 v64, v10

    move-object/from16 v82, v11

    move-object/from16 v68, v12

    move-object/from16 v85, v13

    move-object/from16 v57, v15

    move/from16 v71, v32

    move-object/from16 v60, v33

    move/from16 v78, v35

    move-object/from16 v62, v37

    move-object/from16 v58, v38

    move-object/from16 v59, v39

    move-object/from16 v61, v40

    move-object/from16 v63, v41

    move/from16 v70, v42

    move-object/from16 v73, v43

    move/from16 v75, v44

    move/from16 v67, v45

    move/from16 v69, v46

    move/from16 v79, v47

    move/from16 v74, v48

    move-wide/from16 v65, v49

    move/from16 v80, v52

    move/from16 v81, v53

    :goto_9
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v54, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    const/16 v86, 0x0

    invoke-direct/range {v54 .. v86}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v54

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
    invoke-virtual {p0, p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->write$Self$profile_release(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)V

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
