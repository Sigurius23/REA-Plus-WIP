.class public abstract Lbj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "x"

    const-string v1, "y"

    const-string v2, "k"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/a;->a:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lol/b;
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcj/d;->i()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lcj/d;->beginArray()V

    :goto_0
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcj/d;->i()I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_0

    move v7, v2

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v7, v1

    :goto_1
    invoke-static {}, Ldj/i;->c()F

    move-result v5

    sget-object v6, Lbj/f;->e:Lbj/f;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lbj/p;->b(Lcj/c;Lqi/i;FLbj/e0;ZZ)Lej/a;

    move-result-object p0

    new-instance p1, Lti/k;

    invoke-direct {p1, v4, p0}, Lti/k;-><init>(Lqi/i;Lej/a;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p0, v3

    move-object p1, v4

    goto :goto_0

    :cond_1
    move-object v3, p0

    invoke-virtual {v3}, Lcj/d;->endArray()V

    invoke-static {v0}, Lbj/q;->b(Ljava/util/ArrayList;)V

    goto :goto_2

    :cond_2
    move-object v3, p0

    new-instance p0, Lej/a;

    invoke-static {}, Ldj/i;->c()F

    move-result p1

    invoke-static {v3, p1}, Lbj/o;->b(Lcj/c;F)Landroid/graphics/PointF;

    move-result-object p1

    invoke-direct {p0, p1}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    new-instance p0, Lol/b;

    invoke-direct {p0, v0}, Lol/b;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method

.method public static b(Lcj/d;Lqi/i;)Lxi/f;
    .locals 8

    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move v3, v1

    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Lcj/d;->i()I

    move-result v4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_5

    sget-object v4, Lbj/a;->a:Lwe/o;

    invoke-virtual {p0, v4}, Lcj/d;->m(Lwe/o;)I

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x6

    const/4 v6, 0x1

    if-eq v4, v6, :cond_2

    const/4 v7, 0x2

    if-eq v4, v7, :cond_0

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcj/d;->i()I

    move-result v4

    if-ne v4, v5, :cond_1

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    :goto_1
    move v3, v6

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcj/d;->i()I

    move-result v4

    if-ne v4, v5, :cond_3

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_1

    :cond_3
    invoke-static {p0, p1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-static {p0, p1}, Lbj/a;->a(Lcj/d;Lqi/i;)Lol/b;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcj/d;->endObject()V

    if-eqz v3, :cond_6

    const-string p0, "Lottie doesn\'t support expressions."

    invoke-virtual {p1, p0}, Lqi/i;->a(Ljava/lang/String;)V

    :cond_6
    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance p0, Lxi/c;

    invoke-direct {p0, v1, v2}, Lxi/c;-><init>(Lxi/b;Lxi/b;)V

    return-object p0
.end method
