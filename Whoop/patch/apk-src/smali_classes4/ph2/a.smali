.class public abstract Lph2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Llu0/c;",
        "",
        "useFirmwareVersionString",
        "Loh2/d;",
        "a",
        "(Llu0/c;Z)Loh2/d;",
        "strap-metadata_release"
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
.method public static final a(Llu0/c;Z)Loh2/d;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Loh2/c;->d:Loh2/c$b;

    invoke-virtual {v0}, Loh2/c$b;->a()Loh2/c$a;

    move-result-object v0

    invoke-virtual {p0}, Llu0/c;->h()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->b(J)Loh2/c$a;

    move-result-object v0

    invoke-virtual {p0}, Llu0/c;->j()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->d(J)Loh2/c$a;

    move-result-object v0

    invoke-virtual {p0}, Llu0/c;->i()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->c(J)Loh2/c$a;

    move-result-object v0

    invoke-virtual {v0}, Loh2/c$a;->a()Loh2/c;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Llu0/c;->g()Loh2/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Loh2/b$b;

    invoke-virtual {p0}, Llu0/c;->d()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {p0}, Llu0/c;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {p0}, Llu0/c;->c()I

    move-result p1

    int-to-long v6, p1

    invoke-virtual {p0}, Llu0/c;->f()I

    move-result p1

    int-to-long v8, p1

    invoke-direct/range {v1 .. v9}, Loh2/b$b;-><init>(JJJJ)V

    move-object p1, v1

    :goto_0
    invoke-static {}, Loh2/e;->a()Loh2/e$a;

    move-result-object v1

    invoke-virtual {p0}, Llu0/c;->k()I

    move-result v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Loh2/e$a;->b(S)Loh2/e$a;

    move-result-object v1

    invoke-virtual {p0}, Llu0/c;->l()I

    move-result v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Loh2/e$a;->c(S)Loh2/e$a;

    move-result-object v1

    invoke-virtual {p0}, Llu0/c;->m()I

    move-result v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Loh2/e$a;->d(S)Loh2/e$a;

    move-result-object v1

    invoke-virtual {v1}, Loh2/e$a;->a()Loh2/e;

    move-result-object v1

    invoke-static {}, Loh2/d;->b()Loh2/d$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Loh2/d$a;->e(Loh2/c;)Loh2/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Loh2/d$a;->d(Loh2/b;)Loh2/d$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Loh2/d$a;->f(Loh2/e;)Loh2/d$a;

    move-result-object p1

    invoke-virtual {p0}, Llu0/c;->b()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Loh2/d$a;->b(B)Loh2/d$a;

    move-result-object p1

    invoke-virtual {p0}, Llu0/c;->a()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Loh2/d$a;->a(B)Loh2/d$a;

    move-result-object p1

    invoke-virtual {p0}, Llu0/c;->n()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Loh2/d$a;->g(Ljava/lang/String;)Loh2/d$a;

    move-result-object p0

    invoke-virtual {p0}, Loh2/d$a;->c()Loh2/d;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
