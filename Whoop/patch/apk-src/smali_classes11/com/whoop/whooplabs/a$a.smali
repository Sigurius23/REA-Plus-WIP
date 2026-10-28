.class final Lcom/whoop/whooplabs/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/a;->c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/whooplabs/WhoopLabsService;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/whooplabs/WhoopLabsService;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.WhoopLabsServiceConnector$connectService$3"
    f = "WhoopLabsServiceConnector.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/whooplabs/a;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/a$a;->E:Lcom/whoop/whooplabs/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/whooplabs/a$a;

    iget-object v1, p0, Lcom/whoop/whooplabs/a$a;->E:Lcom/whoop/whooplabs/a;

    invoke-direct {v0, v1, p2}, Lcom/whoop/whooplabs/a$a;-><init>(Lcom/whoop/whooplabs/a;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/whooplabs/a$a;->z:Ljava/lang/Object;

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
            "Lcom/whoop/whooplabs/WhoopLabsService;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whooplabs/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/whooplabs/a$a;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/whooplabs/a$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplabs/a$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/a$a;->E:Lcom/whoop/whooplabs/a;

    iput-object v0, p0, Lcom/whoop/whooplabs/a$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/whooplabs/a$a;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, p0, Lcom/whoop/whooplabs/a$a;->x:I

    iput v3, p0, Lcom/whoop/whooplabs/a$a;->y:I

    new-instance v2, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    new-instance v4, Lcom/whoop/whooplabs/a$a$b;

    invoke-direct {v4, p1, v0, v2}, Lcom/whoop/whooplabs/a$a$b;-><init>(Lcom/whoop/whooplabs/a;Lbc3/c0;Lbc3/k;)V

    new-instance v0, Lcom/whoop/whooplabs/a$a$a;

    invoke-direct {v0, p1, v4}, Lcom/whoop/whooplabs/a$a$a;-><init>(Lcom/whoop/whooplabs/a;Lcom/whoop/whooplabs/a$a$b;)V

    invoke-virtual {v2, v0}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Lcom/whoop/whooplabs/a;->a(Lcom/whoop/whooplabs/a;)Landroid/content/Context;

    move-result-object v5

    const-class v6, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p1}, Lcom/whoop/whooplabs/a;->a(Lcom/whoop/whooplabs/a;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0, v4, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    return-object p1
.end method
