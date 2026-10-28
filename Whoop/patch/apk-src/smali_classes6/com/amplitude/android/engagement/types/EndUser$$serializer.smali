.class public final Lcom/amplitude/android/engagement/types/EndUser$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/EndUser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/EndUser;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/EndUser.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/EndUser;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/EndUser;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/EndUser;)V",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/EndUser$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.amplitude.android.engagement.types.EndUser"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "user_id"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "device_id"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "country"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "city"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "region"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dma"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "language"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "platform"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "version"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "os"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "device_model"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "carrier"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "library"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "user_agent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "session_id"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "user_properties"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/EndUser;->access$get$childSerializers$cp()[Lwc3/c;

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

    move-result-object v1

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    const/16 v16, 0xf

    aget-object v0, v0, v16

    move-object/from16 v17, v0

    const/16 v0, 0x10

    new-array v0, v0, [Lwc3/c;

    const/16 v18, 0x0

    aput-object v2, v0, v18

    const/4 v2, 0x1

    aput-object v3, v0, v2

    const/4 v2, 0x2

    aput-object v4, v0, v2

    const/4 v2, 0x3

    aput-object v5, v0, v2

    const/4 v2, 0x4

    aput-object v6, v0, v2

    const/4 v2, 0x5

    aput-object v7, v0, v2

    const/4 v2, 0x6

    aput-object v8, v0, v2

    const/4 v2, 0x7

    aput-object v9, v0, v2

    const/16 v2, 0x8

    aput-object v10, v0, v2

    const/16 v2, 0x9

    aput-object v11, v0, v2

    const/16 v2, 0xa

    aput-object v12, v0, v2

    const/16 v2, 0xb

    aput-object v13, v0, v2

    const/16 v2, 0xc

    aput-object v14, v0, v2

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const/16 v1, 0xe

    aput-object v15, v0, v1

    aput-object v17, v0, v16

    return-object v0
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/EndUser;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/amplitude/android/engagement/types/EndUser;->access$get$childSerializers$cp()[Lwc3/c;

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

    const/16 v17, 0xf

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v6, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v1, v5, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v1, v4, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v13, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v0, v1, v15, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-interface {v0, v1, v12, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v1, v11, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v1, v10, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v14, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v0, v1, v9, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v1, v8, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v20, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    move-object/from16 v16, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aget-object v3, v20, v17

    check-cast v3, Lwc3/b;

    move-object/from16 p1, v6

    move/from16 v6, v17

    invoke-interface {v0, v1, v6, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v6, 0xffff

    move-object/from16 v24, v3

    move/from16 v26, v6

    move-object/from16 v6, p1

    move-object v3, v2

    move-object/from16 v2, v19

    goto/16 :goto_5

    :cond_0
    move-object/from16 v20, v2

    move v2, v6

    move/from16 v6, v17

    move v3, v2

    move/from16 v26, v5

    move-object v2, v7

    move-object v4, v2

    move-object v5, v4

    move-object v8, v5

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    :goto_0
    if-eqz v26, :cond_1

    move/from16 v27, v6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v6, v20, v27

    check-cast v6, Lwc3/b;

    move-object/from16 v28, v2

    move/from16 v2, v27

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const v6, 0x8000

    or-int/2addr v3, v6

    move v6, v2

    :goto_1
    move-object/from16 v2, v28

    goto :goto_0

    :pswitch_1
    move-object/from16 v28, v2

    move/from16 v2, v27

    sget-object v6, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    move-object/from16 v2, v24

    move-object/from16 v24, v7

    const/16 v7, 0xe

    invoke-interface {v0, v1, v7, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v3, v3, 0x4000

    move-object/from16 v7, v24

    const/16 v6, 0xf

    move-object/from16 v24, v2

    goto :goto_1

    :pswitch_2
    move-object/from16 v28, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v7

    const/16 v7, 0xe

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v16, v2

    move-object/from16 v7, v23

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    or-int/lit16 v3, v3, 0x2000

    :goto_2
    move-object/from16 v7, v24

    move-object/from16 v2, v28

    :goto_3
    const/16 v6, 0xf

    move-object/from16 v24, v16

    goto :goto_0

    :pswitch_3
    move-object/from16 v28, v2

    move-object/from16 v16, v24

    const/16 v2, 0xd

    move-object/from16 v24, v7

    move-object/from16 v7, v23

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v18, v7

    move-object/from16 v2, v22

    const/16 v7, 0xc

    invoke-interface {v0, v1, v7, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    or-int/lit16 v3, v3, 0x1000

    move-object/from16 v23, v18

    goto :goto_2

    :pswitch_4
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/16 v7, 0xc

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xb

    invoke-interface {v0, v1, v7, v6, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit16 v3, v3, 0x800

    goto :goto_2

    :pswitch_5
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/16 v7, 0xb

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xa

    invoke-interface {v0, v1, v7, v6, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v3, v3, 0x400

    goto :goto_2

    :pswitch_6
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/16 v7, 0xa

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0x9

    invoke-interface {v0, v1, v7, v6, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit16 v3, v3, 0x200

    goto :goto_2

    :pswitch_7
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/16 v7, 0x9

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0x8

    invoke-interface {v0, v1, v7, v6, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v3, v3, 0x100

    goto :goto_2

    :pswitch_8
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/16 v7, 0x8

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7, v6, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit16 v3, v3, 0x80

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x7

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v6, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v3, v3, 0x40

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x6

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x5

    invoke-interface {v0, v1, v7, v6, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v3, v3, 0x20

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x5

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x4

    invoke-interface {v0, v1, v7, v6, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v3, v3, 0x10

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x4

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x3

    invoke-interface {v0, v1, v7, v6, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit8 v3, v3, 0x8

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x3

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v6, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit8 v3, v3, 0x4

    goto/16 :goto_2

    :pswitch_e
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    const/4 v7, 0x2

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v21, v2

    move-object/from16 v7, v28

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit8 v3, v3, 0x2

    move-object v2, v6

    move-object/from16 v22, v21

    :goto_4
    move-object/from16 v7, v24

    goto/16 :goto_3

    :pswitch_f
    move-object/from16 v21, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    move-object v7, v2

    const/4 v2, 0x1

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move/from16 v17, v3

    move-object/from16 v2, v25

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    or-int/lit8 v2, v17, 0x1

    move v3, v2

    move-object v2, v7

    goto :goto_4

    :pswitch_10
    move/from16 v17, v3

    move-object/from16 v21, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    const/4 v3, 0x0

    move-object/from16 v24, v7

    move-object v7, v2

    move-object/from16 v2, v25

    move/from16 v26, v3

    move-object v2, v7

    move/from16 v3, v17

    goto :goto_4

    :cond_1
    move/from16 v17, v3

    move-object/from16 v21, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v24

    move-object/from16 v24, v7

    move-object v7, v2

    move-object/from16 v2, v25

    move-object v6, v2

    move-object v2, v8

    move-object v8, v9

    move-object v9, v14

    move-object/from16 v3, v16

    move/from16 v26, v17

    move-object/from16 v16, v18

    move-object/from16 v18, v21

    move-object v14, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v15

    move-object v15, v13

    move-object v13, v4

    move-object v4, v5

    move-object v5, v7

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v25, Lcom/amplitude/android/engagement/types/EndUser;

    move-object/from16 v27, v6

    check-cast v27, Ljava/lang/String;

    move-object/from16 v28, v5

    check-cast v28, Ljava/lang/String;

    move-object/from16 v29, v4

    check-cast v29, Ljava/lang/String;

    move-object/from16 v30, v13

    check-cast v30, Ljava/lang/String;

    move-object/from16 v31, v15

    check-cast v31, Ljava/lang/String;

    move-object/from16 v32, v12

    check-cast v32, Ljava/lang/String;

    move-object/from16 v33, v11

    check-cast v33, Ljava/lang/String;

    move-object/from16 v34, v10

    check-cast v34, Ljava/lang/String;

    move-object/from16 v35, v14

    check-cast v35, Ljava/lang/String;

    move-object/from16 v36, v9

    check-cast v36, Ljava/lang/String;

    move-object/from16 v37, v8

    check-cast v37, Ljava/lang/String;

    move-object/from16 v38, v2

    check-cast v38, Ljava/lang/String;

    move-object/from16 v39, v18

    check-cast v39, Ljava/lang/String;

    move-object/from16 v40, v16

    check-cast v40, Ljava/lang/String;

    move-object/from16 v41, v3

    check-cast v41, Ljava/lang/Integer;

    move-object/from16 v42, v24

    check-cast v42, Ljava/util/Map;

    const/16 v43, 0x0

    invoke-direct/range {v25 .. v43}, Lcom/amplitude/android/engagement/types/EndUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v25

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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/EndUser;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/EndUser;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/EndUser;->write$Self(Lcom/amplitude/android/engagement/types/EndUser;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/EndUser;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/EndUser;)V

    return-void
.end method

.method public typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {p0}, Lkotlinx/serialization/internal/GeneratedSerializer$DefaultImpls;->typeParametersSerializers(Lkotlinx/serialization/internal/GeneratedSerializer;)[Lwc3/c;

    move-result-object v0

    return-object v0
.end method
