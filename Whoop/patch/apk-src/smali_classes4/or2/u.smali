.class public final Lor2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/u$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lor2/u;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "a",
        "Lzr2/a;",
        "getDateAndTimeProvider",
        "()Lzr2/a;",
        "b",
        "core_release"
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
.field public static final b:Lor2/u$a;

.field private static final c:Lorg/joda/time/format/DateTimeFormatter;

.field private static final d:Lorg/joda/time/format/DateTimeFormatter;

.field private static final e:Lorg/joda/time/format/DateTimeFormatter;

.field private static final f:Lorg/joda/time/format/DateTimeFormatter;

.field private static final g:Lorg/joda/time/format/DateTimeFormatter;

.field private static final h:Lorg/joda/time/format/DateTimeFormatter;

.field private static final i:Lorg/joda/time/format/DateTimeFormatter;

.field private static final j:Lorg/joda/time/format/DateTimeFormatter;

.field private static final k:Lorg/joda/time/format/DateTimeFormatter;

.field private static final l:J


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lor2/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lor2/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lor2/u;->b:Lor2/u$a;

    const-string v0, "(E) h:mm aa"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "forPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->c:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "h:mm a"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->d:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "h:mma"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->e:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "MMM d, "

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->f:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "EEEE, (MM/dd)"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->g:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "EEEE, MMMM d"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->h:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->i:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v0}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v2, "withZoneUTC(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->j:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "HH:mm:ss"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u;->k:Lorg/joda/time/format/DateTimeFormatter;

    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lor2/u;->l:J

    return-void
.end method

.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/u;->a:Lzr2/a;

    return-void
.end method

.method public static final synthetic a()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lor2/u;->j:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, Lor2/u;->l:J

    return-wide v0
.end method

.method public static final synthetic c()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lor2/u;->f:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic d()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lor2/u;->d:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic e()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lor2/u;->k:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {v0}, Lor2/u$a;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
