.class public final Lda3/b;
.super Lup/d;
.source "SourceFile"


# instance fields
.field public final d:Laa3/n0;


# direct methods
.method public constructor <init>(Lkotlin/Metadata;)V
    .locals 7

    invoke-static {p1}, Lse/b;->Z(Lkotlin/Metadata;)[Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lua3/g;->f([Ljava/lang/String;[Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lua3/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lqa3/k;

    new-instance v2, Lda3/a;

    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    move-result-object v3

    invoke-direct {v2, v3}, Lda3/a;-><init>([I)V

    new-instance v3, Lda3/a;

    const/4 v4, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lda3/a;-><init>(III)V

    invoke-virtual {v2, v3}, Lda3/a;->a(Lda3/a;)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    invoke-static {v0, v1, v4, v5}, Lts/o;->K(Lqa3/k;Lsa3/f;ZI)Laa3/n0;

    move-result-object v0

    new-instance v1, Lda3/a;

    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    move-result-object v2

    invoke-direct {v1, v2}, Lda3/a;-><init>([I)V

    invoke-interface {p1}, Lkotlin/Metadata;->xi()I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lda3/b;->d:Laa3/n0;

    return-void
.end method


# virtual methods
.method public final U()Laa3/n0;
    .locals 1

    iget-object v0, p0, Lda3/b;->d:Laa3/n0;

    return-object v0
.end method
