.class public final enum Lb30/d6;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lb30/d6;

.field public static final enum x:Lb30/d6;

.field public static final enum y:Lb30/d6;

.field public static final enum z:Lb30/d6;


# instance fields
.field public final w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lb30/d6;

    const-string v1, "Idle"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb30/d6;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lb30/d6;->x:Lb30/d6;

    new-instance v1, Lb30/d6;

    const-string v2, "Updating"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lb30/d6;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lb30/d6;->y:Lb30/d6;

    new-instance v2, Lb30/d6;

    const-string v4, "Removing"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lb30/d6;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lb30/d6;->z:Lb30/d6;

    filled-new-array {v0, v1, v2}, [Lb30/d6;

    move-result-object v0

    sput-object v0, Lb30/d6;->E:[Lb30/d6;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lb30/d6;->w:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb30/d6;
    .locals 1

    const-class v0, Lb30/d6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb30/d6;

    return-object p0
.end method

.method public static values()[Lb30/d6;
    .locals 1

    sget-object v0, Lb30/d6;->E:[Lb30/d6;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb30/d6;

    return-object v0
.end method
