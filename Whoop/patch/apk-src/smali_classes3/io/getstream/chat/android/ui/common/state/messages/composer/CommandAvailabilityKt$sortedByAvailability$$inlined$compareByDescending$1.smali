.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->sortedByAvailability(Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $action$inlined:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;->$action$inlined:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    check-cast p2, Lio/getstream/chat/android/models/Command;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;->$action$inlined:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-static {p2, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, Lio/getstream/chat/android/models/Command;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;->$action$inlined:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
