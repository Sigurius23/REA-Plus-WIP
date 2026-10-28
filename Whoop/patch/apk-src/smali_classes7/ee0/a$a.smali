.class final Lee0/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee0/a;->c(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lce0/d;",
        "accumulator",
        "Lae0/b;",
        "domainResult",
        "<anonymous>",
        "(Lce0/d;Lae0/b;)Lce0/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.schedulingform.presentation.reducers.SchedulingFormViewStateReducer$reduce$1"
    f = "SchedulingFormViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lee0/a;


# direct methods
.method public constructor <init>(Lee0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee0/a;",
            "Lq83/d<",
            "-",
            "Lee0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lee0/a$a;->z:Lee0/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lce0/d;Lae0/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce0/d;",
            "Lae0/b;",
            "Lq83/d<",
            "-",
            "Lce0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lee0/a$a;

    iget-object v1, p0, Lee0/a$a;->z:Lee0/a;

    invoke-direct {v0, v1, p3}, Lee0/a$a;-><init>(Lee0/a;Lq83/d;)V

    iput-object p1, v0, Lee0/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lee0/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lee0/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce0/d;

    check-cast p2, Lae0/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lee0/a$a;->f(Lce0/d;Lae0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lee0/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lce0/d;

    iget-object v1, p0, Lee0/a$a;->y:Ljava/lang/Object;

    check-cast v1, Lae0/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lee0/a$a;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lee0/a$a;->z:Lee0/a;

    invoke-static {p1, v1, v0}, Lee0/a;->a(Lee0/a;Lae0/b;Lce0/d;)Lce0/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
