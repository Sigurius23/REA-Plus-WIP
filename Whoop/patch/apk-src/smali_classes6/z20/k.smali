.class public final Lz20/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lz20/l;

.field public x:Ly00/b2;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lz20/l;


# direct methods
.method public constructor <init>(Lz20/l;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lz20/k;->z:Lz20/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lz20/k;->y:Ljava/lang/Object;

    iget p1, p0, Lz20/k;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz20/k;->E:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v0, p0, Lz20/k;->z:Lz20/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-virtual/range {v0 .. v8}, Lz20/l;->b(La30/t0;Lh20/c2;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
