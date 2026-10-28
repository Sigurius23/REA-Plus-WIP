.class public final Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/ModalFormFactor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/ModalFormFactor;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/ModalFormFactor.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/ModalFormFactor;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/ModalFormFactor;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/ModalFormFactor;)V",
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

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "modal"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "layout"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "textAnimation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mediaPosition"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleAlignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "contentAlignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "canClickOutsideToClose"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/ModalFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v5, 0x3

    aget-object v6, v0, v5

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/4 v7, 0x4

    aget-object v0, v0, v7

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v8, 0x6

    new-array v8, v8, [Lwc3/c;

    aput-object v2, v8, v1

    const/4 v1, 0x1

    aput-object v4, v8, v1

    const/4 v1, 0x2

    aput-object v3, v8, v1

    aput-object v6, v8, v5

    aput-object v0, v8, v7

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v1, 0x5

    aput-object v0, v8, v1

    return-object v8
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/ModalFormFactor;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/amplitude/android/engagement/types/ModalFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x5

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v9

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v9, v3, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v0, v1, v5, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    aget-object v9, v2, v6

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v6, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aget-object v2, v2, v7

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v7, v2, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v4

    const/16 v7, 0x3f

    move v11, v4

    goto/16 :goto_3

    :cond_0
    move/from16 v16, v8

    move v3, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move v10, v3

    :goto_0
    if-eqz v16, :cond_1

    move/from16 p1, v9

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    or-int/lit8 v10, v10, 0x20

    :goto_1
    move/from16 v9, p1

    goto :goto_0

    :pswitch_1
    aget-object v9, v2, v7

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v7, v9, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v10, v10, 0x10

    goto :goto_1

    :pswitch_2
    aget-object v9, v2, v6

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v6, v9, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit8 v10, v10, 0x8

    goto :goto_1

    :pswitch_3
    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v10, v10, 0x4

    goto :goto_1

    :pswitch_4
    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v9, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v10, v10, 0x2

    goto :goto_1

    :pswitch_5
    aget-object v9, v2, p1

    check-cast v9, Lwc3/b;

    move/from16 v4, p1

    invoke-interface {v0, v1, v4, v9, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v10, v10, 0x1

    move v9, v4

    :goto_2
    const/4 v4, 0x5

    goto :goto_0

    :pswitch_6
    move/from16 v4, p1

    move v9, v4

    move/from16 v16, v9

    goto :goto_2

    :cond_1
    move-object v2, v11

    move v11, v3

    move-object v3, v2

    move v7, v10

    move-object v8, v12

    move-object v5, v13

    move-object v6, v14

    move-object v2, v15

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v4, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    check-cast v3, Lcom/amplitude/android/engagement/types/NudgeStepLayout;

    check-cast v8, Ljava/lang/String;

    check-cast v5, Ljava/lang/String;

    move-object v9, v6

    check-cast v9, Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-object v10, v2

    check-cast v10, Lcom/amplitude/android/engagement/types/ContentAlignment;

    const/4 v12, 0x0

    move-object v6, v8

    move-object v8, v5

    move v5, v7

    move-object v7, v6

    move-object v6, v3

    invoke-direct/range {v4 .. v12}, Lcom/amplitude/android/engagement/types/ModalFormFactor;-><init>(ILcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v4

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/ModalFormFactor;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/ModalFormFactor;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/ModalFormFactor;->write$Self(Lcom/amplitude/android/engagement/types/ModalFormFactor;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/ModalFormFactor;)V

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
