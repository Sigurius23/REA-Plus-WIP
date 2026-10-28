.class public final Lio/getstream/chat/android/models/MessageModerationAction$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/MessageModerationAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/models/MessageModerationAction$Companion;",
        "",
        "<init>",
        "()V",
        "bounce",
        "Lio/getstream/chat/android/models/MessageModerationAction;",
        "getBounce",
        "()Lio/getstream/chat/android/models/MessageModerationAction;",
        "flag",
        "getFlag",
        "block",
        "getBlock",
        "values",
        "",
        "getValues",
        "()Ljava/util/Set;",
        "fromRawValue",
        "rawValue",
        "",
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
    invoke-direct {p0}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromRawValue(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 3

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;->getValues()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/MessageModerationAction;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageModerationAction;->getRawValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lio/getstream/chat/android/models/MessageModerationAction;

    if-nez v1, :cond_2

    new-instance v0, Lio/getstream/chat/android/models/MessageModerationAction;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/models/MessageModerationAction;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final getBlock()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/MessageModerationAction;->access$getBlock$cp()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    return-object v0
.end method

.method public final getBounce()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/MessageModerationAction;->access$getBounce$cp()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    return-object v0
.end method

.method public final getFlag()Lio/getstream/chat/android/models/MessageModerationAction;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/MessageModerationAction;->access$getFlag$cp()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    return-object v0
.end method

.method public final getValues()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/models/MessageModerationAction;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lio/getstream/chat/android/models/MessageModerationAction;->access$getValues$cp()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
