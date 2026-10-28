.class public interface abstract Lio/getstream/chat/android/models/querysort/QuerySorter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;
    }
.end annotation

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
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u0012*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0012J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00100\u0004H&R$\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR&\u0010\n\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000bj\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "T",
        "",
        "sortSpecifications",
        "",
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "getSortSpecifications",
        "()Ljava/util/List;",
        "setSortSpecifications",
        "(Ljava/util/List;)V",
        "comparator",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "getComparator",
        "()Ljava/util/Comparator;",
        "toDto",
        "",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

.field public static final EQUAL_ON_COMPARISON:I = 0x0

.field public static final KEY_DIRECTION:Ljava/lang/String; = "direction"

.field public static final KEY_FIELD_NAME:Ljava/lang/String; = "field"

.field public static final LESS_ON_COMPARISON:I = -0x1

.field public static final MORE_ON_COMPARISON:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;->$$INSTANCE:Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

    sput-object v0, Lio/getstream/chat/android/models/querysort/QuerySorter;->Companion:Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

    return-void
.end method


# virtual methods
.method public abstract getComparator()Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation
.end method

.method public abstract getSortSpecifications()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract setSortSpecifications(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;)V"
        }
    .end annotation
.end method

.method public abstract toDto()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end method
