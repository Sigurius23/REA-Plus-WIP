.class final synthetic Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;
.implements Lkotlin/jvm/internal/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
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


# instance fields
.field final synthetic $tmp0:Lio/getstream/chat/android/ui/utils/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/utils/SingleLiveEvent<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/utils/SingleLiveEvent<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1$1;->$tmp0:Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1$1;->$tmp0:Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1;->access$invokeSuspend$postValue(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lec3/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/e;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/a;

    iget-object v4, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1$1;->$tmp0:Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    const-string v6, "postValue(Ljava/lang/Object;)V"

    const/4 v2, 0x4

    const/4 v1, 0x2

    const-class v3, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    const-string v5, "postValue"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
