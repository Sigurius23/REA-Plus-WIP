.class final synthetic Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient$Builder;->internalBuild()Lio/getstream/chat/android/client/ChatClient;
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;

    invoke-direct {v0}, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;->INSTANCE:Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Ljava/util/Date;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public final invoke()Ljava/util/Date;
    .locals 1

    .line 2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method
