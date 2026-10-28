.class public final Lcg/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Lcg/n;


# instance fields
.field public final a:Lbg/l;

.field public final b:Lbg/e;

.field public final c:I

.field public final d:Lcg/x;

.field public final e:Lcg/i;

.field public final f:Lcg/y;

.field public final g:Ltg/b;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcg/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcg/o;->i:Lcg/n;

    return-void
.end method

.method public constructor <init>(Lbg/l;Lbg/e;ILcg/x;Lcg/i;Lcg/y;Ltg/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg/o;->a:Lbg/l;

    iput-object p2, p0, Lcg/o;->b:Lbg/e;

    iput p3, p0, Lcg/o;->c:I

    iput-object p4, p0, Lcg/o;->d:Lcg/x;

    iput-object p5, p0, Lcg/o;->e:Lcg/i;

    iput-object p6, p0, Lcg/o;->f:Lcg/y;

    iput-object p7, p0, Lcg/o;->g:Ltg/b;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v0, p1, Lbg/l;->b:I

    const/4 v0, 0x1

    if-gt v0, p3, :cond_6

    const/high16 v0, 0x10000

    if-ge p3, v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lbg/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p6, "<this>"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p6, p2, Lbg/d;

    if-eqz p6, :cond_1

    check-cast p2, Lbg/d;

    iget-object p2, p2, Lbg/d;->a:Landroidx/room/c1;

    instance-of p6, p2, Lbg/k;

    if-eqz p6, :cond_0

    new-instance p6, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {p6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ltg/g;->g:Ltg/g;

    check-cast p2, Lbg/k;

    invoke-virtual {p2}, Lbg/k;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ltg/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x5d

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of p6, p2, Lbg/c;

    if-eqz p6, :cond_5

    check-cast p2, Lbg/c;

    iget-object p2, p2, Lbg/c;->a:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lbg/l;->b:I

    if-eq p3, p1, :cond_2

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p7, :cond_3

    const/16 p2, 0x23

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p2, p7, Ltg/b;->b:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "substring(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const-string p4, "/"

    invoke-static {p1, p4, p3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :goto_1
    iput-object p2, p0, Lcg/o;->h:Ljava/lang/String;

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    const-string p1, "Given port "

    const-string p2, " is not in required range [1, 65535]"

    invoke-static {p3, p1, p2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    const-class v2, Lcg/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcg/o;

    iget-object v2, p0, Lcg/o;->a:Lbg/l;

    iget-object v3, p1, Lcg/o;->a:Lbg/l;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcg/o;->b:Lbg/e;

    iget-object v3, p1, Lcg/o;->b:Lbg/e;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, Lcg/o;->c:I

    iget v3, p1, Lcg/o;->c:I

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lcg/o;->d:Lcg/x;

    iget-object v3, p1, Lcg/o;->d:Lcg/x;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lcg/o;->e:Lcg/i;

    iget-object v3, p1, Lcg/o;->e:Lcg/i;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lcg/o;->f:Lcg/y;

    iget-object v3, p1, Lcg/o;->f:Lcg/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lcg/o;->g:Ltg/b;

    iget-object p1, p1, Lcg/o;->g:Ltg/b;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v0

    :cond_9
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcg/o;->a:Lbg/l;

    invoke-virtual {v0}, Lbg/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcg/o;->b:Lbg/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcg/o;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcg/o;->d:Lcg/x;

    invoke-virtual {v0}, Lcg/x;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcg/o;->e:Lcg/i;

    invoke-virtual {v1}, Lcg/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcg/o;->f:Lcg/y;

    invoke-virtual {v0}, Lcg/y;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcg/o;->g:Ltg/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ltg/b;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/o;->h:Ljava/lang/String;

    return-object v0
.end method
