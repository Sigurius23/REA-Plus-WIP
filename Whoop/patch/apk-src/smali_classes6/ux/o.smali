.class public final enum Lux/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lux/o;

.field public static final enum x:Lux/o;

.field public static final enum y:Lux/o;

.field public static final enum z:Lux/o;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lux/o;

    const/4 v1, 0x0

    const-string v2, "NOT_CURRENTLY_KNOWN"

    const-string v3, "NotCurrentlyKnown"

    invoke-direct {v0, v3, v1, v2}, Lux/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lux/o;->x:Lux/o;

    new-instance v1, Lux/o;

    const/4 v2, 0x1

    const-string v3, "ESTIMATED"

    const-string v4, "Estimated"

    invoke-direct {v1, v4, v2, v3}, Lux/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lux/o;->y:Lux/o;

    new-instance v2, Lux/o;

    const/4 v3, 0x2

    const-string v4, "FINAL"

    const-string v5, "Final"

    invoke-direct {v2, v5, v3, v4}, Lux/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lux/o;->z:Lux/o;

    filled-new-array {v0, v1, v2}, [Lux/o;

    move-result-object v0

    sput-object v0, Lux/o;->E:[Lux/o;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lux/o;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lux/o;
    .locals 1

    const-class v0, Lux/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lux/o;

    return-object p0
.end method

.method public static values()[Lux/o;
    .locals 1

    sget-object v0, Lux/o;->E:[Lux/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lux/o;

    return-object v0
.end method
