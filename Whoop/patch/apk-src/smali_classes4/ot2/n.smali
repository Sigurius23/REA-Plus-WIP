.class public final Lot2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lot2/n;",
        "",
        "Lot2/g;",
        "initialScreenReducer",
        "Lot2/h;",
        "metricSelectionScreenReducer",
        "Lot2/l;",
        "sliderScreenReducer",
        "Lot2/j;",
        "activitiesScreenReducer",
        "Lot2/k;",
        "behaviorsScreenReducer",
        "<init>",
        "(Lot2/g;Lot2/h;Lot2/l;Lot2/j;Lot2/k;)V",
        "Ljt2/m$i;",
        "domainState",
        "Ljt2/d;",
        "accumulator",
        "Lot2/m;",
        "a",
        "(Ljt2/m$i;Ljt2/d;)Lot2/m;",
        "Ljt2/m;",
        "b",
        "(Ljt2/m;Ljt2/d;)Lot2/m;",
        "Lot2/g;",
        "Lot2/h;",
        "c",
        "Lot2/l;",
        "d",
        "Lot2/j;",
        "e",
        "Lot2/k;",
        "weekly-plan_release"
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
.field private final a:Lot2/g;

.field private final b:Lot2/h;

.field private final c:Lot2/l;

.field private final d:Lot2/j;

.field private final e:Lot2/k;


# direct methods
.method public constructor <init>(Lot2/g;Lot2/h;Lot2/l;Lot2/j;Lot2/k;)V
    .locals 1

    const-string v0, "initialScreenReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricSelectionScreenReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sliderScreenReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activitiesScreenReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorsScreenReducer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot2/n;->a:Lot2/g;

    iput-object p2, p0, Lot2/n;->b:Lot2/h;

    iput-object p3, p0, Lot2/n;->c:Lot2/l;

    iput-object p4, p0, Lot2/n;->d:Lot2/j;

    iput-object p5, p0, Lot2/n;->e:Lot2/k;

    return-void
.end method

.method private final a(Ljt2/m$i;Ljt2/d;)Lot2/m;
    .locals 7

    new-instance v0, Lot2/m$i;

    iget-object v1, p0, Lot2/n;->a:Lot2/g;

    invoke-virtual {v1, p1, p2}, Lot2/g;->m(Ljt2/m$i;Ljt2/d;)Lot2/p;

    move-result-object v1

    iget-object v2, p0, Lot2/n;->b:Lot2/h;

    invoke-virtual {v2, p1, p2}, Lot2/h;->h(Ljt2/m$i;Ljt2/d;)Lot2/r;

    move-result-object v2

    iget-object v3, p0, Lot2/n;->c:Lot2/l;

    invoke-virtual {v3, p1, p2}, Lot2/l;->l(Ljt2/m$i;Ljt2/d;)Lot2/t;

    move-result-object v3

    iget-object v4, p0, Lot2/n;->d:Lot2/j;

    invoke-virtual {v4, p1, p2}, Lot2/j;->h(Ljt2/m$i;Ljt2/d;)Lot2/a;

    move-result-object v4

    iget-object v5, p0, Lot2/n;->e:Lot2/k;

    invoke-virtual {v5, p1, p2}, Lot2/k;->i(Ljt2/m$i;Ljt2/d;)Lot2/c;

    move-result-object v5

    invoke-virtual {p1}, Ljt2/m$i;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object p1

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v6}, Lot2/m$i;-><init>(Lot2/p;Lot2/r;Lot2/t;Lot2/a;Lot2/c;Lep0/j;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljt2/m;Ljt2/d;)Lot2/m;
    .locals 11

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljt2/m$e;->a:Ljt2/m$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lot2/m$e;->a:Lot2/m$e;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljt2/m$i;

    if-eqz v0, :cond_1

    check-cast p1, Ljt2/m$i;

    invoke-direct {p0, p1, p2}, Lot2/n;->a(Ljt2/m$i;Ljt2/d;)Lot2/m;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Ljt2/m$d;->a:Ljt2/m$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lot2/m$d;->a:Lot2/m$d;

    return-object p1

    :cond_2
    sget-object v0, Ljt2/m$h;->a:Ljt2/m$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lot2/m$h;->a:Lot2/m$h;

    return-object p1

    :cond_3
    sget-object v0, Ljt2/m$g;->a:Ljt2/m$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lot2/m$g;->a:Lot2/m$g;

    return-object p1

    :cond_4
    sget-object v0, Ljt2/m$f;->a:Ljt2/m$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v1, Lot2/m$f;

    invoke-virtual {p2}, Ljt2/d;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljt2/d;->v()Z

    move-result v3

    invoke-static {p2}, Lot2/u;->a(Ljt2/d;)Z

    move-result v4

    invoke-virtual {p2}, Ljt2/d;->r()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2}, Ljt2/d;->q()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p2}, Ljt2/d;->p()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p2}, Ljt2/d;->s()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Ljt2/d;->o()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p2}, Ljt2/d;->u()Ljava/lang/String;

    move-result-object v10

    invoke-direct/range {v1 .. v10}, Lot2/m$f;-><init>(Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_5
    sget-object p2, Ljt2/m$b;->a:Ljt2/m$b;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p1, Lot2/m$b;->a:Lot2/m$b;

    return-object p1

    :cond_6
    sget-object p2, Ljt2/m$c;->a:Ljt2/m$c;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p1, Lot2/m$c;->a:Lot2/m$c;

    return-object p1

    :cond_7
    instance-of p2, p1, Ljt2/m$a;

    if-eqz p2, :cond_8

    new-instance p2, Lot2/m$a;

    check-cast p1, Ljt2/m$a;

    invoke-virtual {p1}, Ljt2/m$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lot2/m$a;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
