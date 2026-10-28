.class public final Lfy/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lfy/g;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lfy/g;

.field public z:I


# direct methods
.method public constructor <init>(Lfy/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lfy/f;->y:Lfy/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfy/f;->x:Ljava/lang/Object;

    iget p1, p0, Lfy/f;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfy/f;->z:I

    iget-object p1, p0, Lfy/f;->y:Lfy/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfy/g;->g(Landroidx/fragment/app/r0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
