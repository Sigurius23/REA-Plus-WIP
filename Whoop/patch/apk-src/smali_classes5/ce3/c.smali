.class public final Lce3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lne3/l;

.field public static final e:Lne3/l;

.field public static final f:Lne3/l;

.field public static final g:Lne3/l;

.field public static final h:Lne3/l;

.field public static final i:Lne3/l;


# instance fields
.field public final a:Lne3/l;

.field public final b:Lne3/l;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lne3/l;->z:Lne3/k;

    const-string v0, ":"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->d:Lne3/l;

    const-string v0, ":status"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->e:Lne3/l;

    const-string v0, ":method"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->f:Lne3/l;

    const-string v0, ":path"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->g:Lne3/l;

    const-string v0, ":scheme"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->h:Lne3/l;

    const-string v0, ":authority"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lce3/c;->i:Lne3/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 6
    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    invoke-static {p2}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lne3/l;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    return-void
.end method

.method public constructor <init>(Lne3/l;Lne3/l;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lce3/c;->a:Lne3/l;

    .line 3
    iput-object p2, p0, Lce3/c;->b:Lne3/l;

    .line 4
    invoke-virtual {p1}, Lne3/l;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lne3/l;->d()I

    move-result p2

    add-int/2addr p2, p1

    .line 5
    iput p2, p0, Lce3/c;->c:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lce3/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lce3/c;

    iget-object v1, p0, Lce3/c;->a:Lne3/l;

    iget-object v3, p1, Lce3/c;->a:Lne3/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lce3/c;->b:Lne3/l;

    iget-object p1, p1, Lce3/c;->b:Lne3/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lce3/c;->a:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lce3/c;->b:Lne3/l;

    invoke-virtual {v1}, Lne3/l;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lce3/c;->a:Lne3/l;

    invoke-virtual {v1}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lce3/c;->b:Lne3/l;

    invoke-virtual {v1}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
