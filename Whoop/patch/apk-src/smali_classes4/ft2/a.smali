.class public final Lft2/a;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lgt2/c;",
        "Lgt2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR \u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lft2/a;",
        "Lld1/c;",
        "Lgt2/c;",
        "Lgt2/b;",
        "Let2/a;",
        "apiInteractor",
        "Lgt2/d;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Let2/a;Lgt2/d;Lbc3/c0;)V",
        "event",
        "Ll83/a0;",
        "n",
        "(Lgt2/b;)V",
        "x",
        "Let2/a;",
        "y",
        "Lgt2/d;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lct2/b;",
        "F",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "G",
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
.field private final E:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final G:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final x:Let2/a;

.field private final y:Lgt2/d;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Let2/a;Lgt2/d;Lbc3/c0;)V
    .locals 2

    const-string v0, "apiInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lft2/a;->x:Let2/a;

    .line 3
    iput-object p2, p0, Lft2/a;->y:Lgt2/d;

    .line 4
    iput-object p3, p0, Lft2/a;->z:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lft2/a;->E:Lec3/o1;

    .line 6
    new-instance v0, Lft2/a$b;

    invoke-direct {v0, p2}, Lft2/a$b;-><init>(Lec3/l;)V

    .line 7
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lft2/a;->F:Lec3/l;

    .line 8
    new-instance p2, Lft2/a$c;

    invoke-direct {p2, p1, p0}, Lft2/a$c;-><init>(Lec3/l;Lft2/a;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    sget-object v0, Lgt2/c$b;->b:Lgt2/c$b;

    invoke-static {p2, p3, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lft2/a;->G:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Let2/a;Lgt2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lft2/a;-><init>(Let2/a;Lgt2/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic j(Lft2/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lft2/a;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lft2/a;)Lgt2/d;
    .locals 0

    iget-object p0, p0, Lft2/a;->y:Lgt2/d;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lgt2/b;

    invoke-virtual {p0, p1}, Lft2/a;->n(Lgt2/b;)V

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
    iget-object v0, p0, Lft2/a;->G:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lft2/a;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public n(Lgt2/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lft2/a;->z:Lbc3/c0;

    new-instance v1, Lft2/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lft2/a$a;-><init>(Lft2/a;Lgt2/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
