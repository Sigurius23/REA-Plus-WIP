.class public final Lbg/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lbg/l;

.field public static final d:Lbg/l;

.field public static final e:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lbg/l;

    const-string v1, "https"

    const/16 v2, 0x1bb

    invoke-direct {v0, v1, v2}, Lbg/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbg/l;->c:Lbg/l;

    new-instance v1, Lbg/l;

    const-string v3, "http"

    const/16 v4, 0x50

    invoke-direct {v1, v3, v4}, Lbg/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lbg/l;->d:Lbg/l;

    new-instance v3, Lbg/l;

    const-string v5, "ws"

    invoke-direct {v3, v5, v4}, Lbg/l;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lbg/l;

    const-string v5, "wss"

    invoke-direct {v4, v5, v2}, Lbg/l;-><init>(Ljava/lang/String;I)V

    filled-new-array {v1, v0, v3, v4}, [Lbg/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lbg/l;

    iget-object v3, v3, Lbg/l;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sput-object v2, Lbg/l;->e:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "protocolName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/l;->a:Ljava/lang/String;

    iput p2, p0, Lbg/l;->b:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbg/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbg/l;

    iget-object v1, p0, Lbg/l;->a:Ljava/lang/String;

    iget-object v3, p1, Lbg/l;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lbg/l;->b:I

    iget p1, p1, Lbg/l;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lbg/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lbg/l;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scheme(protocolName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lbg/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lbg/l;->b:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
