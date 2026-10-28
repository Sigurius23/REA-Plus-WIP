.class public final enum Ll3/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ll3/k;

.field public static final enum F:Ll3/k;

.field public static final enum G:Ll3/k;

.field public static final synthetic H:[Ll3/k;

.field public static final enum w:Ll3/k;

.field public static final enum x:Ll3/k;

.field public static final enum y:Ll3/k;

.field public static final enum z:Ll3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ll3/k;

    const-string v1, "Paragraph"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll3/k;->w:Ll3/k;

    new-instance v1, Ll3/k;

    const-string v2, "Span"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll3/k;->x:Ll3/k;

    new-instance v2, Ll3/k;

    const-string v3, "VerbatimTts"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ll3/k;->y:Ll3/k;

    new-instance v3, Ll3/k;

    const-string v4, "Url"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll3/k;->z:Ll3/k;

    new-instance v4, Ll3/k;

    const-string v5, "Link"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ll3/k;->E:Ll3/k;

    new-instance v5, Ll3/k;

    const-string v6, "Clickable"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ll3/k;->F:Ll3/k;

    new-instance v6, Ll3/k;

    const-string v7, "String"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ll3/k;->G:Ll3/k;

    filled-new-array/range {v0 .. v6}, [Ll3/k;

    move-result-object v0

    sput-object v0, Ll3/k;->H:[Ll3/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll3/k;
    .locals 1

    const-class v0, Ll3/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll3/k;

    return-object p0
.end method

.method public static values()[Ll3/k;
    .locals 1

    sget-object v0, Ll3/k;->H:[Ll3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll3/k;

    return-object v0
.end method
