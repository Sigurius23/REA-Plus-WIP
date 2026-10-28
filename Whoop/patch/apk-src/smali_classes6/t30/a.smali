.class public final enum Lt30/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final E:Lng3/n;

.field public static final enum F:Lt30/a;

.field public static final synthetic G:[Lt30/a;

.field public static final synthetic H:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:I

.field public final y:Ljava/lang/Integer;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lt30/a;

    const v1, 0x7f140f57

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    const-string v1, "Visa"

    const/4 v2, 0x0

    const-string v3, "visa"

    const v4, 0x7f08079b

    invoke-direct/range {v0 .. v6}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v1, Lt30/a;

    const v2, 0x7f140f55

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const-string v2, "Mastercard"

    const/4 v3, 0x1

    const-string v4, "mastercard"

    const v5, 0x7f080798

    invoke-direct/range {v1 .. v7}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v2, Lt30/a;

    const v3, 0x7f140f52

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const-string v3, "Amex"

    const/4 v4, 0x2

    const-string v5, "american_express"

    const v6, 0x7f080793

    invoke-direct/range {v2 .. v8}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v3, Lt30/a;

    const v4, 0x7f140f54

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    const-string v4, "Discover"

    const/4 v5, 0x3

    const-string v6, "discover"

    const v7, 0x7f080796

    invoke-direct/range {v3 .. v9}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v4, Lt30/a;

    const v5, 0x7f140f53

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    const-string v5, "CartesBancaires"

    const/4 v6, 0x4

    const-string v7, "cartes_bancaires"

    const v8, 0x7f080795

    invoke-direct/range {v4 .. v10}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v5, Lt30/a;

    const v6, 0x7f140f56

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x0

    const-string v6, "UnionPay"

    const/4 v7, 0x5

    const-string v8, "unionpay"

    const v9, 0x7f080799

    invoke-direct/range {v5 .. v11}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    new-instance v6, Lt30/a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v7, "Unknown"

    const/4 v8, 0x6

    const-string v9, "unknown"

    const v10, 0x7f08079a

    invoke-direct/range {v6 .. v12}, Lt30/a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    sput-object v6, Lt30/a;->F:Lt30/a;

    filled-new-array/range {v0 .. v6}, [Lt30/a;

    move-result-object v0

    sput-object v0, Lt30/a;->G:[Lt30/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lt30/a;->H:Lt83/b;

    new-instance v0, Lng3/n;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lt30/a;->E:Lng3/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lt30/a;->w:Ljava/lang/String;

    iput p4, p0, Lt30/a;->x:I

    iput-object p5, p0, Lt30/a;->y:Ljava/lang/Integer;

    iput-boolean p6, p0, Lt30/a;->z:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt30/a;
    .locals 1

    const-class v0, Lt30/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt30/a;

    return-object p0
.end method

.method public static values()[Lt30/a;
    .locals 1

    sget-object v0, Lt30/a;->G:[Lt30/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt30/a;

    return-object v0
.end method
