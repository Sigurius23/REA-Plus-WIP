.class public final Lj72/i;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0011*\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010 \u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lj72/i;",
        "Landroidx/lifecycle/w1;",
        "Lg72/c;",
        "interactor",
        "Lk72/a;",
        "reducer",
        "",
        "skipToManualEntry",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lg72/c;Lk72/a;ZLbc3/c0;)V",
        "Lj72/h;",
        "viewEvent",
        "Lg72/a;",
        "o",
        "(Lj72/h;)Lg72/a;",
        "Lec3/l;",
        "Lg72/b;",
        "Lj72/j;",
        "l",
        "(Lec3/l;Lk72/a;)Lec3/l;",
        "Ll83/a0;",
        "n",
        "(Lj72/h;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "domainState",
        "z",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "sage_release"
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
.field private final w:Lbc3/c0;

.field private final x:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
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
.method public constructor <init>(Lg72/c;Lk72/a;ZLbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p4, p0, Lj72/i;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lj72/i;->x:Lec3/o1;

    .line 4
    new-instance v1, Lj72/i$b;

    invoke-direct {v1, v0, p0}, Lj72/i$b;-><init>(Lec3/l;Lj72/i;)V

    .line 5
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 6
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p4, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lj72/i;->y:Lec3/l;

    .line 7
    invoke-direct {p0, p1, p2}, Lj72/i;->l(Lec3/l;Lk72/a;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lj72/i;->z:Lec3/l;

    .line 8
    new-instance p1, Lj72/h$c;

    invoke-direct {p1, p3}, Lj72/h$c;-><init>(Z)V

    invoke-virtual {p0, p1}, Lj72/i;->n(Lj72/h;)V

    return-void
.end method

.method public synthetic constructor <init>(Lg72/c;Lk72/a;ZLbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 9
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lj72/i;-><init>(Lg72/c;Lk72/a;ZLbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lj72/i;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lj72/i;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lj72/i;Lj72/h;)Lg72/a;
    .locals 0

    invoke-direct {p0, p1}, Lj72/i;->o(Lj72/h;)Lg72/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lk72/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lk72/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lk72/a;->h(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lj72/h;)Lg72/a;
    .locals 2

    instance-of v0, p1, Lj72/h$d;

    if-eqz v0, :cond_0

    new-instance v0, Lg72/a$b;

    check-cast p1, Lj72/h$d;

    invoke-virtual {p1}, Lj72/h$d;->b()Lj72/g;

    move-result-object v1

    invoke-virtual {p1}, Lj72/h$d;->a()Lg72/f;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lg72/a$b;-><init>(Lj72/g;Lg72/f;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lj72/h$c;

    if-eqz v0, :cond_1

    new-instance v0, Lg72/a$c;

    check-cast p1, Lj72/h$c;

    invoke-virtual {p1}, Lj72/h$c;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lg72/a$c;-><init>(Z)V

    return-object v0

    :cond_1
    sget-object v0, Lj72/h$a;->a:Lj72/h$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lg72/a$a;->a:Lg72/a$a;

    return-object p1

    :cond_2
    instance-of v0, p1, Lj72/h$b;

    if-eqz v0, :cond_3

    new-instance v0, Lg72/a$d;

    check-cast p1, Lj72/h$b;

    invoke-virtual {p1}, Lj72/h$b;->a()Lg72/e;

    move-result-object v1

    invoke-virtual {p1}, Lj72/h$b;->b()Lg72/f;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lg72/a$d;-><init>(Lg72/e;Lg72/f;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
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

    iget-object v0, p0, Lj72/i;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Lj72/h;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj72/i;->w:Lbc3/c0;

    new-instance v1, Lj72/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lj72/i$a;-><init>(Lj72/i;Lj72/h;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
