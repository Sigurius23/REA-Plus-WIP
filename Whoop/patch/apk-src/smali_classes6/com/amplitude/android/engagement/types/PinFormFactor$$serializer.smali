.class public final Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/PinFormFactor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/PinFormFactor;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/PinFormFactor.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/PinFormFactor;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/PinFormFactor;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/PinFormFactor;)V",
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

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "pin"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "anchor"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "anchorSelector"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isOpenByDefault"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isShowingMask"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "advanceTrigger"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "offset"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "position"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "alignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pointer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "layout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "textAnimation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mediaPosition"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleAlignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "contentAlignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selector"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/PinFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    sget-object v4, Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x6

    aget-object v6, v0, v5

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/4 v7, 0x7

    aget-object v8, v0, v7

    invoke-static {v8}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    const/16 v9, 0x9

    aget-object v10, v0, v9

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    const/16 v13, 0xc

    aget-object v14, v0, v13

    invoke-static {v14}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    const/16 v15, 0xd

    aget-object v0, v0, v15

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    move/from16 v16, v5

    const/16 v5, 0xf

    new-array v5, v5, [Lwc3/c;

    const/16 v17, 0x0

    aput-object v1, v5, v17

    const/16 v17, 0x1

    aput-object v2, v5, v17

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v17, 0x2

    aput-object v2, v5, v17

    const/16 v17, 0x3

    aput-object v2, v5, v17

    const/4 v2, 0x4

    aput-object v3, v5, v2

    const/4 v2, 0x5

    aput-object v4, v5, v2

    aput-object v6, v5, v16

    aput-object v8, v5, v7

    sget-object v2, Lcom/amplitude/android/engagement/types/PinPointer$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PinPointer$$serializer;

    const/16 v3, 0x8

    aput-object v2, v5, v3

    aput-object v10, v5, v9

    const/16 v2, 0xa

    aput-object v11, v5, v2

    const/16 v2, 0xb

    aput-object v12, v5, v2

    aput-object v14, v5, v13

    aput-object v0, v5, v15

    const/16 v0, 0xe

    aput-object v1, v5, v0

    return-object v5
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/PinFormFactor;
    .locals 35

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/amplitude/android/engagement/types/PinFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/16 v14, 0x9

    const/4 v15, 0x7

    const/4 v4, 0x6

    const/16 v16, 0xd

    const/4 v12, 0x1

    const/16 v17, 0xc

    const/4 v13, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v13, Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;

    invoke-interface {v0, v1, v12, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v8

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    sget-object v6, Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;

    invoke-interface {v0, v1, v7, v6, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aget-object v7, v2, v4

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v4, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aget-object v7, v2, v15

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v15, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v15, Lcom/amplitude/android/engagement/types/PinPointer$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PinPointer$$serializer;

    invoke-interface {v0, v1, v9, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    aget-object v15, v2, v14

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v14, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v20, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aget-object v13, v20, v17

    check-cast v13, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aget-object v13, v20, v16

    check-cast v13, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v5, 0xe

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0x7fff

    move-object/from16 v32, v5

    move/from16 v21, v8

    move-object v8, v9

    move/from16 v20, v11

    move-object v9, v2

    move-object/from16 v2, v18

    move-object/from16 v18, v3

    move-object v3, v15

    move-object/from16 v15, v17

    move/from16 v17, v13

    goto/16 :goto_7

    :cond_0
    move-object/from16 v20, v2

    const/16 v2, 0xe

    move/from16 v26, v4

    move-object v3, v5

    move-object v4, v3

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object/from16 v29, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move/from16 v31, v30

    move/from16 v32, v14

    move/from16 v27, v15

    move-object/from16 v12, v29

    move-object v13, v12

    move-object v15, v13

    move/from16 v14, v31

    :goto_0
    if-eqz v33, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit16 v14, v14, 0x4000

    goto :goto_0

    :pswitch_1
    const/16 v2, 0xd

    aget-object v16, v20, v2

    move-object/from16 v34, v5

    move-object/from16 v5, v16

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v2, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v14, v14, 0x2000

    :goto_1
    move-object/from16 v5, v34

    const/16 v2, 0xe

    goto :goto_0

    :pswitch_2
    move-object/from16 v34, v5

    const/16 v2, 0xd

    const/16 v5, 0xc

    aget-object v16, v20, v5

    move-object/from16 v2, v16

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v5, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit16 v14, v14, 0x1000

    goto :goto_1

    :pswitch_3
    move-object/from16 v34, v5

    const/16 v5, 0xc

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v5, 0xb

    invoke-interface {v0, v1, v5, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v14, v14, 0x800

    goto :goto_1

    :pswitch_4
    move-object/from16 v34, v5

    const/16 v5, 0xb

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v5, 0xa

    invoke-interface {v0, v1, v5, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    or-int/lit16 v14, v14, 0x400

    goto :goto_1

    :pswitch_5
    move-object/from16 v34, v5

    const/16 v5, 0xa

    aget-object v2, v20, v32

    check-cast v2, Lwc3/b;

    move/from16 v5, v32

    invoke-interface {v0, v1, v5, v2, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v14, v14, 0x200

    goto :goto_1

    :pswitch_6
    move-object/from16 v34, v5

    move/from16 v5, v32

    sget-object v2, Lcom/amplitude/android/engagement/types/PinPointer$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PinPointer$$serializer;

    const/16 v5, 0x8

    invoke-interface {v0, v1, v5, v2, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit16 v14, v14, 0x100

    :goto_2
    move-object/from16 v5, v34

    const/16 v2, 0xe

    :goto_3
    const/16 v32, 0x9

    goto/16 :goto_0

    :pswitch_7
    move-object/from16 v34, v5

    const/16 v5, 0x8

    aget-object v2, v20, v27

    check-cast v2, Lwc3/b;

    move/from16 v5, v27

    invoke-interface {v0, v1, v5, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit16 v14, v14, 0x80

    goto :goto_2

    :pswitch_8
    move-object/from16 v34, v5

    move/from16 v5, v27

    aget-object v2, v20, v26

    check-cast v2, Lwc3/b;

    move/from16 v5, v26

    invoke-interface {v0, v1, v5, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v14, v14, 0x40

    move-object/from16 v5, v34

    const/16 v2, 0xe

    :goto_4
    const/16 v27, 0x7

    goto :goto_3

    :pswitch_9
    move-object/from16 v34, v5

    move/from16 v5, v26

    sget-object v2, Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/OffsetValue$$serializer;

    const/4 v5, 0x5

    invoke-interface {v0, v1, v5, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v14, v14, 0x20

    :goto_5
    move-object/from16 v5, v34

    :goto_6
    const/16 v2, 0xe

    const/16 v26, 0x6

    goto :goto_4

    :pswitch_a
    move-object/from16 v34, v5

    const/4 v5, 0x5

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit8 v14, v14, 0x10

    goto :goto_5

    :pswitch_b
    move-object/from16 v34, v5

    const/4 v2, 0x3

    const/4 v5, 0x4

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v30

    or-int/lit8 v14, v14, 0x8

    goto :goto_5

    :pswitch_c
    move-object/from16 v34, v5

    const/4 v2, 0x2

    const/4 v5, 0x4

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v31

    or-int/lit8 v14, v14, 0x4

    goto :goto_5

    :pswitch_d
    move-object/from16 v34, v5

    const/4 v5, 0x4

    sget-object v2, Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ElementSelector$$serializer;

    const/4 v5, 0x1

    invoke-interface {v0, v1, v5, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v14, v14, 0x2

    goto :goto_5

    :pswitch_e
    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v14, v14, 0x1

    move-object/from16 v5, v21

    goto :goto_6

    :pswitch_f
    move-object/from16 v34, v5

    const/4 v2, 0x0

    move/from16 v33, v2

    goto :goto_6

    :cond_1
    move-object/from16 v34, v5

    move-object v2, v4

    move-object v4, v12

    move/from16 v17, v14

    move-object/from16 v32, v29

    move/from16 v21, v30

    move/from16 v20, v31

    move-object/from16 v18, v34

    move-object v12, v3

    move-object v3, v7

    move-object v14, v10

    move-object v7, v11

    move-object v10, v6

    move-object v6, v13

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v16, Lcom/amplitude/android/engagement/types/PinFormFactor;

    move-object/from16 v19, v12

    check-cast v19, Lcom/amplitude/android/engagement/types/ElementSelector;

    move-object/from16 v22, v10

    check-cast v22, Ljava/lang/String;

    move-object/from16 v23, v6

    check-cast v23, Lcom/amplitude/android/engagement/types/OffsetValue;

    move-object/from16 v24, v4

    check-cast v24, Lcom/amplitude/android/engagement/types/PinPosition;

    move-object/from16 v25, v7

    check-cast v25, Lcom/amplitude/android/engagement/types/PinAlignment;

    move-object/from16 v26, v8

    check-cast v26, Lcom/amplitude/android/engagement/types/PinPointer;

    move-object/from16 v27, v14

    check-cast v27, Lcom/amplitude/android/engagement/types/NudgeStepLayout;

    move-object/from16 v28, v3

    check-cast v28, Ljava/lang/String;

    move-object/from16 v29, v2

    check-cast v29, Ljava/lang/String;

    move-object/from16 v30, v15

    check-cast v30, Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-object/from16 v31, v9

    check-cast v31, Lcom/amplitude/android/engagement/types/ContentAlignment;

    const/16 v33, 0x0

    invoke-direct/range {v16 .. v33}, Lcom/amplitude/android/engagement/types/PinFormFactor;-><init>(ILjava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;ZZLjava/lang/String;Lcom/amplitude/android/engagement/types/OffsetValue;Lcom/amplitude/android/engagement/types/PinPosition;Lcom/amplitude/android/engagement/types/PinAlignment;Lcom/amplitude/android/engagement/types/PinPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v16

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/PinFormFactor;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/PinFormFactor;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/PinFormFactor;->write$Self(Lcom/amplitude/android/engagement/types/PinFormFactor;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/PinFormFactor;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/PinFormFactor;)V

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
