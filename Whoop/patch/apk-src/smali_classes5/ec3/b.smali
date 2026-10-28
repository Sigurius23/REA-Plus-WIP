.class public final Lec3/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ldc3/u;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lec3/c;

.field public z:I


# direct methods
.method public constructor <init>(Lec3/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lec3/b;->y:Lec3/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/b;->x:Ljava/lang/Object;

    iget p1, p0, Lec3/b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/b;->z:I

    iget-object p1, p0, Lec3/b;->y:Lec3/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lec3/c;->e(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
