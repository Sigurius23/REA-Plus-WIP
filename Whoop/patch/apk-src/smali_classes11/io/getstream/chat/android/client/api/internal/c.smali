.class public final synthetic Lio/getstream/chat/android/client/api/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lio/getstream/chat/android/models/FilterObject;

.field public final synthetic G:Lio/getstream/chat/android/models/querysort/QuerySorter;

.field public final synthetic H:Ljava/util/List;

.field public final synthetic w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/internal/c;->w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/internal/c;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/internal/c;->y:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/api/internal/c;->z:I

    iput p5, p0, Lio/getstream/chat/android/client/api/internal/c;->E:I

    iput-object p6, p0, Lio/getstream/chat/android/client/api/internal/c;->F:Lio/getstream/chat/android/models/FilterObject;

    iput-object p7, p0, Lio/getstream/chat/android/client/api/internal/c;->G:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p8, p0, Lio/getstream/chat/android/client/api/internal/c;->H:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v6, p0, Lio/getstream/chat/android/client/api/internal/c;->G:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v7, p0, Lio/getstream/chat/android/client/api/internal/c;->H:Ljava/util/List;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/internal/c;->w:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/internal/c;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/internal/c;->y:Ljava/lang/String;

    iget v3, p0, Lio/getstream/chat/android/client/api/internal/c;->z:I

    iget v4, p0, Lio/getstream/chat/android/client/api/internal/c;->E:I

    iget-object v5, p0, Lio/getstream/chat/android/client/api/internal/c;->F:Lio/getstream/chat/android/models/FilterObject;

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->g(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;

    move-result-object v0

    return-object v0
.end method
