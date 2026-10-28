.class public final Lqc3/d1;
.super Lsc3/v;
.source "SourceFile"


# instance fields
.field public final e:Lqc3/o0;


# direct methods
.method public constructor <init>(Lqc3/o0;)V
    .locals 4

    sget-object v0, Lqc3/n0;->a:Lsc3/u;

    sget-object v1, Lqc3/o0;->w:Lqc3/o0;

    const/4 v2, 0x2

    if-ne p1, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    sget-object v3, Lqc3/o0;->x:Lqc3/o0;

    if-ne p1, v3, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-direct {p0, v0, v1, v2}, Lsc3/v;-><init>(Lsc3/u;ILjava/lang/Integer;)V

    iput-object p1, p0, Lqc3/d1;->e:Lqc3/o0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lqc3/d1;

    if-eqz v0, :cond_0

    check-cast p1, Lqc3/d1;

    iget-object p1, p1, Lqc3/d1;->e:Lqc3/o0;

    iget-object v0, p0, Lqc3/d1;->e:Lqc3/o0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lqc3/d1;->e:Lqc3/o0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
