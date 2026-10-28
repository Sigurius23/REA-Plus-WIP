.class final Lbd0/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd0/a;->a(Lec3/l;)Lec3/l;
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
        "Lad0/c;",
        "currentViewState",
        "Lyc0/b;",
        "domainResult",
        "<anonymous>",
        "(Lad0/c;Lyc0/b;)Lad0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.mobilescheduling.presentation.reducers.MobileSchedulingFormViewStateReducer$reduce$1"
    f = "MobileSchedulingFormViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lbd0/a;


# direct methods
.method public constructor <init>(Lbd0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbd0/a;",
            "Lq83/d<",
            "-",
            "Lbd0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbd0/a$a;->z:Lbd0/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lad0/c;Lyc0/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lad0/c;",
            "Lyc0/b;",
            "Lq83/d<",
            "-",
            "Lad0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbd0/a$a;

    iget-object v1, p0, Lbd0/a$a;->z:Lbd0/a;

    invoke-direct {v0, v1, p3}, Lbd0/a$a;-><init>(Lbd0/a;Lq83/d;)V

    iput-object p1, v0, Lbd0/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbd0/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbd0/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lad0/c;

    check-cast p2, Lyc0/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbd0/a$a;->f(Lad0/c;Lyc0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lbd0/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lad0/c;

    iget-object v1, p0, Lbd0/a$a;->y:Ljava/lang/Object;

    check-cast v1, Lyc0/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbd0/a$a;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbd0/a$a;->z:Lbd0/a;

    invoke-virtual {p1, v1, v0}, Lbd0/a;->b(Lyc0/b;Lad0/c;)Lad0/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
