.class public final Li0/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Li0/g;

.field public y:I


# direct methods
.method public constructor <init>(Li0/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Li0/f;->x:Li0/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Li0/f;->w:Ljava/lang/Object;

    iget p1, p0, Li0/f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li0/f;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Li0/f;->x:Li0/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Li0/g;->b(Li0/g;Lh0/k2;FFLi0/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
