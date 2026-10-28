.class public final enum Lxa3/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lxa3/q;

.field public static final enum x:Lxa3/q;

.field public static final synthetic y:[Lxa3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lxa3/q;

    const-string v1, "PRETTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lxa3/q;

    const-string v2, "DEBUG"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lxa3/q;->w:Lxa3/q;

    new-instance v2, Lxa3/q;

    const-string v3, "NONE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lxa3/q;->x:Lxa3/q;

    filled-new-array {v0, v1, v2}, [Lxa3/q;

    move-result-object v0

    sput-object v0, Lxa3/q;->y:[Lxa3/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lxa3/q;
    .locals 1

    const-class v0, Lxa3/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxa3/q;

    return-object p0
.end method

.method public static values()[Lxa3/q;
    .locals 1

    sget-object v0, Lxa3/q;->y:[Lxa3/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxa3/q;

    return-object v0
.end method
