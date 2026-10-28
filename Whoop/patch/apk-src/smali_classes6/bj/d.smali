.class public abstract Lbj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "ef"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/d;->a:Lwe/o;

    const-string v0, "ty"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/d;->b:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lty/c;
    .locals 7

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lbj/d;->a:Lwe/o;

    invoke-virtual {p0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcj/d;->beginArray()V

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v2, 0x0

    move-object v3, v0

    :cond_2
    move v4, v2

    :goto_2
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object v5, Lbj/d;->b:Lwe/o;

    invoke-virtual {p0, v5}, Lcj/d;->m(Lwe/o;)I

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_5

    if-eq v5, v6, :cond_3

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_2

    :cond_3
    if-eqz v4, :cond_4

    new-instance v3, Lty/c;

    invoke-static {p0, p1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v5

    const/16 v6, 0x1a

    invoke-direct {v3, v5, v6}, Lty/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcj/d;->nextInt()I

    move-result v4

    if-nez v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcj/d;->endObject()V

    if-eqz v3, :cond_1

    move-object v1, v3

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lcj/d;->endArray()V

    goto :goto_0

    :cond_8
    return-object v1
.end method
