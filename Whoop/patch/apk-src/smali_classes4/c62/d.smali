.class public final Lc62/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lc62/d;",
        "",
        "<init>",
        "()V",
        "Ly52/e;",
        "domainResult",
        "Lc62/c;",
        "a",
        "(Ly52/e;)Lc62/c;",
        "Ljb1/a;",
        "Ljb1/a;",
        "designItemReducer",
        "recovery-impacts-mini-arch_release"
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

    sput v0, Lc62/d;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lc62/b;->d()Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lc62/d;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Ly52/e;)Lc62/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly52/e;->b()Ly52/d;

    move-result-object v0

    sget-object v1, Ly52/d$a;->a:Ly52/d$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lc62/c$a;->a:Lc62/c$a;

    return-object p1

    :cond_0
    sget-object v1, Ly52/d$b;->a:Ly52/d$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lc62/c$b;->a:Lc62/c$b;

    return-object p1

    :cond_1
    sget-object v1, Ly52/d$c;->a:Ly52/d$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ly52/e;->a()Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lc62/d;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;->getImpactSummaryCard()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    new-instance v0, Lc62/c$c;

    invoke-direct {v0, p1}, Lc62/c$c;-><init>(Lm91/u;)V

    return-object v0

    :cond_2
    sget-object p1, Lc62/c$a;->a:Lc62/c$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
