.class final Lnc0/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc0/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lnc0/c;",
        "previousState",
        "Lnc0/e;",
        "action",
        "<anonymous>",
        "(Lnc0/c;Lnc0/e;)Lnc0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$2"
    f = "MarketingConsentInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lnc0/d;


# direct methods
.method public constructor <init>(Lnc0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc0/d;",
            "Lq83/d<",
            "-",
            "Lnc0/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnc0/d$i;->z:Lnc0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lnc0/c;Lnc0/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc0/c;",
            "Lnc0/e;",
            "Lq83/d<",
            "-",
            "Lnc0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lnc0/d$i;

    iget-object v1, p0, Lnc0/d$i;->z:Lnc0/d;

    invoke-direct {v0, v1, p3}, Lnc0/d$i;-><init>(Lnc0/d;Lq83/d;)V

    iput-object p1, v0, Lnc0/d$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnc0/d$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lnc0/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc0/c;

    check-cast p2, Lnc0/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lnc0/d$i;->f(Lnc0/c;Lnc0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lnc0/d$i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnc0/c;

    iget-object v0, p0, Lnc0/d$i;->y:Ljava/lang/Object;

    check-cast v0, Lnc0/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lnc0/d$i;->w:I

    if-nez v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lnc0/e$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnc0/d$i;->z:Lnc0/d;

    check-cast v0, Lnc0/e$a;

    invoke-virtual {v0}, Lnc0/e$a;->a()Lnc0/b;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lnc0/d;->f(Lnc0/d;Lnc0/c;Lnc0/b;)Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lnc0/e$b;

    if-eqz p1, :cond_1

    check-cast v0, Lnc0/e$b;

    invoke-virtual {v0}, Lnc0/e$b;->a()Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lnc0/e$c;

    if-eqz p1, :cond_2

    check-cast v0, Lnc0/e$c;

    invoke-virtual {v0}, Lnc0/e$c;->a()Lnc0/a;

    move-result-object v2

    const/16 v10, 0xfe

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lnc0/c;->b(Lnc0/c;Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILjava/lang/Object;)Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lnc0/e$d;

    if-eqz p1, :cond_3

    check-cast v0, Lnc0/e$d;

    invoke-virtual {v0}, Lnc0/e$d;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    const/16 v10, 0xdf

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lnc0/c;->b(Lnc0/c;Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILjava/lang/Object;)Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lnc0/e$f;

    if-eqz p1, :cond_4

    check-cast v0, Lnc0/e$f;

    invoke-virtual {v0}, Lnc0/e$f;->a()Z

    move-result v8

    const/16 v10, 0xbf

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lnc0/c;->b(Lnc0/c;Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILjava/lang/Object;)Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lnc0/e$e;

    if-eqz p1, :cond_5

    check-cast v0, Lnc0/e$e;

    invoke-virtual {v0}, Lnc0/e$e;->a()Lnc0/f;

    move-result-object v9

    const/16 v10, 0x7e

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v11}, Lnc0/c;->b(Lnc0/c;Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILjava/lang/Object;)Lnc0/c;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
