.class public final Lj32/j;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lj32/j;",
        "Landroidx/lifecycle/w1;",
        "Li32/c;",
        "interactor",
        "Lk32/a;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Li32/c;Lk32/a;Lbc3/c0;)V",
        "Lj32/i;",
        "Li32/a;",
        "p",
        "(Lj32/i;)Li32/a;",
        "viewEvent",
        "Ll83/a0;",
        "o",
        "(Lj32/i;)V",
        "w",
        "Li32/c;",
        "x",
        "Lk32/a;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lj32/k;",
        "E",
        "Lec3/t1;",
        "n",
        "()Lec3/t1;",
        "viewState",
        "payments_release"
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
.field private final E:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final w:Li32/c;

.field private final x:Lk32/a;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li32/c;Lk32/a;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lj32/j;->w:Li32/c;

    .line 3
    iput-object p2, p0, Lj32/j;->x:Lk32/a;

    .line 4
    iput-object p3, p0, Lj32/j;->y:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lj32/j;->z:Lec3/o1;

    .line 6
    new-instance v0, Lj32/j$b;

    invoke-direct {v0, p2, p0}, Lj32/j$b;-><init>(Lec3/l;Lj32/j;)V

    .line 7
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lj32/j$c;

    invoke-direct {p2, p1, p0}, Lj32/j$c;-><init>(Lec3/l;Lj32/j;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lj32/j;->E:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Li32/c;Lk32/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lj32/j;-><init>(Li32/c;Lk32/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lj32/j;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lj32/j;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lj32/j;)Lk32/a;
    .locals 0

    iget-object p0, p0, Lj32/j;->x:Lk32/a;

    return-object p0
.end method

.method public static final synthetic l(Lj32/j;Lj32/i;)Li32/a;
    .locals 0

    invoke-direct {p0, p1}, Lj32/j;->p(Lj32/i;)Li32/a;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lj32/i;)Li32/a;
    .locals 2

    instance-of v0, p1, Lj32/d;

    if-eqz v0, :cond_0

    new-instance v0, Li32/a$a;

    check-cast p1, Lj32/d;

    invoke-virtual {p1}, Lj32/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj32/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Li32/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lj32/g;

    if-eqz v0, :cond_1

    new-instance v0, Li32/a$b;

    check-cast p1, Lj32/g;

    invoke-virtual {p1}, Lj32/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj32/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Li32/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final n()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lj32/j;->E:Lec3/t1;

    return-object v0
.end method

.method public final o(Lj32/i;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj32/j;->y:Lbc3/c0;

    new-instance v1, Lj32/j$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lj32/j$a;-><init>(Lj32/j;Lj32/i;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
