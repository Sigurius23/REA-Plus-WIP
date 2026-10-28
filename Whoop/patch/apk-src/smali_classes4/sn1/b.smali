.class public final Lsn1/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lvn1/g;",
        "Lsn1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lsn1/b;",
        "Lld1/c;",
        "Lvn1/g;",
        "Lsn1/a;",
        "Lqn1/a;",
        "combiner",
        "Ltn1/b;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lqn1/a;Ltn1/b;Lbc3/c0;)V",
        "Lpn1/a;",
        "o",
        "(Lsn1/a;)Lpn1/a;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lsn1/a;)V",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lpn1/b;",
        "z",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "E",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "home-notifications-center_release"
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
.field private final E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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
.method public constructor <init>(Lqn1/a;Ltn1/b;Lbc3/c0;)V
    .locals 3

    const-string v0, "combiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lsn1/b;->x:Lbc3/c0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-static {v1, v1, v2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lsn1/b;->y:Lec3/o1;

    .line 4
    new-instance v1, Lsn1/b$c;

    invoke-direct {v1, v0, p0}, Lsn1/b$c;-><init>(Lec3/l;Lsn1/b;)V

    .line 5
    new-instance v0, Lsn1/b$a;

    invoke-direct {v0, v2}, Lsn1/b$a;-><init>(Lq83/d;)V

    .line 6
    new-instance v2, Lec3/a0;

    invoke-direct {v2, v0, v1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 7
    invoke-static {v2, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lsn1/b;->z:Lec3/l;

    .line 8
    new-instance v0, Lsn1/b$d;

    invoke-direct {v0, p1, p2}, Lsn1/b$d;-><init>(Lec3/l;Ltn1/b;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    sget-object p2, Lvn1/g$b;->b:Lvn1/g$b;

    invoke-static {v0, p3, p1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lsn1/b;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lqn1/a;Ltn1/b;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lsn1/b;-><init>(Lqn1/a;Ltn1/b;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic j(Lsn1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lsn1/b;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lsn1/b;Lsn1/a;)Lpn1/a;
    .locals 0

    invoke-direct {p0, p1}, Lsn1/b;->o(Lsn1/a;)Lpn1/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lsn1/a;)Lpn1/a;
    .locals 7

    instance-of v0, p1, Lsn1/a$c;

    if-eqz v0, :cond_0

    new-instance v1, Lpn1/a$c;

    check-cast p1, Lsn1/a$c;

    invoke-virtual {p1}, Lsn1/a$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lsn1/a$c;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lpn1/a$c;-><init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lsn1/a$f;

    if-eqz v0, :cond_1

    new-instance v0, Lpn1/a$f;

    check-cast p1, Lsn1/a$f;

    invoke-virtual {p1}, Lsn1/a$f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsn1/a$f;->a()Lvn1/a;

    move-result-object v2

    invoke-virtual {p1}, Lsn1/a$f;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lpn1/a$f;-><init>(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)V

    return-object v0

    :cond_1
    sget-object v0, Lsn1/a$g;->a:Lsn1/a$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lpn1/a$g;->a:Lpn1/a$g;

    return-object p1

    :cond_2
    instance-of v0, p1, Lsn1/a$h;

    if-eqz v0, :cond_3

    new-instance v0, Lpn1/a$h;

    check-cast p1, Lsn1/a$h;

    invoke-virtual {p1}, Lsn1/a$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lpn1/a$h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lsn1/a$d;

    if-eqz v0, :cond_4

    new-instance v0, Lpn1/a$d;

    check-cast p1, Lsn1/a$d;

    invoke-virtual {p1}, Lsn1/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lpn1/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    instance-of v0, p1, Lsn1/a$b;

    if-eqz v0, :cond_5

    new-instance v0, Lpn1/a$b;

    check-cast p1, Lsn1/a$b;

    invoke-virtual {p1}, Lsn1/a$b;->a()Lvn1/i;

    move-result-object p1

    invoke-direct {v0, p1}, Lpn1/a$b;-><init>(Lvn1/i;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lsn1/a$a;

    if-eqz v0, :cond_6

    new-instance v0, Lpn1/a$a;

    check-cast p1, Lsn1/a$a;

    invoke-virtual {p1}, Lsn1/a$a;->a()Lh01/r;

    move-result-object p1

    invoke-direct {v0, p1}, Lpn1/a$a;-><init>(Lh01/r;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Lsn1/a$e;

    if-eqz v0, :cond_7

    new-instance v1, Lpn1/a$e;

    check-cast p1, Lsn1/a$e;

    invoke-virtual {p1}, Lsn1/a$e;->a()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lsn1/a$e;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lsn1/a$e;->e()I

    move-result v4

    invoke-virtual {p1}, Lsn1/a$e;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lsn1/a$e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lpn1/a$e;-><init>(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lsn1/a;

    invoke-virtual {p0, p1}, Lsn1/b;->n(Lsn1/a;)V

    return-void
.end method

.method public getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lsn1/b;->E:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsn1/b;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public n(Lsn1/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsn1/b;->x:Lbc3/c0;

    new-instance v1, Lsn1/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lsn1/b$b;-><init>(Lsn1/b;Lsn1/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
