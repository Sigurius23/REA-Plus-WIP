.class public final Ljg3/e;
.super Lkg3/b;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final H:Ljg3/e;

.field public static final I:Ljg3/e;

.field public static final J:Lg73/d;


# instance fields
.field public final F:Ljg3/d;

.field public final G:Ljg3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljg3/d;->I:Ljg3/d;

    sget-object v1, Ljg3/f;->J:Ljg3/f;

    invoke-static {v0, v1}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v0

    sput-object v0, Ljg3/e;->H:Ljg3/e;

    sget-object v0, Ljg3/d;->J:Ljg3/d;

    sget-object v1, Ljg3/f;->K:Ljg3/f;

    invoke-static {v0, v1}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v0

    sput-object v0, Ljg3/e;->I:Ljg3/e;

    new-instance v0, Lg73/d;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    sput-object v0, Ljg3/e;->J:Lg73/d;

    return-void
.end method

.method public constructor <init>(Ljg3/d;Ljg3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg3/e;->F:Ljg3/d;

    iput-object p2, p0, Ljg3/e;->G:Ljg3/f;

    return-void
.end method

.method public static r0(Lng3/k;)Ljg3/e;
    .locals 3

    instance-of v0, p0, Ljg3/e;

    if-eqz v0, :cond_0

    check-cast p0, Ljg3/e;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljg3/r;

    if-eqz v0, :cond_1

    check-cast p0, Ljg3/r;

    iget-object p0, p0, Ljg3/r;->F:Ljg3/e;

    return-object p0

    :cond_1
    :try_start_0
    invoke-static {p0}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object v0

    invoke-static {p0}, Ljg3/f;->q0(Lng3/k;)Ljg3/f;

    move-result-object v1

    new-instance v2, Ljg3/e;

    invoke-direct {v2, v0, v1}, Ljg3/e;-><init>(Ljg3/d;Ljg3/f;)V
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain LocalDateTime from TemporalAccessor: "

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

.method public static t0(Ljg3/d;Ljg3/f;)Ljg3/e;
    .locals 1

    const-string v0, "date"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljg3/e;

    invoke-direct {v0, p0, p1}, Ljg3/e;-><init>(Ljg3/d;Ljg3/f;)V

    return-object v0
.end method

.method public static u0(JILjg3/p;)Ljg3/e;
    .locals 4

    const-string v0, "offset"

    invoke-static {p3, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p3, Ljg3/p;->x:I

    int-to-long v0, p3

    add-long/2addr p0, v0

    const-wide/32 v0, 0x15180

    invoke-static {p0, p1, v0, v1}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v0

    const p3, 0x15180

    invoke-static {p3, p0, p1}, Lcom/squareup/wire/n;->B(IJ)I

    move-result p0

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    int-to-long v0, p0

    sget-object p0, Ljg3/f;->J:Ljg3/f;

    sget-object p0, Lng3/a;->J:Lng3/a;

    invoke-virtual {p0, v0, v1}, Lng3/a;->f(J)V

    sget-object p0, Lng3/a;->y:Lng3/a;

    int-to-long v2, p2

    invoke-virtual {p0, v2, v3}, Lng3/a;->f(J)V

    const-wide/16 v2, 0xe10

    div-long v2, v0, v2

    long-to-int p0, v2

    mul-int/lit16 p3, p0, 0xe10

    int-to-long v2, p3

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long v2, v0, v2

    long-to-int p3, v2

    mul-int/lit8 v2, p3, 0x3c

    int-to-long v2, v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {p0, p3, v0, p2}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p0

    new-instance p2, Ljg3/e;

    invoke-direct {p2, p1, p0}, Ljg3/e;-><init>(Ljg3/d;Ljg3/f;)V

    return-object p2
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    check-cast p1, Lng3/a;

    invoke-virtual {p1}, Lng3/a;->isDateBased()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lng3/a;->g()Z

    move-result p1

    if-eqz p1, :cond_2

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

    invoke-virtual {p0, p1, p2, p3}, Ljg3/e;->y0(JLng3/m;)Ljg3/e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkg3/b;

    invoke-virtual {p0, p1}, Ljg3/e;->p0(Lkg3/b;)I

    move-result p1

    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0, p1}, Ljg3/d;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->W:Lng3/a;

    iget-object v1, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v1}, Ljg3/d;->toEpochDay()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->z:Lng3/a;

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->C0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/e;

    iget-object v1, p0, Ljg3/e;->F:Ljg3/d;

    iget-object v3, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v1, v3}, Ljg3/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1, p1}, Ljg3/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->f(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0, p1}, Ljg3/d;->f(Lng3/m;)I

    move-result p1

    return p1

    :cond_1
    invoke-super {p0, p1}, Lce/w;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ljg3/e;->F:Ljg3/d;

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lkg3/b;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0, p1}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0}, Ljg3/d;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 1

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {p0, p1, v0}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p1

    return-object p1
