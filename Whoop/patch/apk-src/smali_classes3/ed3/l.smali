.class public final enum Led3/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Led3/l;

.field public static final enum F:Led3/l;

.field public static final enum G:Led3/l;

.field public static final enum H:Led3/l;

.field public static final synthetic I:[Led3/l;

.field public static final synthetic J:Lt83/b;

.field public static final x:Lkr/e;

.field public static final y:[Led3/l;

.field public static final enum z:Led3/l;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Led3/l;

    const/4 v1, -0x1

    const-string v2, "INVALID"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Led3/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Led3/l;->z:Led3/l;

    new-instance v1, Led3/l;

    const-string v2, "VARINT"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Led3/l;-><init>(Ljava/lang/String;II)V

    sput-object v1, Led3/l;->E:Led3/l;

    new-instance v2, Led3/l;

    const-string v5, "i64"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v4}, Led3/l;-><init>(Ljava/lang/String;II)V

    sput-object v2, Led3/l;->F:Led3/l;

    new-instance v4, Led3/l;

    const-string v5, "SIZE_DELIMITED"

    const/4 v7, 0x3

    invoke-direct {v4, v5, v7, v6}, Led3/l;-><init>(Ljava/lang/String;II)V

    sput-object v4, Led3/l;->G:Led3/l;

    new-instance v5, Led3/l;

    const/4 v6, 0x4

    const/4 v7, 0x5

    const-string v8, "i32"

    invoke-direct {v5, v8, v6, v7}, Led3/l;-><init>(Ljava/lang/String;II)V

    sput-object v5, Led3/l;->H:Led3/l;

    filled-new-array {v0, v1, v2, v4, v5}, [Led3/l;

    move-result-object v0

    sput-object v0, Led3/l;->I:[Led3/l;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Led3/l;->J:Lt83/b;

    new-instance v0, Lkr/e;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Led3/l;->x:Lkr/e;

    const/16 v0, 0x8

    new-array v1, v0, [Led3/l;

    :goto_0
    if-ge v3, v0, :cond_3

    sget-object v2, Led3/l;->J:Lt83/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, La0/i1;

    const/4 v5, 0x2

    invoke-direct {v4, v2, v5}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v4}, La0/i1;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v4}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Led3/l;

    iget v5, v5, Led3/l;->w:I

    if-ne v5, v3, :cond_0

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Led3/l;

    if-nez v2, :cond_2

    sget-object v2, Led3/l;->z:Led3/l;

    :cond_2
    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    sput-object v1, Led3/l;->y:[Led3/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Led3/l;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Led3/l;
    .locals 1

    const-class v0, Led3/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Led3/l;

    return-object p0
.end method

.method public static values()[Led3/l;
    .locals 1

    sget-object v0, Led3/l;->I:[Led3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Led3/l;

    return-object v0
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    shl-int/lit8 p1, p1, 0x3

    iget v0, p0, Led3/l;->w:I

    or-int/2addr p1, v0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Led3/l;->w:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
