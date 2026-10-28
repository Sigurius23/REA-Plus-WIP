.class final Lui0/n$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/n;->n(Lqi0/d;Lqi0/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$4$1"
    f = "GenericScreen.kt"
    l = {
        0x58
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/m;Lp1/t2;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lp1/t2;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lui0/n$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lui0/n$i;->y:Lc93/m;

    iput-object p2, p0, Lui0/n$i;->z:Lp1/t2;

    iput-object p3, p0, Lui0/n$i;->E:Ll83/h;

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

    new-instance p1, Lui0/n$i;

    iget-object v0, p0, Lui0/n$i;->y:Lc93/m;

    iget-object v1, p0, Lui0/n$i;->z:Lp1/t2;

    iget-object v2, p0, Lui0/n$i;->E:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lui0/n$i;-><init>(Lc93/m;Lp1/t2;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lui0/n$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui0/n$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui0/n$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui0/n$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lui0/n$i;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lui0/n$i;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/feature/domain/q;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lui0/n$i;->z:Lp1/t2;

    invoke-static {p1}, Lui0/n;->J(Lp1/t2;)Lri0/e;

    move-result-object p1

    invoke-virtual {p1}, Lri0/e;->n()Lcom/whoop/archv2/feature/domain/q;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    iget-object v1, p0, Lui0/n$i;->y:Lc93/m;

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/q;->b()Lcom/whoop/whoopaction/domain/models/PermissionType;

    move-result-object v4

    iput-object p1, p0, Lui0/n$i;->w:Ljava/lang/Object;

    iput v3, p0, Lui0/n$i;->x:I

    invoke-interface {v1, v4, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_0
    iget-object p1, p0, Lui0/n$i;->E:Ll83/h;

    invoke-static {p1}, Lui0/n;->I(Ll83/h;)Lri0/c;

    move-result-object p1

    sget-object v1, Lri0/b$d;->a:Lri0/b$d;

    invoke-virtual {p1, v1}, Lri0/c;->r(Lri0/b$w;)V

    invoke-virtual {v0}, Lcom/whoop/archv2/feature/domain/q;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lui0/n$i;->E:Ll83/h;

    invoke-static {v0}, Lui0/n;->I(Ll83/h;)Lri0/c;

    move-result-object v0

    new-instance v1, Lri0/b$r;

    invoke-direct {v1, p1}, Lri0/b$r;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {v0, v1}, Lri0/c;->r(Lri0/b$w;)V

    :cond_4
    return-object v2
.end method
