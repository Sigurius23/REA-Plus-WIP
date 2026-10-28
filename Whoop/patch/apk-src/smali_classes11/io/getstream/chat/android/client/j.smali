.class public final synthetic Lio/getstream/chat/android/client/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lio/getstream/chat/android/models/FilterObject;

.field public final synthetic F:Lio/getstream/chat/android/models/querysort/QuerySorter;

.field public final synthetic G:Ljava/util/List;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/j;->w:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/j;->x:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/j;->y:I

    iput p4, p0, Lio/getstream/chat/android/client/j;->z:I

    iput-object p5, p0, Lio/getstream/chat/android/client/j;->E:Lio/getstream/chat/android/models/FilterObject;

    iput-object p6, p0, Lio/getstream/chat/android/client/j;->F:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p7, p0, Lio/getstream/chat/android/client/j;->G:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    iget-object v1, p0, Lio/getstream/chat/android/client/j;->w:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/j;->x:Ljava/lang/String;

    iget v3, p0, Lio/getstream/chat/android/client/j;->y:I

    iget v4, p0, Lio/getstream/chat/android/client/j;->z:I

    iget-object v5, p0, Lio/getstream/chat/android/client/j;->E:Lio/getstream/chat/android/models/FilterObject;

    iget-object v6, p0, Lio/getstream/chat/android/client/j;->F:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v7, p0, Lio/getstream/chat/android/client/j;->G:Ljava/util/List;

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->QueryMembersIdentifier(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
