.class public final enum Ly00/y2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Ly00/y2;

.field public static final synthetic y:[Ly00/y2;

.field public static final synthetic z:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly00/y2;

    const/4 v1, 0x0

    const-string v2, "amounts"

    const-string v3, "AMOUNTS"

    invoke-direct {v0, v3, v1, v2}, Ly00/y2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ly00/y2;

    const/4 v2, 0x1

    const-string v3, "descriptor_code"

    const-string v4, "DESCRIPTOR_CODE"

    invoke-direct {v1, v4, v2, v3}, Ly00/y2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Ly00/y2;

    const/4 v3, 0x2

    const-string v4, "unknown"

    const-string v5, "UNKNOWN"

    invoke-direct {v2, v5, v3, v4}, Ly00/y2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/y2;->x:Ly00/y2;

    filled-new-array {v0, v1, v2}, [Ly00/y2;

    move-result-object v0

    sput-object v0, Ly00/y2;->y:[Ly00/y2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/y2;->z:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/y2;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/y2;
    .locals 1

    const-class v0, Ly00/y2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/y2;

    return-object p0
.end method

.method public static values()[Ly00/y2;
    .locals 1

    sget-object v0, Ly00/y2;->y:[Ly00/y2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/y2;

    return-object v0
.end method
