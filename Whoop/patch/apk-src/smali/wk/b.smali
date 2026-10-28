.class public final enum Lwk/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lwk/b;

.field public static final enum x:Lwk/b;

.field public static final y:Lwk/b;

.field public static final synthetic z:[Lwk/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lwk/b;

    const-string v1, "PREFER_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwk/b;->w:Lwk/b;

    new-instance v1, Lwk/b;

    const-string v2, "PREFER_RGB_565"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwk/b;->x:Lwk/b;

    filled-new-array {v0, v1}, [Lwk/b;

    move-result-object v1

    sput-object v1, Lwk/b;->z:[Lwk/b;

    sput-object v0, Lwk/b;->y:Lwk/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwk/b;
    .locals 1

    const-class v0, Lwk/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwk/b;

    return-object p0
.end method

.method public static values()[Lwk/b;
    .locals 1

    sget-object v0, Lwk/b;->z:[Lwk/b;

    invoke-virtual {v0}, [Lwk/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwk/b;

    return-object v0
.end method
