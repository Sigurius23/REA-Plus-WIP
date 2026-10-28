.class public final enum Lqx/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lqx/w;

.field public static final enum F:Lqx/w;

.field public static final enum G:Lqx/w;

.field public static final enum H:Lqx/w;

.field public static final enum I:Lqx/w;

.field public static final enum J:Lqx/w;

.field public static final synthetic K:[Lqx/w;

.field public static final enum w:Lqx/w;

.field public static final enum x:Lqx/w;

.field public static final enum y:Lqx/w;

.field public static final enum z:Lqx/w;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lqx/w;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqx/w;->w:Lqx/w;

    new-instance v1, Lqx/w;

    const-string v2, "END_ARRAY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqx/w;->x:Lqx/w;

    new-instance v2, Lqx/w;

    const-string v3, "BEGIN_OBJECT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lqx/w;->y:Lqx/w;

    new-instance v3, Lqx/w;

    const-string v4, "END_OBJECT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqx/w;->z:Lqx/w;

    new-instance v4, Lqx/w;

    const-string v5, "NAME"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lqx/w;->E:Lqx/w;

    new-instance v5, Lqx/w;

    const-string v6, "STRING"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqx/w;->F:Lqx/w;

    new-instance v6, Lqx/w;

    const-string v7, "NUMBER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lqx/w;->G:Lqx/w;

    new-instance v7, Lqx/w;

    const-string v8, "BOOLEAN"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lqx/w;->H:Lqx/w;

    new-instance v8, Lqx/w;

    const-string v9, "NULL"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lqx/w;->I:Lqx/w;

    new-instance v9, Lqx/w;

    const-string v10, "END_DOCUMENT"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lqx/w;->J:Lqx/w;

    filled-new-array/range {v0 .. v9}, [Lqx/w;

    move-result-object v0

    sput-object v0, Lqx/w;->K:[Lqx/w;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqx/w;
    .locals 1

    const-class v0, Lqx/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqx/w;

    return-object p0
.end method

.method public static values()[Lqx/w;
    .locals 1

    sget-object v0, Lqx/w;->K:[Lqx/w;

    invoke-virtual {v0}, [Lqx/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqx/w;

    return-object v0
.end method
