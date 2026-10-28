.class public final Lcom/whoop/settings/journalv2/g;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/settings/journalv2/g;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/settings/journalv2/b;",
        "interactor",
        "Lcom/whoop/settings/journalv2/i;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/i;Lbc3/c0;)V",
        "Lcom/whoop/settings/journalv2/f;",
        "viewEvent",
        "Lcom/whoop/settings/journalv2/d;",
        "n",
        "(Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/settings/journalv2/a;",
        "p",
        "(Lcom/whoop/settings/journalv2/f;)Lcom/whoop/settings/journalv2/a;",
        "Lbc3/k1;",
        "o",
        "(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;",
        "w",
        "Lcom/whoop/settings/journalv2/b;",
        "x",
        "Lcom/whoop/settings/journalv2/i;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lcom/whoop/settings/journalv2/h;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
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
.field private final w:Lcom/whoop/settings/journalv2/b;

.field private final x:Lcom/whoop/settings/journalv2/i;

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
.method public constructor <init>(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/i;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lcom/whoop/settings/journalv2/g;->w:Lcom/whoop/settings/journalv2/b;

    .line 3
    iput-object p2, p0, Lcom/whoop/settings/journalv2/g;->x:Lcom/whoop/settings/journalv2/i;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 p3, 0x0

    .line 4
    invoke-static {p3, p3, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/settings/journalv2/g;->y:Lec3/o1;

    .line 5
    sget-object p2, Lcom/whoop/settings/journalv2/f$c;->a:Lcom/whoop/settings/journalv2/f$c;

    invoke-static {p1, p2}, Lli0/a;->a(Lec3/t1;Ljava/lang/Object;)Lec3/t1;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/whoop/settings/journalv2/g$b;

    invoke-direct {p2, p1, p0}, Lcom/whoop/settings/journalv2/g$b;-><init>(Lec3/l;Lcom/whoop/settings/journalv2/g;)V

    .line 7
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object p3, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p1, p3, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/settings/journalv2/g;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/i;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 8
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/settings/journalv2/g;-><init>(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/i;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lcom/whoop/settings/journalv2/g;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/journalv2/g;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lcom/whoop/settings/journalv2/g;)Lcom/whoop/settings/journalv2/i;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/journalv2/g;->x:Lcom/whoop/settings/journalv2/i;

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/settings/journalv2/g;Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/settings/journalv2/g;->n(Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/journalv2/f;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/journalv2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/journalv2/g;->w:Lcom/whoop/settings/journalv2/b;

    invoke-direct {p0, p1}, Lcom/whoop/settings/journalv2/g;->p(Lcom/whoop/settings/journalv2/f;)Lcom/whoop/settings/journalv2/a;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/whoop/settings/journalv2/b;->h(Lcom/whoop/settings/journalv2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lcom/whoop/settings/journalv2/f;)Lcom/whoop/settings/journalv2/a;
    .locals 1

    instance-of v0, p1, Lcom/whoop/settings/journalv2/f$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/settings/journalv2/a$d;

    check-cast p1, Lcom/whoop/settings/journalv2/f$a;

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/f$a;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/settings/journalv2/a$d;-><init>(Z)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/settings/journalv2/f$d;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/settings/journalv2/a$b;->a:Lcom/whoop/settings/journalv2/a$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/settings/journalv2/f$b;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/settings/journalv2/a$c;

    check-cast p1, Lcom/whoop/settings/journalv2/f$b;

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/f$b;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/settings/journalv2/a$c;-><init>(Z)V

    return-object v0

    :cond_2
    instance-of p1, p1, Lcom/whoop/settings/journalv2/f$c;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/whoop/settings/journalv2/a$a;->a:Lcom/whoop/settings/journalv2/a$a;

    return-object p1

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

    iget-object v0, p0, Lcom/whoop/settings/journalv2/g;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/journalv2/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/settings/journalv2/g$a;-><init>(Lcom/whoop/settings/journalv2/f;Lcom/whoop/settings/journalv2/g;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
