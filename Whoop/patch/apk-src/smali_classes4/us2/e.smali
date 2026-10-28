.class public final Lus2/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lus2/e;",
        "Landroidx/lifecycle/w1;",
        "Lss2/e;",
        "interactor",
        "Lus2/g;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lss2/e;Lus2/g;Lbc3/c0;)V",
        "Lus2/d;",
        "viewEvent",
        "Lbc3/k1;",
        "l",
        "(Lus2/d;)Lbc3/k1;",
        "w",
        "Lus2/g;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lss2/c;",
        "z",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "Lus2/f;",
        "E",
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
.field private final E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Lus2/g;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lss2/e;Lus2/g;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lus2/e;->w:Lus2/g;

    .line 3
    iput-object p3, p0, Lus2/e;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 p3, 0x7

    const/4 v0, 0x0

    .line 4
    invoke-static {v0, v0, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lus2/e;->y:Lec3/o1;

    .line 5
    new-instance p3, Lus2/e$b;

    invoke-direct {p3, p2}, Lus2/e$b;-><init>(Lec3/l;)V

    .line 6
    invoke-static {p3, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lus2/e;->z:Lec3/l;

    .line 7
    new-instance p2, Lus2/e$c;

    invoke-direct {p2, p1, p0}, Lus2/e$c;-><init>(Lec3/l;Lus2/e;)V

    .line 8
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    .line 9
    sget-object p3, Lec3/z1;->a:Lec3/b2;

    .line 10
    sget-object v0, Lus2/f$b;->a:Lus2/f$b;

    .line 11
    invoke-static {p2, p1, p3, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lus2/e;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lss2/e;Lus2/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 12
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lus2/e;-><init>(Lss2/e;Lus2/g;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lus2/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lus2/e;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lus2/e;)Lus2/g;
    .locals 0

    iget-object p0, p0, Lus2/e;->w:Lus2/g;

    return-object p0
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lus2/e;->E:Lec3/f2;

    return-object v0
.end method

.method public final l(Lus2/d;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lus2/e;->x:Lbc3/c0;

    new-instance v1, Lus2/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lus2/e$a;-><init>(Lus2/e;Lus2/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
