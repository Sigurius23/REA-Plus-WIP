.class public final synthetic Lim1/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lim1/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/l0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/navigation/CustomizeOverviewModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/navigation/CoachScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/navigation/ChatEntrypointExperience;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/navigation/AiCoachChatScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/navigation/AiAction;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/navigation/AiAction;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/navigation/AiAction;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->i()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->c()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v0

    return-object v0

    :pswitch_8
    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    new-instance v0, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;-><init>()V

    return-object v0

    :pswitch_9
    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;->Companion:Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory$Companion;->defaultFactory()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->g()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->k()Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->j()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->f()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->h()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->e()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;

    move-result-object v0

    return-object v0

    :pswitch_10
    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DurationFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;->defaultFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->a()Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->d()Lio/getstream/chat/android/ui/font/ChatFontsImpl;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->a()La0/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->c()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->b()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lio/getstream/chat/android/client/ChatClient$Builder;->b()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lio/getstream/chat/android/client/ChatClient;->n()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lim1/t0;->Z()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lim1/t0;->X()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lim1/t0;->D()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lim1/t0;->e()Ll83/a0;

    move-result-object v0

    return-object v0

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