.end method

.method public final p0(Lkg3/b;)I
    .locals 8

    instance-of v0, p1, Ljg3/e;

    if-eqz v0, :cond_0

    check-cast p1, Ljg3/e;

    invoke-virtual {p0, p1}, Ljg3/e;->q0(Ljg3/e;)I

    move-result p1

    return p1

    :cond_0
    move-object v0, p1

    check-cast v0, Ljg3/e;

    iget-object v1, v0, Ljg3/e;->F:Ljg3/d;

    const/4 v2, 0x0

    iget-object v3, p0, Ljg3/e;->F:Ljg3/d;

    if-eqz v1, :cond_1

    invoke-virtual {v3, v1}, Ljg3/d;->o0(Ljg3/d;)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljg3/d;->toEpochDay()J

    move-result-wide v4

    invoke-virtual {v1}, Ljg3/d;->toEpochDay()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Lcom/squareup/wire/n;->q(JJ)I

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    move v1, v2

    :cond_2
    :goto_0
    if-nez v1, :cond_4

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1, v0}, Ljg3/f;->o0(Ljg3/f;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v2

    :cond_3
    return v0

    :cond_4
    return v1
.end method

.method public final q0(Ljg3/e;)I
    .locals 2

    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    iget-object v1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0, v1}, Ljg3/d;->o0(Ljg3/d;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->o0(Ljg3/f;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final s0(Ljg3/e;)Z
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ljg3/e;->q0(Ljg3/e;)I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    iget-object v2, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v2}, Ljg3/d;->toEpochDay()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    if-nez v0, :cond_1

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->C0()J

    move-result-wide v0

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {p1}, Ljg3/f;->C0()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v1}, Ljg3/d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v0(JLng3/r;)Ljg3/e;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-object/from16 v1, p3

    instance-of v4, v1, Lng3/b;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Lng3/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    iget-object v5, v0, Ljg3/e;->G:Ljg3/f;

    iget-object v6, v0, Ljg3/e;->F:Ljg3/d;

    packed-switch v4, :pswitch_data_0

    invoke-virtual {v6, v2, v3, v1}, Ljg3/d;->w0(JLng3/r;)Ljg3/d;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_0
    const-wide/16 v7, 0x100

    div-long v9, v2, v7

    invoke-virtual {v6, v9, v10}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v9

    rem-long v1, v2, v7

    const-wide/16 v3, 0xc

    mul-long v11, v1, v3

    iget-object v10, v9, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v9 .. v18}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_1
    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    iget-object v1, v0, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v9}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_2
    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    iget-object v1, v0, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v2, 0x0

    move-wide/from16 v4, p1

    invoke-virtual/range {v0 .. v9}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_3
    invoke-virtual/range {p0 .. p2}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_4
    const-wide/32 v1, 0x5265c00

    div-long v3, p1, v1

    invoke-virtual {v6, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v6

    rem-long v1, p1, v1

    const-wide/32 v3, 0xf4240

    mul-long v14, v1, v3

    iget-object v7, v6, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v8, 0x0

    invoke-virtual/range {v6 .. v15}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_5
    const-wide v1, 0x141dd76000L

    div-long v3, p1, v1

    invoke-virtual {v6, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v6

    rem-long v1, p1, v1

    const-wide/16 v3, 0x3e8

    mul-long v14, v1, v3

    iget-object v7, v6, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v8, 0x0

    invoke-virtual/range {v6 .. v15}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :pswitch_6
    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget-object v1, v0, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v2, 0x0

    move-wide/from16 v8, p1

    invoke-virtual/range {v0 .. v9}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-interface {v1, v0, v2, v3}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object v1

    check-cast v1, Ljg3/e;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w0(J)Ljg3/e;
    .locals 10

    const-wide/16 v4, 0x0

    const-wide/16 v8, 0x0

    iget-object v1, p0, Ljg3/e;->F:Ljg3/d;

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-wide v6, p1

    invoke-virtual/range {v0 .. v9}, Ljg3/e;->x0(Ljg3/d;JJJJ)Ljg3/e;

    move-result-object p1

    return-object p1
.end method

.method public final x0(Ljg3/d;JJJJ)Ljg3/e;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    or-long v2, p2, p4

    or-long v2, v2, p6

    or-long v2, v2, p8

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    iget-object v3, v0, Ljg3/e;->G:Ljg3/f;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1, v3}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v1

    return-object v1

    :cond_0
    const-wide v4, 0x4e94914f0000L

    div-long v6, p8, v4

    const-wide/32 v8, 0x15180

    div-long v10, p6, v8

    add-long/2addr v10, v6

    const-wide/16 v6, 0x5a0

    div-long v12, p4, v6

    add-long/2addr v12, v10

    const-wide/16 v10, 0x18

    div-long v14, p2, v10

    add-long/2addr v14, v12

    const/4 v2, 0x1

    int-to-long v12, v2

    mul-long/2addr v14, v12

    rem-long v16, p8, v4

    rem-long v8, p6, v8

    const-wide/32 v18, 0x3b9aca00

    mul-long v8, v8, v18

    add-long v8, v8, v16

    rem-long v6, p4, v6

    const-wide v16, 0xdf8475800L

    mul-long v6, v6, v16

    add-long/2addr v6, v8

    rem-long v8, p2, v10

    const-wide v10, 0x34630b8a000L

    mul-long/2addr v8, v10

    add-long/2addr v8, v6

    invoke-virtual {v3}, Ljg3/f;->C0()J

    move-result-wide v6

    mul-long/2addr v8, v12

    add-long/2addr v8, v6

    invoke-static {v8, v9, v4, v5}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v10

    add-long/2addr v10, v14

    rem-long/2addr v8, v4

    add-long/2addr v8, v4

    rem-long/2addr v8, v4

    cmp-long v2, v8, v6

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v8, v9}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object v3

    :goto_0
    invoke-virtual {v1, v10, v11}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v1

    return-object v1
.end method

.method public final y0(JLng3/m;)Ljg3/e;
    .locals 3

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->g()Z

    move-result v0

    iget-object v1, p0, Ljg3/e;->G:Ljg3/f;

    iget-object v2, p0, Ljg3/e;->F:Ljg3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Ljg3/f;->E0(JLng3/m;)Ljg3/f;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v2, p1, p2, p3}, Ljg3/d;->C0(JLng3/m;)Ljg3/d;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/e;

    return-object p1
.end method

.method public final z0(Ljg3/d;Ljg3/f;)Ljg3/e;
    .locals 1

    iget-object v0, p0, Ljg3/e;->F:Ljg3/d;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ljg3/e;->G:Ljg3/f;

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljg3/e;

    invoke-direct {v0, p1, p2}, Ljg3/e;-><init>(Ljg3/d;Ljg3/f;)V

    return-object v0
.end method
