.class public final enum Lta3/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lwa3/q;


# static fields
.field public static final synthetic E:[Lta3/i;

.field public static final enum x:Lta3/i;

.field public static final enum y:Lta3/i;

.field public static final enum z:Lta3/i;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lta3/i;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lta3/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lta3/i;->x:Lta3/i;

    new-instance v1, Lta3/i;

    const-string v2, "INTERNAL_TO_CLASS_ID"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lta3/i;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lta3/i;->y:Lta3/i;

    new-instance v2, Lta3/i;

    const-string v3, "DESC_TO_CLASS_ID"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lta3/i;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lta3/i;->z:Lta3/i;

    filled-new-array {v0, v1, v2}, [Lta3/i;

    move-result-object v0

    sput-object v0, Lta3/i;->E:[Lta3/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lta3/i;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lta3/i;
    .locals 1

    const-class v0, Lta3/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lta3/i;

    return-object p0
.end method

.method public static values()[Lta3/i;
    .locals 1

    sget-object v0, Lta3/i;->E:[Lta3/i;

    invoke-virtual {v0}, [Lta3/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lta3/i;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lta3/i;->w:I

    return v0
.end method
