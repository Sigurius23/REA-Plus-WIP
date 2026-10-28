.class public final Lf53/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/android/video/generated/models/VideoEvent;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/android/video/generated/models/VideoEvent;I)V
    .locals 0

    iput p2, p0, Lf53/e;->w:I

    iput-object p1, p0, Lf53/e;->x:Lio/getstream/android/video/generated/models/VideoEvent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf53/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUserSessionId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lf53/e;->x:Lio/getstream/android/video/generated/models/VideoEvent;

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUserSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lx43/k;

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf53/e;->x:Lio/getstream/android/video/generated/models/VideoEvent;

    invoke-virtual {p1, v0}, Lx43/k;->h(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
