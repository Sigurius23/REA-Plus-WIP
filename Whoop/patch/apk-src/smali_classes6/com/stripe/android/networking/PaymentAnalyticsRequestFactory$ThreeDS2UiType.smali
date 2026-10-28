.class public final enum Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "com/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType",
        "",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "kr/e",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic E:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final synthetic F:Lt83/b;

.field public static final y:Lkr/e;

.field public static final enum z:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const/4 v1, 0x0

    const-string v2, "none"

    const-string v3, "None"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->z:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v2, "01"

    const-string v3, "text"

    const-string v4, "Text"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v3, "02"

    const-string v4, "single_select"

    const-string v5, "SingleSelect"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v4, "03"

    const-string v5, "multi_select"

    const-string v6, "MultiSelect"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4, v5}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v5, "04"

    const-string v6, "oob"

    const-string v7, "Oob"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v8, v5, v6}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v6, "05"

    const-string v7, "html"

    const-string v8, "Html"

    const/4 v9, 0x5

    invoke-direct {v5, v8, v9, v6, v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->E:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->F:Lt83/b;

    new-instance v0, Lkr/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->y:Lkr/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->w:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->x:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
    .locals 1

    const-class v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->E:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->x:Ljava/lang/String;

    return-object v0
.end method
