.class public final enum Lj4/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final w:Ljava/util/HashMap;

.field public static final synthetic x:[Lj4/j;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lj4/j;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lj4/j;

    const-string v3, "CHAIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lj4/j;

    const-string v4, "ALIGNED"

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v3}, [Lj4/j;

    move-result-object v4

    sput-object v4, Lj4/j;->x:[Lj4/j;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    sput-object v6, Lj4/j;->w:Ljava/util/HashMap;

    const-string v7, "none"

    invoke-virtual {v4, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chain"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "aligned"

    invoke-virtual {v4, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v2, v6, v7, v3, v0}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    sget-object v0, Lj4/j;->w:Ljava/util/HashMap;

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

.method public static valueOf(Ljava/lang/String;)Lj4/j;
    .locals 1

    const-class v0, Lj4/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj4/j;

    return-object p0
.end method

.method public static values()[Lj4/j;
    .locals 1

    sget-object v0, Lj4/j;->x:[Lj4/j;

    invoke-virtual {v0}, [Lj4/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj4/j;

    return-object v0
.end method
