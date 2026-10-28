.class public final Lu/a;
.super Lu/f;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lu/f;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu/a;->E:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lu/c;
    .locals 1

    iget-object v0, p0, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/c;

    return-object p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lu/a;->a(Ljava/lang/Object;)Lu/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, v0, Lu/c;->x:Ljava/lang/Object;

    return-object p1

    :cond_0
    new-instance v0, Lu/c;

    invoke-direct {v0, p1, p2}, Lu/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p2, p0, Lu/f;->z:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lu/f;->z:I

    iget-object p2, p0, Lu/f;->x:Lu/c;

    if-nez p2, :cond_1

    iput-object v0, p0, Lu/f;->w:Lu/c;

    iput-object v0, p0, Lu/f;->x:Lu/c;

    goto :goto_0

    :cond_1
    iput-object v0, p2, Lu/c;->y:Lu/c;

    iput-object p2, v0, Lu/c;->z:Lu/c;

    iput-object v0, p0, Lu/f;->x:Lu/c;

    :goto_0
    iget-object p2, p0, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-super {p0, p1}, Lu/f;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
