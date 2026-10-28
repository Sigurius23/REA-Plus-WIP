.class public final enum Lic/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lic/l;

.field public static final enum w:Lic/l;

.field public static final enum x:Lic/l;

.field public static final enum y:Lic/l;

.field public static final enum z:Lic/l;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lic/l;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/l;->w:Lic/l;

    new-instance v1, Lic/l;

    const-string v2, "KEEP"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lic/l;->x:Lic/l;

    new-instance v2, Lic/l;

    const-string v3, "APPEND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lic/l;->y:Lic/l;

    new-instance v3, Lic/l;

    const-string v4, "APPEND_OR_REPLACE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lic/l;->z:Lic/l;

    filled-new-array {v0, v1, v2, v3}, [Lic/l;

    move-result-object v0

    sput-object v0, Lic/l;->E:[Lic/l;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lic/l;
    .locals 1

    const-class v0, Lic/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lic/l;

    return-object p0
.end method

.method public static values()[Lic/l;
    .locals 1

    sget-object v0, Lic/l;->E:[Lic/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lic/l;

    return-object v0
.end method
