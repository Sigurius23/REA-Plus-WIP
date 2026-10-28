.class public final enum Lux/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lux/i;

.field public static final enum y:Lux/i;

.field public static final synthetic z:[Lux/i;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lux/i;

    const/4 v1, 0x0

    const-string v2, "MIN"

    const-string v3, "Min"

    invoke-direct {v0, v3, v1, v2}, Lux/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lux/i;->x:Lux/i;

    new-instance v1, Lux/i;

    const/4 v2, 0x1

    const-string v3, "FULL"

    const-string v4, "Full"

    invoke-direct {v1, v4, v2, v3}, Lux/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lux/i;->y:Lux/i;

    filled-new-array {v0, v1}, [Lux/i;

    move-result-object v0

    sput-object v0, Lux/i;->z:[Lux/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lux/i;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lux/i;
    .locals 1

    const-class v0, Lux/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lux/i;

    return-object p0
.end method

.method public static values()[Lux/i;
    .locals 1

    sget-object v0, Lux/i;->z:[Lux/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lux/i;

    return-object v0
.end method
