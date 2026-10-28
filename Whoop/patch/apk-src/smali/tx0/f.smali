.class public final Ltx0/f;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Ltx0/f;",
        "Landroidx/lifecycle/w1;",
        "Lgv1/c;",
        "globalLottieTesterState",
        "Lgv1/d;",
        "localLottieTesterOverrideController",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lgv1/c;Lgv1/d;Lbc3/c0;)V",
        "Ltx0/e;",
        "event",
        "Ll83/a0;",
        "j",
        "(Ltx0/e;)V",
        "Lgv1/m;",
        "g",
        "(Lgv1/m;)V",
        "w",
        "Lgv1/c;",
        "x",
        "Lgv1/d;",
        "Lec3/f2;",
        "Ltx0/g;",
        "y",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "debug-tools_release"
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
.field private final w:Lgv1/c;

.field private final x:Lgv1/d;

.field private final y:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgv1/c;Lgv1/d;Lbc3/c0;)V
    .locals 10

    const-string v0, "globalLottieTesterState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localLottieTesterOverrideController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 2
    iput-object p1, p0, Ltx0/f;->w:Lgv1/c;

    .line 3
    iput-object p2, p0, Ltx0/f;->x:Lgv1/d;

    .line 4
    invoke-virtual {p1}, Lgv1/c;->a()Lec3/f2;

    move-result-object p1

    .line 5
    invoke-virtual {p2}, Lgv1/d;->a()Lec3/l;

    move-result-object p2

    .line 6
    new-instance v0, Ltx0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltx0/f$a;-><init>(Lq83/d;)V

    .line 7
    new-instance v1, Lec3/l1;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v0, v2}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 8
    new-instance v3, Ltx0/g;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ltx0/g;-><init>(ZZLgv1/o;Li51/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v1, p3, p1, v3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Ltx0/f;->y:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lgv1/c;Lgv1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Ltx0/f;-><init>(Lgv1/c;Lgv1/d;Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public final g(Lgv1/m;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltx0/f;->x:Lgv1/d;

    invoke-virtual {v0, p1}, Lgv1/d;->b(Lgv1/m;)V

    return-void
.end method

.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Ltx0/f;->y:Lec3/f2;

    return-object v0
.end method

.method public final j(Ltx0/e;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltx0/e$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltx0/f;->w:Lgv1/c;

    check-cast p1, Ltx0/e$a;

    invoke-virtual {p1}, Ltx0/e$a;->a()Z

    move-result p1

    invoke-virtual {v0, p1}, Lgv1/c;->b(Z)V

    return-void

    :cond_0
    instance-of v0, p1, Ltx0/e$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, Ltx0/f;->x:Lgv1/d;

    new-instance v0, Lgv1/m$f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgv1/m$f;-><init>(Z)V

    invoke-virtual {p1, v0}, Lgv1/d;->b(Lgv1/m;)V

    return-void

    :cond_1
    instance-of p1, p1, Ltx0/e$c;

    if-eqz p1, :cond_2

    iget-object p1, p0, Ltx0/f;->x:Lgv1/d;

    new-instance v0, Lgv1/m$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgv1/m$f;-><init>(Z)V

    invoke-virtual {p1, v0}, Lgv1/d;->b(Lgv1/m;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
