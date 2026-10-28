.class public final Lj92/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B%\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lj92/q;",
        "Lud3/g0;",
        "Ll83/h;",
        "Liy1/c;",
        "metricWriter",
        "Lbc3/c0;",
        "coroutineScope",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ll83/h;Lbc3/c0;Ltr2/n;)V",
        "Lud3/x0;",
        "response",
        "Lud3/o0;",
        "request",
        "Ll83/a0;",
        "e",
        "(Lud3/x0;Lud3/o0;)V",
        "",
        "d",
        "(Lud3/o0;)Ljava/lang/String;",
        "Lud3/f0;",
        "chain",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "w",
        "Ll83/h;",
        "x",
        "Lbc3/c0;",
        "y",
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
.field private final w:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Ltr2/n;


# direct methods
.method public constructor <init>(Ll83/h;Lbc3/c0;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            "Lbc3/c0;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/q;->w:Ll83/h;

    iput-object p2, p0, Lj92/q;->x:Lbc3/c0;

    iput-object p3, p0, Lj92/q;->y:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lj92/q;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lj92/q;->y:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lj92/q;)Ll83/h;
    .locals 0

    iget-object p0, p0, Lj92/q;->w:Ll83/h;

    return-object p0
.end method

.method public static final synthetic c(Lj92/q;Lud3/o0;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lj92/q;->d(Lud3/o0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lud3/o0;)Ljava/lang/String;
    .locals 1

    const-class v0, Lpg3/w;

    invoke-virtual {p1, v0}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/w;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lpg3/w;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "X-Request-Tag"

    iget-object p1, p1, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {p1, v0}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private final e(Lud3/x0;Lud3/o0;)V
    .locals 3

    iget-object v0, p0, Lj92/q;->x:Lbc3/c0;

    new-instance v1, Lj92/q$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lj92/q$a;-><init>(Lj92/q;Lud3/o0;Lud3/x0;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public intercept(Lud3/f0;)Lud3/x0;
    .locals 1

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lj92/q;->e(Lud3/x0;Lud3/o0;)V

    return-object p1
.end method
