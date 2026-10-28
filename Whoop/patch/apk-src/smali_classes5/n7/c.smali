.class public final Ln7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ln7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/a;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:Ln7/b;

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ln7/c;

    const-wide/16 v1, 0x0

    const/16 v3, 0x7f

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ln7/c;-><init>(ILjava/lang/String;J)V

    sput-object v0, Ln7/c;->h:Ln7/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;J)V
    .locals 9

    .line 9
    new-instance v2, Ln7/a;

    const-string v1, ""

    invoke-direct {v2, v1}, Ln7/a;-><init>(Ljava/lang/String;)V

    .line 10
    sget-object v3, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    const-string v0, "EPOCH"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v4, p2

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_1

    const-wide/16 p3, 0x0

    :cond_1
    move-wide v5, p3

    const/4 v8, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v8}, Ln7/c;-><init>(Ljava/lang/String;Ln7/a;Ljava/time/Instant;Ljava/lang/String;JLn7/b;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ln7/a;Ljava/time/Instant;Ljava/lang/String;JLn7/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln7/c;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ln7/c;->b:Ln7/a;

    .line 4
    iput-object p3, p0, Ln7/c;->c:Ljava/time/Instant;

    .line 5
    iput-object p4, p0, Ln7/c;->d:Ljava/lang/String;

    .line 6
    iput-wide p5, p0, Ln7/c;->e:J

    .line 7
    iput-object p7, p0, Ln7/c;->f:Ln7/b;

    .line 8
    iput p8, p0, Ln7/c;->g:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln7/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln7/c;

    iget-object v1, p1, Ln7/c;->a:Ljava/lang/String;

    iget-object v3, p0, Ln7/c;->a:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ln7/c;->b:Ln7/a;

    iget-object v3, p1, Ln7/c;->b:Ln7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ln7/c;->c:Ljava/time/Instant;

    iget-object v3, p1, Ln7/c;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ln7/c;->d:Ljava/lang/String;

    iget-object v3, p1, Ln7/c;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ln7/c;->e:J

    iget-wide v5, p1, Ln7/c;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ln7/c;->f:Ln7/b;

    iget-object v3, p1, Ln7/c;->f:Ln7/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Ln7/c;->g:I

    iget p1, p1, Ln7/c;->g:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Ln7/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln7/c;->b:Ln7/a;

    iget-object v2, v2, Ln7/a;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ln7/c;->c:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ln7/c;->d:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-wide v3, p0, Ln7/c;->e:J

    invoke-static {v0, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v3, p0, Ln7/c;->f:Ln7/b;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ln7/b;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Ln7/c;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
