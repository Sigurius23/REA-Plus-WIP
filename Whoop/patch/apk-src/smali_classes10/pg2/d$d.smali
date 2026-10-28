.class final Lpg2/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg2/d;->l()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062*\u0010\u0005\u001a&\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Ll83/q;",
        "",
        "Lha0/d;",
        "Lha0/h;",
        "",
        "<destruct>",
        "Lpg2/d$a$a;",
        "<anonymous>",
        "(Ll83/q;)Lpg2/d$a$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$2"
    f = "PreSessionWidgetInteractor.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lpg2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpg2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/d;",
            "Lq83/d<",
            "-",
            "Lpg2/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpg2/d$d;->I:Lpg2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpg2/d$d;

    iget-object v1, p0, Lpg2/d$d;->I:Lpg2/d;

    invoke-direct {v0, v1, p2}, Lpg2/d$d;-><init>(Lpg2/d;Lq83/d;)V

    iput-object p1, v0, Lpg2/d$d;->H:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll83/q;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpg2/d$d;->invoke(Ll83/q;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll83/q;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/q;",
            "Lq83/d<",
            "-",
            "Lpg2/d$a$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lpg2/d$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpg2/d$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpg2/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpg2/d$d;->H:Ljava/lang/Object;

    check-cast v0, Ll83/q;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lpg2/d$d;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lpg2/d$d;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lpg2/d$d;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lpg2/d$d;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lpg2/d$d;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, p0, Lpg2/d$d;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, p0, Lpg2/d$d;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/q;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iget-object p1, v0, Ll83/q;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, v0, Ll83/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v4, p0, Lpg2/d$d;->I:Lpg2/d;

    invoke-static {v4}, Lpg2/d;->f(Lpg2/d;)Lng2/a;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, p0, Lpg2/d$d;->H:Ljava/lang/Object;

    iput-object v5, p0, Lpg2/d$d;->w:Ljava/lang/Object;

    iput-object v5, p0, Lpg2/d$d;->x:Ljava/lang/Object;

    iput-object v5, p0, Lpg2/d$d;->y:Ljava/lang/Object;

    iput-object v2, p0, Lpg2/d$d;->z:Ljava/lang/Object;

    iput-object p1, p0, Lpg2/d$d;->E:Ljava/lang/Object;

    iput-object v0, p0, Lpg2/d$d;->F:Ljava/lang/Object;

    iput v3, p0, Lpg2/d$d;->G:I

    invoke-virtual {v4, p0}, Lng2/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, p1

    move-object p1, v3

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v3, Lpg2/d$a$a;

    invoke-direct {v3, v2, v1, v0, p1}, Lpg2/d$a$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    return-object v3
.end method
