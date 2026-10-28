.class final Lib0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib0/d;->s(Lgb0/c$c;La01/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryScreenKt$BiomarkerSummaryContent$7$1"
    f = "BiomarkerSummaryScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf0/r1;

.field w:I

.field final synthetic x:Lz1/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/s;"
        }
    .end annotation
.end field

.field final synthetic y:La01/m;

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lz1/s;La01/m;Lbc3/c0;Lf0/r1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/s;",
            "La01/m;",
            "Lbc3/c0;",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Lib0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lib0/d$a;->x:Lz1/s;

    iput-object p2, p0, Lib0/d$a;->y:La01/m;

    iput-object p3, p0, Lib0/d$a;->z:Lbc3/c0;

    iput-object p4, p0, Lib0/d$a;->E:Lf0/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lib0/d$a;

    iget-object v1, p0, Lib0/d$a;->x:Lz1/s;

    iget-object v2, p0, Lib0/d$a;->y:La01/m;

    iget-object v3, p0, Lib0/d$a;->z:Lbc3/c0;

    iget-object v4, p0, Lib0/d$a;->E:Lf0/r1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lib0/d$a;-><init>(Lz1/s;La01/m;Lbc3/c0;Lf0/r1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lib0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lib0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lib0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lib0/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lib0/d$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lib0/d$a;->x:Lz1/s;

    invoke-virtual {p1}, Lz1/s;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lib0/d$a;->y:La01/m;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lib0/d$a;->x:Lz1/s;

    iget-object v1, p0, Lib0/d$a;->z:Lbc3/c0;

    iget-object v2, p0, Lib0/d$a;->E:Lf0/r1;

    invoke-virtual {v0, p1}, Lz1/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v3, Lib0/d$a$a;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p1, v0, v4}, Lib0/d$a$a;-><init>(Lf0/r1;ILz1/s;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
