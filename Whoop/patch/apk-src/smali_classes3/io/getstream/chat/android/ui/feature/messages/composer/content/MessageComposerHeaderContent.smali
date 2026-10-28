.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001R$\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "getDismissActionClickListener",
        "()Lc93/a;",
        "setDismissActionClickListener",
        "(Lc93/a;)V",
        "dismissActionClickListener",
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


# direct methods
.method public static synthetic access$findViewByKey$jd(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract getDismissActionClickListener()Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation
.end method

.method public abstract setDismissActionClickListener(Lc93/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation
.end method
