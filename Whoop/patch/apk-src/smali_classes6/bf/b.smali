.class public abstract Lbf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#BusinessMetrics"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/b;->a:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#AccountIdBasedEndpointAccountId"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/b;->b:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ServiceEndpointOverride"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/b;->c:Lgf/a;

    return-void
.end method

.method public static final a(Ldg/a;Lbf/c;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ldg/a;->y:Lgf/c;

    sget-object v0, Lbf/b;->a:Lgf/a;

    invoke-virtual {p0, v0}, Lgf/c;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Ldg/a;Lbf/a;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ldg/a;->y:Lgf/c;

    sget-object v0, Lbf/b;->a:Lgf/a;

    invoke-virtual {p0, v0}, Lgf/c;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Lbf/a;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Ldt/b;->A([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lgf/l;Lbf/a;)V
    .locals 3

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbf/b;->a:Lgf/a;

    invoke-interface {p0, v0}, Lgf/b;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Lbf/a;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Ldt/b;->A([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lgf/l;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d()Lgf/a;
    .locals 1

    sget-object v0, Lbf/b;->a:Lgf/a;

    return-object v0
.end method

.method public static final e()Lgf/a;
    .locals 1

    sget-object v0, Lbf/b;->c:Lgf/a;

    return-object v0
.end method

.method public static final f(Ldg/a;Lbf/c;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ldg/a;->y:Lgf/c;

    sget-object v0, Lbf/b;->a:Lgf/a;

    invoke-virtual {p0, v0}, Lgf/c;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
