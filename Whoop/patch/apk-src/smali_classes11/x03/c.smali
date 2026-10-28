.class public final Lx03/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/g;


# direct methods
.method public constructor <init>(Ln0/g;)V
    .locals 1

    const-string v0, "lazyListItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx03/c;->a:Ln0/g;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lx03/c;->a:Ln0/g;

    check-cast v0, Ln0/o;

    iget v0, v0, Ln0/o;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lx03/c;->a()I

    move-result v0

    iget-object v1, p0, Lx03/c;->a:Ln0/g;

    move-object v2, v1

    check-cast v2, Ln0/o;

    iget v2, v2, Ln0/o;->o:I

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->p:I

    const-string v3, ", offset="

    const-string v4, ", size="

    const-string v5, "SnapperLayoutItemInfo(index="

    invoke-static {v0, v2, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
