.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;",
        "",
        "transliterationId",
        "<init>",
        "(Ljava/lang/String;)V",
        "id",
        "Ll83/a0;",
        "setTransliterator",
        "text",
        "transliterate",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Landroid/icu/text/Transliterator;",
        "transliterator",
        "Landroid/icu/text/Transliterator;",
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


# instance fields
.field private final logger$delegate:Ll83/h;

.field private transliterator:Landroid/icu/text/Transliterator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "Chat:Transliterator"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->logger$delegate:Ll83/h;

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    if-eqz p1, :cond_1

    .line 5
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->setTransliterator(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->getLogger()Lb23/k;

    move-result-object p1

    .line 7
    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    .line 8
    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 10
    const-string v1, "This android version: "

    const-string v4, " doesn\'t support transliteration natively. User a custom StreamTransliterator to add transliteration."

    .line 11
    invoke-static {v0, v1, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 12
    invoke-interface {p1, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final setTransliterator(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Landroid/icu/text/Transliterator;->getAvailableIDs()Ljava/util/Enumeration;

    move-result-object v0

    const-string v1, "getAvailableIDs(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm83/t;

    invoke-direct {v1, v0}, Lm83/t;-><init>(Ljava/util/Enumeration;)V

    invoke-static {v1}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    invoke-static {v0, p1}, Lxb3/k;->o(Lxb3/i;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/icu/text/Transliterator;->getInstance(Ljava/lang/String;)Landroid/icu/text/Transliterator;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->transliterator:Landroid/icu/text/Transliterator;

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "The id: "

    const-string v4, " for transliteration is not available"

    invoke-static {v1, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v3, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final transliterate(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "[transliterate] input: "

    const-string v1, "text"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->transliterator:Landroid/icu/text/Transliterator;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroid/icu/text/Transliterator;->transliterate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", output: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v2, v5, v4, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-object v1

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[transliterate] failed("

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "): "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v4, v3, v2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-object p1
.end method
