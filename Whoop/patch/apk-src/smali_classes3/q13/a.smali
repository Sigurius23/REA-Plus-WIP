.class public final synthetic Lq13/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lq13/a;->a:I

    iput-object p1, p0, Lq13/a;->b:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget p1, p0, Lq13/a;->a:I

    const/4 v0, 0x1

    iget-object v1, p0, Lq13/a;->b:Lc93/a;

    packed-switch p1, :pswitch_data_0

    sget p1, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->w:I

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return v0

    :pswitch_0
    sget p1, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->w:I

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return v0

    :pswitch_1
    sget p1, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->w:I

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
