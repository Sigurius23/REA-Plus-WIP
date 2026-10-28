.class public abstract Lu02/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\t0\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a&\u0010\u000e\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00012\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "RequestBodyT",
        "ResponseT",
        "Lec3/l;",
        "Lz02/a;",
        "Lu02/c;",
        "client",
        "Ls63/a;",
        "requestBodyTypeInfo",
        "responseTypeInfo",
        "Lu02/g;",
        "b",
        "(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;",
        "Lf63/c;",
        "response",
        "c",
        "(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;",
        "network_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lu02/f;->c(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestBodyT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "Lu02/c;",
            "Ls63/a;",
            "Ls63/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestBodyTypeInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseTypeInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu02/f$a;

    invoke-direct {v0, p0, p1, p2}, Lu02/f$a;-><init>(Lec3/l;Lu02/c;Ls63/a;)V

    new-instance p0, Lu02/f$b;

    invoke-direct {p0, v0, p3}, Lu02/f$b;-><init>(Lec3/l;Ls63/a;)V

    new-instance p1, Lu02/f$c;

    invoke-direct {p1, p0}, Lu02/f$c;-><init>(Lec3/l;)V

    new-instance p0, Lu02/f$d;

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lu02/f$d;-><init>(Lq83/d;)V

    new-instance p2, Lec3/a0;

    invoke-direct {p2, p1, p0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p2
.end method

.method private static final c(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lf63/c;",
            "Ls63/a;",
            "Lq83/d<",
            "-TResponseT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p1, Ls63/a;->a:Lj93/d;

    const-class v1, Lne3/l;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p2}, Ly02/a;->a(Lf63/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ls40/e0;->b(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
