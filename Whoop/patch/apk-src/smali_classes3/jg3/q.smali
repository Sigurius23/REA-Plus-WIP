.class public final Ljg3/q;
.super Ljg3/o;
.source "SourceFile"


# static fields
.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final x:Ljava/lang/String;

.field public final transient y:Log3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[A-Za-z][A-Za-z0-9~/._+-]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljg3/q;->z:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Log3/h;)V
    .locals 0

    invoke-direct {p0}, Ljg3/o;-><init>()V

    iput-object p1, p0, Ljg3/q;->x:Ljava/lang/String;

    iput-object p2, p0, Ljg3/q;->y:Log3/h;

    return-void
.end method

.method public static o(Ljava/lang/String;Z)Ljg3/q;
    .locals 2

    const-string v0, "zoneId"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    sget-object v0, Ljg3/q;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p0}, Log3/d;->a(Ljava/lang/String;)Log3/h;

    move-result-object p1
    :try_end_0
    .catch Lorg/threeten/bp/zone/ZoneRulesException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "GMT0"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Ljg3/p;->F:Ljg3/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Log3/g;

    invoke-direct {v0, p1}, Log3/g;-><init>(Ljg3/p;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ljg3/q;

    invoke-direct {v0, p0, p1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object v0

    :cond_1
    throw v0

    :cond_2
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Invalid ID for region-based ZoneId, invalid format: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljg3/q;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Log3/h;
    .locals 1

    iget-object v0, p0, Ljg3/q;->y:Log3/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ljg3/q;->x:Ljava/lang/String;

    invoke-static {v0}, Log3/d;->a(Ljava/lang/String;)Log3/h;

    move-result-object v0

    return-object v0
.end method

.method public final n(Ljava/io/ObjectOutput;)V
    .locals 1

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    iget-object v0, p0, Ljg3/q;->x:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    return-void
.end method
