.class public final Li63/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Li63/u;

.field public static final e:Li63/u;

.field public static final f:Li63/u;

.field public static final g:Li63/u;

.field public static final h:Li63/u;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Li63/u;

    const-string v1, "HTTP"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Li63/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li63/u;->d:Li63/u;

    new-instance v0, Li63/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Li63/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li63/u;->e:Li63/u;

    new-instance v0, Li63/u;

    invoke-direct {v0, v1, v2, v3}, Li63/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li63/u;->f:Li63/u;

    new-instance v0, Li63/u;

    const-string v1, "SPDY"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, Li63/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li63/u;->g:Li63/u;

    new-instance v0, Li63/u;

    const-string v1, "QUIC"

    invoke-direct {v0, v1, v2, v3}, Li63/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li63/u;->h:Li63/u;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li63/u;->a:Ljava/lang/String;

    iput p2, p0, Li63/u;->b:I

    iput p3, p0, Li63/u;->c:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Li63/u;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li63/u;

    iget-object v0, p0, Li63/u;->a:Ljava/lang/String;

    iget-object v1, p1, Li63/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Li63/u;->b:I

    iget v1, p1, Li63/u;->b:I

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Li63/u;->c:I

    iget p1, p1, Li63/u;->c:I

    if-eq v0, p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Li63/u;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Li63/u;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Li63/u;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Li63/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Li63/u;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Li63/u;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
