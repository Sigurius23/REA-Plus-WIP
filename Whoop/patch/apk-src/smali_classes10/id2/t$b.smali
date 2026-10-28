.class final Lid2/t$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid2/t;->E(Lhd2/d;Lc93/a;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.share.view.WhoopShareSheetKt$ShareSheetInnerContent$2$1$3$1$1"
    f = "WhoopShareSheet.kt"
    l = {
        0xf9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lhd2/d$a;

.field final synthetic F:Landroid/content/Context;

.field final synthetic G:Lbd2/a;

.field final synthetic H:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic I:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lid2/d;

.field final synthetic y:Lid2/j;

.field final synthetic z:Lhd2/d$b;


# direct methods
.method public constructor <init>(Lid2/d;Lid2/j;Lhd2/d$b;Lhd2/d$a;Landroid/content/Context;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lid2/d;",
            "Lid2/j;",
            "Lhd2/d$b;",
            "Lhd2/d$a;",
            "Landroid/content/Context;",
            "Lbd2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lid2/t$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lid2/t$b;->x:Lid2/d;

    iput-object p2, p0, Lid2/t$b;->y:Lid2/j;

    iput-object p3, p0, Lid2/t$b;->z:Lhd2/d$b;

    iput-object p4, p0, Lid2/t$b;->E:Lhd2/d$a;

    iput-object p5, p0, Lid2/t$b;->F:Landroid/content/Context;

    iput-object p6, p0, Lid2/t$b;->G:Lbd2/a;

    iput-object p7, p0, Lid2/t$b;->H:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lid2/t$b;->I:Lc93/m;

    iput-object p9, p0, Lid2/t$b;->J:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11
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

    new-instance v0, Lid2/t$b;

    iget-object v1, p0, Lid2/t$b;->x:Lid2/d;

    iget-object v2, p0, Lid2/t$b;->y:Lid2/j;

    iget-object v3, p0, Lid2/t$b;->z:Lhd2/d$b;

    iget-object v4, p0, Lid2/t$b;->E:Lhd2/d$a;

    iget-object v5, p0, Lid2/t$b;->F:Landroid/content/Context;

    iget-object v6, p0, Lid2/t$b;->G:Lbd2/a;

    iget-object v7, p0, Lid2/t$b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lid2/t$b;->I:Lc93/m;

    iget-object v9, p0, Lid2/t$b;->J:Lp1/c1;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lid2/t$b;-><init>(Lid2/d;Lid2/j;Lhd2/d$b;Lhd2/d$a;Landroid/content/Context;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lid2/t$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lid2/t$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lid2/t$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lid2/t$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lid2/t$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lid2/t$b;->x:Lid2/d;

    move p1, v2

    iget-object v2, p0, Lid2/t$b;->y:Lid2/j;

    iget-object v3, p0, Lid2/t$b;->z:Lhd2/d$b;

    iget-object v4, p0, Lid2/t$b;->E:Lhd2/d$a;

    iget-object v5, p0, Lid2/t$b;->J:Lp1/c1;

    invoke-static {v5}, Lid2/t;->a0(Lp1/c1;)Z

    move-result v5

    iget-object v6, p0, Lid2/t$b;->F:Landroid/content/Context;

    iget-object v7, p0, Lid2/t$b;->G:Lbd2/a;

    iget-object v8, p0, Lid2/t$b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lid2/t$b;->I:Lc93/m;

    iput p1, p0, Lid2/t$b;->w:I

    move-object v10, p0

    invoke-static/range {v1 .. v10}, Lid2/t;->e0(Lid2/d;Lid2/j;Lhd2/d$b;Lhd2/d$a;ZLandroid/content/Context;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
