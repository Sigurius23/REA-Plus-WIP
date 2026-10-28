.class public final Llk/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:La3/p;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:La3/p;

.field public z:I


# direct methods
.method public constructor <init>(La3/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Llk/a;->y:La3/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llk/a;->x:Ljava/lang/Object;

    iget p1, p0, Llk/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llk/a;->z:I

    iget-object p1, p0, Llk/a;->y:La3/p;

    invoke-virtual {p1, p0}, La3/p;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
