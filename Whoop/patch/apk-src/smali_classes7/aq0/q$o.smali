.class public final Laq0/q$o;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq0/q;->C2(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "aq0/q$o",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic d:Laq0/q;

.field final synthetic e:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public constructor <init>(Laq0/q;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    iput-object p1, p0, Laq0/q$o;->d:Laq0/q;

    iput-object p2, p0, Laq0/q$o;->e:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 4

    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    invoke-static {v0}, Laq0/q;->J0(Laq0/q;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "messageActionBottomSheetBehavior"

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    invoke-static {v0}, Laq0/q;->J0(Laq0/q;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v0, v3}, Laq0/q;->K0(Laq0/q;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    invoke-static {v0}, Laq0/q;->E0(Laq0/q;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "chatReportBottomSheetBehavior"

    if-eqz v0, :cond_5

    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    invoke-static {v0}, Laq0/q;->E0(Laq0/q;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v3

    if-eqz v3, :cond_2

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Laq0/q;->P0(Laq0/q;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    iget-object v1, p0, Laq0/q$o;->e:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, v1}, Laq0/q;->N0(Laq0/q;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Laq0/q$o;->d:Laq0/q;

    iget-object v1, p0, Laq0/q$o;->e:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, v1}, Laq0/q;->D0(Laq0/q;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    :cond_4
    return-void

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method
