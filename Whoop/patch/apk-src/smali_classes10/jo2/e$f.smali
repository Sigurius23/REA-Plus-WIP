.class final Ljo2/e$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e;->j(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;)Ljava/lang/Long;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$configureStripe$1"
    f = "StripeFlowControllerManager.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

.field final synthetic F:Ljava/lang/String;

.field w:I

.field final synthetic x:Ljo2/e;

.field final synthetic y:J

.field final synthetic z:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;


# direct methods
.method public constructor <init>(Ljo2/e;JLcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljo2/e;",
            "J",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljo2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljo2/e$f;->x:Ljo2/e;

    iput-wide p2, p0, Ljo2/e$f;->y:J

    iput-object p4, p0, Ljo2/e$f;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iput-object p5, p0, Ljo2/e$f;->E:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iput-object p6, p0, Ljo2/e$f;->F:Ljava/lang/String;

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

    new-instance v0, Ljo2/e$f;

    iget-object v1, p0, Ljo2/e$f;->x:Ljo2/e;

    iget-wide v2, p0, Ljo2/e$f;->y:J

    iget-object v4, p0, Ljo2/e$f;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iget-object v5, p0, Ljo2/e$f;->E:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iget-object v6, p0, Ljo2/e$f;->F:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ljo2/e$f;-><init>(Ljo2/e;JLcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ljo2/e$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljo2/e$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljo2/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljo2/e$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ljo2/e$f;->w:I

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

    iget-object v1, p0, Ljo2/e$f;->x:Ljo2/e;

    move p1, v2

    iget-wide v2, p0, Ljo2/e$f;->y:J

    iget-object v4, p0, Ljo2/e$f;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iget-object v5, p0, Ljo2/e$f;->E:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iget-object v6, p0, Ljo2/e$f;->F:Ljava/lang/String;

    iput p1, p0, Ljo2/e$f;->w:I

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Ljo2/e;->b(Ljo2/e;JLcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
