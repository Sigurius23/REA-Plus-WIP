.class public abstract Lbj/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "fStyle"

    const-string v1, "ascent"

    const-string v2, "fFamily"

    const-string v3, "fName"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/k;->a:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;)Lwi/c;
    .locals 5

    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lbj/k;->a:Lwe/o;

    invoke-virtual {p0, v3}, Lcj/d;->m(Lwe/o;)I

    move-result v3

    if-eqz v3, :cond_3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcj/d;->nextDouble()D

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcj/d;->endObject()V

    new-instance p0, Lwi/c;

    invoke-direct {p0, v0, v1, v2}, Lwi/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
