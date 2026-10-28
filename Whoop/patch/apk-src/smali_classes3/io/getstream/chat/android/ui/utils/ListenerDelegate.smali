.class public final Lio/getstream/chat/android/ui/utils/ListenerDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lf93/d;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\r\u001a\u00028\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u000bH\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/ListenerDelegate;",
        "",
        "L",
        "Lf93/d;",
        "initialValue",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "wrap",
        "<init>",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "thisRef",
        "Lj93/z;",
        "property",
        "getValue",
        "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;",
        "value",
        "Ll83/a0;",
        "setValue",
        "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V",
        "realListener",
        "Ljava/lang/Object;",
        "wrapper",
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


# instance fields
.field private realListener:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field

.field private final wrapper:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "initialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wrap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->realListener:Ljava/lang/Object;

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v0, 0xa

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->wrapper:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/utils/ListenerDelegate;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->realListener:Ljava/lang/Object;

    return-object p0
.end method

.method private static final wrapper$lambda$0(Lio/getstream/chat/android/ui/utils/ListenerDelegate;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->realListener:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            ")T",
            "L;"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->wrapper:Ljava/lang/Object;

    return-object p1
.end method

.method public final setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            "T",
            "L;",
            ")V"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->realListener:Ljava/lang/Object;

    return-void
.end method
