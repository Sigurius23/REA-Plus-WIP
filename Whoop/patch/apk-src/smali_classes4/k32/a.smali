.class public final Lk32/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lk32/a;",
        "",
        "<init>",
        "()V",
        "Li32/b;",
        "state",
        "Lj32/k;",
        "a",
        "(Li32/b;)Lj32/k;",
        "payments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li32/b;)Lj32/k;
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li32/b;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lj32/k$a;

    invoke-direct {p1, v0}, Lj32/k$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Li32/b;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lj32/k$c;->a:Lj32/k$c;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Li32/b;->g()Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p1, Lj32/k$a;

    const-string v0, "StripePaymentSheetTile not loaded"

    invoke-direct {p1, v0}, Lj32/k$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-virtual {p1}, Li32/b;->e()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    move-result-object v2

    if-eqz v2, :cond_4

    const/16 v6, 0x1d

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->copy$default(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;ZILjava/lang/Object;)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_0
    new-instance v1, Lj32/k$b;

    invoke-virtual {p1}, Li32/b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lc32/a;->d(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Ljava/lang/String;)Lg32/l;

    move-result-object v0

    invoke-virtual {p1}, Li32/b;->d()Z

    move-result p1

    invoke-direct {v1, v0, p1}, Lj32/k$b;-><init>(Lg32/l;Z)V

    return-object v1
.end method
