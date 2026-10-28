.class public final enum Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/paymentsheet/analytics/EventReporter$Mode",
        "",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "",
        "toString",
        "()Ljava/lang/String;",
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


# static fields
.field public static final synthetic E:[Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public static final enum x:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public static final enum y:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public static final enum z:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v1, 0x0

    const-string v2, "complete"

    const-string v3, "Complete"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->x:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v2, 0x1

    const-string v3, "custom"

    const-string v4, "Custom"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->y:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v3, 0x2

    const-string v4, "embedded"

    const-string v5, "Embedded"

    invoke-direct {v2, v5, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->z:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->E:[Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->E:[Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->w:Ljava/lang/String;

    return-object v0
.end method
