.class public final Li2/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 2

    new-instance p3, Li2/n0;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object p1

    invoke-direct {p3, p1}, Li2/n0;-><init>(Lh2/c;)V

    return-object p3
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RectangleShape"

    return-object v0
.end method
