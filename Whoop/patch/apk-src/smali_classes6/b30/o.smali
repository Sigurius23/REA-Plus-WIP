.class public final enum Lb30/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lb30/o;

.field public static final enum y:Lb30/o;

.field public static final synthetic z:[Lb30/o;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lb30/o;

    const-string v1, "Dark"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb30/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb30/o;->x:Lb30/o;

    new-instance v1, Lb30/o;

    const-string v2, "Light"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lb30/o;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb30/o;->y:Lb30/o;

    filled-new-array {v0, v1}, [Lb30/o;

    move-result-object v0

    sput-object v0, Lb30/o;->z:[Lb30/o;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb30/o;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb30/o;
    .locals 1

    const-class v0, Lb30/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb30/o;

    return-object p0
.end method

.method public static values()[Lb30/o;
    .locals 1

    sget-object v0, Lb30/o;->z:[Lb30/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb30/o;

    return-object v0
.end method
