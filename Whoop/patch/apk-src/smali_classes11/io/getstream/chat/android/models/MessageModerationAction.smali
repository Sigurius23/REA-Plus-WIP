.class public final Lio/getstream/chat/android/models/MessageModerationAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/MessageModerationAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/models/MessageModerationAction;",
        "",
        "rawValue",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getRawValue",
        "()Ljava/lang/String;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
        "stream-chat-android-core"
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
.field public static final Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

.field private static final block:Lio/getstream/chat/android/models/MessageModerationAction;

.field private static final bounce:Lio/getstream/chat/android/models/MessageModerationAction;

.field private static final flag:Lio/getstream/chat/android/models/MessageModerationAction;

.field private static final values:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/models/MessageModerationAction;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    new-instance v0, Lio/getstream/chat/android/models/MessageModerationAction;

    const-string v1, "MESSAGE_RESPONSE_ACTION_BOUNCE"

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/MessageModerationAction;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->bounce:Lio/getstream/chat/android/models/MessageModerationAction;

    new-instance v1, Lio/getstream/chat/android/models/MessageModerationAction;

    const-string v2, "MESSAGE_RESPONSE_ACTION_FLAG"

    invoke-direct {v1, v2}, Lio/getstream/chat/android/models/MessageModerationAction;-><init>(Ljava/lang/String;)V

    sput-object v1, Lio/getstream/chat/android/models/MessageModerationAction;->flag:Lio/getstream/chat/android/models/MessageModerationAction;

    new-instance v2, Lio/getstream/chat/android/models/MessageModerationAction;

    const-string v3, "MESSAGE_RESPONSE_ACTION_BLOCK"

    invoke-direct {v2, v3}, Lio/getstream/chat/android/models/MessageModerationAction;-><init>(Ljava/lang/String;)V

    sput-object v2, Lio/getstream/chat/android/models/MessageModerationAction;->block:Lio/getstream/chat/android/models/MessageModerationAction;

    filled-new-array {v0, v1, v2}, [Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->values:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getBlock$cp()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->block:Lio/getstream/chat/android/models/MessageModerationAction;

    return-object v0
.end method

.method public static final synthetic access$getBounce$cp()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->bounce:Lio/getstream/chat/android/models/MessageModerationAction;

    return-object v0
.end method

.method public static final synthetic access$getFlag$cp()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->flag:Lio/getstream/chat/android/models/MessageModerationAction;

    return-object v0
.end method

.method public static final synthetic access$getValues$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->values:Ljava/util/Set;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/MessageModerationAction;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/MessageModerationAction;->copy(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/MessageModerationAction;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/models/MessageModerationAction;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/MessageModerationAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/MessageModerationAction;

    iget-object v1, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getRawValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/MessageModerationAction;->rawValue:Ljava/lang/String;

    const-string v1, "MessageModerationAction(rawValue="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
