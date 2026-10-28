.class final Lih0/e0$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lih0/e0;->b1(Landroidx/compose/ui/Modifier;Lih0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.ai.chat.view.formwidget.FormWidgetItemKt$FormWidgetScreen$5$1"
    f = "FormWidgetItem.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lih0/h0;

.field final synthetic F:Ljava/lang/Integer;

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lah0/i;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lah0/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lih0/h0;Ljava/lang/Integer;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lah0/i;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lih0/h0;",
            "Ljava/lang/Integer;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lih0/e0$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lih0/e0$g;->x:Lah0/i;

    iput-object p2, p0, Lih0/e0$g;->y:Ljava/lang/String;

    iput-object p3, p0, Lih0/e0$g;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lih0/e0$g;->E:Lih0/h0;

    iput-object p5, p0, Lih0/e0$g;->F:Ljava/lang/Integer;

    iput-object p6, p0, Lih0/e0$g;->G:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lih0/e0$g;

    iget-object v1, p0, Lih0/e0$g;->x:Lah0/i;

    iget-object v2, p0, Lih0/e0$g;->y:Ljava/lang/String;

    iget-object v3, p0, Lih0/e0$g;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lih0/e0$g;->E:Lih0/h0;

    iget-object v5, p0, Lih0/e0$g;->F:Ljava/lang/Integer;

    iget-object v6, p0, Lih0/e0$g;->G:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lih0/e0$g;-><init>(Lah0/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lih0/h0;Ljava/lang/Integer;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lih0/e0$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lih0/e0$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lih0/e0$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lih0/e0$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lih0/e0$g;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lih0/e0$g;->x:Lah0/i;

    invoke-virtual {p1}, Lah0/i;->h()Lah0/e;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lih0/e0$g;->G:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lih0/e0;->J1(Lp1/c1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lih0/e0$g;->y:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lah0/e;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lih0/e0$g;->G:Lp1/c1;

    invoke-static {v1}, Lih0/e0;->I1(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lih0/e0$g;->z:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lih0/b$b;

    iget-object v2, p0, Lih0/e0$g;->y:Ljava/lang/String;

    iget-object v3, p0, Lih0/e0$g;->E:Lih0/h0;

    invoke-virtual {v3}, Lih0/h0;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lih0/e0$g;->F:Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v4, p1}, Lih0/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lah0/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lih0/e0$g;->G:Lp1/c1;

    invoke-virtual {p1}, Lah0/e;->getAnalyticsValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lih0/e0;->J1(Lp1/c1;Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
