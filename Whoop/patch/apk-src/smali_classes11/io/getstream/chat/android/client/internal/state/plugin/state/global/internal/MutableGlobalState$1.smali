.class final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;-><init>(Ljava/lang/String;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/a;"
    }
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "currentTimeMillis()J"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Ljava/lang/System;

    const-string v3, "currentTimeMillis"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
