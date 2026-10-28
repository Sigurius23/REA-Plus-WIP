.class public final Ljg3/c;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/j;
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final H:Ljg3/c;


# instance fields
.field public final F:J

.field public final G:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljg3/c;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3, v1}, Ljg3/c;-><init>(JI)V

    sput-object v0, Ljg3/c;->H:Ljg3/c;

    const-wide v0, -0x701cefeb9bec00L

    invoke-static {v0, v1, v2, v3}, Ljg3/c;->q0(JJ)Ljg3/c;

    const-wide v0, 0x701cd2fa9578ffL

    const-wide/32 v2, 0x3b9ac9ff

    invoke-static {v0, v1, v2, v3}, Ljg3/c;->q0(JJ)Ljg3/c;

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ljg3/c;->F:J

    iput p3, p0, Ljg3/c;->G:I

    return-void
.end method

.method public static o0(IJ)Ljg3/c;
    .locals 4

    int-to-long v0, p0

    or-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    sget-object p0, Ljg3/c;->H:Ljg3/c;

    return-object p0

    :cond_0
    const-wide v0, -0x701cefeb9bec00L

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x701cd2fa9578ffL

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    new-instance v0, Ljg3/c;

    invoke-direct {v0, p1, p2, p0}, Ljg3/c;-><init>(JI)V

    return-object v0

    :cond_1
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Instant exceeds minimum or maximum instant"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p0(Lng3/k;)Ljg3/c;
    .locals 4

    :try_start_0
    sget-object v0, Lng3/a;->e0:Lng3/a;

    invoke-interface {p0, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    sget-object v2, Lng3/a;->y:Lng3/a;

    invoke-interface {p0, v2}, Lng3/k;->f(Lng3/m;)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p0
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to obtain Instant from TemporalAccessor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static q0(JJ)Ljg3/c;
    .locals 2

    const-wide/32 v0, 0x3b9aca00

    invoke-static {p2, p3, v0, v1}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p0

    const v0, 0x3b9aca00

    invoke-static {v0, p2, p3}, Lcom/squareup/wire/n;->B(IJ)I

    move-result p2

    invoke-static {p2, p0, p1}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object p0

    return-object p0
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

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->e0:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->y:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->E:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->G:Lng3/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b(JLng3/m;)Lng3/j;
    .locals 5

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_5

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0, p1, p2}, Lng3/a;->f(J)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/c;->G:I

    iget-wide v2, p0, Ljg3/c;->F:J

    if-eqz v0, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v4, 0x4

    if-eq v0, v4, :cond_1

    const/16 v4, 0x1c

    if-ne v0, v4, :cond_0

    cmp-long p3, p1, v2

    if-eqz p3, :cond_4

    invoke-static {v1, p1, p2}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: "

    invoke-static {p2, p3}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    long-to-int p1, p1

    const p2, 0xf4240

    mul-int/2addr p1, p2

    if-eq p1, v1, :cond_4

    invoke-static {p1, v2, v3}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_2
    long-to-int p1, p1

    mul-int/lit16 p1, p1, 0x3e8

    if-eq p1, v1, :cond_4

    invoke-static {p1, v2, v3}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_3
    int-to-long v0, v1

    cmp-long p3, p1, v0

    if-eqz p3, :cond_4

    long-to-int p1, p1

    invoke-static {p1, v2, v3}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p0

    :cond_5
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/c;

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/c;->s0(JLng3/r;)Ljg3/c;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Ljg3/c;

    iget-wide v0, p0, Ljg3/c;->F:J

    iget-wide v2, p1, Ljg3/c;->F:J

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->q(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget v0, p0, Ljg3/c;->G:I

    iget p1, p1, Ljg3/c;->G:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->e0:Lng3/a;

    iget-wide v1, p0, Ljg3/c;->F:J

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->y:Lng3/a;

    iget v1, p0, Ljg3/c;->G:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/c;

    iget-wide v3, p0, Ljg3/c;->F:J

    iget-wide v5, p1, Ljg3/c;->F:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Ljg3/c;->G:I

    iget p1, p1, Ljg3/c;->G:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 3

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/c;->G:I

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    const p1, 0xf4240

    div-int/2addr v1, p1

    return v1

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    div-int/lit16 v1, v1, 0x3e8

    :cond_2
    return v1

    :cond_3
    invoke-super {p0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_0

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->g:Lng3/n;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->d:Lng3/o;

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
    .locals 3

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/c;->G:I

    if-eqz v0, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ljg3/c;->F:J

    return-wide v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const p1, 0xf4240

    div-int/2addr v1, p1

    :goto_0
    int-to-long v0, v1

    return-wide v0

    :cond_2
    div-int/lit16 v1, v1, 0x3e8

    goto :goto_0

    :cond_3
    int-to-long v0, v1

    return-wide v0

    :cond_4
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 5

    const/16 v0, 0x20

    iget-wide v1, p0, Ljg3/c;->F:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v0, v0

    iget v1, p0, Ljg3/c;->G:I

    mul-int/lit8 v1, v1, 0x33

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/c;->s0(JLng3/r;)Ljg3/c;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/c;->s0(JLng3/r;)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/c;->s0(JLng3/r;)Ljg3/c;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p1, p0}, Ljg3/d;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/c;

    return-object p1
.end method

.method public final r0(JJ)Ljg3/c;
    .locals 4

    or-long v0, p1, p3

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-wide v0, p0, Ljg3/c;->F:J

    invoke-static {v0, v1, p1, p2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x3b9aca00

    div-long v2, p3, v0

    invoke-static {p1, p2, v2, v3}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    rem-long/2addr p3, v0

    iget v0, p0, Ljg3/c;->G:I

    int-to-long v0, v0

    add-long/2addr v0, p3

    invoke-static {p1, p2, v0, v1}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1
.end method

.method public final s0(JLng3/r;)Ljg3/c;
    .locals 7

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lng3/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-wide/16 v1, 0x3e8

    const-wide/32 v3, 0xf4240

    const-wide/16 v5, 0x0

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
    const p3, 0x15180

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v5, v6}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p3, 0xa8c0

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v5, v6}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0xe10

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v5, v6}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0x3c

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v5, v6}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2, v5, v6}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    div-long v5, p1, v1

    rem-long/2addr p1, v1

    mul-long/2addr p1, v3

    invoke-virtual {p0, v5, v6, p1, p2}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    div-long v5, p1, v3

    rem-long/2addr p1, v3

    mul-long/2addr p1, v1

    invoke-virtual {p0, v5, v6, p1, p2}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, v5, v6, p1, p2}, Ljg3/c;->r0(JJ)Ljg3/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/c;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final t0()J
    .locals 9

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Ljg3/c;->F:J

    cmp-long v0, v2, v0

    const v1, 0xf4240

    iget v4, p0, Ljg3/c;->G:I

    const-wide/16 v5, 0x3e8

    if-ltz v0, :cond_0

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v2

    div-int/2addr v4, v1

    int-to-long v0, v4

    invoke-static {v2, v3, v0, v1}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v7, 0x1

    add-long/2addr v2, v7

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v2

    div-int/2addr v4, v1

    int-to-long v0, v4

    sub-long/2addr v5, v0

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Llg3/b;->i:Llg3/b;

    invoke-virtual {v0, p0}, Llg3/b;->a(Lce/w;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
