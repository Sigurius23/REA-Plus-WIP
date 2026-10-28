.class public final Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static findViewByKey(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;Ljava/lang/String;)Landroid/view/View;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;->access$findViewByKey$jd(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;Ljava/lang/String;)Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method
