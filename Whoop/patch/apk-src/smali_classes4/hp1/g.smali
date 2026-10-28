.class public final Lhp1/g;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f*\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lhp1/g;",
        "Landroidx/lifecycle/w1;",
        "Lip1/a;",
        "reducer",
        "Lfp1/f;",
        "interactor",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lip1/a;Lfp1/f;Lbc3/c0;)V",
        "Lhp1/f;",
        "viewEvent",
        "Lfp1/c;",
        "p",
        "(Lhp1/f;)Lfp1/c;",
        "Lec3/l;",
        "Lfp1/e;",
        "Lhp1/h;",
        "n",
        "(Lec3/l;Lip1/a;)Lec3/l;",
        "Lbc3/k1;",
        "o",
        "(Lhp1/f;)Lbc3/k1;",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "y",
        "Lec3/t1;",
        "domainState",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "hormonal-insights_release"
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

.field private final y:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
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
.method public constructor <init>(Lip1/a;Lfp1/f;Lbc3/c0;)V
    .locals 3

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lhp1/g;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lhp1/g;->x:Lec3/o1;

    .line 4
    new-instance v1, Lhp1/g$b;

    invoke-direct {v1, v0}, Lhp1/g$b;-><init>(Lec3/l;)V

    .line 5
    new-instance v0, Lhp1/g$c;

    invoke-direct {v0, v1, p0}, Lhp1/g$c;-><init>(Lec3/l;Lhp1/g;)V

    .line 6
    invoke-static {v0, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p2

    .line 7
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    .line 8
    invoke-static {p2, p3, v0, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p2

    .line 9
    iput-object p2, p0, Lhp1/g;->y:Lec3/t1;

    .line 10
    invoke-direct {p0, p2, p1}, Lhp1/g;->n(Lec3/l;Lip1/a;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lhp1/g;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lip1/a;Lfp1/f;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lhp1/g;-><init>(Lip1/a;Lfp1/f;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lhp1/g;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lhp1/g;->w:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic j(Lhp1/g;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lhp1/g;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lhp1/g;Lhp1/f;)Lfp1/c;
    .locals 0

    invoke-direct {p0, p1}, Lhp1/g;->p(Lhp1/f;)Lfp1/c;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lec3/l;Lip1/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lip1/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lip1/a;->j(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lhp1/f;)Lfp1/c;
    .locals 3

    instance-of v0, p1, Lhp1/f$d;

    if-eqz v0, :cond_0

    new-instance v0, Lfp1/c$c;

    check-cast p1, Lhp1/f$d;

    invoke-virtual {p1}, Lhp1/f$d;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v1

    invoke-virtual {p1}, Lhp1/f$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lfp1/c$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lhp1/f$g;

    if-eqz v0, :cond_1

    new-instance v0, Lfp1/c$f;

    check-cast p1, Lhp1/f$g;

    invoke-virtual {p1}, Lhp1/f$g;->a()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {v0, p1}, Lfp1/c$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lhp1/f$c;

    if-eqz v0, :cond_2

    new-instance v0, Lfp1/c$b;

    check-cast p1, Lhp1/f$c;

    invoke-virtual {p1}, Lhp1/f$c;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-virtual {p1}, Lhp1/f$c;->a()Lfp1/d;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lfp1/c$b;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lhp1/f$e;

    if-eqz v0, :cond_3

    new-instance v0, Lfp1/c$d;

    check-cast p1, Lhp1/f$e;

    invoke-virtual {p1}, Lhp1/f$e;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lfp1/c$d;-><init>(Z)V

    return-object v0

    :cond_3
    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lfp1/c$a;->a:Lfp1/c$a;

    return-object p1

    :cond_4
    sget-object v0, Lhp1/f$h;->a:Lhp1/f$h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lfp1/c$g;->a:Lfp1/c$g;

    return-object p1

    :cond_5
    sget-object v0, Lhp1/f$f;->a:Lhp1/f$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lfp1/c$e;->a:Lfp1/c$e;

    return-object p1

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid viewEvent "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", cannot be mapped to a domain action."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
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

    iget-object v0, p0, Lhp1/g;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lhp1/f;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhp1/g;->w:Lbc3/c0;

    new-instance v1, Lhp1/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lhp1/g$a;-><init>(Lhp1/f;Lhp1/g;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
