.class public final Lpc2/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lpc2/e;",
        "Landroidx/lifecycle/w1;",
        "Lpc2/c;",
        "interactor",
        "Lpc2/g;",
        "viewStateReducer",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lpc2/c;Lpc2/g;Lbc3/c0;)V",
        "Lcom/whoop/settings/regulatorylabels/a;",
        "Lpc2/a$a;",
        "p",
        "(Lcom/whoop/settings/regulatorylabels/a;)Lpc2/a$a;",
        "action",
        "Ll83/a0;",
        "o",
        "(Lcom/whoop/settings/regulatorylabels/a;)V",
        "w",
        "Lpc2/c;",
        "x",
        "Lpc2/g;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lpc2/f;",
        "E",
        "Lec3/t1;",
        "n",
        "()Lec3/t1;",
        "viewState",
        "settings_release"
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

.field private final w:Lpc2/c;

.field private final x:Lpc2/g;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpc2/c;Lpc2/g;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lpc2/e;->w:Lpc2/c;

    .line 3
    iput-object p2, p0, Lpc2/e;->x:Lpc2/g;

    .line 4
    iput-object p3, p0, Lpc2/e;->y:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lpc2/e;->z:Lec3/o1;

    .line 6
    new-instance v0, Lpc2/e$b;

    invoke-direct {v0, p2, p0}, Lpc2/e$b;-><init>(Lec3/l;Lpc2/e;)V

    .line 7
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lpc2/e$c;

    invoke-direct {p2, p1, p0}, Lpc2/e$c;-><init>(Lec3/l;Lpc2/e;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lpc2/e;->E:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lpc2/c;Lpc2/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lpc2/e;-><init>(Lpc2/c;Lpc2/g;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lpc2/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lpc2/e;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lpc2/e;)Lpc2/g;
    .locals 0

    iget-object p0, p0, Lpc2/e;->x:Lpc2/g;

    return-object p0
.end method

.method public static final synthetic l(Lpc2/e;Lcom/whoop/settings/regulatorylabels/a;)Lpc2/a$a;
    .locals 0

    invoke-direct {p0, p1}, Lpc2/e;->p(Lcom/whoop/settings/regulatorylabels/a;)Lpc2/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lcom/whoop/settings/regulatorylabels/a;)Lpc2/a$a;
    .locals 0

    instance-of p1, p1, Lcom/whoop/settings/regulatorylabels/a$a;

    if-eqz p1, :cond_0

    sget-object p1, Lpc2/a$a;->a:Lpc2/a$a;

    return-object p1

    :cond_0
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

    iget-object v0, p0, Lpc2/e;->E:Lec3/t1;

    return-object v0
.end method

.method public final o(Lcom/whoop/settings/regulatorylabels/a;)V
    .locals 3

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpc2/e;->y:Lbc3/c0;

    new-instance v1, Lpc2/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lpc2/e$a;-><init>(Lpc2/e;Lcom/whoop/settings/regulatorylabels/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
