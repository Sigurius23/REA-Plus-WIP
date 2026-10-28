.class public final enum Lsz/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lsz/g;

.field public static final enum y:Lsz/g;

.field public static final synthetic z:[Lsz/g;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsz/g;

    const-string v1, "Production"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lsz/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lsz/g;->x:Lsz/g;

    new-instance v1, Lsz/g;

    const-string v2, "Test"

    const/4 v4, 0x3

    invoke-direct {v1, v2, v3, v4}, Lsz/g;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lsz/g;->y:Lsz/g;

    filled-new-array {v0, v1}, [Lsz/g;

    move-result-object v0

    sput-object v0, Lsz/g;->z:[Lsz/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lsz/g;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lsz/g;
    .locals 1

    const-class v0, Lsz/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsz/g;

    return-object p0
.end method

.method public static values()[Lsz/g;
    .locals 1

    sget-object v0, Lsz/g;->z:[Lsz/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsz/g;

    return-object v0
.end method
