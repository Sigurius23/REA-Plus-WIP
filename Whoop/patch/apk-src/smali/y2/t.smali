.class public final enum Ly2/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Ly2/t;

.field public static final enum x:Ly2/t;

.field public static final synthetic y:[Ly2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly2/t;

    const-string v1, "Width"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly2/t;->w:Ly2/t;

    new-instance v1, Ly2/t;

    const-string v2, "Height"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly2/t;->x:Ly2/t;

    filled-new-array {v0, v1}, [Ly2/t;

    move-result-object v0

    sput-object v0, Ly2/t;->y:[Ly2/t;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly2/t;
    .locals 1

    const-class v0, Ly2/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly2/t;

    return-object p0
.end method

.method public static values()[Ly2/t;
    .locals 1

    sget-object v0, Ly2/t;->y:[Ly2/t;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly2/t;

    return-object v0
.end method
