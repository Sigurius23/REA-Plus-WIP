.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;->w:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;->x:Lc93/a;

    packed-switch p1, :pswitch_data_0

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->w:I

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->w:I

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
