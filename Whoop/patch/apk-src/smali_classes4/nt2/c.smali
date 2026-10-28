.class public final Lnt2/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lnt2/c;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "Ljt2/k;",
        "combiner",
        "Lot2/n;",
        "reducer",
        "Lit2/a;",
        "screenArgs",
        "<init>",
        "(Lbc3/c0;Ljt2/k;Lot2/n;Lit2/a;)V",
        "Lnt2/a;",
        "viewEvent",
        "Ll83/a0;",
        "n",
        "(Lnt2/a;)V",
        "w",
        "Lbc3/c0;",
        "x",
        "Lot2/n;",
        "y",
        "Lit2/a;",
        "Lec3/o1;",
        "Ljt2/l;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lot2/m;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
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

.field private final w:Lbc3/c0;

.field private final x:Lot2/n;

.field private final y:Lit2/a;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Ljt2/k;Lot2/n;Lit2/a;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "combiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenArgs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lnt2/c;->w:Lbc3/c0;

    .line 3
    iput-object p3, p0, Lnt2/c;->x:Lot2/n;

    .line 4
    iput-object p4, p0, Lnt2/c;->y:Lit2/a;

    const/4 p3, 0x0

    const/4 p4, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p3, p4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lnt2/c;->z:Lec3/o1;

    .line 6
    invoke-static {p3, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p2

    .line 7
    new-instance p3, Lnt2/c$b;

    invoke-direct {p3, p2, p0}, Lnt2/c$b;-><init>(Lec3/l;Lnt2/c;)V

    .line 8
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 p4, 0x1

    invoke-static {p3, p1, p2, p4}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lnt2/c;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Ljt2/k;Lot2/n;Lit2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p6, 0x1

    and-int/2addr p5, p6

    if-eqz p5, :cond_0

    .line 9
    new-instance p1, Lor2/m;

    const/4 p5, 0x0

    invoke-direct {p1, p5, p6, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lnt2/c;-><init>(Lbc3/c0;Ljt2/k;Lot2/n;Lit2/a;)V

    return-void
.end method

.method public static final synthetic g(Lnt2/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lnt2/c;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lnt2/c;)Lot2/n;
    .locals 0

    iget-object p0, p0, Lnt2/c;->x:Lot2/n;

    return-object p0
.end method

.method public static final synthetic l(Lnt2/c;)Lit2/a;
    .locals 0

    iget-object p0, p0, Lnt2/c;->y:Lit2/a;

    return-object p0
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lnt2/c;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Lnt2/a;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnt2/c;->w:Lbc3/c0;

    new-instance v1, Lnt2/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lnt2/c$a;-><init>(Lnt2/c;Lnt2/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
