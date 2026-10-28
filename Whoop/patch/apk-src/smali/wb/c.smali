.class public final enum Lwb/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lwb/c;

.field public static final synthetic F:[Lwb/c;

.field public static final enum w:Lwb/c;

.field public static final enum x:Lwb/c;

.field public static final enum y:Lwb/c;

.field public static final enum z:Lwb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lwb/c;

    const-string v1, "END"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwb/c;->w:Lwb/c;

    new-instance v1, Lwb/c;

    const-string v2, "ROLLBACK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwb/c;->x:Lwb/c;

    new-instance v2, Lwb/c;

    const-string v3, "BEGIN_EXCLUSIVE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lwb/c;->y:Lwb/c;

    new-instance v3, Lwb/c;

    const-string v4, "BEGIN_IMMEDIATE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lwb/c;->z:Lwb/c;

    new-instance v4, Lwb/c;

    const-string v5, "BEGIN_DEFERRED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lwb/c;->E:Lwb/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lwb/c;

    move-result-object v0

    sput-object v0, Lwb/c;->F:[Lwb/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwb/c;
    .locals 1

    const-class v0, Lwb/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwb/c;

    return-object p0
.end method

.method public static values()[Lwb/c;
    .locals 1

    sget-object v0, Lwb/c;->F:[Lwb/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwb/c;

    return-object v0
.end method
