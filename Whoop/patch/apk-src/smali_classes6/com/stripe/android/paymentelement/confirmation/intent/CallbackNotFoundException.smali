.class public final Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final F:Lzy/c;

.field public final G:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzy/c;Ljava/lang/String;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v3, 0xf

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    iput-object p2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;->F:Lzy/c;

    iput-object p3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;->G:Ljava/lang/String;

    return-object v0
.end method
