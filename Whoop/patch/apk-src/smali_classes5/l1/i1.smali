.class public final Ll1/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# instance fields
.field public final a:Lm1/t;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lhm/d;


# direct methods
.method public constructor <init>(Lm1/t;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/i1;->a:Lm1/t;

    iget-object v0, p1, Lm1/t;->a:Ljava/lang/String;

    iget-char v1, p1, Lm1/t;->b:C

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v2, v3}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v4

    iput v4, p0, Ll1/i1;->b:I

    invoke-static {v0, v1, v2, v3}, Lyb3/r;->k0(Ljava/lang/CharSequence;CII)I

    move-result v0

    iput v0, p0, Ll1/i1;->c:I

    iget-object p1, p1, Lm1/t;->c:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll1/i1;->d:I

    new-instance p1, Lhm/d;

    const/16 v0, 0x1c

    invoke-direct {p1, p0, v0}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ll1/i1;->e:Lhm/d;

    return-void
.end method


# virtual methods
.method public final a(Ll3/g;)Lq3/e0;
    .locals 6

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    iget v2, p0, Ll1/i1;->d:I

    if-le v0, v2, :cond_0

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    invoke-static {p1, v0}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v0, ""

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v2, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v3, p0, Ll1/i1;->b:I

    if-eq v4, v3, :cond_1

    add-int/lit8 v2, v2, 0x2

    iget v3, p0, Ll1/i1;->c:I

    if-ne v2, v3, :cond_2

    :cond_1
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ll1/i1;->a:Lm1/t;

    iget-char v2, v2, Lm1/t;->b:C

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_3
    new-instance p1, Lq3/e0;

    new-instance v1, Ll3/g;

    invoke-direct {v1, v0}, Ll3/g;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll1/i1;->e:Lhm/d;

    invoke-direct {p1, v1, v0}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object p1
.end method
