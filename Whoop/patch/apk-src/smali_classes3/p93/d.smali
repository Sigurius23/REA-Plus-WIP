.class public final enum Lp93/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final w:Lng3/n;

.field public static final synthetic x:[Lp93/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lp93/d;

    const-string v1, "Function"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lp93/d;

    const-string v2, "SuspendFunction"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lp93/d;

    const-string v3, "KFunction"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lp93/d;

    const-string v4, "KSuspendFunction"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lp93/d;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2, v3, v4}, [Lp93/d;

    move-result-object v0

    sput-object v0, Lp93/d;->x:[Lp93/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lng3/n;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lp93/d;->w:Lng3/n;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp93/d;
    .locals 1

    const-class v0, Lp93/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp93/d;

    return-object p0
.end method

.method public static values()[Lp93/d;
    .locals 1

    sget-object v0, Lp93/d;->x:[Lp93/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp93/d;

    return-object v0
.end method
