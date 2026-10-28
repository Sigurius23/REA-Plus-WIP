.class public final Lio/getstream/chat/android/client/parser2/DirectEventParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 p2\u00020\u0001:\u0001pB-\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R?\u0010\u001f\u001a&\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u001b0\u001b \u0014*\u0012\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0016\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0016\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0016\u001a\u0004\u0008,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010\u0016\u001a\u0004\u00081\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u0010\u0016\u001a\u0004\u00086\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010\u0016\u001a\u0004\u0008;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010\u0016\u001a\u0004\u0008@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u0010\u0016\u001a\u0004\u0008E\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008I\u0010\u0016\u001a\u0004\u0008J\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008N\u0010\u0016\u001a\u0004\u0008O\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010\u0016\u001a\u0004\u0008T\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008X\u0010\u0016\u001a\u0004\u0008Y\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008]\u0010\u0016\u001a\u0004\u0008^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008b\u0010\u0016\u001a\u0004\u0008c\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008g\u0010\u0016\u001a\u0004\u0008h\u0010iR/\u0010o\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\r0\u001a0k8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008l\u0010\u0016\u001a\u0004\u0008m\u0010n\u00a8\u0006q"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/DirectEventParser;",
        "",
        "Lkotlin/Function0;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "currentUserIdProvider",
        "Lio/getstream/chat/android/models/MessageTransformer;",
        "messageTransformer",
        "Lio/getstream/chat/android/models/UserTransformer;",
        "userTransformer",
        "<init>",
        "(Lc93/a;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/UserTransformer;)V",
        "raw",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "parse",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;",
        "Lc93/a;",
        "Lio/getstream/chat/android/models/MessageTransformer;",
        "Lio/getstream/chat/android/models/UserTransformer;",
        "Lqx/l0;",
        "kotlin.jvm.PlatformType",
        "moshi$delegate",
        "Ll83/h;",
        "getMoshi",
        "()Lqx/l0;",
        "moshi",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Ljava/util/Date;",
        "dateAdapter$delegate",
        "getDateAdapter",
        "()Lcom/squareup/moshi/JsonAdapter;",
        "dateAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;",
        "deviceAdapter$delegate",
        "getDeviceAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;",
        "deviceAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;",
        "privacySettingsAdapter$delegate",
        "getPrivacySettingsAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;",
        "privacySettingsAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;",
        "attachmentAdapter$delegate",
        "getAttachmentAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;",
        "attachmentAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;",
        "channelInfoAdapter$delegate",
        "getChannelInfoAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;",
        "channelInfoAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;",
        "moderationDetailsAdapter$delegate",
        "getModerationDetailsAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;",
        "moderationDetailsAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;",
        "moderationAdapter$delegate",
        "getModerationAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;",
        "moderationAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;",
        "optionAdapter$delegate",
        "getOptionAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;",
        "optionAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;",
        "locationAdapter$delegate",
        "getLocationAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;",
        "locationAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;",
        "reactionGroupAdapter$delegate",
        "getReactionGroupAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;",
        "reactionGroupAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/UserAdapter;",
        "userAdapter$delegate",
        "getUserAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;",
        "userAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;",
        "reactionAdapter$delegate",
        "getReactionAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;",
        "reactionAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/PollAdapter;",
        "pollAdapter$delegate",
        "getPollAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/PollAdapter;",
        "pollAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;",
        "reminderAdapter$delegate",
        "getReminderAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;",
        "reminderAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;",
        "messageAdapter$delegate",
        "getMessageAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;",
        "messageAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;",
        "newMessageEventAdapter$delegate",
        "getNewMessageEventAdapter",
        "()Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;",
        "newMessageEventAdapter",
        "",
        "adapterMap$delegate",
        "getAdapterMap",
        "()Ljava/util/Map;",
        "adapterMap",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

.field private static final logger$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# instance fields
.field private final adapterMap$delegate:Ll83/h;

.field private final attachmentAdapter$delegate:Ll83/h;

.field private final channelInfoAdapter$delegate:Ll83/h;

.field private final currentUserIdProvider:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final dateAdapter$delegate:Ll83/h;

.field private final deviceAdapter$delegate:Ll83/h;

.field private final locationAdapter$delegate:Ll83/h;

.field private final messageAdapter$delegate:Ll83/h;

.field private final messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

