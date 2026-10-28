.class public final synthetic La41/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput v0, p0, La41/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La41/h;->x:I

    iput-object p2, p0, La41/h;->y:Ljava/lang/Object;

    iput-object p3, p0, La41/h;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La41/h;->w:I

    iput-object p1, p0, La41/h;->y:Ljava/lang/Object;

    iput p2, p0, La41/h;->x:I

    iput-object p3, p0, La41/h;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, La41/h;->w:I

    iput-object p1, p0, La41/h;->y:Ljava/lang/Object;

    iput-object p2, p0, La41/h;->z:Ljava/lang/Object;

    iput p3, p0, La41/h;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, La41/h;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, La41/h;->z:Ljava/lang/Object;

    iget-object v3, p0, La41/h;->y:Ljava/lang/Object;

    iget v4, p0, La41/h;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lp1/c1;

    check-cast v2, Lp1/c1;

    invoke-static {v4, v3, v2}, Lwz0/d;->c(ILp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4, v2}, Lvo1/x;->e(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    check-cast v2, Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-static {v3, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->l(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;I)V

    return-object v1

    :pswitch_2
    check-cast v3, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    check-cast v2, Ljava/lang/String;

    invoke-static {v3, v2, v4}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->e(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;I)Lo23/d;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v3, Lg40/r0;

    check-cast v2, Lp1/c1;

    sget v0, Lg40/y0;->a:F

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lg40/r0;->u(Ljava/lang/Integer;)V

    return-object v1

    :pswitch_4
    check-cast v3, Lc93/m;

    check-cast v2, Lxk1/c;

    invoke-static {v3, v2, v4}, Ldl1/d;->j(Lc93/m;Lxk1/c;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v3, Lkotlin/jvm/functions/Function3;

    check-cast v2, Lza2/l;

    invoke-static {v3, v2, v4}, Lbb2/i;->g(Lkotlin/jvm/functions/Function3;Lza2/l;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v3, Lbc3/c0;

    check-cast v2, Lq0/b;

    invoke-static {v3, v2, v4}, La41/l;->f(Lbc3/c0;Lq0/b;I)Ll83/a0;

    move-result-object v0

    return-object v0

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
