.class public final La30/z0;
.super La30/e1;
.source "SourceFile"


# static fields
.field public static final w:La30/z0;

.field public static final x:Ljava/lang/String;

.field public static final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La30/z0;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    sput-object v0, La30/z0;->w:La30/z0;

    const-string v0, "missingAmountOrCurrency"

    sput-object v0, La30/z0;->x:Ljava/lang/String;

    const-string v0, "PaymentIntent must contain amount and currency."

    sput-object v0, La30/z0;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    sget-object v0, La30/z0;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    sget-object v0, La30/z0;->y:Ljava/lang/String;

    return-object v0
.end method
