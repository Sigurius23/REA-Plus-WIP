.class public final enum Ly00/g3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Ly00/g3;

.field public static final synthetic F:Lt83/b;

.field public static final x:Lt9/c0;

.field public static final enum y:Ly00/g3;

.field public static final enum z:Ly00/g3;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly00/g3;

    const/4 v1, 0x0

    const-string v2, "automatic"

    const-string v3, "Automatic"

    invoke-direct {v0, v3, v1, v2}, Ly00/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/g3;->y:Ly00/g3;

    new-instance v1, Ly00/g3;

    const/4 v2, 0x1

    const-string v3, "manual"

    const-string v4, "Manual"

    invoke-direct {v1, v4, v2, v3}, Ly00/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/g3;->z:Ly00/g3;

    filled-new-array {v0, v1}, [Ly00/g3;

    move-result-object v0

    sput-object v0, Ly00/g3;->E:[Ly00/g3;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/g3;->F:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly00/g3;->x:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/g3;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/g3;
    .locals 1

    const-class v0, Ly00/g3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/g3;

    return-object p0
.end method

.method public static values()[Ly00/g3;
    .locals 1

    sget-object v0, Ly00/g3;->E:[Ly00/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/g3;

    return-object v0
.end method
