.class public final Ly6/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ls83/i;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ly6/f;

.field public z:I


# direct methods
.method public constructor <init>(Ly6/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ly6/e;->y:Ly6/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ly6/e;->x:Ljava/lang/Object;

    iget p1, p0, Ly6/e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly6/e;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Ly6/e;->y:Ly6/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ly6/f;->d(Landroid/content/Context;Ly6/g;Ljava/lang/String;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
