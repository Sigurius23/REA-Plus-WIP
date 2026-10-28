.class public final enum Lb33/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lb33/g;

.field public static final enum y:Lb33/g;

.field public static final synthetic z:[Lb33/g;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lb33/g;

    const/4 v1, 0x0

    const-string v2, "initiated"

    const-string v3, "INITIATED"

    invoke-direct {v0, v3, v1, v2}, Lb33/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb33/g;->x:Lb33/g;

    new-instance v1, Lb33/g;

    const/4 v2, 0x1

    const-string v3, "completed"

    const-string v4, "COMPLETED"

    invoke-direct {v1, v4, v2, v3}, Lb33/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb33/g;->y:Lb33/g;

    filled-new-array {v0, v1}, [Lb33/g;

    move-result-object v0

    sput-object v0, Lb33/g;->z:[Lb33/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb33/g;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb33/g;
    .locals 1

    const-class v0, Lb33/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb33/g;

    return-object p0
.end method

.method public static values()[Lb33/g;
    .locals 1

    sget-object v0, Lb33/g;->z:[Lb33/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb33/g;

    return-object v0
.end method
