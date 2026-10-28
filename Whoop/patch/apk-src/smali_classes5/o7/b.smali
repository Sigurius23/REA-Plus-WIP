.class public final Lo7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Lq7/a;

.field public final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lj93/d;Lq7/a;)V
    .locals 1

    const-string v0, "recordType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/b;->a:Lj93/d;

    iput-object p2, p0, Lo7/b;->b:Lq7/a;

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, Lo7/b;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lo7/b;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "null cannot be cast to non-null type androidx.health.connect.client.request.ReadRecordsRequest<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lo7/b;

    iget-object v0, p0, Lo7/b;->a:Lj93/d;

    iget-object v1, p1, Lo7/b;->a:Lj93/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lo7/b;->b:Lq7/a;

    iget-object v1, p1, Lo7/b;->b:Lq7/a;

    invoke-virtual {v0, v1}, Lq7/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lo7/b;->c:Ljava/util/Set;

    iget-object p1, p1, Lo7/b;->c:Ljava/util/Set;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lo7/b;->a:Lj93/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lo7/b;->b:Lq7/a;

    invoke-virtual {v2}, Lq7/a;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lo7/b;->c:Ljava/util/Set;

    invoke-static {v0, v2, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    add-int/lit16 v2, v2, 0x3e8

    mul-int/2addr v2, v1

    return v2
.end method
