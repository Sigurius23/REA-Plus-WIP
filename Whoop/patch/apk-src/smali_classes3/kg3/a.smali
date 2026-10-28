.class public abstract Lkg3/a;
.super Lmg3/a;
.source "SourceFile"

# interfaces
.implements Lng3/l;
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lng3/m;)Z
.end method

.method public g(Lng3/q;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_1

    sget-object p1, Lng3/b;->y:Lng3/b;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lkg3/a;->toEpochDay()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-eq p1, v0, :cond_4

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_4

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_4

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract toEpochDay()J
.end method
