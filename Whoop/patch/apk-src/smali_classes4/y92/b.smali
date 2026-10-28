.class public final Ly92/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Ly92/b;",
        "",
        "Ly92/a;",
        "authManager",
        "Lbc3/c0;",
        "scope",
        "Lq83/j;",
        "coroutineContext",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;)V",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "authMaterial",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/domain/model/AuthMaterial;)V",
        "Lcom/whoop/domain/model/User;",
        "user",
        "e",
        "(Lcom/whoop/domain/model/User;)V",
        "Lcom/whoop/domain/model/Session;",
        "session",
        "d",
        "(Lcom/whoop/domain/model/Session;)V",
        "a",
        "Ly92/a;",
        "b",
        "Lbc3/c0;",
        "Lq83/j;",
        "Ltr2/n;",
        "core_release"
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
.field private final a:Ly92/a;

.field private final b:Lbc3/c0;

.field private final c:Lq83/j;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;)V
    .locals 1

    const-string v0, "authManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly92/b;->a:Ly92/a;

    .line 3
    iput-object p2, p0, Ly92/b;->b:Lbc3/c0;

    .line 4
    iput-object p3, p0, Ly92/b;->c:Lq83/j;

    .line 5
    iput-object p4, p0, Ly92/b;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget-object p3, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "AuthManagerBridge"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Ly92/b;-><init>(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Ly92/b;)Ly92/a;
    .locals 0

    iget-object p0, p0, Ly92/b;->a:Ly92/a;

    return-object p0
.end method

.method public static final synthetic b(Ly92/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ly92/b;->d:Ltr2/n;

    return-object p0
.end method

.method private final c(Lcom/whoop/domain/model/AuthMaterial;)V
    .locals 4

    iget-object v0, p0, Ly92/b;->b:Lbc3/c0;

    iget-object v1, p0, Ly92/b;->c:Lq83/j;

    new-instance v2, Ly92/b$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Ly92/b$a;-><init>(Ly92/b;Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final e(Lcom/whoop/domain/model/User;)V
    .locals 4

    iget-object v0, p0, Ly92/b;->b:Lbc3/c0;

    iget-object v1, p0, Ly92/b;->c:Lq83/j;

    new-instance v2, Ly92/b$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Ly92/b$b;-><init>(Ly92/b;Lcom/whoop/domain/model/User;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final d(Lcom/whoop/domain/model/Session;)V
    .locals 3

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly92/b;->d:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Submitting Session information"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/AuthToken;->toAuthMaterial()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v0

    invoke-direct {p0, v0}, Ly92/b;->c(Lcom/whoop/domain/model/AuthMaterial;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object p1

    invoke-direct {p0, p1}, Ly92/b;->e(Lcom/whoop/domain/model/User;)V

    return-void
.end method
