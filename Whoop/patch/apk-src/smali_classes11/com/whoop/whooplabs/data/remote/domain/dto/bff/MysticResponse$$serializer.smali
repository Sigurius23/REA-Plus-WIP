.class public final synthetic Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "whooplabs_release"
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

.field public static final INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.whooplabs.data.remote.domain.dto.bff.MysticResponse"

    const/16 v3, 0x18

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "systolic_label_text"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolic_suffix_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolicMax"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolicMin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolic_too_high_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolic_too_low_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolicRequiredText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "systolic_required"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolic_label_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolic_suffix_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolicMax"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolicMin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolic_too_high_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolic_too_low_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolicRequiredText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "diastolic_required"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_label_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_suffix_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_max"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_min"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_too_high_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_too_low_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_required_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heart_rate_required"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    const/16 v0, 0x18

    new-array v0, v0, [Lwc3/c;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v1, v0, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v4, 0x7

    aput-object v3, v0, v4

    const/16 v4, 0x8

    aput-object v1, v0, v4

    const/16 v4, 0x9

    aput-object v1, v0, v4

    const/16 v4, 0xa

    aput-object v2, v0, v4

    const/16 v4, 0xb

    aput-object v2, v0, v4

    const/16 v4, 0xc

    aput-object v1, v0, v4

    const/16 v4, 0xd

    aput-object v1, v0, v4

    const/16 v4, 0xe

    aput-object v1, v0, v4

    const/16 v4, 0xf

    aput-object v3, v0, v4

    const/16 v4, 0x10

    aput-object v1, v0, v4

    const/16 v4, 0x11

    aput-object v1, v0, v4

    const/16 v4, 0x12

    aput-object v2, v0, v4

    const/16 v4, 0x13

    aput-object v2, v0, v4

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const/16 v1, 0x17

    aput-object v3, v0, v1

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
    .locals 74

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v10, 0xc

    const/16 v11, 0xb

    const/16 v12, 0xa

    const/16 v13, 0x9

    const/4 v14, 0x7

    const/4 v15, 0x6

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/16 v6, 0x8

    const/4 v5, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v4

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v14

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v11

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v22, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v2

    move/from16 v20, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v17, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    move/from16 v16, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 p1, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v23, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v2

    const v25, 0xffffff

    move-object/from16 v69, p1

    move/from16 v72, v2

    move-object/from16 v54, v3

    move/from16 v52, v4

    move-object/from16 v53, v5

    move-object/from16 v57, v6

    move/from16 v51, v7

    move-object/from16 v50, v8

    move-object/from16 v55, v9

    move-object/from16 v61, v10

    move/from16 v60, v11

    move/from16 v59, v12

    move-object/from16 v58, v13

    move/from16 v56, v14

    move-object/from16 v62, v15

    move/from16 v68, v16

    move/from16 v67, v17

    move-object/from16 v66, v18

    move-object/from16 v65, v19

    move/from16 v64, v20

    move-object/from16 v63, v21

    move-object/from16 v49, v22

    move-object/from16 v70, v23

    move-object/from16 v71, v24

    move/from16 v48, v25

    goto/16 :goto_4

    :cond_0
    const/4 v2, 0x0

    move-object/from16 v23, v2

    move-object/from16 v25, v23

    move-object/from16 v26, v25

    move-object/from16 v29, v26

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v33, v31

    move-object/from16 v35, v33

    move-object/from16 v36, v35

    move-object/from16 v38, v36

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v43, v40

    move-object/from16 v45, v43

    move/from16 v47, v8

    move/from16 v24, v9

    move/from16 v27, v24

    move/from16 v28, v27

    move/from16 v32, v28

    move/from16 v34, v32

    move/from16 v37, v34

    move/from16 v41, v37

    move/from16 v42, v41

    move/from16 v44, v42

    :goto_0
    if-eqz v47, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v8, 0x17

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v32

    const/high16 v8, 0x800000

    :goto_1
    or-int/2addr v9, v8

    :goto_2
    const/4 v8, 0x1

    goto :goto_0

    :pswitch_1
    const/16 v8, 0x16

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v31

    const/high16 v8, 0x400000

    goto :goto_1

    :pswitch_2
    const/16 v8, 0x15

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    const/high16 v8, 0x200000

    goto :goto_1

    :pswitch_3
    const/16 v8, 0x14

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    const/high16 v49, 0x100000

    or-int v9, v9, v49

    goto :goto_2

    :pswitch_4
    const/16 v8, 0x13

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v28

    const/high16 v16, 0x80000

    or-int v9, v9, v16

    goto :goto_2

    :pswitch_5
    const/16 v8, 0x12

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v27

    const/high16 v17, 0x40000

    or-int v9, v9, v17

    goto :goto_2

    :pswitch_6
    const/16 v8, 0x11

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    const/high16 v18, 0x20000

    or-int v9, v9, v18

    goto :goto_2

    :pswitch_7
    const/16 v8, 0x10

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    const/high16 v19, 0x10000

    or-int v9, v9, v19

    goto :goto_2

    :pswitch_8
    const/16 v8, 0xf

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v24

    const v20, 0x8000

    or-int v9, v9, v20

    goto :goto_2

    :pswitch_9
    const/16 v8, 0xe

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit16 v9, v9, 0x4000

    goto :goto_2

    :pswitch_a
    const/16 v8, 0xd

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v45

    or-int/lit16 v9, v9, 0x2000

    goto :goto_2

    :pswitch_b
    const/16 v8, 0xd

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v40

    or-int/lit16 v9, v9, 0x1000

    goto :goto_2

    :pswitch_c
    const/16 v8, 0xd

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v41

    or-int/lit16 v9, v9, 0x800

    goto :goto_2

    :pswitch_d
    const/16 v8, 0xd

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v42

    or-int/lit16 v9, v9, 0x400

    goto/16 :goto_2

    :pswitch_e
    const/16 v8, 0xd

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v43

    or-int/lit16 v9, v9, 0x200

    goto/16 :goto_2

    :pswitch_f
    const/16 v8, 0xd

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit16 v9, v9, 0x100

    goto/16 :goto_2

    :pswitch_10
    const/16 v8, 0xd

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v44

    or-int/lit16 v9, v9, 0x80

    goto/16 :goto_2

    :pswitch_11
    const/16 v8, 0xd

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v39

    or-int/lit8 v9, v9, 0x40

    goto/16 :goto_2

    :pswitch_12
    const/16 v8, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v33

    or-int/lit8 v9, v9, 0x20

    goto/16 :goto_2

    :pswitch_13
    const/16 v8, 0xd

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v35

    or-int/lit8 v9, v9, 0x10

    goto/16 :goto_2

    :pswitch_14
    const/16 v8, 0xd

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v34

    or-int/lit8 v9, v9, 0x8

    goto/16 :goto_2

    :pswitch_15
    const/16 v8, 0xd

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v37

    or-int/lit8 v9, v9, 0x4

    goto/16 :goto_2

    :pswitch_16
    const/4 v3, 0x1

    const/16 v8, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v38

    or-int/lit8 v9, v9, 0x2

    move v8, v3

    :goto_3
    const/4 v3, 0x5

    goto/16 :goto_0

    :pswitch_17
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v8, 0xd

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v46

    or-int/lit8 v9, v9, 0x1

    move v8, v3

    move-object/from16 v2, v46

    goto :goto_3

    :pswitch_18
    const/16 v46, 0x0

    move/from16 v47, v46

    goto/16 :goto_2

    :cond_1
    move-object/from16 v49, v2

    move/from16 v48, v9

    move-object/from16 v63, v23

    move/from16 v64, v24

    move-object/from16 v65, v25

    move-object/from16 v66, v26

    move/from16 v67, v27

    move/from16 v68, v28

    move-object/from16 v69, v29

    move-object/from16 v70, v30

    move-object/from16 v71, v31

    move/from16 v72, v32

    move-object/from16 v54, v33

    move/from16 v52, v34

    move-object/from16 v53, v35

    move-object/from16 v57, v36

    move/from16 v51, v37

    move-object/from16 v50, v38

    move-object/from16 v55, v39

    move-object/from16 v61, v40

    move/from16 v60, v41

    move/from16 v59, v42

    move-object/from16 v58, v43

    move/from16 v56, v44

    move-object/from16 v62, v45

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v47, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    const/16 v73, 0x0

    invoke-direct/range {v47 .. v73}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;-><init>(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v47

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;)V

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
