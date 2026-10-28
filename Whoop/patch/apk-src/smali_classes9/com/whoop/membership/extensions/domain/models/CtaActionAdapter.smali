.class public final Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00082\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;",
        "Lcom/google/gson/TypeAdapter;",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "<init>",
        "()V",
        "Lcom/google/gson/stream/JsonWriter;",
        "out",
        "value",
        "Ll83/a0;",
        "write",
        "(Lcom/google/gson/stream/JsonWriter;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V",
        "Lcom/google/gson/stream/JsonReader;",
        "inValue",
        "read",
        "(Lcom/google/gson/stream/JsonReader;)Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "membership_release"
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
.field public static final $stable:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Lcom/whoop/membership/extensions/domain/models/CtaAction;
    .locals 5

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 3
    :goto_0
    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/CtaAction;->values()[Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object v0

    .line 4
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 5
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_3

    .line 6
    sget-object p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;->UNKNOWN:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    return-object p1

    :cond_3
    return-object v3
.end method

.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;->read(Lcom/google/gson/stream/JsonReader;)Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    :cond_1
    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;->write(Lcom/google/gson/stream/JsonWriter;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    return-void
.end method
