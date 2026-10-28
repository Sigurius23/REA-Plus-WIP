.class public final Ly00/d2;
.super Ly00/g;
.source "SourceFile"


# static fields
.field public static final f:Ly00/d2;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/d2;

    const-string v1, ""

    invoke-direct {v0, v1, v1}, Ly00/d2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ly00/d2;->f:Ly00/d2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/d2;->a:Ljava/lang/String;

    iput-object p2, p0, Ly00/d2;->b:Ljava/lang/String;

    const/4 p2, 0x0

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    if-gt v0, p1, :cond_0

    const/16 v1, 0xd

    if-ge p1, v1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v2, p1, Ll83/m;

    if-eqz v2, :cond_1

    move-object p1, v1

    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Ly00/d2;->c:Z

    iget-object p1, p0, Ly00/d2;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v1, p0, Ly00/d2;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p1

    const/4 p1, 0x4

    if-ne v1, p1, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    iput-boolean p1, p0, Ly00/d2;->d:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Ly00/d2;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v1, p0, Ly00/d2;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p1

    if-lez v1, :cond_3

    move p2, v0

    :cond_3
    iput-boolean p2, p0, Ly00/d2;->e:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/d2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/d2;

    iget-object v1, p0, Ly00/d2;->a:Ljava/lang/String;

    iget-object v3, p1, Ly00/d2;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/d2;->b:Ljava/lang/String;

    iget-object p1, p1, Ly00/d2;->b:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ly00/d2;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly00/d2;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", year="

    const-string v1, ")"

    const-string v2, "Unvalidated(month="

    iget-object v3, p0, Ly00/d2;->a:Ljava/lang/String;

    iget-object v4, p0, Ly00/d2;->b:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
