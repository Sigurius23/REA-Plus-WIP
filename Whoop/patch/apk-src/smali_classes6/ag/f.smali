.class public final enum Lag/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lag/f;

.field public static final enum x:Lag/f;

.field public static final synthetic y:[Lag/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lag/f;

    const-string v1, "Before"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lag/f;->w:Lag/f;

    new-instance v1, Lag/f;

    const-string v2, "After"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lag/f;->x:Lag/f;

    filled-new-array {v0, v1}, [Lag/f;

    move-result-object v0

    sput-object v0, Lag/f;->y:[Lag/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lag/f;
    .locals 1

    const-class v0, Lag/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lag/f;

    return-object p0
.end method

.method public static values()[Lag/f;
    .locals 1

    sget-object v0, Lag/f;->y:[Lag/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lag/f;

    return-object v0
.end method
