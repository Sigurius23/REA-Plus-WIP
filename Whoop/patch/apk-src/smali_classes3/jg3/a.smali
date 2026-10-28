.class public final enum Ljg3/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lng3/k;
.implements Lng3/l;


# static fields
.field public static final enum w:Ljg3/a;

.field public static final enum x:Ljg3/a;

.field public static final y:[Ljg3/a;

.field public static final synthetic z:[Ljg3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ljg3/a;

    const-string v1, "MONDAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Ljg3/a;

    const-string v2, "TUESDAY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Ljg3/a;

    const-string v3, "WEDNESDAY"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ljg3/a;->w:Ljg3/a;

    new-instance v3, Ljg3/a;

    const-string v4, "THURSDAY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ljg3/a;->x:Ljg3/a;

    new-instance v4, Ljg3/a;

    const-string v5, "FRIDAY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v5, Ljg3/a;

    const-string v6, "SATURDAY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ljg3/a;

    const-string v7, "SUNDAY"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array/range {v0 .. v6}, [Ljg3/a;

    move-result-object v0

    sput-object v0, Ljg3/a;->z:[Ljg3/a;

    invoke-static {}, Ljg3/a;->values()[Ljg3/a;

    move-result-object v0

    sput-object v0, Ljg3/a;->y:[Ljg3/a;

    return-void
.end method

.method public static l(I)Ljg3/a;
    .locals 2

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/4 v1, 0x7

    if-gt p0, v1, :cond_0

    sget-object v1, Ljg3/a;->y:[Ljg3/a;

    sub-int/2addr p0, v0

    aget-object p0, v1, p0

    return-object p0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Invalid value for DayOfWeek: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg3/a;
    .locals 1

    const-class v0, Ljg3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg3/a;

    return-object p0
.end method

.method public static values()[Ljg3/a;
    .locals 1

    sget-object v0, Ljg3/a;->z:[Ljg3/a;

    invoke-virtual {v0}, [Ljg3/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg3/a;

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->R:Lng3/a;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 2

    sget-object v0, Lng3/a;->R:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-interface {p1}, Lng3/m;->range()Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->R:Lng3/a;

    invoke-virtual {p0}, Ljg3/a;->k()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lng3/m;)I
    .locals 3

    sget-object v0, Lng3/a;->R:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/a;->k()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Ljg3/a;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/a;->h(Lng3/m;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_0

    sget-object p1, Lng3/b;->y:Lng3/b;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->g:Lng3/n;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    sget-object v0, Lng3/a;->R:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/a;->k()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method
