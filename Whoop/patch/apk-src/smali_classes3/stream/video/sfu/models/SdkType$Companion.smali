.class public final Lstream/video/sfu/models/SdkType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/SdkType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lstream/video/sfu/models/SdkType$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "Lstream/video/sfu/models/SdkType;",
        "fromValue",
        "(I)Lstream/video/sfu/models/SdkType;",
        "Lcom/squareup/wire/q;",
        "ADAPTER",
        "Lcom/squareup/wire/q;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lstream/video/sfu/models/SdkType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromValue(I)Lstream/video/sfu/models/SdkType;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_VISION_AGENTS:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_1
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_PYTHON:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_2
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_PLAIN_JAVASCRIPT:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_3
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_GO:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_4
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_UNITY:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_5
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_REACT_NATIVE:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_6
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_FLUTTER:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_7
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_IOS:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_8
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_ANDROID:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_9
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_ANGULAR:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_a
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_REACT:Lstream/video/sfu/models/SdkType;

    return-object p1

    :pswitch_b
    sget-object p1, Lstream/video/sfu/models/SdkType;->SDK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/SdkType;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
