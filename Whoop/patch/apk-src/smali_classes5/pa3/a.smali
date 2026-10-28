.class public final enum Lpa3/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lpa3/a;

.field public static final enum F:Lpa3/a;

.field public static final enum G:Lpa3/a;

.field public static final enum H:Lpa3/a;

.field public static final enum I:Lpa3/a;

.field public static final synthetic J:[Lpa3/a;

.field public static final x:Ljc/a;

.field public static final y:Ljava/util/LinkedHashMap;

.field public static final enum z:Lpa3/a;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lpa3/a;

    const-string v1, "UNKNOWN"

    const/4 v6, 0x0

    invoke-direct {v0, v1, v6, v6}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpa3/a;->z:Lpa3/a;

    new-instance v1, Lpa3/a;

    const-string v2, "CLASS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lpa3/a;->E:Lpa3/a;

    new-instance v2, Lpa3/a;

    const-string v3, "FILE_FACADE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lpa3/a;->F:Lpa3/a;

    new-instance v3, Lpa3/a;

    const-string v4, "SYNTHETIC_CLASS"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lpa3/a;->G:Lpa3/a;

    new-instance v4, Lpa3/a;

    const-string v5, "MULTIFILE_CLASS"

    const/4 v7, 0x4

    invoke-direct {v4, v5, v7, v7}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lpa3/a;->H:Lpa3/a;

    new-instance v5, Lpa3/a;

    const-string v7, "MULTIFILE_CLASS_PART"

    const/4 v8, 0x5

    invoke-direct {v5, v7, v8, v8}, Lpa3/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lpa3/a;->I:Lpa3/a;

    filled-new-array/range {v0 .. v5}, [Lpa3/a;

    move-result-object v0

    sput-object v0, Lpa3/a;->J:[Lpa3/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Ljc/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lpa3/a;->x:Ljc/a;

    invoke-static {}, Lpa3/a;->values()[Lpa3/a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v6, v1, :cond_1

    aget-object v3, v0, v6

    iget v4, v3, Lpa3/a;->w:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, Lpa3/a;->y:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpa3/a;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpa3/a;
    .locals 1

    const-class v0, Lpa3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpa3/a;

    return-object p0
.end method

.method public static values()[Lpa3/a;
    .locals 1

    sget-object v0, Lpa3/a;->J:[Lpa3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpa3/a;

    return-object v0
.end method
