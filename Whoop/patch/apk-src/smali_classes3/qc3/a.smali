.class public abstract Lqc3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Lsc3/d;
.end method

.method public abstract b()Luc3/b;
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lqc3/a;->a()Lsc3/d;

    move-result-object v0

    iget-object v0, v0, Lsc3/d;->c:Luc3/l;

    const-string v1, "commands"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lqc3/a;->b()Luc3/b;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ls93/k;->f(Luc3/l;Ljava/lang/String;Luc3/b;)Luc3/b;

    move-result-object v0
    :try_end_0
    .catch Lkotlinx/datetime/internal/format/parser/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {p0, v0}, Lqc3/a;->d(Luc3/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/datetime/DateTimeFormatException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The value parsed from \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is invalid"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (when parsing \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\')"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {v1, v0, p1}, Lkotlinx/datetime/DateTimeFormatException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lkotlinx/datetime/DateTimeFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse value from \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lkotlinx/datetime/DateTimeFormatException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1
.end method

.method public abstract d(Luc3/b;)Ljava/lang/Object;
.end method
