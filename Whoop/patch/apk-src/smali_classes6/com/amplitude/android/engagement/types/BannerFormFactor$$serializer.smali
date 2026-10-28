.class public final Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/types/BannerFormFactor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/amplitude/android/engagement/types/BannerFormFactor;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/amplitude/android/engagement/types/BannerFormFactor.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/amplitude/android/engagement/types/BannerFormFactor;",
        "<init>",
        "()V",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/amplitude/android/engagement/types/BannerFormFactor;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/amplitude/android/engagement/types/BannerFormFactor;)V",
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

.field public static final INSTANCE:Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;

    invoke-direct {v0}, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "banner"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "position"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "placement"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sticky"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

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

    sput-object v1, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lwc3/c;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/BannerFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    aget-object v4, v0, v3

    const/4 v5, 0x3

    aget-object v6, v0, v5

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    const/4 v9, 0x6

    aget-object v10, v0, v9

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    const/4 v11, 0x7

    aget-object v0, v0, v11

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v12, 0x8

    new-array v12, v12, [Lwc3/c;

    aput-object v2, v12, v1

    aput-object v4, v12, v3

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v2, 0x2

    aput-object v1, v12, v2

    aput-object v6, v12, v5

    const/4 v1, 0x4

    aput-object v8, v12, v1

    const/4 v1, 0x5

    aput-object v7, v12, v1

    aput-object v10, v12, v9

    aput-object v0, v12, v11

    return-object v12
.end method

.method public deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/BannerFormFactor;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/amplitude/android/engagement/types/BannerFormFactor;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v11

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v11, v3, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aget-object v11, v2, v10

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v10, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    aget-object v11, v2, v9

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v9, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v1, v4, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aget-object v11, v2, v8

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v8, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    aget-object v2, v2, v7

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v7, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v7, 0xff

    move-object v14, v10

    move v10, v6

    goto/16 :goto_5

    :cond_0
    move/from16 v18, v9

    move/from16 v16, v10

    move/from16 v19, v16

    move/from16 p1, v11

    move/from16 v3, p1

    move-object v6, v12

    move-object v9, v6

    move-object v10, v9

    move-object v13, v10

    move-object v14, v13

    move-object v15, v14

    move v12, v3

    move-object v11, v15

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v5, v2, v7

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v7, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v12, v12, 0x80

    :goto_1
    const/4 v5, 0x4

    goto :goto_0

    :pswitch_1
    aget-object v5, v2, v8

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v8, v5, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit8 v12, v12, 0x40

    goto :goto_1

    :pswitch_2
    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v5, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit8 v12, v12, 0x20

    goto :goto_1

    :pswitch_3
    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v5, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v12, v12, 0x10

    move v5, v4

    const/4 v4, 0x5

    goto :goto_0

    :pswitch_4
    const/4 v4, 0x4

    aget-object v5, v2, v18

    check-cast v5, Lwc3/b;

    move/from16 v4, v18

    invoke-interface {v0, v1, v4, v5, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v12, v12, 0x8

    :goto_2
    const/4 v4, 0x5

    goto :goto_1

    :pswitch_5
    move/from16 v4, v18

    const/4 v5, 0x2

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    or-int/lit8 v12, v12, 0x4

    goto :goto_2

    :pswitch_6
    move/from16 v4, v18

    const/4 v5, 0x2

    aget-object v17, v2, v16

    move-object/from16 v4, v17

    check-cast v4, Lwc3/b;

    move/from16 v5, v16

    invoke-interface {v0, v1, v5, v4, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit8 v12, v12, 0x2

    const/4 v4, 0x5

    const/4 v5, 0x4

    :goto_3
    const/16 v18, 0x3

    goto :goto_0

    :pswitch_7
    move/from16 v5, v16

    aget-object v4, v2, p1

    check-cast v4, Lwc3/b;

    move/from16 v5, p1

    invoke-interface {v0, v1, v5, v4, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v12, v12, 0x1

    const/4 v4, 0x5

    :goto_4
    const/4 v5, 0x4

    const/16 v16, 0x1

    goto :goto_3

    :pswitch_8
    move/from16 v5, p1

    move/from16 v19, p1

    goto :goto_4

    :cond_1
    move-object v8, v6

    move-object v2, v9

    move-object v4, v10

    move-object v5, v11

    move v7, v12

    move-object v9, v15

    move v10, v3

    move-object v3, v13

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v6, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    check-cast v3, Lcom/amplitude/android/engagement/types/BannerPosition;

    check-cast v14, Lcom/amplitude/android/engagement/types/BannerPlacement;

    move-object v11, v9

    check-cast v11, Lcom/amplitude/android/engagement/types/NudgeStepLayout;

    move-object v12, v5

    check-cast v12, Ljava/lang/String;

    move-object v13, v4

    check-cast v13, Ljava/lang/String;

    check-cast v8, Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-object v15, v2

    check-cast v15, Lcom/amplitude/android/engagement/types/ContentAlignment;

    const/16 v16, 0x0

    move-object v9, v14

    move-object v14, v8

    move-object v8, v3

    invoke-direct/range {v6 .. v16}, Lcom/amplitude/android/engagement/types/BannerFormFactor;-><init>(ILcom/amplitude/android/engagement/types/BannerPosition;Lcom/amplitude/android/engagement/types/BannerPlacement;ZLcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v6

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->deserialize(Lzc3/d;)Lcom/amplitude/android/engagement/types/BannerFormFactor;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/BannerFormFactor;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/amplitude/android/engagement/types/BannerFormFactor;->write$Self(Lcom/amplitude/android/engagement/types/BannerFormFactor;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    invoke-virtual {p0, p1, p2}, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->serialize(Lzc3/e;Lcom/amplitude/android/engagement/types/BannerFormFactor;)V

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
