.class public abstract enum Lng3/g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lng3/m;


# static fields
.field public static final E:[I

.field public static final synthetic F:[Lng3/g;

.field public static final enum w:Lng3/c;

.field public static final enum x:Lng3/d;

.field public static final enum y:Lng3/e;

.field public static final enum z:Lng3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lng3/c;

    invoke-direct {v0}, Lng3/c;-><init>()V

    sput-object v0, Lng3/g;->w:Lng3/c;

    new-instance v1, Lng3/d;

    invoke-direct {v1}, Lng3/d;-><init>()V

    sput-object v1, Lng3/g;->x:Lng3/d;

    new-instance v2, Lng3/e;

    invoke-direct {v2}, Lng3/e;-><init>()V

    sput-object v2, Lng3/g;->y:Lng3/e;

    new-instance v3, Lng3/f;

    invoke-direct {v3}, Lng3/f;-><init>()V

    sput-object v3, Lng3/g;->z:Lng3/f;

    const/4 v4, 0x4

    new-array v4, v4, [Lng3/g;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    sput-object v4, Lng3/g;->F:[Lng3/g;

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lng3/g;->E:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x5a
        0xb5
        0x111
        0x0
        0x5b
        0xb6
        0x112
    .end array-data
.end method

.method public static f(Ljg3/d;)I
    .locals 5

    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    rsub-int/lit8 v0, v0, 0x3

    add-int/2addr v0, v1

    div-int/lit8 v3, v0, 0x7

    mul-int/lit8 v3, v3, 0x7

    sub-int/2addr v0, v3

    add-int/lit8 v3, v0, -0x3

    const/4 v4, -0x3

    if-ge v3, v4, :cond_0

    add-int/lit8 v3, v0, 0x4

    :cond_0
    if-ge v1, v3, :cond_2

    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result v0

    const/16 v1, 0xb4

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget p0, p0, Ljg3/d;->F:I

    invoke-static {p0, v1}, Ljg3/d;->v0(II)Ljg3/d;

    move-result-object p0

    :goto_0
    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Ljg3/d;->A0(J)Ljg3/d;

    move-result-object p0

    invoke-static {p0}, Lng3/g;->i(Ljg3/d;)Lng3/s;

    move-result-object p0

    iget-wide v0, p0, Lng3/s;->z:J

    long-to-int p0, v0

    return p0

    :cond_2
    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x7

    add-int/2addr v1, v2

    const/16 v0, 0x35

    if-ne v1, v0, :cond_4

    if-eq v3, v4, :cond_4

    const/4 v0, -0x2

    if-ne v3, v0, :cond_3

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v1
.end method

.method public static g(Ljg3/d;)I
    .locals 4

    iget v0, p0, Ljg3/d;->F:I

    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result v1

    const/4 v2, 0x3

    if-gt v1, v2, :cond_0

    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    sub-int/2addr v1, p0

    const/4 p0, -0x2

    if-ge v1, p0, :cond_1

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_0
    const/16 v2, 0x16b

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p0

    sub-int/2addr v1, p0

    sub-int/2addr v1, v3

    if-ltz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    return v0
.end method

.method public static h(I)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {p0, v0, v0}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object v0

    sget-object v1, Ljg3/a;->x:Ljg3/a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object v0

    sget-object v1, Ljg3/a;->w:Ljg3/a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0x34

    return p0

    :cond_1
    :goto_0
    const/16 p0, 0x35

    return p0
.end method

.method public static i(Ljg3/d;)Lng3/s;
    .locals 4

    invoke-static {p0}, Lng3/g;->g(Ljg3/d;)I

    move-result p0

    invoke-static {p0}, Lng3/g;->h(I)I

    move-result p0

    int-to-long v0, p0

    const-wide/16 v2, 0x1

    invoke-static {v2, v3, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lng3/g;
    .locals 1

    const-class v0, Lng3/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lng3/g;

    return-object p0
.end method

.method public static values()[Lng3/g;
    .locals 1

    sget-object v0, Lng3/g;->F:[Lng3/g;

    invoke-virtual {v0}, [Lng3/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lng3/g;

    return-object v0
.end method


# virtual methods
.method public a(Lng3/k;)Lng3/s;
    .locals 0

    invoke-virtual {p0}, Lng3/g;->range()Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/HashMap;Llg3/u;)Lng3/k;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final isDateBased()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
