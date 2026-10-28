.class public final enum Lr6/o;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroidx/glance/appwidget/protobuf/c0;


# static fields
.field public static final enum E:Lr6/o;

.field public static final synthetic F:[Lr6/o;

.field public static final enum x:Lr6/o;

.field public static final enum y:Lr6/o;

.field public static final enum z:Lr6/o;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lr6/o;

    const-string v1, "UNSPECIFIED_CONTENT_SCALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lr6/o;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lr6/o;

    const-string v2, "FIT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lr6/o;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lr6/o;->x:Lr6/o;

    new-instance v2, Lr6/o;

    const-string v3, "CROP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lr6/o;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lr6/o;->y:Lr6/o;

    new-instance v3, Lr6/o;

    const-string v4, "FILL_BOUNDS"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lr6/o;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lr6/o;->z:Lr6/o;

    new-instance v4, Lr6/o;

    const/4 v5, 0x4

    const/4 v6, -0x1

    const-string v7, "UNRECOGNIZED"

    invoke-direct {v4, v7, v5, v6}, Lr6/o;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lr6/o;->E:Lr6/o;

    filled-new-array {v0, v1, v2, v3, v4}, [Lr6/o;

    move-result-object v0

    sput-object v0, Lr6/o;->F:[Lr6/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr6/o;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr6/o;
    .locals 1

    const-class v0, Lr6/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr6/o;

    return-object p0
.end method

.method public static values()[Lr6/o;
    .locals 1

    sget-object v0, Lr6/o;->F:[Lr6/o;

    invoke-virtual {v0}, [Lr6/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr6/o;

    return-object v0
.end method
