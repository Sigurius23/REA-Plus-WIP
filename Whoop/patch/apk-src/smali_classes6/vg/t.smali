.class public final Lvg/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static final e:Lg93/c;

.field public static final f:J

.field public static final g:J

.field public static final h:J

.field public static final i:J


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "0123456789abcdef"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const-string v1, "toCharArray(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lvg/t;->d:[C

    sget-object v0, Lg93/d;->w:Lg93/c;

    sput-object v0, Lvg/t;->e:Lg93/c;

    const-wide/32 v0, 0xf000

    sput-wide v0, Lvg/t;->f:J

    const-wide/16 v0, 0x4000

    sput-wide v0, Lvg/t;->g:J

    const-wide/high16 v0, -0x4000000000000000L    # -2.0

    sput-wide v0, Lvg/t;->h:J

    const-wide/high16 v0, -0x8000000000000000L

    sput-wide v0, Lvg/t;->i:J

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lvg/t;->a:J

    iput-wide p3, p0, Lvg/t;->b:J

    const/16 v0, 0x24

    new-array v4, v0, [C

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v1 .. v6}, Lsb3/a;->w(JI[CII)V

    const/16 p1, 0x8

    const/16 p2, 0x2d

    aput-char p2, v4, p1

    const/16 v5, 0x9

    const/4 v6, 0x2

    const/4 v3, 0x4

    invoke-static/range {v1 .. v6}, Lsb3/a;->w(JI[CII)V

    const/16 p1, 0xd

    aput-char p2, v4, p1

    const/16 v5, 0xe

    const/4 v3, 0x6

    invoke-static/range {v1 .. v6}, Lsb3/a;->w(JI[CII)V

    const/16 p1, 0x12

    aput-char p2, v4, p1

    const/16 v5, 0x13

    const/4 v3, 0x0

    move-wide v1, p3

    invoke-static/range {v1 .. v6}, Lsb3/a;->w(JI[CII)V

    const/16 p1, 0x17

    aput-char p2, v4, p1

    const/16 v5, 0x18

    const/4 v6, 0x6

    const/4 v3, 0x2

    invoke-static/range {v1 .. v6}, Lsb3/a;->w(JI[CII)V

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v4}, Ljava/lang/String;-><init>([C)V

    iput-object p1, p0, Lvg/t;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvg/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvg/t;

    iget-wide v3, p0, Lvg/t;->a:J

    iget-wide v5, p1, Lvg/t;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lvg/t;->b:J

    iget-wide v5, p1, Lvg/t;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-wide v0, p0, Lvg/t;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lvg/t;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvg/t;->c:Ljava/lang/String;

    return-object v0
.end method
