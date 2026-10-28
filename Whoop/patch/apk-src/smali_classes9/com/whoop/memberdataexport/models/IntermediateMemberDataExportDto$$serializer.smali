.class public final synthetic Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/memberdataexport/models/IntermediateMemberDataExportDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "member-data-export_release"
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

.field public static final INSTANCE:Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->INSTANCE:Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.memberdataexport.models.IntermediateMemberDataExportDto"

    const/16 v3, 0x13

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "state"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "screenTitleDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "headlineDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bodyDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learnMoreTextDisplay"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "learnMoreLink"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updateAccountTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updateAccountLink"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "confirmationTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recipientEmailDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "recipientEmailLabelDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submitButtonTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submissionLoadingTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "submissionSuccessTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "exportUnavailableSectionIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "exportUnavailableSectionHeadlineDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "exportUnavailableSectionBodyDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "helpLinkTextDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "helpLink"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 18
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

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    move-object/from16 v16, v0

    const/16 v0, 0x13

    new-array v0, v0, [Lwc3/c;

    const/16 v17, 0x0

    aput-object v16, v0, v17

    const/16 v17, 0x1

    aput-object v16, v0, v17

    const/16 v17, 0x2

    aput-object v16, v0, v17

    const/16 v17, 0x3

    aput-object v16, v0, v17

    const/16 v16, 0x4

    aput-object v1, v0, v16

    const/4 v1, 0x5

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v3, v0, v1

    const/4 v1, 0x7

    aput-object v4, v0, v1

    const/16 v1, 0x8

    aput-object v5, v0, v1

    const/16 v1, 0x9

    aput-object v6, v0, v1

    const/16 v1, 0xa

    aput-object v7, v0, v1

    const/16 v1, 0xb

    aput-object v8, v0, v1

    const/16 v1, 0xc

    aput-object v9, v0, v1

    const/16 v1, 0xd

    aput-object v10, v0, v1

    const/16 v1, 0xe

    aput-object v11, v0, v1

    const/16 v1, 0xf

    aput-object v12, v0, v1

    const/16 v1, 0x10

    aput-object v13, v0, v1

    const/16 v1, 0x11

    aput-object v14, v0, v1

    const/16 v1, 0x12

    aput-object v15, v0, v1

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;
    .locals 57

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v9, 0xb

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v4, 0x8

    const/4 v3, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v3, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v11, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    move-object/from16 v22, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v21, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v16, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v15, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v8, 0x7ffff

    move-object/from16 v55, v2

    move-object/from16 v41, v3

    move-object/from16 v45, v4

    move-object/from16 v39, v5

    move-object/from16 v38, v6

    move-object/from16 v40, v7

    move-object/from16 v48, v9

    move-object/from16 v47, v10

    move-object/from16 v46, v11

    move-object/from16 v44, v12

    move-object/from16 v43, v13

    move-object/from16 v42, v14

    move-object/from16 v54, v16

    move-object/from16 v53, v17

    move-object/from16 v52, v18

    move-object/from16 v51, v19

    move-object/from16 v50, v20

    move-object/from16 v49, v21

    move-object/from16 v37, v22

    :goto_0
    move/from16 v36, v8

    goto/16 :goto_6

    :cond_0
    move/from16 v32, v6

    move-object v2, v8

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v29, v24

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move v8, v7

    move-object/from16 v7, v31

    :goto_1
    if-eqz v32, :cond_1

    move-object/from16 v33, v5

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v34, v15

    const/16 v15, 0x12

    invoke-interface {v0, v1, v15, v5, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    const/high16 v5, 0x40000

    :goto_2
    or-int/2addr v8, v5

    :goto_3
    move-object/from16 v5, v33

    move-object/from16 v15, v34

    goto :goto_1

    :pswitch_1
    move-object/from16 v34, v15

    const/16 v15, 0x12

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x11

    invoke-interface {v0, v1, v15, v5, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    const/high16 v5, 0x20000

    goto :goto_2

    :pswitch_2
    move-object/from16 v34, v15

    const/16 v15, 0x11

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x10

    invoke-interface {v0, v1, v15, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v5, 0x10000

    goto :goto_2

    :pswitch_3
    move-object/from16 v34, v15

    const/16 v15, 0x10

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xf

    invoke-interface {v0, v1, v15, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    const v5, 0x8000

    goto :goto_2

    :pswitch_4
    move-object/from16 v34, v15

    const/16 v15, 0xf

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xe

    invoke-interface {v0, v1, v15, v5, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x4000

    goto :goto_3

    :pswitch_5
    move-object/from16 v34, v15

    const/16 v15, 0xe

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15, v5, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x2000

    goto :goto_3

    :pswitch_6
    move-object/from16 v34, v15

    const/16 v15, 0xd

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15, v5, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x1000

    goto :goto_3

    :pswitch_7
    move-object/from16 v34, v15

    const/16 v15, 0xc

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v5, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x800

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v34, v15

    const/16 v15, 0xb

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v5, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x400

    goto/16 :goto_3

    :pswitch_9
    move-object/from16 v34, v15

    const/16 v15, 0xa

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x9

    invoke-interface {v0, v1, v15, v5, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x200

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v34, v15

    const/16 v15, 0x9

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x8

    invoke-interface {v0, v1, v15, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x100

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v34, v15

    const/16 v15, 0x8

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v15, v34

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v5, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x80

    move-object/from16 v2, v28

    move-object/from16 v5, v33

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v28, v2

    const/4 v2, 0x7

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v2, v33

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x40

    :goto_4
    move-object/from16 v3, v27

    move-object/from16 v2, v28

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v33

    const/4 v3, 0x6

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v26, v2

    move-object/from16 v3, v31

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v31, v3

    check-cast v31, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x20

    :goto_5
    move-object/from16 v5, v26

    goto :goto_4

    :pswitch_e
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v31

    move-object/from16 v26, v33

    const/4 v2, 0x5

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v25, v3

    move-object/from16 v2, v30

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x10

    move-object/from16 v31, v25

    goto :goto_5

    :pswitch_f
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v26, v33

    const/4 v3, 0x4

    const/4 v5, 0x3

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v8, v8, 0x8

    goto :goto_5

    :pswitch_10
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v26, v33

    const/4 v3, 0x2

    const/4 v5, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v8, v8, 0x4

    goto :goto_5

    :pswitch_11
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v26, v33

    const/4 v3, 0x1

    const/4 v5, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v8, v8, 0x2

    goto :goto_5

    :pswitch_12
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v26, v33

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v8, v8, 0x1

    goto :goto_5

    :pswitch_13
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v26, v33

    const/4 v3, 0x0

    const/4 v5, 0x3

    move/from16 v32, v3

    goto :goto_5

    :cond_1
    move-object/from16 v28, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v5

    move-object/from16 v2, v30

    move-object/from16 v25, v31

    move-object/from16 v41, v2

    move-object/from16 v49, v4

    move-object/from16 v55, v6

    move-object/from16 v54, v7

    move-object/from16 v52, v9

    move-object/from16 v51, v10

    move-object/from16 v50, v11

    move-object/from16 v48, v12

    move-object/from16 v47, v13

    move-object/from16 v46, v14

    move-object/from16 v44, v15

    move-object/from16 v38, v22

    move-object/from16 v39, v23

    move-object/from16 v40, v24

    move-object/from16 v42, v25

    move-object/from16 v43, v26

    move-object/from16 v45, v27

    move-object/from16 v53, v28

    move-object/from16 v37, v29

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v35, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    const/16 v56, 0x0

    invoke-direct/range {v35 .. v56}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v35

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->write$Self$member_data_export_release(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)V

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
