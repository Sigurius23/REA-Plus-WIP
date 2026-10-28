.class public final enum Lb30/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lb30/p;

.field public static final enum F:Lb30/p;

.field public static final enum G:Lb30/p;

.field public static final enum H:Lb30/p;

.field public static final enum I:Lb30/p;

.field public static final synthetic J:[Lb30/p;

.field public static final enum x:Lb30/p;

.field public static final enum y:Lb30/p;

.field public static final enum z:Lb30/p;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lb30/p;

    const-string v1, "Book"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb30/p;->x:Lb30/p;

    new-instance v1, Lb30/p;

    const-string v2, "Buy"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v4}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb30/p;->y:Lb30/p;

    new-instance v2, Lb30/p;

    const-string v4, "Checkout"

    const/4 v5, 0x3

    invoke-direct {v2, v4, v3, v5}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb30/p;->z:Lb30/p;

    new-instance v3, Lb30/p;

    const-string v4, "Donate"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lb30/p;->E:Lb30/p;

    new-instance v4, Lb30/p;

    const-string v5, "Order"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lb30/p;->F:Lb30/p;

    new-instance v5, Lb30/p;

    const-string v6, "Pay"

    const/4 v8, 0x6

    invoke-direct {v5, v6, v7, v8}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lb30/p;->G:Lb30/p;

    new-instance v6, Lb30/p;

    const-string v7, "Plain"

    const/16 v9, 0x8

    invoke-direct {v6, v7, v8, v9}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lb30/p;->H:Lb30/p;

    new-instance v7, Lb30/p;

    const-string v8, "Subscribe"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lb30/p;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lb30/p;->I:Lb30/p;

    filled-new-array/range {v0 .. v7}, [Lb30/p;

    move-result-object v0

    sput-object v0, Lb30/p;->J:[Lb30/p;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb30/p;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb30/p;
    .locals 1

    const-class v0, Lb30/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb30/p;

    return-object p0
.end method

.method public static values()[Lb30/p;
    .locals 1

    sget-object v0, Lb30/p;->J:[Lb30/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb30/p;

    return-object v0
.end method
