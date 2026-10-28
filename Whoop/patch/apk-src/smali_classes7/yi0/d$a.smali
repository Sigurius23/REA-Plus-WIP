.class final Lyi0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyi0/d;->m(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.archv2.feature.view.template.flow.FlowTemplateScreenContentKt$FlowTemplateScreenContent$1$1"
    f = "FlowTemplateScreenContent.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lp1/a1;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp1/a1;ILjava/util/Map;Lp1/t2;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lp1/a1;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lyi0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyi0/d$a;->x:Ljava/lang/String;

    iput-object p2, p0, Lyi0/d$a;->y:Lp1/a1;

    iput p3, p0, Lyi0/d$a;->z:I

    iput-object p4, p0, Lyi0/d$a;->E:Ljava/util/Map;

    iput-object p5, p0, Lyi0/d$a;->F:Lp1/t2;

    iput-object p6, p0, Lyi0/d$a;->G:Lp1/t2;

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

    new-instance v0, Lyi0/d$a;

    iget-object v1, p0, Lyi0/d$a;->x:Ljava/lang/String;

    iget-object v2, p0, Lyi0/d$a;->y:Lp1/a1;

    iget v3, p0, Lyi0/d$a;->z:I

    iget-object v4, p0, Lyi0/d$a;->E:Ljava/util/Map;

    iget-object v5, p0, Lyi0/d$a;->F:Lp1/t2;

    iget-object v6, p0, Lyi0/d$a;->G:Lp1/t2;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lyi0/d$a;-><init>(Ljava/lang/String;Lp1/a1;ILjava/util/Map;Lp1/t2;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lyi0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyi0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyi0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyi0/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lyi0/d$a;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyi0/d$a;->x:Ljava/lang/String;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lyi0/d$a;->y:Lp1/a1;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    iget-object v1, p0, Lyi0/d$a;->y:Lp1/a1;

    iget v2, p0, Lyi0/d$a;->z:I

    check-cast v1, Lp1/h1;

    invoke-virtual {v1, v2}, Lp1/h1;->y(I)V

    iget-object v1, p0, Lyi0/d$a;->E:Ljava/util/Map;

    iget v2, p0, Lyi0/d$a;->z:I

    invoke-static {v1, p1, v2}, Lyi0/d;->I(Ljava/util/Map;II)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lyi0/d$a;->F:Lp1/t2;

    invoke-static {v1}, Lyi0/d;->z(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lri0/b$v;

    invoke-direct {v2, p1}, Lri0/b$v;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lyi0/d$a;->G:Lp1/t2;

    invoke-static {p1}, Lyi0/d;->A(Lp1/t2;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lyi0/d$a;->F:Lp1/t2;

    invoke-static {v1}, Lyi0/d;->z(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lri0/b$j;

    sget-object v3, Lyi0/b;->a:Lyi0/b;

    invoke-direct {v2, p1, v3}, Lri0/b$j;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
