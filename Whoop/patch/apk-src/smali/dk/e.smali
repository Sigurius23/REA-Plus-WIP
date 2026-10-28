.class public final Ldk/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ldk/f;

.field public x:Ljk/a;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ldk/f;


# direct methods
.method public constructor <init>(Ldk/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ldk/e;->z:Ldk/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldk/e;->y:Ljava/lang/Object;

    iget p1, p0, Ldk/e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldk/e;->E:I

    iget-object p1, p0, Ldk/e;->z:Ldk/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldk/f;->e(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
