.class final Lpg2/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


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
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a&\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00000\u00072\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lha0/d;",
        "all",
        "Lha0/h;",
        "recent",
        "",
        "defaults",
        "Ll83/q;",
        "<anonymous>",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ll83/q;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$1"
    f = "PreSessionWidgetInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg2/d$c;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha0/d;",
            ">;",
            "Ljava/util/List<",
            "Lha0/h;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lpg2/d$c;

    invoke-direct {v0, p4}, Lpg2/d$c;-><init>(Lq83/d;)V

    iput-object p1, v0, Lpg2/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lpg2/d$c;->y:Ljava/lang/Object;

    iput-object p3, v0, Lpg2/d$c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lpg2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lpg2/d$c;->f(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpg2/d$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lpg2/d$c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lpg2/d$c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lpg2/d$c;->w:I

    if-nez v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ll83/q;

    invoke-direct {p1, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
