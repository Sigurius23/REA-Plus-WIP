.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$getTypingEvent$$inlined$sortedBy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getTypingEvent()Lio/getstream/chat/android/models/TypingEvent;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    check-cast p1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    check-cast p2, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
