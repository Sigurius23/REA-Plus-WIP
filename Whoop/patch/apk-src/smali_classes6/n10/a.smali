.class public final Ln10/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ln10/b;

.field public G:I

.field public w:Ln10/b;

.field public x:Lb20/c;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ln10/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/a;->F:Ln10/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Ln10/a;->E:Ljava/lang/Object;

    iget p1, p0, Ln10/a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/a;->G:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Ln10/a;->F:Ln10/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Ln10/b;->a(Lb20/d;Lb20/c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
