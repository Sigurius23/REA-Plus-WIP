.class public final Lh0/z1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ld30/f0;

.field public F:I

.field public w:Lh0/c3;

.field public x:Lkotlin/jvm/internal/d0;

.field public y:F

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld30/f0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh0/z1;->E:Ld30/f0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lh0/z1;->z:Ljava/lang/Object;

    iget p1, p0, Lh0/z1;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/z1;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lh0/z1;->E:Ld30/f0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ld30/f0;->a(Ld30/f0;Lh0/c3;Lh0/x1;FFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
