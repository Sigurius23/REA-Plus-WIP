.class public abstract Lbj/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "fFamily"

    const-string v5, "data"

    const-string v0, "ch"

    const-string v1, "size"

    const-string v2, "w"

    const-string v3, "style"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/j;->a:Lwe/o;

    const-string v0, "shapes"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/j;->b:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lwi/d;
    .locals 9

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v5, v4

    move-object v6, v5

    move-wide v3, v2

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    sget-object v7, Lbj/j;->a:Lwe/o;

    invoke-virtual {p0, v7}, Lcj/d;->m(Lwe/o;)I

    move-result v7

    if-eqz v7, :cond_8

    const/4 v8, 0x1

    if-eq v7, v8, :cond_7

    const/4 v8, 0x2

    if-eq v7, v8, :cond_6

    const/4 v8, 0x3

    if-eq v7, v8, :cond_5

    const/4 v8, 0x4

    if-eq v7, v8, :cond_4

    const/4 v8, 0x5

    if-eq v7, v8, :cond_0

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcj/d;->beginObject()V

    :goto_1
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v7, Lbj/j;->b:Lwe/o;

    invoke-virtual {p0, v7}, Lcj/d;->m(Lwe/o;)I

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcj/d;->beginArray()V

    :goto_2
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {p0, p1}, Lbj/g;->a(Lcj/d;Lqi/i;)Lyi/b;

    move-result-object v7

    check-cast v7, Lyi/n;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcj/d;->endArray()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcj/d;->endObject()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lcj/d;->nextDouble()D

    move-result-wide v3

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcj/d;->nextDouble()D

    goto :goto_0

    :cond_8
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_0

    :cond_9
    invoke-virtual {p0}, Lcj/d;->endObject()V

    new-instance v0, Lwi/d;

    invoke-direct/range {v0 .. v6}, Lwi/d;-><init>(Ljava/util/ArrayList;CDLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
