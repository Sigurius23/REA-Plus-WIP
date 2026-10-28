.class public final synthetic Lf1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lf1/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf1/x;->x:I

    iput-object p2, p0, Lf1/x;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lf1/x;->w:I

    iput-object p1, p0, Lf1/x;->y:Ljava/lang/Object;

    iput p2, p0, Lf1/x;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf1/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lyf/i;

    iget v1, p0, Lf1/x;->x:I

    iget-object v2, v0, Lyf/i;->y:Lzf/d;

    iget v2, v2, Lzf/d;->b:I

    if-ge v2, v1, :cond_0

    invoke-virtual {v0}, Lyf/i;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lrq0/i;

    iget v1, p0, Lf1/x;->x:I

    invoke-static {v0, v1}, Lrq0/i;->d(Lrq0/i;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lo23/r;

    iget v1, p0, Lf1/x;->x:I

    iget-object v0, v0, Lo23/r;->w:Lac3/b;

    invoke-virtual {v0}, Lac3/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget v0, p0, Lf1/x;->x:I

    iget-object v1, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->l(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iget v1, p0, Lf1/x;->x:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->c(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget v1, p0, Lf1/x;->x:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->d(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget v1, p0, Lf1/x;->x:I

    iget-object v0, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lig/d;

    iget-object v0, v0, Lig/d;->w:Lyf/k;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lf1/x;->y:Ljava/lang/Object;

    check-cast v0, Lf1/r;

    iget v1, p0, Lf1/x;->x:I

    iget-object v0, v0, Lf1/r;->f:Ll3/r0;

    iget-object v0, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, v1}, Ll3/w;->d(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
