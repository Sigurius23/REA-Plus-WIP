.class public final enum La30/g1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:La30/g1;

.field public static final enum x:La30/g1;

.field public static final synthetic y:[La30/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La30/g1;

    const-string v1, "HEADER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La30/g1;->w:La30/g1;

    new-instance v1, La30/g1;

    const-string v2, "INLINE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La30/g1;->x:La30/g1;

    filled-new-array {v0, v1}, [La30/g1;

    move-result-object v0

    sput-object v0, La30/g1;->y:[La30/g1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La30/g1;
    .locals 1

    const-class v0, La30/g1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La30/g1;

    return-object p0
.end method

.method public static values()[La30/g1;
    .locals 1

    sget-object v0, La30/g1;->y:[La30/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La30/g1;

    return-object v0
.end method
