.class final Lcp0/a1$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/a1;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lh0/a;",
        "Lh0/h1;",
        "Lcp0/l;",
        "anchors",
        "Ll83/a0;",
        "<anonymous>",
        "(Lh0/a;Lh0/h1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coacheverywhere.view.composables.CollapsedBarDraggableState$drag$2"
    f = "CoachDrawerOverScroll.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic F:Lcp0/a1;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;Lcp0/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lcp0/a1;",
            "Lq83/d<",
            "-",
            "Lcp0/a1$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/a1$a;->E:Lc93/m;

    iput-object p2, p0, Lcp0/a1$a;->F:Lcp0/a1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/a;",
            "Lh0/h1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcp0/a1$a;

    iget-object v1, p0, Lcp0/a1$a;->E:Lc93/m;

    iget-object v2, p0, Lcp0/a1$a;->F:Lcp0/a1;

    invoke-direct {v0, v1, v2, p3}, Lcp0/a1$a;-><init>(Lc93/m;Lcp0/a1;Lq83/d;)V

    iput-object p1, v0, Lcp0/a1$a;->y:Ljava/lang/Object;

    iput-object p2, v0, Lcp0/a1$a;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcp0/a1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcp0/a1$a;->f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcp0/a1$a;->y:Ljava/lang/Object;

    check-cast v0, Lh0/a;

    iget-object v1, p0, Lcp0/a1$a;->z:Ljava/lang/Object;

    check-cast v1, Lh0/h1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcp0/a1$a;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lcp0/a1$a;->w:Ljava/lang/Object;

    check-cast v0, Lcp0/a1$a$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcp0/a1$a$a;

    iget-object v3, p0, Lcp0/a1$a;->F:Lcp0/a1;

    invoke-direct {p1, v3, v0, v1}, Lcp0/a1$a$a;-><init>(Lcp0/a1;Lh0/a;Lh0/h1;)V

    iget-object v0, p0, Lcp0/a1$a;->E:Lc93/m;

    const/4 v1, 0x0

    iput-object v1, p0, Lcp0/a1$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcp0/a1$a;->z:Ljava/lang/Object;

    iput-object v1, p0, Lcp0/a1$a;->w:Ljava/lang/Object;

    iput v4, p0, Lcp0/a1$a;->x:I

    invoke-interface {v0, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
