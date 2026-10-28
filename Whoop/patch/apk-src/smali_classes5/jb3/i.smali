.class public final enum Ljb3/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Ljb3/i;

.field public static final enum x:Ljb3/i;

.field public static final synthetic y:[Ljb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljb3/i;

    const-string v1, "STABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljb3/i;->w:Ljb3/i;

    new-instance v1, Ljb3/i;

    const-string v2, "UNSTABLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljb3/i;->x:Ljb3/i;

    filled-new-array {v0, v1}, [Ljb3/i;

    move-result-object v0

    sput-object v0, Ljb3/i;->y:[Ljb3/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljb3/i;
    .locals 1

    const-class v0, Ljb3/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljb3/i;

    return-object p0
.end method

.method public static values()[Ljb3/i;
    .locals 1

    sget-object v0, Ljb3/i;->y:[Ljb3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljb3/i;

    return-object v0
.end method
