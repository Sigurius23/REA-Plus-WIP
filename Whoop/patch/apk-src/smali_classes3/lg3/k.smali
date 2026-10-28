.class public final enum Llg3/k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# static fields
.field public static final enum w:Llg3/k;

.field public static final enum x:Llg3/k;

.field public static final enum y:Llg3/k;

.field public static final synthetic z:[Llg3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Llg3/k;

    const-string v1, "SENSITIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg3/k;->w:Llg3/k;

    new-instance v1, Llg3/k;

    const-string v2, "INSENSITIVE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llg3/k;->x:Llg3/k;

    new-instance v2, Llg3/k;

    const-string v3, "STRICT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Llg3/k;

    const-string v4, "LENIENT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Llg3/k;->y:Llg3/k;

    filled-new-array {v0, v1, v2, v3}, [Llg3/k;

    move-result-object v0

    sput-object v0, Llg3/k;->z:[Llg3/k;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llg3/k;
    .locals 1

    const-class v0, Llg3/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg3/k;

    return-object p0
.end method

.method public static values()[Llg3/k;
    .locals 1

    sget-object v0, Llg3/k;->z:[Llg3/k;

    invoke-virtual {v0}, [Llg3/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg3/k;

    return-object v0
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    const/4 v1, 0x0

    if-eq p2, v0, :cond_2

    const/4 v2, 0x2

    if-eq p2, v2, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    return p3

    :cond_0
    iput-boolean v1, p1, Llg3/q;->c:Z

    return p3

    :cond_1
    iput-boolean v0, p1, Llg3/q;->c:Z

    return p3

    :cond_2
    iput-boolean v1, p1, Llg3/q;->b:Z

    return p3

    :cond_3
    iput-boolean v0, p1, Llg3/q;->b:Z

    return p3
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "ParseStrict(false)"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unreachable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "ParseStrict(true)"

    return-object v0

    :cond_2
    const-string v0, "ParseCaseSensitive(false)"

    return-object v0

    :cond_3
    const-string v0, "ParseCaseSensitive(true)"

    return-object v0
.end method
