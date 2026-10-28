.class public final synthetic Laq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;


# instance fields
.field public final synthetic w:Laq0/q;


# direct methods
.method public synthetic constructor <init>(Laq0/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq0/f;->w:Laq0/q;

    return-void
.end method


# virtual methods
.method public final onThreadClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    iget-object v0, p0, Laq0/f;->w:Laq0/q;

    invoke-static {v0, p1}, Laq0/q;->Z(Laq0/q;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1
.end method
