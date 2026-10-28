.class public final Ld6/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ld6/b;

.field public y:I


# direct methods
.method public constructor <init>(Ld6/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld6/a;->x:Ld6/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld6/a;->w:Ljava/lang/Object;

    iget p1, p0, Ld6/a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld6/a;->y:I

    iget-object p1, p0, Ld6/a;->x:Ld6/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ld6/b;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
