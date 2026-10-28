.class public final Lzt1/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lzt1/e;",
        "Landroidx/lifecycle/w1;",
        "Lxt1/c;",
        "interactor",
        "Lzt1/f;",
        "reducer",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lxt1/c;Lzt1/f;Ltr2/n;Lbc3/c0;)V",
        "Lzt1/d;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lzt1/d;)V",
        "w",
        "Lzt1/f;",
        "x",
        "Ltr2/n;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "viewEvents",
        "Lec3/l;",
        "Lzt1/c;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "labrador_release"
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

.field private final w:Lzt1/f;

.field private final x:Ltr2/n;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxt1/c;Lzt1/f;Ltr2/n;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lzt1/e;->w:Lzt1/f;

    .line 3
    iput-object p3, p0, Lzt1/e;->x:Ltr2/n;

    .line 4
    iput-object p4, p0, Lzt1/e;->y:Lbc3/c0;

    const/4 p2, 0x6

    const/4 p3, 0x1

    const/4 p4, 0x0

    const/4 v0, 0x0

    .line 5
    invoke-static {p3, p4, v0, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lzt1/e;->z:Lec3/o1;

    .line 6
    new-instance p3, Lzt1/e$d;

    invoke-direct {p3, v0}, Lzt1/e$d;-><init>(Lq83/d;)V

    .line 7
    new-instance p4, Lec3/a0;

    invoke-direct {p4, p3, p2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    new-instance p2, Lzt1/e$c;

    invoke-direct {p2, p4}, Lzt1/e$c;-><init>(Lec3/l;)V

    .line 9
    invoke-static {p2, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 10
    new-instance p2, Lzt1/e$b;

    invoke-direct {p2, p1, p0}, Lzt1/e$b;-><init>(Lec3/l;Lzt1/e;)V

    .line 11
    iput-object p2, p0, Lzt1/e;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lxt1/c;Lzt1/f;Ltr2/n;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 12
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "EcgResultsViewModel"

    invoke-virtual {p3, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 13
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lzt1/e;-><init>(Lxt1/c;Lzt1/f;Ltr2/n;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lzt1/e;)Lzt1/f;
    .locals 0

    iget-object p0, p0, Lzt1/e;->w:Lzt1/f;

    return-object p0
.end method

.method public static final synthetic j(Lzt1/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzt1/e;->z:Lec3/o1;

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

    iget-object v0, p0, Lzt1/e;->E:Lec3/l;

    return-object v0
.end method

.method public final l(Lzt1/d;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzt1/e;->y:Lbc3/c0;

    new-instance v1, Lzt1/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzt1/e$a;-><init>(Lzt1/e;Lzt1/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
