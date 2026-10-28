.class final Lsg2/v$b;
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
    c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$3$1"
    f = "PreSessionWidget.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lng2/f;

.field final synthetic y:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lng2/f;Lh/i;Landroid/content/Context;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng2/f;",
            "Lh/i;",
            "Landroid/content/Context;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lsg2/v$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg2/v$b;->x:Lng2/f;

    iput-object p2, p0, Lsg2/v$b;->y:Lh/i;

    iput-object p3, p0, Lsg2/v$b;->z:Landroid/content/Context;

    iput-object p4, p0, Lsg2/v$b;->E:Lp1/t2;

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

    new-instance v0, Lsg2/v$b;

    iget-object v1, p0, Lsg2/v$b;->x:Lng2/f;

    iget-object v2, p0, Lsg2/v$b;->y:Lh/i;

    iget-object v3, p0, Lsg2/v$b;->z:Landroid/content/Context;

    iget-object v4, p0, Lsg2/v$b;->E:Lp1/t2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsg2/v$b;-><init>(Lng2/f;Lh/i;Landroid/content/Context;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsg2/v$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsg2/v$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsg2/v$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsg2/v$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsg2/v$b;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsg2/v$b;->E:Lp1/t2;

    invoke-static {p1}, Lsg2/v;->M(Lp1/t2;)Lrg2/c;

    move-result-object p1

    invoke-virtual {p1}, Lrg2/c;->e()Lgi1/a;

    move-result-object p1

    instance-of v0, p1, Lgi1/a$b;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsg2/v$b;->x:Lng2/f;

    sget-object v0, Lng2/e$d;->a:Lng2/e$d;

    invoke-virtual {p1, v0}, Lng2/f;->o(Lng2/e;)V

    iget-object p1, p0, Lsg2/v$b;->y:Lh/i;

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lgi1/a$a;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lsg2/v$b;->x:Lng2/f;

    sget-object v0, Lng2/e$c;->a:Lng2/e$c;

    invoke-virtual {p1, v0}, Lng2/f;->o(Lng2/e;)V

    iget-object p1, p0, Lsg2/v$b;->z:Landroid/content/Context;

    invoke-static {p1}, Lsg2/v;->N(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
