.class public final Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;
.super Ls83/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.viewmodel.mentions.MentionListViewModel$special$$inlined$map$1$2"
    f = "MentionListViewModel.kt"
    l = {
        0x32
    }
    m = "emit"
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;->label:I

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1$2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
