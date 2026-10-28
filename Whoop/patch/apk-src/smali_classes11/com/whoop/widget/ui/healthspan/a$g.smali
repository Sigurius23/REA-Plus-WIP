.class final Lcom/whoop/widget/ui/healthspan/a$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/ui/healthspan/a;->f(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "preferences",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter$writeContent$2$1"
    f = "HealthspanWidgetStateWriter.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/widget/ui/healthspan/a;

.field final synthetic z:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/ui/healthspan/a;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/ui/healthspan/a;",
            "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/ui/healthspan/a$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/ui/healthspan/a$g;->y:Lcom/whoop/widget/ui/healthspan/a;

    iput-object p2, p0, Lcom/whoop/widget/ui/healthspan/a$g;->z:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

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

    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$g;

    iget-object v1, p0, Lcom/whoop/widget/ui/healthspan/a$g;->y:Lcom/whoop/widget/ui/healthspan/a;

    iget-object v2, p0, Lcom/whoop/widget/ui/healthspan/a$g;->z:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/widget/ui/healthspan/a$g;-><init>(Lcom/whoop/widget/ui/healthspan/a;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$g;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/ui/healthspan/a$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/widget/ui/healthspan/a$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/widget/ui/healthspan/a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/ui/healthspan/a$g;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/widget/ui/healthspan/a$g;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/widget/ui/healthspan/a$g;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/widget/ui/healthspan/a$g;->y:Lcom/whoop/widget/ui/healthspan/a;

    invoke-static {p1}, Lcom/whoop/widget/ui/healthspan/a;->a(Lcom/whoop/widget/ui/healthspan/a;)Lad3/c;

    move-result-object p1

    sget-object v1, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->Companion:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;

    invoke-virtual {v1}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/widget/ui/healthspan/a$g;->z:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    invoke-virtual {p1, v1, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "WIDGET_KEY_HEALTHSPAN_VIEW_STATE"

    invoke-static {v1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
