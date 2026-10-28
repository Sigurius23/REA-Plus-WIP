.class final Lih0/e0$e;
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
    c = "com.whoop.ai.chat.view.formwidget.FormWidgetItemKt$FormWidgetScreen$3$1"
    f = "FormWidgetItem.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lah0/i;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lah0/h;


# direct methods
.method public constructor <init>(Lah0/i;Lkotlin/jvm/functions/Function1;Lah0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lah0/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lah0/h;",
            "Lq83/d<",
            "-",
            "Lih0/e0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lih0/e0$e;->x:Lah0/i;

    iput-object p2, p0, Lih0/e0$e;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lih0/e0$e;->z:Lah0/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lah0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lih0/e0$e;->h(Lah0/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lah0/h;)Ll83/a0;
    .locals 1

    sget-object v0, Lah0/g$b;->a:Lah0/g$b;

    invoke-virtual {p0, v0}, Lah0/h;->n(Lah0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance p1, Lih0/e0$e;

    iget-object v0, p0, Lih0/e0$e;->x:Lah0/i;

    iget-object v1, p0, Lih0/e0$e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lih0/e0$e;->z:Lah0/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lih0/e0$e;-><init>(Lah0/i;Lkotlin/jvm/functions/Function1;Lah0/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lih0/e0$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lih0/e0$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lih0/e0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lih0/e0$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lih0/e0$e;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lih0/e0$e;->x:Lah0/i;

    invoke-virtual {p1}, Lah0/i;->f()Lcom/whoop/ai/chat/domain/formwidget/i;

    move-result-object p1

    iget-object v0, p0, Lih0/e0$e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lih0/e0$e;->z:Lah0/h;

    new-instance v2, Lih0/g0;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lih0/g0;-><init>(Lah0/h;I)V

    invoke-static {p1, v0, v2}, Lih0/e0;->P1(Lcom/whoop/ai/chat/domain/formwidget/i;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
