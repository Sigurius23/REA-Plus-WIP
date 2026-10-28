.class public final enum Lyy/k0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lyy/k0;

.field public static final enum x:Lyy/k0;

.field public static final enum y:Lyy/k0;

.field public static final enum z:Lyy/k0;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lyy/k0;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lyy/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyy/k0;->x:Lyy/k0;

    new-instance v1, Lyy/k0;

    const-string v2, "POST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lyy/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lyy/k0;->y:Lyy/k0;

    new-instance v2, Lyy/k0;

    const-string v3, "DELETE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v3}, Lyy/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lyy/k0;->z:Lyy/k0;

    filled-new-array {v0, v1, v2}, [Lyy/k0;

    move-result-object v0

    sput-object v0, Lyy/k0;->E:[Lyy/k0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyy/k0;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyy/k0;
    .locals 1

    const-class v0, Lyy/k0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyy/k0;

    return-object p0
.end method

.method public static values()[Lyy/k0;
    .locals 1

    sget-object v0, Lyy/k0;->E:[Lyy/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyy/k0;

    return-object v0
.end method
