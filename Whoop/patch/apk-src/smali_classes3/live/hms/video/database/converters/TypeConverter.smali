.class public final Llive/hms/video/database/converters/TypeConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/database/converters/TypeConverter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Llive/hms/video/database/converters/TypeConverter;",
        "",
        "<init>",
        "()V",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/database/converters/TypeConverter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/database/converters/TypeConverter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/database/converters/TypeConverter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/database/converters/TypeConverter;->Companion:Llive/hms/video/database/converters/TypeConverter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final mapToString(Ljava/util/HashMap;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/database/converters/TypeConverter;->Companion:Llive/hms/video/database/converters/TypeConverter$Companion;

    invoke-virtual {v0, p0}, Llive/hms/video/database/converters/TypeConverter$Companion;->mapToString(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final toHashMap(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/database/converters/TypeConverter;->Companion:Llive/hms/video/database/converters/TypeConverter$Companion;

    invoke-virtual {v0, p0}, Llive/hms/video/database/converters/TypeConverter$Companion;->toHashMap(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method
