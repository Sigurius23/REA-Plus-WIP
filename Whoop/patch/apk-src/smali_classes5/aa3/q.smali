.class public final enum Laa3/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Laa3/q;

.field public static final enum F:Laa3/q;

.field public static final enum G:Laa3/q;

.field public static final enum H:Laa3/q;

.field public static final synthetic I:[Laa3/q;

.field public static final synthetic J:Lt83/b;

.field public static final enum x:Laa3/q;

.field public static final enum y:Laa3/q;

.field public static final enum z:Laa3/q;


# instance fields
.field public final w:Lba3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Laa3/q;

    const-string v1, "CLASS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa3/q;->x:Laa3/q;

    new-instance v1, Laa3/q;

    const-string v2, "INTERFACE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v1, Laa3/q;->y:Laa3/q;

    new-instance v2, Laa3/q;

    const-string v3, "ENUM_CLASS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v2, Laa3/q;->z:Laa3/q;

    new-instance v3, Laa3/q;

    const-string v4, "ENUM_ENTRY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v3, Laa3/q;->E:Laa3/q;

    new-instance v4, Laa3/q;

    const-string v5, "ANNOTATION_CLASS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v4, Laa3/q;->F:Laa3/q;

    new-instance v5, Laa3/q;

    const-string v6, "OBJECT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v5, Laa3/q;->G:Laa3/q;

    new-instance v6, Laa3/q;

    const-string v7, "COMPANION_OBJECT"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Laa3/q;-><init>(Ljava/lang/String;II)V

    sput-object v6, Laa3/q;->H:Laa3/q;

    filled-new-array/range {v0 .. v6}, [Laa3/q;

    move-result-object v0

    sput-object v0, Laa3/q;->I:[Laa3/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Laa3/q;->J:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lba3/h;

    sget-object p2, Lsa3/d;->f:Lsa3/c;

    const-string v0, "CLASS_KIND"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lba3/h;-><init>(Lq1/j0;I)V

    iput-object p1, p0, Laa3/q;->w:Lba3/h;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laa3/q;
    .locals 1

    const-class v0, Laa3/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa3/q;

    return-object p0
.end method

.method public static values()[Laa3/q;
    .locals 1

    sget-object v0, Laa3/q;->I:[Laa3/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa3/q;

    return-object v0
.end method
