.class public final enum Lcom/stripe/android/model/Source$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/Source$Status;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "com/stripe/android/model/Source$Status",
        "",
        "Lcom/stripe/android/model/Source$Status;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "t9/p",
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
.field public static final x:Lt9/p;

.field public static final synthetic y:[Lcom/stripe/android/model/Source$Status;

.field public static final synthetic z:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/model/Source$Status;

    const/4 v1, 0x0

    const-string v2, "canceled"

    const-string v3, "Canceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/Source$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/Source$Status;

    const/4 v2, 0x1

    const-string v3, "chargeable"

    const-string v4, "Chargeable"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/model/Source$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lcom/stripe/android/model/Source$Status;

    const/4 v3, 0x2

    const-string v4, "consumed"

    const-string v5, "Consumed"

    invoke-direct {v2, v5, v3, v4}, Lcom/stripe/android/model/Source$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lcom/stripe/android/model/Source$Status;

    const/4 v4, 0x3

    const-string v5, "failed"

    const-string v6, "Failed"

    invoke-direct {v3, v6, v4, v5}, Lcom/stripe/android/model/Source$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lcom/stripe/android/model/Source$Status;

    const/4 v5, 0x4

    const-string v6, "pending"

    const-string v7, "Pending"

    invoke-direct {v4, v7, v5, v6}, Lcom/stripe/android/model/Source$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/model/Source$Status;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Source$Status;->y:[Lcom/stripe/android/model/Source$Status;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Source$Status;->z:Lt83/b;

    new-instance v0, Lt9/p;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    sput-object v0, Lcom/stripe/android/model/Source$Status;->x:Lt9/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/Source$Status;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/Source$Status;
    .locals 1

    const-class v0, Lcom/stripe/android/model/Source$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/Source$Status;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/Source$Status;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/Source$Status;->y:[Lcom/stripe/android/model/Source$Status;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/Source$Status;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/Source$Status;->w:Ljava/lang/String;

    return-object v0
.end method
