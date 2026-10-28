.class public final enum Lr6/p;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroidx/glance/appwidget/protobuf/c0;


# static fields
.field public static final enum E:Lr6/p;

.field public static final enum F:Lr6/p;

.field public static final synthetic G:[Lr6/p;

.field public static final enum x:Lr6/p;

.field public static final enum y:Lr6/p;

.field public static final enum z:Lr6/p;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lr6/p;

    const-string v1, "UNKNOWN_DIMENSION_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lr6/p;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lr6/p;

    const-string v2, "EXACT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lr6/p;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lr6/p;->x:Lr6/p;

    new-instance v2, Lr6/p;

    const-string v3, "WRAP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lr6/p;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lr6/p;->y:Lr6/p;

    new-instance v3, Lr6/p;

    const-string v4, "FILL"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lr6/p;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lr6/p;->z:Lr6/p;

    new-instance v4, Lr6/p;

    const-string v5, "EXPAND"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lr6/p;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lr6/p;->E:Lr6/p;

    new-instance v5, Lr6/p;

    const/4 v6, 0x5

    const/4 v7, -0x1

    const-string v8, "UNRECOGNIZED"

    invoke-direct {v5, v8, v6, v7}, Lr6/p;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lr6/p;->F:Lr6/p;

    filled-new-array/range {v0 .. v5}, [Lr6/p;

    move-result-object v0

    sput-object v0, Lr6/p;->G:[Lr6/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr6/p;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr6/p;
    .locals 1

    const-class v0, Lr6/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr6/p;

    return-object p0
.end method

.method public static values()[Lr6/p;
    .locals 1

    sget-object v0, Lr6/p;->G:[Lr6/p;

    invoke-virtual {v0}, [Lr6/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr6/p;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lr6/p;->F:Lr6/p;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lr6/p;->w:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
