.class final Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/TimeProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;->INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
