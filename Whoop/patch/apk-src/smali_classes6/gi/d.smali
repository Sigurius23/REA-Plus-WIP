.class public final enum Lgi/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lgi/d;

.field public static final enum x:Lgi/d;

.field public static final synthetic y:[Lgi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgi/d;

    const-string v1, "EXACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgi/d;->w:Lgi/d;

    new-instance v1, Lgi/d;

    const-string v2, "INEXACT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgi/d;->x:Lgi/d;

    filled-new-array {v0, v1}, [Lgi/d;

    move-result-object v0

    sput-object v0, Lgi/d;->y:[Lgi/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgi/d;
    .locals 1

    const-class v0, Lgi/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgi/d;

    return-object p0
.end method

.method public static values()[Lgi/d;
    .locals 1

    sget-object v0, Lgi/d;->y:[Lgi/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgi/d;

    return-object v0
.end method
