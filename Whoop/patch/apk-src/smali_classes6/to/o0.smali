.class public final Lto/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La0/g;

.field public final b:La0/g;

.field public final c:Lcq/i;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lto/o0;->b:La0/g;

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iput-object v0, p0, Lto/o0;->c:Lcq/i;

    iput-boolean v1, p0, Lto/o0;->e:Z

    new-instance v0, La0/g;

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lto/o0;->a:La0/g;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/l;

    iget-object v1, p0, Lto/o0;->a:La0/g;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/l;->getApiKey()Lto/a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lto/o0;->a:La0/g;

    iget p1, p1, La0/f1;->y:I

    iput p1, p0, Lto/o0;->d:I

    return-void
.end method


# virtual methods
.method public final a()La0/c;
    .locals 1

    iget-object v0, p0, Lto/o0;->a:La0/g;

    invoke-virtual {v0}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, La0/c;

    return-object v0
.end method

.method public final b()Lcq/u;
    .locals 1

    iget-object v0, p0, Lto/o0;->c:Lcq/i;

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    return-object v0
.end method

.method public final c(Lto/a;Lcom/google/android/gms/common/a;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lto/o0;->a:La0/g;

    invoke-virtual {v0, p1, p2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lto/o0;->b:La0/g;

    invoke-virtual {v1, p1, p3}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lto/o0;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lto/o0;->d:I

    invoke-virtual {p2}, Lcom/google/android/gms/common/a;->b()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lto/o0;->e:Z

    :cond_0
    iget p1, p0, Lto/o0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lto/o0;->e:Z

    iget-object p2, p0, Lto/o0;->c:Lcq/i;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/AvailabilityException;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/AvailabilityException;-><init>(La0/g;)V

    invoke-virtual {p2, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {p2, v1}, Lcq/i;->b(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
