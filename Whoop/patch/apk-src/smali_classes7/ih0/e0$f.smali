.class final Lih0/e0$f;
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
    c = "com.whoop.ai.chat.view.formwidget.FormWidgetItemKt$FormWidgetScreen$4$1"
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

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lah0/i;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lah0/i;Lkotlin/jvm/functions/Function1;Lih0/h0;Ljava/lang/Integer;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lah0/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lih0/h0;",
            "Ljava/lang/Integer;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lih0/e0$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lih0/e0$f;->x:Ljava/lang/String;

    iput-object p2, p0, Lih0/e0$f;->y:Lah0/i;

    iput-object p3, p0, Lih0/e0$f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lih0/e0$f;->E:Lih0/h0;

    iput-object p5, p0, Lih0/e0$f;->F:Ljava/lang/Integer;

    iput-object p6, p0, Lih0/e0$f;->G:Lp1/c1;

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

    new-instance v0, Lih0/e0$f;

    iget-object v1, p0, Lih0/e0$f;->x:Ljava/lang/String;

    iget-object v2, p0, Lih0/e0$f;->y:Lah0/i;

    iget-object v3, p0, Lih0/e0$f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lih0/e0$f;->E:Lih0/h0;

    iget-object v5, p0, Lih0/e0$f;->F:Ljava/lang/Integer;

    iget-object v6, p0, Lih0/e0$f;->G:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lih0/e0$f;-><init>(Ljava/lang/String;Lah0/i;Lkotlin/jvm/functions/Function1;Lih0/h0;Ljava/lang/Integer;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lih0/e0$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lih0/e0$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lih0/e0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lih0/e0$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lih0/e0$f;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lih0/e0$f;->G:Lp1/c1;

    invoke-static {p1}, Lih0/e0;->K1(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lih0/e0$f;->x:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lih0/e0$f;->y:Lah0/i;

    invoke-virtual {p1}, Lah0/i;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lih0/e0$f;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lih0/b$e;

    iget-object v1, p0, Lih0/e0$f;->x:Ljava/lang/String;

    iget-object v2, p0, Lih0/e0$f;->E:Lih0/h0;

    invoke-virtual {v2}, Lih0/h0;->e()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lih0/e0$f;->F:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3}, Lih0/b$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lih0/e0$f;->G:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lih0/e0;->L1(Lp1/c1;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
