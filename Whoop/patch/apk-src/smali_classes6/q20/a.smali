.class public final enum Lq20/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lq20/a;

.field public static final enum F:Lq20/a;

.field public static final enum G:Lq20/a;

.field public static final enum H:Lq20/a;

.field public static final synthetic I:[Lq20/a;

.field public static final enum w:Lq20/a;

.field public static final enum x:Lq20/a;

.field public static final enum y:Lq20/a;

.field public static final enum z:Lq20/a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lq20/a;

    const-string v1, "Buy"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq20/a;->w:Lq20/a;

    new-instance v1, Lq20/a;

    const-string v2, "Book"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq20/a;->x:Lq20/a;

    new-instance v2, Lq20/a;

    const-string v3, "Checkout"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lq20/a;->y:Lq20/a;

    new-instance v3, Lq20/a;

    const-string v4, "Donate"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lq20/a;->z:Lq20/a;

    new-instance v4, Lq20/a;

    const-string v5, "Order"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lq20/a;->E:Lq20/a;

    new-instance v5, Lq20/a;

    const-string v6, "Pay"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lq20/a;->F:Lq20/a;

    new-instance v6, Lq20/a;

    const-string v7, "Subscribe"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lq20/a;->G:Lq20/a;

    new-instance v7, Lq20/a;

    const-string v8, "Plain"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lq20/a;->H:Lq20/a;

    filled-new-array/range {v0 .. v7}, [Lq20/a;

    move-result-object v0

    sput-object v0, Lq20/a;->I:[Lq20/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq20/a;
    .locals 1

    const-class v0, Lq20/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq20/a;

    return-object p0
.end method

.method public static values()[Lq20/a;
    .locals 1

    sget-object v0, Lq20/a;->I:[Lq20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq20/a;

    return-object v0
.end method
