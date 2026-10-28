.class public final enum Leu/c0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Leu/c0;

.field public static final synthetic y:[Leu/c0;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Leu/c0;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Leu/c0;-><init>(Ljava/lang/String;II)V

    new-instance v1, Leu/c0;

    const-string v2, "NORMAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Leu/c0;-><init>(Ljava/lang/String;II)V

    sput-object v1, Leu/c0;->x:Leu/c0;

    new-instance v2, Leu/c0;

    const-string v3, "SATELLITE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Leu/c0;-><init>(Ljava/lang/String;II)V

    new-instance v3, Leu/c0;

    const-string v4, "TERRAIN"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Leu/c0;-><init>(Ljava/lang/String;II)V

    new-instance v4, Leu/c0;

    const-string v5, "HYBRID"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Leu/c0;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2, v3, v4}, [Leu/c0;

    move-result-object v0

    sput-object v0, Leu/c0;->y:[Leu/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Leu/c0;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Leu/c0;
    .locals 1

    const-class v0, Leu/c0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leu/c0;

    return-object p0
.end method

.method public static values()[Leu/c0;
    .locals 1

    sget-object v0, Leu/c0;->y:[Leu/c0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leu/c0;

    return-object v0
.end method
