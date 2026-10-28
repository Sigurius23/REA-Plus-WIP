.class public final Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lf93/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\u0004*\u0001\u000e\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u000b\u001a\u00028\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;",
        "",
        "T",
        "Lf93/c;",
        "Lkotlin/Function0;",
        "value",
        "<init>",
        "(Lc93/a;)V",
        "thisRef",
        "Lj93/z;",
        "property",
        "getValue",
        "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;",
        "Lc93/a;",
        "io/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1",
        "threadLocal",
        "Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;",
        "stream-chat-android-client_release"
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
.field private final threadLocal:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;

.field private final value:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;->value:Lc93/a;

    new-instance p1, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;-><init>(Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;->threadLocal:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;

    return-void
.end method

.method public static final synthetic access$getValue$p(Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;->value:Lc93/a;

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
            ")TT;"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;->threadLocal:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
