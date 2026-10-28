.class public final synthetic Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/teams/LeadersEntryDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/ui/teams/LeadersEntryDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/ui/teams/LeadersEntryDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/ui/teams/LeadersEntryDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/ui/teams/LeadersEntryDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/ui/teams/LeadersEntryDto;",
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
.field public static final INSTANCE:Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.ui.teams.LeadersEntryDto"

    const/16 v3, 0x16

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "name"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "user_id"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "avatarUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rank"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deleted"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dayStrain"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "calories"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "score"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hrv"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rhr"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "duration"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "performance"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activities"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "peakActivity"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "createdAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updatedAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cycleDayJoined"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "period"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "during"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "is_waiting_for_data"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "compliant"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hasData"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/ui/teams/LeadersEntryDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    sget-object v6, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    sget-object v7, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    const/16 v14, 0xc

    aget-object v0, v0, v14

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v15, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v18

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v19

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v20

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v21

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v22

    move/from16 v23, v14

    const/16 v14, 0x16

    new-array v14, v14, [Lwc3/c;

    const/16 v24, 0x0

    aput-object v2, v14, v24

    const/4 v2, 0x1

    aput-object v3, v14, v2

    const/4 v2, 0x2

    aput-object v4, v14, v2

    const/4 v2, 0x3

    aput-object v5, v14, v2

    const/4 v2, 0x4

    aput-object v6, v14, v2

    const/4 v2, 0x5

    aput-object v8, v14, v2

    const/4 v2, 0x6

    aput-object v9, v14, v2

    const/4 v2, 0x7

    aput-object v10, v14, v2

    const/16 v2, 0x8

    aput-object v11, v14, v2

    const/16 v2, 0x9

    aput-object v12, v14, v2

    const/16 v2, 0xa

    aput-object v13, v14, v2

    const/16 v2, 0xb

    aput-object v7, v14, v2

    aput-object v0, v14, v23

    const/16 v0, 0xd

    aput-object v15, v14, v0

    const/16 v0, 0xe

    aput-object v16, v14, v0

    const/16 v0, 0xf

    aput-object v17, v14, v0

    const/16 v0, 0x10

    aput-object v18, v14, v0

    const/16 v0, 0x11

    aput-object v19, v14, v0

    const/16 v0, 0x12

    aput-object v1, v14, v0

    const/16 v0, 0x13

    aput-object v20, v14, v0

    const/16 v0, 0x14

    aput-object v21, v14, v0

    const/16 v0, 0x15

    aput-object v22, v14, v0

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/ui/teams/LeadersEntryDto;
    .locals 75

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/ui/teams/LeadersEntryDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v14, 0x9

    const/4 v15, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/16 v8, 0x8

    const/4 v7, 0x4

    const/4 v9, 0x2

    const/4 v11, 0x1

    const/16 v24, 0xc

    const/4 v10, 0x0

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v11

    invoke-interface {v0, v1, v9, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v13, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v6, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v7

    sget-object v13, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v5, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    invoke-interface {v0, v1, v4, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-interface {v0, v1, v15, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Double;

    invoke-interface {v0, v1, v8, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    invoke-interface {v0, v1, v14, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Double;

    move-object/from16 v27, v2

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v26, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    aget-object v13, v27, v24

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v25, v2

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v13, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    move-object/from16 v24, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v13, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ui/teams/LeaderActivityDto;

    const/16 v13, 0xe

    invoke-interface {v0, v1, v13, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v22, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v21, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v18, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    move-object/from16 v17, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    move-object/from16 v16, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const v3, 0x3fffff

    move-object/from16 v73, v2

    move/from16 v51, v3

    move-object/from16 v58, v4

    move-object/from16 v57, v5

    move-object/from16 v55, v6

    move/from16 v56, v7

    move-object/from16 v60, v8

    move-object/from16 v54, v9

    move-object/from16 v52, v10

    move/from16 v53, v11

    move-object/from16 v66, v13

    move-object/from16 v61, v14

    move-object/from16 v59, v15

    move-object/from16 v72, v16

    move-object/from16 v71, v17

    move-object/from16 v70, v18

    move-object/from16 v69, v19

    move-object/from16 v68, v20

    move-object/from16 v67, v21

    move-object/from16 v65, v22

    move-object/from16 v64, v24

    move-object/from16 v63, v25

    move-object/from16 v62, v26

    goto/16 :goto_6

    :cond_0
    move-object/from16 v27, v2

    move v3, v10

    move/from16 v38, v3

    move/from16 v39, v38

    move/from16 v47, v11

    move-object v2, v12

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v40, v15

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    :goto_0
    if-eqz v47, :cond_1

    move-object/from16 v48, v4

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v4}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v49, v15

    const/16 v15, 0x15

    invoke-interface {v0, v1, v15, v4, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Boolean;

    const/high16 v4, 0x200000

    :goto_1
    or-int/2addr v3, v4

    :goto_2
    move-object/from16 v4, v48

    move-object/from16 v15, v49

    goto :goto_0

    :pswitch_1
    move-object/from16 v49, v15

    const/16 v15, 0x15

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v15, 0x14

    invoke-interface {v0, v1, v15, v4, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/lang/Boolean;

    const/high16 v4, 0x100000

    goto :goto_1

    :pswitch_2
    move-object/from16 v49, v15

    const/16 v15, 0x14

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v15, 0x13

    invoke-interface {v0, v1, v15, v4, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/Boolean;

    const/high16 v4, 0x80000

    goto :goto_1

    :pswitch_3
    move-object/from16 v49, v15

    const/16 v15, 0x13

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x12

    invoke-interface {v0, v1, v15, v4, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/lang/String;

    const/high16 v4, 0x40000

    goto :goto_1

    :pswitch_4
    move-object/from16 v49, v15

    const/16 v15, 0x12

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x11

    invoke-interface {v0, v1, v15, v4, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    const/high16 v4, 0x20000

    goto :goto_1

    :pswitch_5
    move-object/from16 v49, v15

    const/16 v15, 0x11

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x10

    invoke-interface {v0, v1, v15, v4, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    const/high16 v4, 0x10000

    goto :goto_1

    :pswitch_6
    move-object/from16 v49, v15

    const/16 v15, 0x10

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15, v4, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/lang/String;

    const v4, 0x8000

    goto :goto_1

    :pswitch_7
    move-object/from16 v49, v15

    const/16 v15, 0xf

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xe

    invoke-interface {v0, v1, v15, v4, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x4000

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v49, v15

    const/16 v15, 0xe

    sget-object v4, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15, v4, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ui/teams/LeaderActivityDto;

    or-int/lit16 v3, v3, 0x2000

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v49, v15

    const/16 v4, 0xc

    const/16 v15, 0xd

    aget-object v23, v27, v4

    invoke-interface/range {v23 .. v23}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v15, v23

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    or-int/lit16 v3, v3, 0x1000

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v49, v15

    const/16 v4, 0xc

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    or-int/lit16 v3, v3, 0x800

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v49, v15

    const/16 v4, 0xb

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v26, v2

    move-object/from16 v4, v49

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Ljava/lang/Double;

    or-int/lit16 v3, v3, 0x400

    move-object/from16 v2, v26

    move-object/from16 v4, v48

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v26, v2

    move-object v4, v15

    const/16 v2, 0xa

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v37, v4

    move-object/from16 v2, v48

    const/16 v4, 0x9

    invoke-interface {v0, v1, v4, v15, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v3, v3, 0x200

    move-object v4, v2

    move-object/from16 v2, v26

    :goto_3
    move-object/from16 v15, v37

    goto/16 :goto_0

    :pswitch_d
    move-object/from16 v26, v2

    move-object/from16 v37, v15

    move-object/from16 v2, v48

    const/16 v4, 0x9

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v36, v2

    move-object/from16 v4, v46

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v46, v4

    check-cast v46, Ljava/lang/Double;

    or-int/lit16 v3, v3, 0x100

    :goto_4
    move-object/from16 v2, v26

    :goto_5
    move-object/from16 v4, v36

    goto :goto_3

    :pswitch_e
    move-object/from16 v26, v2

    move-object/from16 v37, v15

    move-object/from16 v4, v46

    move-object/from16 v36, v48

    const/16 v2, 0x8

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v35, v4

    move-object/from16 v2, v45

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v15, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v45, v2

    check-cast v45, Ljava/lang/Double;

    or-int/lit16 v3, v3, 0x80

    move-object/from16 v2, v26

    move-object/from16 v46, v35

    goto :goto_5

    :pswitch_f
    move-object/from16 v26, v2

    move-object/from16 v37, v15

    move-object/from16 v2, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v4, 0x7

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v34, v2

    move-object/from16 v4, v44

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v44, v4

    check-cast v44, Ljava/lang/Double;

    or-int/lit8 v3, v3, 0x40

    move-object/from16 v2, v26

    move-object/from16 v45, v34

    goto :goto_5

    :pswitch_10
    move-object/from16 v26, v2

    move-object/from16 v37, v15

    move-object/from16 v4, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v2, 0x6

    sget-object v15, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move/from16 v33, v3

    move-object/from16 v2, v43

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v15, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v43, v2

    check-cast v43, Ljava/lang/Double;

    or-int/lit8 v2, v33, 0x20

    move v3, v2

    goto :goto_4

    :pswitch_11
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v2, v43

    move-object/from16 v4, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v3, 0x5

    const/4 v15, 0x4

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v38

    or-int/lit8 v32, v33, 0x10

    move-object/from16 v2, v26

    move/from16 v3, v32

    goto/16 :goto_5

    :pswitch_12
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v2, v43

    move-object/from16 v4, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v15, 0x4

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    move-object/from16 v31, v2

    move-object/from16 v15, v42

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v42, v3

    check-cast v42, Ljava/lang/Integer;

    or-int/lit8 v3, v33, 0x8

    move-object/from16 v2, v26

    move-object/from16 v43, v31

    goto/16 :goto_5

    :pswitch_13
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v15, v42

    move-object/from16 v31, v43

    move-object/from16 v4, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v2, 0x3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v30, v4

    move-object/from16 v2, v41

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Ljava/lang/String;

    or-int/lit8 v3, v33, 0x4

    move-object/from16 v2, v26

    move-object/from16 v44, v30

    goto/16 :goto_5

    :pswitch_14
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v2, v41

    move-object/from16 v15, v42

    move-object/from16 v31, v43

    move-object/from16 v30, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v39

    or-int/lit8 v29, v33, 0x2

    move-object/from16 v2, v26

    move/from16 v3, v29

    goto/16 :goto_5

    :pswitch_15
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v2, v41

    move-object/from16 v15, v42

    move-object/from16 v31, v43

    move-object/from16 v30, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v4, 0x2

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v4, v40

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v40, v3

    check-cast v40, Ljava/lang/String;

    or-int/lit8 v3, v33, 0x1

    move-object/from16 v2, v26

    move-object/from16 v41, v28

    goto/16 :goto_5

    :pswitch_16
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v37, v15

    move-object/from16 v4, v40

    move-object/from16 v28, v41

    move-object/from16 v15, v42

    move-object/from16 v31, v43

    move-object/from16 v30, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v48

    const/4 v2, 0x0

    move/from16 v47, v2

    goto/16 :goto_4

    :cond_1
    move-object/from16 v26, v2

    move/from16 v33, v3

    move-object/from16 v36, v4

    move-object/from16 v37, v15

    move-object/from16 v4, v40

    move-object/from16 v28, v41

    move-object/from16 v15, v42

    move-object/from16 v31, v43

    move-object/from16 v30, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v52, v4

    move-object/from16 v73, v5

    move-object/from16 v71, v6

    move-object/from16 v72, v7

    move-object/from16 v63, v8

    move-object/from16 v70, v9

    move-object/from16 v68, v10

    move-object/from16 v69, v11

    move-object/from16 v66, v12

    move-object/from16 v67, v13

    move-object/from16 v64, v14

    move-object/from16 v55, v15

    move-object/from16 v65, v26

    move-object/from16 v54, v28

    move-object/from16 v58, v30

    move-object/from16 v57, v31

    move/from16 v51, v33

    move-object/from16 v59, v34

    move-object/from16 v60, v35

    move-object/from16 v61, v36

    move-object/from16 v62, v37

    move/from16 v56, v38

    move/from16 v53, v39

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v50, Lcom/whoop/ui/teams/LeadersEntryDto;

    const/16 v74, 0x0

    invoke-direct/range {v50 .. v74}, Lcom/whoop/ui/teams/LeadersEntryDto;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v50

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/ui/teams/LeadersEntryDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/ui/teams/LeadersEntryDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/ui/teams/LeadersEntryDto;->write$Self$core_release(Lcom/whoop/ui/teams/LeadersEntryDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/ui/teams/LeadersEntryDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/ui/teams/LeadersEntryDto;)V

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
