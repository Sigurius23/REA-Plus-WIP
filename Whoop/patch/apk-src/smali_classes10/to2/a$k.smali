.class final synthetic Lto2/a$k;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto2/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "handlePaymentOptionChanged(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lpo2/b;

    const-string v5, "handlePaymentOptionChanged"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lq20/e;)V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpo2/b;

    invoke-virtual {v0, p1}, Lpo2/b;->p(Lq20/e;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq20/e;

    invoke-virtual {p0, p1}, Lto2/a$k;->a(Lq20/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
