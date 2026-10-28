.class public final Lme/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lff/a;


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lyd/f;->f()Ljf/a;

    move-result-object p1

    iget-object p1, p1, Ljf/a;->b:Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
