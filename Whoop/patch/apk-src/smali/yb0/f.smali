.class public abstract synthetic Lyb0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx81/d;)I
    .locals 0

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/a;->e()I

    move-result p0

    return p0
.end method

.method public static b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method
