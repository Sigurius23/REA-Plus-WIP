.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
