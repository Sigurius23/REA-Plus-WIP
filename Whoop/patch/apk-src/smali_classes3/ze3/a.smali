.class public final Lze3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lze3/a;->a:Ljava/util/BitSet;

    return-void
.end method

.method public constructor <init>(Lze3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p1, Lze3/a;->a:Ljava/util/BitSet;

    .line 3
    iput-object p1, p0, Lze3/a;->a:Ljava/util/BitSet;

    return-void
.end method

.method public static a()Lze3/a;
    .locals 2

    new-instance v0, Lze3/a;

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-direct {v0, v1}, Lze3/a;-><init>(Ljava/util/BitSet;)V

    return-object v0
.end method


# virtual methods
.method public b(C)V
    .locals 1

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lze3/a;->a:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only match ASCII characters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lze3/a;
    .locals 2

    new-instance v0, Lze3/a;

    iget-object v1, p0, Lze3/a;->a:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    invoke-direct {v0, v1}, Lze3/a;-><init>(Ljava/util/BitSet;)V

    return-object v0
.end method

.method public d(CC)V
    .locals 0

    :goto_0
    if-gt p1, p2, :cond_0

    invoke-virtual {p0, p1}, Lze3/a;->b(C)V

    add-int/lit8 p1, p1, 0x1

    int-to-char p1, p1

    goto :goto_0

    :cond_0
    return-void
.end method
