.class public final Lcom/whoop/widget/ui/healthspan/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/widget/ui/healthspan/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lad3/c;",
        "json",
        "<init>",
        "(Landroid/content/Context;Lad3/c;)V",
        "",
        "Ln6/l;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "d",
        "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
        "content",
        "Ll83/a0;",
        "f",
        "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)Ljava/lang/Object;",
        "",
        "batteryPercentage",
        "e",
        "(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;",
        "b",
        "a",
        "Landroid/content/Context;",
        "Lad3/c;",
        "widget_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Lad3/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lad3/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/whoop/widget/ui/healthspan/a;->b:Lad3/c;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/widget/ui/healthspan/a;)Lad3/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/widget/ui/healthspan/a;->b:Lad3/c;

    return-object p0
.end method

.method private final c(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ln6/l;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lp6/n0;

    iget-object v1, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v1, Ll03/h;

    invoke-virtual {v0, v1, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/widget/ui/healthspan/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/widget/ui/healthspan/a$a;

    iget v1, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/widget/ui/healthspan/a$a;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$a;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v0, v0, Lcom/whoop/widget/ui/healthspan/a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lcom/whoop/widget/ui/healthspan/a$a;->F:I

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$a;->E:Ljava/lang/Object;

    check-cast v7, Ln6/l;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$a;->y:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->w:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v7, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/ui/healthspan/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, p1

    move v2, v3

    :cond_7
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v8, 0x0

    if-eqz p1, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/l;

    iget-object v9, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    new-instance v10, Lcom/whoop/widget/ui/healthspan/a$b;

    invoke-direct {v10, v8}, Lcom/whoop/widget/ui/healthspan/a$b;-><init>(Lq83/d;)V

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->x:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->E:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/widget/ui/healthspan/a$a;->F:I

    iput v3, v0, Lcom/whoop/widget/ui/healthspan/a$a;->G:I

    iput v6, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    invoke-static {v9, p1, v10, v0}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_8
    new-instance p1, Ll03/h;

    invoke-direct {p1}, Ll03/h;-><init>()V

    iget-object v2, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$a;->E:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/widget/ui/healthspan/a$a;->J:I

    invoke-static {p1, v2, v0}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    return-object v4
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/widget/ui/healthspan/a$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/widget/ui/healthspan/a$c;

    iget v1, v0, Lcom/whoop/widget/ui/healthspan/a$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/ui/healthspan/a$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/widget/ui/healthspan/a$c;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/ui/healthspan/a$c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lcom/whoop/widget/ui/healthspan/a$c;->y:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/ui/healthspan/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/widget/ui/healthspan/a$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/widget/ui/healthspan/a$d;

    iget v1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$d;

    invoke-direct {v0, p0, p2}, Lcom/whoop/widget/ui/healthspan/a$d;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/widget/ui/healthspan/a$d;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->G:I

    iget-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$d;->F:Ljava/lang/Object;

    check-cast v2, Ln6/l;

    iget-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$d;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$d;->y:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$d;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    iput v7, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/ui/healthspan/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v7, p1

    move-object v2, p2

    move p1, v3

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v8, 0x0

    if-eqz p2, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/l;

    iget-object v9, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    new-instance v10, Lcom/whoop/widget/ui/healthspan/a$e;

    invoke-direct {v10, p0, v7, v8}, Lcom/whoop/widget/ui/healthspan/a$e;-><init>(Lcom/whoop/widget/ui/healthspan/a;Ljava/lang/Integer;Lq83/d;)V

    iput-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->y:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$d;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->F:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/widget/ui/healthspan/a$d;->G:I

    iput v3, v0, Lcom/whoop/widget/ui/healthspan/a$d;->H:I

    iput v6, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    invoke-static {v9, p2, v10, v0}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_3

    :cond_8
    new-instance p1, Ll03/h;

    invoke-direct {p1}, Ll03/h;-><init>()V

    iget-object p2, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$d;->F:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/widget/ui/healthspan/a$d;->K:I

    invoke-static {p1, p2, v0}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    return-object v4
.end method

.method public final f(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/widget/ui/healthspan/a$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/widget/ui/healthspan/a$f;

    iget v1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$f;

    invoke-direct {v0, p0, p2}, Lcom/whoop/widget/ui/healthspan/a$f;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/widget/ui/healthspan/a$f;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->G:I

    iget-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$f;->F:Ljava/lang/Object;

    check-cast v2, Ln6/l;

    iget-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$f;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$f;->y:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$f;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    iput v7, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/ui/healthspan/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v7, p1

    move-object v2, p2

    move p1, v3

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v8, 0x0

    if-eqz p2, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/l;

    iget-object v9, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    new-instance v10, Lcom/whoop/widget/ui/healthspan/a$g;

    invoke-direct {v10, p0, v7, v8}, Lcom/whoop/widget/ui/healthspan/a$g;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)V

    iput-object v7, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->y:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/widget/ui/healthspan/a$f;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->F:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/widget/ui/healthspan/a$f;->G:I

    iput v3, v0, Lcom/whoop/widget/ui/healthspan/a$f;->H:I

    iput v6, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    invoke-static {v9, p2, v10, v0}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_3

    :cond_8
    new-instance p1, Ll03/h;

    invoke-direct {p1}, Ll03/h;-><init>()V

    iget-object p2, p0, Lcom/whoop/widget/ui/healthspan/a;->a:Landroid/content/Context;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->w:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->z:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/widget/ui/healthspan/a$f;->F:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/widget/ui/healthspan/a$f;->K:I

    invoke-static {p1, p2, v0}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    return-object v4
.end method
