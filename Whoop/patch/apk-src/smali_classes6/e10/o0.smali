.class public final Le10/o0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Le10/r0;

.field public y:I


# direct methods
.method public constructor <init>(Le10/r0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le10/o0;->x:Le10/r0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le10/o0;->w:Ljava/lang/Object;

    iget p1, p0, Le10/o0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le10/o0;->y:I

    iget-object p1, p0, Le10/o0;->x:Le10/r0;

    invoke-virtual {p1, p0}, Le10/r0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
