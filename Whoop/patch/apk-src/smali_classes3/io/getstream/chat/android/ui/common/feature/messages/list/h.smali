.class public final synthetic Lio/getstream/chat/android/ui/common/feature/messages/list/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/h;->a:J

    return-void
.end method


# virtual methods
.method public final handleMessagePosition(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 8

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/h;->a:J

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->a(JLio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object p1

    return-object p1
.end method
