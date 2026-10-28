.class public final Lag/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lyf/e;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lag/e;

.field public z:I


# direct methods
.method public constructor <init>(Lag/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lag/d;->y:Lag/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lag/d;->x:Ljava/lang/Object;

    iget p1, p0, Lag/d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lag/d;->z:I

    iget-object p1, p0, Lag/d;->y:Lag/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lag/e;->a(Ljava/lang/Object;Lyf/e;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
