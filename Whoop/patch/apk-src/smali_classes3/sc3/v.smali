.class public abstract Lsc3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/j;


# instance fields
.field public final a:Lsc3/u;

.field public final b:I

.field public final c:Ljava/lang/Integer;

.field public final d:I


# direct methods
.method public constructor <init>(Lsc3/u;ILjava/lang/Integer;)V
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/v;->a:Lsc3/u;

    iput p2, p0, Lsc3/v;->b:I

    iput-object p3, p0, Lsc3/v;->c:Ljava/lang/Integer;

    iget p1, p1, Lsc3/u;->e:I

    iput p1, p0, Lsc3/v;->d:I

    if-ltz p2, :cond_3

    const/16 v0, 0x29

    if-lt p1, p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-le p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "The space padding ("

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ") should be more than the minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    return-void

    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "The maximum number of digits ("

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is less than the minimum number of digits ("

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p1, "The minimum number of digits ("

    const-string p3, ") is negative"

    invoke-static {p2, p1, p3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 4

    new-instance v0, Ltc3/a;

    new-instance v1, Lq00/h0;

    iget-object v1, p0, Lsc3/v;->a:Lsc3/u;

    iget-object v1, v1, Lsc3/u;->a:Lsc3/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget v1, p0, Lsc3/v;->b:I

    const-string v2, "The minimum number of digits ("

    if-ltz v1, :cond_2

    const/16 v3, 0x9

    if-gt v1, v3, :cond_1

    iget-object v1, p0, Lsc3/v;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    new-instance v0, Ltc3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0

    :cond_1
    const-string v0, ") exceeds the length of an Int"

    invoke-static {v1, v2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string v0, ") is negative"

    invoke-static {v1, v2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Luc3/l;
    .locals 7

    iget v0, p0, Lsc3/v;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v0, p0, Lsc3/v;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, p0, Lsc3/v;->a:Lsc3/u;

    iget-object v4, v0, Lsc3/u;->a:Lsc3/r;

    iget-object v5, v0, Lsc3/u;->b:Ljava/lang/String;

    const/4 v6, 0x0

    iget-object v3, p0, Lsc3/v;->c:Ljava/lang/Integer;

    invoke-static/range {v1 .. v6}, Lsc3/l;->j(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)Luc3/l;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic c()Lsc3/a;
    .locals 1

    iget-object v0, p0, Lsc3/v;->a:Lsc3/u;

    return-object v0
.end method
