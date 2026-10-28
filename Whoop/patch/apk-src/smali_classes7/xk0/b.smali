.class public final Lxk0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B/\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010\'\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lxk0/b;",
        "",
        "Lec3/l;",
        "Lnl0/f;",
        "viewState",
        "Lxk0/a;",
        "analyticsHelper",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;)V",
        "Lbc3/c0;",
        "scope",
        "Ll83/a0;",
        "i",
        "(Lbc3/c0;)V",
        "h",
        "()V",
        "a",
        "Lec3/l;",
        "b",
        "Lxk0/a;",
        "c",
        "Lzr2/a;",
        "d",
        "Ltr2/n;",
        "",
        "e",
        "Ljava/lang/Long;",
        "lastMessageSentTimestamp",
        "",
        "f",
        "Z",
        "isWaitingForResponse",
        "",
        "g",
        "Ljava/lang/String;",
        "currentConversationId",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final b:Lxk0/a;

.field private final c:Lzr2/a;

.field private final d:Ltr2/n;

.field private e:Ljava/lang/Long;

.field private f:Z

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lxk0/a;",
            "Lzr2/a;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxk0/b;->a:Lec3/l;

    .line 3
    iput-object p2, p0, Lxk0/b;->b:Lxk0/a;

    .line 4
    iput-object p3, p0, Lxk0/b;->c:Lzr2/a;

    .line 5
    iput-object p4, p0, Lxk0/b;->d:Ltr2/n;

    .line 6
    const-string p1, ""

    iput-object p1, p0, Lxk0/b;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "AiConversationAnalyticsTracker"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lxk0/b;-><init>(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lxk0/b;)Lxk0/a;
    .locals 0

    iget-object p0, p0, Lxk0/b;->b:Lxk0/a;

    return-object p0
.end method

.method public static final synthetic b(Lxk0/b;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lxk0/b;->c:Lzr2/a;

    return-object p0
.end method

.method public static final synthetic c(Lxk0/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lxk0/b;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lxk0/b;)Lec3/l;
    .locals 0

    iget-object p0, p0, Lxk0/b;->a:Lec3/l;

    return-object p0
.end method

.method public static final synthetic e(Lxk0/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lxk0/b;->g:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic f(Lxk0/b;Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lxk0/b;->e:Ljava/lang/Long;

    return-void
.end method

.method public static final synthetic g(Lxk0/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lxk0/b;->f:Z

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 6

    iget-object v0, p0, Lxk0/b;->b:Lxk0/a;

    iget-object v1, p0, Lxk0/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxk0/a;->i(Ljava/lang/String;)V

    iget-boolean v0, p0, Lxk0/b;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxk0/b;->e:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object v0, p0, Lxk0/b;->c:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->b()J

    move-result-wide v4

    sub-long/2addr v4, v2

    iget-object v0, p0, Lxk0/b;->b:Lxk0/a;

    iget-object v2, p0, Lxk0/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v4, v5}, Lxk0/a;->G(Ljava/lang/String;J)V

    iget-object v0, p0, Lxk0/b;->d:Ltr2/n;

    const-string v2, "User exited while waiting for response. Time waited: "

    const-string v3, " ms"

    invoke-static {v4, v5, v2, v3}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lxk0/b;->e:Ljava/lang/Long;

    iput-boolean v1, p0, Lxk0/b;->f:Z

    return-void
.end method

.method public final i(Lbc3/c0;)V
    .locals 3

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lxk0/b$a;-><init>(Lxk0/b;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lxk0/b$b;

    invoke-direct {v0, p0, v1}, Lxk0/b$b;-><init>(Lxk0/b;Lq83/d;)V

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lxk0/b$c;

    invoke-direct {v0, p0, v1}, Lxk0/b$c;-><init>(Lxk0/b;Lq83/d;)V

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
