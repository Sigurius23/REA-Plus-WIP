.class public final Lmw0/h;
.super Lhj0/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000c*\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001d\u0010)\u001a\u0008\u0012\u0004\u0012\u00020$0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lmw0/h;",
        "Lhj0/o;",
        "Ljw0/g;",
        "interactor",
        "Lmw0/j;",
        "viewStateReducer",
        "Li92/e;",
        "networkMonitor",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ljw0/g;Lmw0/j;Li92/e;Lbc3/c0;)V",
        "Lec3/l;",
        "Ljw0/e;",
        "Ljw0/f;",
        "A",
        "(Lec3/l;Ljw0/g;)Lec3/l;",
        "Lmw0/g;",
        "viewEvent",
        "C",
        "(Lmw0/g;)Ljw0/e;",
        "Lbc3/k1;",
        "B",
        "(Lmw0/g;)Lbc3/k1;",
        "E",
        "Lmw0/j;",
        "",
        "F",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "Lec3/o1;",
        "G",
        "Lec3/o1;",
        "eventFlow",
        "Lmw0/i;",
        "H",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "core-details_release"
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
.field private final E:Lmw0/j;

.field private final F:Ljava/lang/String;

.field private final G:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final H:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljw0/g;Lmw0/j;Li92/e;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkMonitor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Lhj0/o;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lmw0/h;->E:Lmw0/j;

    .line 3
    const-string p2, "SleepDetailsViewModel"

    iput-object p2, p0, Lmw0/h;->F:Ljava/lang/String;

    const/4 p2, 0x7

    const/4 p4, 0x0

    const/4 v0, 0x0

    .line 4
    invoke-static {p4, p4, v0, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lmw0/h;->G:Lec3/o1;

    .line 5
    sget-object p4, Lmw0/g$a;->a:Lmw0/g$a;

    invoke-static {p2, p4}, Lli0/a;->a(Lec3/t1;Ljava/lang/Object;)Lec3/t1;

    move-result-object p2

    .line 6
    new-instance p4, Lmw0/h$b;

    invoke-direct {p4, p2, p0}, Lmw0/h$b;-><init>(Lec3/l;Lmw0/h;)V

    .line 7
    invoke-direct {p0, p4, p1}, Lmw0/h;->A(Lec3/l;Ljw0/g;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lmw0/h$c;

    invoke-direct {p2, p1, p0}, Lmw0/h$c;-><init>(Lec3/l;Lmw0/h;)V

    .line 9
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object p4, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p2, p1, p4, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 10
    invoke-interface {p3}, Li92/e;->a()Lec3/l;

    move-result-object p2

    new-instance p3, Lmw0/h$d;

    invoke-direct {p3, v0}, Lmw0/h$d;-><init>(Lq83/d;)V

    .line 11
    new-instance p4, Lec3/l1;

    const/4 v0, 0x1

    invoke-direct {p4, p1, p2, p3, v0}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 12
    iput-object p4, p0, Lmw0/h;->H:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljw0/g;Lmw0/j;Li92/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 13
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lmw0/h;-><init>(Ljw0/g;Lmw0/j;Li92/e;Lbc3/c0;)V

    return-void
.end method

.method private final A(Lec3/l;Ljw0/g;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Ljw0/g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Ljw0/g;->g(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final C(Lmw0/g;)Ljw0/e;
    .locals 10

    instance-of v0, p1, Lmw0/g$c;

    if-eqz v0, :cond_0

    new-instance v0, Ljw0/e$g;

    check-cast p1, Lmw0/g$c;

    invoke-virtual {p1}, Lmw0/g$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lmw0/g$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljw0/e$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    sget-object v0, Lmw0/g$a;->a:Lmw0/g$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ljw0/e$d;->a:Ljw0/e$d;

    return-object p1

    :cond_1
    sget-object v0, Lmw0/g$b;->a:Lmw0/g$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Ljw0/e$c;

    sget-object v0, Lnw0/h$a;->a:Lnw0/h$a;

    invoke-direct {p1, v0}, Ljw0/e$c;-><init>(Lnw0/h;)V

    return-object p1

    :cond_2
    sget-object v0, Lmw0/g$e;->a:Lmw0/g$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Ljw0/e$b;->a:Ljw0/e$b;

    return-object p1

    :cond_3
    instance-of v0, p1, Lmw0/g$i;

    if-eqz v0, :cond_4

    new-instance v0, Ljw0/e$e;

    check-cast p1, Lmw0/g$i;

    invoke-virtual {p1}, Lmw0/g$i;->a()Lmc1/b;

    move-result-object p1

    invoke-direct {v0, p1}, Ljw0/e$e;-><init>(Lmc1/b;)V

    return-object v0

    :cond_4
    sget-object v0, Lmw0/g$g;->a:Lmw0/g$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Ljw0/e$c;

    sget-object v0, Lnw0/h$c;->a:Lnw0/h$c;

    invoke-direct {p1, v0}, Ljw0/e$c;-><init>(Lnw0/h;)V

    return-object p1

    :cond_5
    instance-of v0, p1, Lmw0/g$f;

    if-eqz v0, :cond_6

    new-instance v0, Ljw0/e$c;

    new-instance v1, Lnw0/h$b;

    check-cast p1, Lmw0/g$f;

    invoke-virtual {p1}, Lmw0/g$f;->b()Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    move-result-object v7

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lnw0/h$b;-><init>(Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Ljw0/e$c;-><init>(Lnw0/h;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Lmw0/g$h;

    if-eqz v0, :cond_7

    new-instance v0, Ljw0/e$f;

    check-cast p1, Lmw0/g$h;

    invoke-virtual {p1}, Lmw0/g$h;->a()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object p1

    invoke-direct {v0, p1}, Ljw0/e$f;-><init>(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lmw0/g$d;

    if-eqz v0, :cond_8

    new-instance v0, Ljw0/e$a;

    check-cast p1, Lmw0/g$d;

    invoke-virtual {p1}, Lmw0/g$d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lmw0/g$d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lmw0/g$d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Ljw0/e$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic w(Lmw0/h;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lmw0/h;->G:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic y(Lmw0/h;)Lmw0/j;
    .locals 0

    iget-object p0, p0, Lmw0/h;->E:Lmw0/j;

    return-object p0
.end method

.method public static final synthetic z(Lmw0/h;Lmw0/g;)Ljw0/e;
    .locals 0

    invoke-direct {p0, p1}, Lmw0/h;->C(Lmw0/g;)Ljw0/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Lmw0/g;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lmw0/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmw0/h$a;-><init>(Lmw0/h;Lmw0/g;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lmw0/h;->H:Lec3/l;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmw0/h;->F:Ljava/lang/String;

    return-object v0
.end method
