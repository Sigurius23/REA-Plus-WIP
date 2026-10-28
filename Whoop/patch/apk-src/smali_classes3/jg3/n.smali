.class public final Ljg3/n;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/j;
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic H:I


# instance fields
.field public final F:I

.field public final G:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Llg3/o;

    invoke-direct {v0}, Llg3/o;-><init>()V

    sget-object v1, Lng3/a;->c0:Lng3/a;

    const/16 v2, 0xa

    const/4 v3, 0x5

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v4, v2, v3}, Llg3/o;->h(Lng3/m;III)V

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Llg3/o;->c(C)V

    sget-object v1, Lng3/a;->Z:Lng3/a;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Llg3/o;->g(Lng3/m;I)V

    invoke-virtual {v0}, Llg3/o;->k()Llg3/b;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljg3/n;->F:I

    iput p2, p0, Ljg3/n;->G:I

    return-void
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

    const/16 v1, 0x44

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->c0:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->Z:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->a0:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->b0:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->d0:Lng3/a;

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

.method public final bridge synthetic b(JLng3/m;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/n;->s0(JLng3/m;)Ljg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/n;->o0(JLng3/r;)Ljg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ljg3/n;

    iget v0, p0, Ljg3/n;->F:I

    iget v1, p1, Ljg3/n;->F:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ljg3/n;->G:I

    iget p1, p1, Ljg3/n;->G:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 4

    sget-object v0, Lng3/a;->b0:Lng3/a;

    if-ne p1, v0, :cond_1

    iget p1, p0, Ljg3/n;->F:I

    const-wide/16 v0, 0x1

    if-gtz p1, :cond_0

    const-wide/32 v2, 0x3b9aca00

    :goto_0
    invoke-static {v0, v1, v2, v3}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/32 v2, 0x3b9ac9ff

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 5

    invoke-static {p1}, Lkg3/d;->a(Lng3/k;)Lkg3/d;

    move-result-object v0

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {v0, v1}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->a0:Lng3/a;

    iget v1, p0, Ljg3/n;->F:I

    int-to-long v1, v1

    const-wide/16 v3, 0xc

    mul-long/2addr v1, v3

    iget v3, p0, Ljg3/n;->G:I

    add-int/lit8 v3, v3, -0x1

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Adjustment only supported on ISO date-time"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/n;

    iget v1, p0, Ljg3/n;->F:I

    iget v3, p1, Ljg3/n;->F:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ljg3/n;->G:I

    iget p1, p1, Ljg3/n;->G:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 3

    invoke-virtual {p0, p1}, Ljg3/n;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/n;->h(Lng3/m;)J

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
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 8

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/n;->G:I

    iget v2, p0, Ljg3/n;->F:I

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-ge v2, v3, :cond_0

    const/4 v3, 0x0

    :cond_0
    int-to-long v0, v3

    return-wide v0

    :pswitch_1
    int-to-long v0, v2

    return-wide v0

    :pswitch_2
    if-ge v2, v3, :cond_1

    rsub-int/lit8 v2, v2, 0x1

    :cond_1
    int-to-long v0, v2

    return-wide v0

    :pswitch_3
    int-to-long v4, v2

    const-wide/16 v6, 0xc

    mul-long/2addr v4, v6

    sub-int/2addr v1, v3

    int-to-long v0, v1

    add-long/2addr v4, v0

    return-wide v4

    :pswitch_4
    int-to-long v0, v1

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ljg3/n;->G:I

    shl-int/lit8 v0, v0, 0x1b

    iget v1, p0, Ljg3/n;->F:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/n;->o0(JLng3/r;)Ljg3/n;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/n;->o0(JLng3/r;)Ljg3/n;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/n;->o0(JLng3/r;)Ljg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p1, p0}, Ljg3/d;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/n;

    return-object p1
.end method

.method public final o0(JLng3/r;)Ljg3/n;
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

    invoke-virtual {p0, p3}, Ljg3/n;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/n;->s0(JLng3/m;)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/16 p3, 0x3e8

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/n;->q0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0x64

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/n;->q0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0xa

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/n;->q0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ljg3/n;->q0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ljg3/n;->p0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/n;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p0(J)Ljg3/n;
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget v0, p0, Ljg3/n;->F:I

    int-to-long v0, v0

    const-wide/16 v2, 0xc

    mul-long/2addr v0, v2

    iget v4, p0, Ljg3/n;->G:I

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

    invoke-virtual {p0, p1, p2}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final q0(J)Ljg3/n;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget v1, p0, Ljg3/n;->F:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    iget-object p1, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {p1, v1, v2, v0}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    iget p2, p0, Ljg3/n;->G:I

    invoke-virtual {p0, p1, p2}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final r0(II)Ljg3/n;
    .locals 1

    iget v0, p0, Ljg3/n;->F:I

    if-ne v0, p1, :cond_0

    iget v0, p0, Ljg3/n;->G:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljg3/n;

    invoke-direct {v0, p1, p2}, Ljg3/n;-><init>(II)V

    return-object v0
.end method

.method public final s0(JLng3/m;)Ljg3/n;
    .locals 6

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0, p1, p2}, Lng3/a;->f(J)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/n;->G:I

    const/4 v2, 0x1

    iget v3, p0, Ljg3/n;->F:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: "

    invoke-static {p2, p3}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p3, Lng3/a;->d0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/n;->h(Lng3/m;)J

    move-result-wide v4

    cmp-long p1, v4, p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    sub-int/2addr v2, v3

    sget-object p1, Lng3/a;->c0:Lng3/a;

    int-to-long p2, v2

    invoke-virtual {p1, p2, p3}, Lng3/a;->f(J)V

    invoke-virtual {p0, v2, v1}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_1
    long-to-int p1, p1

    sget-object p2, Lng3/a;->c0:Lng3/a;

    int-to-long v2, p1

    invoke-virtual {p2, v2, v3}, Lng3/a;->f(J)V

    invoke-virtual {p0, p1, v1}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_2
    if-ge v3, v2, :cond_1

    const-wide/16 v2, 0x1

    sub-long p1, v2, p1

    :cond_1
    long-to-int p1, p1

    sget-object p2, Lng3/a;->c0:Lng3/a;

    int-to-long v2, p1

    invoke-virtual {p2, v2, v3}, Lng3/a;->f(J)V

    invoke-virtual {p0, p1, v1}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p3, Lng3/a;->a0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/n;->h(Lng3/m;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/n;->p0(J)Ljg3/n;

    move-result-object p1

    return-object p1

    :pswitch_4
    long-to-int p1, p1

    sget-object p2, Lng3/a;->Z:Lng3/a;

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Lng3/a;->f(J)V

    invoke-virtual {p0, v3, p1}, Ljg3/n;->r0(II)Ljg3/n;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/n;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Ljg3/n;->F:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v3, 0x3e8

    if-ge v1, v3, :cond_1

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
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v0, 0xa

    iget v1, p0, Ljg3/n;->G:I

    if-ge v1, v0, :cond_2

    const-string v0, "-0"

    goto :goto_1

    :cond_2
    const-string v0, "-"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
