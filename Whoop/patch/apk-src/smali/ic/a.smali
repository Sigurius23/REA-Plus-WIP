.class public final enum Lic/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lic/a;

.field public static final enum x:Lic/a;

.field public static final synthetic y:[Lic/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lic/a;

    const-string v1, "EXPONENTIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/a;->w:Lic/a;

    new-instance v1, Lic/a;

    const-string v2, "LINEAR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lic/a;->x:Lic/a;

    filled-new-array {v0, v1}, [Lic/a;

    move-result-object v0

    sput-object v0, Lic/a;->y:[Lic/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lic/a;
    .locals 1

    const-class v0, Lic/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lic/a;

    return-object p0
.end method

.method public static values()[Lic/a;
    .locals 1

    sget-object v0, Lic/a;->y:[Lic/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lic/a;

    return-object v0
.end method
