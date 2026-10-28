.class public final enum Ly00/e6;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final x:Lt9/c0;

.field public static final synthetic y:[Ly00/e6;

.field public static final synthetic z:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ly00/e6;

    const/4 v1, 0x0

    const-string v2, "api_connection_error"

    const-string v3, "ApiConnectionError"

    invoke-direct {v0, v3, v1, v2}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ly00/e6;

    const/4 v2, 0x1

    const-string v3, "api_error"

    const-string v4, "ApiError"

    invoke-direct {v1, v4, v2, v3}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Ly00/e6;

    const/4 v3, 0x2

    const-string v4, "authentication_error"

    const-string v5, "AuthenticationError"

    invoke-direct {v2, v5, v3, v4}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Ly00/e6;

    const/4 v4, 0x3

    const-string v5, "card_error"

    const-string v6, "CardError"

    invoke-direct {v3, v6, v4, v5}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Ly00/e6;

    const/4 v5, 0x4

    const-string v6, "idempotency_error"

    const-string v7, "IdempotencyError"

    invoke-direct {v4, v7, v5, v6}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Ly00/e6;

    const/4 v6, 0x5

    const-string v7, "invalid_request_error"

    const-string v8, "InvalidRequestError"

    invoke-direct {v5, v8, v6, v7}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Ly00/e6;

    const/4 v7, 0x6

    const-string v8, "rate_limit_error"

    const-string v9, "RateLimitError"

    invoke-direct {v6, v9, v7, v8}, Ly00/e6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v6}, [Ly00/e6;

    move-result-object v0

    sput-object v0, Ly00/e6;->y:[Ly00/e6;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/e6;->z:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly00/e6;->x:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/e6;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/e6;
    .locals 1

    const-class v0, Ly00/e6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/e6;

    return-object p0
.end method

.method public static values()[Ly00/e6;
    .locals 1

    sget-object v0, Ly00/e6;->y:[Ly00/e6;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/e6;

    return-object v0
.end method
