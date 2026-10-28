.class public final Lj12/c;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lm12/e;",
        "Lj12/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f*\u0008\u0012\u0004\u0012\u00020\u000c0\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lj12/c;",
        "Lld1/c;",
        "Lm12/e;",
        "Lj12/a;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lj12/b;",
        "onboardingOverlayInteractor",
        "Lj12/d;",
        "onboardingOverlayViewStateReducer",
        "<init>",
        "(Lbc3/c0;Lj12/b;Lj12/d;)V",
        "Lk12/a;",
        "q",
        "(Lj12/a;)Lk12/a;",
        "Lec3/l;",
        "interactor",
        "Lk12/b;",
        "o",
        "(Lec3/l;Lj12/b;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "p",
        "(Lj12/a;)V",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "z",
        "Lec3/t1;",
        "n",
        "()Lec3/t1;",
        "viewState",
        "onboarding-story_release"
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
.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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
.method public constructor <init>(Lbc3/c0;Lj12/b;Lj12/d;)V
    .locals 3

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingOverlayInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingOverlayViewStateReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lj12/c;->x:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lj12/c;->y:Lec3/o1;

    .line 4
    new-instance v1, Lj12/c$b;

    invoke-direct {v1, v0, p0}, Lj12/c$b;-><init>(Lec3/l;Lj12/c;)V

    .line 5
    invoke-direct {p0, v1, p2}, Lj12/c;->o(Lec3/l;Lj12/b;)Lec3/l;

    move-result-object p2

    .line 6
    new-instance v0, Lj12/c$c;

    invoke-direct {v0, p2, p3}, Lj12/c$c;-><init>(Lec3/l;Lj12/d;)V

    .line 7
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 p3, 0x1

    invoke-static {v0, p1, p2, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lj12/c;->z:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lj12/b;Lj12/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    .line 8
    new-instance p1, Lor2/m;

    const/4 p4, 0x0

    invoke-direct {p1, p4, p5, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lj12/c;-><init>(Lbc3/c0;Lj12/b;Lj12/d;)V

    return-void
.end method

.method public static final synthetic j(Lj12/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lj12/c;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lj12/c;Lj12/a;)Lk12/a;
    .locals 0

    invoke-direct {p0, p1}, Lj12/c;->q(Lj12/a;)Lk12/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lec3/l;Lj12/b;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lj12/b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lj12/b;->j(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final q(Lj12/a;)Lk12/a;
    .locals 1

    instance-of v0, p1, Lj12/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lk12/a$b;

    check-cast p1, Lj12/a$a;

    invoke-virtual {p1}, Lj12/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lk12/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    sget-object v0, Lj12/a$b;->a:Lj12/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lk12/a$a;->a:Lk12/a$a;

    return-object p1

    :cond_1
    sget-object v0, Lj12/a$c;->a:Lj12/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lk12/a$c;->a:Lk12/a$c;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj12/a;

    invoke-virtual {p0, p1}, Lj12/c;->p(Lj12/a;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lj12/c;->n()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public n()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lj12/c;->z:Lec3/t1;

    return-object v0
.end method

.method public p(Lj12/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj12/c;->x:Lbc3/c0;

    new-instance v1, Lj12/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lj12/c$a;-><init>(Lj12/c;Lj12/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
