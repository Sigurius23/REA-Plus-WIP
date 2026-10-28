.class public final synthetic Lio/getstream/chat/android/client/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/k;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Liz0/i;->a()Liz0/m;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lix2/c;->i()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lix2/c;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Liw0/x;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lio2/m0;->j()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->w:I

    return-object v1

    :pswitch_6
    sget v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->w:I

    return-object v1

    :pswitch_7
    invoke-static {}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->h()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    return-object v0

    :pswitch_8
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    return-object v0

    :pswitch_9
    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    return-object v1

    :pswitch_a
    invoke-static {}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;->a()Lio/getstream/chat/android/client/cdn/CDN;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_c
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;-><init>()V

    return-object v0

    :pswitch_d
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;-><init>()V

    return-object v0

    :pswitch_e
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;-><init>()V

    return-object v0

    :pswitch_f
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;-><init>()V

    return-object v0

    :pswitch_10
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;-><init>()V

    return-object v0

    :pswitch_11
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;-><init>()V

    return-object v0

    :pswitch_12
    sget-object v0, Lio/getstream/chat/android/client/parser2/DirectEventParser;->Companion:Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;-><init>()V

    return-object v0

    :pswitch_13
    invoke-static {}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->c()Lqx/l0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->a()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->b()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1c
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    const v0, -0x8f208d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
