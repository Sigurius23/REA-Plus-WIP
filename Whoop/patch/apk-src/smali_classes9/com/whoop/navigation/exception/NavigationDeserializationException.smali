.class public final Lcom/whoop/navigation/exception/NavigationDeserializationException;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/exception/NavigationDeserializationException$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/navigation/exception/NavigationDeserializationException;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "",
        "unrecognizedScreen",
        "Lkotlinx/serialization/json/JsonElement;",
        "rawParameters",
        "<init>",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V",
        "Ljava/lang/String;",
        "getUnrecognizedScreen",
        "()Ljava/lang/String;",
        "Lkotlinx/serialization/json/JsonElement;",
        "getRawParameters",
        "()Lkotlinx/serialization/json/JsonElement;",
        "metricValue",
        "getMetricValue",
        "Companion",
        "a",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/navigation/exception/NavigationDeserializationException$a;


# instance fields
.field private final metricValue:Ljava/lang/String;

.field private final rawParameters:Lkotlinx/serialization/json/JsonElement;

.field private final unrecognizedScreen:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->Companion:Lcom/whoop/navigation/exception/NavigationDeserializationException$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
    .locals 1

    const-string v0, "unrecognizedScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawParameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->Companion:Lcom/whoop/navigation/exception/NavigationDeserializationException$a;

    invoke-static {v0, p1, p2}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;->a(Lcom/whoop/navigation/exception/NavigationDeserializationException$a;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->unrecognizedScreen:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->rawParameters:Lkotlinx/serialization/json/JsonElement;

    iput-object p1, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->metricValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMetricValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->metricValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawParameters()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->rawParameters:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getUnrecognizedScreen()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/exception/NavigationDeserializationException;->unrecognizedScreen:Ljava/lang/String;

    return-object v0
.end method
