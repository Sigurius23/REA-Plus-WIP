.class public final La43/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:La43/f;

.field public x:La43/b;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:La43/f;


# direct methods
.method public constructor <init>(La43/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La43/e;->z:La43/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La43/e;->y:Ljava/lang/Object;

    iget p1, p0, La43/e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La43/e;->E:I

    iget-object p1, p0, La43/e;->z:La43/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La43/f;->b(La43/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
