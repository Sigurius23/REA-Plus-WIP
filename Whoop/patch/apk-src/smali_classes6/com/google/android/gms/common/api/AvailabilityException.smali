.class public Lcom/google/android/gms/common/api/AvailabilityException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:La0/g;


# direct methods
.method public constructor <init>(La0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/AvailabilityException;->w:La0/g;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/common/api/AvailabilityException;->w:La0/g;

    invoke-virtual {v1}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, La0/c;

    invoke-virtual {v2}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    move-object v5, v2

    check-cast v5, La0/m;

    invoke-virtual {v5}, La0/m;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, La0/m;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lto/a;

    invoke-virtual {v1, v5}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/common/a;

    invoke-static {v6}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/google/android/gms/common/a;->b()Z

    move-result v7

    xor-int/2addr v7, v3

    and-int/2addr v4, v7

    iget-object v5, v5, Lto/a;->b:Lcom/google/android/gms/common/api/f;

    iget-object v5, v5, Lcom/google/android/gms/common/api/f;->b:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v7, v5}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    add-int/2addr v7, v8

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v4, :cond_1

    const-string v2, "None of the queried APIs are available. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "Some of the queried APIs are unavailable. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v2, "; "

    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
