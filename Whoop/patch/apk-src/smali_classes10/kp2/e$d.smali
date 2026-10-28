.class final Lkp2/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkp2/e;->D(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lec3/m;",
        "Lpm0/a;",
        "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$loadShippingAddressCache$1"
    f = "ShippingAddressInteractor.kt"
    l = {
        0x1c0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lkp2/e;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lkp2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lkp2/e;",
            "Lq83/d<",
            "-",
            "Lkp2/e$d;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lkp2/e$d;->z:Z

    iput-object p2, p0, Lkp2/e$d;->E:Ljava/lang/String;

    iput-object p3, p0, Lkp2/e$d;->F:Lkp2/e;

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

    new-instance v0, Lkp2/e$d;

    iget-boolean v1, p0, Lkp2/e$d;->z:Z

    iget-object v2, p0, Lkp2/e$d;->E:Ljava/lang/String;

    iget-object v3, p0, Lkp2/e$d;->F:Lkp2/e;

    invoke-direct {v0, v1, v2, v3, p2}, Lkp2/e$d;-><init>(ZLjava/lang/String;Lkp2/e;Lq83/d;)V

    iput-object p1, v0, Lkp2/e$d;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkp2/e$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkp2/e$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkp2/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkp2/e$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lkp2/e$d;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkp2/e$d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lkp2/e$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lkp2/e$d;->z:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lkp2/e$d;->E:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "shipping-address-"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    new-instance v4, Lcom/whoop/universalcheckout/features/shippingaddress/domain/GetShippingAddressRequest;

    iget-object v5, p0, Lkp2/e$d;->E:Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/GetShippingAddressRequest;-><init>(Ljava/lang/String;)V

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v4, "ShippingAddressRefreshScope"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-static {v5, v4, p1}, Lsm0/a;->a(Lec3/l;Ljava/util/Set;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    iget-object v4, p0, Lkp2/e$d;->F:Lkp2/e;

    invoke-static {v4}, Lkp2/e;->d(Lkp2/e;)Lnm0/e;

    move-result-object v4

    new-instance v5, Lkp2/e$d$a;

    invoke-direct {v5, v2, v4}, Lkp2/e$d$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iput-object v2, p0, Lkp2/e$d;->y:Ljava/lang/Object;

    iput-object v2, p0, Lkp2/e$d;->w:Ljava/lang/Object;

    iput v3, p0, Lkp2/e$d;->x:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
