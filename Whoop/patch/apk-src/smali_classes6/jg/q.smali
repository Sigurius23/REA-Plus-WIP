.class public final enum Ljg/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ljg/q;

.field public static final enum F:Ljg/q;

.field public static final synthetic G:[Ljg/q;

.field public static final enum w:Ljg/q;

.field public static final enum x:Ljg/q;

.field public static final enum y:Ljg/q;

.field public static final enum z:Ljg/q;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljg/q;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/q;->w:Ljg/q;

    new-instance v1, Ljg/q;

    const-string v2, "ArrayFirstValueOrEnd"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljg/q;->x:Ljg/q;

    new-instance v2, Ljg/q;

    const-string v3, "ArrayNextValueOrEnd"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ljg/q;->y:Ljg/q;

    new-instance v3, Ljg/q;

    const-string v4, "ObjectFirstKeyOrEnd"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ljg/q;->z:Ljg/q;

    new-instance v4, Ljg/q;

    const-string v5, "ObjectNextKeyOrEnd"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ljg/q;->E:Ljg/q;

    new-instance v5, Ljg/q;

    const-string v6, "ObjectFieldValue"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ljg/q;->F:Ljg/q;

    filled-new-array/range {v0 .. v5}, [Ljg/q;

    move-result-object v0

    sput-object v0, Ljg/q;->G:[Ljg/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/q;
    .locals 1

    const-class v0, Ljg/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/q;

    return-object p0
.end method

.method public static values()[Ljg/q;
    .locals 1

    sget-object v0, Ljg/q;->G:[Ljg/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/q;

    return-object v0
.end method
