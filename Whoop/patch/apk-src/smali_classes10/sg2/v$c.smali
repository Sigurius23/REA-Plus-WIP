.class final Lsg2/v$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg2/v;->s(Landroidx/compose/ui/Modifier;Lng2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$4$1"
    f = "PreSessionWidget.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lng2/c;

.field final synthetic y:Lng2/f;

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lng2/c;Lng2/f;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng2/c;",
            "Lng2/f;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lsg2/v$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg2/v$c;->x:Lng2/c;

    iput-object p2, p0, Lsg2/v$c;->y:Lng2/f;

    iput-object p3, p0, Lsg2/v$c;->z:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lsg2/v$c;

    iget-object v0, p0, Lsg2/v$c;->x:Lng2/c;

    iget-object v1, p0, Lsg2/v$c;->y:Lng2/f;

    iget-object v2, p0, Lsg2/v$c;->z:Lp1/t2;

    invoke-direct {p1, v0, v1, v2, p2}, Lsg2/v$c;-><init>(Lng2/c;Lng2/f;Lp1/t2;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lsg2/v$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsg2/v$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsg2/v$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsg2/v$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsg2/v$c;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsg2/v$c;->z:Lp1/t2;

    invoke-static {p1}, Lsg2/v;->M(Lp1/t2;)Lrg2/c;

    move-result-object p1

    invoke-virtual {p1}, Lrg2/c;->i()Z

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsg2/v$c;->x:Lng2/c;

    invoke-virtual {p1}, Lng2/c;->a()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, Lsg2/v$c;->y:Lng2/f;

    new-instance v2, Lng2/e$f;

    iget-object v3, p0, Lsg2/v$c;->x:Lng2/c;

    invoke-virtual {v3}, Lng2/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Lng2/e$f;-><init>(ZLjava/lang/String;)V

    invoke-virtual {v1, v2}, Lng2/f;->o(Lng2/e;)V

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
