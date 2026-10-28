.class public final Lf52/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf52/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u0000  2\u00020\u0001:\u0001\u0015B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lf52/b;",
        "",
        "Loh2/c;",
        "hardwareVersion",
        "",
        "binaryVersion",
        "Loh2/b$b;",
        "firmwareVersion",
        "",
        "serial",
        "<init>",
        "(Loh2/c;BLoh2/b$b;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Loh2/c;",
        "c",
        "()Loh2/c;",
        "b",
        "B",
        "()B",
        "Loh2/b$b;",
        "()Loh2/b$b;",
        "d",
        "Ljava/lang/String;",
        "e",
        "puffin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lf52/b$a;


# instance fields
.field private final a:Loh2/c;

.field private final b:B

.field private final c:Loh2/b$b;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf52/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf52/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf52/b;->e:Lf52/b$a;

    return-void
.end method

.method public constructor <init>(Loh2/c;BLoh2/b$b;Ljava/lang/String;)V
    .locals 1

    const-string v0, "hardwareVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serial"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf52/b;->a:Loh2/c;

    .line 3
    iput-byte p2, p0, Lf52/b;->b:B

    .line 4
    iput-object p3, p0, Lf52/b;->c:Loh2/b$b;

    .line 5
    iput-object p4, p0, Lf52/b;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Loh2/c;BLoh2/b$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    new-instance v0, Loh2/c;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v1, 0x0

    invoke-direct/range {v0 .. v6}, Loh2/c;-><init>(JJJ)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x5

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 7
    new-instance v0, Loh2/b$b;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v8}, Loh2/b$b;-><init>(JJJJ)V

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 8
    const-string p4, ""

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lf52/b;-><init>(Loh2/c;BLoh2/b$b;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    iget-byte v0, p0, Lf52/b;->b:B

    return v0
.end method

.method public final b()Loh2/b$b;
    .locals 1

    iget-object v0, p0, Lf52/b;->c:Loh2/b$b;

    return-object v0
.end method

.method public final c()Loh2/c;
    .locals 1

    iget-object v0, p0, Lf52/b;->a:Loh2/c;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf52/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf52/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf52/b;

    iget-object v1, p0, Lf52/b;->a:Loh2/c;

    iget-object v3, p1, Lf52/b;->a:Loh2/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lf52/b;->b:B

    iget-byte v3, p1, Lf52/b;->b:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lf52/b;->c:Loh2/b$b;

    iget-object v3, p1, Lf52/b;->c:Loh2/b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lf52/b;->d:Ljava/lang/String;

    iget-object p1, p1, Lf52/b;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lf52/b;->a:Loh2/c;

    invoke-virtual {v0}, Loh2/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lf52/b;->b:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lf52/b;->c:Loh2/b$b;

    invoke-virtual {v0}, Loh2/b$b;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf52/b;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lf52/b;->a:Loh2/c;

    iget-object v1, p0, Lf52/b;->c:Loh2/b$b;

    iget-object v2, p0, Lf52/b;->d:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "BPMetadataAcquisitionInfo(hw="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "|fw="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "|serial="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
