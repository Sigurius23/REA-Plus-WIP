.class public final Ljg3/d;
.super Lkg3/a;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final I:Ljg3/d;

.field public static final J:Ljg3/d;

.field public static final K:Lg73/a;


# instance fields
.field public final F:I

.field public final G:S

.field public final H:S


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v0, -0x3b9ac9ff

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v0

    sput-object v0, Ljg3/d;->I:Ljg3/d;

    const/16 v0, 0xc

    const/16 v1, 0x1f

    const v2, 0x3b9ac9ff

    invoke-static {v2, v0, v1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v0

    sput-object v0, Ljg3/d;->J:Ljg3/d;

    new-instance v0, Lg73/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    sput-object v0, Ljg3/d;->K:Lg73/a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljg3/d;->F:I

    int-to-short p1, p2

    iput-short p1, p0, Ljg3/d;->G:S

    int-to-short p1, p3

    iput-short p1, p0, Ljg3/d;->H:S

    return-void
.end method

.method public static B0(III)Ljg3/d;
    .locals 2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x1e

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    goto :goto_1

    :cond_1
    sget-object v0, Lkg3/e;->w:Lkg3/e;

    int-to-long v0, p0

    invoke-static {v0, v1}, Lkg3/e;->isLeapYear(J)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x1d

    goto :goto_0

    :cond_2
    const/16 v0, 0x1c

    :goto_0
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    :goto_1
    invoke-static {p0, p1, p2}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    return-object p0
.end method

.method public static p0(ILjg3/g;I)Ljg3/d;
    .locals 2

    const/16 v0, 0x1c

    if-le p2, v0, :cond_1

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    int-to-long v0, p0

    invoke-static {v0, v1}, Lkg3/e;->isLeapYear(J)Z

    move-result v0

    invoke-virtual {p1, v0}, Ljg3/g;->m(Z)I

    move-result v0

    if-le p2, v0, :cond_1

    const/16 v0, 0x1d

    if-ne p2, v0, :cond_0

    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string p2, "Invalid date \'February 29\' as \'"

    const-string v0, "\' is not a leap year"

    invoke-static {p0, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid date \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljg3/d;

    invoke-virtual {p1}, Ljg3/g;->l()I

    move-result p1

    invoke-direct {v0, p0, p1, p2}, Ljg3/d;-><init>(III)V

    return-object v0
.end method

.method public static q0(Lng3/k;)Ljg3/d;
    .locals 3

    sget-object v0, Lng3/p;->f:Lng3/o;

    invoke-interface {p0, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg3/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain LocalDate from TemporalAccessor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static t0(III)Ljg3/d;
    .locals 3

    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->Z:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->U:Lng3/a;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    invoke-static {p1}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object p1

    invoke-static {p0, p1, p2}, Ljg3/d;->p0(ILjg3/g;I)Ljg3/d;

    move-result-object p0

    return-object p0
.end method

.method public static u0(J)Ljg3/d;
    .locals 23

    move-wide/from16 v0, p0

    sget-object v2, Lng3/a;->W:Lng3/a;

    invoke-virtual {v2, v0, v1}, Lng3/a;->f(J)V

    const-wide/32 v2, 0xafa6c

    add-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    const-wide/16 v7, 0x1

    const-wide/32 v9, 0x23ab1

    const-wide/16 v11, 0x190

    if-gez v6, :cond_0

    const-wide/32 v13, 0xafa6d

    add-long/2addr v0, v13

    div-long/2addr v0, v9

    sub-long/2addr v0, v7

    mul-long v13, v0, v11

    neg-long v0, v0

    mul-long/2addr v0, v9

    add-long/2addr v2, v0

    goto :goto_0

    :cond_0
    move-wide v13, v4

    :goto_0
    mul-long v0, v2, v11

    const-wide/16 v15, 0x24f

    add-long/2addr v0, v15

    div-long/2addr v0, v9

    const-wide/16 v9, 0x16d

    mul-long v15, v0, v9

    const-wide/16 v17, 0x4

    div-long v19, v0, v17

    add-long v19, v19, v15

    const-wide/16 v15, 0x64

    div-long v21, v0, v15

    sub-long v19, v19, v21

    div-long v21, v0, v11

    add-long v21, v21, v19

    sub-long v19, v2, v21

    cmp-long v4, v19, v4

    if-gez v4, :cond_1

    sub-long/2addr v0, v7

    mul-long/2addr v9, v0

    div-long v4, v0, v17

    add-long/2addr v4, v9

    div-long v6, v0, v15

    sub-long/2addr v4, v6

    div-long v6, v0, v11

    add-long/2addr v6, v4

    sub-long v19, v2, v6

    :cond_1
    move-wide/from16 v2, v19

    add-long/2addr v0, v13

    long-to-int v2, v2

    mul-int/lit8 v3, v2, 0x5

    add-int/lit8 v3, v3, 0x2

    div-int/lit16 v3, v3, 0x99

    add-int/lit8 v4, v3, 0x2

    rem-int/lit8 v4, v4, 0xc

    add-int/lit8 v4, v4, 0x1

    mul-int/lit16 v5, v3, 0x132

    add-int/lit8 v5, v5, 0x5

    div-int/lit8 v5, v5, 0xa

    sub-int/2addr v2, v5

    add-int/lit8 v2, v2, 0x1

    div-int/lit8 v3, v3, 0xa

    int-to-long v5, v3

    add-long/2addr v0, v5

    sget-object v3, Lng3/a;->c0:Lng3/a;

    iget-object v5, v3, Lng3/a;->x:Lng3/s;

    invoke-virtual {v5, v0, v1, v3}, Lng3/s;->a(JLng3/m;)I

    move-result v0

    new-instance v1, Ljg3/d;

    invoke-direct {v1, v0, v4, v2}, Ljg3/d;-><init>(III)V

    return-object v1
.end method

.method public static v0(II)Ljg3/d;
    .locals 5

    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->V:Lng3/a;

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Lng3/a;->f(J)V

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    invoke-static {v1, v2}, Lkg3/e;->isLeapYear(J)Z

    move-result v0

    const/16 v1, 0x16e

    if-ne p1, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Invalid date \'DayOfYear 366\' as \'"

    const-string v1, "\' is not a leap year"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljg3/g;->k(Z)I

    move-result v2

    invoke-virtual {v1, v0}, Ljg3/g;->m(Z)I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, -0x1

    if-le p1, v3, :cond_2

    const-wide/16 v2, 0x1

    long-to-int v2, v2

    sget-object v3, Ljg3/g;->x:[Ljg3/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v2, v2, 0xc

    add-int/2addr v2, v1

    rem-int/lit8 v2, v2, 0xc

    aget-object v1, v3, v2

    :cond_2
    invoke-virtual {v1, v0}, Ljg3/g;->k(Z)I

    move-result v0

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, v1, p1}, Ljg3/d;->p0(ILjg3/g;I)Ljg3/d;

    move-result-object p0

    return-object p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final A0(J)Ljg3/d;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget v1, p0, Ljg3/d;->F:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    iget-object p1, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {p1, v1, v2, v0}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    iget-short p2, p0, Ljg3/d;->G:S

    iget-short v0, p0, Ljg3/d;->H:S

    invoke-static {p1, p2, v0}, Ljg3/d;->B0(III)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final C0(JLng3/m;)Ljg3/d;
    .locals 5

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_5

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0, p1, p2}, Lng3/a;->f(J)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-short v1, p0, Ljg3/d;->H:S

    iget-short v2, p0, Ljg3/d;->G:S

    const/4 v3, 0x1

    iget v4, p0, Ljg3/d;->F:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: "

    invoke-static {p2, p3}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p3, Lng3/a;->d0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    sub-int/2addr v3, v4

    invoke-virtual {p0, v3}, Ljg3/d;->E0(I)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    long-to-int p1, p1

    invoke-virtual {p0, p1}, Ljg3/d;->E0(I)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    if-lt v4, v3, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1

    sub-long p1, v0, p1

    :goto_0
    long-to-int p1, p1

    invoke-virtual {p0, p1}, Ljg3/d;->E0(I)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p3, Lng3/a;->a0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_4
    long-to-int p1, p1

    if-ne v2, p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p2, Lng3/a;->Z:Lng3/a;

    int-to-long v2, p1

    invoke-virtual {p2, v2, v3}, Lng3/a;->f(J)V

    invoke-static {v4, p1, v1}, Ljg3/d;->B0(III)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object p3, Lng3/a;->Y:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_6
    sget-object p3, Lng3/a;->X:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_8
    long-to-int p1, p1

    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result p2

    if-ne p2, p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v4, p1}, Ljg3/d;->v0(II)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_9
    long-to-int p1, p1

    if-ne v1, p1, :cond_4

    :goto_1
    return-object p0

    :cond_4
    invoke-static {v4, v2, p1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_a
    sget-object p3, Lng3/a;->T:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_b
    sget-object p3, Lng3/a;->S:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg3/a;->k()I

    move-result p3

    int-to-long v0, p3

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/d;

    return-object p1

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_c
        :pswitch_b
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

.method public final D0(Lng3/l;)Ljg3/d;
    .locals 1

    instance-of v0, p1, Ljg3/d;

    if-eqz v0, :cond_0

    check-cast p1, Ljg3/d;

    return-object p1

    :cond_0
    invoke-interface {p1, p0}, Lng3/l;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/d;

    return-object p1
.end method

.method public final E0(I)Ljg3/d;
    .locals 3

    iget v0, p0, Ljg3/d;->F:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    iget-short v0, p0, Ljg3/d;->G:S

    iget-short v1, p0, Ljg3/d;->H:S

    invoke-static {p1, v0, v1}, Ljg3/d;->B0(III)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    check-cast p1, Lng3/a;

    invoke-virtual {p1}, Lng3/a;->isDateBased()Z

    move-result p1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic b(JLng3/m;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/d;->C0(JLng3/m;)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/d;->w0(JLng3/r;)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lkg3/a;

    instance-of v0, p1, Ljg3/d;

    if-eqz v0, :cond_0

    check-cast p1, Ljg3/d;

    invoke-virtual {p0, p1}, Ljg3/d;->o0(Ljg3/d;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    invoke-virtual {p1}, Lkg3/a;->toEpochDay()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->q(JJ)I

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    const/4 p1, 0x0

    :cond_1
    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 5

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/16 v1, 0x12

    iget-short v2, p0, Ljg3/d;->G:S

    const-wide/16 v3, 0x1

    if-eq p1, v1, :cond_6

    const/16 v1, 0x13

    if-eq p1, v1, :cond_4

    const/16 v1, 0x15

    if-eq p1, v1, :cond_2

    const/16 v1, 0x19

    if-eq p1, v1, :cond_0

    iget-object p1, v0, Lng3/a;->x:Lng3/s;

    return-object p1

    :cond_0
    iget p1, p0, Ljg3/d;->F:I

    if-gtz p1, :cond_1

    const-wide/32 v0, 0x3b9aca00

    invoke-static {v3, v4, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    const-wide/32 v0, 0x3b9ac9ff

    invoke-static {v3, v4, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {v2}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object p1

    sget-object v0, Ljg3/g;->w:Ljg3/g;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p1

    if-nez p1, :cond_3

    const-wide/16 v0, 0x4

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x5

    :goto_0
    invoke-static {v3, v4, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0x16e

    goto :goto_1

    :cond_5
    const/16 p1, 0x16d

    :goto_1
    int-to-long v0, p1

    invoke-static {v3, v4, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p1, 0x2

    if-eq v2, p1, :cond_8

    const/4 p1, 0x4

    if-eq v2, p1, :cond_7

    const/4 p1, 0x6

    if-eq v2, p1, :cond_7

    const/16 p1, 0x9

    if-eq v2, p1, :cond_7

    const/16 p1, 0xb

    if-eq v2, p1, :cond_7

    const/16 p1, 0x1f

    goto :goto_2

    :cond_7
    const/16 p1, 0x1e

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result p1

    if-eqz p1, :cond_9

    const/16 p1, 0x1d

    goto :goto_2

    :cond_9
    const/16 p1, 0x1c

    :goto_2
    int-to-long v0, p1

    invoke-static {v3, v4, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->W:Lng3/a;

    invoke-virtual {p0}, Ljg3/d;->toEpochDay()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/d;

    invoke-virtual {p0, p1}, Ljg3/d;->o0(Ljg3/d;)I

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ljg3/d;->r0(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lce/w;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lkg3/a;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getDayOfYear()I
    .locals 2

    iget-short v0, p0, Ljg3/d;->G:S

    invoke-static {v0}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object v0

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljg3/g;->k(Z)I

    move-result v0

    iget-short v1, p0, Ljg3/d;->H:S

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final h(Lng3/m;)J
    .locals 4

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    sget-object v0, Lng3/a;->W:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-object v0, Lng3/a;->a0:Lng3/a;

    if-ne p1, v0, :cond_1

    iget p1, p0, Ljg3/d;->F:I

    int-to-long v0, p1

    const-wide/16 v2, 0xc

    mul-long/2addr v0, v2

    iget-short p1, p0, Ljg3/d;->G:S

    add-int/lit8 p1, p1, -0x1

    int-to-long v2, p1

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    invoke-virtual {p0, p1}, Ljg3/d;->r0(Lng3/m;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Ljg3/d;->F:I

    and-int/lit16 v1, v0, -0x800

    shl-int/lit8 v0, v0, 0xb

    iget-short v2, p0, Ljg3/d;->G:S

    shl-int/lit8 v2, v2, 0x6

    add-int/2addr v0, v2

    iget-short v2, p0, Ljg3/d;->H:S

    add-int/2addr v0, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/d;->w0(JLng3/r;)Ljg3/d;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/d;->w0(JLng3/r;)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/d;->w0(JLng3/r;)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final isLeapYear()Z
    .locals 2

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    iget v0, p0, Ljg3/d;->F:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Lkg3/e;->isLeapYear(J)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1}, Ljg3/d;->D0(Lng3/l;)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final o0(Ljg3/d;)I
    .locals 2

    iget v0, p0, Ljg3/d;->F:I

    iget v1, p1, Ljg3/d;->F:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget-short v0, p0, Ljg3/d;->G:S

    iget-short v1, p1, Ljg3/d;->G:S

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget-short v0, p0, Ljg3/d;->H:S

    iget-short p1, p1, Ljg3/d;->H:S

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final r0(Lng3/m;)I
    .locals 5

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v1, "Field too large for an int: "

    iget-short v2, p0, Ljg3/d;->H:S

    iget v3, p0, Ljg3/d;->F:I

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-lt v3, v4, :cond_0

    return v4

    :cond_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    return v3

    :pswitch_2
    if-lt v3, v4, :cond_1

    return v3

    :cond_1
    sub-int/2addr v4, v3

    return v4

    :pswitch_3
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    iget-short p1, p0, Ljg3/d;->G:S

    return p1

    :pswitch_5
    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result p1

    sub-int/2addr p1, v4

    div-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v4

    return p1

    :pswitch_6
    sub-int/2addr v2, v4

    div-int/lit8 v2, v2, 0x7

    :goto_0
    add-int/2addr v2, v4

    return v2

    :pswitch_7
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_8
    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result p1

    return p1

    :pswitch_9
    return v2

    :pswitch_a
    invoke-virtual {p0}, Ljg3/d;->getDayOfYear()I

    move-result p1

    sub-int/2addr p1, v4

    rem-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v4

    return p1

    :pswitch_b
    sub-int/2addr v2, v4

    rem-int/lit8 v2, v2, 0x7

    goto :goto_0

    :pswitch_c
    invoke-virtual {p0}, Ljg3/d;->s0()Ljg3/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg3/a;->k()I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_c
        :pswitch_b
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

.method public final s0()Ljg3/a;
    .locals 4

    invoke-virtual {p0}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    const/4 v2, 0x7

    invoke-static {v2, v0, v1}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljg3/a;->l(I)Ljg3/a;

    move-result-object v0

    return-object v0
.end method

.method public final toEpochDay()J
    .locals 12

    iget v0, p0, Ljg3/d;->F:I

    int-to-long v0, v0

    iget-short v2, p0, Ljg3/d;->G:S

    int-to-long v2, v2

    const-wide/16 v4, 0x16d

    mul-long/2addr v4, v0

    const-wide/16 v6, 0x0

    cmp-long v6, v0, v6

    if-ltz v6, :cond_0

    const-wide/16 v6, 0x3

    add-long/2addr v6, v0

    const-wide/16 v8, 0x4

    div-long/2addr v6, v8

    const-wide/16 v8, 0x63

    add-long/2addr v8, v0

    const-wide/16 v10, 0x64

    div-long/2addr v8, v10

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x18f

    add-long/2addr v0, v8

    const-wide/16 v8, 0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    add-long/2addr v0, v4

    goto :goto_0

    :cond_0
    const-wide/16 v6, -0x4

    div-long v6, v0, v6

    const-wide/16 v8, -0x64

    div-long v8, v0, v8

    sub-long/2addr v6, v8

    const-wide/16 v8, -0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    sub-long v0, v4, v0

    :goto_0
    const-wide/16 v4, 0x16f

    mul-long/2addr v4, v2

    const-wide/16 v6, 0x16a

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xc

    div-long/2addr v4, v6

    add-long/2addr v4, v0

    iget-short v0, p0, Ljg3/d;->H:S

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    add-long/2addr v4, v0

    const-wide/16 v0, 0x2

    cmp-long v2, v2, v0

    if-lez v2, :cond_2

    const-wide/16 v2, 0x1

    sub-long v2, v4, v2

    invoke-virtual {p0}, Ljg3/d;->isLeapYear()Z

    move-result v6

    if-nez v6, :cond_1

    sub-long/2addr v4, v0

    goto :goto_1

    :cond_1
    move-wide v4, v2

    :cond_2
    :goto_1
    const-wide/32 v0, 0xafaa8

    sub-long/2addr v4, v0

    return-wide v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Ljg3/d;->F:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v4, 0x3e8

    if-ge v1, v4, :cond_1

    if-gez v0, :cond_0

    add-int/lit16 v0, v0, -0x2710

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v0, 0x2710

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 v1, 0x270f

    if-le v0, v1, :cond_2

    const/16 v1, 0x2b

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, "-"

    const-string v1, "-0"

    iget-short v4, p0, Ljg3/d;->G:S

    if-ge v4, v3, :cond_3

    move-object v5, v1

    goto :goto_1

    :cond_3
    move-object v5, v0

    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-short v4, p0, Ljg3/d;->H:S

    if-ge v4, v3, :cond_4

    move-object v0, v1

    :cond_4
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w0(JLng3/r;)Ljg3/d;
    .locals 2

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lng3/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p3, Lng3/a;->d0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/d;->C0(JLng3/m;)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/16 p3, 0x3e8

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/d;->A0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0x64

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/d;->A0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0xa

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/d;->A0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ljg3/d;->A0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p1, p2}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/d;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x7
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

.method public final x0(J)Ljg3/d;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final y0(J)Ljg3/d;
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget v0, p0, Ljg3/d;->F:I

    int-to-long v0, v0

    const-wide/16 v2, 0xc

    mul-long/2addr v0, v2

    iget-short v4, p0, Ljg3/d;->G:S

    add-int/lit8 v4, v4, -0x1

    int-to-long v4, v4

    add-long/2addr v0, v4

    add-long/2addr v0, p1

    sget-object p1, Lng3/a;->c0:Lng3/a;

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    iget-object p2, p1, Lng3/a;->x:Lng3/s;

    invoke-virtual {p2, v2, v3, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    const/16 p2, 0xc

    invoke-static {p2, v0, v1}, Lcom/squareup/wire/n;->B(IJ)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iget-short v0, p0, Ljg3/d;->H:S

    invoke-static {p1, p2, v0}, Ljg3/d;->B0(III)Ljg3/d;

    move-result-object p1

    return-object p1
.end method

.method public final z0(J)Ljg3/d;
    .locals 1

    const/4 v0, 0x7

    invoke-static {p1, p2, v0}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p1

    return-object p1
.end method
