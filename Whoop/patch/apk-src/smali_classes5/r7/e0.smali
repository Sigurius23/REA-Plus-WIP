.class public final Lr7/e0;
.super Lr7/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "KILOCALORIES_PER_DAY"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "kcal/day"

    return-object v0
.end method

.method public final b()D
    .locals 2

    const-wide v0, 0x3fa8cb487009bce8L    # 0.0484259259

    return-wide v0
.end method
