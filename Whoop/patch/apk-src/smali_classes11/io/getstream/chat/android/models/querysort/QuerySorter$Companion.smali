.class public final Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/querysort/QuerySorter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;",
        "",
        "<init>",
        "()V",
        "KEY_DIRECTION",
        "",
        "KEY_FIELD_NAME",
        "MORE_ON_COMPARISON",
        "",
        "EQUAL_ON_COMPARISON",
        "LESS_ON_COMPARISON",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

.field public static final EQUAL_ON_COMPARISON:I = 0x0

.field public static final KEY_DIRECTION:Ljava/lang/String; = "direction"

.field public static final KEY_FIELD_NAME:Ljava/lang/String; = "field"

.field public static final LESS_ON_COMPARISON:I = -0x1

.field public static final MORE_ON_COMPARISON:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;->$$INSTANCE:Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
