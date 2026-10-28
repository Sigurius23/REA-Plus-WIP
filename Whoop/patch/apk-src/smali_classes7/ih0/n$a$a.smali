.class final Lih0/n$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lih0/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "imeBottomPx",
        "Ll83/a0;",
        "<anonymous>",
        "(I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.view.formwidget.FormWidgetInViewKt$keepFormWidgetInView$1$1$2"
    f = "FormWidgetInView.kt"
    l = {
        0x42,
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lr0/a;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:I


# direct methods
.method public constructor <init>(Lr0/a;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/a;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lih0/n$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lih0/n$a$a;->E:Lr0/a;

    iput-object p2, p0, Lih0/n$a$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lih0/n$a$a;

    iget-object v1, p0, Lih0/n$a$a;->E:Lr0/a;

    iget-object v2, p0, Lih0/n$a$a;->F:Lp1/c1;

    invoke-direct {v0, v1, v2, p2}, Lih0/n$a$a;-><init>(Lr0/a;Lp1/c1;Lq83/d;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Lih0/n$a$a;->z:I

    return-object v0
.end method

.method public final invoke(ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lih0/n$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lih0/n$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lih0/n$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lih0/n$a$a;->invoke(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lih0/n$a$a;->z:I

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lih0/n$a$a;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lih0/n$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lh2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lih0/n$a$a;->E:Lr0/a;

    iput v0, p0, Lih0/n$a$a;->z:I

    iput v5, p0, Lih0/n$a$a;->y:I

    invoke-static {p1, p0}, Lr0/a;->a(Lr0/a;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lih0/n$a$a;->F:Lp1/c1;

    invoke-static {p1}, Lih0/n;->f(Lp1/c1;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lih0/n;->g(J)Lh2/c;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v2, p0, Lih0/n$a$a;->E:Lr0/a;

    const/4 v5, 0x0

    iput-object v5, p0, Lih0/n$a$a;->x:Ljava/lang/Object;

    iput v0, p0, Lih0/n$a$a;->z:I

    const/4 v0, 0x0

    iput v0, p0, Lih0/n$a$a;->w:I

    iput v4, p0, Lih0/n$a$a;->y:I

    check-cast v2, Lr0/c;

    invoke-virtual {v2, p1, p0}, Lr0/c;->b(Lh2/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    :goto_2
    return-object v3
.end method
