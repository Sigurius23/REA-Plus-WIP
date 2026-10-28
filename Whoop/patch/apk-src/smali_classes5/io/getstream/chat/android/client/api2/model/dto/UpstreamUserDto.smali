.class public final Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "Field names can\'t be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008#\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u00c6\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u00c6\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012H\u00c6\u0003J\u00a9\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000e2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012H\u00c6\u0001J\u0013\u00105\u001a\u00020\u00032\u0008\u00106\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&\u00a8\u0006:"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "banned",
        "",
        "id",
        "",
        "name",
        "image",
        "invisible",
        "privacy_settings",
        "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
        "language",
        "role",
        "devices",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
        "teams",
        "teams_role",
        "",
        "extraData",
        "",
        "<init>",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V",
        "getBanned",
        "()Z",
        "getId",
        "()Ljava/lang/String;",
        "getName",
        "getImage",
        "getInvisible",
        "getPrivacy_settings",
        "()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
        "getLanguage",
        "getRole",
        "getDevices",
        "()Ljava/util/List;",
        "getTeams",
        "getTeams_role",
        "()Ljava/util/Map;",
        "getExtraData",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final banned:Z

.field private final devices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation
.end field

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final invisible:Z

.field private final language:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

.field private final role:Ljava/lang/String;

.field private final teams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final teams_role:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    iput-boolean p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    iput-object p10, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    iput-object p11, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    iput-object p12, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    return v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    return v0
.end method

.method public final component6()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    move v2, p1

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBanned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    return v0
.end method

.method public final getDevices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    return-object v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getInvisible()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    return v0
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacy_settings()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeams()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final getTeams_role()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->banned:Z

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->name:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->image:Ljava/lang/String;

    iget-boolean v4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->invisible:Z

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->language:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->role:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->devices:Ljava/util/List;

    iget-object v9, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams:Ljava/util/List;

    iget-object v10, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->teams_role:Ljava/util/Map;

    iget-object v11, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->extraData:Ljava/util/Map;

    const-string v12, ", id="

    const-string v13, ", name="

    const-string v14, "UpstreamUserDto(banned="

    invoke-static {v14, v12, v1, v13, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v12, ", invisible="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", privacy_settings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    const-string v2, ", devices="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", teams="

    const-string v2, ", teams_role="

    invoke-static {v0, v8, v1, v9, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", extraData="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
