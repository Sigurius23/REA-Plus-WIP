.class public final enum Lj4/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lj4/i;

.field public static final enum w:Lj4/i;

.field public static final enum x:Lj4/i;

.field public static final enum y:Lj4/i;

.field public static final z:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lj4/i;

    const-string v1, "SPREAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj4/i;->w:Lj4/i;

    new-instance v1, Lj4/i;

    const-string v3, "SPREAD_INSIDE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj4/i;->x:Lj4/i;

    new-instance v3, Lj4/i;

    const-string v5, "PACKED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj4/i;->y:Lj4/i;

    filled-new-array {v0, v1, v3}, [Lj4/i;

    move-result-object v5

    sput-object v5, Lj4/i;->E:[Lj4/i;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    sput-object v7, Lj4/i;->z:Ljava/util/HashMap;

    const-string v8, "packed"

    invoke-virtual {v5, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "spread_inside"

    invoke-virtual {v5, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "spread"

    invoke-virtual {v5, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v7, v8, v4, v3}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    sget-object v0, Lj4/i;->z:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lj4/i;
    .locals 1

    const-class v0, Lj4/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj4/i;

    return-object p0
.end method

.method public static values()[Lj4/i;
    .locals 1

    sget-object v0, Lj4/i;->E:[Lj4/i;

    invoke-virtual {v0}, [Lj4/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj4/i;

    return-object v0
.end method
