.class public final Lyf/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lyf/i;

.field public z:I


# direct methods
.method public constructor <init>(Lyf/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyf/g;->y:Lyf/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyf/g;->x:Ljava/lang/Object;

    iget p1, p0, Lyf/g;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyf/g;->z:I

    iget-object p1, p0, Lyf/g;->y:Lyf/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lyf/i;->i(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
