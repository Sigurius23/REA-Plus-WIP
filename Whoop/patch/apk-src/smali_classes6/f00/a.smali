.class public final enum Lf00/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lf00/a;

.field public static final enum y:Lf00/a;

.field public static final synthetic z:[Lf00/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lf00/a;

    const/4 v1, 0x0

    const-string v2, "payment"

    const-string v3, "Payment"

    invoke-direct {v0, v3, v1, v2}, Lf00/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf00/a;->x:Lf00/a;

    new-instance v1, Lf00/a;

    const/4 v2, 0x1

    const-string v3, "setup"

    const-string v4, "Setup"

    invoke-direct {v1, v4, v2, v3}, Lf00/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lf00/a;->y:Lf00/a;

    filled-new-array {v0, v1}, [Lf00/a;

    move-result-object v0

    sput-object v0, Lf00/a;->z:[Lf00/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lf00/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf00/a;
    .locals 1

    const-class v0, Lf00/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf00/a;

    return-object p0
.end method

.method public static values()[Lf00/a;
    .locals 1

    sget-object v0, Lf00/a;->z:[Lf00/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf00/a;

    return-object v0
.end method
