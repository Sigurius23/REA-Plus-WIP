.class public abstract Lwa3/p;
.super Lwa3/b;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public static g(Lwa3/v;Lwa3/v;ILwa3/o0;Ljava/lang/Class;)Lwa3/o;
    .locals 6

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v0, Lwa3/o;

    new-instance v4, Lwa3/n;

    const/4 v1, 0x1

    invoke-direct {v4, p2, p3, v1}, Lwa3/n;-><init>(ILwa3/o0;Z)V

    move-object v1, p0

    move-object v3, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lwa3/o;-><init>(Lwa3/v;Ljava/lang/Object;Lwa3/v;Lwa3/n;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static h(Lwa3/v;Ljava/lang/Object;Lwa3/v;ILwa3/o0;Ljava/lang/Class;)Lwa3/o;
    .locals 3

    move v0, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    new-instance p0, Lwa3/o;

    move-object v1, p4

    new-instance p4, Lwa3/n;

    const/4 v2, 0x0

    invoke-direct {p4, v0, v1, v2}, Lwa3/n;-><init>(ILwa3/o0;Z)V

    invoke-direct/range {p0 .. p5}, Lwa3/o;-><init>(Lwa3/v;Ljava/lang/Object;Lwa3/v;Lwa3/n;Ljava/lang/Class;)V

    return-object p0
.end method
