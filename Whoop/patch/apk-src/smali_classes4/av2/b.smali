.class public final Lav2/b;
.super Lhj0/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lav2/b;",
        "Lhj0/o;",
        "Lzu2/d;",
        "interactor",
        "Lav2/f;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lzu2/d;Lav2/f;Lbc3/c0;)V",
        "Lav2/a$g;",
        "Lzu2/b;",
        "B",
        "(Lav2/a$g;)Lzu2/b;",
        "viewEvent",
        "Ll83/a0;",
        "A",
        "(Lav2/a$g;)V",
        "",
        "E",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "Lec3/o1;",
        "F",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lav2/e;",
        "G",
        "Lec3/t1;",
        "z",
        "()Lec3/t1;",
        "viewState",
        "weightlifting_release"
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
.field private final E:Ljava/lang/String;

.field private final F:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final G:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzu2/d;Lav2/f;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lhj0/o;-><init>(Lbc3/c0;)V

    .line 2
    const-string p3, "InputWorkoutNameViewModel"

    iput-object p3, p0, Lav2/b;->E:Ljava/lang/String;

    const/4 p3, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v0, v1, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lav2/b;->F:Lec3/o1;

    .line 4
    new-instance v0, Lav2/b$b;

    invoke-direct {v0, p3, p0}, Lav2/b$b;-><init>(Lec3/l;Lav2/b;)V

    .line 5
    new-instance p3, Lav2/b$d;

    invoke-direct {p3, v1}, Lav2/b$d;-><init>(Lq83/d;)V

    .line 6
    new-instance v1, Lec3/a0;

    invoke-direct {v1, p3, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 7
    sget-object p3, Lzu2/c;->d:Lzu2/c$a;

    invoke-virtual {p3}, Lzu2/c$a;->a()Lzu2/c;

    move-result-object p3

    new-instance v0, Lav2/b$e;

    invoke-direct {v0, p1}, Lav2/b$e;-><init>(Ljava/lang/Object;)V

    .line 8
    new-instance p1, Lec3/l1;

    invoke-direct {p1, p3, v1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 9
    new-instance p3, Lav2/b$c;

    invoke-direct {p3, p1, p2}, Lav2/b$c;-><init>(Lec3/l;Lav2/f;)V

    .line 10
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p3, p1, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lav2/b;->G:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lzu2/d;Lav2/f;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lav2/b;-><init>(Lzu2/d;Lav2/f;Lbc3/c0;)V

    return-void
.end method

.method private final B(Lav2/a$g;)Lzu2/b;
    .locals 1

    instance-of v0, p1, Lav2/a$d;

    if-eqz v0, :cond_0

    new-instance v0, Lzu2/b$d;

    check-cast p1, Lav2/a$d;

    invoke-virtual {p1}, Lav2/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lzu2/b$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lav2/a$e;

    if-eqz v0, :cond_1

    sget-object p1, Lzu2/b$c;->a:Lzu2/b$c;

    return-object p1

    :cond_1
    instance-of v0, p1, Lav2/a$f;

    if-eqz v0, :cond_2

    sget-object p1, Lzu2/b$e;->a:Lzu2/b$e;

    return-object p1

    :cond_2
    instance-of p1, p1, Lav2/a$c;

    if-eqz p1, :cond_3

    sget-object p1, Lzu2/b$a;->a:Lzu2/b$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic w(Lav2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lav2/b;->F:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic y(Lav2/b;Lav2/a$g;)Lzu2/b;
    .locals 0

    invoke-direct {p0, p1}, Lav2/b;->B(Lav2/a$g;)Lzu2/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lav2/a$g;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lav2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lav2/b$a;-><init>(Lav2/b;Lav2/a$g;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lav2/b;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final z()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lav2/b;->G:Lec3/t1;

    return-object v0
.end method
