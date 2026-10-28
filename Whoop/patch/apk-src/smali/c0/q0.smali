.class public final enum Lc0/q0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lc0/q0;

.field public static final enum x:Lc0/q0;

.field public static final enum y:Lc0/q0;

.field public static final synthetic z:[Lc0/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lc0/q0;

    const-string v1, "PreEnter"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc0/q0;->w:Lc0/q0;

    new-instance v1, Lc0/q0;

    const-string v2, "Visible"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc0/q0;->x:Lc0/q0;

    new-instance v2, Lc0/q0;

    const-string v3, "PostExit"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lc0/q0;->y:Lc0/q0;

    filled-new-array {v0, v1, v2}, [Lc0/q0;

    move-result-object v0

    sput-object v0, Lc0/q0;->z:[Lc0/q0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc0/q0;
    .locals 1

    const-class v0, Lc0/q0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc0/q0;

    return-object p0
.end method

.method public static values()[Lc0/q0;
    .locals 1

    sget-object v0, Lc0/q0;->z:[Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc0/q0;

    return-object v0
.end method
