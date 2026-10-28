.class final Ljr1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljr1/d;->x(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Landroidx/lifecycle/x;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;Landroidx/lifecycle/x;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.integrations.view.IntegrationsDetailsScreenKt$IntegrationsDetailsScreen$2$1$1$1"
    f = "IntegrationsDetailsScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lgr1/q;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lgr1/b;


# direct methods
.method public constructor <init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lgr1/b;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/q;",
            "Lkotlin/jvm/functions/Function1;",
            "Lgr1/b;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Ljr1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljr1/d$c;->x:Lgr1/q;

    iput-object p2, p0, Ljr1/d$c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ljr1/d$c;->z:Lgr1/b;

    iput-object p4, p0, Ljr1/d$c;->E:Lp1/c1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbc3/c0;Landroidx/lifecycle/x;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroidx/lifecycle/x;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljr1/d$c;

    iget-object v1, p0, Ljr1/d$c;->x:Lgr1/q;

    iget-object v2, p0, Ljr1/d$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ljr1/d$c;->z:Lgr1/b;

    iget-object v4, p0, Ljr1/d$c;->E:Lp1/c1;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Ljr1/d$c;-><init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lgr1/b;Lp1/c1;Lq83/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljr1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Landroidx/lifecycle/x;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljr1/d$c;->f(Lbc3/c0;Landroidx/lifecycle/x;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ljr1/d$c;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ljr1/d$c;->E:Lp1/c1;

    invoke-static {p1}, Ljr1/d;->T(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljr1/d$c;->x:Lgr1/q;

    invoke-virtual {p1}, Lgr1/q;->c()Lgr1/b;

    move-result-object p1

    invoke-virtual {p1}, Lgr1/b;->y()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ljr1/d$c;->E:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljr1/d;->U(Lp1/c1;Z)V

    iget-object p1, p0, Ljr1/d$c;->y:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lgr1/n$o;

    iget-object v1, p0, Ljr1/d$c;->z:Lgr1/b;

    invoke-virtual {v1}, Lgr1/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lgr1/n$o;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
