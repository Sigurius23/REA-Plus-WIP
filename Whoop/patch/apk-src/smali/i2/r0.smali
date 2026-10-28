.class public final enum Li2/r0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Li2/r0;

.field public static final synthetic x:[Li2/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li2/r0;

    const-string v1, "CounterClockwise"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li2/r0;->w:Li2/r0;

    new-instance v1, Li2/r0;

    const-string v2, "Clockwise"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Li2/r0;

    move-result-object v0

    sput-object v0, Li2/r0;->x:[Li2/r0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li2/r0;
    .locals 1

    const-class v0, Li2/r0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li2/r0;

    return-object p0
.end method

.method public static values()[Li2/r0;
    .locals 1

    sget-object v0, Li2/r0;->x:[Li2/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li2/r0;

    return-object v0
.end method
