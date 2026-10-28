.class public final synthetic Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/hcaptcha/config/HCaptchaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/stripe/hcaptcha/config/HCaptchaConfig.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "hcaptcha_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;

    invoke-direct {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->INSTANCE:Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.stripe.hcaptcha.config.HCaptchaConfig"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "siteKey"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sentry"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "loading"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hideDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rqdata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "jsSrc"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endpoint"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "reportapi"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "assethost"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imghost"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "locale"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "size"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "orientation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "theme"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "host"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "customTheme"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tokenExpiration"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disableHardwareAcceleration"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->access$get$childSerializers$cp()[Lwc3/c;

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

    const/16 v7, 0xb

    aget-object v8, v0, v7

    const/16 v9, 0xc

    aget-object v10, v0, v9

    const/16 v11, 0xd

    aget-object v0, v0, v11

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    const/16 v14, 0x12

    new-array v14, v14, [Lwc3/c;

    const/4 v15, 0x0

    aput-object v1, v14, v15

    sget-object v15, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v16, 0x1

    aput-object v15, v14, v16

    const/16 v16, 0x2

    aput-object v15, v14, v16

    const/16 v16, 0x3

    aput-object v15, v14, v16

    const/16 v16, 0x4

    aput-object v2, v14, v16

    const/4 v2, 0x5

    aput-object v1, v14, v2

    const/4 v2, 0x6

    aput-object v3, v14, v2

    const/4 v2, 0x7

    aput-object v4, v14, v2

    const/16 v2, 0x8

    aput-object v5, v14, v2

    const/16 v2, 0x9

    aput-object v6, v14, v2

    const/16 v2, 0xa

    aput-object v1, v14, v2

    aput-object v8, v14, v7

    aput-object v10, v14, v9

    aput-object v0, v14, v11

    const/16 v0, 0xe

    aput-object v12, v14, v0

    const/16 v0, 0xf

    aput-object v13, v14, v0

    sget-object v0, Lw40/a;->a:Lw40/a;

    const/16 v1, 0x10

    aput-object v0, v14, v1

    const/16 v0, 0x11

    aput-object v15, v14, v0

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;
    .locals 54

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v7, 0xa

    const/16 v8, 0x9

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/16 v18, 0xd

    const/4 v13, 0x1

    const/16 v19, 0xc

    const/4 v5, 0x0

    const/16 v20, 0xb

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v4

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v12

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v15, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v10, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    aget-object v21, v2, v20

    move-object/from16 v22, v2

    move-object/from16 v2, v21

    check-cast v2, Lwc3/b;

    move-object/from16 v21, v3

    move/from16 v3, v20

    invoke-interface {v0, v1, v3, v2, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/hcaptcha/config/HCaptchaSize;

    aget-object v3, v22, v19

    check-cast v3, Lwc3/b;

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    aget-object v3, v22, v18

    check-cast v3, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v13, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v13, Lw40/a;->a:Lw40/a;

    move-object/from16 v16, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v13, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/time/Duration;

    const/16 v6, 0x11

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    const v13, 0x3ffff

    move-object/from16 v50, v2

    move-object/from16 v48, v3

    move/from16 v36, v4

    move/from16 v35, v5

    move/from16 v51, v6

    move-object/from16 v44, v7

    move-object/from16 v43, v8

    move-object/from16 v41, v9

    move-object/from16 v40, v10

    move-object/from16 v39, v11

    move/from16 v37, v12

    move/from16 v33, v13

    move-object/from16 v42, v14

    move-object/from16 v38, v15

    move-object/from16 v49, v16

    move-object/from16 v47, v17

    move-object/from16 v46, v19

    move-object/from16 v45, v20

    :goto_0
    move-object/from16 v34, v21

    goto/16 :goto_7

    :cond_0
    move-object/from16 v22, v2

    const/16 v2, 0x11

    move v3, v5

    move/from16 v27, v3

    move/from16 v28, v27

    move/from16 v29, v28

    move-object v4, v6

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v14, v12

    move-object v15, v14

    move-object/from16 v21, v15

    move-object/from16 v23, v21

    move-object/from16 v26, v23

    move/from16 v30, v13

    move/from16 v6, v29

    move-object/from16 v5, v26

    move-object v13, v5

    :goto_1
    if-eqz v30, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v2, 0x11

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v27

    const/high16 v31, 0x20000

    move/from16 v2, v29

    or-int v29, v2, v31

    :goto_2
    const/16 v2, 0x11

    goto :goto_1

    :pswitch_1
    move/from16 v2, v29

    move/from16 v29, v3

    sget-object v3, Lw40/a;->a:Lw40/a;

    move/from16 v31, v6

    const/16 v6, 0x10

    invoke-interface {v0, v1, v6, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lkotlin/time/Duration;

    const/high16 v3, 0x10000

    :goto_3
    or-int/2addr v2, v3

    :goto_4
    move/from16 v3, v29

    move/from16 v6, v31

    :goto_5
    move/from16 v29, v2

    goto :goto_2

    :pswitch_2
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0x10

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xf

    invoke-interface {v0, v1, v6, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    const v3, 0x8000

    goto :goto_3

    :pswitch_3
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xf

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xe

    invoke-interface {v0, v1, v6, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x4000

    goto :goto_4

    :pswitch_4
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xe

    move/from16 v29, v3

    const/16 v3, 0xd

    aget-object v17, v22, v3

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v3, v6, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    or-int/lit16 v2, v2, 0x2000

    goto :goto_4

    :pswitch_5
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xc

    move/from16 v29, v3

    const/16 v3, 0xd

    aget-object v17, v22, v6

    move-object/from16 v3, v17

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v6, v3, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    or-int/lit16 v2, v2, 0x1000

    goto :goto_4

    :pswitch_6
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xc

    move/from16 v29, v3

    const/16 v3, 0xb

    aget-object v17, v22, v3

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v3, v6, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lcom/stripe/hcaptcha/config/HCaptchaSize;

    or-int/lit16 v2, v2, 0x800

    goto/16 :goto_4

    :pswitch_7
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xa

    move/from16 v29, v3

    const/16 v3, 0xb

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit16 v2, v2, 0x400

    goto/16 :goto_4

    :pswitch_8
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0xa

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x9

    invoke-interface {v0, v1, v6, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x200

    goto/16 :goto_4

    :pswitch_9
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0x9

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0x8

    invoke-interface {v0, v1, v6, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x100

    goto/16 :goto_4

    :pswitch_a
    move/from16 v31, v6

    move/from16 v2, v29

    const/16 v6, 0x8

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x7

    invoke-interface {v0, v1, v6, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x80

    goto/16 :goto_4

    :pswitch_b
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v6, 0x7

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x6

    invoke-interface {v0, v1, v6, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x40

    goto/16 :goto_4

    :pswitch_c
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v6, 0x6

    move/from16 v29, v3

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v2, v2, 0x20

    goto/16 :goto_4

    :pswitch_d
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v6, 0x6

    move/from16 v29, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x10

    goto/16 :goto_4

    :pswitch_e
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v6, 0x4

    move/from16 v29, v3

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v28

    or-int/lit8 v2, v2, 0x8

    goto/16 :goto_4

    :pswitch_f
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v3, 0x2

    const/4 v6, 0x4

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v25

    or-int/lit8 v29, v2, 0x4

    move/from16 v3, v25

    move/from16 v6, v31

    goto/16 :goto_2

    :pswitch_10
    move/from16 v2, v29

    const/4 v6, 0x4

    move/from16 v29, v3

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v24

    or-int/lit8 v2, v2, 0x2

    move/from16 v6, v24

    :goto_6
    move/from16 v3, v29

    goto/16 :goto_5

    :pswitch_11
    move/from16 v31, v6

    move/from16 v2, v29

    const/4 v6, 0x4

    move/from16 v29, v3

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    :pswitch_12
    move/from16 v31, v6

    move/from16 v2, v29

    move/from16 v29, v3

    const/4 v3, 0x0

    move/from16 v30, v3

    goto :goto_6

    :cond_1
    move/from16 v31, v6

    move/from16 v2, v29

    move/from16 v29, v3

    move/from16 v33, v2

    move-object/from16 v41, v4

    move-object/from16 v38, v5

    move-object/from16 v50, v7

    move-object/from16 v49, v8

    move-object/from16 v47, v9

    move-object/from16 v46, v10

    move-object/from16 v45, v11

    move-object/from16 v42, v12

    move-object/from16 v40, v13

    move-object/from16 v48, v14

    move-object/from16 v43, v15

    move-object/from16 v39, v23

    move-object/from16 v44, v26

    move/from16 v51, v27

    move/from16 v37, v28

    move/from16 v36, v29

    move/from16 v35, v31

    goto/16 :goto_0

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v32, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v32 .. v53}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v32

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
    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->deserialize(Lzc3/d;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->write$Self$hcaptcha_release(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->serialize(Lzc3/e;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V

    return-void
.end method
