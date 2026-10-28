.class public final Llive/hms/video/sessionstore/HmsSessionStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u008f\u0001\u0008\u0000\u0012*\u0010\u0007\u001a&\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012$\u0010\n\u001a \u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008\u0012(\u0010\r\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\'\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001e2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J+\u0010\r\u001a\u00020\u00152\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\r\u0010%J!\u0010\'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020#2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\'\u0010(R8\u0010\u0007\u001a&\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010)R2\u0010\n\u001a \u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Llive/hms/video/sessionstore/HmsSessionStore;",
        "",
        "Lkotlin/Function3;",
        "",
        "Lcom/google/gson/JsonElement;",
        "Lq83/d;",
        "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
        "changeSessionStore",
        "Lkotlin/Function2;",
        "Llive/hms/video/sessionstore/SessionMetadataResult;",
        "getSessionStoreData",
        "",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "addKeyChangeListener",
        "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;",
        "sessionStoreKeyChangeManager",
        "<init>",
        "(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;)V",
        "key",
        "Llive/hms/video/sdk/HMSSessionMetadataListener;",
        "hmsSessionMetadataListener",
        "Ll83/a0;",
        "get",
        "(Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;)V",
        "data",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "set",
        "(Ljava/lang/Object;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "updates",
        "Lbc3/k1;",
        "sendKeyChangeUpdates$lib_release",
        "(Ljava/util/List;)Lbc3/k1;",
        "sendKeyChangeUpdates",
        "forKeys",
        "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
        "keyChangeListener",
        "(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "listener",
        "removeKeyChangeListener",
        "(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;",
        "Lkotlin/jvm/functions/Function3;",
        "Lc93/m;",
        "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final changeSessionStore:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field private final getSessionStoreData:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final sessionStoreKeyChangeManager:Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lc93/m;",
            "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;",
            ")V"
        }
    .end annotation

    const-string v0, "changeSessionStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getSessionStoreData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addKeyChangeListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "sessionStoreKeyChangeManager"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sessionstore/HmsSessionStore;->changeSessionStore:Lkotlin/jvm/functions/Function3;

    .line 3
    iput-object p2, p0, Llive/hms/video/sessionstore/HmsSessionStore;->getSessionStoreData:Lc93/m;

    .line 4
    iput-object p4, p0, Llive/hms/video/sessionstore/HmsSessionStore;->sessionStoreKeyChangeManager:Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 5
    new-instance p4, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    const/4 p5, 0x2

    const/4 p6, 0x0

    invoke-direct {p4, p3, p6, p5, p6}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;-><init>(Lc93/m;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/sessionstore/HmsSessionStore;-><init>(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;)V

    return-void
.end method

.method public static final synthetic access$getChangeSessionStore$p(Llive/hms/video/sessionstore/HmsSessionStore;)Lkotlin/jvm/functions/Function3;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sessionstore/HmsSessionStore;->changeSessionStore:Lkotlin/jvm/functions/Function3;

    return-object p0
.end method

.method public static final synthetic access$getGetSessionStoreData$p(Llive/hms/video/sessionstore/HmsSessionStore;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sessionstore/HmsSessionStore;->getSessionStoreData:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getSessionStoreKeyChangeManager$p(Llive/hms/video/sessionstore/HmsSessionStore;)Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sessionstore/HmsSessionStore;->sessionStoreKeyChangeManager:Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    return-object p0
.end method

.method public static synthetic get$default(Llive/hms/video/sessionstore/HmsSessionStore;Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p1, "default"

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sessionstore/HmsSessionStore;->get(Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;)V

    return-void
.end method

.method public static synthetic removeKeyChangeListener$default(Llive/hms/video/sessionstore/HmsSessionStore;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;ILjava/lang/Object;)Lbc3/k1;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sessionstore/HmsSessionStore;->removeKeyChangeListener(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addKeyChangeListener(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "forKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyChangeListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sessionstore/HmsSessionStore$addKeyChangeListener$1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sessionstore/HmsSessionStore$addKeyChangeListener$1;-><init>(Llive/hms/video/sessionstore/HmsSessionStore;Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final get(Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;)V
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsSessionMetadataListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sessionstore/HmsSessionStore$get$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/sessionstore/HmsSessionStore$get$1;-><init>(Llive/hms/video/sessionstore/HmsSessionStore;Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final removeKeyChangeListener(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sessionstore/HmsSessionStore$removeKeyChangeListener$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/sessionstore/HmsSessionStore$removeKeyChangeListener$1;-><init>(Llive/hms/video/sessionstore/HmsSessionStore;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final sendKeyChangeUpdates$lib_release(Ljava/util/List;)Lbc3/k1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sessionstore/SessionMetadataResult;",
            ">;)",
            "Lbc3/k1;"
        }
    .end annotation

    const-string v0, "updates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sessionstore/HmsSessionStore$sendKeyChangeUpdates$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/sessionstore/HmsSessionStore$sendKeyChangeUpdates$1;-><init>(Llive/hms/video/sessionstore/HmsSessionStore;Ljava/util/List;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 7

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sessionstore/HmsSessionStore$set$1;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sessionstore/HmsSessionStore$set$1;-><init>(Ljava/lang/Object;Llive/hms/video/sessionstore/HmsSessionStore;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
