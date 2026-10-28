.class public final Lcom/amplitude/android/engagement/types/Nudge$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/Nudge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/Nudge;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/Nudge.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/Nudge;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/Nudge;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/Nudge;)V",
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

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.amplitude.android.engagement.types.Nudge"

    const/16 v3, 0x14

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "variantId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "steps"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "flagKey"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "archived"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "position"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "priority"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "showStepCounter"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stepCounterFormat"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isCarousel"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isDismissible"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isSnoozable"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "snoozeLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "type"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "customThemeId"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "variant"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "lifecycleConfig"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "triggerConfig"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pageTargeting"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "temporarilyHideTargeting"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/Nudge;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v2, 0x2

    aget-object v3, v0, v2

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    const/4 v6, 0x5

    aget-object v7, v0, v6

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    const/16 v9, 0x8

    aget-object v10, v0, v9

    const/16 v11, 0xd

    aget-object v0, v0, v11

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    sget-object v13, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;

    invoke-static {v13}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    sget-object v14, Llj/r0;->a:Llj/r0;

    invoke-static {v14}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    sget-object v15, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    move/from16 v17, v2

    const/16 v2, 0x14

    new-array v2, v2, [Lwc3/c;

    sget-object v18, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v19, 0x0

    aput-object v18, v2, v19

    const/16 v19, 0x1

    aput-object v1, v2, v19

    aput-object v3, v2, v17

    const/4 v1, 0x3

    aput-object v18, v2, v1

    const/4 v1, 0x4

    aput-object v5, v2, v1

    aput-object v7, v2, v6

    const/4 v1, 0x6

    aput-object v8, v2, v1

    const/4 v1, 0x7

    aput-object v4, v2, v1

    aput-object v10, v2, v9

    const/16 v1, 0x9

    aput-object v4, v2, v1

    const/16 v1, 0xa

    aput-object v4, v2, v1

    const/16 v1, 0xb

    aput-object v4, v2, v1

    const/16 v1, 0xc

    aput-object v18, v2, v1

    aput-object v0, v2, v11

    const/16 v0, 0xe

    aput-object v12, v2, v0

    const/16 v0, 0xf

    aput-object v18, v2, v0

    const/16 v0, 0x10

    aput-object v13, v2, v0

    const/16 v0, 0x11

    aput-object v14, v2, v0

    const/16 v0, 0x12

    aput-object v16, v2, v0

    const/16 v0, 0x13

    aput-object v15, v2, v0

    return-object v2
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/Nudge;
    .locals 62

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/amplitude/android/engagement/types/Nudge;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v12, 0x9

    const/4 v13, 0x7

    const/4 v14, 0x6

    const/4 v15, 0x3

    const/4 v5, 0x4

    const/4 v4, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x2

    const/16 v21, 0xd

    const/4 v6, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v6

    aget-object v9, v2, v8

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v8, v9, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    sget-object v15, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v5, v15, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    aget-object v15, v2, v4

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v14, v15, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v13

    aget-object v24, v2, v7

    move-object/from16 v11, v24

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v7, v11, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v11

    const/16 v12, 0xa

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v12

    const/16 v10, 0xb

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v10

    move-object/from16 v25, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    aget-object v22, v25, v21

    move-object/from16 v23, v2

    move-object/from16 v2, v22

    check-cast v2, Lwc3/b;

    move-object/from16 v22, v3

    move/from16 v3, v21

    move-object/from16 v21, v9

    const/4 v9, 0x0

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v15, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v19, v2

    sget-object v2, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;

    move-object/from16 v20, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Llj/r0;->a:Llj/r0;

    move-object/from16 v18, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v16, v6

    const/16 v6, 0x13

    invoke-interface {v0, v1, v6, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v6, 0xfffff

    move/from16 v40, v6

    move/from16 v52, v10

    move/from16 v50, v11

    move/from16 v51, v12

    move/from16 v48, v13

    move-object/from16 v56, v15

    move/from16 v42, v16

    move-object/from16 v44, v21

    move-object/from16 v41, v22

    move-object/from16 v53, v23

    move-object v12, v2

    move-object v10, v3

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    goto/16 :goto_7

    :cond_0
    move-object/from16 v25, v2

    move v2, v6

    move v3, v9

    move-object v9, v10

    const/16 v6, 0x13

    move/from16 v38, v2

    move/from16 v29, v3

    move/from16 v34, v29

    move/from16 v35, v34

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v31, v4

    move/from16 v33, v7

    move/from16 v27, v8

    move-object v2, v9

    move-object v4, v2

    move-object v5, v4

    move-object v7, v5

    move-object v8, v7

    move-object v10, v8

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v26, v15

    move-object/from16 v30, v26

    move-object/from16 v32, v30

    move/from16 v9, v37

    move-object/from16 v3, v32

    :goto_0
    if-eqz v38, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    move-object/from16 v39, v11

    const/16 v11, 0x13

    invoke-interface {v0, v1, v11, v6, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/high16 v6, 0x80000

    or-int/2addr v9, v6

    move v6, v11

    move-object/from16 v11, v39

    goto :goto_0

    :pswitch_1
    move-object/from16 v39, v11

    const/16 v11, 0x13

    sget-object v6, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    const/16 v11, 0x12

    invoke-interface {v0, v1, v11, v6, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    const/high16 v6, 0x40000

    :goto_1
    or-int/2addr v9, v6

    :goto_2
    move-object/from16 v11, v39

    const/16 v6, 0x13

    goto :goto_0

    :pswitch_2
    move-object/from16 v39, v11

    const/16 v11, 0x12

    sget-object v6, Llj/r0;->a:Llj/r0;

    const/16 v11, 0x11

    invoke-interface {v0, v1, v11, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/high16 v6, 0x20000

    goto :goto_1

    :pswitch_3
    move-object/from16 v39, v11

    const/16 v11, 0x11

    sget-object v6, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;

    const/16 v11, 0x10

    invoke-interface {v0, v1, v11, v6, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    const/high16 v6, 0x10000

    goto :goto_1

    :pswitch_4
    move-object/from16 v39, v11

    const/16 v6, 0xf

    const/16 v11, 0x10

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v32

    const v18, 0x8000

    or-int v9, v9, v18

    goto :goto_2

    :pswitch_5
    move-object/from16 v39, v11

    const/16 v11, 0x10

    sget-object v6, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v11, 0xe

    invoke-interface {v0, v1, v11, v6, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit16 v9, v9, 0x4000

    goto :goto_2

    :pswitch_6
    move-object/from16 v39, v11

    const/16 v6, 0xd

    const/16 v11, 0xe

    aget-object v20, v25, v6

    move-object/from16 v11, v20

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v6, v11, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v9, v9, 0x2000

    goto :goto_2

    :pswitch_7
    move-object/from16 v39, v11

    const/16 v6, 0xd

    const/16 v11, 0xc

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit16 v9, v9, 0x1000

    goto :goto_2

    :pswitch_8
    move-object/from16 v39, v11

    const/16 v6, 0xb

    const/16 v11, 0xc

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v29

    or-int/lit16 v9, v9, 0x800

    goto :goto_2

    :pswitch_9
    move-object/from16 v39, v11

    const/16 v6, 0xa

    const/16 v11, 0xc

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v36

    or-int/lit16 v9, v9, 0x400

    goto :goto_2

    :pswitch_a
    move-object/from16 v39, v11

    const/16 v6, 0x9

    const/16 v11, 0xc

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v35

    or-int/lit16 v9, v9, 0x200

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v39, v11

    const/16 v6, 0x9

    const/16 v11, 0xc

    aget-object v22, v25, v33

    move-object/from16 v6, v22

    check-cast v6, Lwc3/b;

    move/from16 v11, v33

    invoke-interface {v0, v1, v11, v6, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit16 v9, v9, 0x100

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v39, v11

    move/from16 v11, v33

    const/4 v6, 0x7

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v37

    or-int/lit16 v9, v9, 0x80

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v39, v11

    move/from16 v11, v33

    sget-object v6, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v11, 0x6

    invoke-interface {v0, v1, v11, v6, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v9, v9, 0x40

    :goto_3
    move-object/from16 v11, v39

    const/16 v6, 0x13

    :goto_4
    const/16 v33, 0x8

    goto/16 :goto_0

    :pswitch_e
    move-object/from16 v39, v11

    const/4 v11, 0x6

    aget-object v6, v25, v31

    check-cast v6, Lwc3/b;

    move/from16 v11, v31

    invoke-interface {v0, v1, v11, v6, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit8 v9, v9, 0x20

    goto :goto_3

    :pswitch_f
    move-object/from16 v39, v11

    move/from16 v11, v31

    sget-object v6, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v11, 0x4

    invoke-interface {v0, v1, v11, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v9, v9, 0x10

    :goto_5
    move-object/from16 v11, v39

    :goto_6
    const/16 v6, 0x13

    const/16 v31, 0x5

    goto :goto_4

    :pswitch_10
    move-object/from16 v39, v11

    const/4 v6, 0x3

    const/4 v11, 0x4

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v9, v9, 0x8

    goto :goto_5

    :pswitch_11
    move-object/from16 v39, v11

    const/4 v6, 0x3

    const/4 v11, 0x4

    aget-object v28, v25, v27

    move-object/from16 v6, v28

    check-cast v6, Lwc3/b;

    move/from16 v11, v27

    invoke-interface {v0, v1, v11, v6, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v9, v9, 0x4

    goto :goto_5

    :pswitch_12
    move-object/from16 v39, v11

    move/from16 v11, v27

    const/4 v6, 0x1

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v34

    or-int/lit8 v9, v9, 0x2

    goto :goto_5

    :pswitch_13
    move/from16 v11, v27

    const/4 v6, 0x0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v9, v9, 0x1

    move-object/from16 v11, v24

    goto :goto_6

    :pswitch_14
    move-object/from16 v39, v11

    const/4 v6, 0x0

    move/from16 v38, v6

    goto :goto_6

    :cond_1
    move-object/from16 v39, v11

    move-object/from16 v17, v7

    move/from16 v40, v9

    move-object/from16 v18, v13

    move-object/from16 v44, v26

    move/from16 v52, v29

    move-object/from16 v53, v30

    move-object/from16 v56, v32

    move/from16 v42, v34

    move/from16 v50, v35

    move/from16 v51, v36

    move/from16 v48, v37

    move-object/from16 v41, v39

    move-object v7, v5

    move-object v5, v2

    move-object v2, v4

    move-object v4, v8

    move-object v8, v3

    move-object v3, v14

    move-object v14, v15

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v39, Lcom/amplitude/android/engagement/types/Nudge;

    move-object/from16 v43, v8

    check-cast v43, Ljava/util/List;

    move-object/from16 v45, v5

    check-cast v45, Ljava/lang/Boolean;

    move-object/from16 v46, v4

    check-cast v46, Lcom/amplitude/android/engagement/types/NudgePosition;

    move-object/from16 v47, v14

    check-cast v47, Ljava/lang/Integer;

    move-object/from16 v49, v7

    check-cast v49, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    move-object/from16 v54, v2

    check-cast v54, Lcom/amplitude/android/engagement/types/NudgeType;

    move-object/from16 v55, v3

    check-cast v55, Ljava/lang/Integer;

    move-object/from16 v57, v18

    check-cast v57, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-object/from16 v58, v17

    check-cast v58, Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-object/from16 v59, v12

    check-cast v59, Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    move-object/from16 v60, v10

    check-cast v60, Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    const/16 v61, 0x0

    invoke-direct/range {v39 .. v61}, Lcom/amplitude/android/engagement/types/Nudge;-><init>(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v39

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/Nudge;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/Nudge;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/Nudge;->write$Self(Lcom/amplitude/android/engagement/types/Nudge;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/Nudge;)V

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
