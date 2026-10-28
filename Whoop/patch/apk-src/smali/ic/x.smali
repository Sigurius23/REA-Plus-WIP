.class public final enum Lic/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lic/x;

.field public static final enum F:Lic/x;

.field public static final synthetic G:[Lic/x;

.field public static final enum w:Lic/x;

.field public static final enum x:Lic/x;

.field public static final enum y:Lic/x;

.field public static final enum z:Lic/x;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lic/x;

    const-string v1, "NOT_REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/x;->w:Lic/x;

    new-instance v1, Lic/x;

    const-string v2, "CONNECTED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lic/x;->x:Lic/x;

    new-instance v2, Lic/x;

    const-string v3, "UNMETERED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lic/x;->y:Lic/x;

    new-instance v3, Lic/x;

    const-string v4, "NOT_ROAMING"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lic/x;->z:Lic/x;

    new-instance v4, Lic/x;

    const-string v5, "METERED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lic/x;->E:Lic/x;

    new-instance v5, Lic/x;

    const-string v6, "TEMPORARILY_UNMETERED"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lic/x;->F:Lic/x;

    filled-new-array/range {v0 .. v5}, [Lic/x;

    move-result-object v0

    sput-object v0, Lic/x;->G:[Lic/x;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lic/x;
    .locals 1

    const-class v0, Lic/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lic/x;

    return-object p0
.end method

.method public static values()[Lic/x;
    .locals 1

    sget-object v0, Lic/x;->G:[Lic/x;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lic/x;

    return-object v0
.end method
