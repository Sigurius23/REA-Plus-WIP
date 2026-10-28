.class public final Lhj0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0007\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lhj0/d;",
        "",
        "Landroidx/lifecycle/g0;",
        "appLifecycleOwner",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Landroidx/lifecycle/g0;Lbc3/c0;)V",
        "Landroidx/lifecycle/f0;",
        "lifecycleObserver",
        "Ll83/a0;",
        "c",
        "(Landroidx/lifecycle/f0;)V",
        "a",
        "Landroidx/lifecycle/g0;",
        "b",
        "Lbc3/c0;",
        "Lec3/f2;",
        "",
        "Lec3/f2;",
        "d",
        "()Lec3/f2;",
        "appForegroundFlow",
        "essentials_release"
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
.field private final a:Landroidx/lifecycle/g0;

.field private final b:Lbc3/c0;

.field private final c:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/g0;Lbc3/c0;)V
    .locals 2

    const-string v0, "appLifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhj0/d;->a:Landroidx/lifecycle/g0;

    .line 3
    iput-object p2, p0, Lhj0/d;->b:Lbc3/c0;

    .line 4
    new-instance p1, Lhj0/d$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lhj0/d$a;-><init>(Lhj0/d;Lq83/d;)V

    invoke-static {p1}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    .line 5
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, v1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lhj0/d;->c:Lec3/f2;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/g0;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 7
    sget-object p2, Lhc3/o;->a:Lbc3/w1;

    .line 8
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p3

    invoke-virtual {p2, p3}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p2

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lhj0/d;-><init>(Landroidx/lifecycle/g0;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic a(Lhj0/d;)Landroidx/lifecycle/g0;
    .locals 0

    iget-object p0, p0, Lhj0/d;->a:Landroidx/lifecycle/g0;

    return-object p0
.end method

.method public static final synthetic b(Lhj0/d;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lhj0/d;->b:Lbc3/c0;

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/f0;)V
    .locals 1

    const-string v0, "lifecycleObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhj0/d;->a:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public final d()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lhj0/d;->c:Lec3/f2;

    return-object v0
.end method
