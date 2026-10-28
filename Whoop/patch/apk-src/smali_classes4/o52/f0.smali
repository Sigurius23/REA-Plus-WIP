.class public final Lo52/f0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lo52/f0;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "scope",
        "Leq1/a;",
        "hrZonesRepository",
        "Lpv2/b;",
        "hrZoneReducer",
        "<init>",
        "(Lbc3/c0;Leq1/a;Lpv2/b;)V",
        "",
        "newPercent",
        "Ll83/a0;",
        "l",
        "(I)V",
        "w",
        "Lbc3/c0;",
        "x",
        "Lpv2/b;",
        "Lec3/p1;",
        "y",
        "Lec3/p1;",
        "strainPercentFlow",
        "Lec3/t1;",
        "",
        "Ldq1/a;",
        "z",
        "Lec3/t1;",
        "domainState",
        "Lec3/l;",
        "Lpv2/a;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "realtime-activity_release"
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

.field private final x:Lpv2/b;

.field private final y:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final z:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Leq1/a;Lpv2/b;)V
    .locals 3

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZonesRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZoneReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lo52/f0;->w:Lbc3/c0;

    .line 3
    iput-object p3, p0, Lo52/f0;->x:Lpv2/b;

    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lo52/f0;->y:Lec3/p1;

    .line 5
    invoke-virtual {p2}, Leq1/a;->l()Lec3/l;

    move-result-object p2

    .line 6
    new-instance p3, Lo52/f0$a;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Lo52/f0$a;-><init>(Lq83/d;)V

    .line 7
    new-instance v1, Lec3/a0;

    invoke-direct {v1, p3, p2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    sget-object p3, Lec3/z1;->a:Lec3/b2;

    const/4 v2, 0x1

    invoke-static {v1, p2, p3, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p2

    iput-object p2, p0, Lo52/f0;->z:Lec3/t1;

    .line 9
    new-instance p3, Lo52/f0$c;

    invoke-direct {p3, p0, v0}, Lo52/f0$c;-><init>(Lo52/f0;Lq83/d;)V

    .line 10
    new-instance v0, Lec3/l1;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p1, p3, v1}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 11
    iput-object v0, p0, Lo52/f0;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Leq1/a;Lpv2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    .line 12
    new-instance p1, Lor2/m;

    const/4 p4, 0x0

    invoke-direct {p1, p4, p5, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo52/f0;-><init>(Lbc3/c0;Leq1/a;Lpv2/b;)V

    return-void
.end method

.method public static final synthetic g(Lo52/f0;)Lpv2/b;
    .locals 0

    iget-object p0, p0, Lo52/f0;->x:Lpv2/b;

    return-object p0
.end method

.method public static final synthetic j(Lo52/f0;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lo52/f0;->y:Lec3/p1;

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

    iget-object v0, p0, Lo52/f0;->E:Lec3/l;

    return-object v0
.end method

.method public final l(I)V
    .locals 3

    iget-object v0, p0, Lo52/f0;->w:Lbc3/c0;

    new-instance v1, Lo52/f0$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lo52/f0$b;-><init>(Lo52/f0;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
