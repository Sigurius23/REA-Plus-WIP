.class public final enum Ld0/r0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Ld0/r0;

.field public static final synthetic x:[Ld0/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ld0/r0;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld0/r0;->w:Ld0/r0;

    new-instance v1, Ld0/r0;

    const-string v2, "UserInput"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Ld0/r0;

    const-string v3, "PreventUserInput"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [Ld0/r0;

    move-result-object v0

    sput-object v0, Ld0/r0;->x:[Ld0/r0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ld0/r0;
    .locals 1

    const-class v0, Ld0/r0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld0/r0;

    return-object p0
.end method

.method public static values()[Ld0/r0;
    .locals 1

    sget-object v0, Ld0/r0;->x:[Ld0/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld0/r0;

    return-object v0
.end method
