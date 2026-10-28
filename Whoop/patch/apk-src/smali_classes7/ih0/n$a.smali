.class final Lih0/n$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lih0/n;->i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
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
    c = "com.whoop.ai.chat.view.formwidget.FormWidgetInViewKt$keepFormWidgetInView$1$1"
    f = "FormWidgetInView.kt"
    l = {
        0x40
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

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Ly3/c;


# direct methods
.method public constructor <init>(Lp1/c1;Lp1/t2;Ly3/c;Lr0/a;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lp1/t2;",
            "Ly3/c;",
            "Lr0/a;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lih0/n$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lih0/n$a;->x:Lp1/c1;

    iput-object p2, p0, Lih0/n$a;->y:Lp1/t2;

    iput-object p3, p0, Lih0/n$a;->z:Ly3/c;

    iput-object p4, p0, Lih0/n$a;->E:Lr0/a;

    iput-object p5, p0, Lih0/n$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/t2;Ly3/c;)I
    .locals 0

    invoke-static {p0, p1}, Lih0/n$a;->h(Lp1/t2;Ly3/c;)I

    move-result p0

    return p0
.end method

.method private static final h(Lp1/t2;Ly3/c;)I
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll0/b2;

    invoke-interface {p0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lih0/n$a;

    iget-object v1, p0, Lih0/n$a;->x:Lp1/c1;

    iget-object v2, p0, Lih0/n$a;->y:Lp1/t2;

    iget-object v3, p0, Lih0/n$a;->z:Ly3/c;

    iget-object v4, p0, Lih0/n$a;->E:Lr0/a;

    iget-object v5, p0, Lih0/n$a;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lih0/n$a;-><init>(Lp1/c1;Lp1/t2;Ly3/c;Lr0/a;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lih0/n$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lih0/n$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lih0/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lih0/n$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lih0/n$a;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lih0/n$a;->x:Lp1/c1;

    invoke-static {p1}, Lih0/n;->e(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lih0/n$a;->y:Lp1/t2;

    iget-object v1, p0, Lih0/n$a;->z:Ly3/c;

    new-instance v4, Lih0/m;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p1, v1}, Lih0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lih0/n$a$a;

    iget-object v4, p0, Lih0/n$a;->E:Lr0/a;

    iget-object v5, p0, Lih0/n$a;->F:Lp1/c1;

    const/4 v6, 0x0

    invoke-direct {v1, v4, v5, v6}, Lih0/n$a$a;-><init>(Lr0/a;Lp1/c1;Lq83/d;)V

    iput v3, p0, Lih0/n$a;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    return-object v2
.end method
