.class public final Lyb3/m;
.super Lm83/a;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lyb3/n;


# direct methods
.method public constructor <init>(Lyb3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyb3/m;->w:Lyb3/n;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lyb3/m;->w:Lyb3/n;

    iget-object v0, v0, Lyb3/n;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final c(I)Lyb3/j;
    .locals 3

    iget-object v0, p0, Lyb3/m;->w:Lyb3/n;

    iget-object v0, v0, Lyb3/n;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->start(I)I

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->end(I)I

    move-result v2

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    iget v2, v1, Li93/h;->w:I

    if-ltz v2, :cond_0

    new-instance v2, Lyb3/j;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "group(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v1}, Lyb3/j;-><init>(Ljava/lang/String;Li93/j;)V

    return-object v2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lyb3/j;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lyb3/j;

    invoke-super {p0, p1}, Lm83/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    invoke-static {p0}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    new-instance v1, Lx30/h1;

    const/16 v2, 0x9

    invoke-direct {v1, p0, v2}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    new-instance v1, Lo63/h;

    invoke-direct {v1, v0}, Lo63/h;-><init>(Lxb3/s;)V

    return-object v1
.end method
