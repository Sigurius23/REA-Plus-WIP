.class public final enum Landroidx/lifecycle/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Landroidx/lifecycle/w;

.field public static final synthetic F:[Landroidx/lifecycle/w;

.field public static final enum w:Landroidx/lifecycle/w;

.field public static final enum x:Landroidx/lifecycle/w;

.field public static final enum y:Landroidx/lifecycle/w;

.field public static final enum z:Landroidx/lifecycle/w;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Landroidx/lifecycle/w;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    new-instance v1, Landroidx/lifecycle/w;

    const-string v2, "INITIALIZED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    new-instance v2, Landroidx/lifecycle/w;

    const-string v3, "CREATED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    new-instance v3, Landroidx/lifecycle/w;

    const-string v4, "STARTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    new-instance v4, Landroidx/lifecycle/w;

    const-string v5, "RESUMED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    filled-new-array {v0, v1, v2, v3, v4}, [Landroidx/lifecycle/w;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/w;->F:[Landroidx/lifecycle/w;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/lifecycle/w;
    .locals 1

    const-class v0, Landroidx/lifecycle/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/w;

    return-object p0
.end method

.method public static values()[Landroidx/lifecycle/w;
    .locals 1

    sget-object v0, Landroidx/lifecycle/w;->F:[Landroidx/lifecycle/w;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/lifecycle/w;

    return-object v0
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/w;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
