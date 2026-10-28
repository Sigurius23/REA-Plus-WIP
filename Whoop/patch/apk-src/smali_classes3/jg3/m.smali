.class public final Ljg3/m;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/j;
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic G:I


# instance fields
.field public final F:I


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

    invoke-virtual {v0}, Llg3/o;->k()Llg3/b;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljg3/m;->F:I

    return-void
.end method

.method public static o0(I)Ljg3/m;
    .locals 3

    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    new-instance v0, Ljg3/m;

    invoke-direct {v0, p0}, Ljg3/m;-><init>(I)V

    return-object v0
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

    const/16 v1, 0x43

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

    invoke-virtual {p0, p1, p2, p3}, Ljg3/m;->r0(JLng3/m;)Ljg3/m;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/m;->p0(JLng3/r;)Ljg3/m;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljg3/m;

    iget v0, p0, Ljg3/m;->F:I

    iget p1, p1, Ljg3/m;->F:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 4

    sget-object v0, Lng3/a;->b0:Lng3/a;

    if-ne p1, v0, :cond_1

    iget p1, p0, Ljg3/m;->F:I

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
    .locals 3

    invoke-static {p1}, Lkg3/d;->a(Lng3/k;)Lkg3/d;

    move-result-object v0

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {v0, v1}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget v1, p0, Ljg3/m;->F:I

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/m;

    iget p1, p1, Ljg3/m;->F:I

    iget v1, p0, Ljg3/m;->F:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 3

    invoke-virtual {p0, p1}, Ljg3/m;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/m;->h(Lng3/m;)J

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

    sget-object p1, Lng3/b;->F:Lng3/b;

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
    .locals 3

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/m;->F:I

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-ge v1, v2, :cond_0

    const/4 v2, 0x0

    :cond_0
    int-to-long v0, v2

    return-wide v0

    :pswitch_1
    int-to-long v0, v1

    return-wide v0

    :pswitch_2
    if-ge v1, v2, :cond_1

    rsub-int/lit8 v1, v1, 0x1

    :cond_1
    int-to-long v0, v1

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ljg3/m;->F:I

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/m;->p0(JLng3/r;)Ljg3/m;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/m;->p0(JLng3/r;)Ljg3/m;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/m;->p0(JLng3/r;)Ljg3/m;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p1, p0}, Ljg3/d;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/m;

    return-object p1
.end method

.method public final p0(JLng3/r;)Ljg3/m;
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

    invoke-virtual {p0, p3}, Ljg3/m;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/m;->r0(JLng3/m;)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/16 p3, 0x3e8

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/m;->q0(J)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0x64

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/m;->q0(J)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0xa

    invoke-static {p1, p2, p3}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljg3/m;->q0(J)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ljg3/m;->q0(J)Ljg3/m;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/m;

    return-object p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q0(J)Ljg3/m;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget v1, p0, Ljg3/m;->F:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    iget-object p1, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {p1, v1, v2, v0}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    invoke-static {p1}, Ljg3/m;->o0(I)Ljg3/m;

    move-result-object p1

    return-object p1
.end method

.method public final r0(JLng3/m;)Ljg3/m;
    .locals 5

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0, p1, p2}, Lng3/a;->f(J)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/m;->F:I

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: "

    invoke-static {p2, p3}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p3, Lng3/a;->d0:Lng3/a;

    invoke-virtual {p0, p3}, Ljg3/m;->h(Lng3/m;)J

    move-result-wide v3

    cmp-long p1, v3, p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    sub-int/2addr v2, v1

    invoke-static {v2}, Ljg3/m;->o0(I)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_1
    long-to-int p1, p1

    invoke-static {p1}, Ljg3/m;->o0(I)Ljg3/m;

    move-result-object p1

    return-object p1

    :pswitch_2
    if-ge v1, v2, :cond_1

    const-wide/16 v0, 0x1

    sub-long p1, v0, p1

    :cond_1
    long-to-int p1, p1

    invoke-static {p1}, Ljg3/m;->o0(I)Ljg3/m;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/m;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ljg3/m;->F:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
