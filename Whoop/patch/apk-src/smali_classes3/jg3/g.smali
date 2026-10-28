.class public final enum Ljg3/g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lng3/k;
.implements Lng3/l;


# static fields
.field public static final enum w:Ljg3/g;

.field public static final x:[Ljg3/g;

.field public static final synthetic y:[Ljg3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Ljg3/g;

    const-string v1, "JANUARY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Ljg3/g;

    const-string v2, "FEBRUARY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljg3/g;->w:Ljg3/g;

    new-instance v2, Ljg3/g;

    const-string v3, "MARCH"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Ljg3/g;

    const-string v4, "APRIL"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, Ljg3/g;

    const-string v5, "MAY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v5, Ljg3/g;

    const-string v6, "JUNE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ljg3/g;

    const-string v7, "JULY"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v7, Ljg3/g;

    const-string v8, "AUGUST"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v8, Ljg3/g;

    const-string v9, "SEPTEMBER"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v9, Ljg3/g;

    const-string v10, "OCTOBER"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v10, Ljg3/g;

    const-string v11, "NOVEMBER"

    const/16 v12, 0xa

    invoke-direct {v10, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v11, Ljg3/g;

    const-string v12, "DECEMBER"

    const/16 v13, 0xb

    invoke-direct {v11, v12, v13}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array/range {v0 .. v11}, [Ljg3/g;

    move-result-object v0

    sput-object v0, Ljg3/g;->y:[Ljg3/g;

    invoke-static {}, Ljg3/g;->values()[Ljg3/g;

    move-result-object v0

    sput-object v0, Ljg3/g;->x:[Ljg3/g;

    return-void
.end method

.method public static o(I)Ljg3/g;
    .locals 2

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/16 v1, 0xc

    if-gt p0, v1, :cond_0

    sget-object v1, Ljg3/g;->x:[Ljg3/g;

    sub-int/2addr p0, v0

    aget-object p0, v1, p0

    return-object p0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Invalid value for MonthOfYear: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg3/g;
    .locals 1

    const-class v0, Ljg3/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg3/g;

    return-object p0
.end method

.method public static values()[Ljg3/g;
    .locals 1

    sget-object v0, Ljg3/g;->y:[Ljg3/g;

    invoke-virtual {v0}, [Ljg3/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg3/g;

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

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

    sget-object v0, Lng3/a;->Z:Lng3/a;

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

    invoke-static {p1}, Lkg3/d;->a(Lng3/k;)Lkg3/d;

    move-result-object v0

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {v0, v1}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

    invoke-virtual {p0}, Ljg3/g;->l()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Adjustment only supported on ISO date-time"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lng3/m;)I
    .locals 3

    sget-object v0, Lng3/a;->Z:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/g;->l()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Ljg3/g;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/g;->h(Lng3/m;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_1

    sget-object p1, Lng3/b;->E:Lng3/b;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->g:Lng3/n;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    sget-object v0, Lng3/a;->Z:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/g;->l()I

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

.method public final k(Z)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    add-int/lit16 p1, p1, 0x14f

    return p1

    :pswitch_0
    add-int/lit16 p1, p1, 0x131

    return p1

    :pswitch_1
    add-int/lit16 p1, p1, 0x112

    return p1

    :pswitch_2
    add-int/lit16 p1, p1, 0xf4

    return p1

    :pswitch_3
    add-int/lit16 p1, p1, 0xd5

    return p1

    :pswitch_4
    add-int/lit16 p1, p1, 0xb6

    return p1

    :pswitch_5
    add-int/lit16 p1, p1, 0x98

    return p1

    :pswitch_6
    add-int/lit8 p1, p1, 0x79

    return p1

    :pswitch_7
    add-int/lit8 p1, p1, 0x5b

    return p1

    :pswitch_8
    add-int/lit8 p1, p1, 0x3c

    return p1

    :pswitch_9
    const/16 p1, 0x20

    return p1

    :pswitch_a
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final m(Z)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/16 p1, 0x8

    if-eq v0, p1, :cond_0

    const/16 p1, 0xa

    if-eq v0, p1, :cond_0

    const/16 p1, 0x1f

    return p1

    :cond_0
    const/16 p1, 0x1e

    return p1

    :cond_1
    if-eqz p1, :cond_2

    const/16 p1, 0x1d

    return p1

    :cond_2
    const/16 p1, 0x1c

    return p1
.end method

.method public final n()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v0, 0x1f

    return v0

    :cond_0
    const/16 v0, 0x1e

    return v0

    :cond_1
    const/16 v0, 0x1d

    return v0
.end method
