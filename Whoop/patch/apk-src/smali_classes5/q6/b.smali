.class public final enum Lq6/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lq6/b;

.field public static final enum x:Lq6/b;

.field public static final synthetic y:[Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lq6/b;

    const-string v1, "ACTIVITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lq6/b;

    const-string v2, "BROADCAST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq6/b;->w:Lq6/b;

    new-instance v2, Lq6/b;

    const-string v3, "SERVICE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lq6/b;

    const-string v4, "FOREGROUND_SERVICE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lq6/b;

    const-string v5, "CALLBACK"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lq6/b;->x:Lq6/b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lq6/b;

    move-result-object v0

    sput-object v0, Lq6/b;->y:[Lq6/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq6/b;
    .locals 1

    const-class v0, Lq6/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq6/b;

    return-object p0
.end method

.method public static values()[Lq6/b;
    .locals 1

    sget-object v0, Lq6/b;->y:[Lq6/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq6/b;

    return-object v0
.end method
