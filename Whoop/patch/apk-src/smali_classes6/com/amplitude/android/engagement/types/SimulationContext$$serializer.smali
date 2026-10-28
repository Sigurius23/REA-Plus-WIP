.class public final Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/SimulationContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/SimulationContext;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/SimulationContext.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/SimulationContext;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/SimulationContext;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/SimulationContext;)V",
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

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.amplitude.android.engagement.types.SimulationContext"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "lastTriggerEvent"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "simulatedNudge"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "lastEvent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentStepIndex"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesCooldown"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesSnoozedConditions"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesPageTargeting"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesPinnedElement"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "shouldTemporarilyHide"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesTriggerMatch"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesClickedElement"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isAnchorableStep"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "passesCustomThrottles"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "surveyThrottleLimit"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "guideThrottleLimit"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bypassCustomThrottles"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "screen"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endUser"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v1, Lcom/amplitude/android/engagement/types/LastEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/LastEvent$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v4, 0x12

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    sget-object v0, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const/4 v0, 0x2

    aput-object v1, v4, v0

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v1, 0x3

    aput-object v0, v4, v1

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const/4 v1, 0x6

    aput-object v0, v4, v1

    const/4 v1, 0x7

    aput-object v0, v4, v1

    const/16 v1, 0x8

    aput-object v0, v4, v1

    const/16 v1, 0x9

    aput-object v0, v4, v1

    const/16 v1, 0xa

    aput-object v0, v4, v1

    const/16 v1, 0xb

    aput-object v0, v4, v1

    const/16 v1, 0xc

    aput-object v0, v4, v1

    const/16 v1, 0xd

    aput-object v3, v4, v1

    const/16 v1, 0xe

    aput-object v2, v4, v1

    const/16 v1, 0xf

    aput-object v0, v4, v1

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v1, 0x10

    aput-object v0, v4, v1

    sget-object v0, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    const/16 v1, 0x11

    aput-object v0, v4, v1

    return-object v4
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/SimulationContext;
    .locals 39

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v8, 0xb

    const/16 v9, 0xa

    const/16 v10, 0x9

    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/16 v3, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;

    invoke-interface {v0, v1, v6, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    invoke-interface {v0, v1, v5, v6, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lcom/amplitude/android/engagement/types/LastEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/LastEvent$$serializer;

    invoke-interface {v0, v1, v4, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v14

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v13

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v8

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v15

    move-object/from16 v20, v2

    sget-object v2, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    move/from16 v21, v3

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    const/16 v7, 0x10

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v16, v2

    sget-object v2, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    move-object/from16 p1, v5

    move/from16 v17, v6

    const/4 v5, 0x0

    const/16 v6, 0x11

    invoke-interface {v0, v1, v6, v2, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0x3ffff

    move/from16 v33, v3

    move-object/from16 v34, v7

    move/from16 v29, v8

    move/from16 v28, v9

    move/from16 v27, v10

    move/from16 v25, v11

    move/from16 v24, v12

    move/from16 v23, v13

    move/from16 v22, v14

    move/from16 v30, v15

    move-object/from16 v14, v16

    move-object/from16 v3, v19

    move/from16 v26, v21

    move-object v15, v2

    move/from16 v21, v17

    move-object/from16 v2, v20

    move/from16 v17, v5

    move-object/from16 v5, p1

    goto/16 :goto_5

    :cond_0
    move v2, v5

    move-object v5, v7

    move v7, v6

    const/16 v6, 0x11

    move/from16 v38, v2

    move-object v2, v5

    move-object v4, v2

    move-object v14, v4

    move-object v15, v14

    move-object/from16 v24, v15

    move-object/from16 v25, v24

    move-object/from16 v28, v25

    move v5, v7

    move/from16 v21, v5

    move/from16 v23, v21

    move/from16 v30, v23

    move/from16 v31, v30

    move/from16 v32, v31

    move/from16 v33, v32

    move/from16 v34, v33

    move/from16 v35, v34

    move/from16 v36, v35

    move/from16 v37, v36

    :goto_0
    if-eqz v38, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v13, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    invoke-interface {v0, v1, v6, v13, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    const/high16 v13, 0x20000

    or-int/2addr v7, v13

    :goto_1
    const/4 v13, 0x5

    goto :goto_0

    :pswitch_1
    const/16 v13, 0x10

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    const/high16 v16, 0x10000

    or-int v7, v7, v16

    goto :goto_1

    :pswitch_2
    const/16 v6, 0xf

    const/16 v13, 0x10

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v21

    const v17, 0x8000

    or-int v7, v7, v17

    :goto_2
    const/16 v6, 0x11

    goto :goto_1

    :pswitch_3
    const/16 v13, 0x10

    sget-object v6, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    const/16 v13, 0xe

    invoke-interface {v0, v1, v13, v6, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit16 v7, v7, 0x4000

    goto :goto_2

    :pswitch_4
    const/16 v13, 0xe

    sget-object v6, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    const/16 v13, 0xd

    invoke-interface {v0, v1, v13, v6, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v7, v7, 0x2000

    goto :goto_2

    :pswitch_5
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v37

    or-int/lit16 v7, v7, 0x1000

    goto :goto_2

    :pswitch_6
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v30

    or-int/lit16 v7, v7, 0x800

    goto :goto_2

    :pswitch_7
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v31

    or-int/lit16 v7, v7, 0x400

    goto :goto_2

    :pswitch_8
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v32

    or-int/lit16 v7, v7, 0x200

    goto :goto_2

    :pswitch_9
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    or-int/lit16 v7, v7, 0x100

    goto :goto_2

    :pswitch_a
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v33

    or-int/lit16 v7, v7, 0x80

    goto :goto_2

    :pswitch_b
    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v34

    or-int/lit8 v7, v7, 0x40

    goto :goto_2

    :pswitch_c
    const/4 v3, 0x5

    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v35

    or-int/lit8 v7, v7, 0x20

    move v13, v3

    const/16 v3, 0x8

    const/16 v6, 0x11

    goto/16 :goto_0

    :pswitch_d
    const/4 v3, 0x4

    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v36

    or-int/lit8 v7, v7, 0x10

    :goto_3
    const/16 v3, 0x8

    goto/16 :goto_2

    :pswitch_e
    const/4 v3, 0x3

    const/16 v6, 0xc

    const/16 v13, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit8 v7, v7, 0x8

    goto :goto_3

    :pswitch_f
    const/16 v6, 0xc

    const/16 v13, 0xd

    sget-object v3, Lcom/amplitude/android/engagement/types/LastEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/LastEvent$$serializer;

    const/4 v6, 0x2

    invoke-interface {v0, v1, v6, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v7, v7, 0x4

    goto :goto_3

    :pswitch_10
    const/4 v6, 0x2

    const/16 v13, 0xd

    sget-object v3, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    move-object/from16 v6, v25

    const/4 v8, 0x1

    invoke-interface {v0, v1, v8, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    or-int/lit8 v7, v7, 0x2

    const/16 v3, 0x8

    const/16 v6, 0x11

    const/16 v8, 0xb

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v6, v25

    const/4 v8, 0x1

    const/16 v13, 0xd

    sget-object v3, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;

    move-object/from16 v8, v24

    const/4 v9, 0x0

    invoke-interface {v0, v1, v9, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    or-int/lit8 v7, v7, 0x1

    const/16 v3, 0x8

    :goto_4
    const/16 v6, 0x11

    const/16 v8, 0xb

    const/16 v9, 0xa

    goto/16 :goto_1

    :pswitch_12
    move-object/from16 v8, v24

    move-object/from16 v6, v25

    const/4 v9, 0x0

    move/from16 v38, v9

    goto :goto_4

    :cond_1
    move-object/from16 v8, v24

    move-object/from16 v6, v25

    move-object v3, v4

    move/from16 v26, v5

    move-object v5, v6

    move/from16 v17, v7

    move/from16 v29, v30

    move/from16 v27, v32

    move/from16 v25, v33

    move/from16 v24, v34

    move/from16 v22, v36

    move/from16 v30, v37

    move-object v4, v2

    move-object v2, v8

    move/from16 v33, v21

    move/from16 v21, v23

    move-object/from16 v34, v28

    move/from16 v28, v31

    move/from16 v23, v35

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v16, Lcom/amplitude/android/engagement/types/SimulationContext;

    move-object/from16 v18, v2

    check-cast v18, Lcom/amplitude/android/engagement/types/TriggerEvent;

    move-object/from16 v19, v5

    check-cast v19, Lcom/amplitude/android/engagement/types/Nudge;

    move-object/from16 v20, v4

    check-cast v20, Lcom/amplitude/android/engagement/types/LastEvent;

    move-object/from16 v31, v3

    check-cast v31, Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move-object/from16 v32, v14

    check-cast v32, Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move-object/from16 v35, v15

    check-cast v35, Lcom/amplitude/android/engagement/types/EndUser;

    const/16 v36, 0x0

    invoke-direct/range {v16 .. v36}, Lcom/amplitude/android/engagement/types/SimulationContext;-><init>(ILcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v16

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/SimulationContext;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/SimulationContext;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/SimulationContext;->write$Self(Lcom/amplitude/android/engagement/types/SimulationContext;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/SimulationContext;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/SimulationContext;)V

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
