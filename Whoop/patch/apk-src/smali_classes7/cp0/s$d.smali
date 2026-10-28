.class final Lcp0/s$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/s;->m(Lh0/p;Lh0/o1;FLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$performFling$2"
    f = "CoachDrawerOverScroll.kt"
    l = {
        0xb3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lh0/o1;

.field final synthetic I:Lh0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/p;"
        }
    .end annotation
.end field

.field final synthetic J:Lkotlin/jvm/internal/d0;

.field final synthetic K:F

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lh0/o1;Lh0/p;Lkotlin/jvm/internal/d0;FLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/o1;",
            "Lh0/p;",
            "Lkotlin/jvm/internal/d0;",
            "F",
            "Lq83/d<",
            "-",
            "Lcp0/s$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/s$d;->H:Lh0/o1;

    iput-object p2, p0, Lcp0/s$d;->I:Lh0/p;

    iput-object p3, p0, Lcp0/s$d;->J:Lkotlin/jvm/internal/d0;

    iput p4, p0, Lcp0/s$d;->K:F

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    new-instance v0, Lcp0/s$d;

    iget-object v1, p0, Lcp0/s$d;->H:Lh0/o1;

    iget-object v2, p0, Lcp0/s$d;->I:Lh0/p;

    iget-object v3, p0, Lcp0/s$d;->J:Lkotlin/jvm/internal/d0;

    iget v4, p0, Lcp0/s$d;->K:F

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcp0/s$d;-><init>(Lh0/o1;Lh0/p;Lkotlin/jvm/internal/d0;FLq83/d;)V

    iput-object p1, v0, Lcp0/s$d;->F:Ljava/lang/Object;

    iput-object p2, v0, Lcp0/s$d;->G:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcp0/s$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcp0/s$d;->f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcp0/s$d;->F:Ljava/lang/Object;

    check-cast v0, Lh0/a;

    iget-object v1, p0, Lcp0/s$d;->G:Ljava/lang/Object;

    check-cast v1, Lh0/h1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcp0/s$d;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lcp0/s$d;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, p0, Lcp0/s$d;->x:Ljava/lang/Object;

    check-cast v1, Lh0/o1;

    iget-object v1, p0, Lcp0/s$d;->w:Ljava/lang/Object;

    check-cast v1, Lcp0/s$d$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcp0/s$d$a;

    iget-object v3, p0, Lcp0/s$d;->I:Lh0/p;

    invoke-direct {p1, v3, v1, v0}, Lcp0/s$d$a;-><init>(Lh0/p;Lh0/h1;Lh0/a;)V

    iget-object v0, p0, Lcp0/s$d;->H:Lh0/o1;

    iget-object v1, p0, Lcp0/s$d;->J:Lkotlin/jvm/internal/d0;

    iget v3, p0, Lcp0/s$d;->K:F

    const/4 v5, 0x0

    iput-object v5, p0, Lcp0/s$d;->F:Ljava/lang/Object;

    iput-object v5, p0, Lcp0/s$d;->G:Ljava/lang/Object;

    iput-object v5, p0, Lcp0/s$d;->w:Ljava/lang/Object;

    iput-object v5, p0, Lcp0/s$d;->x:Ljava/lang/Object;

    iput-object v1, p0, Lcp0/s$d;->y:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lcp0/s$d;->z:I

    iput v4, p0, Lcp0/s$d;->E:I

    invoke-interface {v0, p1, v3, p0}, Lh0/o1;->a(Lh0/k2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    move-object v0, v1

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
