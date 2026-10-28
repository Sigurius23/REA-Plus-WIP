.class public final Lly2/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f*\u0008\u0012\u0004\u0012\u00020\u000c0\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000f*\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00130\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lly2/a;",
        "Landroidx/lifecycle/w1;",
        "Liy2/c;",
        "interactor",
        "Ljy2/a;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Liy2/c;Ljy2/a;Lbc3/c0;)V",
        "Lhy2/a;",
        "viewEvent",
        "Liy2/a;",
        "p",
        "(Lhy2/a;)Liy2/a;",
        "Lec3/l;",
        "Liy2/b;",
        "l",
        "(Lec3/l;Liy2/c;)Lec3/l;",
        "Lky2/g;",
        "n",
        "(Lec3/l;Ljy2/a;)Lec3/l;",
        "Lbc3/k1;",
        "o",
        "(Lhy2/a;)Lbc3/k1;",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "z",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "whooplabs_release"
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

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Liy2/c;Ljy2/a;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lly2/a;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lly2/a;->x:Lec3/o1;

    .line 4
    new-instance v1, Lly2/a$b;

    invoke-direct {v1, v0, p0}, Lly2/a$b;-><init>(Lec3/l;Lly2/a;)V

    .line 5
    invoke-direct {p0, v1, p1}, Lly2/a;->l(Lec3/l;Liy2/c;)Lec3/l;

    move-result-object p1

    const/4 v0, 0x1

    .line 6
    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p3, v1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lly2/a;->y:Lec3/l;

    .line 7
    invoke-direct {p0, p1, p2}, Lly2/a;->n(Lec3/l;Ljy2/a;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object p2, Lky2/g$d;->a:Lky2/g$d;

    invoke-static {p1, p3, v1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lly2/a;->z:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Liy2/c;Ljy2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lly2/a;-><init>(Liy2/c;Ljy2/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lly2/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lly2/a;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lly2/a;Lhy2/a;)Liy2/a;
    .locals 0

    invoke-direct {p0, p1}, Lly2/a;->p(Lhy2/a;)Liy2/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Liy2/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Liy2/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Liy2/c;->n(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lec3/l;Ljy2/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Ljy2/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Ljy2/a;->a(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lhy2/a;)Liy2/a;
    .locals 3

    instance-of v0, p1, Lhy2/a$b;

    if-eqz v0, :cond_0

    new-instance v0, Liy2/a$a;

    check-cast p1, Lhy2/a$b;

    invoke-virtual {p1}, Lhy2/a$b;->a()I

    move-result v1

    invoke-virtual {p1}, Lhy2/a$b;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Liy2/a$a;-><init>(ILjava/lang/Integer;)V

    return-object v0

    :cond_0
    sget-object v0, Lhy2/a$c;->a:Lhy2/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Liy2/a$b;->a:Liy2/a$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lhy2/a$d;

    if-eqz v0, :cond_2

    new-instance v0, Liy2/a$d;

    check-cast p1, Lhy2/a$d;

    invoke-virtual {p1}, Lhy2/a$d;->b()I

    move-result v1

    invoke-virtual {p1}, Lhy2/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Liy2/a$d;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lhy2/a$a;

    if-eqz v0, :cond_3

    new-instance v0, Liy2/a$f;

    check-cast p1, Lhy2/a$a;

    invoke-virtual {p1}, Lhy2/a$a;->b()I

    move-result v1

    invoke-virtual {p1}, Lhy2/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lhy2/a$a;->c()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Liy2/a$f;-><init>(ILjava/lang/String;Z)V

    return-object v0

    :cond_3
    sget-object v0, Lhy2/a$e;->a:Lhy2/a$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Liy2/a$c;->a:Liy2/a$c;

    return-object p1

    :cond_4
    instance-of v0, p1, Lhy2/a$f;

    if-eqz v0, :cond_5

    new-instance v0, Liy2/a$e;

    check-cast p1, Lhy2/a$f;

    invoke-virtual {p1}, Lhy2/a$f;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-direct {v0, p1}, Liy2/a$e;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lly2/a;->z:Lec3/f2;

    return-object v0
.end method

.method public final o(Lhy2/a;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lly2/a;->w:Lbc3/c0;

    new-instance v1, Lly2/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lly2/a$a;-><init>(Lly2/a;Lhy2/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
