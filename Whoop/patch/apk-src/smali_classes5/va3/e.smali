.class public final Lva3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lva3/e;


# instance fields
.field public final a:Lva3/f;

.field public transient b:Lva3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lva3/e;

    const-string v1, ""

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lva3/e;->c:Lva3/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lva3/f;

    invoke-direct {v0, p1, p0}, Lva3/f;-><init>(Ljava/lang/String;Lva3/e;)V

    iput-object v0, p0, Lva3/e;->a:Lva3/f;

    return-void
.end method

.method public constructor <init>(Lva3/f;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lva3/e;->a:Lva3/f;

    return-void
.end method

.method public constructor <init>(Lva3/f;Lva3/e;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lva3/e;->a:Lva3/f;

    .line 7
    iput-object p2, p0, Lva3/e;->b:Lva3/e;

    return-void
.end method


# virtual methods
.method public final a(Lva3/h;)Lva3/e;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lva3/e;

    iget-object v1, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1, p1}, Lva3/f;->a(Lva3/h;)Lva3/f;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lva3/e;-><init>(Lva3/f;Lva3/e;)V

    return-object v0
.end method

.method public final b()Lva3/e;
    .locals 2

    iget-object v0, p0, Lva3/e;->b:Lva3/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lva3/e;

    invoke-virtual {v0}, Lva3/f;->e()Lva3/f;

    move-result-object v0

    invoke-direct {v1, v0}, Lva3/e;-><init>(Lva3/f;)V

    iput-object v1, p0, Lva3/e;->b:Lva3/e;

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "root"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lva3/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lva3/e;

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    iget-object v1, p0, Lva3/e;->a:Lva3/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
