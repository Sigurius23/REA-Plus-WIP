.class public final Lid1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/w1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lid1/c;",
        "",
        "T",
        "Landroidx/lifecycle/w1;",
        "itemType",
        "Lid1/f;",
        "reducer",
        "Lg91/b;",
        "interactor",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ljava/lang/Object;Lid1/f;Lg91/b;Lbc3/c0;)V",
        "Lid1/b;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lid1/b;)V",
        "w",
        "Ljava/lang/Object;",
        "x",
        "Lid1/f;",
        "y",
        "Lg91/b;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/f2;",
        "Lid1/e;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "design-showcase_release"
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

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final x:Lid1/f;

.field private final y:Lg91/b;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lid1/f;Lg91/b;Lbc3/c0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lid1/f;",
            "Lg91/b;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "itemType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p4}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    iput-object p1, p0, Lid1/c;->w:Ljava/lang/Object;

    iput-object p2, p0, Lid1/c;->x:Lid1/f;

    iput-object p3, p0, Lid1/c;->y:Lg91/b;

    iput-object p4, p0, Lid1/c;->z:Lbc3/c0;

    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, v1, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lid1/c;->E:Lec3/o1;

    new-instance v0, Lid1/c$d;

    invoke-direct {v0, p0, v1}, Lid1/c$d;-><init>(Lid1/c;Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    new-instance p1, Lid1/c$b;

    invoke-direct {p1, v1}, Lid1/c$b;-><init>(Lec3/l;)V

    invoke-static {p1, p3}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    new-instance p3, Lid1/c$c;

    invoke-direct {p3, p1, p2}, Lid1/c$c;-><init>(Lec3/l;Lid1/f;)V

    new-instance v0, Lid1/e;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lid1/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lid1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p3, p4, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lid1/c;->F:Lec3/f2;

    return-void
.end method

.method public static final synthetic g(Lid1/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lid1/c;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lid1/c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lid1/c;->w:Ljava/lang/Object;

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

    iget-object v0, p0, Lid1/c;->F:Lec3/f2;

    return-object v0
.end method

.method public final l(Lid1/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lid1/c;->z:Lbc3/c0;

    new-instance v1, Lid1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lid1/c$a;-><init>(Lid1/c;Lid1/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
