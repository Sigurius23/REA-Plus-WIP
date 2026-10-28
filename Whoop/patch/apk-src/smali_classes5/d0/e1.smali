.class public final Ld0/e1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ld0/f1;

.field public z:I


# direct methods
.method public constructor <init>(Ld0/f1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld0/e1;->y:Ld0/f1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld0/e1;->x:Ljava/lang/Object;

    iget p1, p0, Ld0/e1;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld0/e1;->z:I

    iget-object p1, p0, Ld0/e1;->y:Ld0/f1;

    invoke-static {p1, p0}, Ld0/f1;->K0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
