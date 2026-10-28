.class public final enum Lgw/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lgw/o;

.field public static final enum x:Lgw/o;

.field public static final synthetic y:[Lgw/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lgw/o;

    const-string v1, "UNSIGNED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lgw/o;

    const-string v2, "SIGNED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgw/o;->w:Lgw/o;

    new-instance v2, Lgw/o;

    const-string v3, "VERIFIED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgw/o;->x:Lgw/o;

    filled-new-array {v0, v1, v2}, [Lgw/o;

    move-result-object v0

    sput-object v0, Lgw/o;->y:[Lgw/o;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgw/o;
    .locals 1

    const-class v0, Lgw/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgw/o;

    return-object p0
.end method

.method public static values()[Lgw/o;
    .locals 1

    sget-object v0, Lgw/o;->y:[Lgw/o;

    invoke-virtual {v0}, [Lgw/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgw/o;

    return-object v0
.end method
