.class public final enum Ls40/x0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ls40/x0;

.field public static final enum F:Ls40/x0;

.field public static final synthetic G:[Ls40/x0;

.field public static final enum w:Ls40/x0;

.field public static final enum x:Ls40/x0;

.field public static final enum y:Ls40/x0;

.field public static final enum z:Ls40/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ls40/x0;

    const-string v1, "Line1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls40/x0;->w:Ls40/x0;

    new-instance v1, Ls40/x0;

    const-string v2, "Line2"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls40/x0;->x:Ls40/x0;

    new-instance v2, Ls40/x0;

    const-string v3, "City"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ls40/x0;->y:Ls40/x0;

    new-instance v3, Ls40/x0;

    const-string v4, "PostalCode"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls40/x0;->z:Ls40/x0;

    new-instance v4, Ls40/x0;

    const-string v5, "State"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ls40/x0;->E:Ls40/x0;

    new-instance v5, Ls40/x0;

    const-string v6, "Phone"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ls40/x0;->F:Ls40/x0;

    filled-new-array/range {v0 .. v5}, [Ls40/x0;

    move-result-object v0

    sput-object v0, Ls40/x0;->G:[Ls40/x0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls40/x0;
    .locals 1

    const-class v0, Ls40/x0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls40/x0;

    return-object p0
.end method

.method public static values()[Ls40/x0;
    .locals 1

    sget-object v0, Ls40/x0;->G:[Ls40/x0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls40/x0;

    return-object v0
.end method
