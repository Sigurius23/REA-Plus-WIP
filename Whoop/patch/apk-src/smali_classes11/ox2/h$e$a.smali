.class final Lox2/h$e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lox2/h$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lmx2/d;",
        "effect",
        "Ll83/a0;",
        "<anonymous>",
        "(Lmx2/d;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaigndetails.view.CampaignDetailsScreenKt$CampaignDetailsScreen$1$1$1"
    f = "CampaignDetailsScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg1/y3;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lg1/y3;",
            "Lq83/d<",
            "-",
            "Lox2/h$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lox2/h$e$a;->y:Lbc3/c0;

    iput-object p2, p0, Lox2/h$e$a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lox2/h$e$a;->E:Lg1/y3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lox2/h$e$a;

    iget-object v1, p0, Lox2/h$e$a;->y:Lbc3/c0;

    iget-object v2, p0, Lox2/h$e$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lox2/h$e$a;->E:Lg1/y3;

    invoke-direct {v0, v1, v2, v3, p2}, Lox2/h$e$a;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lq83/d;)V

    iput-object p1, v0, Lox2/h$e$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lmx2/d;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx2/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lox2/h$e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lox2/h$e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lox2/h$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmx2/d;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lox2/h$e$a;->f(Lmx2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lox2/h$e$a;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lox2/h$e$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lmx2/d$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lox2/h$e$a;->y:Lbc3/c0;

    new-instance v0, Lox2/h$e$a$a;

    iget-object v1, p0, Lox2/h$e$a;->E:Lg1/y3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lox2/h$e$a$a;-><init>(Lg1/y3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    instance-of p1, v0, Lmx2/d$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lox2/h$e$a;->z:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$g;->a:Lcom/whoop/whooplabs/feature/navigation/c$g;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
