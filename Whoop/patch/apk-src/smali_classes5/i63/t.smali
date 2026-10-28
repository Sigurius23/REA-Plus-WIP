.class public final Li63/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Li63/t;

.field public static final c:Li63/t;

.field public static final d:Li63/t;

.field public static final e:Li63/t;

.field public static final f:Li63/t;

.field public static final g:Li63/t;

.field public static final h:Li63/t;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Li63/t;

    const-string v1, "GET"

    invoke-direct {v0, v1}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Li63/t;->b:Li63/t;

    new-instance v1, Li63/t;

    const-string v2, "POST"

    invoke-direct {v1, v2}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v1, Li63/t;->c:Li63/t;

    new-instance v2, Li63/t;

    const-string v3, "PUT"

    invoke-direct {v2, v3}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v2, Li63/t;->d:Li63/t;

    new-instance v3, Li63/t;

    const-string v4, "PATCH"

    invoke-direct {v3, v4}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v3, Li63/t;->e:Li63/t;

    new-instance v4, Li63/t;

    const-string v5, "DELETE"

    invoke-direct {v4, v5}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v4, Li63/t;->f:Li63/t;

    new-instance v5, Li63/t;

    const-string v6, "HEAD"

    invoke-direct {v5, v6}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v5, Li63/t;->g:Li63/t;

    new-instance v6, Li63/t;

    const-string v7, "OPTIONS"

    invoke-direct {v6, v7}, Li63/t;-><init>(Ljava/lang/String;)V

    sput-object v6, Li63/t;->h:Li63/t;

    filled-new-array/range {v0 .. v6}, [Li63/t;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li63/t;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li63/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li63/t;

    iget-object v1, p0, Li63/t;->a:Ljava/lang/String;

    iget-object p1, p1, Li63/t;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpMethod(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li63/t;->a:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
