.class public final Lio/getstream/chat/android/client/helpers/CallPostponeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/helpers/CallPostponeHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\t\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\"\u0008\u0008\u0000\u0010\u000c*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000e0\rH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R*\u0010\t\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/helpers/CallPostponeHelper;",
        "",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "userScope",
        "",
        "timeoutInMillis",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "awaitConnection",
        "<init>",
        "(Lio/getstream/chat/android/client/scope/UserScope;JLkotlin/jvm/functions/Function1;)V",
        "T",
        "Lkotlin/Function0;",
        "Lo23/d;",
        "call",
        "postponeCall$stream_chat_android_client_release",
        "(Lc93/a;)Lo23/d;",
        "postponeCall",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "J",
        "Lkotlin/jvm/functions/Function1;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field public static final Companion:Lio/getstream/chat/android/client/helpers/CallPostponeHelper$Companion;

.field private static final DEFAULT_TIMEOUT:J = 0x1388L


# instance fields
.field private final awaitConnection:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final timeoutInMillis:J

.field private final userScope:Lio/getstream/chat/android/client/scope/UserScope;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->Companion:Lio/getstream/chat/android/client/helpers/CallPostponeHelper$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/scope/UserScope;JLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/scope/UserScope;",
            "J",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "userScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "awaitConnection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    .line 3
    iput-wide p2, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->timeoutInMillis:J

    .line 4
    iput-object p4, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->awaitConnection:Lkotlin/jvm/functions/Function1;

    .line 5
    const-string p1, "Chat:CallPostponeHelper"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/scope/UserScope;JLkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-wide/16 p2, 0x1388

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;-><init>(Lio/getstream/chat/android/client/scope/UserScope;JLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getAwaitConnection$p(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->awaitConnection:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTimeoutInMillis$p(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->timeoutInMillis:J

    return-wide v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final postponeCall$stream_chat_android_client_release(Lc93/a;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc93/a;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    iget-object v1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v2, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;-><init>(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;Lc93/a;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method
