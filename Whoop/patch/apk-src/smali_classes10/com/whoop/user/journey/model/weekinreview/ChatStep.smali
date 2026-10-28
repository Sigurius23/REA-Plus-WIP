.class public final Lcom/whoop/user/journey/model/weekinreview/ChatStep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/user/journey/model/UserJourneyStep;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/user/journey/model/weekinreview/ChatStep$$serializer;,
        Lcom/whoop/user/journey/model/weekinreview/ChatStep$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBa\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJV\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00086\u0010\u001f\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/user/journey/model/weekinreview/ChatStep;",
        "Lcom/whoop/user/journey/model/UserJourneyStep;",
        "Lcom/whoop/user/journey/model/weekinreview/ChatBox;",
        "whoopChatBox",
        "userChatBox",
        "",
        "footerText",
        "footerSubText",
        "name",
        "theme",
        "themeVariant",
        "<init>",
        "(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$user_journey_release",
        "(Lcom/whoop/user/journey/model/weekinreview/ChatStep;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/user/journey/model/weekinreview/ChatBox;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/ChatStep;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/user/journey/model/weekinreview/ChatBox;",
        "getWhoopChatBox",
        "getUserChatBox",
        "Ljava/lang/String;",
        "getFooterText",
        "getFooterSubText",
        "getName",
        "getTheme",
        "getThemeVariant",
        "Companion",
        "$serializer",
        "user-journey_release"
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

.field public static final Companion:Lcom/whoop/user/journey/model/weekinreview/ChatStep$Companion;


# instance fields
.field private final footerSubText:Ljava/lang/String;

.field private final footerText:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final theme:Ljava/lang/String;

.field private final themeVariant:Ljava/lang/String;

.field private final userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

.field private final whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/user/journey/model/weekinreview/ChatStep$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/user/journey/model/weekinreview/ChatStep$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->Companion:Lcom/whoop/user/journey/model/weekinreview/ChatStep$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/user/journey/model/weekinreview/ChatStep$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/weekinreview/ChatStep$$serializer;

    invoke-virtual {p9}, Lcom/whoop/user/journey/model/weekinreview/ChatStep$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iput-object p3, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iput-object p4, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "whoopChatBox"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userChatBox"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerSubText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    .line 4
    iput-object p2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    .line 5
    iput-object p3, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/user/journey/model/weekinreview/ChatStep;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/user/journey/model/weekinreview/ChatStep;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->copy(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/ChatStep;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$user_journey_release(Lcom/whoop/user/journey/model/weekinreview/ChatStep;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/user/journey/model/weekinreview/ChatBox$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/weekinreview/ChatBox$$serializer;

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/user/journey/model/weekinreview/ChatBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    return-object v0
.end method

.method public final component2()Lcom/whoop/user/journey/model/weekinreview/ChatBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/ChatStep;
    .locals 9

    const-string v0, "whoopChatBox"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userChatBox"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerSubText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/user/journey/model/weekinreview/ChatStep;-><init>(Lcom/whoop/user/journey/model/weekinreview/ChatBox;Lcom/whoop/user/journey/model/weekinreview/ChatBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getFooterSubText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooterText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemeVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserChatBox()Lcom/whoop/user/journey/model/weekinreview/ChatBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    return-object v0
.end method

.method public final getWhoopChatBox()Lcom/whoop/user/journey/model/weekinreview/ChatBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    invoke-virtual {v0}, Lcom/whoop/user/journey/model/weekinreview/ChatBox;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/weekinreview/ChatBox;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->whoopChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iget-object v1, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->userChatBox:Lcom/whoop/user/journey/model/weekinreview/ChatBox;

    iget-object v2, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->footerSubText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->name:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->theme:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/user/journey/model/weekinreview/ChatStep;->themeVariant:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ChatStep(whoopChatBox="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userChatBox="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footerText="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", footerSubText="

    const-string v1, ", name="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", theme="

    const-string v1, ", themeVariant="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
