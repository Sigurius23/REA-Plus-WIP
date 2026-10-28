.class public final enum Lam/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lam/h;

.field public static final enum x:Lam/h;

.field public static final synthetic y:[Lam/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lam/h;

    const-string v1, "Wrap"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lam/h;->w:Lam/h;

    new-instance v1, Lam/h;

    const-string v2, "Expand"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lam/h;->x:Lam/h;

    filled-new-array {v0, v1}, [Lam/h;

    move-result-object v0

    sput-object v0, Lam/h;->y:[Lam/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lam/h;
    .locals 1

    const-class v0, Lam/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lam/h;

    return-object p0
.end method

.method public static values()[Lam/h;
    .locals 1

    sget-object v0, Lam/h;->y:[Lam/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lam/h;

    return-object v0
.end method
