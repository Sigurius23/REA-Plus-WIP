.class public final Lyo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t*\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lyo2/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lvo2/a$a;",
        "",
        "cartId",
        "Lxo2/c;",
        "b",
        "(Lvo2/a$a;Ljava/lang/String;)Lxo2/c;",
        "Lvo2/c;",
        "Lxo2/c$a;",
        "dialog",
        "c",
        "(Lvo2/c;Lxo2/c$a;)Lxo2/c;",
        "domainResult",
        "a",
        "(Lvo2/c;)Lxo2/c;",
        "Ljb1/a;",
        "universal-checkout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lyo2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyo2/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lyo2/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lyo2/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lvo2/a$a;Ljava/lang/String;)Lxo2/c;
    .locals 9

    instance-of v0, p1, Lvo2/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lxo2/c;

    new-instance v2, Lxo2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lxo2/c$b;-><init>(Lsz0/q0;Lxo2/a;Lxo2/a;Lxo2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lxo2/c;-><init>(Lxo2/c$a;Lxo2/c$b;Lxo2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lvo2/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lxo2/c;

    new-instance v2, Lxo2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lxo2/a$e;

    invoke-direct {v4, p2}, Lxo2/a$e;-><init>(Ljava/lang/String;)V

    sget-object v6, Lxo2/a$f;->a:Lxo2/a$f;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lxo2/c$b;-><init>(Lsz0/q0;Lxo2/a;Lxo2/a;Lxo2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lxo2/c;-><init>(Lxo2/c$a;Lxo2/c$b;Lxo2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lvo2/a$d;

    if-eqz p1, :cond_2

    new-instance v0, Lxo2/c;

    new-instance v1, Lxo2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lxo2/a$e;

    invoke-direct {v3, p2}, Lxo2/a$e;-><init>(Ljava/lang/String;)V

    sget-object v5, Lxo2/a$f;->a:Lxo2/a$f;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lxo2/c$b;-><init>(Lsz0/q0;Lxo2/a;Lxo2/a;Lxo2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lxo2/c;-><init>(Lxo2/c$a;Lxo2/c$b;Lxo2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lvo2/c;Lxo2/c$a;)Lxo2/c;
    .locals 6

    new-instance v3, Lxo2/c$c;

    invoke-virtual {p1}, Lvo2/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvo2/c;->c()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;->getRedirectUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-direct {v3, v0, p1}, Lxo2/c$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lxo2/c;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lxo2/c;-><init>(Lxo2/c$a;Lxo2/c$b;Lxo2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lvo2/c;)Lxo2/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lvo2/c;->b()Lvo2/a;

    move-result-object v0

    instance-of v0, v0, Lvo2/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lvo2/c;->b()Lvo2/a;

    move-result-object v0

    check-cast v0, Lvo2/a$a;

    invoke-virtual {p1}, Lvo2/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lyo2/a;->b(Lvo2/a$a;Ljava/lang/String;)Lxo2/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lyo2/a;->c(Lvo2/c;Lxo2/c$a;)Lxo2/c;

    move-result-object p1

    return-object p1
.end method
