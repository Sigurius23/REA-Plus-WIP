.class public final Ltq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB!\u0008\u0016\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ltq1/b;",
        "",
        "Lgq1/a;",
        "analyticsHelper",
        "Lkotlin/Function0;",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Lgq1/a;Lc93/a;Lj02/o0;)V",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "(Landroidx/fragment/app/m0;Lgq1/a;Lj02/o0;)V",
        "Ltq1/a;",
        "event",
        "Ll83/a0;",
        "c",
        "(Ltq1/a;)V",
        "a",
        "Lgq1/a;",
        "b",
        "Lc93/a;",
        "Lj02/o0;",
        "behavior-impact_release"
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
.field private final a:Lgq1/a;

.field private final b:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final c:Lj02/o0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lgq1/a;Lj02/o0;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Llh2/f;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Llh2/f;-><init>(Landroidx/fragment/app/m0;I)V

    invoke-direct {p0, p2, v0, p3}, Ltq1/b;-><init>(Lgq1/a;Lc93/a;Lj02/o0;)V

    return-void
.end method

.method public constructor <init>(Lgq1/a;Lc93/a;Lj02/o0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgq1/a;",
            "Lc93/a;",
            "Lj02/o0;",
            ")V"
        }
    .end annotation

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltq1/b;->a:Lgq1/a;

    .line 3
    iput-object p2, p0, Ltq1/b;->b:Lc93/a;

    .line 4
    iput-object p3, p0, Ltq1/b;->c:Lj02/o0;

    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/m0;)Leb/a0;
    .locals 0

    invoke-static {p0}, Ltq1/b;->b(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/fragment/app/m0;)Leb/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ltq1/a;)V
    .locals 13

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltq1/a$b;

    const/4 v1, 0x0

    const-string v2, "uri"

    if-eqz v0, :cond_0

    sget v9, Lnf1/a;->e:I

    sget v12, Lnf1/a;->p:I

    new-instance v3, Leb/x0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v6

    move v11, v6

    invoke-direct/range {v3 .. v12}, Leb/x0;-><init>(ZZIZZIIII)V

    check-cast p1, Ltq1/a$b;

    invoke-virtual {p1}, Ltq1/a$b;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1}, Ltq1/a$b;->b()Z

    move-result p1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/behavior_impact_details?impactId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "?isNew="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "?source="

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v2, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Ltq1/b;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1, v3}, Leb/a0;->x(Leb/k0;Leb/x0;)V

    return-void

    :cond_0
    instance-of v0, p1, Ltq1/a$c;

    if-eqz v0, :cond_1

    iget-object p1, p0, Ltq1/b;->a:Lgq1/a;

    invoke-virtual {p1}, Lgq1/a;->b()V

    const-string p1, "android-app://com.whoop/journal_settings_fragment_v2"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/k0;

    invoke-direct {v0, p1, v1, v1}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ltq1/b;->b:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_1
    instance-of v0, p1, Ltq1/a$e;

    if-eqz v0, :cond_2

    iget-object p1, p0, Ltq1/b;->b:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Ltq1/a$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ltq1/b;->c:Lj02/o0;

    check-cast p1, Ltq1/a$d;

    invoke-virtual {p1}, Ltq1/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_3
    sget-object v0, Ltq1/a$f;->a:Ltq1/a$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    instance-of p1, p1, Ltq1/a$a;

    if-eqz p1, :cond_4

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    return-void
.end method
