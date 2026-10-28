.class final Ldt1/j$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/j;->d(Ldt1/a;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ldt1/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$getLatestReading$1"
    f = "LabradorDetailsLocalInteractor.kt"
    l = {
        0x38,
        0x3a,
        0x41
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldt1/j;

.field final synthetic F:Ldt1/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldt1/j;Ldt1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/j;",
            "Ldt1/a;",
            "Lq83/d<",
            "-",
            "Ldt1/j$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/j$c;->E:Ldt1/j;

    iput-object p2, p0, Ldt1/j$c;->F:Ldt1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Ldt1/j$c;

    iget-object v1, p0, Ldt1/j$c;->E:Ldt1/j;

    iget-object v2, p0, Ldt1/j$c;->F:Ldt1/a;

    invoke-direct {v0, v1, v2, p2}, Ldt1/j$c;-><init>(Ldt1/j;Ldt1/a;Lq83/d;)V

    iput-object p1, v0, Ldt1/j$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/j$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/j$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/j$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ldt1/j$c;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldt1/j$c;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Ldt1/j$c;->x:Ljava/lang/Object;

    check-cast v0, Ldt1/a;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Ldt1/j$c;->w:Ljava/lang/Object;

    check-cast v0, Lqk1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldt1/j$c;->E:Ldt1/j;

    invoke-static {p1}, Ldt1/j;->a(Ldt1/j;)Lqk1/b;

    move-result-object p1

    iput-object v0, p0, Ldt1/j$c;->z:Ljava/lang/Object;

    iput v5, p0, Ldt1/j$c;->y:I

    invoke-interface {p1, p0}, Lqk1/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Lqk1/a;

    const/4 v2, 0x0

    if-nez p1, :cond_5

    sget-object p1, Ldt1/c$f;->a:Ldt1/c$f;

    iput-object v2, p0, Ldt1/j$c;->z:Ljava/lang/Object;

    iput-object v2, p0, Ldt1/j$c;->w:Ljava/lang/Object;

    iput v4, p0, Ldt1/j$c;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_5
    iget-object v4, p0, Ldt1/j$c;->F:Ldt1/a;

    if-eqz v4, :cond_6

    new-instance v4, Ldt1/a;

    invoke-virtual {p1}, Lqk1/a;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    const-string v6, "ofEpochMilli(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, ""

    invoke-direct {v4, v6, v5}, Ldt1/a;-><init>(Ljava/lang/String;Ljava/time/Instant;)V

    goto :goto_2

    :cond_6
    move-object v4, v2

    :goto_2
    new-instance v5, Ldt1/c$k;

    invoke-direct {v5, p1, v4}, Ldt1/c$k;-><init>(Lqk1/a;Ldt1/a;)V

    iput-object v2, p0, Ldt1/j$c;->z:Ljava/lang/Object;

    iput-object v2, p0, Ldt1/j$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Ldt1/j$c;->x:Ljava/lang/Object;

    iput v3, p0, Ldt1/j$c;->y:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
