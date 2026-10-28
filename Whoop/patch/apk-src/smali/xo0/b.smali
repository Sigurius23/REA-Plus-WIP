.class public final Lxo0/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lyo0/f;",
        "Lxo0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lxo0/b;",
        "Lld1/c;",
        "Lyo0/f;",
        "Lxo0/a;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lvo0/c;",
        "coachOnboardingInteractor",
        "Lxo0/c;",
        "coachOnboardingViewStateReducer",
        "<init>",
        "(Lbc3/c0;Lvo0/c;Lxo0/c;)V",
        "Lvo0/a;",
        "q",
        "(Lxo0/a;)Lvo0/a;",
        "event",
        "Ll83/a0;",
        "p",
        "(Lxo0/a;)V",
        "x",
        "Lbc3/c0;",
        "y",
        "Lvo0/c;",
        "z",
        "Lxo0/c;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "F",
        "Lec3/t1;",
        "o",
        "()Lec3/t1;",
        "viewState",
        "coach-everywhere_release"
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

.field private final F:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Lvo0/c;

.field private final z:Lxo0/c;


# direct methods
.method public constructor <init>(Lbc3/c0;Lvo0/c;Lxo0/c;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coachOnboardingInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coachOnboardingViewStateReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lxo0/b;->x:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lxo0/b;->y:Lvo0/c;

    .line 4
    iput-object p3, p0, Lxo0/b;->z:Lxo0/c;

    const/4 p3, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p3, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lxo0/b;->E:Lec3/o1;

    .line 6
    new-instance v0, Lxo0/b$b;

    invoke-direct {v0, p3, p0}, Lxo0/b$b;-><init>(Lec3/l;Lxo0/b;)V

    .line 7
    invoke-virtual {p2, v0}, Lvo0/c;->m(Lec3/l;)Lec3/l;

    move-result-object p2

    .line 8
    new-instance p3, Lxo0/b$c;

    invoke-direct {p3, p2, p0}, Lxo0/b$c;-><init>(Lec3/l;Lxo0/b;)V

    .line 9
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p3, p1, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lxo0/b;->F:Lec3/t1;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lvo0/c;Lxo0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 10
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    .line 11
    sget-object p4, Lhc3/o;->a:Lbc3/w1;

    .line 12
    invoke-virtual {p4}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p4

    .line 13
    invoke-static {p1, p4}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    .line 14
    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxo0/b;-><init>(Lbc3/c0;Lvo0/c;Lxo0/c;)V

    return-void
.end method

.method public static final synthetic j(Lxo0/b;)Lxo0/c;
    .locals 0

    iget-object p0, p0, Lxo0/b;->z:Lxo0/c;

    return-object p0
.end method

.method public static final synthetic l(Lxo0/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lxo0/b;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic n(Lxo0/b;Lxo0/a;)Lvo0/a;
    .locals 0

    invoke-direct {p0, p1}, Lxo0/b;->q(Lxo0/a;)Lvo0/a;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lxo0/a;)Lvo0/a;
    .locals 2

    instance-of v0, p1, Lxo0/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lvo0/a$a;

    check-cast p1, Lxo0/a$a;

    invoke-virtual {p1}, Lxo0/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lxo0/a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lvo0/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    sget-object v0, Lxo0/a$b;->a:Lxo0/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lvo0/a$b;->a:Lvo0/a$b;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxo0/a;

    invoke-virtual {p0, p1}, Lxo0/b;->p(Lxo0/a;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lxo0/b;->o()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public o()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lxo0/b;->F:Lec3/t1;

    return-object v0
.end method

.method public p(Lxo0/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxo0/b;->x:Lbc3/c0;

    new-instance v1, Lxo0/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lxo0/b$a;-><init>(Lxo0/b;Lxo0/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
