.class public final Lcom/whoop/settings/notification/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r*\u0008\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\r*\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/settings/notification/e;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/settings/notification/c;",
        "interactor",
        "Lcom/whoop/settings/notification/f;",
        "viewStateReducer",
        "<init>",
        "(Lcom/whoop/settings/notification/c;Lcom/whoop/settings/notification/f;)V",
        "Lcom/whoop/settings/notification/d;",
        "viewEvent",
        "Lcom/whoop/settings/notification/a;",
        "p",
        "(Lcom/whoop/settings/notification/d;)Lcom/whoop/settings/notification/a;",
        "Lec3/l;",
        "Lcom/whoop/settings/notification/b;",
        "l",
        "(Lec3/l;Lcom/whoop/settings/notification/c;)Lec3/l;",
        "Lic2/g;",
        "n",
        "(Lec3/l;Lcom/whoop/settings/notification/f;)Lec3/l;",
        "Lbc3/k1;",
        "o",
        "(Lcom/whoop/settings/notification/d;)Lbc3/k1;",
        "Lec3/o1;",
        "w",
        "Lec3/o1;",
        "eventFlow",
        "x",
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
.field private final w:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final x:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/settings/notification/c;Lcom/whoop/settings/notification/f;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/notification/e;->w:Lec3/o1;

    new-instance v1, Lcom/whoop/settings/notification/e$b;

    invoke-direct {v1, v0, p0}, Lcom/whoop/settings/notification/e$b;-><init>(Lec3/l;Lcom/whoop/settings/notification/e;)V

    invoke-direct {p0, v1, p1}, Lcom/whoop/settings/notification/e;->l(Lec3/l;Lcom/whoop/settings/notification/c;)Lec3/l;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/whoop/settings/notification/e;->n(Lec3/l;Lcom/whoop/settings/notification/f;)Lec3/l;

    move-result-object p1

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p2, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/settings/notification/e;->x:Lec3/l;

    return-void
.end method

.method public static final synthetic g(Lcom/whoop/settings/notification/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/notification/e;->w:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lcom/whoop/settings/notification/e;Lcom/whoop/settings/notification/d;)Lcom/whoop/settings/notification/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/settings/notification/e;->p(Lcom/whoop/settings/notification/d;)Lcom/whoop/settings/notification/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lcom/whoop/settings/notification/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lcom/whoop/settings/notification/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lcom/whoop/settings/notification/c;->j(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lec3/l;Lcom/whoop/settings/notification/f;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lcom/whoop/settings/notification/f;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lcom/whoop/settings/notification/f;->a(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lcom/whoop/settings/notification/d;)Lcom/whoop/settings/notification/a;
    .locals 3

    sget-object v0, Lcom/whoop/settings/notification/d$a;->a:Lcom/whoop/settings/notification/d$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/settings/notification/a$a;->a:Lcom/whoop/settings/notification/a$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/settings/notification/d$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/settings/notification/a$b;

    check-cast p1, Lcom/whoop/settings/notification/d$b;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/d$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/settings/notification/d$b;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/settings/notification/a$b;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lcom/whoop/settings/notification/d$c;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/settings/notification/a$c;

    check-cast p1, Lcom/whoop/settings/notification/d$c;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/d$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/settings/notification/d$c;->b()Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/settings/notification/d$c;->c()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/settings/notification/a$c;-><init>(Ljava/lang/String;ZZ)V

    return-object v0

    :cond_2
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

    iget-object v0, p0, Lcom/whoop/settings/notification/e;->x:Lec3/l;

    return-object v0
.end method

.method public final o(Lcom/whoop/settings/notification/d;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/notification/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/settings/notification/e$a;-><init>(Lcom/whoop/settings/notification/e;Lcom/whoop/settings/notification/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
