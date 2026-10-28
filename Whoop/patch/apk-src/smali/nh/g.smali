.class public final enum Lnh/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lnh/g;

.field public static final enum x:Lnh/g;

.field public static final synthetic y:[Lnh/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lnh/g;

    const-string v1, "FILL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnh/g;->w:Lnh/g;

    new-instance v1, Lnh/g;

    const-string v2, "FIT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnh/g;->x:Lnh/g;

    filled-new-array {v0, v1}, [Lnh/g;

    move-result-object v0

    sput-object v0, Lnh/g;->y:[Lnh/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnh/g;
    .locals 1

    const-class v0, Lnh/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnh/g;

    return-object p0
.end method

.method public static values()[Lnh/g;
    .locals 1

    sget-object v0, Lnh/g;->y:[Lnh/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnh/g;

    return-object v0
.end method
