.class final Lo71/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo71/c;->i(Lo71/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.heightweight.HeightWeightItemKt$HeightWeightView$2$1"
    f = "HeightWeightItem.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/a1;

.field final synthetic F:Lp1/a1;

.field w:I

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lo71/h;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/c1;Lo71/h;Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lo71/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/a1;",
            "Lp1/a1;",
            "Lq83/d<",
            "-",
            "Lo71/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo71/c$a;->x:Lp1/c1;

    iput-object p2, p0, Lo71/c$a;->y:Lo71/h;

    iput-object p3, p0, Lo71/c$a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lo71/c$a;->E:Lp1/a1;

    iput-object p5, p0, Lo71/c$a;->F:Lp1/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lo71/c$a;

    iget-object v1, p0, Lo71/c$a;->x:Lp1/c1;

    iget-object v2, p0, Lo71/c$a;->y:Lo71/h;

    iget-object v3, p0, Lo71/c$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lo71/c$a;->E:Lp1/a1;

    iget-object v5, p0, Lo71/c$a;->F:Lp1/a1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lo71/c$a;-><init>(Lp1/c1;Lo71/h;Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/a1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lo71/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo71/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo71/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo71/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lo71/c$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo71/c$a;->y:Lo71/h;

    iget-object v0, p0, Lo71/c$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lo71/c$a;->E:Lp1/a1;

    iget-object v2, p0, Lo71/c$a;->F:Lp1/a1;

    iget-object v3, p0, Lo71/c$a;->x:Lp1/c1;

    invoke-static {v3}, Lo71/c;->A(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v3}, Lo71/c;->z(Lo71/h;Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/a1;Lcom/whoop/domain/model/UnitSystem;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
