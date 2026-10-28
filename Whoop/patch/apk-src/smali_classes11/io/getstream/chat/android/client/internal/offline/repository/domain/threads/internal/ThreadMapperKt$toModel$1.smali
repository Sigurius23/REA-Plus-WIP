.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt"
    f = "ThreadMapper.kt"
    l = {
        0x3c,
        0x3e,
        0x40,
        0x43,
        0x49,
        0x4a,
        0x4b
    }
    m = "toModel"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field I$5:I

.field I$6:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$14:Ljava/lang/Object;

.field L$15:Ljava/lang/Object;

.field L$16:Ljava/lang/Object;

.field L$17:Ljava/lang/Object;

.field L$18:Ljava/lang/Object;

.field L$19:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$20:Ljava/lang/Object;

.field L$21:Ljava/lang/Object;

.field L$22:Ljava/lang/Object;

.field L$23:Ljava/lang/Object;

.field L$24:Ljava/lang/Object;

.field L$25:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
