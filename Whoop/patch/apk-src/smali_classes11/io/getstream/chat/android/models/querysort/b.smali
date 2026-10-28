.class public final synthetic Lio/getstream/chat/android/models/querysort/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lio/getstream/chat/android/models/querysort/SortDirection;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/querysort/b;->w:Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    iput-object p2, p0, Lio/getstream/chat/android/models/querysort/b;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/models/querysort/b;->y:Lio/getstream/chat/android/models/querysort/SortDirection;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/b;->x:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/b;->y:Lio/getstream/chat/android/models/querysort/SortDirection;

    iget-object v2, p0, Lio/getstream/chat/android/models/querysort/b;->w:Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    invoke-static {v2, v0, v1, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->a(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
