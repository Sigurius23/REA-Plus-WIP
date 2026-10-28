.class public final synthetic Lh02/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Llw1/i;Lp1/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lh02/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh02/a0;->x:I

    iput-object p2, p0, Lh02/a0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lh02/a0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lh02/a0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lh02/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/a0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh02/a0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lh02/a0;->E:Ljava/lang/Object;

    iput p4, p0, Lh02/a0;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Luc3/f;ILuc3/e;)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, Lh02/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/a0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh02/a0;->z:Ljava/lang/Object;

    iput p3, p0, Lh02/a0;->x:I

    iput-object p4, p0, Lh02/a0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILbc3/c0;Lq0/y;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    iput v0, p0, Lh02/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/a0;->y:Ljava/lang/Object;

    iput p2, p0, Lh02/a0;->x:I

    iput-object p3, p0, Lh02/a0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lh02/a0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lq2/a;ILkotlin/jvm/functions/Function1;Lp1/a1;)V
    .locals 1

    .line 5
    const/4 v0, 0x3

    iput v0, p0, Lh02/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/a0;->z:Ljava/lang/Object;

    iput p2, p0, Lh02/a0;->x:I

    iput-object p3, p0, Lh02/a0;->y:Ljava/lang/Object;

    iput-object p4, p0, Lh02/a0;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lh02/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh02/a0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh02/a0;->z:Ljava/lang/Object;

    check-cast v1, Luc3/f;

    iget-object v2, p0, Lh02/a0;->E:Ljava/lang/Object;

    check-cast v2, Luc3/e;

    const-string v3, "Can not interpret the string \'"

    const-string v4, "\' as "

    invoke-static {v3, v0, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v1, Luc3/f;->a:Ljava/util/List;

    iget v3, p0, Lh02/a0;->x:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luc3/c;

    iget-object v1, v1, Luc3/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Luc3/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh02/a0;->z:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Lh02/a0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lh02/a0;->E:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    iget v3, p0, Lh02/a0;->x:I

    invoke-static {v0, v3, v1, v2}, Lsz0/x0;->b(Lq2/a;ILkotlin/jvm/functions/Function1;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh02/a0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh02/a0;->z:Ljava/lang/Object;

    check-cast v1, Llw1/i;

    iget-object v2, p0, Lh02/a0;->E:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    iget v3, p0, Lh02/a0;->x:I

    invoke-static {v3, v0, v1, v2}, Lkw1/j;->b(ILkotlin/jvm/functions/Function1;Llw1/i;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh02/a0;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iget-object v1, p0, Lh02/a0;->z:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/audio/AudioPlayer;

    iget-object v2, p0, Lh02/a0;->E:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    iget v3, p0, Lh02/a0;->x:I

    invoke-static {v0, v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->m(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lh02/a0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh02/a0;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lh02/a0;->E:Ljava/lang/Object;

    check-cast v2, Lq0/y;

    iget v3, p0, Lh02/a0;->x:I

    invoke-static {v0, v3, v1, v2}, Lh02/b0;->c(Lkotlin/jvm/functions/Function1;ILbc3/c0;Lq0/y;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
