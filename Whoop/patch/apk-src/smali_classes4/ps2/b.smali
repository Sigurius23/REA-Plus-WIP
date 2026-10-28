.class public final Lps2/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lps2/c;",
        "Lps2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lps2/b;",
        "Lld1/c;",
        "Lps2/c;",
        "Lps2/a;",
        "Lns2/c;",
        "interactor",
        "Lqs2/b;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lns2/c;Lqs2/b;Lor2/m;)V",
        "event",
        "Ll83/a0;",
        "n",
        "(Lps2/a;)V",
        "x",
        "Lqs2/b;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lns2/b;",
        "E",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "weekly-plan_release"
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
.field private final E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final x:Lqs2/b;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lns2/c;Lqs2/b;Lor2/m;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lps2/b;->x:Lqs2/b;

    .line 3
    iput-object p3, p0, Lps2/b;->y:Lor2/m;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lps2/b;->z:Lec3/o1;

    .line 5
    new-instance v0, Lps2/b$b;

    invoke-direct {v0, p2}, Lps2/b$b;-><init>(Lec3/l;)V

    .line 6
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lps2/b;->E:Lec3/l;

    .line 7
    new-instance p2, Lps2/b$c;

    invoke-direct {p2, p1, p0}, Lps2/b$c;-><init>(Lec3/l;Lps2/b;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 9
    sget-object v0, Lps2/c$b;->a:Lps2/c$b;

    .line 10
    invoke-static {p2, p3, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lps2/b;->F:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lns2/c;Lqs2/b;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lps2/b;-><init>(Lns2/c;Lqs2/b;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lps2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lps2/b;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lps2/b;)Lqs2/b;
    .locals 0

    iget-object p0, p0, Lps2/b;->x:Lqs2/b;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lps2/a;

    invoke-virtual {p0, p1}, Lps2/b;->n(Lps2/a;)V

    return-void
.end method

.method public getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lps2/b;->F:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lps2/b;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public n(Lps2/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lps2/b;->y:Lor2/m;

    new-instance v1, Lps2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lps2/b$a;-><init>(Lps2/b;Lps2/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
