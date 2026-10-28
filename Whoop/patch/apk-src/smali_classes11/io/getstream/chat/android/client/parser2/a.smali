.class public final synthetic Lio/getstream/chat/android/client/parser2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/parser2/DirectEventParser;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/parser2/DirectEventParser;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/parser2/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/parser2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->a(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->j(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->i(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->k(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->g(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->e(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->h(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->d(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/UserAdapter;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->f(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/a;->x:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->b(Lio/getstream/chat/android/client/parser2/DirectEventParser;)Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
