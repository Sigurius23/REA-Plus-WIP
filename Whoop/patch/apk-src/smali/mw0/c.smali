.class public final Lmw0/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00080%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001d\u0010.\u001a\u0008\u0012\u0004\u0012\u00020)0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lmw0/c;",
        "Landroidx/lifecycle/w1;",
        "Ljw0/d;",
        "interactor",
        "Lmw0/e;",
        "viewStateReducer",
        "<init>",
        "(Ljw0/d;Lmw0/e;)V",
        "Lmw0/b;",
        "viewEvent",
        "Lec3/l;",
        "Ljw0/c;",
        "r",
        "(Lmw0/b;Lq83/d;)Ljava/lang/Object;",
        "Lbc3/k1;",
        "p",
        "(Lmw0/b;)Lbc3/k1;",
        "w",
        "Ljw0/d;",
        "x",
        "Lmw0/e;",
        "",
        "y",
        "I",
        "n",
        "()I",
        "setSleepId",
        "(I)V",
        "sleepId",
        "",
        "z",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "q",
        "(Ljava/lang/String;)V",
        "sleepIdV2",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lmw0/d;",
        "F",
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
.field private final E:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Ljw0/d;

.field private final x:Lmw0/e;

.field private y:I

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljw0/d;Lmw0/e;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lmw0/c;->w:Ljw0/d;

    iput-object p2, p0, Lmw0/c;->x:Lmw0/e;

    const/4 p1, -0x1

    iput p1, p0, Lmw0/c;->y:I

    const-string p1, ""

    iput-object p1, p0, Lmw0/c;->z:Ljava/lang/String;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p2, p2, v0, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lmw0/c;->E:Lec3/o1;

    new-instance v1, Lmw0/c$b;

    invoke-direct {v1, p1, v0, p0}, Lmw0/c$b;-><init>(Lec3/l;Lq83/d;Lmw0/c;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v1}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, v0, v1, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lmw0/c;->F:Lec3/l;

    return-void
.end method

.method public static final synthetic g(Lmw0/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lmw0/c;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lmw0/c;)Lmw0/e;
    .locals 0

    iget-object p0, p0, Lmw0/c;->x:Lmw0/e;

    return-object p0
.end method

.method public static final synthetic l(Lmw0/c;Lmw0/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmw0/c;->r(Lmw0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final r(Lmw0/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmw0/b;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmw0/c;->w:Ljw0/d;

    invoke-virtual {v0, p1, p2}, Ljw0/d;->g(Lmw0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lmw0/c;->F:Lec3/l;

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lmw0/c;->y:I

    return v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmw0/c;->z:Ljava/lang/String;

    return-object v0
.end method

.method public final p(Lmw0/b;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lmw0/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmw0/c$a;-><init>(Lmw0/c;Lmw0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmw0/c;->z:Ljava/lang/String;

    return-void
.end method
