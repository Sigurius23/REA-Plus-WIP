.class public final Lib2/d;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0008*\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lib2/d;",
        "Landroidx/lifecycle/w1;",
        "Lib2/a;",
        "interactor",
        "Lbc3/c0;",
        "closeableCoroutineScope",
        "<init>",
        "(Lib2/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lib2/c;",
        "Lib2/e;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "j",
        "(Lib2/c;)V",
        "w",
        "Lib2/a;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/f2;",
        "z",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "settings_release"
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
.field private final w:Lib2/a;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lib2/a;Lbc3/c0;)V
    .locals 8

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeableCoroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lib2/d;->w:Lib2/a;

    .line 3
    iput-object p2, p0, Lib2/d;->x:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lib2/d;->y:Lec3/o1;

    .line 5
    invoke-direct {p0, p1}, Lib2/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    const-wide/16 v0, 0x1388

    const/4 v2, 0x2

    .line 6
    invoke-static {v2, v0, v1}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v0

    new-instance v1, Lib2/e$a;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lib2/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, p2, v0, v1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lib2/d;->z:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lib2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 7
    new-instance p2, Lor2/m;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lib2/d;-><init>(Lib2/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lib2/d;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lib2/d;->y:Lec3/o1;

    return-object p0
.end method

.method private final interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lib2/d;->w:Lib2/a;

    invoke-virtual {v0, p1}, Lib2/a;->e(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lib2/d;->z:Lec3/f2;

    return-object v0
.end method

.method public final j(Lib2/c;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lib2/d;->x:Lbc3/c0;

    new-instance v1, Lib2/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lib2/d$a;-><init>(Lib2/d;Lib2/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
