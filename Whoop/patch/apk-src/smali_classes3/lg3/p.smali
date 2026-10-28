.class public final Llg3/p;
.super Lce/w;
.source "SourceFile"


# instance fields
.field public F:Ljg3/o;

.field public final G:Ljava/util/HashMap;

.field public H:Z

.field public final I:Ljg3/k;

.field public final synthetic J:Llg3/q;


# direct methods
.method public constructor <init>(Llg3/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg3/p;->J:Llg3/q;

    const/4 p1, 0x0

    iput-object p1, p0, Llg3/p;->F:Ljg3/o;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llg3/p;->G:Ljava/util/HashMap;

    sget-object p1, Ljg3/k;->x:Ljg3/k;

    iput-object p1, p0, Llg3/p;->I:Ljg3/k;

    return-void
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    iget-object v0, p0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Lng3/m;)I
    .locals 2

    iget-object v0, p0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/squareup/wire/n;->b0(J)I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    iget-object p1, p0, Llg3/p;->F:Ljg3/o;

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    iget-object v0, p0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",null,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg3/p;->F:Ljg3/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
