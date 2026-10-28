.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\"\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0008\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;",
        "",
        "appSettings",
        "Lio/getstream/chat/android/models/AppSettings;",
        "maxAttachmentCount",
        "",
        "canSendLinks",
        "",
        "maxMessageLength",
        "<init>",
        "(Lio/getstream/chat/android/models/AppSettings;IZI)V",
        "getCanSendLinks",
        "()Z",
        "setCanSendLinks",
        "(Z)V",
        "getMaxMessageLength",
        "()I",
        "setMaxMessageLength",
        "(I)V",
        "validateMessage",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
        "message",
        "",
        "attachments",
        "Lio/getstream/chat/android/models/Attachment;",
        "validateMessageLength",
        "validateAttachmentCount",
        "validateImageAttachmentSize",
        "validateFileAttachmentSize",
        "validateCanSendLinks",
        "Companion",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator$Companion;

.field private static final DEFAULT_MESSAGE_LENGTH:I = 0x1388


# instance fields
.field private final appSettings:Lio/getstream/chat/android/models/AppSettings;

.field private canSendLinks:Z

.field private final maxAttachmentCount:I

.field private maxMessageLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->Companion:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/AppSettings;IZI)V
    .locals 1

    const-string v0, "appSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    .line 3
    iput p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxAttachmentCount:I

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->canSendLinks:Z

    .line 5
    iput p4, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxMessageLength:I

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/AppSettings;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/16 p4, 0x1388

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;-><init>(Lio/getstream/chat/android/models/AppSettings;IZI)V

    return-void
.end method

.method private final validateAttachmentCount(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;"
        }
    .end annotation

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxAttachmentCount:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxAttachmentCount:I

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;-><init>(II)V

    return-object v0

    :cond_1
    return-object v2
.end method

.method private final validateCanSendLinks(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$ContainsLinksWhenNotAllowed;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$ContainsLinksWhenNotAllowed;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->canSendLinks:Z

    if-nez v1, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->containsLinks(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final validateFileAttachmentSize(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v2

    int-to-long v2, v2

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/App;->getFileUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/FileUploadConfig;->getSizeLimitInBytes()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_5

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/App;->getFileUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/FileUploadConfig;->getSizeLimitInBytes()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;-><init>(Ljava/util/List;J)V

    return-object v0

    :cond_5
    return-object v1
.end method

.method private final validateImageAttachmentSize(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v2

    int-to-long v2, v2

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/App;->getImageUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/FileUploadConfig;->getSizeLimitInBytes()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_5

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/App;->getImageUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/FileUploadConfig;->getSizeLimitInBytes()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;-><init>(Ljava/util/List;J)V

    return-object v0

    :cond_5
    return-object v1
.end method

.method private final validateMessageLength(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxMessageLength:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxMessageLength:I

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;-><init>(II)V

    return-object v0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public final getCanSendLinks()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->canSendLinks:Z

    return v0
.end method

.method public final getMaxMessageLength()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxMessageLength:I

    return v0
.end method

.method public final setCanSendLinks(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->canSendLinks:Z

    return-void
.end method

.method public final setMaxMessageLength(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->maxMessageLength:I

    return-void
.end method

.method public final validateMessage(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateMessageLength(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object v0

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateAttachmentCount(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object v1

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateImageAttachmentSize(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object v2

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateFileAttachmentSize(Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object p2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateCanSendLinks(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object p1

    filled-new-array {v0, v1, v2, p2, p1}, [Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
