.class public final Lwy1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lwy1/d;",
        "",
        "Ly92/a;",
        "authManager",
        "Lj92/k;",
        "oauthTokenRefresher",
        "Lq83/j;",
        "ioContext",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly92/a;Lj92/k;Lq83/j;Ltr2/n;)V",
        "",
        "accessToken",
        "Lud3/o0;",
        "c",
        "(Ljava/lang/String;)Lud3/o0;",
        "Lud3/x0;",
        "d",
        "(Ljava/lang/String;)Lud3/x0;",
        "",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Ly92/a;",
        "Lj92/k;",
        "Lq83/j;",
        "Ltr2/n;",
        "mfa_release"
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

.field private final b:Lj92/k;

.field private final c:Lq83/j;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Ly92/a;Lj92/k;Lq83/j;Ltr2/n;)V
    .locals 1

    const-string v0, "authManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oauthTokenRefresher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwy1/d;->a:Ly92/a;

    .line 3
    iput-object p2, p0, Lwy1/d;->b:Lj92/k;

    .line 4
    iput-object p3, p0, Lwy1/d;->c:Lq83/j;

    .line 5
    iput-object p4, p0, Lwy1/d;->d:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Ly92/a;Lj92/k;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    .line 7
    sget-object p3, Lkc3/d;->w:Lkc3/d;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 8
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "MfaTokenRefresher"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lwy1/d;-><init>(Ly92/a;Lj92/k;Lq83/j;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lwy1/d;)Lj92/k;
    .locals 0

    iget-object p0, p0, Lwy1/d;->b:Lj92/k;

    return-object p0
.end method

.method private final c(Ljava/lang/String;)Lud3/o0;
    .locals 3

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    const-string v1, "https://api.prod.whoop.com/fake-url-mfa-state-change-token-refresh"

    invoke-virtual {v0, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    sget-object v1, Lj92/i;->F:Lj92/i$a;

    invoke-virtual {v1}, Lj92/i$a;->c()Ljava/util/Locale;

    move-result-object v1

    const/4 v2, 0x1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Bearer %s"

    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Authorization"

    invoke-virtual {v0, v1, p1}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method

.method private final d(Ljava/lang/String;)Lud3/x0;
    .locals 18

    sget-object v7, Lud3/a1;->x:Lud3/z0;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct/range {p0 .. p1}, Lwy1/d;->c(Ljava/lang/String;)Lud3/o0;

    move-result-object v1

    const-string v2, "request"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lud3/m0;->z:Lud3/m0;

    new-instance v6, Lud3/d0;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-direct {v6, v0}, Lud3/d0;-><init>([Ljava/lang/String;)V

    new-instance v0, Lud3/x0;

    const-string v3, "OK"

    const/16 v4, 0xc8

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    sget-object v17, Lud3/d1;->A:Lud3/t;

    invoke-direct/range {v0 .. v17}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwy1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwy1/d$a;

    iget v1, v0, Lwy1/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwy1/d$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwy1/d$a;

    invoke-direct {v0, p0, p1}, Lwy1/d$a;-><init>(Lwy1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lwy1/d$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwy1/d$a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lwy1/d$a;->x:Ljava/lang/Object;

    check-cast v1, Lud3/x0;

    iget-object v0, v0, Lwy1/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/AuthMaterial;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwy1/d;->a:Ly92/a;

    iput v5, v0, Lwy1/d$a;->E:I

    invoke-virtual {p1, v0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    if-nez p1, :cond_5

    iget-object p1, p0, Lwy1/d;->d:Ltr2/n;

    const-string v0, "can\'t refresh token for MFA state change without auth material"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lwy1/d;->d(Ljava/lang/String;)Lud3/x0;

    move-result-object p1

    iget-object v2, p0, Lwy1/d;->c:Lq83/j;

    new-instance v5, Lwy1/d$b;

    const/4 v6, 0x0

    invoke-direct {v5, p0, p1, v6}, Lwy1/d$b;-><init>(Lwy1/d;Lud3/x0;Lq83/d;)V

    iput-object v6, v0, Lwy1/d$a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lwy1/d$a;->x:Ljava/lang/Object;

    iput v4, v0, Lwy1/d$a;->E:I

    invoke-static {v2, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lwy1/d;->d:Ltr2/n;

    const-string v2, "refresh token call success: "

    invoke-static {v2, v0}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1
.end method
