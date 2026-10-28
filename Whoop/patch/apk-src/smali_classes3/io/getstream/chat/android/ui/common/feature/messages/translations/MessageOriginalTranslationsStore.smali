.class public final Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R \u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R#\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00100\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;",
        "",
        "<init>",
        "()V",
        "",
        "messageId",
        "",
        "shouldShowOriginalText",
        "(Ljava/lang/String;)Z",
        "Ll83/a0;",
        "showOriginalText",
        "(Ljava/lang/String;)V",
        "hideOriginalText",
        "toggleOriginalText",
        "clear",
        "Lec3/p1;",
        "",
        "_originalTextMessageIds",
        "Lec3/p1;",
        "Lec3/f2;",
        "originalTextMessageIds",
        "Lec3/f2;",
        "getOriginalTextMessageIds",
        "()Lec3/f2;",
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

.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;

.field private static final stores:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final _originalTextMessageIds:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final originalTextMessageIds:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->stores:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->_originalTextMessageIds:Lec3/p1;

    .line 4
    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->originalTextMessageIds:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;-><init>()V

    return-void
.end method

.method public static final synthetic access$getStores$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->stores:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->_originalTextMessageIds:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final getOriginalTextMessageIds()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->originalTextMessageIds:Lec3/f2;

    return-object v0
.end method

.method public final hideOriginalText(Ljava/lang/String;)V
    .locals 2

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->_originalTextMessageIds:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final shouldShowOriginalText(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->_originalTextMessageIds:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final showOriginalText(Ljava/lang/String;)V
    .locals 2

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->_originalTextMessageIds:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-static {p1, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final toggleOriginalText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->shouldShowOriginalText(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->hideOriginalText(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->showOriginalText(Ljava/lang/String;)V

    return-void
.end method
