.class public final Lw00/w;
.super Lv00/p0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw00/w;->a:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    return-void
.end method


# virtual methods
.method public final l(Lv00/c0;)Lu00/f;
    .locals 11

    iget-object p1, p0, Lw00/w;->a:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getLightImageUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getDarkImageUrl()Ljava/lang/String;

    move-result-object v6

    new-instance v0, Lu00/f;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v9, 0x0

    const/16 v10, 0x302

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lu00/f;-><init>(Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;I)V

    return-object v0
.end method
