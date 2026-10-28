.class public final Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/init/HMSRoomLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HMSRoomLayoutData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;,
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;,
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;,
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;,
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u00056789:Bs\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\u0010\u0010\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0013\u0010.\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u00c6\u0003J\u0089\u0001\u0010/\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0008\u0002\u0010\u0010\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u00c6\u0001J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R \u0010\u0010\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;",
        "",
        "appId",
        "",
        "id",
        "options",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;",
        "role",
        "roleId",
        "templateId",
        "typography",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;",
        "logo",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;",
        "screens",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;",
        "themes",
        "",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)V",
        "getAppId",
        "()Ljava/lang/String;",
        "getId",
        "getOptions",
        "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;",
        "getRole",
        "getRoleId",
        "getTemplateId",
        "getTypography",
        "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;",
        "getLogo",
        "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;",
        "getScreens",
        "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;",
        "getThemes",
        "()Ljava/util/List;",
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
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Screens",
        "Logo",
        "TypoGraphy",
        "HMSLayoutOptions",
        "HMSRoomTheme",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "app_id"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "logo"
    .end annotation
.end field

.field private final options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "options"
    .end annotation
.end field

.field private final role:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role"
    .end annotation
.end field

.field private final roleId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role_id"
    .end annotation
.end field

.field private final screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screens"
    .end annotation
.end field

.field private final templateId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "template_id"
    .end annotation
.end field

.field private final themes:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "themes"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
            ">;"
        }
    .end annotation
.end field

.field private final typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "typography"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;",
            "Ljava/util/List<",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    iput-object p4, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    iput-object p5, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    iput-object p6, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    iput-object p7, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    iput-object p8, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    iput-object p9, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    iput-object p10, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;ILjava/lang/Object;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->copy(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    return-object v0
.end method

.method public final component8()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    return-object v0
.end method

.method public final component9()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;",
            "Ljava/util/List<",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
            ">;)",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLogo()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    return-object v0
.end method

.method public final getOptions()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreens()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    return-object v0
.end method

.method public final getTemplateId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    return-object v0
.end method

.method public final getTypography()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRoomLayoutData(appId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->options:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->role:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", roleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->roleId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", templateId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->templateId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->typography:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", logo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->logo:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->screens:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", themes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;->themes:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
