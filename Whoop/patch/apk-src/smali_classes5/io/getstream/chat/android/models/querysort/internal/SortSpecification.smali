.class public final Lio/getstream/chat/android/models/querysort/internal/SortSpecification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "T",
        "",
        "sortAttribute",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;",
        "sortDirection",
        "Lio/getstream/chat/android/models/querysort/SortDirection;",
        "<init>",
        "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V",
        "getSortAttribute",
        "()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;",
        "getSortDirection",
        "()Lio/getstream/chat/android/models/querysort/SortDirection;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")V"
        }
    .end annotation

    const-string v0, "sortAttribute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    iput-object p2, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;ILjava/lang/Object;)Lio/getstream/chat/android/models/querysort/internal/SortSpecification;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->copy(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/querysort/SortDirection;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Lio/getstream/chat/android/models/querysort/internal/SortSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "sortAttribute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    iget-object v3, p1, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    iget-object p1, p1, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    return-object v0
.end method

.method public final getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortAttribute:Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->sortDirection:Lio/getstream/chat/android/models/querysort/SortDirection;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SortSpecification(sortAttribute="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sortDirection="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
