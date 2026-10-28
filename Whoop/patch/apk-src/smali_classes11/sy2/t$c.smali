.class final Lsy2/t$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsy2/t;->t(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$TypeFormWebView$2$1"
    f = "TypeformStepScreen.kt"
    l = {
        0x8f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
            "Lq83/d<",
            "-",
            "Lsy2/t$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsy2/t$c;->y:Lp1/c1;

    iput-object p2, p0, Lsy2/t$c;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsy2/t$c;->E:Lp1/c1;

    iput-object p4, p0, Lsy2/t$c;->F:Lp1/c1;

    iput-object p5, p0, Lsy2/t$c;->G:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lsy2/t$c;->H:Ljava/lang/String;

    iput-object p7, p0, Lsy2/t$c;->I:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lsy2/t$c;

    iget-object v1, p0, Lsy2/t$c;->y:Lp1/c1;

    iget-object v2, p0, Lsy2/t$c;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsy2/t$c;->E:Lp1/c1;

    iget-object v4, p0, Lsy2/t$c;->F:Lp1/c1;

    iget-object v5, p0, Lsy2/t$c;->G:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lsy2/t$c;->H:Ljava/lang/String;

    iget-object v7, p0, Lsy2/t$c;->I:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lsy2/t$c;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lq83/d;)V

    iput-object p1, v0, Lsy2/t$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lsy2/t$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsy2/t$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsy2/t$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsy2/t$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lsy2/t$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lsy2/t$c;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsy2/t$c;->y:Lp1/c1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lsy2/t$c;->z:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lsy2/t$c;->E:Lp1/c1;

    invoke-interface {p1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lsy2/t$c;->F:Lp1/c1;

    invoke-interface {p1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p1, Lsy2/t$c$a;

    iget-object v2, p0, Lsy2/t$c;->y:Lp1/c1;

    const/4 v4, 0x0

    invoke-direct {p1, v2, v4}, Lsy2/t$c$a;-><init>(Lp1/c1;Lq83/d;)V

    iput-object v0, p0, Lsy2/t$c;->x:Ljava/lang/Object;

    iput v3, p0, Lsy2/t$c;->w:I

    const-wide/16 v2, 0x2710

    invoke-static {v2, v3, p1, p0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_3

    iget-object p1, p0, Lsy2/t$c;->E:Lp1/c1;

    iget-object v0, p0, Lsy2/t$c;->y:Lp1/c1;

    iget-object v1, p0, Lsy2/t$c;->G:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lsy2/t$c;->H:Ljava/lang/String;

    iget-object v3, p0, Lsy2/t$c;->F:Lp1/c1;

    iget-object v4, p0, Lsy2/t$c;->I:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Lny2/a$l;

    const-string v0, "("

    const-string v5, "): timeout"

    invoke-static {v0, v2, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-direct {p1, v0, v2, v4}, Lny2/a$l;-><init>(Ljava/lang/String;ZLcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
