.class public final Lll1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lll1/a;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lll1/c;",
        "Lod1/g;",
        "Lll1/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Lor2/c;",
        "appDiagnostics",
        "",
        "",
        "requiredPermissions",
        "Ly92/a;",
        "authManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "",
        "androidOSLevel",
        "<init>",
        "(Ltr2/n;Lor2/c;Ljava/util/List;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;I)V",
        "permissionsToCheck",
        "f",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Ltr2/n;",
        "b",
        "Lor2/c;",
        "c",
        "Ljava/util/List;",
        "d",
        "Ly92/a;",
        "e",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "I",
        "home_release"
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
.field private final a:Ltr2/n;

.field private final b:Lor2/c;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ly92/a;

.field private final e:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final f:I


# direct methods
.method public constructor <init>(Ltr2/n;Lor2/c;Ljava/util/List;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Lor2/c;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ly92/a;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "I)V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appDiagnostics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredPermissions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll1/c;->a:Ltr2/n;

    iput-object p2, p0, Lll1/c;->b:Lor2/c;

    iput-object p3, p0, Lll1/c;->c:Ljava/util/List;

    iput-object p4, p0, Lll1/c;->d:Ly92/a;

    iput-object p5, p0, Lll1/c;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput p6, p0, Lll1/c;->f:I

    return-void
.end method

.method public static final synthetic c(Lll1/c;)Ly92/a;
    .locals 0

    iget-object p0, p0, Lll1/c;->d:Ly92/a;

    return-object p0
.end method

.method public static final synthetic d(Lll1/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lll1/c;->c:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(Lll1/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lll1/c;->f(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lll1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lll1/c$c;

    iget v1, v0, Lll1/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lll1/c$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lll1/c$c;

    invoke-direct {v0, p0, p2}, Lll1/c$c;-><init>(Lll1/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lll1/c$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lll1/c$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lll1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lll1/c;->d:Ly92/a;

    iput-object p1, v0, Lll1/c$c;->w:Ljava/lang/Object;

    iput v3, v0, Lll1/c$c;->z:I

    invoke-virtual {p2, v0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-nez p2, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lll1/c;->b:Lor2/c;

    invoke-virtual {v0, p2}, Lor2/c;->b(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method


# virtual methods
.method public final g(Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    iget v0, p0, Lll1/c;->f:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lll1/c;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "push-notifications-permission-request-fix"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lll1/c;->f(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lll1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lll1/c$a;-><init>(Lll1/c;Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lll1/c$b;

    invoke-direct {v0, v1}, Lll1/c$b;-><init>(Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object v1
.end method
