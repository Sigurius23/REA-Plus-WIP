.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0080\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u0008:\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u0008;\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u0008<\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008?\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008@\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008A\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008B\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010$\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
        "",
        "",
        "deviceType",
        "title",
        "connectedSubtitle",
        "connectedText",
        "connectedIcon",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;",
        "connectedCtaButton",
        "disconnectedSubtitle",
        "disconnectedText",
        "disconnectedIcon",
        "disconnectedCtaButton",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;",
        "disconnectView",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getDeviceType",
        "getTitle",
        "getConnectedSubtitle",
        "getConnectedText",
        "getConnectedIcon",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;",
        "getConnectedCtaButton",
        "getDisconnectedSubtitle",
        "getDisconnectedText",
        "getDisconnectedIcon",
        "getDisconnectedCtaButton",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;",
        "getDisconnectView",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;


# instance fields
.field private final connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

.field private final connectedIcon:Ljava/lang/String;

.field private final connectedSubtitle:Ljava/lang/String;

.field private final connectedText:Ljava/lang/String;

.field private final deviceType:Ljava/lang/String;

.field private final disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

.field private final disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

.field private final disconnectedIcon:Ljava/lang/String;

.field private final disconnectedSubtitle:Ljava/lang/String;

.field private final disconnectedText:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;

    invoke-virtual {p13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)V
    .locals 1

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedIcon"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedCtaButton"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedSubtitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedIcon"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedCtaButton"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    .line 13
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton$$serializer;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    return-object v0
.end method

.method public final component11()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;
    .locals 13

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedSubtitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedText"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedCtaButton"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedSubtitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedIcon"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnectedCtaButton"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getConnectedCtaButton()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    return-object v0
.end method

.method public final getConnectedIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectedSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectedText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectView()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    return-object v0
.end method

.method public final getDisconnectedCtaButton()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    return-object v0
.end method

.method public final getDisconnectedIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectedSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectedText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->deviceType:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedSubtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->connectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedSubtitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedText:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedIcon:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectedCtaButton:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;

    iget-object v10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->disconnectView:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    const-string v11, ", title="

    const-string v12, ", connectedSubtitle="

    const-string v13, "ConnectedDeviceDisplay(deviceType="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connectedText="

    const-string v11, ", connectedIcon="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectedCtaButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectedSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectedText="

    const-string v2, ", disconnectedIcon="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectedCtaButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
