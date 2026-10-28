.class public final Lor2/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ-\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0013\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u0006\u00a8\u0006\u001e"
    }
    d2 = {
        "Lor2/i0;",
        "",
        "<init>",
        "()V",
        "Lcom/google/gson/Gson;",
        "d",
        "()Lcom/google/gson/Gson;",
        "any",
        "",
        "i",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "T",
        "json",
        "Ljava/lang/Class;",
        "cls",
        "e",
        "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;",
        "Ljava/lang/reflect/Type;",
        "type",
        "f",
        "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;",
        "timeFormat",
        "",
        "serializeNulls",
        "Lcom/google/gson/GsonBuilder;",
        "b",
        "(Ljava/lang/String;Z)Lcom/google/gson/GsonBuilder;",
        "Ll83/h;",
        "g",
        "gson",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final a:Lor2/i0;

.field private static final b:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/i0;

    invoke-direct {v0}, Lor2/i0;-><init>()V

    sput-object v0, Lor2/i0;->a:Lor2/i0;

    new-instance v0, Lma1/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lor2/i0;->b:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/google/gson/Gson;
    .locals 1

    invoke-static {}, Lor2/i0;->h()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Ljava/lang/String;Z)Lcom/google/gson/GsonBuilder;
    .locals 1

    const-string v0, "timeFormat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/GsonBuilder;->setDateFormat(Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/GsonBuilder;->serializeNulls()Lcom/google/gson/GsonBuilder;

    :cond_0
    if-eqz p0, :cond_1

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->a:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/DateMidnightConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/DateMidnightConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->b:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/DateTimeConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/DateTimeConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->g:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/DurationConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/DurationConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->c:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/LocalDateConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/LocalDateConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->d:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/LocalDateTimeConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/LocalDateTimeConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->e:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/LocalTimeConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/LocalTimeConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->f:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/IntervalConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/IntervalConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->h:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/PeriodConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/PeriodConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->i:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/InstantConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/InstantConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    sget-object p1, Lcom/fatboyindustrial/gsonjodatime/a;->j:Ljava/lang/reflect/Type;

    new-instance v0, Lcom/fatboyindustrial/gsonjodatime/DateTimeZoneConverter;

    invoke-direct {v0}, Lcom/fatboyindustrial/gsonjodatime/DateTimeZoneConverter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    return-object p0

    :cond_1
    sget-object p0, Lcom/fatboyindustrial/gsonjodatime/a;->a:Ljava/lang/reflect/Type;

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "builder cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic c(Ljava/lang/String;ZILjava/lang/Object;)Lcom/google/gson/GsonBuilder;
    .locals 0

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const-string p0, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    :cond_1
    invoke-static {p0, p1}, Lor2/i0;->b(Ljava/lang/String;Z)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Lcom/google/gson/Gson;
    .locals 1

    sget-object v0, Lor2/i0;->a:Lor2/i0;

    invoke-virtual {v0}, Lor2/i0;->g()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "cls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lor2/i0;->a:Lor2/i0;

    invoke-virtual {v0}, Lor2/i0;->g()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lor2/i0;->a:Lor2/i0;

    invoke-virtual {v0}, Lor2/i0;->g()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final h()Lcom/google/gson/Gson;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lor2/i0;->c(Ljava/lang/String;ZILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method public static final i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lor2/i0;->a:Lor2/i0;

    invoke-virtual {v0}, Lor2/i0;->g()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toJson(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final g()Lcom/google/gson/Gson;
    .locals 2

    sget-object v0, Lor2/i0;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/gson/Gson;

    return-object v0
.end method
