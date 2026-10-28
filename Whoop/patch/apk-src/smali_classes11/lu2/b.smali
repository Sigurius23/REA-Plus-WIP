.class public final Llu2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Llu2/b;",
        "Lwc3/c;",
        "Lorg/joda/time/DateTime;",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "b",
        "(Lzc3/e;Lorg/joda/time/DateTime;)V",
        "Lzc3/d;",
        "decoder",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lzc3/d;)Lorg/joda/time/DateTime;",
        "Lzr2/a;",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzr2/a;

.field private final b:Lyc3/g;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu2/b;->a:Lzr2/a;

    const-string p1, "com.whoop.weightlifting.data.serialization.DateTimeSerializer"

    sget-object v0, Lyc3/e;->i:Lyc3/e;

    invoke-static {p1, v0}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object p1

    iput-object p1, p0, Llu2/b;->b:Lyc3/g;

    return-void
.end method


# virtual methods
.method public a(Lzc3/d;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTimeParser()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v0, p0, Llu2/b;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->e()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method

.method public b(Lzc3/e;Lorg/joda/time/DateTime;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sget-object v1, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p2, v1}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {v0, p2}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "print(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llu2/b;->a(Lzc3/d;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Llu2/b;->b:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lorg/joda/time/DateTime;

    invoke-virtual {p0, p1, p2}, Llu2/b;->b(Lzc3/e;Lorg/joda/time/DateTime;)V

    return-void
.end method
