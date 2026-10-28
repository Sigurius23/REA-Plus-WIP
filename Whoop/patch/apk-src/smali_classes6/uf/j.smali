.class public final Luf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/l;


# virtual methods
.method public final a(Ldg/a;Ljava/lang/Object;)Lvf/b;
    .locals 1

    check-cast p2, Ll83/a0;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvf/b;

    invoke-direct {p1}, Lvf/b;-><init>()V

    return-object p1
.end method
