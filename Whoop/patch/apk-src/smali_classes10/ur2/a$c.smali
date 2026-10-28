.class final Lur2/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur2/a;->n(Landroid/content/Context;)V
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
    c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1"
    f = "LocalLogExporter.kt"
    l = {
        0x43,
        0x59,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lur2/a;

.field final synthetic F:Landroid/content/Context;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lur2/a;Landroid/content/Context;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur2/a;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lur2/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur2/a$c;->E:Lur2/a;

    iput-object p2, p0, Lur2/a$c;->F:Landroid/content/Context;

    iput-object p3, p0, Lur2/a$c;->G:Ljava/lang/String;

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

    new-instance p1, Lur2/a$c;

    iget-object v0, p0, Lur2/a$c;->E:Lur2/a;

    iget-object v1, p0, Lur2/a$c;->F:Landroid/content/Context;

    iget-object v2, p0, Lur2/a$c;->G:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lur2/a$c;-><init>(Lur2/a;Landroid/content/Context;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lur2/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur2/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur2/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur2/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lur2/a$c;->z:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v0, p0, Lur2/a$c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v0, p0, Lur2/a$c;->w:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Toast;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v1, p0, Lur2/a$c;->y:I

    iget-object v4, p0, Lur2/a$c;->x:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/g0;

    iget-object v6, p0, Lur2/a$c;->w:Ljava/lang/Object;

    check-cast v6, Landroid/widget/Toast;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v4

    :goto_0
    move-object v11, v6

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->l(Lur2/a;)Lcom/whoop/ui/n;

    move-result-object p1

    iget-object v1, p0, Lur2/a$c;->F:Landroid/content/Context;

    sget v6, Luv0/c;->I:I

    invoke-interface {p1, v1, v6, v4}, Lcom/whoop/ui/n;->a(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v6

    invoke-virtual {v6}, Landroid/widget/Toast;->show()V

    new-instance v10, Lkotlin/jvm/internal/g0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->c(Lur2/a;)Ljs0/c;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/repositories/MaxLogLinesToExportLocally;->INSTANCE:Lcom/whoop/data/repositories/MaxLogLinesToExportLocally;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v9, Ljava/lang/Integer;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_1

    :cond_4
    move-object p1, v5

    goto/16 :goto_1

    :cond_5
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_6
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :cond_7
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    goto :goto_1

    :cond_8
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_9
    const-class v11, Ljava/lang/String;

    invoke-virtual {v8, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {p1, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_a
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_b

    goto :goto_2

    :cond_b
    move-object v1, p1

    :goto_2
    if-eqz v1, :cond_f

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v9

    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->f(Lur2/a;)Lq83/j;

    move-result-object p1

    new-instance v7, Lur2/a$c$a;

    iget-object v8, p0, Lur2/a$c;->E:Lur2/a;

    iget-object v11, p0, Lur2/a$c;->F:Landroid/content/Context;

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v12}, Lur2/a$c$a;-><init>(Lur2/a;ILkotlin/jvm/internal/g0;Landroid/content/Context;Lq83/d;)V

    iput-object v6, p0, Lur2/a$c;->w:Ljava/lang/Object;

    iput-object v10, p0, Lur2/a$c;->x:Ljava/lang/Object;

    iput v9, p0, Lur2/a$c;->y:I

    iput v4, p0, Lur2/a$c;->z:I

    invoke-static {p1, v7, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_4

    :cond_c
    move v1, v9

    goto/16 :goto_0

    :goto_3
    iget-object p1, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p1, :cond_d

    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->j(Lur2/a;)Lq83/j;

    move-result-object p1

    new-instance v2, Lur2/a$c$b;

    iget-object v4, p0, Lur2/a$c;->E:Lur2/a;

    iget-object v6, p0, Lur2/a$c;->F:Landroid/content/Context;

    invoke-direct {v2, v4, v6, v5}, Lur2/a$c$b;-><init>(Lur2/a;Landroid/content/Context;Lq83/d;)V

    iput-object v5, p0, Lur2/a$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lur2/a$c;->x:Ljava/lang/Object;

    iput v1, p0, Lur2/a$c;->y:I

    iput v3, p0, Lur2/a$c;->z:I

    invoke-static {p1, v2, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_4

    :cond_d
    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->j(Lur2/a;)Lq83/j;

    move-result-object p1

    new-instance v6, Lur2/a$c$c;

    iget-object v7, p0, Lur2/a$c;->E:Lur2/a;

    iget-object v8, p0, Lur2/a$c;->F:Landroid/content/Context;

    iget-object v9, p0, Lur2/a$c;->G:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lur2/a$c$c;-><init>(Lur2/a;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/internal/g0;Landroid/widget/Toast;Lq83/d;)V

    iput-object v5, p0, Lur2/a$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lur2/a$c;->x:Ljava/lang/Object;

    iput v1, p0, Lur2/a$c;->y:I

    iput v2, p0, Lur2/a$c;->z:I

    invoke-static {p1, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    :goto_4
    return-object v0

    :cond_e
    :goto_5
    iget-object p1, p0, Lur2/a$c;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->g(Lur2/a;)Ls03/a;

    move-result-object p1

    invoke-virtual {p1}, Ls03/a;->e()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
