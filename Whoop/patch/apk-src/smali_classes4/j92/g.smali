.class public final Lj92/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lj92/g;",
        "Lud3/g0;",
        "Lad3/c;",
        "json",
        "Li92/d;",
        "mfaEnforcer",
        "Ltm0/a;",
        "cacheNuke",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;)V",
        "Lud3/o0;",
        "request",
        "",
        "c",
        "(Lud3/o0;)Z",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "w",
        "Lad3/c;",
        "x",
        "Li92/d;",
        "y",
        "Ltm0/a;",
        "z",
        "Lj92/t;",
        "E",
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
.field private final E:Ltr2/n;

.field private final w:Lad3/c;

.field private final x:Li92/d;

.field private final y:Ltm0/a;

.field private final z:Lj92/t;


# direct methods
.method public constructor <init>(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mfaEnforcer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheNuke"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj92/g;->w:Lad3/c;

    .line 3
    iput-object p2, p0, Lj92/g;->x:Li92/d;

    .line 4
    iput-object p3, p0, Lj92/g;->y:Ltm0/a;

    .line 5
    iput-object p4, p0, Lj92/g;->z:Lj92/t;

    .line 6
    iput-object p5, p0, Lj92/g;->E:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 7
    new-instance p4, Lj92/t;

    invoke-direct {p4}, Lj92/t;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 8
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "MfaEnforcementInterceptor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lj92/g;-><init>(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lj92/g;)Ltm0/a;
    .locals 0

    iget-object p0, p0, Lj92/g;->y:Ltm0/a;

    return-object p0
.end method

.method public static final synthetic b(Lj92/g;)Li92/d;
    .locals 0

    iget-object p0, p0, Lj92/g;->x:Li92/d;

    return-object p0
.end method

.method private final c(Lud3/o0;)Z
    .locals 1

    iget-object v0, p0, Lj92/g;->z:Lj92/t;

    iget-object p1, p1, Lud3/o0;->a:Lud3/e0;

    invoke-static {v0, p1}, Lj92/u;->b(Lj92/t;Lud3/e0;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public intercept(Lud3/f0;)Lud3/x0;
    .locals 5

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    iget v0, p1, Lud3/x0;->z:I

    const/16 v1, 0x193

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lud3/x0;->w:Lud3/o0;

    invoke-direct {p0, v0}, Lj92/g;->c(Lud3/o0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    const-wide/32 v0, 0x100000

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1}, Lud3/x0;->i(J)Lud3/z0;

    move-result-object v0

    invoke-virtual {v0}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v0

    iget-object v1, p0, Lj92/g;->w:Lad3/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/service/network/ForbiddenErrorResponse;->Companion:Lcom/whoop/service/network/ForbiddenErrorResponse$a;

    invoke-virtual {v4}, Lcom/whoop/service/network/ForbiddenErrorResponse$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-static {v1, v4, v0}, Lv8/b;->n(Lad3/c;Lwc3/b;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/ForbiddenErrorResponse;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2

    :goto_0
    iget-object v1, p0, Lj92/g;->E:Ltr2/n;

    const-string v4, "Failed to read error body from 403 response"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v4, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_1
    move-object v0, v3

    goto :goto_3

    :goto_2
    iget-object v1, p0, Lj92/g;->E:Ltr2/n;

    const-string v4, "Failed to parse error body from 403 response"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v4, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_1

    :goto_3
    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/service/network/ForbiddenErrorResponse;->getErrorState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MFA_REQUIRED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lj92/g$a;

    invoke-direct {v0, p0, p1, v3}, Lj92/g$a;-><init>(Lj92/g;Lud3/x0;Lq83/d;)V

    invoke-static {v0}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    :cond_2
    :goto_4
    return-object p1
.end method
