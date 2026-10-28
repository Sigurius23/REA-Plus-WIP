.class public final Lpj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpj/b0;


# virtual methods
.method public final a(Ljava/lang/String;Lpj/a;Lpj/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2, p1}, Lpj/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lpj/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
