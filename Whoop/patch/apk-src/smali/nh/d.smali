.class public final enum Lnh/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lnh/d;

.field public static final enum x:Lnh/d;

.field public static final enum y:Lnh/d;

.field public static final synthetic z:[Lnh/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnh/d;

    const-string v1, "EXACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnh/d;->w:Lnh/d;

    new-instance v1, Lnh/d;

    const-string v2, "INEXACT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnh/d;->x:Lnh/d;

    new-instance v2, Lnh/d;

    const-string v3, "AUTOMATIC"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lnh/d;->y:Lnh/d;

    filled-new-array {v0, v1, v2}, [Lnh/d;

    move-result-object v0

    sput-object v0, Lnh/d;->z:[Lnh/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnh/d;
    .locals 1

    const-class v0, Lnh/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnh/d;

    return-object p0
.end method

.method public static values()[Lnh/d;
    .locals 1

    sget-object v0, Lnh/d;->z:[Lnh/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnh/d;

    return-object v0
.end method
