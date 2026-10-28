.class public final synthetic Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/service/network/model/cycles/SleepActivityResponseV2.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
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
.field public static final INSTANCE:Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->INSTANCE:Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.service.network.model.cycles.SleepActivityResponseV2"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cycleId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "userId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "createdAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updatedAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "version"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "during"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timezone"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timezoneOffset"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "source"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scoreState"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scoreType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "type"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "translatedType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sourceId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activity_v1_id"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x10

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    sget-object v5, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v6, 0x2

    aput-object v5, v4, v6

    const/4 v6, 0x3

    aput-object v0, v4, v6

    const/4 v6, 0x4

    aput-object v0, v4, v6

    const/4 v6, 0x5

    aput-object v5, v4, v6

    const/4 v6, 0x6

    aput-object v0, v4, v6

    const/4 v6, 0x7

    aput-object v0, v4, v6

    const/16 v6, 0x8

    aput-object v1, v4, v6

    const/16 v1, 0x9

    aput-object v0, v4, v1

    const/16 v1, 0xa

    aput-object v0, v4, v1

    const/16 v1, 0xb

    aput-object v0, v4, v1

    const/16 v1, 0xc

    aput-object v0, v4, v1

    const/16 v0, 0xd

    aput-object v2, v4, v0

    const/16 v0, 0xe

    aput-object v3, v4, v0

    const/16 v0, 0xf

    aput-object v5, v4, v0

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;
    .locals 52

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v4

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v7, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v17, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    move-wide/from16 v18, v4

    const/16 v2, 0xd

    const/4 v5, 0x0

    invoke-interface {v0, v1, v2, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v4, 0xe

    invoke-interface {v0, v1, v4, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/16 v7, 0xf

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    const v7, 0xffff

    move-object/from16 v48, v2

    move/from16 v37, v3

    move-object/from16 v49, v4

    move/from16 v50, v5

    move-object/from16 v46, v6

    move/from16 v33, v7

    move-object/from16 v45, v8

    move-object/from16 v44, v9

    move-object/from16 v42, v10

    move-object/from16 v41, v11

    move/from16 v40, v12

    move-object/from16 v38, v13

    move-object/from16 v43, v14

    move-object/from16 v39, v15

    move-object/from16 v47, v16

    move-object/from16 v34, v17

    :goto_0
    move-wide/from16 v35, v18

    goto/16 :goto_4

    :cond_0
    move v2, v5

    move-object v5, v6

    const/16 v7, 0xf

    const-wide/16 v18, 0x0

    move v6, v2

    move v13, v6

    move/from16 v30, v13

    move/from16 v31, v4

    move-object v3, v5

    move-object v4, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move/from16 v5, v30

    move-object/from16 v2, v28

    :goto_1
    if-eqz v31, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v15

    packed-switch v15, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    const v15, 0x8000

    or-int/2addr v13, v15

    :goto_2
    const/4 v15, 0x4

    goto :goto_1

    :pswitch_1
    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xe

    invoke-interface {v0, v1, v7, v15, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x4000

    :goto_3
    const/16 v7, 0xf

    goto :goto_2

    :pswitch_2
    const/16 v7, 0xe

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xd

    invoke-interface {v0, v1, v7, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x2000

    goto :goto_3

    :pswitch_3
    const/16 v7, 0xd

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit16 v13, v13, 0x1000

    goto :goto_3

    :pswitch_4
    const/16 v7, 0xb

    const/16 v15, 0xc

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v27

    or-int/lit16 v13, v13, 0x800

    goto :goto_3

    :pswitch_5
    const/16 v7, 0xb

    const/16 v15, 0xc

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit16 v13, v13, 0x400

    goto :goto_3

    :pswitch_6
    const/16 v7, 0xb

    const/16 v15, 0xc

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit16 v13, v13, 0x200

    goto :goto_3

    :pswitch_7
    const/16 v15, 0xc

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v7, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x100

    goto :goto_3

    :pswitch_8
    const/16 v15, 0xc

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit16 v13, v13, 0x80

    goto :goto_3

    :pswitch_9
    const/16 v15, 0xc

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v13, v13, 0x40

    goto :goto_3

    :pswitch_a
    const/16 v15, 0xc

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v30

    or-int/lit8 v13, v13, 0x20

    goto :goto_3

    :pswitch_b
    const/4 v7, 0x4

    const/16 v15, 0xc

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v13, v13, 0x10

    move v15, v7

    const/16 v7, 0xf

    goto/16 :goto_1

    :pswitch_c
    const/4 v7, 0x3

    const/16 v15, 0xc

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v13, v13, 0x8

    goto :goto_3

    :pswitch_d
    const/4 v5, 0x2

    const/4 v7, 0x3

    const/16 v15, 0xc

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v16

    or-int/lit8 v13, v13, 0x4

    move/from16 v5, v16

    goto/16 :goto_3

    :pswitch_e
    const/4 v7, 0x1

    const/16 v15, 0xc

    const/16 v29, 0x2

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v18

    or-int/lit8 v13, v13, 0x2

    goto/16 :goto_3

    :pswitch_f
    const/4 v7, 0x0

    const/16 v15, 0xc

    const/16 v29, 0x2

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v13, v13, 0x1

    goto/16 :goto_3

    :pswitch_10
    const/4 v7, 0x0

    const/16 v29, 0x2

    move/from16 v31, v7

    goto/16 :goto_3

    :cond_1
    move-object/from16 v43, v2

    move-object/from16 v49, v3

    move-object/from16 v48, v4

    move/from16 v37, v5

    move/from16 v50, v6

    move/from16 v33, v13

    move-object/from16 v34, v20

    move-object/from16 v38, v21

    move-object/from16 v39, v22

    move-object/from16 v41, v23

    move-object/from16 v42, v24

    move-object/from16 v44, v25

    move-object/from16 v45, v26

    move-object/from16 v46, v27

    move-object/from16 v47, v28

    move/from16 v40, v30

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v32, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    const/16 v51, 0x0

    invoke-direct/range {v32 .. v51}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;-><init>(ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v32

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->write$Self$core_release(Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->serialize(Lzc3/e;Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;)V

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
