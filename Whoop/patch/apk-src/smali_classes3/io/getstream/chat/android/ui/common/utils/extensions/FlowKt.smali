.class public final Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "T",
        "Lec3/l;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onFirst",
        "(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final onFirst(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFirst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;-><init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    new-instance p1, Lec3/j1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v1, v0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object p1
.end method
