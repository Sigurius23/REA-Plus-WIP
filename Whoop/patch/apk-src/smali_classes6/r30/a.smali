.class public final enum Lr30/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lr30/a;

.field public static final synthetic y:[Lr30/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lr30/a;

    const/4 v1, 0x0

    const-string v2, "01"

    const-string v3, "UserSelected"

    invoke-direct {v0, v3, v1, v2}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lr30/a;->x:Lr30/a;

    new-instance v1, Lr30/a;

    const/4 v2, 0x1

    const-string v3, "02"

    const-string v4, "Reserved"

    invoke-direct {v1, v4, v2, v3}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lr30/a;

    const/4 v3, 0x2

    const-string v4, "03"

    const-string v5, "TransactionTimedOutDecoupled"

    invoke-direct {v2, v5, v3, v4}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lr30/a;

    const/4 v4, 0x3

    const-string v5, "04"

    const-string v6, "TransactionTimedOutOther"

    invoke-direct {v3, v6, v4, v5}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lr30/a;

    const/4 v5, 0x4

    const-string v6, "05"

    const-string v7, "TransactionTimedOutFirstCreq"

    invoke-direct {v4, v7, v5, v6}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lr30/a;

    const/4 v6, 0x5

    const-string v7, "06"

    const-string v8, "TransactionError"

    invoke-direct {v5, v8, v6, v7}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lr30/a;

    const/4 v7, 0x6

    const-string v8, "07"

    const-string v9, "Unknown"

    invoke-direct {v6, v9, v7, v8}, Lr30/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v6}, [Lr30/a;

    move-result-object v0

    sput-object v0, Lr30/a;->y:[Lr30/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lr30/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr30/a;
    .locals 1

    const-class v0, Lr30/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr30/a;

    return-object p0
.end method

.method public static values()[Lr30/a;
    .locals 1

    sget-object v0, Lr30/a;->y:[Lr30/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr30/a;

    return-object v0
.end method
