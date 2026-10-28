.class public final Lda3/c;
.super Lup/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkotlin/Metadata;)V
    .locals 9

    invoke-interface {p1}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lua3/g;->g([Ljava/lang/String;[Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lua3/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lqa3/c0;

    new-instance v1, Lda3/a;

    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    move-result-object v2

    invoke-direct {v1, v2}, Lda3/a;-><init>([I)V

    new-instance v2, Lda3/a;

    const/4 v4, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v6}, Lda3/a;-><init>(III)V

    invoke-virtual {v1, v2}, Lda3/a;->a(Lda3/a;)I

    move-result v1

    if-gez v1, :cond_1

    move v6, v4

    :cond_1
    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "strings"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lba3/i;

    new-instance v4, Lsa3/h;

    iget-object v1, v0, Lqa3/c0;->Q:Lqa3/c1;

    const-string v5, "getTypeTable(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v1}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v5, Lsa3/j;->b:Lsa3/j;

    const/4 v7, 0x0

    const/16 v8, 0x30

    invoke-direct/range {v2 .. v8}, Lba3/i;-><init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLjava/util/List;I)V

    invoke-static {v0, v2}, Lts/o;->M(Lqa3/c0;Lba3/i;)Laa3/y0;

    :cond_2
    new-instance v0, Lda3/a;

    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    move-result-object v1

    invoke-direct {v0, v1}, Lda3/a;-><init>([I)V

    invoke-interface {p1}, Lkotlin/Metadata;->xi()I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
