.class public final Lq3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lp0/n0;


# instance fields
.field public final a:Ll3/g;

.field public final b:J

.field public final c:Ll3/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp02/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lp02/a;-><init>(I)V

    new-instance v1, Lpl0/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lpl0/a;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Lq3/y;->d:Lp0/n0;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;J)V
    .locals 1

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    .line 10
    const-string p2, ""

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    .line 11
    sget-wide p3, Ll3/u0;->b:J

    :cond_1
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p2, p3, p4, p1}, Lq3/y;-><init>(Ljava/lang/String;JLl3/u0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLl3/u0;)V
    .locals 1

    .line 13
    new-instance v0, Ll3/g;

    invoke-direct {v0, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3, p4}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    return-void
.end method

.method public constructor <init>(Ll3/g;JLl3/u0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq3/y;->a:Ll3/g;

    .line 3
    iget-object v0, p1, Ll3/g;->x:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, p2, p3}, Lj93/l0;->o(IJ)J

    move-result-wide p2

    iput-wide p2, p0, Lq3/y;->b:J

    if-eqz p4, :cond_0

    .line 5
    iget-wide p2, p4, Ll3/u0;->a:J

    .line 6
    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1, p2, p3}, Lj93/l0;->o(IJ)J

    move-result-wide p1

    .line 8
    new-instance p3, Ll3/u0;

    invoke-direct {p3, p1, p2}, Ll3/u0;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 9
    :goto_0
    iput-object p3, p0, Lq3/y;->c:Ll3/u0;

    return-void
.end method

.method public static a(Lq3/y;Ljava/lang/String;JI)Lq3/y;
    .locals 1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-wide p2, p0, Lq3/y;->b:J

    :cond_0
    iget-object p4, p0, Lq3/y;->c:Ll3/u0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lq3/y;

    new-instance v0, Ll3/g;

    invoke-direct {v0, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3, p4}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    return-object p0
.end method

.method public static b(Lq3/y;Ll3/g;JI)Lq3/y;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lq3/y;->a:Ll3/g;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    iget-wide p2, p0, Lq3/y;->b:J

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p4, p0, Lq3/y;->c:Ll3/u0;

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lq3/y;

    invoke-direct {p0, p1, p2, p3, p4}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq3/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq3/y;

    iget-wide v3, p1, Lq3/y;->b:J

    iget-wide v5, p0, Lq3/y;->b:J

    invoke-static {v5, v6, v3, v4}, Ll3/u0;->b(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lq3/y;->c:Ll3/u0;

    iget-object v3, p1, Lq3/y;->c:Ll3/u0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lq3/y;->a:Ll3/g;

    invoke-virtual {v0}, Ll3/g;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget v2, Ll3/u0;->c:I

    iget-wide v2, p0, Lq3/y;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lq3/y;->c:Ll3/u0;

    if-eqz v1, :cond_0

    iget-wide v1, v1, Ll3/u0;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextFieldValue(text=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq3/y;->a:Ll3/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq3/y;->c:Ll3/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
