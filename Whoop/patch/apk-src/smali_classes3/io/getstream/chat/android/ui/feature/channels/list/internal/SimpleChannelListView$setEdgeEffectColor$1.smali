.class public final Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1;
.super Landroidx/recyclerview/widget/m1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setEdgeEffectColor(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1",
        "Landroidx/recyclerview/widget/m1;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "view",
        "",
        "direction",
        "Landroid/widget/EdgeEffect;",
        "createEdgeEffect",
        "(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/widget/EdgeEffect;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $edgeEffectColor:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1;->$edgeEffectColor:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createEdgeEffect(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/widget/EdgeEffect;
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iget p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1;->$edgeEffectColor:I

    invoke-virtual {p2, p1}, Landroid/widget/EdgeEffect;->setColor(I)V

    return-object p2
.end method
