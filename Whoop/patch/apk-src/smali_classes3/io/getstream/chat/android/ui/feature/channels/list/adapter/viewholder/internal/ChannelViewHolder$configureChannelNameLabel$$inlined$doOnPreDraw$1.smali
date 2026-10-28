.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureChannelNameLabel(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $this_configureChannelNameLabel$inlined:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

.field final synthetic $this_doOnPreDraw:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;->$this_configureChannelNameLabel$inlined:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;->$this_configureChannelNameLabel$inlined:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->access$getCompanion$p()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;->$this_configureChannelNameLabel$inlined:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    const-string v3, "channelNameLabel"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;->$this_configureChannelNameLabel$inlined:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v4, "foregroundView"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;->access$yDiffBetweenCenters(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;Landroid/view/View;Landroid/view/View;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method