.field private final moderationAdapter$delegate:Ll83/h;

.field private final moderationDetailsAdapter$delegate:Ll83/h;

.field private final moshi$delegate:Ll83/h;

.field private final newMessageEventAdapter$delegate:Ll83/h;

.field private final optionAdapter$delegate:Ll83/h;

.field private final pollAdapter$delegate:Ll83/h;

.field private final privacySettingsAdapter$delegate:Ll83/h;

.field private final reactionAdapter$delegate:Ll83/h;

.field private final reactionGroupAdapter$delegate:Ll83/h;

.field private final reminderAdapter$delegate:Ll83/h;

.field private final userAdapter$delegate:Ll83/h;

.field private final userTransformer:Lio/getstream/chat/android/models/UserTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    const-string v1, "DirectEventParser"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->logger$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Lc93/a;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/UserTransformer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lio/getstream/chat/android/models/MessageTransformer;",
            "Lio/getstream/chat/android/models/UserTransformer;",
            ")V"
        }
    .end annotation

    const-string v0, "currentUserIdProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTransformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userTransformer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->currentUserIdProvider:Lc93/a;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->userTransformer:Lio/getstream/chat/android/models/UserTransformer;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moshi$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->dateAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->deviceAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->privacySettingsAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->attachmentAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xd

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->channelInfoAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moderationDetailsAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0xf

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moderationAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->optionAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->locationAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionGroupAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->userAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->pollAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reminderAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->messageAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->newMessageEventAdapter$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/parser2/a;

    const/16 p2, 0x8

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/parser2/a;-><init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->adapterMap$delegate:Ll83/h;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lcom/squareup/moshi/JsonAdapter;
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getMoshi()Lqx/l0;

    move-result-object p0

    const-class v0, Ljava/util/Date;

    invoke-virtual {p0, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->logger$delegate:Ll83/h;

    return-object v0
.end method

.method private static final adapterMap_delegate$lambda$17(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Ljava/util/Map;
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getNewMessageEventAdapter()Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;

    move-result-object p0

    new-instance v0, Ll83/k;

    const-string v1, "message.new"

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final attachmentAdapter_delegate$lambda$4()Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;-><init>()V

    return-object v0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->locationAdapter_delegate$lambda$9(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lqx/l0;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moshi_delegate$lambda$0()Lqx/l0;

    move-result-object v0

    return-object v0
.end method

.method private static final channelInfoAdapter_delegate$lambda$5()Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;-><init>()V

    return-object v0
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/UserAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->userAdapter_delegate$lambda$11(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final dateAdapter_delegate$lambda$1(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lcom/squareup/moshi/JsonAdapter;
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getMoshi()Lqx/l0;

    move-result-object p0

    const-class v0, Ljava/util/Date;

    invoke-virtual {p0, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final deviceAdapter_delegate$lambda$2()Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;-><init>()V

    return-object v0
.end method

.method public static synthetic e(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->pollAdapter_delegate$lambda$13(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionGroupAdapter_delegate$lambda$10(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reminderAdapter_delegate$lambda$14(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;

    move-result-object p0

    return-object p0
.end method

.method private final getAdapterMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->adapterMap$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getAttachmentAdapter()Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->attachmentAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;

    return-object v0
.end method

.method private final getChannelInfoAdapter()Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->channelInfoAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;

    return-object v0
.end method

.method private final getDateAdapter()Lcom/squareup/moshi/JsonAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->dateAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/moshi/JsonAdapter;

    return-object v0
.end method

.method private final getDeviceAdapter()Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->deviceAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;

    return-object v0
.end method

.method private final getLocationAdapter()Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->locationAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;

    return-object v0
.end method

.method private final getMessageAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->messageAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;

    return-object v0
.end method

.method private final getModerationAdapter()Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moderationAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;

    return-object v0
.end method

.method private final getModerationDetailsAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moderationDetailsAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;

    return-object v0
.end method

.method private final getMoshi()Lqx/l0;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->moshi$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqx/l0;

    return-object v0
.end method

.method private final getNewMessageEventAdapter()Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->newMessageEventAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;

    return-object v0
.end method

.method private final getOptionAdapter()Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->optionAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;

    return-object v0
.end method

.method private final getPollAdapter()Lio/getstream/chat/android/client/parser2/direct/PollAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->pollAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;

    return-object v0
.end method

.method private final getPrivacySettingsAdapter()Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->privacySettingsAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;

    return-object v0
.end method

.method private final getReactionAdapter()Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;

    return-object v0
.end method

.method private final getReactionGroupAdapter()Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionGroupAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    return-object v0
.end method

.method private final getReminderAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reminderAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;

    return-object v0
.end method

.method private final getUserAdapter()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->userAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    return-object v0
.end method

.method public static synthetic h(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->reactionAdapter_delegate$lambda$12(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->newMessageEventAdapter_delegate$lambda$16(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->adapterMap_delegate$lambda$17(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->messageAdapter_delegate$lambda$15(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final locationAdapter_delegate$lambda$9(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    const-string v1, "<get-dateAdapter>(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method private static final messageAdapter_delegate$lambda$15(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;
    .locals 13

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getAttachmentAdapter()Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getChannelInfoAdapter()Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;

    move-result-object v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getReactionAdapter()Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;

    move-result-object v3

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getReactionGroupAdapter()Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    move-result-object v4

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getUserAdapter()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object v5

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getModerationDetailsAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;

    move-result-object v6

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getModerationAdapter()Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;

    move-result-object v7

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getPollAdapter()Lio/getstream/chat/android/client/parser2/direct/PollAdapter;

    move-result-object v8

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getReminderAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;

    move-result-object v9

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getLocationAdapter()Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;

    move-result-object v10

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v11

    const-string v12, "<get-dateAdapter>(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/MessageTransformer;)V

    return-object v0
.end method

.method private static final moderationAdapter_delegate$lambda$7()Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;-><init>()V

    return-object v0
.end method

.method private static final moderationDetailsAdapter_delegate$lambda$6()Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;-><init>()V

    return-object v0
.end method

.method private static final moshi_delegate$lambda$0()Lqx/l0;
    .locals 3

    new-instance v0, Lqx/i0;

    invoke-direct {v0}, Lqx/i0;-><init>()V

    new-instance v1, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;

    invoke-direct {v1}, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;-><init>()V

    const-class v2, Ljava/util/Date;

    invoke-virtual {v0, v2, v1}, Lqx/i0;->b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V

    new-instance v1, Lqx/l0;

    invoke-direct {v1, v0}, Lqx/l0;-><init>(Lqx/i0;)V

    return-object v1
.end method

.method private static final newMessageEventAdapter_delegate$lambda$16(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getMessageAdapter()Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getUserAdapter()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method private static final optionAdapter_delegate$lambda$8()Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;-><init>()V

    return-object v0
.end method

.method private static final pollAdapter_delegate$lambda$13(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter;
    .locals 5

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getUserAdapter()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getOptionAdapter()Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;

    move-result-object v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    const-string v4, "<get-dateAdapter>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->currentUserIdProvider:Lc93/a;

    invoke-direct {v0, v1, v2, v3, p0}, Lio/getstream/chat/android/client/parser2/direct/PollAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lc93/a;)V

    return-object v0
.end method

.method private static final privacySettingsAdapter_delegate$lambda$3()Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;-><init>()V

    return-object v0
.end method

.method private static final reactionAdapter_delegate$lambda$12(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getUserAdapter()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    const-string v2, "<get-dateAdapter>(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method private static final reactionGroupAdapter_delegate$lambda$10(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    const-string v1, "<get-dateAdapter>(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method private static final reminderAdapter_delegate$lambda$14(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p0

    const-string v1, "<get-dateAdapter>(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method private static final userAdapter_delegate$lambda$11(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/UserAdapter;
    .locals 5

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDeviceAdapter()Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getPrivacySettingsAdapter()Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;

    move-result-object v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getDateAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    const-string v4, "<get-dateAdapter>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->userTransformer:Lio/getstream/chat/android/models/UserTransformer;

    invoke-direct {v0, v1, v2, v3, p0}, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;-><init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/UserTransformer;)V

    return-object v0
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;
    .locals 8

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;->extractType$stream_chat_android_client_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->getAdapterMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/squareup/moshi/JsonAdapter;

    if-nez v2, :cond_1

    :goto_0
    return-object v1

    :cond_1
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v3, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;->access$getLogger(Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;)Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v6, "Direct parse failed for \'"

    const-string v7, "\'; falling back to DTO path: "

    invoke-static {v6, v0, v7, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5, v3, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, p1

    :goto_2
    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    return-object v1
.end method
