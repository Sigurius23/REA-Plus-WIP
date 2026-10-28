.class public final Lzl0/e;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lzl0/k;",
        "Lzl0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lzl0/e;",
        "Lld1/c;",
        "Lzl0/k;",
        "Lzl0/f;",
        "Lzl0/d;",
        "interactor",
        "Lzl0/g;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lzl0/d;Lzl0/g;Lbc3/c0;)V",
        "event",
        "Ll83/a0;",
        "n",
        "(Lzl0/f;)V",
        "x",
        "Lzl0/d;",
        "y",
        "Lzl0/g;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lzl0/b;",
        "E",
        "Lec3/o1;",
        "actionFlow",
        "Lec3/l;",
        "F",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "bot_release"
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

.field private final x:Lzl0/d;

.field private final y:Lzl0/g;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lzl0/d;Lzl0/g;Lbc3/c0;)V
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
    iput-object p1, p0, Lzl0/e;->x:Lzl0/d;

    .line 3
    iput-object p2, p0, Lzl0/e;->y:Lzl0/g;

    .line 4
    iput-object p3, p0, Lzl0/e;->z:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lzl0/e;->E:Lec3/o1;

    .line 6
    invoke-virtual {p1, p2}, Lzl0/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lzl0/e$b;

    invoke-direct {p2, p1, p0}, Lzl0/e$b;-><init>(Lec3/l;Lzl0/e;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lzl0/e;->F:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lzl0/d;Lzl0/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lzl0/e;-><init>(Lzl0/d;Lzl0/g;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic j(Lzl0/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzl0/e;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lzl0/e;)Lzl0/g;
    .locals 0

    iget-object p0, p0, Lzl0/e;->y:Lzl0/g;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzl0/f;

    invoke-virtual {p0, p1}, Lzl0/e;->n(Lzl0/f;)V

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lzl0/e;->F:Lec3/l;

    return-object v0
.end method

.method public n(Lzl0/f;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzl0/e;->z:Lbc3/c0;

    new-instance v1, Lzl0/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lzl0/e$a;-><init>(Lzl0/f;Lzl0/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
