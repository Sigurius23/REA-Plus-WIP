.class public final synthetic Lio/getstream/chat/android/client/api/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lio/getstream/chat/android/models/querysort/QuerySorter;

.field public final synthetic F:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

.field public final synthetic w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/internal/b;->w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/internal/b;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/internal/b;->y:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/api/internal/b;->z:I

    iput-object p5, p0, Lio/getstream/chat/android/client/api/internal/b;->E:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p6, p0, Lio/getstream/chat/android/client/api/internal/b;->F:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget-object v4, p0, Lio/getstream/chat/android/client/api/internal/b;->E:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v5, p0, Lio/getstream/chat/android/client/api/internal/b;->F:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/internal/b;->w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/internal/b;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/internal/b;->y:Ljava/lang/String;

    iget v3, p0, Lio/getstream/chat/android/client/api/internal/b;->z:I

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->j(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;

    move-result-object v0

    return-object v0
.end method
