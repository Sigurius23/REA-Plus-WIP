.class public abstract Ldc3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldc3/p;

.field public static final b:I

.field public static final c:I

.field public static final d:Lhc3/x;

.field public static final e:Lhc3/x;

.field public static final f:Lhc3/x;

.field public static final g:Lhc3/x;

.field public static final h:Lhc3/x;

.field public static final i:Lhc3/x;

.field public static final j:Lhc3/x;

.field public static final k:Lhc3/x;

.field public static final l:Lhc3/x;

.field public static final m:Lhc3/x;

.field public static final n:Lhc3/x;

.field public static final o:Lhc3/x;

.field public static final p:Lhc3/x;

.field public static final q:Lhc3/x;

.field public static final r:Lhc3/x;

.field public static final s:Lhc3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ldc3/p;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ldc3/p;-><init>(JLdc3/p;Ldc3/h;I)V

    sput-object v0, Ldc3/j;->a:Ldc3/p;

    const/16 v0, 0x20

    const/16 v1, 0xc

    const-string v2, "kotlinx.coroutines.bufferedChannel.segmentSize"

    invoke-static {v0, v1, v2}, Lhc3/b;->k(IILjava/lang/String;)I

    move-result v0

    sput v0, Ldc3/j;->b:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    invoke-static {v2, v1, v0}, Lhc3/b;->k(IILjava/lang/String;)I

    move-result v0

    sput v0, Ldc3/j;->c:I

    new-instance v0, Lhc3/x;

    const-string v1, "BUFFERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->d:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->e:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->f:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->g:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "POISONED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->h:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->i:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->j:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->k:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->l:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->m:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->n:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->o:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->p:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->q:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->r:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldc3/j;->s:Lhc3/x;

    return-void
.end method

.method public static final a(Lbc3/k;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, Lbc3/k;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lhc3/x;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lbc3/k;->n(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
