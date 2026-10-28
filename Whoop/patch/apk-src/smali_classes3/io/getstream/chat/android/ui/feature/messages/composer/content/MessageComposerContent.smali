.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$DefaultImpls;,
        Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "messageComposerContext",
        "Ll83/a0;",
        "attachContext",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "state",
        "renderState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V",
        "",
        "key",
        "Landroid/view/View;",
        "findViewByKey",
        "(Ljava/lang/String;)Landroid/view/View;",
        "PredefinedKeys",
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


# static fields
.field public static final PredefinedKeys:Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;

.field public static final RECORD_AUDIO_BUTTON:Ljava/lang/String; = "record_audio_button"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->PredefinedKeys:Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;

    return-void
.end method

.method public static synthetic access$findViewByKey$jd(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract attachContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V
.end method

.method public findViewByKey(Ljava/lang/String;)Landroid/view/View;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
.end method
