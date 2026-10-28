.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->w:I

    return-object v1

    :pswitch_0
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->w:I

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
